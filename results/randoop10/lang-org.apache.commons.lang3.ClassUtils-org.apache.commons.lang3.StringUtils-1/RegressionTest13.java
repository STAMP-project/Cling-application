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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder20.setScript("AN       A");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: AN       A [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.Builder" + "'", str6, "Locale.Builder");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str13, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "string[]" + "'", str18, "string[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test06502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06502");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("       hi!", "italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx", 42, 42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       hi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx" + "'", str4, "       hi!italiahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIitaliahIital...xxxx");
    }

    @Test
    public void test06503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("Locale", "xxxxxxxxinglese (Canada)xxxxxxxx");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06504");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u5927\u62ff\u52a0\u6587\u82f1", "", (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06505");
        java.util.Locale locale2 = new java.util.Locale("zh-CNnglese", "Chin");
        java.lang.String str3 = locale2.getVariant();
        boolean boolean5 = locale2.equals((java.lang.Object) "englTWNsTWN");
        org.junit.Assert.assertEquals(locale2.toString(), "zh-cnnglese_CHIN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test06506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06506");
        java.util.Locale locale4 = new java.util.Locale("Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli", "us");
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Locale locale8 = new java.util.Locale("italiano", "Ci_a");
        java.util.Locale locale12 = new java.util.Locale("Canada", "allemand", "cHINA");
        java.lang.String str13 = locale8.getDisplayName(locale12);
        java.util.Set<java.lang.Character> charSet14 = locale8.getExtensionKeys();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.lang.String str16 = locale8.getDisplayVariant(locale15);
        java.lang.String str17 = locale8.getScript();
        java.lang.String str18 = locale4.getDisplayCountry(locale8);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.upperCase("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", locale4);
        java.util.Locale.setDefault(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str5, "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals(locale8.toString(), "italiano_CI_A");
        org.junit.Assert.assertEquals(locale12.toString(), "canada_ALLEMAND_cHINA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "italiano (CI_A)" + "'", str13, "italiano (CI_A)");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI" + "'", str18, "GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH" + "'", str19, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH");
    }

    @Test
    public void test06507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06507");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("zhcines############################", "CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06508");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO", "english", 16);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "class java.lang.Stringclass java.lang.Stringclass java.lang.String");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO" + "'", str5, "...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO");
    }

    @Test
    public void test06509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\u5927\u62ff\u52a0\u6587\u82f1", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5927\u62ff\u52a0\u6587\u82f1" + "'", str2, "\u5927\u62ff\u52a0\u6587\u82f1");
    }

    @Test
    public void test06510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06510");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "Chinesisch(China)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinesisch(China)" + "'", str1, "Chinesisch(China)");
    }

    @Test
    public void test06511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06511");
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
        java.util.Locale locale16 = java.util.Locale.getDefault(category0);
        java.lang.String str17 = locale16.toLanguageTag();
        java.lang.Object obj18 = locale16.clone();
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
        org.junit.Assert.assertEquals(locale12.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "China" + "'", str13, "China");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "us" + "'", str14, "us");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "x-lvariant-us" + "'", str17, "x-lvariant-us");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx_GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI_us");
    }

    @Test
    public void test06512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06512");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("CHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06513");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "Itali");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: Itali");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06514");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Builder builder6 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.setExtension('$', "AAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: $ [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test06515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06515");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI", (int) 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444444444444444444444" + "'", str3, "HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06517");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("chinois (Chine", "            locale.builder                         locale.builder                    CHINOIS (CHINE)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06518");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("anglais (Canada)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "anglais (Canada" + "'", str1, "anglais (Canada");
    }

    @Test
    public void test06519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\u65e5\u672c", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u672c" + "'", str2, "\u65e5\u672c");
    }

    @Test
    public void test06520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                              cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test06521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06521");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("italiano (CI_A)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiano (CI_A)" + "'", str1, "italiano (CI_A)");
    }

    @Test
    public void test06522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06522");
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.upperCase("hi!", locale1);
        java.lang.Class[] classArray5 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray6 = (java.lang.Class<?>[]) classArray5;
        java.lang.Class<?>[] wildcardClassArray7 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray5);
        java.lang.Class<?>[] wildcardClassArray8 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray5);
        java.lang.Class<?>[] wildcardClassArray9 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray5);
        java.lang.Class[] classArray11 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray12 = (java.lang.Class<?>[]) classArray11;
        java.lang.Class<?>[] wildcardClassArray13 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray11);
        java.lang.Class<?>[] wildcardClassArray14 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray11);
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray15);
        boolean boolean18 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray15, true);
        java.lang.Class[] classArray20 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray21 = (java.lang.Class<?>[]) classArray20;
        java.lang.Class<?>[] wildcardClassArray22 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray20);
        java.lang.Class<?>[] wildcardClassArray23 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray20);
        java.lang.Class<?>[] wildcardClassArray24 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) classArray20);
        java.lang.Class[] classArray26 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray27 = (java.lang.Class<?>[]) classArray26;
        java.lang.Class<?>[] wildcardClassArray28 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray26);
        java.lang.Class<?>[] wildcardClassArray29 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray26);
        java.lang.Class[] classArray32 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray33 = (java.lang.Class<?>[]) classArray32;
        java.lang.Class<?>[] wildcardClassArray34 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives((java.lang.Class<?>[]) classArray32);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.concatWith("hi!", (java.lang.Object[]) classArray32);
        boolean boolean36 = org.apache.commons.lang3.ClassUtils.isAssignable((java.lang.Class<?>[]) classArray26, (java.lang.Class<?>[]) classArray32);
        java.lang.Class<?>[] wildcardClassArray37 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers((java.lang.Class<?>[]) classArray32);
        boolean boolean38 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray24, (java.lang.Class<?>[]) classArray32);
        boolean boolean40 = org.apache.commons.lang3.ClassUtils.isAssignable(wildcardClassArray9, wildcardClassArray24, true);
        boolean boolean41 = locale1.equals((java.lang.Object) boolean40);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-CA" + "'", str2, "en-CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!" + "'", str3, "HI!");
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertNotNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(wildcardClassArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(wildcardClassArray12);
        org.junit.Assert.assertNotNull(wildcardClassArray13);
        org.junit.Assert.assertNotNull(wildcardClassArray14);
        org.junit.Assert.assertNotNull(wildcardClassArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertNotNull(wildcardClassArray21);
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertNotNull(wildcardClassArray23);
        org.junit.Assert.assertNotNull(wildcardClassArray24);
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(wildcardClassArray27);
        org.junit.Assert.assertNotNull(wildcardClassArray28);
        org.junit.Assert.assertNotNull(wildcardClassArray29);
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(wildcardClassArray33);
        org.junit.Assert.assertNotNull(wildcardClassArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClassArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test06523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06523");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray4, strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "iiiiiiiiiiiiiiiiiiiiiiiArrayList");
        java.lang.Class<?> wildcardClass13 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str10, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test06524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06524");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("a#a#a#a#a#");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test06525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06525");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("xxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxx" + "'", str1, "xxxxxxx");
    }

    @Test
    public void test06526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06526");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("zh-CNenglis", "CAN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06527");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "a#", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "a#" + "'", charSequence2, "a#");
    }

    @Test
    public void test06528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06528");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "chinois (Chine)", (java.lang.CharSequence) "italiano");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06529");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "aaaaaaaaa$", (int) (short) -1, 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaa$" + "'", str4, "aaaaaaaaa$");
    }

    @Test
    public void test06530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06530");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("cines", (int) (short) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cines" + "'", str3, "cines");
    }

    @Test
    public void test06531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06531");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("An", "zh_TW", (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAn" + "'", str3, "Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAn");
    }

    @Test
    public void test06532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06532");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("en_CA", "Hindi (HI!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06533");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("acol", "TALIAHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "acol" + "'", str2, "acol");
    }

    @Test
    public void test06534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06534");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("zh_C", "cinese (Cina)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06535");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "ANIHC   ENGLTWNSTWN", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06536");
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
        java.lang.String str15 = locale4.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "inglese" + "'", str5, "inglese");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cina" + "'", str10, "Cina");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CAN" + "'", str15, "CAN");
    }

    @Test
    public void test06537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("esecnarf", "esecnarf");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06538");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\u82f1\u6587\u52a0\u62ff\u5927)", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06539");
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
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor24 = languageRangeList23.listIterator();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale33);
        java.util.Locale locale35 = java.util.Locale.US;
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale37 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.lang.String str41 = locale38.toLanguageTag();
        java.util.Locale locale42 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.lang.String str44 = locale42.getDisplayCountry(locale43);
        java.util.Locale locale45 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = locale45.getDisplayCountry(locale46);
        java.util.Locale locale51 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale52 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale52.getDisplayCountry(locale53);
        java.util.Locale locale56 = new java.util.Locale("");
        java.lang.String str57 = locale56.getDisplayVariant();
        java.util.Locale locale58 = java.util.Locale.KOREAN;
        java.util.Locale locale60 = new java.util.Locale("");
        java.util.Locale locale61 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray62 = new java.util.Locale[] { locale33, locale35, locale36, locale37, locale38, locale43, locale45, locale51, locale53, locale56, locale58, locale60, locale61 };
        java.util.ArrayList<java.util.Locale> localeList63 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList63, localeArray62);
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.util.Locale>) localeList63);
        java.lang.String[] strArray73 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.util.List<java.lang.Class<?>> wildcardClassList76 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList74);
        java.util.Locale.FilteringMode filteringMode77 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.lang.String>) strList74, filteringMode77);
        java.util.List<java.lang.String> strList79 = java.util.Locale.filterTags(languageRangeList23, (java.util.Collection<java.lang.String>) strList27, filteringMode77);
        java.util.Locale.LanguageRange[] languageRangeArray80 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList81 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81, languageRangeArray80);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap83 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList84 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList81, strMap83);
        int int85 = languageRangeList81.size();
        boolean boolean86 = languageRangeList23.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList81);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap87 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList88 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList23, strMap87);
        boolean boolean89 = languageRangeList16.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList88);
        boolean boolean91 = languageRangeList88.equals((java.lang.Object) "anihcxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        java.util.Locale locale92 = java.util.Locale.JAPANESE;
        java.util.Locale locale94 = java.util.Locale.TAIWAN;
        java.lang.String str95 = org.apache.commons.lang3.StringUtils.upperCase("", locale94);
        java.lang.String str96 = locale92.getDisplayVariant(locale94);
        java.util.Set<java.lang.Character> charSet97 = locale94.getExtensionKeys();
        java.util.Set<java.lang.String> strSet98 = locale94.getUnicodeLocaleAttributes();
        java.lang.String str99 = java.util.Locale.lookupTag(languageRangeList88, (java.util.Collection<java.lang.String>) strSet98);
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
        org.junit.Assert.assertNotNull(languageRangeItor24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "english" + "'", str34, "english");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Cina" + "'", str40, "Cina");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "zh-CN" + "'", str41, "zh-CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Cina" + "'", str44, "Cina");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
// flaky:         org.junit.Assert.assertEquals(locale46.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Cina" + "'", str47, "Cina");
        org.junit.Assert.assertEquals(locale51.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Cina" + "'", str54, "Cina");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ko");
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(wildcardClassList76);
        org.junit.Assert.assertTrue("'" + filteringMode77 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode77.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertNotNull(languageRangeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(languageRangeList84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(languageRangeList88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "ja");
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertNotNull(charSet97);
        org.junit.Assert.assertNotNull(strSet98);
        org.junit.Assert.assertNull(str99);
    }

    @Test
    public void test06540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06540");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CHINCHINCHINCHINCHINCHINCHINCHINCHINAAAAAAAAA#", "cinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecines");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("lang", 116, "#######################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################################lang" + "'", str3, "################################################################################################################lang");
    }

    @Test
    public void test06542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06542");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                   $", "laEg                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test06543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06543");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("i", "iiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayList");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayList" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayList");
    }

    @Test
    public void test06544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06544");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aa.ab.ae.af.ak.am.an.ar.as.av.ay.az.ba.be.bg.bh.bi.bm.bn.bo.br.bs.ca.ce.ch.co.cr.cs.cu.cv.cy.da.de.dv.dz.ee.el.en.eo.es.et.eu.fa.ff.fi.fj.fo.fr.fy.ga.gd.gl.gn.gu.gv.ha.he.hi.ho.hr.ht.hu.hy.hz.ia.id.ie.ig.ii.ik.in.io.is.it.iu.iw.ja.ji.jv.ka.kg.ki.kj.kk.kl.km.kn.ko.kr.ks.ku.kv.kw.ky.la.lb.lg.li.ln.lo.lt.lu.lv.mg.mh.mi.mk.ml.mn.mo.mr.ms.mt.my.na.nb.nd.ne.ng.nl.nn.no.nr.nv.ny.oc.oj.om.or.os.pa.pi.pl.ps.pt.qu.rm.rn.ro.ru.rw.sa.sc.sd.se.sg.si.sk.sl.sm.sn.so.sq.sr.ss.st.su.sv.sw.ta.te.tg.th.ti.tk.tl.tn.to.tr.ts.tt.tw.ty.ug.uk.ur.uz.ve.vi.vo.wa.wo.xh.yi.yo.za.zh.zu");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06545");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.parse("Cina", strMap21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList22, strMap23);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean28 = languageRangeList26.remove((java.lang.Object) "English");
        boolean boolean30 = languageRangeList26.remove((java.lang.Object) 1);
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
        java.util.Locale locale68 = java.util.Locale.lookup(languageRangeList26, (java.util.Collection<java.util.Locale>) localeList65);
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter(languageRangeList24, (java.util.Collection<java.util.Locale>) localeList65);
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream71 = languageRangeList16.parallelStream();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor72 = languageRangeList16.iterator();
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
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
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
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Cina" + "'", str42, "Cina");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "zh-CN" + "'", str43, "zh-CN");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Cina" + "'", str46, "Cina");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
// flaky:         org.junit.Assert.assertEquals(locale48.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Cina" + "'", str49, "Cina");
        org.junit.Assert.assertEquals(locale53.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
// flaky:         org.junit.Assert.assertEquals(locale55.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Cina" + "'", str56, "Cina");
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
        org.junit.Assert.assertNull(locale68);
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(languageRangeStream71);
        org.junit.Assert.assertNotNull(languageRangeItor72);
    }

    @Test
    public void test06546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Japaneseuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "locale.Builder");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06547");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06548");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("acoL");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Anzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAnzh_TWAn", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06549");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", "....english");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 42, (int) '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test06550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06550");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("FR");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S", locale2);
        java.lang.String str4 = locale2.getISO3Country();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "englhi!string[]string[]sshi!string[]string[]s" + "'", str3, "englhi!string[]string[]sshi!string[]string[]s");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test06551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06551");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\u82f1\u6587", "acoL");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...xxxxxFrench(France)xxxxxxxxxx", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test06552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06552");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zh_CN", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                              Germn", charArray7);
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
    public void test06553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06553");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("YT.ZA.ZM.ZW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=yt.za.zm.zw");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\u4e2d\u6587\u4e2d\u56fd)", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06555");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("ANIHC      xxxxhIxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ANIHCxxxxhIxxx" + "'", str1, "ANIHCxxxxhIxxx");
    }

    @Test
    public void test06556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06556");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\u4e2d\u6587", "an       a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06557");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ITALIAHi", (java.lang.CharSequence) ".");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06558");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale locale6 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setUnicodeLocaleKeyword("GNAL.AVAJSTRING[]STRING[]STRING[", "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: GNAL.AVAJSTRING[]STRING[]STRING[ [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_CN");
    }

    @Test
    public void test06559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06559");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Italian", ".....ZHCINESESE", (int) (short) 0, 6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".....ZHCINESESEn" + "'", str4, ".....ZHCINESESEn");
    }

    @Test
    public void test06560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06560");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\u65e5\u6587", "italiahI", (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06561");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("tsiLyarrAH");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=tsilyarrah");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06562");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "lOCALE.bUILDER[]", (java.lang.CharSequence) "AD.AE.AF.AAD.AE.AF.AAD.AEundaaaaaaaH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06563");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("cnncnncnnlocale.Buildercnncnncnnc");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: cnncnncnnlocale.Buildercnncnncnnc");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("AD.AE.AF", "                                redliuB.elacoL");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06565");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Chine", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch" + "'", str2, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxch");
    }

    @Test
    public void test06567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06567");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("zH", "cHINA", 2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw", "HI");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn" + "'", str9, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn");
    }

    @Test
    public void test06568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06568");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAN", "Canada");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06569");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("CHN", strMap1);
        languageRangeList2.clear();
        boolean boolean4 = languageRangeList2.isEmpty();
        boolean boolean5 = languageRangeList2.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = languageRangeList2.subList((int) '$', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test06570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06570");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Chine", "KOR", 350);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06571");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I", "GNAL.AVAJSTRING[]STRING[]STRING[", "hi!hi! (                 A                 )");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06572");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("ESESENICHZ.....", "zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06573");
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
        java.util.Locale.setDefault(category0, locale24);
        java.util.Locale locale32 = new java.util.Locale("zho", "US");
        java.util.Locale locale33 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.lang.String str35 = locale33.getVariant();
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.upperCase("AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", locale33);
        java.lang.String str37 = locale24.getDisplayLanguage(locale33);
        java.lang.String str38 = locale33.toLanguageTag();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "inglese" + "'", str6, "inglese");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cina" + "'", str13, "Cina");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "inglese" + "'", str20, "inglese");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cina" + "'", str25, "Cina");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals(locale32.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str36, "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "italien" + "'", str37, "italien");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "fr-CA" + "'", str38, "fr-CA");
    }

    @Test
    public void test06574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06574");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("\u4e2d\u6587\u4e2d\u570b)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "\u4e2d\u6587\u4e2d\u570b)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06575");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ese (Taiwan", "Cina");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test06576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06576");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap97 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList98 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap97);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor99 = languageRangeList98.iterator();
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
// flaky:         org.junit.Assert.assertEquals(locale46.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str47, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "zh-CN" + "'", str48, "zh-CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str51, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str54, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals(locale58.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
// flaky:         org.junit.Assert.assertEquals(locale60.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str61, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
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
        org.junit.Assert.assertNotNull(languageRangeList98);
        org.junit.Assert.assertNotNull(languageRangeItor99);
    }

    @Test
    public void test06577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06577");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str1, "\u4e2d\u56fd\u8a9e");
    }

    @Test
    public void test06578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06578");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "cinese(Taiwan)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06579");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zh_CN", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Engls", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\u5fb7\u6587", charArray8);
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
    public void test06580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06580");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi-cHINA", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-hcnczih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06581");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                              German", "                       Hindi                        ", "HArrayLi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI!STRING[...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06583");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HArrayList", "it                                           ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HArrayList" + "'", str3, "HArrayList");
    }

    @Test
    public void test06584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06584");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HArrayLi", "ese (Taiwan", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06585");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale.Builder builder6 = builder4.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder4.removeUnicodeLocaleAttribute("COLLECTI");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder4.removeUnicodeLocaleAttribute("A][gnirts");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: A][gnirts [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test06586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("arraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########", 42, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist#####" + "'", str3, "###en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist#####");
    }

    @Test
    public void test06587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06587");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName("                 A                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test06588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("cinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinese", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "esecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinese" + "'", str2, "esecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinesecinese");
    }

    @Test
    public void test06589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06589");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Chinesisch(China)", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06590");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strMap31);
        int int33 = languageRangeList29.size();
        java.util.Locale.LanguageRange languageRange35 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange37 = new java.util.Locale.LanguageRange("English");
        java.util.Locale.LanguageRange languageRange39 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] { languageRange35, languageRange37, languageRange39 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        boolean boolean43 = languageRangeList29.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41);
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getDisplayLanguage();
        java.util.Locale locale48 = java.util.Locale.CANADA;
        java.lang.String str49 = locale48.getDisplayLanguage();
        java.lang.String str50 = locale46.getDisplayScript(locale48);
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale46);
        java.lang.String str52 = locale46.getDisplayScript();
        java.util.Set<java.lang.String> strSet53 = locale46.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode54 = null;
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strSet53, filteringMode54);
        java.lang.String str56 = java.util.Locale.lookupTag(languageRangeList4, (java.util.Collection<java.lang.String>) strSet53);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap57 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap57);
        java.lang.CharSequence charSequence60 = null;
        char[] charArray69 = new char[] {};
        int int70 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray69);
        boolean boolean71 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray69);
        int int72 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray69);
        int int73 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray69);
        int int74 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "C", charArray69);
        int int75 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "italianojajajajajajajajajajajajajaj", charArray69);
        boolean boolean76 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\u4e2d\u6587\u4e2d\u570b)", charArray69);
        boolean boolean77 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "en-CASTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRINGSTRIN", charArray69);
        boolean boolean78 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence60, charArray69);
        int int79 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zhcines", charArray69);
        boolean boolean80 = languageRangeList4.equals((java.lang.Object) int79);
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
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u82f1\u8a9e" + "'", str49, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "a" + "'", str51, "a");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test06591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06591");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor46 = languageRangeList1.listIterator(42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 42");
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
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str17, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str21, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str24, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals(locale28.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str31, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
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
    }

    @Test
    public void test06592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06592");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale5 = builder4.build();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale.Builder builder7 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguage("#########################English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: #########################English [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "hi");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "hi");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test06593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06593");
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
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        char[][] charArray16 = new char[][] { charArray12, charArray13, charArray14, charArray15 };
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        char[][] charArray21 = new char[][] { charArray17, charArray18, charArray19, charArray20 };
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        char[][] charArray26 = new char[][] { charArray22, charArray23, charArray24, charArray25 };
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        char[][] charArray31 = new char[][] { charArray27, charArray28, charArray29, charArray30 };
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        char[][] charArray36 = new char[][] { charArray32, charArray33, charArray34, charArray35 };
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        char[] charArray40 = new char[] {};
        char[][] charArray41 = new char[][] { charArray37, charArray38, charArray39, charArray40 };
        char[][][] charArray42 = new char[][][] { charArray16, charArray21, charArray26, charArray31, charArray36, charArray41 };
        char[][][] charArray43 = languageRangeList1.toArray(charArray42);
        int int44 = languageRangeList1.size();
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strMap48);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        boolean boolean53 = languageRangeList46.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap57 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList58 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, strMap57);
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        boolean boolean62 = languageRangeList55.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60);
        java.lang.String str64 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList60, "hi!");
        boolean boolean65 = languageRangeList46.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream66 = languageRangeList46.stream();
        java.util.Locale.LanguageRange[] languageRangeArray67 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList68 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68, languageRangeArray67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap70 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList71 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, strMap70);
        int int72 = languageRangeList68.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean76 = languageRangeList74.remove((java.lang.Object) "English");
        boolean boolean77 = languageRangeList68.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74);
        int int78 = languageRangeList74.size();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor79 = languageRangeList74.iterator();
        java.util.Locale.Builder builder80 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder81 = builder80.clearExtensions();
        java.util.Locale locale82 = builder80.build();
        java.lang.String str83 = locale82.getDisplayName();
        java.util.Locale locale84 = null;
        java.lang.String str85 = locale82.getDisplayVariant(locale84);
        java.lang.String str86 = locale82.getDisplayVariant();
        java.lang.String str87 = locale82.getVariant();
        java.util.Set<java.lang.String> strSet88 = locale82.getUnicodeLocaleAttributes();
        java.lang.String str89 = java.util.Locale.lookupTag(languageRangeList74, (java.util.Collection<java.lang.String>) strSet88);
        java.lang.String str90 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strSet88);
        java.lang.String str91 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet88);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(wildcardClassArray8);
        org.junit.Assert.assertNotNull(wildcardClassArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]");
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[]");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[]");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[]");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(languageRangeList58);
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(languageRangeStream66);
        org.junit.Assert.assertNotNull(languageRangeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(languageRangeList71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(languageRangeList74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(languageRangeItor79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertNull(str91);
    }

    @Test
    public void test06594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("cnn", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cnn                                                                                                " + "'", str2, "cnn                                                                                                ");
    }

    @Test
    public void test06595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06595");
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
        java.util.Set<java.lang.String> strSet24 = locale16.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(locale16);
        java.lang.String str26 = locale16.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u8a9e" + "'", str5, "\u82f1\u8a9e");
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
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u82f1\u8a9e" + "'", str19, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "German" + "'", str23, "German");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test06596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06596");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "zh_ZH", (java.lang.CharSequence) "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.z");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 746 + "'", int2 == 746);
    }

    @Test
    public void test06597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06597");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                   $");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06598");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test06599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06599");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", " ud  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06600");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Locale.Builder", "ENG", 2);
        java.lang.String str5 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) strArray3, "Japanese");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
    }

    @Test
    public void test06601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06601");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\u4e2d\u56fdAD.AE.AF", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fdAD.AE.AF" + "'", str2, "\u4e2d\u56fdAD.AE.AF");
    }

    @Test
    public void test06603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587" + "'", str2, "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587");
    }

    @Test
    public void test06604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06604");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("ESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAN" + "'", str1, "ESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAN");
    }

    @Test
    public void test06605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\u4e2d\u56fd\u8a9e (ZH)", "chinenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd\u8a9e (ZH)" + "'", str2, "\u4e2d\u56fd\u8a9e (ZH)");
    }

    @Test
    public void test06606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06606");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("RGLASA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RGLASA" + "'", str1, "RGLASA");
    }

    @Test
    public void test06607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06607");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("hI");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.removeUnicodeLocaleAttribute("anglais (Canada)                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: anglais (Canada)                                                                                     [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test06608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06608");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap4);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor6 = languageRangeList2.iterator();
        java.util.Locale locale9 = new java.util.Locale("");
        java.lang.String str10 = locale9.getDisplayLanguage();
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.lang.String str13 = locale9.getDisplayScript(locale11);
        java.lang.String str14 = locale11.getDisplayVariant();
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.upperCase("", locale11);
        java.lang.String str16 = locale11.getLanguage();
        boolean boolean17 = languageRangeList2.equals((java.lang.Object) locale11);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream18 = languageRangeList2.parallelStream();
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
        java.util.List<java.util.Locale> localeList56 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList53);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList57 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeItor6);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587" + "'", str12, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "en" + "'", str16, "en");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeStream18);
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
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "China" + "'", str30, "China");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-CN" + "'", str31, "zh-CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "China" + "'", str34, "China");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "China" + "'", str37, "China");
        org.junit.Assert.assertEquals(locale41.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
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
        org.junit.Assert.assertNotNull(localeList56);
    }

    @Test
    public void test06609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06609");
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
        java.lang.String str15 = locale1.getISO3Country();
        java.lang.Object obj16 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u82f1\u6587" + "'", str6, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "english" + "'", str10, "english");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CHINA" + "'", str13, "CHINA");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "it");
    }

    @Test
    public void test06610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06610");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("C", "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAAengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWArrayengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWALengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAist");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayLis", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test06611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("apanesexxxxxxxxxxxxxx", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "apanesexxxxxxxxxxxxxx" + "'", str2, "apanesexxxxxxxxxxxxxx");
    }

    @Test
    public void test06612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06612");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("cNn", "chinois", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06613");
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
        java.lang.String str21 = locale16.getDisplayScript();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test06614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06614");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "CNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCNCARRAYLIST");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06615");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("US", "zh", (int) '#');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test06616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06616");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "zh_CN", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AD.AE.AF.AGchnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "zhcines############################", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "XXXXXXXXXXFRENCH (FRANCE)XXXXXXXXXX", charArray8);
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
    public void test06617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06617");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "US", 20);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\u6587\u5fb7", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test06618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06618");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "apanesexxxxxxxxxxxxxx");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("zhcinesese", (int) 'x', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06620");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AN       A", "af", "Chin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AN       A" + "'", str3, "AN       A");
    }

    @Test
    public void test06621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06621");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind", (java.lang.CharSequence) "STRING[]");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind" + "'", charSequence2, "hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind");
    }

    @Test
    public void test06622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06622");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("fr-FRSTI-F", "ahi!hi!hi!hi!hi!HI!ahi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06623");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06624");
        java.util.Locale locale1 = new java.util.Locale("STI-F");
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertEquals(locale1.toString(), "sti-f");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "sti-f" + "'", str2, "sti-f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "sti-f" + "'", str3, "sti-f");
    }

    @Test
    public void test06625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("anihcxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "anihcxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str2, "anihcxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test06626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HArrayLi", "a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06627");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder4.build();
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.lang.String str10 = locale8.getCountry();
        java.lang.String str11 = locale8.getDisplayName();
        boolean boolean12 = locale8.hasExtensions();
        java.util.Locale.Builder builder13 = builder4.setLocale(locale8);
        java.util.Locale.Builder builder15 = builder13.setLanguage("hina");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setRegion("     Chine");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region:      Chine [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "China" + "'", str9, "China");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test06628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06628");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("44444444EnglTWNsTWN44444444", "string[]", "English", 8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444EnglTWNsTWN44444444" + "'", str4, "44444444EnglTWNsTWN44444444");
    }

    @Test
    public void test06629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("NENENENENENENENENENE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nenenenenenenenenene" + "'", str1, "nenenenenenenenenene");
    }

    @Test
    public void test06630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06630");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".", "HI");
        java.lang.Class<?>[] wildcardClassArray3 = org.apache.commons.lang3.ClassUtils.toClass((java.lang.Object[]) strArray2);
        java.lang.Class<?>[] wildcardClassArray4 = org.apache.commons.lang3.ClassUtils.wrappersToPrimitives(wildcardClassArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray4, "\u4e2d\u6587\u53f0\u7063)");
        java.lang.Class<?> wildcardClass7 = wildcardClassArray4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClassArray3);
        org.junit.Assert.assertNotNull(wildcardClassArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06631");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("Hindi (HI!,cHINA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hindi (HI!,cHINA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Hindi (HI!,cHINA)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06632");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                tw                                                ", "HI!HI!HI!HI!HI!HI", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06633");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Taiwan", "$$$$$");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06634");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("lOCALE.bUILDER[]", 4, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06635");
        java.util.Locale locale2 = new java.util.Locale("ahi!hi!", "                 a                 ");
        java.lang.String str3 = locale2.getDisplayName();
        java.lang.String str4 = locale2.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "ahi!hi!_                 A                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ahi!hi! (                 A                 )" + "'", str3, "ahi!hi! (                 A                 )");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ahi!hi!_                 A                 " + "'", str4, "ahi!hi!_                 A                 ");
    }

    @Test
    public void test06636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06636");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Chin", "english");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                    ", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("ARRAYLIS", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) int6, "ZHCINESESE");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Integer" + "'", str8, "Integer");
    }

    @Test
    public void test06637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06637");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "RRAYLIS");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06638");
        java.util.Locale locale1 = new java.util.Locale("xxxxxxxxinglese (Canada)xxxxxxxx");
        org.junit.Assert.assertEquals(locale1.toString(), "xxxxxxxxinglese (canada)xxxxxxxx");
    }

    @Test
    public void test06639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06639");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\u4e2d\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ANIH", "javacinese.cineselang");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ANIH" + "'", str2, "ANIH");
    }

    @Test
    public void test06641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                    ", "it                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06642");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("undaaaaaaaH", "panesexxxxxxxxxxxxxx", "java.util");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06643");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX", "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06644");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("English");
        java.util.Locale.Builder builder6 = builder4.setLanguage("nglese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setLanguage("TRING[]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: TRING[] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test06645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06645");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hin", "                       Hindi                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06646");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test06647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06647");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("                                                                            Hindi (HI!,cHINA)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hindi(hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06648");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...   gnalesenic.esenicavaj                                                Ih                                     ...", (int) (byte) 10, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...   gnalesenic.esenicavaj                                                Ih                                     ..." + "'", str3, "...   gnalesenic.esenicavaj                                                Ih                                     ...");
    }

    @Test
    public void test06649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06649");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)", "IA", "\u4e2d\u6587");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\u4e2d\u56fdAD.AE.AF", '.');
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fdAD" + "'", str2, "\u4e2d\u56fdAD");
    }

    @Test
    public void test06651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("ZH_TW", "LOCLE.LNGUGERNGE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZH_TW" + "'", str2, "ZH_TW");
    }

    @Test
    public void test06652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06652");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ENGLHI!STRING[]STRING[]SSHI!STRING[]STRING[]S", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06653");
        java.util.Locale locale3 = new java.util.Locale("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", "IA", "zh_CN");
        java.lang.String str4 = locale3.getCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish_IA_zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IA" + "'", str4, "IA");
    }

    @Test
    public void test06654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06654");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S", "Francese", "chinois (chine)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S" + "'", str3, "###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S");
    }

    @Test
    public void test06655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06655");
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
        java.util.List<java.lang.Class<?>> wildcardClassList50 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList49);
        java.util.List<java.lang.Class<?>> wildcardClassList51 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList49);
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
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "China" + "'", str11, "China");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "China" + "'", str15, "China");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "China" + "'", str18, "China");
        org.junit.Assert.assertEquals(locale22.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
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
        org.junit.Assert.assertNotNull(wildcardClassList50);
        org.junit.Assert.assertNotNull(wildcardClassList51);
    }

    @Test
    public void test06656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06656");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                gnalesenic.esenicavaj                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                javacinese.cineselang                                                " + "'", str1, "                                                javacinese.cineselang                                                ");
    }

    @Test
    public void test06657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("chi..", "ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.z");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06658");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("englishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish", "               class java.lang.String               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...4" + "'", str1, "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...4");
    }

    @Test
    public void test06660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06660");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("RRAYLIS", "cnn                                                                                                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06661");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("English");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setRegion("\u82f1\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test06662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06662");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AD.AE.AF.A", "I!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06663");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "                                                                                              German");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06664");
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale1.getDisplayCountry(locale3);
        java.util.Locale locale5 = java.util.Locale.TAIWAN;
        java.lang.String str6 = locale5.getVariant();
        java.lang.String str7 = locale1.getDisplayName(locale5);
        java.util.Locale locale8 = locale5.stripExtensions();
        java.util.Locale.setDefault(locale5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.upperCase("enghI", locale5);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese" + "'", str2, "Chinese");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Taiwan" + "'", str4, "Taiwan");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str7, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ENGHI" + "'", str10, "ENGHI");
    }

    @Test
    public void test06665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06665");
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
        java.lang.Object[] objArray53 = languageRangeList1.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream54 = languageRangeList1.stream();
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
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u570b" + "'", str25, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh-CN" + "'", str26, "zh-CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u570b" + "'", str29, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u570b" + "'", str32, "\u4e2d\u570b");
        org.junit.Assert.assertEquals(locale36.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u4e2d\u570b" + "'", str39, "\u4e2d\u570b");
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
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(languageRangeStream54);
    }

    @Test
    public void test06666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06666");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("fra", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "string[]", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence2, charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "rglAsA", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("       hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06667");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ANIHC      ", strMap1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange4 = languageRangeList2.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test06668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06668");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("GNE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GNE" + "'", str1, "GNE");
    }

    @Test
    public void test06669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06669");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("acol", "\u82f1\u8a9e\u30ab\u30ca\u30c0)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06670");
        java.util.Locale locale3 = new java.util.Locale("zh-CNenglish", "Locale.LanguageRange", "");
        java.util.Locale.setDefault(locale3);
        java.util.Locale locale8 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str9 = locale8.getDisplayVariant();
        java.util.Locale locale10 = locale8.stripExtensions();
        java.util.Locale locale14 = new java.util.Locale("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", "IA", "zh_CN");
        java.util.Locale locale17 = new java.util.Locale("zho", "US");
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        java.lang.String str20 = locale14.getDisplayName(locale18);
        java.lang.String str21 = locale18.toLanguageTag();
        java.lang.String str22 = locale10.getDisplayCountry(locale18);
        java.lang.String str24 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) locale18, "################################################################################");
        java.lang.String str25 = locale3.getDisplayVariant(locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = locale18.getUnicodeLocaleType("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "zh-cnenglish_LOCALE.LANGUAGERANGE");
        org.junit.Assert.assertEquals(locale8.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "cHINA" + "'", str9, "cHINA");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals(locale14.toString(), "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish_IA_zh_CN");
        org.junit.Assert.assertEquals(locale17.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)" + "'", str20, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fr-CA" + "'", str21, "fr-CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HI!" + "'", str22, "HI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.util" + "'", str24, "java.util");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test06671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06671");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Engl....englishs....english");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ENGL....ENGLISHS....ENGLISH" + "'", str1, "ENGL....ENGLISHS....ENGLISH");
    }

    @Test
    public void test06672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06672");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("redliub", "HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06673");
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
        java.lang.String str14 = locale1.getVariant();
        java.util.Locale locale18 = new java.util.Locale("zho", "US");
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.lang.String str21 = locale19.getVariant();
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.upperCase("AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", locale19);
        java.lang.String str23 = locale19.getCountry();
        java.lang.String str24 = locale1.getDisplayLanguage(locale19);
        java.util.Locale.Builder builder25 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder26 = builder25.clearExtensions();
        java.util.Locale locale27 = builder25.build();
        java.lang.String str28 = locale27.getDisplayName();
        java.lang.String str29 = locale19.getDisplayVariant(locale27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = locale19.getUnicodeLocaleType("...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN..");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN..");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CHINA" + "'", str13, "CHINA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals(locale18.toString(), "zho_US");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str22, "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CA" + "'", str23, "CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "italien" + "'", str24, "italien");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test06674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06674");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale2);
        java.util.Locale.setDefault(locale2);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale2);
        java.lang.String str7 = locale2.getExtension('x');
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = locale8.getDisplayName();
        java.lang.String str10 = locale2.getDisplayCountry(locale8);
        java.lang.String str11 = locale2.getDisplayName();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "english" + "'", str3, "english");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "chinois (Chine)" + "'", str9, "chinois (Chine)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6cd5\u56fd" + "'", str10, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fran\347ais (France)" + "'", str11, "fran\347ais (France)");
    }

    @Test
    public void test06675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("AI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AI" + "'", str1, "AI");
    }

    @Test
    public void test06676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06676");
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
        java.lang.String str51 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) strList49, "###############################EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S");
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
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chine" + "'", str11, "Chine");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chine" + "'", str15, "Chine");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Chine" + "'", str18, "Chine");
        org.junit.Assert.assertEquals(locale22.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chine" + "'", str25, "Chine");
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.util" + "'", str51, "java.util");
    }

    @Test
    public void test06677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06677");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                 a                  ", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\u6cd5\u6587", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("hi", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "us", charArray9);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "][gnirts", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test06678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06678");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$xxxxxxxxinglese (Canada)xxxxxxxx$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("LOCALE.LANGUAGERANGE", "\u5fb7\u6587\u5fb7\u56fd)");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06680");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray7 = languageRangeList6.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator8 = languageRangeList6.spliterator();
        boolean boolean9 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = languageRangeList6.subList(13, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(13) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(languageRangeSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("itafraita", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06682");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx", "ShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShortShort", (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06683");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("fr-CA", "                                                      java.lang                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06684");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("locale.builde", "Locale.FilteringMode");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06685");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hina", " a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06686");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("               class java.lang.String               ", (double) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=15.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06687");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("I!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!H" + "'", str1, "I!H");
    }

    @Test
    public void test06688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06688");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "itfritl", (java.lang.CharSequence) "                                                                                              Germn");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "itfritl" + "'", charSequence2, "itfritl");
    }

    @Test
    public void test06689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06689");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "LOCLE.LNGUGERNGE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06690");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("..ITALIAHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..ITALIAHi" + "'", str1, "..ITALIAHi");
    }

    @Test
    public void test06691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06691");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("Taiwan");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "nawiaT" + "'", str1, "nawiaT");
    }

    @Test
    public void test06692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "yListayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArraiiiiiiiiiiiiiiiiiiiiiiiArr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yListayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArraiiiiiiiiiiiiiiiiiiiiiiiArr" + "'", str1, "yListayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArraiiiiiiiiiiiiiiiiiiiiiiiArr");
    }

    @Test
    public void test06693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06693");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "fr-CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06694");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("                                                                                   HINDI (HI!,CHINA)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hindi(hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06695");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("cnncnncnnlocale.Buildercnncnncnnc", "anglais (Canada)                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06696");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ch", "an       a", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06697");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("GGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLIGGGGGGGGGGGGGGGGGGGGGGG....ENGLI", "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HENGLISH", (int) 'x');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06698");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIENITALIEN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06699");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "English (United States)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English (United States)" + "'", str1, "English (United States)");
    }

    @Test
    public void test06700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06700");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                            ese (Taiwan");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06701");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587" + "'", str1, "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587");
    }

    @Test
    public void test06702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06702");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...   gnalesenic.esenicavaj                                                Ih                                     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                     hI                                                javacinese.cineselang   ..." + "'", str1, "...                                     hI                                                javacinese.cineselang   ...");
    }

    @Test
    public void test06703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06703");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\u6cd5\u56fd", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("SHORT", "....................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SHORT" + "'", str2, "SHORT");
    }

    @Test
    public void test06705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06705");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "h                                                gnalesenic.esenicavaj                                                I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06706");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                    nglish  Hindi (HI!,cHINA)", "z", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                    nglish  Hindi (HI!,cHINA)" + "'", str3, "                    nglish  Hindi (HI!,cHINA)");
    }

    @Test
    public void test06707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                       ese(Taiwan", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           " + "'", str2, "                                           ");
    }

    @Test
    public void test06708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06708");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ususususususususususususususususususus", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("I!Hchizh_TW", "englhi!string[]string[]sshi!string[]string[]s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "englhi!string[]string[]sshi!string[]string[]s" + "'", str2, "englhi!string[]string[]sshi!string[]string[]s");
    }

    @Test
    public void test06710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06710");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("lOCALE.bUILDER[]");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06711");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF.A");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD/AE/AF/A");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06712");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("            locale.builder             ", "apanesexxxxxxxxxxxxxx", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06713");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!henglish (IA,zh,CN)", 99, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06714");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = org.apache.commons.lang3.ClassUtils.getClass("...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN..");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ///X/AZ/BA/BB/BD/BE/BF/BG/BH/BI/BJ/BL/BM/BN//");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06715");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "          xxxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          xxxxxxx" + "'", str1, "          xxxxxxx");
    }

    @Test
    public void test06716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06716");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06717");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("ia", "XXXXXXXXXXXXXXJAPANESEXXXXXXXXXXXXXX", 43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ia" + "'", str3, "ia");
    }

    @Test
    public void test06718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06718");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\u4e2d\u6587\u53f0\u7063)", 13, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06719");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("xxxxxxx", "locale.builde");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxxxxx" + "'", str2, "xxxxxxx");
    }

    @Test
    public void test06720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06720");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("e!e(Tiiwin", 563, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("$$$$", "cn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "$$$$" + "'", str2, "$$$$");
    }

    @Test
    public void test06722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06722");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S", "...                                     hI                                                javacinese.cineselang   ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06723");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "                 a                 ", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06724");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxx", "ANIHC                                                                                               ", 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxx" + "'", str3, "xxxxxxxxxxxxxxJapanesexxxxxxxxxxxxxx");
    }

    @Test
    public void test06725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06725");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ESE (tAIWAN", "engliIlish");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ReferencePipeline.Head", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi", "A", (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!STRING[]STRING[]S", strArray9, strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("Ja", strArray4, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!STRING[]STRING[]S" + "'", str15, "HI!STRING[]STRING[]S");
    }

    @Test
    public void test06726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN..._italiano" + "'", str1, "...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN..._italiano");
    }

    @Test
    public void test06727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06727");
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
        java.lang.String str15 = languageRange12.getRange();
        double double16 = languageRange12.getWeight();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "english" + "'", str13, "english");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "english" + "'", str15, "english");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test06728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06728");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getShortClassName("       hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       hi!" + "'", str1, "       hi!");
    }

    @Test
    public void test06729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("AD.AE.AF", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AD.AE.AF" + "'", str2, "AD.AE.AF");
    }

    @Test
    public void test06730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06730");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("laEg                                                      ", "hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06731");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAAengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWArrayengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWALengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAist", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAAengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWArrayengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWALengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAist" + "'", str3, "ncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAAengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWArrayengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWALengliIlishESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAist");
    }

    @Test
    public void test06732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06732");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHNAAAAA", (int) 'x');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06733");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("china_CN", "hArrayList", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "china_CN" + "'", str3, "china_CN");
    }

    @Test
    public void test06734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06734");
        java.util.Locale locale3 = new java.util.Locale("CN", "italianojajajajajajajajajajajajajaj", "");
        java.lang.String str4 = locale3.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "cn_ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cn (ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ)" + "'", str4, "cn (ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ)");
    }

    @Test
    public void test06735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06735");
        java.util.Locale locale3 = new java.util.Locale("hi", "hi!", "cHINA");
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
        java.util.Locale.setDefault(locale4);
        java.lang.String str17 = locale3.getDisplayVariant(locale4);
        java.lang.String str18 = locale4.toLanguageTag();
        java.lang.String str19 = locale4.getScript();
        org.junit.Assert.assertEquals(locale3.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "anglais" + "'", str9, "anglais");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "english" + "'", str13, "english");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "cHINA" + "'", str17, "cHINA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "it" + "'", str18, "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test06736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test06737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06737");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) "44444444444444444ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "ANIHCxxxxhIxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "String" + "'", str2, "String");
    }

    @Test
    public void test06738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06738");
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
        java.lang.Class<?> wildcardClass80 = languageRangeList1.getClass();
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
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cina" + "'", str30, "Cina");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-CN" + "'", str31, "zh-CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Cina" + "'", str34, "Cina");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Cina" + "'", str37, "Cina");
        org.junit.Assert.assertEquals(locale41.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Cina" + "'", str44, "Cina");
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
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test06739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06739");
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
        java.util.Locale.Builder builder23 = builder20.removeUnicodeLocaleAttribute("inglese");
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder24.clearExtensions();
        java.util.Locale.Builder builder27 = builder25.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder29 = builder27.setLanguage("it");
        java.util.Locale.Builder builder30 = builder29.clear();
        java.util.Locale locale32 = new java.util.Locale("");
        java.lang.String str33 = locale32.getDisplayLanguage();
        java.util.Locale locale34 = java.util.Locale.CANADA;
        java.lang.String str35 = locale34.getDisplayLanguage();
        java.lang.String str36 = locale32.getDisplayScript(locale34);
        java.lang.String str37 = locale34.getDisplayVariant();
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.lang.String str41 = locale39.getDisplayVariant();
        java.lang.String str42 = locale34.getDisplayScript(locale39);
        java.util.Locale.Builder builder43 = builder29.setLocale(locale39);
        java.util.Locale.Builder builder44 = builder43.clearExtensions();
        java.util.Locale locale46 = java.util.Locale.ITALIAN;
        java.util.Locale locale48 = new java.util.Locale("");
        java.lang.String str49 = locale48.getDisplayLanguage();
        java.util.Locale locale50 = java.util.Locale.CANADA;
        java.lang.String str51 = locale50.getDisplayLanguage();
        java.lang.String str52 = locale48.getDisplayScript(locale50);
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale54);
        java.lang.String str56 = locale48.getDisplayCountry(locale54);
        java.lang.String str57 = locale46.getDisplayScript(locale48);
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.upperCase("China", locale46);
        java.util.Locale locale60 = java.util.Locale.TAIWAN;
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.upperCase("", locale60);
        java.lang.String str62 = locale60.getISO3Country();
        java.util.Set<java.lang.Character> charSet63 = locale60.getExtensionKeys();
        java.util.Locale locale64 = locale60.stripExtensions();
        java.lang.String str65 = locale46.getDisplayLanguage(locale60);
        java.util.Locale.Builder builder66 = builder43.setLocale(locale46);
        java.util.Locale.Builder builder67 = builder23.setLocale(locale46);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder70 = builder23.setExtension('4', "collecti");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
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
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "inglese" + "'", str35, "inglese");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Cina" + "'", str40, "Cina");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "it");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "inglese" + "'", str51, "inglese");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "english" + "'", str55, "english");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "CHINA" + "'", str58, "CHINA");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "TWN" + "'", str62, "TWN");
        org.junit.Assert.assertNotNull(charSet63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str65, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test06740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("WT_hz", "ENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISHENGLISH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "WT_hz" + "'", str2, "WT_hz");
    }

    @Test
    public void test06741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06741");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange98 = languageRangeList1.get(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals(locale46.toString(), "it");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Cina" + "'", str47, "Cina");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "zh-CN" + "'", str48, "zh-CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Cina" + "'", str51, "Cina");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "it");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Cina" + "'", str54, "Cina");
        org.junit.Assert.assertEquals(locale58.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "it");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Cina" + "'", str61, "Cina");
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
    public void test06742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06742");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHN     ", "h                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                I");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("zh_TW");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("cHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test06743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06743");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ANIHC               EN_ca                                                                 ", 39, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06744");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("can", "englTWNsTWN", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("undaaaaaaa", "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "undaaaaaaa" + "'", str2, "undaaaaaaa");
    }

    @Test
    public void test06746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06746");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("\u4e2d\u56fd\u8a9e (ZH)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test06747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06747");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("italiano", 350, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06748");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06749");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06750");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "redliub");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06751");
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
        java.util.Locale locale80 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str81 = locale80.getDisplayLanguage();
        java.util.Locale locale82 = java.util.Locale.getDefault();
        java.lang.String str83 = locale80.getDisplayCountry(locale82);
        java.util.Locale locale84 = java.util.Locale.TAIWAN;
        java.lang.String str85 = locale84.getVariant();
        java.lang.String str86 = locale80.getDisplayName(locale84);
        java.util.Locale locale87 = locale80.stripExtensions();
        java.util.Locale.setDefault(category78, locale87);
        java.lang.String str89 = locale87.getISO3Country();
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
        org.junit.Assert.assertEquals(locale80.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Chinese" + "'", str81, "Chinese");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "it");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Taiwan" + "'", str83, "Taiwan");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
// flaky:         org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str86, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "TWN" + "'", str89, "TWN");
    }

    @Test
    public void test06752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06752");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06753");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06754");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "java.util", "I!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HchinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!H", 747);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test06755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06755");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "zaachi...zaa.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06756");
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
        java.util.Locale locale72 = java.util.Locale.forLanguageTag("CN");
        java.util.Set<java.lang.String> strSet73 = locale72.getUnicodeLocaleKeys();
        java.lang.String str74 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.lang.String>) strSet73);
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
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "cn");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test06757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06757");
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
        int int64 = languageRangeList4.lastIndexOf((java.lang.Object) 7);
        int int65 = languageRangeList4.size();
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
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test06758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06758");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Englis", "undaaaaaaaH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06759");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ZHCINESESE", "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06760");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "english");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06761");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06762");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("             AN       A", "Class[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06763");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("$$$$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$$$$" + "'", str1, "$$$$");
    }

    @Test
    public void test06764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06764");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN..._italiano", "ng                                                      a.lava                                                      j");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06765");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("zh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CTWzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-CNzh-C", 48, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06766");
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
        java.util.Locale locale13 = new java.util.Locale("");
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.lang.String str17 = locale13.getDisplayScript(locale15);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale19);
        java.lang.String str21 = locale13.getDisplayCountry(locale19);
        java.lang.String str22 = locale19.toLanguageTag();
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.upperCase("tring[]", locale19);
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale24.getDisplayCountry(locale25);
        java.lang.String str27 = locale24.toLanguageTag();
        java.util.Locale locale28 = locale24.stripExtensions();
        java.lang.String str29 = locale19.getDisplayVariant(locale28);
        java.util.Locale.Builder builder30 = builder10.setLocale(locale19);
        java.util.Locale.Builder builder31 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder33 = builder10.setRegion("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Chinese (Taiwan) [at index 0]");
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "China" + "'", str8, "China");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "English" + "'", str16, "English");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "english" + "'", str20, "english");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "fr-FR" + "'", str22, "fr-FR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "TRING[]" + "'", str23, "TRING[]");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cina" + "'", str26, "Cina");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh-CN" + "'", str27, "zh-CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test06767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06767");
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
        int int95 = languageRangeList4.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor97 = languageRangeList4.listIterator(42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 42");
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
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    public void test06768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06768");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("AHI!HI!                                      ", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           AHI!HI!                                                                 " + "'", str2, "                           AHI!HI!                                                                 ");
    }

    @Test
    public void test06769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06769");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                 a                  ", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\u6cd5\u6587", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("hi", charArray7);
        java.lang.String str16 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) "hi", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniC");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang" + "'", str16, "java.lang");
    }

    @Test
    public void test06770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "DE ", "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06771");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = org.apache.commons.lang3.ClassUtils.getClass("rancese", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: rancese");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06772");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("it", "Chin", 7);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "t" + "'", str4, "t");
    }

    @Test
    public void test06773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06773");
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.setScript("");
        java.util.Locale.Builder builder5 = builder3.setLanguage("HI");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale locale7 = builder5.build();
        java.lang.String str8 = locale7.getCountry();
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.upperCase("\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587", locale7);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "hi");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "hi");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587" + "'", str9, "\u5fb7\u6587\u5fb7\u56fd\u5fb7\u6587");
    }

    @Test
    public void test06774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06774");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("us");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "us" + "'", str1, "us");
    }

    @Test
    public void test06775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06775");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi!hi! (                 A                 )");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test06776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06776");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("...xxxxxFrench(France)xxxxxxxxxx", "EN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("italiahi", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "italiahi" + "'", str2, "italiahi");
    }

    @Test
    public void test06778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06778");
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
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream30 = languageRangeList13.parallelStream();
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
        org.junit.Assert.assertNotNull(languageRangeStream30);
    }

    @Test
    public void test06779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06779");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("LOCLE.LNGUGERNGE");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06780");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("$", (int) ' ', 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "$" + "'", str3, "$");
    }

    @Test
    public void test06781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                      java.lang                                                      ", "\u4e2d\u56fd\u8a9e (ZH)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      java.lang                                                      " + "'", str2, "                                                      java.lang                                                      ");
    }

    @Test
    public void test06782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                              Germn", "china_CN                             ese(Taiwan", 27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                              Germn" + "'", str3, "                                                                                              Germn");
    }

    @Test
    public void test06783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06783");
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
        java.lang.Class<?>[] wildcardClassArray15 = org.apache.commons.lang3.ClassUtils.primitivesToWrappers(wildcardClassArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray15);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test06784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06784");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn" + "'", str1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn");
    }

    @Test
    public void test06785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06785");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06786");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##Italian", 'x');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06787");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale3 = new java.util.Locale("");
        java.lang.String str4 = locale3.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale3.getDisplayScript(locale5);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale9);
        java.lang.String str11 = locale3.getDisplayCountry(locale9);
        java.lang.String str12 = locale0.getDisplayScript(locale3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList15 = java.util.Locale.LanguageRange.parse("Cina", strMap14);
        java.lang.String[] strArray19 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags(languageRangeList15, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        boolean boolean24 = locale0.equals((java.lang.Object) strList20);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
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
        org.junit.Assert.assertNotNull(languageRangeList15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode22.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test06788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06788");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       hi!", "undaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaaundaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06789");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setScript("an");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: an [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test06790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06790");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\u5317\u5370\u5ea6\u6587 (HI!,cHINA)", "zh_Z", 0, 0);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u5317\u5370\u5ea6\u6587 (HI!,cHINA)" + "'", str4, "\u5317\u5370\u5ea6\u6587 (HI!,cHINA)");
    }

    @Test
    public void test06791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06791");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("EN_C", "hi!              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EN_C" + "'", str2, "EN_C");
    }

    @Test
    public void test06792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("anglais (Canada", "AN                 a                 AN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AN                 a                 AN" + "'", str2, "AN                 a                 AN");
    }

    @Test
    public void test06793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("inglese (canada)", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglese (canada)" + "'", str2, "inglese (canada)");
    }

    @Test
    public void test06794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06794");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hindi (HI!,cHINA)", "zh_Z", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06795");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("zh-CNenglish", "hindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHindiHind");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06796");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray2 = languageRangeList1.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray5 = languageRangeList4.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator6 = languageRangeList4.spliterator();
        boolean boolean7 = languageRangeList1.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor8 = languageRangeList1.iterator();
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList1, '$');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.parse("CHN", strMap13);
        languageRangeList14.clear();
        boolean boolean16 = languageRangeList14.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = languageRangeList1.addAll(2, (java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 2, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(languageRangeSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(languageRangeItor8);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test06797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06797");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("cines");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "senic" + "'", str1, "senic");
    }

    @Test
    public void test06798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06798");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap21 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList22 = java.util.Locale.LanguageRange.parse("Cina", strMap21);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap23 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList24 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList22, strMap23);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean28 = languageRangeList26.remove((java.lang.Object) "English");
        boolean boolean30 = languageRangeList26.remove((java.lang.Object) 1);
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
        java.util.Locale locale68 = java.util.Locale.lookup(languageRangeList26, (java.util.Collection<java.util.Locale>) localeList65);
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter(languageRangeList24, (java.util.Collection<java.util.Locale>) localeList65);
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale.LanguageRange languageRange73 = new java.util.Locale.LanguageRange("Canada");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange74 = languageRangeList16.set((-1), languageRange73);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(languageRangeList22);
        org.junit.Assert.assertNotNull(languageRangeList24);
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
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
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "China" + "'", str42, "China");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "zh-CN" + "'", str43, "zh-CN");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "China" + "'", str46, "China");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
// flaky:         org.junit.Assert.assertEquals(locale48.toString(), "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "China" + "'", str49, "China");
        org.junit.Assert.assertEquals(locale53.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
// flaky:         org.junit.Assert.assertEquals(locale55.toString(), "chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "China" + "'", str56, "China");
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
        org.junit.Assert.assertNull(locale68);
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertNotNull(localeList70);
    }

    @Test
    public void test06799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("xxx", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\u4e2d\u56fd\u8a9e (ZH)", (-1), "builder");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd\u8a9e (ZH)" + "'", str3, "\u4e2d\u56fd\u8a9e (ZH)");
    }

    @Test
    public void test06801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06801");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "CHN", (java.lang.CharSequence) "chinois");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "CHN" + "'", charSequence2, "CHN");
    }

    @Test
    public void test06802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06802");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.Category category1 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale2 = java.util.Locale.getDefault(category1);
        java.util.Locale locale3 = java.util.Locale.getDefault(category1);
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str8 = locale5.getDisplayCountry(locale7);
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        java.lang.String str10 = locale9.getVariant();
        java.lang.String str11 = locale5.getDisplayName(locale9);
        java.lang.String str12 = locale4.getDisplayScript(locale5);
        java.util.Locale.setDefault(category1, locale5);
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("twn");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.upperCase("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", locale16);
        java.lang.String str18 = locale16.getVariant();
        java.util.Locale.setDefault(category1, locale16);
        java.lang.String str21 = locale16.getExtension('a');
        java.lang.String str22 = locale0.getDisplayVariant(locale16);
        java.lang.String str24 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) str22, "it_CN");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category1.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str8, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str11, "\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "twn");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str17, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "String" + "'", str24, "String");
    }

    @Test
    public void test06803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06803");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("en_CA", "");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en_CA" + "'", str3, "en_CA");
    }

    @Test
    public void test06804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("ANIHC      xxxxhIxxx", "Chinese(China)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ANIHC      xxxxhIxxx" + "'", str2, "ANIHC      xxxxhIxxx");
    }

    @Test
    public void test06805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06805");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Engl....englishs....english", 'u', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Engl....englishs....english" + "'", str3, "Engl....englishs....english");
    }

    @Test
    public void test06806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06806");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "       hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06807");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str1, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
    }

    @Test
    public void test06808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06808");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\u4e2d\u6587\u53f0\u7063)", 3, '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str3, "\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test06809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06809");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("sTI-F");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "sTI-F" + "'", str1, "sTI-F");
    }

    @Test
    public void test06810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06810");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", "444444444444444444444444444444444", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06811");
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
            java.util.Locale.Builder builder25 = builder22.setLanguage("t");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: t [at index 0]");
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
    public void test06812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06812");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "oL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "oL" + "'", str1, "oL");
    }

    @Test
    public void test06813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06813");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("fr_FR", 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06814");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e2d\u6587 (ZH)", (double) 93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=93.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06815");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("cn (ITALIANOJAJAJAJAJAJAJAJAJAJAJAJAJAJ)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06816");
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
        java.util.Locale locale20 = builder19.build();
        java.lang.String str21 = locale20.toString();
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
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u56fd" + "'", str16, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh_CN" + "'", str21, "zh_CN");
    }

    @Test
    public void test06817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06817");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("cinese (Cina)", (int) (byte) 0, "cNn");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cinese (Cina)" + "'", str3, "cinese (Cina)");
    }

    @Test
    public void test06818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06818");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("          xxxxxx");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          xxxxxx" + "'", str1, "          xxxxxx");
    }

    @Test
    public void test06819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06819");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("italiahI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "italiahI" + "'", str1, "italiahI");
    }

    @Test
    public void test06820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\u65e5\u6587", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u65e5\u6587" + "'", str2, "\u65e5\u6587");
    }

    @Test
    public void test06821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06821");
        java.util.Locale locale2 = new java.util.Locale("");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.CANADA;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale2.getDisplayScript(locale4);
        java.lang.String str7 = locale4.getDisplayVariant();
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.upperCase("", locale4);
        java.lang.String str9 = locale4.getLanguage();
        java.lang.String str11 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) locale4, "en_CA");
        java.util.Set<java.lang.Character> charSet12 = locale4.getExtensionKeys();
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en" + "'", str9, "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.util" + "'", str11, "java.util");
        org.junit.Assert.assertNotNull(charSet12);
    }

    @Test
    public void test06822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06822");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream5 = languageRangeList1.stream();
        boolean boolean6 = languageRangeList1.isEmpty();
        languageRangeList1.clear();
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("it");
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("ESE (tAIWAN", strArray10);
        boolean boolean12 = languageRangeList1.contains((java.lang.Object) strArray10);
        java.lang.Object[] objArray13 = languageRangeList1.toArray();
        java.lang.String str15 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) objArray13, "Collections.EmptySetitaCollections.EmptySetitaCollections.EmptySetitaCollections.EmptySet");
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Object[]" + "'", str15, "Object[]");
    }

    @Test
    public void test06823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06823");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("it", strMap1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<java.util.Locale.LanguageRange>) languageRangeList2, '#');
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap10 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        boolean boolean15 = languageRangeList8.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        languageRangeList8.clear();
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale21);
        java.util.Locale locale23 = java.util.Locale.US;
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale26.getDisplayCountry(locale27);
        java.lang.String str29 = locale26.toLanguageTag();
        java.util.Locale locale30 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale30.getDisplayCountry(locale31);
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        java.util.Locale locale39 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.lang.String str42 = locale40.getDisplayCountry(locale41);
        java.util.Locale locale44 = new java.util.Locale("");
        java.lang.String str45 = locale44.getDisplayVariant();
        java.util.Locale locale46 = java.util.Locale.KOREAN;
        java.util.Locale locale48 = new java.util.Locale("");
        java.util.Locale locale49 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray50 = new java.util.Locale[] { locale21, locale23, locale24, locale25, locale26, locale31, locale33, locale39, locale41, locale44, locale46, locale48, locale49 };
        java.util.ArrayList<java.util.Locale> localeList51 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList51, localeArray50);
        java.util.List<java.util.Locale> localeList53 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList51);
        java.util.List<java.util.Locale> localeList54 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList53);
        java.util.Locale locale55 = java.util.Locale.lookup(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList54);
        java.lang.String str57 = org.apache.commons.lang3.ClassUtils.getPackageName((java.lang.Object) locale55, "china_CN");
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "english" + "'", str22, "english");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u56fd" + "'", str28, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh-CN" + "'", str29, "zh-CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u56fd" + "'", str32, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u4e2d\u56fd" + "'", str35, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale39.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e2d\u56fd" + "'", str42, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko");
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(localeList53);
        org.junit.Assert.assertNotNull(localeList54);
        org.junit.Assert.assertNull(locale55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "china_CN" + "'", str57, "china_CN");
    }

    @Test
    public void test06824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06824");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "sti-f");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06825");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("Hindi (HI!,cHINA", "allemand", "AN                 a                 AN");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test06827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06827");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CA" + "'", str1, "CA");
    }

    @Test
    public void test06828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("ESESENICHZ.....", "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW" + "'", str2, "AD.AE.AF.AG.AI.AL.AM.AN.AO.AQ.AR.AS.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW");
    }

    @Test
    public void test06829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06829");
        java.lang.String str2 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName((java.lang.Object) "ENGLHI!STRING[]STRING[]SSHI!STRING[]STRING[]S", "HI!HI!HI!HI!HI!Hzh_Z!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
    }

    @Test
    public void test06830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06830");
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
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator37 = languageRangeList1.spliterator();
        java.lang.Object[] objArray38 = languageRangeList1.toArray();
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join(objArray38, '$');
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
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd" + "'", str11, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u56fd" + "'", str15, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u56fd" + "'", str18, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale22.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u4e2d\u56fd" + "'", str25, "\u4e2d\u56fd");
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
        org.junit.Assert.assertNotNull(languageRangeSpliterator37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test06831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06831");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06832");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                gnalesenic.esenicavaj                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06833");
        java.util.Locale locale3 = new java.util.Locale("...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN...", "italiano");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.upperCase("CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale3);
        java.lang.String str6 = locale3.getCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "...x.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn..._ITALIANO");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str5, "CHINAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ITALIANO" + "'", str6, "ITALIANO");
    }

    @Test
    public void test06834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06834");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("                                    ", "chinois");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:                                      [at index 0]");
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
    }

    @Test
    public void test06835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06835");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange22 = languageRangeList2.remove(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 6, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test06836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06836");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\u4e2d\u6587\u53f0\u7063)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str1, "\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test06837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Chinese (China)", "ITALIAHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITALIAHi" + "'", str2, "ITALIAHi");
    }

    @Test
    public void test06838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06838");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b\u6cd5\u6587\u6cd5\u570b)");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06839");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("     Chine", "ingleseu", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06840");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "cina");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06841");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("enenenenenenenenenen", 8, 27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "enenenenenen" + "'", str3, "enenenenenen");
    }

    @Test
    public void test06842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06842");
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
        java.util.Locale locale89 = java.util.Locale.JAPANESE;
        java.util.Locale locale91 = java.util.Locale.TAIWAN;
        java.lang.String str92 = org.apache.commons.lang3.StringUtils.upperCase("", locale91);
        java.lang.String str93 = locale89.getDisplayVariant(locale91);
        java.util.Set<java.lang.Character> charSet94 = locale91.getExtensionKeys();
        java.util.Set<java.lang.String> strSet95 = locale91.getUnicodeLocaleAttributes();
        java.lang.String str96 = locale91.getDisplayScript();
        boolean boolean97 = languageRange87.equals((java.lang.Object) locale91);
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
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u4e2d\u56fd" + "'", str38, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "zh-CN" + "'", str39, "zh-CN");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e2d\u56fd" + "'", str42, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u4e2d\u56fd" + "'", str45, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale49.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale51);
// flaky:         org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\u4e2d\u56fd" + "'", str52, "\u4e2d\u56fd");
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
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "ja");
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertNotNull(charSet94);
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test06843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]", ".................................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]" + "'", str2, "TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]");
    }

    @Test
    public void test06844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06844");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 4, 43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06845");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ita" + "'", str1, "ita");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "it");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "it");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "it");
    }

    @Test
    public void test06846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06846");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...gggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....eng...", "en_CA", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06847");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("xxxxxxx", "XXXXXXXXXXXXXXJAPANESEXXXXXXXXXXXXXX", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06848");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("fra", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "string[]", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "German", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "En", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxchn     ", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "arraylist###########", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ArrayL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06850");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.Builder builder6 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguage("\u4e2d\u570b");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? [at index 0]");
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
    }

    @Test
    public void test06851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06851");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("frazh-CNenglis");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "frazh-CNenglis" + "'", str1, "frazh-CNenglis");
    }

    @Test
    public void test06852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06852");
        java.lang.ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = org.apache.commons.lang3.ClassUtils.getClass(classLoader0, "ahi!hi!hi!hi!hi!HI!ahi!hi!hi!hi!hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ahi!hi!hi!hi!hi!HI!ahi!hi!hi!hi!hi!");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06853");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("englCNsCN", 39, 'x');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "englCNsCNxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" + "'", str3, "englCNsCNxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test06854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)", 11);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str2, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
    }

    @Test
    public void test06855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06855");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxzh-hcnczih", "ANIHCzhcinesesexxxxx");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06856");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("zh-cnenglish (LOCALE.LANGUAGERANGE)", "Chinese(China)", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06857");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("English", "hi!", (int) (byte) 0);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("China", strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "a", (int) '4', (int) ' ');
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "twn");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "CN");
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("German", strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "$$$$$");
        int int19 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("EN_CA", strArray18);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test06858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Zxxxxxxxxxxxxxxxxxxx", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06859");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder32 = builder7.setExtension('u', "\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5\u6587\u6cd5...");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: h???????????????????????????... [at index 0]");
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
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "inglese" + "'", str14, "inglese");
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
    }

    @Test
    public void test06860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06860");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("US");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06861");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("fr", 350);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "frfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr" + "'", str2, "frfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr");
    }

    @Test
    public void test06862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06862");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("cncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList", "ahi!hi! (                 A                 ", "zh-CNenglis");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList" + "'", str3, "cncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncncArrayList");
    }

    @Test
    public void test06863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test06864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06864");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList73 = languageRangeList59.subList(6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(6) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test06865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06865");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "engls");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06866");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("collecti", "ChinChinChinChinChinChinChinChinChinaaaaaaaaa$", (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "collecti" + "'", str3, "collecti");
    }

    @Test
    public void test06867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "YT.ZA.ZM.ZW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06868");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587" + "'", str1, "\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587");
    }

    @Test
    public void test06869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06869");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#.FilteringMode", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06870");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("nglish  Hindi (HI!,cHINA", "....english", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06871");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        int int5 = languageRangeList1.size();
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("EnglTWNsTWN", "....english", (int) (short) 0);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("hi", "iiiiiiiiiiiiiiiiiiiiiiiArrayList");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("english", strArray10, strArray13);
        java.lang.Comparable<java.lang.String>[] strComparableArray15 = languageRangeList1.toArray((java.lang.Comparable<java.lang.String>[]) strArray13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, strMap19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.parse("Cina", strMap22);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap24 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList25 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList23, strMap24);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList27 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean29 = languageRangeList27.remove((java.lang.Object) "English");
        boolean boolean31 = languageRangeList27.remove((java.lang.Object) 1);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Locale locale36 = java.util.Locale.FRANCE;
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale36);
        java.util.Locale locale38 = java.util.Locale.US;
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale41 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale41.getDisplayCountry(locale42);
        java.lang.String str44 = locale41.toLanguageTag();
        java.util.Locale locale45 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = locale45.getDisplayCountry(locale46);
        java.util.Locale locale48 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.lang.String str50 = locale48.getDisplayCountry(locale49);
        java.util.Locale locale54 = new java.util.Locale("hi", "hi!", "cHINA");
        java.util.Locale locale55 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = locale55.getDisplayCountry(locale56);
        java.util.Locale locale59 = new java.util.Locale("");
        java.lang.String str60 = locale59.getDisplayVariant();
        java.util.Locale locale61 = java.util.Locale.KOREAN;
        java.util.Locale locale63 = new java.util.Locale("");
        java.util.Locale locale64 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale[] localeArray65 = new java.util.Locale[] { locale36, locale38, locale39, locale40, locale41, locale46, locale48, locale54, locale56, locale59, locale61, locale63, locale64 };
        java.util.ArrayList<java.util.Locale> localeList66 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList66, localeArray65);
        java.util.List<java.util.Locale> localeList68 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.Locale locale69 = java.util.Locale.lookup(languageRangeList27, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter(languageRangeList25, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.Locale.FilteringMode filteringMode71 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter(languageRangeList20, (java.util.Collection<java.util.Locale>) localeList70, filteringMode71);
        java.util.Locale locale73 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList72);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray76 = languageRangeList75.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream77 = languageRangeList75.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray78 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList79 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList79, languageRangeArray78);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap81 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList82 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList79, strMap81);
        java.lang.String[] strArray90 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList91 = new java.util.ArrayList<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList91, strArray90);
        java.util.List<java.lang.Class<?>> wildcardClassList93 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList91);
        java.lang.String str94 = java.util.Locale.lookupTag(languageRangeList82, (java.util.Collection<java.lang.String>) strList91);
        java.util.List<java.lang.Class<?>> wildcardClassList95 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList91);
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags(languageRangeList75, (java.util.Collection<java.lang.String>) strList91);
        java.lang.String str97 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList96);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "english" + "'", str14, "english");
        org.junit.Assert.assertNotNull(strComparableArray15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(languageRangeList25);
        org.junit.Assert.assertNotNull(languageRangeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "english" + "'", str37, "english");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Cina" + "'", str43, "Cina");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "zh-CN" + "'", str44, "zh-CN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "it");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Cina" + "'", str47, "Cina");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Cina" + "'", str50, "Cina");
        org.junit.Assert.assertEquals(locale54.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "it");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Cina" + "'", str57, "Cina");
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "ko");
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(localeList68);
        org.junit.Assert.assertNull(locale69);
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertTrue("'" + filteringMode71 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode71.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNull(locale73);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(languageRangeStream77);
        org.junit.Assert.assertNotNull(languageRangeArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(languageRangeList82);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(wildcardClassList93);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertNotNull(wildcardClassList95);
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNull(str97);
    }

    @Test
    public void test06872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06872");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale locale6 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.setLanguageTag("AN       a");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: AN       a [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_CN");
    }

    @Test
    public void test06873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06873");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageCanonicalName("cn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test06874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06874");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        int int3 = languageRangeList1.indexOf((java.lang.Object) '4');
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap7 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap7);
        int int9 = languageRangeList5.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList11 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean13 = languageRangeList11.remove((java.lang.Object) "English");
        boolean boolean14 = languageRangeList5.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap18 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, strMap18);
        java.lang.String[] strArray27 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.util.List<java.lang.Class<?>> wildcardClassList30 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList28);
        java.lang.String str31 = java.util.Locale.lookupTag(languageRangeList19, (java.util.Collection<java.lang.String>) strList28);
        java.util.List<java.lang.Class<?>> wildcardClassList32 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList28);
        java.util.List<java.lang.String> strList33 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strList28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.parse("Cina", strMap35);
        java.lang.String[] strArray40 = new java.lang.String[] { "aiaiaiaiaiaiaiaiaia", "zh-CN", "China" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.Locale.FilteringMode filteringMode43 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags(languageRangeList36, (java.util.Collection<java.lang.String>) strList41, filteringMode43);
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList28, filteringMode43);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = languageRangeList1.subList(43, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(languageRangeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClassList30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(wildcardClassList32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + filteringMode43 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode43.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
    }

    @Test
    public void test06875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06875");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("slgnE", "FR", "LANGUAGERANGE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "slgnE" + "'", str3, "slgnE");
    }

    @Test
    public void test06876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("nglese", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nglese" + "'", str2, "nglese");
    }

    @Test
    public void test06877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06877");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("CINESE", "I", 20);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("zh-cn", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z..." + "'", str2, "z...");
    }

    @Test
    public void test06879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06879");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("Ja", strMap2);
        java.util.Locale.LanguageRange languageRange5 = new java.util.Locale.LanguageRange("English");
        java.lang.String str7 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange5, "");
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("a");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] { languageRange5, languageRange9, languageRange11 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.ListIterator<java.util.Locale.LanguageRange> languageRangeItor15 = languageRangeList13.listIterator();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream16 = languageRangeList13.parallelStream();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.parse("hi");
        int int20 = languageRangeList18.indexOf((java.lang.Object) '4');
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
        java.util.List<java.util.Locale> localeList58 = java.util.Locale.filter(languageRangeList18, (java.util.Collection<java.util.Locale>) localeList57);
        java.util.Locale.FilteringMode filteringMode59 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList60 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList58, filteringMode59);
        java.util.List<java.util.Locale> localeList61 = java.util.Locale.filter(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList60);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList62 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Locale.LanguageRange" + "'", str7, "Locale.LanguageRange");
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(languageRangeItor15);
        org.junit.Assert.assertNotNull(languageRangeStream16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
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
        org.junit.Assert.assertNotNull(localeList58);
        org.junit.Assert.assertTrue("'" + filteringMode59 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode59.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList60);
        org.junit.Assert.assertNotNull(localeList61);
    }

    @Test
    public void test06880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "AF");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06881");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHN" + "'", str1, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxCHN");
    }

    @Test
    public void test06882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06882");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("YT.ZA.ZM.ZW");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06883");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "nglish  Hindi (HI!,cHINA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Nglish  Hindi (HI!,cHINA" + "'", str1, "Nglish  Hindi (HI!,cHINA");
    }

    @Test
    public void test06884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("it                                                                                                  ", 36, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06885");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ENG", "\u82f1\u6587\u7f8e\u570b)", 3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "TW");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ENG" + "'", str5, "ENG");
    }

    @Test
    public void test06886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("zh-cnenglh", "                                                tw                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-cnenglh" + "'", str2, "zh-cnenglh");
    }

    @Test
    public void test06887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06887");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("ia", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06888");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("COLLECTI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "COLLECTI" + "'", str1, "COLLECTI");
    }

    @Test
    public void test06889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06889");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("fr_CA", "italiahi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06890");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "und" + "'", str1, "und");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06891");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "EnglHI!STRING[]STRING[]SsHI!STRING[]STRING[]S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(" zH  ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " zH  " + "'", str2, " zH  ");
    }

    @Test
    public void test06893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("][gnirts", "Esglish (Usitee Ststes)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "][gnirts" + "'", str2, "][gnirts");
    }

    @Test
    public void test06894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06894");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("t", 48, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "t                                               " + "'", str3, "t                                               ");
    }

    @Test
    public void test06895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" (HI!,cHINA", 8, "                                redliuB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " (HI!,cHINA" + "'", str3, " (HI!,cHINA");
    }

    @Test
    public void test06896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06896");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...X.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN..._italiano");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06897");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "ZH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06898");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.Builder builder3 = builder1.setLocale(locale2);
        java.util.Locale.Builder builder5 = builder1.setRegion("zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.setLanguageTag("TWN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setUnicodeLocaleKeyword("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniC", "                  hI                   ");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxaniC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test06899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06899");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "   Z");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   Z" + "'", str1, "   Z");
    }

    @Test
    public void test06900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                    En                    ", "zhcines");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    En                    " + "'", str2, "                    En                    ");
    }

    @Test
    public void test06901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06901");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setLanguageTag("Nglish  Hindi (HI!,cHINA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Nglish  Hindi (HI!,cHINA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test06902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06902");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("JaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJc" + "'", str1, "JaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJaJc");
    }

    @Test
    public void test06903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06903");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...ggggggggItaliano...ggggggggg", "\u4e2d\u56fd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06904");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "AAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("IA", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IA" + "'", str2, "IA");
    }

    @Test
    public void test06906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06906");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HArrayList");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HArrayList" + "'", str1, "HArrayList");
    }

    @Test
    public void test06907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06907");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("$ (JAVA.LANG)", ' ');
        java.lang.String str4 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray2, "zH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "String[]" + "'", str4, "String[]");
    }

    @Test
    public void test06908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06908");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("inglese", (int) '.', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaingleseaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06909");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Taiwan", "$$$$", "                                                                                                   .");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Taiwan" + "'", str3, "Taiwan");
    }

    @Test
    public void test06910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06910");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi");
        int int3 = languageRangeList1.indexOf((java.lang.Object) '4');
        languageRangeList1.clear();
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
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, strMap29);
        int int31 = languageRangeList27.size();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean35 = languageRangeList33.remove((java.lang.Object) "English");
        boolean boolean36 = languageRangeList27.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap40 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList41 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, strMap40);
        java.lang.String[] strArray49 = new java.lang.String[] { "English", "hi", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "", "a", "", "China" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.util.List<java.lang.Class<?>> wildcardClassList52 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList50);
        java.lang.String str53 = java.util.Locale.lookupTag(languageRangeList41, (java.util.Collection<java.lang.String>) strList50);
        java.util.List<java.lang.Class<?>> wildcardClassList54 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList50);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList50);
        java.util.List<java.lang.Class<?>> wildcardClassList56 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList50);
        java.util.List<java.lang.Class<?>> wildcardClassList57 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses((java.util.List<java.lang.String>) strList50);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strList50, filteringMode58);
        java.lang.String str60 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strList59);
        java.util.List<java.lang.Class<?>> wildcardClassList61 = org.apache.commons.lang3.ClassUtils.convertClassNamesToClasses(strList59);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
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
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(languageRangeList41);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClassList52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(wildcardClassList54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(wildcardClassList56);
        org.junit.Assert.assertNotNull(wildcardClassList57);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode58.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(wildcardClassList61);
    }

    @Test
    public void test06911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06911");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("AD.AE.AF.AGCHNAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.AT.AU.AW.AX.AZ.BA.BB.BD.BE.BF.BG.BH.BI.BJ.BL.BM.BN.BO.BQ.BR.BS.BT.BV.BW.BY.BZ.CA.CC.CD.CF.CG.CH.CI.CK.CL.CM.CN.CO.CR.CU.CV.CW.CX.CY.CZ.DE.DJ.DK.DM.DO.DZ.EC.EE.EG.EH.ER.ES.ET.FI.FJ.FK.FM.FO.FR.GA.GB.GD.GE.GF.GG.GH.GI.GL.GM.GN.GP.GQ.GR.GS.GT.GU.GW.GY.HK.HM.HN.HR.HT.HU.ID.IE.IL.IM.IN.IO.IQ.IR.IS.IT.JE.JM.JO.JP.KE.KG.KH.KI.KM.KN.KP.KR.KW.KY.KZ.LA.LB.LC.LI.LK.LR.LS.LT.LU.LV.LY.MA.MC.MD.ME.MF.MG.MH.MK.ML.MM.MN.MO.MP.MQ.MR.MS.MT.MU.MV.MW.MX.MY.MZ.NA.NC.NE.NF.NG.NI.NL.NO.NP.NR.NU.NZ.OM.PA.PE.PF.PG.PH.PK.PL.PM.PN.PR.PS.PT.PW.PY.QA.RE.RO.RS.RU.RW.SA.SB.SC.SD.SE.SG.SH.SI.SJ.SK.SL.SM.SN.SO.SR.SS.ST.SV.SX.SY.SZ.TC.TD.TF.TG.TH.TJ.TK.TL.TM.TN.TO.TR.TT.TV.TW.TZ.UA.UG.UM.US.UY.UZ.VA.VC.VE.VG.VI.VN.VU.WF.WS.YE.YT.ZA.ZM.ZW", "de");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06912");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getCountry();
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getDisplayVariant();
        java.lang.String str9 = locale0.getDisplayLanguage(locale7);
        java.lang.String str10 = locale7.getLanguage();
        java.util.Set<java.lang.Character> charSet11 = locale7.getExtensionKeys();
        java.lang.String str12 = locale7.getISO3Language();
        java.lang.Object obj13 = locale7.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cina" + "'", str2, "Cina");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CN" + "'", str4, "CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CHN" + "'", str5, "CHN");
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chinese" + "'", str9, "Chinese");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(charSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
    }

    @Test
    public void test06913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06913");
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
        java.lang.String str24 = locale12.getCountry();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList26 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray27 = languageRangeList26.toArray();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.parse("hi");
        java.lang.Object[] objArray30 = languageRangeList29.toArray();
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator31 = languageRangeList29.spliterator();
        boolean boolean32 = languageRangeList26.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29);
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor33 = languageRangeList26.iterator();
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder35 = builder34.clearExtensions();
        java.util.Locale.Builder builder37 = builder35.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder39 = builder37.setLanguage("it");
        boolean boolean40 = languageRangeList26.remove((java.lang.Object) builder39);
        java.util.Locale.Builder builder42 = builder39.setLanguageTag("CINESE");
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("HI");
        java.util.Locale.Builder builder45 = builder39.setLocale(locale44);
        java.lang.String str46 = locale12.getDisplayVariant(locale44);
        java.lang.Class<?> wildcardClass47 = locale44.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "inglese" + "'", str5, "inglese");
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
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "inglese" + "'", str19, "inglese");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "German" + "'", str23, "German");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(languageRangeList26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(languageRangeSpliterator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(languageRangeItor33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "hi");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test06914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06914");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Itali", "         HI!HI!HI!HI!HI!HI          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" (HI!,cHINA", "chinois");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06916");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  China   ", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                 a                  ", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "ArrayList###########", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "lang                                                      ", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                            en_CA", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ".................................................................................$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$", charArray9);
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
    public void test06917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06917");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("GNAL.AVAJSTRING[]STRING[]STRING[]", "CINA$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06918");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\u82f1\u6587\u7f8e\u570b)", "################################################################################################################lang", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06919");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("chinenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglishenglish", "frfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06920");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("har[]", "\u4e2d\u56fd", (int) '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "har[]" + "'", str5, "har[]");
    }

    @Test
    public void test06921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06921");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("zh-cn", "I###################################################################################################", 5);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                          zh_C                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                          zh_c                                                          " + "'", str1, "                                                          zh_c                                                          ");
    }

    @Test
    public void test06923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06923");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("iiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayListiiiiiiiiiiiiiiiiiiiiiiiArrayList", "HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06924");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ITALIAHI", "anih", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06925");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("fr-FR", 1, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr-FR" + "'", str3, "fr-FR");
    }

    @Test
    public void test06926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06926");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "String", (java.lang.CharSequence) "                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test06927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06927");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("inglese (Canada)", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06928");
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
        java.lang.Object[] objArray53 = languageRangeList1.toArray();
        boolean boolean54 = languageRangeList1.isEmpty();
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
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chine" + "'", str25, "Chine");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh-CN" + "'", str26, "zh-CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chine" + "'", str29, "Chine");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Chine" + "'", str32, "Chine");
        org.junit.Assert.assertEquals(locale36.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Chine" + "'", str39, "Chine");
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
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test06929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06929");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("cinese (Taiwan)");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("CHN");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("h                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                Ih                                                gnalesenic.esenicavaj                                                I", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test06930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                           Germn", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                           Germn" + "'", str2, "                                                                                           Germn");
    }

    @Test
    public void test06931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06931");
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
        java.util.function.UnaryOperator<java.util.Locale.LanguageRange> languageRangeUnaryOperator68 = null;
        // The following exception was thrown during execution in test generation
        try {
            languageRangeList50.replaceAll(languageRangeUnaryOperator68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Chine" + "'", str22, "Chine");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh-CN" + "'", str23, "zh-CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chine" + "'", str26, "Chine");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Chine" + "'", str29, "Chine");
        org.junit.Assert.assertEquals(locale33.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
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
    }

    @Test
    public void test06932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06932");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("#########################English", "....................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06933");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("lang                                                      ", "can", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06934");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "English", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "engliIlish", charArray7);
        java.lang.String str13 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) charArray7, "EnglTWNsTWN");
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", charArray7);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AN       english", charArray7);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "   Z", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "char[]" + "'", str13, "char[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test06935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CINACI" + "'", str2, "CINACI");
    }

    @Test
    public void test06936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06936");
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
        java.util.Locale locale37 = java.util.Locale.ITALIAN;
        java.util.Locale locale39 = new java.util.Locale("");
        java.lang.String str40 = locale39.getDisplayLanguage();
        java.util.Locale locale41 = java.util.Locale.CANADA;
        java.lang.String str42 = locale41.getDisplayLanguage();
        java.lang.String str43 = locale39.getDisplayScript(locale41);
        java.util.Locale locale45 = java.util.Locale.FRANCE;
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale45);
        java.lang.String str47 = locale39.getDisplayCountry(locale45);
        java.lang.String str48 = locale37.getDisplayScript(locale39);
        java.util.Locale locale49 = java.util.Locale.GERMAN;
        java.lang.String str50 = locale39.getDisplayLanguage(locale49);
        java.util.Locale locale53 = new java.util.Locale("");
        java.lang.String str54 = locale53.getDisplayLanguage();
        java.util.Locale locale55 = java.util.Locale.CANADA;
        java.lang.String str56 = locale55.getDisplayLanguage();
        java.lang.String str57 = locale53.getDisplayScript(locale55);
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.lowerCase("a", locale53);
        java.lang.String str59 = locale53.getDisplayScript();
        java.lang.String str60 = locale49.getDisplayLanguage(locale53);
        java.lang.String str61 = locale20.getDisplayName(locale53);
        java.lang.String str62 = locale53.getDisplayLanguage();
        java.util.Locale.Category category63 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale64 = java.util.Locale.getDefault(category63);
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str66 = locale65.getDisplayLanguage();
        java.lang.String str67 = locale65.getDisplayScript();
        java.util.Locale.setDefault(category63, locale65);
        java.util.Locale locale69 = java.util.Locale.getDefault(category63);
        boolean boolean70 = locale53.equals((java.lang.Object) category63);
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "anglais" + "'", str8, "anglais");
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
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it");
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "inglese" + "'", str42, "inglese");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "english" + "'", str46, "english");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "de");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "inglese" + "'", str56, "inglese");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "a" + "'", str58, "a");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "German" + "'", str60, "German");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Italian" + "'", str61, "Italian");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + category63 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category63.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "it");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "cinese" + "'", str66, "cinese");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test06937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06937");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AD.AE.AF.AGchnaafraAD.AE.AF.AGchnaaa", "frfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfrfr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("inglese (canada)", "French (France)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "inglese (canada)" + "'", str2, "inglese (canada)");
    }

    @Test
    public void test06939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06939");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Short", "xxxxxxxxxxxxafxxxxxxxxxxxxx", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06940");
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("CINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINACINA");
        java.util.Locale locale6 = new java.util.Locale("hi", "hi!", "cHINA");
        java.lang.String str7 = locale6.getDisplayVariant();
        java.util.Locale locale8 = locale6.stripExtensions();
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale9.getDisplayCountry(locale10);
        java.lang.String str12 = locale9.toLanguageTag();
        java.lang.String str13 = locale9.getLanguage();
        java.util.Locale locale14 = java.util.Locale.ITALIAN;
        java.util.Locale locale16 = new java.util.Locale("");
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.lang.String str20 = locale16.getDisplayScript(locale18);
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.lowerCase("English", locale22);
        java.lang.String str24 = locale16.getDisplayCountry(locale22);
        java.lang.String str25 = locale14.getDisplayScript(locale16);
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.lang.String str27 = locale16.getDisplayLanguage(locale26);
        java.lang.String str28 = locale9.getDisplayCountry(locale16);
        java.lang.String str29 = locale16.getCountry();
        java.util.Locale locale33 = new java.util.Locale("....english", "zhcinesese", ".");
        java.lang.String str34 = locale16.getDisplayName(locale33);
        java.lang.String str35 = locale6.getDisplayName(locale16);
        java.lang.String str36 = locale2.getDisplayVariant(locale6);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.lowerCase("", locale6);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals(locale6.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cHINA" + "'", str7, "cHINA");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cina" + "'", str11, "Cina");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u82f1\u6587" + "'", str19, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "english" + "'", str23, "english");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "China" + "'", str28, "China");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(locale33.toString(), "....english_ZHCINESESE_.");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Hindi (HI!,cHINA)" + "'", str35, "Hindi (HI!,cHINA)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test06941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06941");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Locale.LanguageRange", "\u6cd5\u6cd5\u6587\u6587ST", "java.uil");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Locale.LanguageRange" + "'", str3, "Locale.LanguageRange");
    }

    @Test
    public void test06942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06942");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "XXXXXXXXXXXXXXJAPANESEXXXXXXXXXXXXXX");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06943");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("zh", "China", (int) '.');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
    }

    @Test
    public void test06944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese (Taiwan)" + "'", str1, "Chinese (Taiwan)");
    }

    @Test
    public void test06945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("chnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chn" + "'", str2, "chn");
    }

    @Test
    public void test06946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("ususususususususususususususususususus", "\u4e2d\u56fdAD.AE.AFxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ususususususususususususususususususus" + "'", str2, "ususususususususususususususususususus");
    }

    @Test
    public void test06947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\u5927\u62ff\u52a0\u6587\u82f1", "CH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5927\u62ff\u52a0\u6587\u82f1" + "'", str2, "\u5927\u62ff\u52a0\u6587\u82f1");
    }

    @Test
    public void test06948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06948");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ocle.Bulde", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("fr-CA", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06950");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList17 = java.util.Locale.LanguageRange.parse("hi");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList19 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean21 = languageRangeList19.remove((java.lang.Object) "English");
        boolean boolean22 = languageRangeList17.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19);
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
        java.util.Locale locale83 = java.util.Locale.lookup(languageRangeList19, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream84 = languageRangeList19.parallelStream();
        java.lang.Object[] objArray85 = languageRangeList19.toArray();
        java.util.Iterator<java.util.Locale.LanguageRange> languageRangeItor86 = languageRangeList19.iterator();
        int int87 = languageRangeList1.lastIndexOf((java.lang.Object) languageRangeList19);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream88 = languageRangeList19.parallelStream();
        java.util.Collection<java.util.Locale.LanguageRange> languageRangeCollection89 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean90 = languageRangeList19.removeAll(languageRangeCollection89);
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
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cina" + "'", str12, "Cina");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "italiano" + "'", str14, "italiano");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(languageRangeList17);
        org.junit.Assert.assertNotNull(languageRangeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
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
        org.junit.Assert.assertEquals(locale54.toString(), "it");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Cina" + "'", str55, "Cina");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "zh-CN" + "'", str56, "zh-CN");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "it");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Cina" + "'", str59, "Cina");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "it");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Cina" + "'", str62, "Cina");
        org.junit.Assert.assertEquals(locale66.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "it");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Cina" + "'", str69, "Cina");
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
        org.junit.Assert.assertNotNull(languageRangeStream84);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(languageRangeItor86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(languageRangeStream88);
    }

    @Test
    public void test06951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06951");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX", "zh_TW", 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX" + "'", str3, "XXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXXzh_TWXXXXXXXXXXFRENCH(FRANCE)XXXXXXXXXX");
    }

    @Test
    public void test06952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587", '$', '$');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587" + "'", str3, "\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587\u65e5\u6587");
    }

    @Test
    public void test06953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06953");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "twn", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "SHORT", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AN                 a                 AN   ", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CINA", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test06954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06954");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Zxxxxxxxxxxxxxxxxxxx", "###en_CAarraylist###########en_CAarraylist###########en_CAarraylist###########en_CAarraylist#####", "loca");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Zxxxxxxxxxxxxxxxxxxx" + "'", str3, "Zxxxxxxxxxxxxxxxxxxx");
    }

    @Test
    public void test06955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06955");
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "zh-CN", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("                 a                  ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ".", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "de", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("EN", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("HI!", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\u53f0\u7063                             ", charArray10);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "EN_ca", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test06956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06956");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF.A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF.A" + "'", str1, "tRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRING[]TRIAD.AE.AF.A");
    }

    @Test
    public void test06957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06957");
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
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.parse("hi");
        boolean boolean18 = languageRangeList16.remove((java.lang.Object) "English");
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
        java.util.List<java.util.Locale> localeList56 = java.util.Locale.filter(languageRangeList16, (java.util.Collection<java.util.Locale>) localeList53);
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
        boolean boolean73 = languageRangeList16.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap74 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, strMap74);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap77 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList78 = java.util.Locale.LanguageRange.parse("Cina", strMap77);
        java.util.Locale.LanguageRange languageRange80 = new java.util.Locale.LanguageRange("English");
        java.lang.String str82 = org.apache.commons.lang3.ClassUtils.getShortClassName((java.lang.Object) languageRange80, "");
        java.lang.String str83 = languageRange80.getRange();
        boolean boolean84 = languageRangeList78.add(languageRange80);
        boolean boolean85 = languageRangeList58.add(languageRange80);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange86 = languageRangeList2.set(11, languageRange80);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 11, Size: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Locale.LanguageRange" + "'", str6, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "english" + "'", str7, "english");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "english" + "'", str11, "english");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "english" + "'", str12, "english");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(languageRangeList16);
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
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cina" + "'", str30, "Cina");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-CN" + "'", str31, "zh-CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Cina" + "'", str34, "Cina");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Cina" + "'", str37, "Cina");
        org.junit.Assert.assertEquals(locale41.toString(), "hi_HI!_cHINA");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Cina" + "'", str44, "Cina");
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
        org.junit.Assert.assertNotNull(localeList56);
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertNotNull(languageRangeList78);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Locale.LanguageRange" + "'", str82, "Locale.LanguageRange");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "english" + "'", str83, "english");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test06958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06958");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", "Cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "ChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaChnaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06959");
        java.util.Locale locale3 = new java.util.Locale("....................................................................................................", "anihc", "\u5fb7\u6587");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u5fb7\u6587");
    }

    @Test
    public void test06960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("XXXXXXXXXXFRENCH (FRANCE)XXXXXXXXXX", "CINACI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXXXXFRENCH (FRANCE)XXXXXXXXXX" + "'", str2, "XXXXXXXXXXFRENCH (FRANCE)XXXXXXXXXX");
    }

    @Test
    public void test06961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06961");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\u6cd5\u6587\u6cd5\u570b)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587\u6cd5\u570b)" + "'", str1, "\u6cd5\u6587\u6cd5\u570b)");
    }

    @Test
    public void test06962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("acoL", "Canada");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "acoL" + "'", str2, "acoL");
    }

    @Test
    public void test06964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06964");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ANIH", (java.lang.CharSequence) "....english (ZHCINESESE,.)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06965");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("nenglis", "GNE", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06966");
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
        java.util.Locale.LanguageRange languageRange21 = languageRangeItor19.next();
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
        org.junit.Assert.assertNotNull(languageRange21);
    }

    @Test
    public void test06967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06967");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("");
        java.util.Locale.Builder builder4 = builder2.setLanguage("HI");
        java.util.Locale locale8 = new java.util.Locale("       hi!", "LOCALE#LANGUAGERANGE", "\u65e5\u6587");
        java.lang.String str9 = locale8.getVariant();
        java.lang.String str10 = locale8.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder4.setLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language:        hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u65e5\u6587" + "'", str9, "\u65e5\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test06968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                  hI                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  hI                   " + "'", str1, "                  hI                   ");
    }

    @Test
    public void test06969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06969");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "##############################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "cnn");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################" + "'", charSequence2, "##############################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test06970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06970");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("DE ", " a");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06971");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engliggggggggggggggggggggggg....engli");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06972");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("LANGUAGERANGE", "char[]");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06973");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("laEg                                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=laeg                                                      ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06974");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)", "HI!HI!HI!HI!HI!HI", "ESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)" + "'", str3, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533aengliIlish)");
    }

    @Test
    public void test06975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06975");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("cinaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "cNn", 9, 48);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cinaxxxxxcNn" + "'", str4, "cinaxxxxxcNn");
    }

    @Test
    public void test06976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("h$I", "latiarfati");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h$I" + "'", str2, "h$I");
    }

    @Test
    public void test06977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06977");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "twn", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "IA", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "    cn    ", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("hArrayList", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06978");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Spliterator<java.util.Locale.LanguageRange> languageRangeSpliterator5 = languageRangeList1.spliterator();
        boolean boolean6 = languageRangeList1.isEmpty();
        java.lang.Object[] objArray7 = languageRangeList1.toArray();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream8 = languageRangeList1.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange10 = languageRangeList1.remove(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 36, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(languageRangeStream8);
    }

    @Test
    public void test06979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06979");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("..................chinois (Chine)", 27, 33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..................chinois (Chine)" + "'", str3, "..................chinois (Chine)");
    }

    @Test
    public void test06980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06980");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06981");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = new java.util.Locale("ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hEnglish", "IA", "zh_CN");
        java.util.Locale locale7 = new java.util.Locale("zho", "US");
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.lang.String str10 = locale4.getDisplayName(locale8);
        java.lang.String str11 = locale8.toLanguageTag();
        java.lang.String str12 = locale0.getDisplayName(locale8);
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("Collecti");
        java.lang.String str15 = locale0.getDisplayVariant(locale14);
        java.lang.String str16 = locale0.toLanguageTag();
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
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "collecti");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "de" + "'", str16, "de");
    }

    @Test
    public void test06982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06982");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ac_NE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06983");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ahi!hi! (                 A                 )");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test06984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06984");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("zh-CN");
        java.util.Locale.Builder builder5 = builder3.setLanguage("it");
        java.util.Locale.Builder builder7 = builder3.setLanguageTag("hI");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale11 = new java.util.Locale("italiano", "Ci_a");
        java.util.Locale locale15 = new java.util.Locale("Canada", "allemand", "cHINA");
        java.lang.String str16 = locale11.getDisplayName(locale15);
        java.util.Set<java.lang.Character> charSet17 = locale11.getExtensionKeys();
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.lang.String str19 = locale11.getDisplayVariant(locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder8.setLocale(locale11);
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
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test06985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06985");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI", "an       a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06986");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("xxxhi!xxxx", (int) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "xxxhi!xxxx" + "'", str3, "xxxhi!xxxx");
    }

    @Test
    public void test06987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06987");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("slgne");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "engls" + "'", str1, "engls");
    }

    @Test
    public void test06988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06988");
        java.util.Locale locale3 = new java.util.Locale("us", "                  hI   Taiwan                  hI                                                                       ", "ESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAN");
        org.junit.Assert.assertEquals(locale3.toString(), "us_                  HI   TAIWAN                  HI                                                                       _ESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWANESE (tAIWAN");
    }

    @Test
    public void test06989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06989");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ad.ae.af.ag.ai.al.am.an.ao.aq.ar.as.at.au.aw.ax.az.ba.bb.bd.be.bf.bg.bh.bi.bj.bl.bm.bn.bo.bq.br.bs.bt.bv.bw.by.bz.ca.cc.cd.cf.cg.ch.ci.ck.cl.cm.cn.co.cr.cu.cv.cw.cx.cy.cz.de.dj.dk.dm.do.dz.ec.ee.eg.eh.er.es.et.fi.fj.fk.fm.fo.fr.ga.gb.gd.ge.gf.gg.gh.gi.gl.gm.gn.gp.gq.gr.gs.gt.gu.gw.gy.hk.hm.hn.hr.ht.hu.id.ie.il.im.in.io.iq.ir.is.it.je.jm.jo.jp.ke.kg.kh.ki.km.kn.kp.kr.kw.ky.kz.la.lb.lc.li.lk.lr.ls.lt.lu.lv.ly.ma.mc.md.me.mf.mg.mh.mk.ml.mm.mn.mo.mp.mq.mr.ms.mt.mu.mv.mw.mx.my.mz.na.nc.ne.nf.ng.ni.nl.no.np.nr.nu.nz.om.pa.pe.pf.pg.ph.pk.pl.pm.pn.pr.ps.pt.pw.py.qa.re.ro.rs.ru.rw.sa.sb.sc.sd.se.sg.sh.si.sj.sk.sl.sm.sn.so.sr.ss.st.sv.sx.sy.sz.tc.td.tf.tg.th.tj.tk.tl.tm.tn.to.tr.tt.tv.tw.tz.ua.ug.um.us.uy.uz.va.vc.ve.vg.vi.vn.vu.wf.ws.ye.yt.za.zm.zw", '$');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06990");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Chinese");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06991");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ENENENENENENENENENEN", "cnn                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06992");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ud");
        java.lang.Class<?> wildcardClass2 = locale1.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ud");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test06993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06993");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("zh-CNenglish", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                          zh_c                                                          ", 31, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CNenglish" + "'", str3, "zh-CNenglish");
    }

    @Test
    public void test06994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06994");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("En", "ListfraHAr", "en");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06995");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "fran\347ais");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06996");
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
        java.lang.String[] strArray69 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "");
        java.lang.String[] strArray70 = org.apache.commons.lang3.StringUtils.stripAll(strArray69);
        boolean boolean71 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray70);
        java.lang.String str72 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray70);
        java.lang.String[] strArray77 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("English", "hi", (int) (short) -1);
        java.lang.String str81 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray77, "zho", (int) 'u', (int) (short) 0);
        int int82 = org.apache.commons.lang3.StringUtils.indexOfAny("CHINOIS (CHINE)", strArray77);
        java.lang.String str83 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray70, strArray77);
        boolean boolean84 = languageRangeList63.equals((java.lang.Object) "chinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
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
        org.junit.Assert.assertNotNull(languageRangeItor61);
        org.junit.Assert.assertNotNull(languageRangeList63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "a" + "'", str72, "a");
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "chinEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish" + "'", str83, "chinEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglishEnglish");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test06997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06997");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("   ");
        java.lang.String str3 = org.apache.commons.lang3.ClassUtils.getShortCanonicalName((java.lang.Object) strArray1, "fr_FR");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "String[]" + "'", str3, "String[]");
    }

    @Test
    public void test06998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06998");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("STRING[]", "ENENENENENENENENENEN");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06999");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("rance)Italiuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rance)Italiuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "rance)Italiuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test07000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test07000");
        java.lang.String str1 = org.apache.commons.lang3.ClassUtils.getPackageName("locale.builder");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "locale" + "'", str1, "locale");
    }
}
