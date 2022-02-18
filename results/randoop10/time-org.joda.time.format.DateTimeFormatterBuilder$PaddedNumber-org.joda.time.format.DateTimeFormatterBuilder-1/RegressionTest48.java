import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest48 {

    public static boolean debug = false;

    @Test
    public void test24001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24001");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendLiteral("en_US");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYear(24, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatterBuilder13.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendText(dateTimeFieldType15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendLiteral('x');
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatterBuilder19.toParser();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dateTimeParser20.parseInto(dateTimeParserBucket21, "\u610f\u5927\u5229\u6587", 2100000);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2099996");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeParser20);
    }

    @Test
    public void test24002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24002");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withChronology(chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withChronology(chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long16 = dateTimeZone12.convertLocalToUTC((-1L), false, 0L);
        long long18 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 100);
        java.lang.String str20 = dateTimeZone12.getShortName((long) (-1));
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.util.Locale locale23 = java.util.Locale.CHINESE;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        java.util.Set<java.lang.Character> charSet25 = locale23.getExtensionKeys();
        java.lang.String str26 = dateTimeZone12.getName(32L, locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter9.withZone(dateTimeZone12);
        java.util.Locale locale28 = java.util.Locale.CHINESE;
        java.util.Locale locale29 = java.util.Locale.CHINESE;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.lang.String str32 = locale29.getExtension('a');
        java.lang.String str33 = locale29.toLanguageTag();
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder36 = builder34.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder38 = builder34.setRegion("US");
        java.util.Locale locale40 = new java.util.Locale("zh");
        java.util.Locale.Builder builder41 = builder38.setLocale(locale40);
        java.lang.String str42 = locale29.getDisplayName(locale40);
        java.lang.String str43 = locale29.getVariant();
        java.util.Locale locale46 = new java.util.Locale("", "English (United States)");
        java.lang.String str47 = locale29.getDisplayVariant(locale46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter9.withLocale(locale29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter48.withDefaultYear((int) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter50.withDefaultYear(66);
        boolean boolean53 = dateTimeFormatter52.isParser();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-101L) + "'", long16 == (-101L));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charSet25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh" + "'", str33, "zh");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertEquals(locale40.toString(), "zh");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e2d\u6587" + "'", str42, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals(locale46.toString(), "_ENGLISH (UNITED STATES)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test24003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24003");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatterBuilder5.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZoneUTC();
        java.lang.Integer int9 = dateTimeFormatter6.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter6.getParser();
        boolean boolean11 = dateTimeFormatter6.isPrinter();
        boolean boolean12 = dateTimeFormatter6.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 115200127);
        boolean boolean15 = dateTimeFormatter6.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = dateTimeFormatter6.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter6.withOffsetParsed();
        boolean boolean18 = dateTimeFormatter17.isParser();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(dateTimeParser10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimePrinter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test24004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24004");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.toLanguageTag();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale5 = locale0.stripExtensions();
        java.lang.String str6 = locale5.getLanguage();
        java.lang.String str7 = locale5.getDisplayCountry();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap9 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendTimeZoneShortName(strMap9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder8.appendText(dateTimeFieldType11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatterBuilder13.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatter14.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withZone(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long25 = dateTimeZone21.convertLocalToUTC((-1L), false, 0L);
        long long27 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, (long) 100);
        java.lang.String str29 = dateTimeZone21.getShortName((long) (-1));
        java.util.Locale.Category category31 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale32 = java.util.Locale.KOREAN;
        java.lang.String str33 = locale32.getISO3Language();
        java.util.Locale.setDefault(category31, locale32);
        java.lang.String str35 = dateTimeZone21.getShortName(97L, locale32);
        java.util.Locale locale36 = java.util.Locale.US;
        java.lang.String str37 = locale36.getDisplayScript();
        java.lang.String str38 = locale36.toLanguageTag();
        java.util.Locale locale39 = java.util.Locale.US;
        java.lang.String str40 = locale36.getDisplayName(locale39);
        java.lang.String str41 = locale39.getISO3Language();
        java.lang.String str42 = locale39.getCountry();
        java.lang.String str43 = locale32.getDisplayVariant(locale39);
        java.util.Locale locale44 = java.util.Locale.US;
        java.util.Locale locale45 = java.util.Locale.CHINESE;
        java.util.Locale locale46 = java.util.Locale.CHINESE;
        java.lang.String str47 = locale45.getDisplayVariant(locale46);
        boolean boolean48 = locale45.hasExtensions();
        java.lang.String str49 = locale45.getScript();
        java.lang.String str50 = locale44.getDisplayCountry(locale45);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.util.Locale locale52 = java.util.Locale.CHINESE;
        java.util.Locale locale53 = java.util.Locale.CHINESE;
        java.lang.String str54 = locale52.getDisplayVariant(locale53);
        java.lang.String str55 = locale52.getDisplayLanguage();
        java.util.Locale locale56 = java.util.Locale.CHINESE;
        java.util.Locale locale57 = java.util.Locale.CHINESE;
        java.lang.String str58 = locale56.getDisplayVariant(locale57);
        java.lang.String str59 = locale52.getDisplayLanguage(locale57);
        java.lang.String str60 = locale51.getDisplayLanguage(locale52);
        java.lang.String str61 = locale45.getDisplayVariant(locale51);
        java.lang.String str62 = locale32.getDisplayVariant(locale51);
        java.util.Locale.Builder builder63 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder65 = builder63.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale locale66 = java.util.Locale.US;
        java.lang.String str67 = locale66.getDisplayVariant();
        java.lang.String str68 = locale66.getDisplayLanguage();
        java.util.Locale.Builder builder69 = builder63.setLocale(locale66);
        java.util.Locale locale70 = builder69.build();
        java.lang.String str71 = locale70.getDisplayScript();
        java.lang.String str72 = locale51.getDisplayLanguage(locale70);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter14.withLocale(locale70);
        java.lang.String str74 = locale5.getDisplayScript(locale70);
        java.lang.String str75 = locale70.getDisplayVariant();
        java.util.Locale.Category category76 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale77 = java.util.Locale.getDefault(category76);
        java.lang.String str78 = locale77.getISO3Country();
        java.lang.String str79 = locale70.getDisplayScript(locale77);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-US" + "'", str2, "en-US");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u7f8e\u56fd" + "'", str7, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeParser15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-101L) + "'", long25 == (-101L));
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.100" + "'", str29, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + category31 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category31.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "kor" + "'", str33, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.100" + "'", str35, "+00:00:00.100");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en-US" + "'", str38, "en-US");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "English (United States)" + "'", str40, "English (United States)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "eng" + "'", str41, "eng");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "US" + "'", str42, "US");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\u7f8e\u56fd" + "'", str50, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str55, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\u4e2d\u6587" + "'", str59, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\u5fb7\u6587" + "'", str60, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\uc601\uc5b4" + "'", str68, "\uc601\uc5b4");
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "German" + "'", str72, "German");
        org.junit.Assert.assertNotNull(dateTimeFormatter73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + category76 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category76.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test24005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24005");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Italy");
    }

    @Test
    public void test24006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24006");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendHourOfDay((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder7.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendFractionOfMinute(24, 360000000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder14.appendTimeZoneShortName();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap19 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder14.appendTimeZoneName(strMap19);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder14.appendPattern("014000000000000+00:002");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendSecondOfDay(160);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
    }

    @Test
    public void test24007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24007");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("JPN");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test24008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24008");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendTwoDigitWeekyear((int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap15 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendTimeZoneShortName(strMap15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str18 = dateTimeFieldType17.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder16.appendDecimal(dateTimeFieldType17, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap22 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendTimeZoneName(strMap22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder21.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder25.appendFractionOfDay(0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder28.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendHourOfHalfday(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder31.appendMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder31.appendSignedDecimal(dateTimeFieldType34, 24, (int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder37.appendSignedDecimal(dateTimeFieldType38, 24, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder13.appendText(dateTimeFieldType38);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder13.appendFractionOfHour((int) (short) 0, 21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder13.appendDayOfYear(71);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap49 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder48.appendTimeZoneShortName(strMap49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType52 = dateTimeFieldType51.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder48.appendText(dateTimeFieldType51);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap54 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder48.appendTimeZoneShortName(strMap54);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder55.appendLiteral("en_US");
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType59 = dateTimeFieldType58.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder57.appendDecimal(dateTimeFieldType58, 360000000, 2000);
        java.lang.String str63 = dateTimeFieldType58.toString();
        org.joda.time.DurationFieldType durationFieldType64 = dateTimeFieldType58.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder13.appendDecimal(dateTimeFieldType58, (int) (short) 10, 60175);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder70 = dateTimeFormatterBuilder67.appendWeekyear((int) '#', 442800324);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "dayOfYear" + "'", str18, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "weekOfWeekyear" + "'", str63, "weekOfWeekyear");
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder70);
    }

    @Test
    public void test24009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24009");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        boolean boolean4 = locale1.hasExtensions();
        java.lang.String str5 = locale1.getScript();
        java.lang.String str6 = locale0.getDisplayCountry(locale1);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale8.getDisplayLanguage();
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.lang.String str14 = locale12.getDisplayVariant(locale13);
        java.lang.String str15 = locale8.getDisplayLanguage(locale13);
        java.lang.String str16 = locale7.getDisplayLanguage(locale8);
        java.lang.String str17 = locale1.getDisplayVariant(locale7);
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.util.Set<java.lang.Character> charSet21 = locale19.getExtensionKeys();
        java.lang.String str22 = locale1.getDisplayScript(locale19);
        java.lang.String str23 = locale1.getISO3Language();
        java.util.Set<java.lang.Character> charSet24 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u7f8e\u56fd" + "'", str6, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str11, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u5fb7\u6587" + "'", str16, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zho" + "'", str23, "zho");
        org.junit.Assert.assertNotNull(charSet24);
    }

    @Test
    public void test24010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24010");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFractionOfDay(0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendHourOfHalfday(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder17.appendSignedDecimal(dateTimeFieldType20, 24, (int) 'x');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatterBuilder23.toFormatter();
        java.lang.Appendable appendable25 = null;
        org.joda.time.ReadablePartial readablePartial26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter24.printTo(appendable25, readablePartial26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
    }

    @Test
    public void test24011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24011");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendHourOfDay((int) (short) 10);
        boolean boolean14 = dateTimeFormatterBuilder13.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendMillisOfDay(115200000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendClockhourOfDay(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder23.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap29 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder28.appendTimeZoneShortName(strMap29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str32 = dateTimeFieldType31.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder30.appendDecimal(dateTimeFieldType31, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder27.appendText(dateTimeFieldType31);
        org.joda.time.format.DateTimePrinter dateTimePrinter37 = dateTimeFormatterBuilder36.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder22.append(dateTimePrinter37);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder16.append(dateTimePrinter37);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder39.appendTimeZoneId();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "dayOfYear" + "'", str32, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimePrinter37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
    }

    @Test
    public void test24012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24012");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear((-1), true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendTwoDigitYear((int) (short) 10, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendPattern("zh");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendSecondOfMinute(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendMillisOfSecond(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendEraText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatterBuilder10.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder10.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder15.appendTwoDigitYear(579, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendTwoDigitYear(442800000, true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
    }

    @Test
    public void test24013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24013");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.getDisplayVariant();
        java.lang.String str6 = locale4.getDisplayLanguage();
        java.util.Locale.Builder builder7 = builder1.setLocale(locale4);
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.PRC;
        java.lang.String str11 = locale10.getDisplayVariant();
        java.lang.String str12 = locale10.toLanguageTag();
        java.util.Locale locale14 = new java.util.Locale("zh");
        java.lang.String str15 = locale14.getDisplayCountry();
        java.lang.String str16 = locale10.getDisplayScript(locale14);
        java.util.Locale.setDefault(category0, locale10);
        boolean boolean18 = locale10.hasExtensions();
        java.lang.String str19 = locale10.getVariant();
        java.util.Locale.setDefault(locale10);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\uc601\uc5b4" + "'", str6, "\uc601\uc5b4");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test24014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24014");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.US;
        java.lang.String str4 = locale3.getDisplayScript();
        java.lang.String str5 = locale3.toLanguageTag();
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Locale locale11 = java.util.Locale.US;
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale10, locale11 };
        java.util.ArrayList<java.util.Locale> localeList13 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList13, localeArray12);
        java.util.List<java.util.Locale> localeList15 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Locale[] localeArray21 = new java.util.Locale[] { locale19, locale20 };
        java.util.ArrayList<java.util.Locale> localeList22 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList22, localeArray21);
        java.util.List<java.util.Locale> localeList24 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList22);
        java.util.Locale locale25 = java.util.Locale.US;
        java.lang.String str26 = locale25.getDisplayVariant();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale25, locale27, locale28 };
        java.util.ArrayList<java.util.Locale> localeList30 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList30, localeArray29);
        java.util.Locale locale32 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList36);
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList36);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.util.Locale locale44 = java.util.Locale.US;
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale43, locale44 };
        java.util.ArrayList<java.util.Locale> localeList46 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList46, localeArray45);
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList46);
        java.util.Locale locale49 = java.util.Locale.US;
        java.lang.String str50 = locale49.getDisplayVariant();
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.util.Locale[] localeArray53 = new java.util.Locale[] { locale49, locale51, locale52 };
        java.util.ArrayList<java.util.Locale> localeList54 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList54, localeArray53);
        java.util.Locale locale56 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList54);
        java.util.Locale.FilteringMode filteringMode57 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList58 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList54, filteringMode57);
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet6, filteringMode57);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap60 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList61 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap60);
        java.util.Locale locale63 = new java.util.Locale("Chinese");
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList65 = java.util.Locale.filterTags(languageRangeList61, (java.util.Collection<java.lang.String>) strSet64);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList67 = java.util.Locale.LanguageRange.parse("English");
        java.util.Locale.LanguageRange[] languageRangeArray68 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList69 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList69, languageRangeArray68);
        java.util.Locale locale71 = java.util.Locale.getDefault();
        java.util.Locale locale72 = java.util.Locale.US;
        java.util.Locale[] localeArray73 = new java.util.Locale[] { locale71, locale72 };
        java.util.ArrayList<java.util.Locale> localeList74 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList74, localeArray73);
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList69, (java.util.Collection<java.util.Locale>) localeList74);
        java.util.Locale locale77 = java.util.Locale.US;
        java.lang.String str78 = locale77.getDisplayVariant();
        java.util.Locale locale79 = java.util.Locale.getDefault();
        java.util.Locale locale80 = java.util.Locale.getDefault();
        java.util.Locale[] localeArray81 = new java.util.Locale[] { locale77, locale79, locale80 };
        java.util.ArrayList<java.util.Locale> localeList82 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList82, localeArray81);
        java.util.Locale locale84 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList69, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.Locale locale85 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet86 = locale85.getUnicodeLocaleAttributes();
        java.lang.String str87 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList69, (java.util.Collection<java.lang.String>) strSet86);
        java.util.Locale.FilteringMode filteringMode88 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags(languageRangeList67, (java.util.Collection<java.lang.String>) strSet86, filteringMode88);
        java.lang.String str90 = java.util.Locale.lookupTag(languageRangeList61, (java.util.Collection<java.lang.String>) strSet86);
        java.util.Collection<java.util.Locale> localeCollection91 = null;
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter(languageRangeList61, localeCollection91);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en-US" + "'", str5, "en-US");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(localeList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(localeList24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(localeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(localeList48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(localeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(locale56);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode57.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList58);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(languageRangeList61);
        org.junit.Assert.assertEquals(locale63.toString(), "chinese");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(languageRangeList67);
        org.junit.Assert.assertNotNull(languageRangeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(localeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(locale84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + filteringMode88 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode88.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertNotNull(localeList92);
    }

    @Test
    public void test24015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24015");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder4 = builder0.setRegion("US");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.addUnicodeLocaleAttribute("English");
        java.util.Locale.Builder builder8 = builder4.clear();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale.Builder builder10 = builder8.clear();
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder13 = builder10.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder10.removeUnicodeLocaleAttribute("\uae08");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: +32:002+32:00en_us000000000000000000001970??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test24016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24016");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendYear(58, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendLiteral("hi!");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendEraText();
        dateTimeFormatterBuilder0.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendTimeZoneId();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
    }

    @Test
    public void test24017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24017");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap4 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendTimeZoneShortName(strMap4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendText(dateTimeFieldType6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder2.appendShortText(dateTimeFieldType6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder2.appendLiteral('a');
        boolean boolean12 = dateTimeFormatterBuilder11.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendMonthOfYear(60000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatterBuilder16.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendDayOfYear(1440106);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test24018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24018");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale1.getDisplayScript();
        java.lang.String str3 = locale1.toLanguageTag();
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale1.getDisplayName(locale4);
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        java.lang.String str7 = locale1.getDisplayLanguage(locale6);
        java.lang.String str8 = locale6.getDisplayScript();
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        int int14 = dateTimeFormatter13.getDefaultYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withChronology(chronology15);
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withLocale(locale18);
        java.lang.String str21 = locale10.getDisplayScript(locale18);
        java.lang.String str22 = locale18.getVariant();
        java.util.Locale.setDefault(category0, locale18);
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        int int27 = dateTimeFormatter26.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeFormatter26.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter26.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter26.withPivotYear((java.lang.Integer) 24);
        java.util.Locale.Category category33 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.lang.String str35 = locale34.getISO3Language();
        java.util.Locale.setDefault(category33, locale34);
        java.util.Locale.Builder builder37 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder39 = builder37.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale locale40 = java.util.Locale.US;
        java.lang.String str41 = locale40.getDisplayVariant();
        java.lang.String str42 = locale40.getDisplayLanguage();
        java.util.Locale.Builder builder43 = builder37.setLocale(locale40);
        java.util.Locale locale44 = java.util.Locale.JAPAN;
        java.lang.String str45 = locale44.getDisplayVariant();
        java.lang.String str46 = locale40.getDisplayScript(locale44);
        java.lang.String str47 = locale34.getDisplayName(locale44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter26.withLocale(locale34);
        java.util.Set<java.lang.Character> charSet49 = locale34.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale34);
        java.util.Locale locale51 = java.util.Locale.CHINESE;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        long long58 = dateTimeZone54.convertLocalToUTC((-1L), false, 0L);
        long long60 = dateTimeZone52.getMillisKeepLocal(dateTimeZone54, (long) 100);
        java.lang.String str62 = dateTimeZone54.getShortName((long) (-1));
        java.util.Locale.Category category64 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale65 = java.util.Locale.KOREAN;
        java.lang.String str66 = locale65.getISO3Language();
        java.util.Locale.setDefault(category64, locale65);
        java.lang.String str68 = dateTimeZone54.getShortName(97L, locale65);
        java.lang.String str69 = locale51.getDisplayScript(locale65);
        java.util.Locale.setDefault(category0, locale51);
        java.lang.String str71 = locale51.getDisplayCountry();
        java.lang.String str72 = locale51.toLanguageTag();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-US" + "'", str3, "en-US");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English (United States)" + "'", str5, "English (United States)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u82f1\u8a9e" + "'", str7, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2000 + "'", int27 == 2000);
        org.junit.Assert.assertNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category33.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "kor" + "'", str35, "kor");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\uc601\uc5b4" + "'", str42, "\uc601\uc5b4");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u97d3\u56fd\u8a9e" + "'", str47, "\u97d3\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTimeZone54);
// flaky:         org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-101L) + "'", long58 == (-101L));
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "+00:00:00.100" + "'", str62, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + category64 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category64.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "kor" + "'", str66, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "+00:00:00.100" + "'", str68, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "zh" + "'", str72, "zh");
    }

    @Test
    public void test24019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24019");
        java.io.IOException iOException1 = new java.io.IOException("\u65e5\u672c\u8a9e\u65e5\u672c)");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException6 = new java.io.IOException("dayOfYear");
        java.io.IOException iOException7 = new java.io.IOException("und", (java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("CN", (java.lang.Throwable) iOException6);
        iOException2.addSuppressed((java.lang.Throwable) iOException6);
    }

    @Test
    public void test24020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24020");
        java.util.Locale locale2 = new java.util.Locale("minuteofhour (IT-IT)", "ja-JP");
        java.lang.String str3 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "minuteofhour (it-it)_JA-JP");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test24021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24021");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException3 = new java.io.IOException("eng", (java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException7 = new java.io.IOException("hi!");
        java.lang.Throwable throwable10 = null;
        java.io.IOException iOException11 = new java.io.IOException(throwable10);
        java.io.IOException iOException12 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException("eng", (java.lang.Throwable) iOException12);
        iOException7.addSuppressed((java.lang.Throwable) iOException13);
        java.io.IOException iOException15 = new java.io.IOException("", (java.lang.Throwable) iOException7);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException15);
        java.lang.Throwable throwable20 = null;
        java.io.IOException iOException21 = new java.io.IOException(throwable20);
        java.io.IOException iOException22 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException21);
        java.io.IOException iOException23 = new java.io.IOException("eng", (java.lang.Throwable) iOException22);
        java.lang.Throwable[] throwableArray24 = iOException22.getSuppressed();
        java.io.IOException iOException25 = new java.io.IOException("en-US", (java.lang.Throwable) iOException22);
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) iOException25);
        iOException15.addSuppressed((java.lang.Throwable) iOException25);
        iOException4.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException34 = new java.io.IOException("");
        java.io.IOException iOException35 = new java.io.IOException("\uc601\uc5b4", (java.lang.Throwable) iOException34);
        java.io.IOException iOException36 = new java.io.IOException("dayOfYear", (java.lang.Throwable) iOException35);
        java.io.IOException iOException40 = new java.io.IOException("");
        java.io.IOException iOException41 = new java.io.IOException("\uc601\uc5b4", (java.lang.Throwable) iOException40);
        java.io.IOException iOException42 = new java.io.IOException("dayOfYear", (java.lang.Throwable) iOException41);
        iOException35.addSuppressed((java.lang.Throwable) iOException41);
        java.lang.Throwable throwable46 = null;
        java.io.IOException iOException47 = new java.io.IOException(throwable46);
        java.io.IOException iOException48 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException47);
        java.io.IOException iOException49 = new java.io.IOException("eng", (java.lang.Throwable) iOException48);
        java.lang.Throwable throwable50 = null;
        java.io.IOException iOException51 = new java.io.IOException(throwable50);
        java.lang.Throwable throwable53 = null;
        java.io.IOException iOException54 = new java.io.IOException(throwable53);
        java.io.IOException iOException55 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException54);
        iOException51.addSuppressed((java.lang.Throwable) iOException54);
        java.io.IOException iOException58 = new java.io.IOException("hi!");
        java.lang.Throwable throwable61 = null;
        java.io.IOException iOException62 = new java.io.IOException(throwable61);
        java.io.IOException iOException63 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException62);
        java.io.IOException iOException64 = new java.io.IOException("eng", (java.lang.Throwable) iOException63);
        iOException58.addSuppressed((java.lang.Throwable) iOException64);
        iOException51.addSuppressed((java.lang.Throwable) iOException58);
        iOException48.addSuppressed((java.lang.Throwable) iOException58);
        java.lang.Throwable throwable71 = null;
        java.io.IOException iOException72 = new java.io.IOException(throwable71);
        java.io.IOException iOException73 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException72);
        java.io.IOException iOException74 = new java.io.IOException("eng", (java.lang.Throwable) iOException73);
        java.io.IOException iOException75 = new java.io.IOException("ko", (java.lang.Throwable) iOException73);
        java.lang.Throwable throwable76 = null;
        java.io.IOException iOException77 = new java.io.IOException(throwable76);
        java.lang.Throwable[] throwableArray78 = iOException77.getSuppressed();
        iOException75.addSuppressed((java.lang.Throwable) iOException77);
        iOException58.addSuppressed((java.lang.Throwable) iOException77);
        iOException35.addSuppressed((java.lang.Throwable) iOException77);
        java.io.IOException iOException82 = new java.io.IOException("US", (java.lang.Throwable) iOException35);
        java.io.IOException iOException83 = new java.io.IOException("+00:00:00.01042", (java.lang.Throwable) iOException35);
        iOException4.addSuppressed((java.lang.Throwable) iOException35);
        java.io.IOException iOException86 = new java.io.IOException("English (United States)");
        java.io.IOException iOException87 = new java.io.IOException((java.lang.Throwable) iOException86);
        java.io.IOException iOException88 = new java.io.IOException((java.lang.Throwable) iOException87);
        iOException4.addSuppressed((java.lang.Throwable) iOException87);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray78);
    }

    @Test
    public void test24022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24022");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendYearOfEra(10, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder6.appendWeekOfWeekyear((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendLiteral('x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendFractionOfDay((int) ' ', (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder13.appendCenturyOfEra(0, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendTwoDigitWeekyear((-237), true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test24023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24023");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) 'x');
        boolean boolean5 = dateTimeFormatterBuilder4.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendDayOfMonth(151);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendDayOfWeekShortText();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder7.toPrinter();
        int int10 = dateTimePrinter9.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap12 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendTimeZoneShortName(strMap12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str15 = dateTimeFieldType14.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder13.appendDecimal(dateTimeFieldType14, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap19 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendTimeZoneName(strMap19);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder18.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder18.appendHourOfHalfday((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendClockhourOfHalfday((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder26.appendFractionOfDay(24, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder29.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeParser dateTimeParser31 = dateTimeFormatterBuilder29.toParser();
        int int32 = dateTimeParser31.estimateParsedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser31);
        boolean boolean34 = dateTimeFormatter33.isOffsetParsed();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter33.withChronology(chronology35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 278 + "'", int10 == 278);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "dayOfYear" + "'", str15, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeParser31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 56 + "'", int32 == 56);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
    }

    @Test
    public void test24024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24024");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder11.appendClockhourOfHalfday((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder16.appendYearOfEra(13, 115200133);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder19.appendTimeZoneName();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test24025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24025");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendTwoDigitYear(2000, false);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = dateTimeFormatterBuilder10.toPrinter();
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.ReadablePartial readablePartial13 = null;
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder14.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale locale17 = java.util.Locale.US;
        java.lang.String str18 = locale17.getDisplayVariant();
        java.lang.String str19 = locale17.getDisplayLanguage();
        java.util.Locale.Builder builder20 = builder14.setLocale(locale17);
        java.util.Locale.Builder builder23 = builder14.setExtension('a', "English");
        java.util.Locale.Builder builder24 = builder23.clearExtensions();
        java.util.Locale.Builder builder25 = builder23.clearExtensions();
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder28 = builder26.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder29 = builder28.clear();
        java.util.Locale locale30 = builder28.build();
        java.util.Locale.Builder builder31 = builder25.setLocale(locale30);
        java.util.Locale locale32 = builder25.build();
        java.util.Locale.Builder builder33 = builder25.clearExtensions();
        java.util.Locale.Builder builder34 = builder25.clear();
        java.util.Locale.Builder builder37 = builder25.setExtension('u', "en_CA");
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        java.util.Locale locale39 = java.util.Locale.CHINESE;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        java.lang.String str41 = locale38.getDisplayLanguage();
        java.util.Locale.Builder builder42 = builder25.setLocale(locale38);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter11.printTo(stringBuffer12, readablePartial13, locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimePrinter11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u82f1\u6587" + "'", str19, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u4e2d\u6587" + "'", str41, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test24026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24026");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition(0L);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long9 = dateTimeZone5.convertLocalToUTC((-1L), false, 0L);
        long long11 = dateTimeZone3.getMillisKeepLocal(dateTimeZone5, (long) 100);
        java.lang.String str13 = dateTimeZone5.getName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        long long16 = dateTimeZone5.convertUTCToLocal((-322079965L));
        boolean boolean17 = dateTimeZone0.equals((java.lang.Object) dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long24 = dateTimeZone20.convertLocalToUTC((-1L), false, 0L);
        long long26 = dateTimeZone18.getMillisKeepLocal(dateTimeZone20, (long) 100);
        java.lang.String str28 = dateTimeZone20.getName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        long long31 = dateTimeZone20.convertUTCToLocal((-322079965L));
        int int33 = dateTimeZone20.getOffset((long) '#');
        long long35 = dateTimeZone0.getMillisKeepLocal(dateTimeZone20, 2000L);
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = null;
        org.joda.time.format.DateTimeParser dateTimeParser37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter36, dateTimeParser37);
        int int39 = dateTimeFormatter38.getDefaultYear();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter38.withChronology(chronology40);
        boolean boolean42 = dateTimeFormatter38.isOffsetParsed();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter38.withChronology(chronology43);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long48 = dateTimeZone46.nextTransition((long) 2000);
        long long52 = dateTimeZone46.convertLocalToUTC((-359999900L), true, (-322079965L));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter44.withZone(dateTimeZone46);
        long long55 = dateTimeZone0.getMillisKeepLocal(dateTimeZone46, 360000001L);
        java.util.TimeZone timeZone56 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        long long61 = dateTimeZone57.convertLocalToUTC((-1L), false, 0L);
        int int63 = dateTimeZone57.getStandardOffset(1L);
        long long65 = dateTimeZone57.previousTransition((long) (short) 0);
        java.lang.String str67 = dateTimeZone57.getShortName((-1L));
        boolean boolean69 = dateTimeZone57.isStandardOffset((long) (-1));
        long long71 = dateTimeZone46.getMillisKeepLocal(dateTimeZone57, 360000097L);
        java.lang.String str72 = dateTimeZone57.getID();
        java.lang.String str74 = dateTimeZone57.getShortName((-37920020L));
        java.lang.String str76 = dateTimeZone57.getNameKey((long) 98);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-101L) + "'", long9 == (-101L));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-322079865L) + "'", long16 == (-322079865L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-101L) + "'", long24 == (-101L));
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-322079865L) + "'", long31 == (-322079865L));
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1900L + "'", long35 == 1900L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2000 + "'", int39 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 2000L + "'", long48 == 2000L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-360000000L) + "'", long52 == (-360000000L));
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 359999901L + "'", long55 == 359999901L);
        org.junit.Assert.assertNotNull(dateTimeZone57);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-101L) + "'", long61 == (-101L));
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+00:00:00.100" + "'", str67, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long71 + "' != '" + 360000097L + "'", long71 == 360000097L);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "+00:00:00.100" + "'", str72, "+00:00:00.100");
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "+00:00:00.100" + "'", str74, "+00:00:00.100");
// flaky:         org.junit.Assert.assertNull(str76);
    }

    @Test
    public void test24027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24027");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.lang.String str6 = locale5.getISO3Language();
        java.util.Locale.setDefault(category4, locale5);
        java.util.Locale locale8 = java.util.Locale.getDefault(category4);
        java.util.Locale.Builder builder9 = builder0.setLocale(locale8);
        java.util.Locale.Builder builder11 = builder0.addUnicodeLocaleAttribute("und");
        java.util.Locale.Builder builder12 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder0.addUnicodeLocaleAttribute("Italian (Italy)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Italian (Italy) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "kor" + "'", str6, "kor");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test24028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24028");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendHourOfHalfday((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder7.appendMinuteOfDay((int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder7.appendTwoDigitWeekyear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatterBuilder7.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap23 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendTimeZoneShortName(strMap23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder22.appendText(dateTimeFieldType25);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder21.appendShortText(dateTimeFieldType25);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder21.appendYearOfEra(0, (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder21.appendDayOfWeekText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap33 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder21.appendTimeZoneName(strMap33);
        org.joda.time.format.DateTimePrinter dateTimePrinter35 = dateTimeFormatterBuilder34.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder7.append(dateTimePrinter35);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder36.appendMonthOfYearShortText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimePrinter35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
    }

    @Test
    public void test24029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24029");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder3.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str9 = dateTimeFieldType8.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendDecimal(dateTimeFieldType8, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder4.appendText(dateTimeFieldType8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendClockhourOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap18 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendTimeZoneShortName(strMap18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str21 = dateTimeFieldType20.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder19.appendDecimal(dateTimeFieldType20, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap25 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendTimeZoneName(strMap25);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder24.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder28.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder28.appendClockhourOfHalfday((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder28.appendLiteral("\u4e2d\u6587");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder28.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap37 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendTimeZoneShortName(strMap37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str40 = dateTimeFieldType39.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder38.appendDecimal(dateTimeFieldType39, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap44 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendTimeZoneName(strMap44);
        boolean boolean46 = dateTimeFormatterBuilder43.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder43.appendMinuteOfHour((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder43.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap52 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder51.appendTimeZoneShortName(strMap52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType55 = dateTimeFieldType54.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder51.appendText(dateTimeFieldType54);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder51.appendMonthOfYearText();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str59 = dateTimeFieldType58.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder57.appendFixedDecimal(dateTimeFieldType58, (int) (short) 10);
        org.joda.time.Chronology chronology62 = null;
        boolean boolean63 = dateTimeFieldType58.isSupported(chronology62);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder50.appendSignedDecimal(dateTimeFieldType58, (int) (short) 10, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder35.appendShortText(dateTimeFieldType58);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder16.appendText(dateTimeFieldType58);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder70 = dateTimeFormatterBuilder68.appendClockhourOfDay((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder72 = dateTimeFormatterBuilder68.appendHourOfDay(2192);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder77 = dateTimeFormatterBuilder72.appendTimeZoneOffset("", true, 97, (-432060001));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dayOfYear" + "'", str9, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "dayOfYear" + "'", str21, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "dayOfYear" + "'", str40, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "dayOfYear" + "'", str59, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder70);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder72);
    }

    @Test
    public void test24030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24030");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear((-1), true);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendCenturyOfEra(175, 579);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendSecondOfDay(36000045);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder6.appendWeekOfWeekyear(35);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendMinuteOfDay(0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
    }

    @Test
    public void test24031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24031");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendClockhourOfDay((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder1.appendClockhourOfDay(2000);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendTwoDigitYear((-1), true);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendFixedDecimal(dateTimeFieldType11, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap20 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendTimeZoneShortName(strMap20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str23 = dateTimeFieldType22.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder21.appendDecimal(dateTimeFieldType22, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder18.appendText(dateTimeFieldType22);
        org.joda.time.format.DateTimePrinter dateTimePrinter28 = dateTimeFormatterBuilder27.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap30 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendTimeZoneShortName(strMap30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType32.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder29.appendText(dateTimeFieldType32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatterBuilder34.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser36 = dateTimeFormatter35.getParser();
        int int37 = dateTimeParser36.estimateParsedLength();
        int int38 = dateTimeParser36.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = null;
        int int42 = dateTimeParser36.parseInto(dateTimeParserBucket39, "en_US", (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap44 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendTimeZoneShortName(strMap44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str47 = dateTimeFieldType46.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder45.appendDecimal(dateTimeFieldType46, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser51 = dateTimeFormatterBuilder45.toParser();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray52 = new org.joda.time.format.DateTimeParser[] { dateTimeParser36, dateTimeParser51 };
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder13.append(dateTimePrinter28, dateTimeParserArray52);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder1.append(dateTimePrinter6, dateTimeParserArray52);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder1.appendLiteral('a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder56.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder57.appendYearOfEra(442800000, 39120000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap62 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder61.appendTimeZoneShortName(strMap62);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str65 = dateTimeFieldType64.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder63.appendDecimal(dateTimeFieldType64, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap69 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder70 = dateTimeFormatterBuilder68.appendTimeZoneName(strMap69);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder72 = dateTimeFormatterBuilder68.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder74 = dateTimeFormatterBuilder68.appendHourOfDay((int) (short) 10);
        boolean boolean75 = dateTimeFormatterBuilder74.canBuildFormatter();
        org.joda.time.format.DateTimePrinter dateTimePrinter76 = dateTimeFormatterBuilder74.toPrinter();
        int int77 = dateTimePrinter76.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder78 = dateTimeFormatterBuilder60.append(dateTimePrinter76);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder80 = dateTimeFormatterBuilder78.appendHourOfHalfday(22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder82 = dateTimeFormatterBuilder80.appendMonthOfYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder83 = dateTimeFormatterBuilder80.appendTimeZoneShortName();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "dayOfYear" + "'", str23, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimePrinter28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeParser36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 24 + "'", int37 == 24);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 24 + "'", int38 == 24);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "dayOfYear" + "'", str47, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeParser51);
        org.junit.Assert.assertNotNull(dateTimeParserArray52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "dayOfYear" + "'", str65, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder70);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder72);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(dateTimePrinter76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 132 + "'", int77 == 132);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder78);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder80);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder82);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder83);
    }

    @Test
    public void test24032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24032");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 0);
        java.util.Locale locale11 = java.util.Locale.PRC;
        boolean boolean12 = locale11.hasExtensions();
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.lang.String str14 = locale11.getDisplayScript(locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter6.withLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter15.print(320639999L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test24033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24033");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withChronology(chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter5.withZone(dateTimeZone11);
        boolean boolean13 = dateTimeFormatter5.isPrinter();
        org.joda.time.Chronology chronology14 = dateTimeFormatter5.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter5.withPivotYear((int) 'u');
        boolean boolean19 = dateTimeFormatter18.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale22 = java.util.Locale.US;
        java.lang.String str23 = locale22.getDisplayScript();
        java.lang.String str24 = locale22.toLanguageTag();
        java.util.Locale locale25 = java.util.Locale.US;
        java.lang.String str26 = locale22.getDisplayName(locale25);
        java.util.Locale locale27 = java.util.Locale.JAPANESE;
        java.lang.String str28 = locale22.getDisplayLanguage(locale27);
        java.lang.String str29 = locale27.toLanguageTag();
        java.lang.String str30 = dateTimeZone20.getShortName((long) ' ', locale27);
        java.lang.String str31 = dateTimeZone20.getID();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long37 = dateTimeZone33.convertLocalToUTC((long) '4', false, (long) (short) 100);
        long long39 = dateTimeZone33.convertUTCToLocal(1L);
        long long41 = dateTimeZone20.getMillisKeepLocal(dateTimeZone33, 397920000L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter18.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology43 = dateTimeFormatter18.getChronology();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en-US" + "'", str24, "en-US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "English (United States)" + "'", str26, "English (United States)");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u82f1\u8a9e" + "'", str28, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ja" + "'", str29, "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 51L + "'", long37 == 51L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 2L + "'", long39 == 2L);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 397920099L + "'", long41 == 397920099L);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNull(chronology43);
    }

    @Test
    public void test24034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24034");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withChronology(chronology4);
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale8.toLanguageTag();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withLocale(locale8);
        java.util.Locale locale13 = dateTimeFormatter12.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withDefaultYear((-3600000));
        boolean boolean16 = dateTimeFormatter12.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter12.withPivotYear((java.lang.Integer) (-161));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTimeFormatter18.parseDateTime("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000+00:351");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh" + "'", str11, "zh");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test24035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24035");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Etats-Unis");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.util.Locale locale6 = java.util.Locale.US;
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale5, locale6 };
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.List<java.util.Locale> localeList10 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.util.Locale locale15 = java.util.Locale.US;
        java.util.Locale[] localeArray16 = new java.util.Locale[] { locale14, locale15 };
        java.util.ArrayList<java.util.Locale> localeList17 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList17, localeArray16);
        java.util.List<java.util.Locale> localeList19 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList17);
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale20.getDisplayVariant();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.util.Locale[] localeArray24 = new java.util.Locale[] { locale20, locale22, locale23 };
        java.util.ArrayList<java.util.Locale> localeList25 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList25, localeArray24);
        java.util.Locale locale27 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList25);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList31);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap35);
        java.util.Locale locale37 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleAttributes();
        java.lang.String str39 = java.util.Locale.lookupTag(languageRangeList36, (java.util.Collection<java.lang.String>) strSet38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.util.Locale locale44 = java.util.Locale.US;
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale43, locale44 };
        java.util.ArrayList<java.util.Locale> localeList46 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList46, localeArray45);
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList46);
        java.util.Locale locale49 = java.util.Locale.US;
        java.lang.String str50 = locale49.getDisplayVariant();
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.util.Locale[] localeArray53 = new java.util.Locale[] { locale49, locale51, locale52 };
        java.util.ArrayList<java.util.Locale> localeList54 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList54, localeArray53);
        java.util.Locale locale56 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList54);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        java.lang.String str62 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList60);
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        java.util.Locale locale66 = java.util.Locale.getDefault();
        java.util.Locale locale67 = java.util.Locale.US;
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale66, locale67 };
        java.util.ArrayList<java.util.Locale> localeList69 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList69, localeArray68);
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale locale72 = java.util.Locale.US;
        java.lang.String str73 = locale72.getDisplayVariant();
        java.util.Locale locale74 = java.util.Locale.getDefault();
        java.util.Locale locale75 = java.util.Locale.getDefault();
        java.util.Locale[] localeArray76 = new java.util.Locale[] { locale72, locale74, locale75 };
        java.util.ArrayList<java.util.Locale> localeList77 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList77, localeArray76);
        java.util.Locale locale79 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.Locale.FilteringMode filteringMode80 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList77, filteringMode80);
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter(languageRangeList36, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap84 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList85 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap84);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localeList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localeList19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(localeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(localeList48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(localeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(locale56);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(localeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(locale79);
        org.junit.Assert.assertTrue("'" + filteringMode80 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode80.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertNotNull(localeList82);
        org.junit.Assert.assertNotNull(localeList83);
        org.junit.Assert.assertNotNull(languageRangeList85);
    }

    @Test
    public void test24036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24036");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.lang.String str4 = locale1.getCountry();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long12 = dateTimeZone8.convertLocalToUTC((-1L), false, 0L);
        long long14 = dateTimeZone6.getMillisKeepLocal(dateTimeZone8, (long) 100);
        java.lang.String str16 = dateTimeZone8.getShortName((long) (-1));
        java.util.Locale.Category category18 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale19 = java.util.Locale.KOREAN;
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Locale.setDefault(category18, locale19);
        java.lang.String str22 = dateTimeZone8.getShortName(97L, locale19);
        java.util.Locale locale25 = new java.util.Locale("zh_TW", "Etc/UTC");
        java.lang.String str26 = locale19.getDisplayName(locale25);
        java.lang.String str27 = locale1.getDisplayName(locale25);
        java.lang.String str28 = locale25.getDisplayCountry();
        java.util.Locale.setDefault(locale25);
        java.util.Locale locale30 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimePrinter dateTimePrinter31 = null;
        org.joda.time.format.DateTimeParser dateTimeParser32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter31, dateTimeParser32);
        int int34 = dateTimeFormatter33.getDefaultYear();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter33.withChronology(chronology35);
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        java.lang.String str39 = locale37.getDisplayVariant(locale38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter36.withLocale(locale38);
        java.lang.String str41 = locale30.getDisplayScript(locale38);
        java.lang.String str42 = locale38.getVariant();
        java.util.Locale locale43 = locale38.stripExtensions();
        java.lang.String str44 = locale43.getDisplayCountry();
        java.lang.String str45 = locale43.getDisplayVariant();
        java.lang.String str46 = locale25.getDisplayVariant(locale43);
        org.joda.time.format.DateTimePrinter dateTimePrinter47 = null;
        org.joda.time.format.DateTimeParser dateTimeParser48 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter47, dateTimeParser48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter49.withChronology(chronology50);
        java.lang.Integer int52 = dateTimeFormatter51.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter51.withZoneUTC();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter53.withChronology(chronology54);
        java.util.Locale locale56 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimePrinter dateTimePrinter57 = null;
        org.joda.time.format.DateTimeParser dateTimeParser58 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter57, dateTimeParser58);
        int int60 = dateTimeFormatter59.getDefaultYear();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter59.withChronology(chronology61);
        java.util.Locale locale63 = java.util.Locale.CHINESE;
        java.util.Locale locale64 = java.util.Locale.CHINESE;
        java.lang.String str65 = locale63.getDisplayVariant(locale64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter62.withLocale(locale64);
        java.lang.String str67 = locale56.getDisplayScript(locale64);
        java.lang.String str68 = locale64.getVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter53.withLocale(locale64);
        java.util.Locale locale70 = java.util.Locale.US;
        java.lang.String str71 = locale70.getDisplayVariant();
        java.util.Locale locale72 = null;
        java.lang.String str73 = locale70.getDisplayVariant(locale72);
        java.lang.String str74 = locale70.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = dateTimeFormatter69.withLocale(locale70);
        java.util.Locale locale79 = new java.util.Locale("kor", "en_US", "\u7f8e\u56fd");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter80 = dateTimeFormatter75.withLocale(locale79);
        java.util.Locale locale81 = java.util.Locale.JAPAN;
        java.lang.String str82 = locale81.getDisplayVariant();
        java.lang.String str83 = locale81.getVariant();
        java.lang.String str84 = locale79.getDisplayVariant(locale81);
        java.lang.String str85 = locale43.getDisplayCountry(locale81);
        java.lang.String str86 = locale43.getLanguage();
        java.util.Locale locale87 = locale43.stripExtensions();
        java.lang.String str88 = locale87.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-101L) + "'", long12 == (-101L));
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category18.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "kor" + "'", str20, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertEquals(locale25.toString(), "zh_tw_ETC/UTC");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Korean" + "'", str26, "Korean");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese" + "'", str27, "Chinese");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ETC/UTC" + "'", str28, "ETC/UTC");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2000 + "'", int34 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNull(int52);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "ja");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2000 + "'", int60 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter75);
// flaky:         org.junit.Assert.assertEquals(locale79.toString(), "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(dateTimeFormatter80);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\u7f8e\u56fd" + "'", str84, "\u7f8e\u56fd");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "zh" + "'", str86, "zh");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test24037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24037");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withChronology(chronology4);
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withOffsetParsed();
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale8.toLanguageTag();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withLocale(locale8);
        boolean boolean13 = dateTimeFormatter12.isParser();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withZone(dateTimeZone15);
        org.joda.time.format.DateTimeParser dateTimeParser17 = dateTimeFormatter12.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter12.withPivotYear(66);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter12.withPivotYear((java.lang.Integer) 60042);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter12.withOffsetParsed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh" + "'", str11, "zh");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(dateTimeParser17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
    }

    @Test
    public void test24038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24038");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder3.setLanguage("en");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test24039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24039");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendHourOfHalfday((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendClockhourOfHalfday((int) (byte) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap16 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendTimeZoneShortName(strMap16);
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = dateTimeFormatterBuilder17.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder17.appendWeekyear((int) 'x', (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder17.appendTwoDigitWeekyear((-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder17.appendWeekOfWeekyear((int) (short) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = null;
        org.joda.time.format.DateTimeParser dateTimeParser27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter26, dateTimeParser27);
        int int29 = dateTimeFormatter28.getDefaultYear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter28.withChronology(chronology30);
        boolean boolean32 = dateTimeFormatter31.isParser();
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeFormatter31.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser34 = dateTimeFormatter31.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter31.withPivotYear(24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter31.withPivotYear(115200000);
        int int39 = dateTimeFormatter31.getDefaultYear();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter31.withChronology(chronology40);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder17.append(dateTimeFormatter31);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendDayOfMonth((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder43.appendMinuteOfDay(123);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimePrinter18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2000 + "'", int29 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(dateTimeZone33);
        org.junit.Assert.assertNull(dateTimeParser34);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2000 + "'", int39 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
    }

    @Test
    public void test24040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24040");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withChronology(chronology4);
        boolean boolean6 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long12 = dateTimeZone10.nextTransition((long) 2000);
        long long16 = dateTimeZone10.convertLocalToUTC((-359999900L), true, (-322079965L));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter8.withZone(dateTimeZone10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter8.withPivotYear(1440000);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter27.withChronology(chronology28);
        java.lang.Integer int30 = dateTimeFormatter29.getPivotYear();
        java.util.Locale locale31 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimePrinter dateTimePrinter32 = null;
        org.joda.time.format.DateTimeParser dateTimeParser33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter32, dateTimeParser33);
        int int35 = dateTimeFormatter34.getDefaultYear();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter34.withChronology(chronology36);
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        java.util.Locale locale39 = java.util.Locale.CHINESE;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter37.withLocale(locale39);
        java.lang.String str42 = locale31.getDisplayScript(locale39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter29.withLocale(locale39);
        java.lang.String str44 = dateTimeZone23.getShortName(0L, locale39);
        java.lang.String str46 = dateTimeZone23.getNameKey((long) ' ');
        java.lang.String str47 = dateTimeZone23.getID();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter21.withZone(dateTimeZone23);
        java.lang.StringBuffer stringBuffer49 = null;
        org.joda.time.ReadablePartial readablePartial50 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter48.printTo(stringBuffer49, readablePartial50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2000L + "'", long12 == 2000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-360000000L) + "'", long16 == (-360000000L));
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNull(int30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ja");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2000 + "'", int35 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+100:00" + "'", str44, "+100:00");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+100:00" + "'", str47, "+100:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
    }

    @Test
    public void test24041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24041");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendMinuteOfHour((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfHalfday(360000000);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withChronology(chronology13);
        java.lang.Integer int15 = dateTimeFormatter14.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter14.withPivotYear(0);
        boolean boolean18 = dateTimeFormatter17.isParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder9.append(dateTimeFormatter17);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendMonthOfYear((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder19.appendDayOfMonth((int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test24042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24042");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        boolean boolean1 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfMinute((int) (short) 1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder3.appendFractionOfMinute(10, (int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendFractionOfSecond(105, 278);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder13.appendTimeZoneOffset("+00:00:00.01042", true, 36000072, (-39));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
    }

    @Test
    public void test24043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24043");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder3.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendTimeZoneShortName(strMap6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str9 = dateTimeFieldType8.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendDecimal(dateTimeFieldType8, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder4.appendText(dateTimeFieldType8);
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatterBuilder13.toPrinter();
        int int15 = dateTimePrinter14.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap17 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendTimeZoneShortName(strMap17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder16.appendText(dateTimeFieldType19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatterBuilder21.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser23 = dateTimeFormatter22.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser23);
        int int25 = dateTimePrinter14.estimatePrintedLength();
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter27.withDefaultYear(66);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter27.withZoneUTC();
        java.io.Writer writer31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter27.printTo(writer31, readableInstant32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dayOfYear" + "'", str9, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimePrinter14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 58 + "'", int15 == 58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeParser23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 58 + "'", int25 == 58);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
    }

    @Test
    public void test24044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24044");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(10);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        java.util.Locale locale11 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale13.getDisplayVariant(locale14);
        boolean boolean16 = locale13.hasExtensions();
        java.lang.String str17 = locale13.getScript();
        java.lang.String str18 = locale11.getDisplayScript(locale13);
        java.lang.String str19 = locale11.getDisplayName();
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        boolean boolean24 = locale21.hasExtensions();
        java.lang.String str25 = locale21.getScript();
        java.lang.String str26 = locale20.getDisplayCountry(locale21);
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.util.Locale locale28 = java.util.Locale.CHINESE;
        java.util.Locale locale29 = java.util.Locale.CHINESE;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.lang.String str31 = locale28.getDisplayLanguage();
        java.util.Locale locale32 = java.util.Locale.CHINESE;
        java.util.Locale locale33 = java.util.Locale.CHINESE;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.lang.String str35 = locale28.getDisplayLanguage(locale33);
        java.lang.String str36 = locale27.getDisplayLanguage(locale28);
        java.lang.String str37 = locale21.getDisplayVariant(locale27);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        long long44 = dateTimeZone40.convertLocalToUTC((-1L), false, 0L);
        long long46 = dateTimeZone38.getMillisKeepLocal(dateTimeZone40, (long) 100);
        java.lang.String str48 = dateTimeZone40.getShortName((long) (-1));
        java.util.Locale.Category category50 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.lang.String str52 = locale51.getISO3Language();
        java.util.Locale.setDefault(category50, locale51);
        java.lang.String str54 = dateTimeZone40.getShortName(97L, locale51);
        java.util.Locale locale55 = locale51.stripExtensions();
        java.lang.String str56 = locale21.getDisplayName(locale51);
        java.lang.String str57 = locale11.getDisplayLanguage(locale21);
        java.lang.String str58 = dateTimeZone9.getName(127L, locale11);
        java.lang.String str60 = dateTimeZone9.getNameKey(397920010L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinese (Taiwan)" + "'", str19, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u7f8e\u56fd" + "'", str26, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Chinese" + "'", str31, "Chinese");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u4e2d\u6587" + "'", str35, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u5fb7\u6587" + "'", str36, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-101L) + "'", long44 == (-101L));
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00:00.100" + "'", str48, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + category50 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category50.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "kor" + "'", str52, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00:00.100" + "'", str54, "+00:00:00.100");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str56, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\u4e2d\u6587" + "'", str57, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "-00:00:00.001" + "'", str58, "-00:00:00.001");
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
    }

    @Test
    public void test24045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long5 = dateTimeZone1.convertLocalToUTC((long) '4', false, (long) (short) 100);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale7.getDisplayScript();
        java.lang.String str9 = locale7.toLanguageTag();
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = locale7.getDisplayName(locale10);
        java.util.Locale locale12 = java.util.Locale.JAPANESE;
        java.lang.String str13 = locale7.getDisplayLanguage(locale12);
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 51L + "'", long5 == 51L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en-US" + "'", str9, "en-US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English (United States)" + "'", str11, "English (United States)");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u82f1\u8a9e" + "'", str13, "\u82f1\u8a9e");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24046");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(56, 71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 71");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24047");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long6 = dateTimeZone2.convertLocalToUTC((-1L), false, 0L);
        long long8 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) 100);
        long long10 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.getDisplayScript();
        java.lang.String str14 = locale12.toLanguageTag();
        java.lang.String str15 = dateTimeZone0.getName((long) '#', locale12);
        java.lang.String str17 = dateTimeZone0.getName((long) (byte) 0);
        java.lang.String str19 = dateTimeZone0.getNameKey((long) 100);
        java.lang.String str20 = dateTimeZone0.getID();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = java.util.Locale.CHINESE;
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.lang.String str25 = locale23.getDisplayVariant(locale24);
        java.lang.String str26 = locale23.getDisplayLanguage();
        java.util.Locale locale27 = java.util.Locale.CHINESE;
        java.util.Locale locale28 = java.util.Locale.CHINESE;
        java.lang.String str29 = locale27.getDisplayVariant(locale28);
        java.lang.String str30 = locale23.getDisplayLanguage(locale28);
        java.lang.String str31 = locale22.getDisplayLanguage(locale23);
        java.lang.String str32 = locale22.toLanguageTag();
        java.util.Set<java.lang.String> strSet33 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str34 = dateTimeZone0.getName(115200010L, locale22);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long41 = dateTimeZone37.convertLocalToUTC((-1L), false, 0L);
        long long43 = dateTimeZone35.getMillisKeepLocal(dateTimeZone37, (long) 100);
        java.lang.String str45 = dateTimeZone37.getShortName((long) (-1));
        java.util.Locale.Category category47 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.lang.String str49 = locale48.getISO3Language();
        java.util.Locale.setDefault(category47, locale48);
        java.lang.String str51 = dateTimeZone37.getShortName(97L, locale48);
        org.joda.time.LocalDateTime localDateTime52 = null;
        boolean boolean53 = dateTimeZone37.isLocalDateTimeGap(localDateTime52);
        int int55 = dateTimeZone37.getOffset(1L);
        long long57 = dateTimeZone0.getMillisKeepLocal(dateTimeZone37, 359999901L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-US" + "'", str14, "en-US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str26, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u6587" + "'", str30, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u5fb7\u6587" + "'", str31, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "de" + "'", str32, "de");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-101L) + "'", long41 == (-101L));
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.100" + "'", str45, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + category47 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category47.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "kor" + "'", str49, "kor");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00:00.100" + "'", str51, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + long57 + "' != '" + 359999801L + "'", long57 == 359999801L);
    }

    @Test
    public void test24048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24048");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendLiteral("en_US");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYear(24, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatterBuilder13.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendText(dateTimeFieldType15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendLiteral('x');
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatterBuilder19.toParser();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dateTimeParser20.parseInto(dateTimeParserBucket21, "+100:0046+100:00000000000000000000000002867485833333", 360000030);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -359999978");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeParser20);
    }

    @Test
    public void test24049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24049");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter2.getZone();
        java.util.Locale locale5 = java.util.Locale.JAPAN;
        java.lang.String str6 = locale5.getVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withLocale(locale5);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long13 = dateTimeZone9.convertLocalToUTC((-1L), false, 0L);
        int int15 = dateTimeZone9.getStandardOffset(1L);
        long long17 = dateTimeZone9.previousTransition((long) (short) 0);
        java.lang.String str19 = dateTimeZone9.getShortName((-1L));
        int int21 = dateTimeZone9.getOffsetFromLocal(0L);
        int int23 = dateTimeZone9.getOffset((long) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter7.withZone(dateTimeZone9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withPivotYear(56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter24.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long34 = dateTimeZone30.convertLocalToUTC((-1L), false, 0L);
        long long36 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 100);
        java.lang.String str38 = dateTimeZone30.getShortName((long) (-1));
        boolean boolean39 = dateTimeZone30.isFixed();
        long long41 = dateTimeZone30.nextTransition((long) 10);
        boolean boolean43 = dateTimeZone30.isStandardOffset(10L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter24.withZone(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter44.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter44.withPivotYear(160);
        org.joda.time.Chronology chronology48 = dateTimeFormatter44.getChronology();
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNull(chronology48);
    }

    @Test
    public void test24050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24050");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        boolean boolean10 = dateTimeFormatterBuilder7.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendMinuteOfHour((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        int int16 = dateTimeFormatter15.getDefaultYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder12.append(dateTimeFormatter15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendWeekyear(100, 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap21 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder17.appendTimeZoneName(strMap21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder23.appendYearOfCentury(37920000, 138);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder23.appendYear(36000000, 173);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder23.appendYear(40, 53);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder32.appendFractionOfHour(51, 1440000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2000 + "'", int16 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
    }

    @Test
    public void test24051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24051");
        java.util.Locale locale2 = new java.util.Locale("java.io.IOException: Etc/UTC", "zh_tw (ETC/UTC)");
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "java.io.ioexception: etc/utc_ZH_TW (ETC/UTC)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test24052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24052");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronology();
        boolean boolean7 = dateTimeFormatter5.isParser();
        boolean boolean8 = dateTimeFormatter5.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatter5.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withOffsetParsed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test24053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24053");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.lang.String str5 = locale4.getISO3Language();
        java.util.Locale.setDefault(category3, locale4);
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleKeys();
        java.lang.String str8 = locale4.toLanguageTag();
        java.lang.String str9 = dateTimeZone1.getShortName((-1439944L), locale4);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone1.getOffset(readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 0);
        long long16 = dateTimeZone14.convertUTCToLocal((long) 'u');
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone14.isLocalDateTimeGap(localDateTime17);
        long long20 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 1440096L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category3.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "kor" + "'", str5, "kor");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ko" + "'", str8, "ko");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+35:00" + "'", str9, "+35:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 126000000 + "'", int11 == 126000000);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600117L + "'", long16 == 3600117L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 123840096L + "'", long20 == 123840096L);
    }

    @Test
    public void test24054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24054");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder11.appendClockhourOfHalfday((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder11.appendLiteral("\u4e2d\u6587");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder11.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap20 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendTimeZoneShortName(strMap20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str23 = dateTimeFieldType22.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder21.appendDecimal(dateTimeFieldType22, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap27 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendTimeZoneName(strMap27);
        boolean boolean29 = dateTimeFormatterBuilder26.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder26.appendMinuteOfHour((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder26.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap35 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder34.appendTimeZoneShortName(strMap35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder34.appendText(dateTimeFieldType37);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder34.appendMonthOfYearText();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str42 = dateTimeFieldType41.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder40.appendFixedDecimal(dateTimeFieldType41, (int) (short) 10);
        org.joda.time.Chronology chronology45 = null;
        boolean boolean46 = dateTimeFieldType41.isSupported(chronology45);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder33.appendSignedDecimal(dateTimeFieldType41, (int) (short) 10, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder18.appendShortText(dateTimeFieldType41);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder50.appendFractionOfMinute(100, (int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder50.appendTwoDigitYear((int) (byte) 1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder56.appendFractionOfSecond(1440000, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder56.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder56.appendMillisOfDay(22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder62.appendYearOfEra(115200000, 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "dayOfYear" + "'", str23, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "dayOfYear" + "'", str42, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
    }

    @Test
    public void test24055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24055");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendLiteral("en_US");
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendDecimal(dateTimeFieldType10, 360000000, 2000);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withChronology(chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter17.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder14.append(dateTimeFormatter17);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = dateTimeFormatter17.parseMillis("\u82f1\u6587\u7f8e\u570b)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
    }

    @Test
    public void test24056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24056");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withChronology(chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withChronology(chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long16 = dateTimeZone12.convertLocalToUTC((-1L), false, 0L);
        long long18 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 100);
        java.lang.String str20 = dateTimeZone12.getShortName((long) (-1));
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.util.Locale locale23 = java.util.Locale.CHINESE;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        java.util.Set<java.lang.Character> charSet25 = locale23.getExtensionKeys();
        java.lang.String str26 = dateTimeZone12.getName(32L, locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter9.withZone(dateTimeZone12);
        java.util.Locale locale28 = java.util.Locale.CHINESE;
        java.util.Locale locale29 = java.util.Locale.CHINESE;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.lang.String str32 = locale29.getExtension('a');
        java.lang.String str33 = locale29.toLanguageTag();
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder36 = builder34.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder38 = builder34.setRegion("US");
        java.util.Locale locale40 = new java.util.Locale("zh");
        java.util.Locale.Builder builder41 = builder38.setLocale(locale40);
        java.lang.String str42 = locale29.getDisplayName(locale40);
        java.lang.String str43 = locale29.getVariant();
        java.util.Locale locale46 = new java.util.Locale("", "English (United States)");
        java.lang.String str47 = locale29.getDisplayVariant(locale46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter9.withLocale(locale29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter48.withPivotYear(71);
        java.util.Locale locale52 = java.util.Locale.forLanguageTag("zh_TW");
        java.util.Locale locale53 = java.util.Locale.PRC;
        boolean boolean54 = locale53.hasExtensions();
        java.util.Locale locale55 = java.util.Locale.getDefault();
        java.lang.String str56 = locale53.getDisplayLanguage(locale55);
        java.lang.String str57 = locale52.getDisplayCountry(locale53);
        java.lang.String str58 = locale52.getDisplayVariant();
        java.lang.String str59 = locale52.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter50.withLocale(locale52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3600001L) + "'", long16 == (-3600001L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3599900L) + "'", long18 == (-3599900L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:00" + "'", str20, "+01:00");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(charSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+01:00" + "'", str26, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zh" + "'", str33, "zh");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertEquals(locale40.toString(), "zh");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e2d\u6587" + "'", str42, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals(locale46.toString(), "_ENGLISH (UNITED STATES)");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_tw_ETC/UTC");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Chinese" + "'", str56, "Chinese");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
    }

    @Test
    public void test24057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24057");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneShortName(strMap8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str11 = dateTimeFieldType10.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendDecimal(dateTimeFieldType10, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap16 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendTimeZoneShortName(strMap16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder15.appendText(dateTimeFieldType18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatterBuilder20.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser22 = dateTimeFormatter21.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder9.append(dateTimeParser22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder6.append(dateTimeParser22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendHourOfDay((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder26.appendYearOfEra((int) (short) 1, (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder30.appendFractionOfMinute(2000, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder30.appendMinuteOfDay((int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendTwoDigitYear(21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap39 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder38.appendTimeZoneShortName(strMap39);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder38.appendMillisOfDay((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder42.appendFractionOfMinute((int) (short) 100, 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder45.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap48 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder47.appendTimeZoneShortName(strMap48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType51 = dateTimeFieldType50.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder47.appendText(dateTimeFieldType50);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap53 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder47.appendTimeZoneShortName(strMap53);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder54.appendLiteral("en_US");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder56.appendYear(24, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder56.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatterBuilder60.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = dateTimeFormatterBuilder60.appendTwoDigitYear(58, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap66 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder65.appendTimeZoneShortName(strMap66);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType69 = dateTimeFieldType68.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder70 = dateTimeFormatterBuilder65.appendText(dateTimeFieldType68);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap71 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder72 = dateTimeFormatterBuilder65.appendTimeZoneShortName(strMap71);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder74 = dateTimeFormatterBuilder72.appendLiteral("en_US");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder77 = dateTimeFormatterBuilder74.appendYear(24, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder78 = dateTimeFormatterBuilder74.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = dateTimeFormatterBuilder78.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType81 = dateTimeFieldType80.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder82 = dateTimeFormatterBuilder78.appendText(dateTimeFieldType80);
        org.joda.time.format.DateTimeParser dateTimeParser83 = dateTimeFormatterBuilder78.toParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType85 = dateTimeFieldType84.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder87 = dateTimeFormatterBuilder78.appendFixedSignedDecimal(dateTimeFieldType84, 360000000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder90 = dateTimeFormatterBuilder60.appendFraction(dateTimeFieldType84, (int) 'x', 58);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder93 = dateTimeFormatterBuilder45.appendDecimal(dateTimeFieldType84, 1440000, 236);
        org.joda.time.DurationFieldType durationFieldType94 = dateTimeFieldType84.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder96 = dateTimeFormatterBuilder37.appendFixedSignedDecimal(dateTimeFieldType84, 36000000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "dayOfYear" + "'", str11, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeParser22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder64);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertNotNull(durationFieldType69);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder70);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder72);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder74);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder77);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder78);
        org.junit.Assert.assertNotNull(dateTimeFormatter79);
        org.junit.Assert.assertNotNull(dateTimeFieldType80);
        org.junit.Assert.assertNotNull(durationFieldType81);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder82);
        org.junit.Assert.assertNotNull(dateTimeParser83);
        org.junit.Assert.assertNotNull(dateTimeFieldType84);
        org.junit.Assert.assertNotNull(durationFieldType85);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder87);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder90);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder93);
        org.junit.Assert.assertNotNull(durationFieldType94);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder96);
    }

    @Test
    public void test24058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24058");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendHourOfHalfday((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendClockhourOfHalfday((int) (byte) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap16 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendTimeZoneShortName(strMap16);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder21.appendTimeZoneName();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendShortText(dateTimeFieldType23);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder13.appendSignedDecimal(dateTimeFieldType23, (int) '#', 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap28 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendTimeZoneShortName(strMap28);
        boolean boolean30 = dateTimeFormatterBuilder29.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder29.appendTimeZoneOffset("\u82f1\u8a9e", true, 1, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendDayOfWeek((int) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatterBuilder35.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser39 = dateTimeFormatter38.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter38.withPivotYear(18);
        org.joda.time.format.DateTimeParser dateTimeParser42 = dateTimeFormatter41.getParser();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeParser39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeParser42);
    }

    @Test
    public void test24059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24059");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendYear(58, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder6.appendDecimal(dateTimeFieldType7, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap12 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendTimeZoneName(strMap12);
        boolean boolean14 = dateTimeFormatterBuilder11.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder11.appendMinuteOfHour((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimeParser dateTimeParser18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser18);
        int int20 = dateTimeFormatter19.getDefaultYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder16.append(dateTimeFormatter19);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap23 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendTimeZoneShortName(strMap23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder22.appendText(dateTimeFieldType25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatterBuilder27.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser29 = dateTimeFormatter28.getParser();
        int int30 = dateTimeParser29.estimateParsedLength();
        int int31 = dateTimeParser29.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder21.appendOptional(dateTimeParser29);
        int int33 = dateTimeParser29.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder3.append(dateTimeParser29);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder3.appendMonthOfYear(1440000);
        org.joda.time.format.DateTimePrinter dateTimePrinter37 = null;
        org.joda.time.format.DateTimeParser dateTimeParser38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter37, dateTimeParser38);
        int int40 = dateTimeFormatter39.getDefaultYear();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter39.withChronology(chronology41);
        java.util.Locale locale43 = dateTimeFormatter42.getLocale();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder3.append(dateTimeFormatter42);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder3.appendTimeZoneShortName();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dayOfYear" + "'", str8, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2000 + "'", int20 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeParser29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24 + "'", int30 == 24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 24 + "'", int31 == 24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 24 + "'", int33 == 24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2000 + "'", int40 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
    }

    @Test
    public void test24060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24060");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("English", "", "dayOfYear");
        java.lang.String str5 = locale0.getDisplayCountry(locale4);
        java.lang.String str6 = locale0.getVariant();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getISO3Country();
        java.lang.String str9 = locale7.getISO3Country();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder14 = builder10.setRegion("US");
        java.util.Locale locale15 = builder14.build();
        java.lang.String str16 = locale7.getDisplayLanguage(locale15);
        java.lang.String str17 = locale15.getLanguage();
        java.lang.String str18 = locale0.getDisplayName(locale15);
        java.lang.String str20 = locale0.getExtension('x');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "english__dayOfYear");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "_US_#u-chinese");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "German" + "'", str16, "German");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Chinese" + "'", str18, "Chinese");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test24061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24061");
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException(throwable4);
        java.io.IOException iOException6 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException("eng", (java.lang.Throwable) iOException6);
        java.lang.Throwable throwable8 = null;
        java.io.IOException iOException9 = new java.io.IOException(throwable8);
        java.lang.Throwable throwable11 = null;
        java.io.IOException iOException12 = new java.io.IOException(throwable11);
        java.io.IOException iOException13 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException12);
        iOException9.addSuppressed((java.lang.Throwable) iOException12);
        java.io.IOException iOException16 = new java.io.IOException("hi!");
        java.lang.Throwable throwable19 = null;
        java.io.IOException iOException20 = new java.io.IOException(throwable19);
        java.io.IOException iOException21 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException("eng", (java.lang.Throwable) iOException21);
        iOException16.addSuppressed((java.lang.Throwable) iOException22);
        iOException9.addSuppressed((java.lang.Throwable) iOException16);
        iOException6.addSuppressed((java.lang.Throwable) iOException16);
        java.lang.Throwable throwable29 = null;
        java.io.IOException iOException30 = new java.io.IOException(throwable29);
        java.io.IOException iOException31 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException30);
        java.io.IOException iOException32 = new java.io.IOException("eng", (java.lang.Throwable) iOException31);
        java.io.IOException iOException33 = new java.io.IOException("ko", (java.lang.Throwable) iOException31);
        java.lang.Throwable throwable34 = null;
        java.io.IOException iOException35 = new java.io.IOException(throwable34);
        java.lang.Throwable[] throwableArray36 = iOException35.getSuppressed();
        iOException33.addSuppressed((java.lang.Throwable) iOException35);
        iOException16.addSuppressed((java.lang.Throwable) iOException35);
        java.io.IOException iOException39 = new java.io.IOException("\u6c34", (java.lang.Throwable) iOException35);
        java.io.IOException iOException40 = new java.io.IOException("+00:00:00.010365+00:00:00.010000000000000000000000059999983888888", (java.lang.Throwable) iOException39);
        org.junit.Assert.assertNotNull(throwableArray36);
    }

    @Test
    public void test24062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24062");
        java.util.Locale locale2 = new java.util.Locale("zh_CN", "inglese (Stati Uniti)");
        org.junit.Assert.assertEquals(locale2.toString(), "zh_cn_INGLESE (STATI UNITI)");
    }

    @Test
    public void test24063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24063");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendShortText(dateTimeFieldType8);
        boolean boolean10 = dateTimeFormatterBuilder9.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendLiteral("\uc911\uad6d\uc5b4");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder9.appendCenturyOfEra((int) 'u', (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder9.appendCenturyOfEra(21, 37920000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendTwoDigitYear((-1), true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder22.appendTwoDigitYear((int) (short) 10, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder22.appendTimeZoneOffset("ja", false, (int) (short) 10, (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder30.appendTwoDigitYear(24, true);
        org.joda.time.format.DateTimePrinter dateTimePrinter34 = dateTimeFormatterBuilder30.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder18.append(dateTimePrinter34);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder18.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder18.appendYearOfEra(2192, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder39.appendCenturyOfEra((int) 'x', 160);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder42.appendTwoDigitWeekyear(105);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder44.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder44.appendTwoDigitWeekyear(60000, true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimePrinter34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
    }

    @Test
    public void test24064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24064");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendYearOfEra(10, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder6.appendWeekOfWeekyear((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder6.appendDayOfYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder6.appendDayOfYear((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder6.appendLiteral("weekOfWeekyear");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap19 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendTimeZoneShortName(strMap19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str22 = dateTimeFieldType21.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder20.appendDecimal(dateTimeFieldType21, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap26 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.appendTimeZoneName(strMap26);
        boolean boolean28 = dateTimeFormatterBuilder25.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder25.appendMinuteOfHour((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter31 = null;
        org.joda.time.format.DateTimeParser dateTimeParser32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter31, dateTimeParser32);
        int int34 = dateTimeFormatter33.getDefaultYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder30.append(dateTimeFormatter33);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder35.appendFractionOfHour((int) ' ', (int) 'x');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatterBuilder38.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter39.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter40.withDefaultYear((int) (short) 10);
        java.lang.String str44 = dateTimeFormatter42.print(197L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter42.withPivotYear((java.lang.Integer) (-3600000));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter42.withPivotYear((java.lang.Integer) 1);
        java.util.Locale locale49 = java.util.Locale.CHINESE;
        java.util.Locale locale53 = new java.util.Locale("English", "", "dayOfYear");
        java.lang.String str54 = locale49.getDisplayCountry(locale53);
        java.util.Locale locale55 = locale53.stripExtensions();
        java.lang.String str56 = locale53.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter42.withLocale(locale53);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder6.append(dateTimeFormatter57);
        org.joda.time.format.DateTimePrinter dateTimePrinter59 = dateTimeFormatter57.getPrinter();
        boolean boolean60 = dateTimeFormatter57.isPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "dayOfYear" + "'", str22, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2000 + "'", int34 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:001+00:000000000000000054722222" + "'", str44, "+00:001+00:000000000000000054722222");
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh");
        org.junit.Assert.assertEquals(locale53.toString(), "english__dayOfYear");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "english__dayOfYear");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "dayOfYear" + "'", str56, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimePrinter59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test24065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24065");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        boolean boolean10 = dateTimeFormatterBuilder7.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendTwoDigitWeekyear((int) (byte) 0, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap15 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendTimeZoneShortName(strMap15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str18 = dateTimeFieldType17.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder16.appendDecimal(dateTimeFieldType17, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap22 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendTimeZoneName(strMap22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder21.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder25.appendClockhourOfHalfday((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendSecondOfDay((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap33 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder32.appendTimeZoneShortName(strMap33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str36 = dateTimeFieldType35.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder34.appendDecimal(dateTimeFieldType35, (int) (byte) 0, (int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder39.appendShortText(dateTimeFieldType40);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder29.appendSignedDecimal(dateTimeFieldType40, (int) (byte) 1, 360000000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder13.appendFraction(dateTimeFieldType40, 2000, (int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder13.appendYear((int) (byte) 1, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder50.appendMillisOfDay(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder52.appendMonthOfYear(360000200);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder52.appendMonthOfYear(387);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatterBuilder52.toFormatter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "dayOfYear" + "'", str18, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "dayOfYear" + "'", str36, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
    }

    @Test
    public void test24066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24066");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale locale3 = java.util.Locale.US;
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayLanguage();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder9 = builder0.setExtension('a', "English");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder15 = builder14.clear();
        java.util.Locale locale16 = builder14.build();
        java.util.Locale.Builder builder17 = builder11.setLocale(locale16);
        java.util.Locale locale18 = builder11.build();
        java.util.Locale.Builder builder19 = builder11.clearExtensions();
        java.util.Locale.Builder builder20 = builder11.clear();
        java.util.Locale.Builder builder23 = builder11.setExtension('u', "en_CA");
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.util.Locale locale25 = java.util.Locale.CHINESE;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale24.getDisplayLanguage();
        java.util.Locale.Builder builder28 = builder11.setLocale(locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder30 = builder28.setLanguageTag("java.io.IOException: English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: java.io.IOException: English [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587" + "'", str5, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u4e2d\u6587" + "'", str27, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test24067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24067");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withChronology(chronology3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = locale9.getDisplayVariant();
        java.lang.String str11 = locale9.getDisplayLanguage();
        java.util.Locale.Builder builder12 = builder6.setLocale(locale9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter4.withLocale(locale9);
        int int14 = dateTimeFormatter4.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = dateTimeFormatter4.parseLocalDateTime("\u5341\u4e8c\u670800000000000000000000000512");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u82f1\u6587" + "'", str11, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
    }

    @Test
    public void test24068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24068");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withChronology(chronology3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        boolean boolean6 = dateTimeFormatter4.isParser();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long12 = dateTimeZone8.convertLocalToUTC((-1L), false, 0L);
        int int14 = dateTimeZone8.getStandardOffset(1L);
        long long16 = dateTimeZone8.previousTransition((long) (short) 0);
        java.lang.String str18 = dateTimeZone8.getShortName((-1L));
        int int20 = dateTimeZone8.getOffsetFromLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter4.withZone(dateTimeZone8);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = dateTimeFormatter21.getPrinter();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter21.withChronology(chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter24.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter25.withOffsetParsed();
        java.io.Writer writer27 = null;
        org.joda.time.ReadablePartial readablePartial28 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter25.printTo(writer27, readablePartial28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3600001L) + "'", long12 == (-3600001L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3600000 + "'", int14 == 3600000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+01:00" + "'", str18, "+01:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3600000 + "'", int20 == 3600000);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNull(dateTimePrinter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test24069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24069");
        java.io.IOException iOException2 = new java.io.IOException("TWN");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = iOException2.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("java.io.ioexception", (java.lang.Throwable) iOException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test24070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24070");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendShortText(dateTimeFieldType8);
        boolean boolean10 = dateTimeFormatterBuilder9.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendWeekyear((int) ' ', (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder9.appendClockhourOfHalfday(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendClockhourOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendLiteral("-00:00:00.001");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendTwoDigitYear(2000, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder23.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap29 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder28.appendTimeZoneShortName(strMap29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str32 = dateTimeFieldType31.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder30.appendDecimal(dateTimeFieldType31, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder27.appendText(dateTimeFieldType31);
        org.joda.time.format.DateTimePrinter dateTimePrinter37 = dateTimeFormatterBuilder36.toPrinter();
        int int38 = dateTimePrinter37.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap40 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder39.appendTimeZoneShortName(strMap40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType42.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder39.appendText(dateTimeFieldType42);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatterBuilder44.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser46 = dateTimeFormatter45.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter37, dateTimeParser46);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder22.append(dateTimePrinter37);
        org.joda.time.format.DateTimeParser dateTimeParser49 = dateTimeFormatterBuilder48.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder48.appendMinuteOfDay(46);
        org.joda.time.format.DateTimePrinter dateTimePrinter52 = dateTimeFormatterBuilder51.toPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "dayOfYear" + "'", str32, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimePrinter37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 58 + "'", int38 == 58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNotNull(dateTimeParser46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeParser49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimePrinter52);
    }

    @Test
    public void test24071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24071");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendMinuteOfHour((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendHourOfHalfday(360000000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap11 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendTimeZoneShortName(strMap11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str14 = dateTimeFieldType13.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder12.appendDecimal(dateTimeFieldType13, (int) (byte) 0, (int) (short) 1);
        java.lang.String str18 = dateTimeFieldType13.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder7.appendFraction(dateTimeFieldType13, 349800000, 198);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "dayOfYear" + "'", str14, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "dayOfYear" + "'", str18, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test24072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24072");
        java.util.Locale locale1 = new java.util.Locale("TW");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.junit.Assert.assertEquals(locale1.toString(), "tw");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test24073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24073");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale4.getISO3Country();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale7.getDisplayScript();
        java.lang.String str9 = locale7.toLanguageTag();
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = locale7.getDisplayName(locale10);
        java.util.Locale locale12 = java.util.Locale.JAPANESE;
        java.lang.String str13 = locale7.getDisplayLanguage(locale12);
        java.lang.String str14 = locale4.getDisplayName(locale12);
        java.util.Locale locale15 = java.util.Locale.US;
        java.lang.String str16 = locale15.getDisplayScript();
        java.lang.String str17 = locale15.toLanguageTag();
        java.util.Locale locale18 = java.util.Locale.US;
        java.lang.String str19 = locale15.getDisplayName(locale18);
        java.util.Locale locale20 = java.util.Locale.JAPANESE;
        java.lang.String str21 = locale15.getDisplayLanguage(locale20);
        java.lang.String str22 = locale4.getDisplayScript(locale15);
        java.util.Locale.setDefault(category0, locale15);
        java.lang.String str24 = locale15.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ko" + "'", str5, "ko");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en-US" + "'", str9, "en-US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English (United States)" + "'", str11, "English (United States)");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u82f1\u8a9e" + "'", str13, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u97d3\u56fd\u8a9e" + "'", str14, "\u97d3\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en-US" + "'", str17, "en-US");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "English (United States)" + "'", str19, "English (United States)");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u82f1\u8a9e" + "'", str21, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test24074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24074");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendShortText(dateTimeFieldType8);
        boolean boolean10 = dateTimeFormatterBuilder9.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendWeekyear((int) ' ', (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap15 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendTimeZoneShortName(strMap15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str18 = dateTimeFieldType17.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder16.appendDecimal(dateTimeFieldType17, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap22 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendTimeZoneName(strMap22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap25 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendTimeZoneShortName(strMap25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str28 = dateTimeFieldType27.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder26.appendDecimal(dateTimeFieldType27, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap32 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder31.appendTimeZoneName(strMap32);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder31.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder31.appendHourOfHalfday((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder31.appendMinuteOfDay((int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder31.appendHourOfDay(2000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap43 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder42.appendTimeZoneShortName(strMap43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str46 = dateTimeFieldType45.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder44.appendDecimal(dateTimeFieldType45, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap50 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder49.appendTimeZoneName(strMap50);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder49.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder53.appendFractionOfDay(0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder56.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder57.appendHourOfHalfday(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder59.appendMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder59.appendSignedDecimal(dateTimeFieldType62, 24, (int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder31.appendDecimal(dateTimeFieldType62, (int) 'a', (int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder71 = dateTimeFormatterBuilder23.appendDecimal(dateTimeFieldType62, (int) 'a', 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder74 = dateTimeFormatterBuilder13.appendFraction(dateTimeFieldType62, (int) (short) 0, 58);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder79 = dateTimeFormatterBuilder13.appendTimeZoneOffset("utc", false, (int) (short) 100, 360000200);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "dayOfYear" + "'", str18, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "dayOfYear" + "'", str28, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "dayOfYear" + "'", str46, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder71);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder74);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder79);
    }

    @Test
    public void test24075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24075");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long6 = dateTimeZone2.convertLocalToUTC((-1L), false, 0L);
        long long8 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) 100);
        java.lang.String str10 = dateTimeZone2.getShortName((long) (-1));
        boolean boolean11 = dateTimeZone2.isFixed();
        long long13 = dateTimeZone2.nextTransition((long) 10);
        boolean boolean14 = dateTimeZone2.isFixed();
        long long16 = dateTimeZone2.convertUTCToLocal((-322079955L));
        boolean boolean18 = dateTimeZone2.isStandardOffset((long) 10);
        java.lang.String str19 = dateTimeZone2.toString();
        long long21 = dateTimeZone2.convertUTCToLocal((-359999965L));
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder23.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder27 = builder23.setRegion("US");
        java.util.Locale locale29 = new java.util.Locale("zh");
        java.util.Locale.Builder builder30 = builder27.setLocale(locale29);
        java.util.Locale locale31 = builder30.build();
        java.util.Locale locale35 = new java.util.Locale("hourOfHalfday", "\u82f1\u6587", "Chinesisch");
        java.lang.String str36 = locale31.getDisplayLanguage(locale35);
        java.lang.String str37 = locale35.getDisplayName();
        java.lang.String str38 = dateTimeZone2.getName((-37860000L), locale35);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3600001L) + "'", long6 == (-3600001L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3599900L) + "'", long8 == (-3599900L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:00" + "'", str10, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-318479955L) + "'", long16 == (-318479955L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+01:00" + "'", str19, "+01:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-356399965L) + "'", long21 == (-356399965L));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals(locale29.toString(), "zh");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "\u82f1\u6587_Chinesisch");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Chinese" + "'", str36, "Chinese");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u82f1\u6587,Chinesisch)" + "'", str37, "\u82f1\u6587,Chinesisch)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+01:00" + "'", str38, "+01:00");
    }

    @Test
    public void test24076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24076");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear(0);
        boolean boolean8 = dateTimeFormatter2.isParser();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNull(dateTimeParser5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test24077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24077");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        boolean boolean10 = dateTimeFormatterBuilder7.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendMonthOfYearShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder11.appendSignedDecimal(dateTimeFieldType13, 360000000, 115200000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder11.appendTwoDigitYear((int) 'x', true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendDayOfYear(115200000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder19.appendDayOfYear(138);
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        int int27 = dateTimeFormatter26.getDefaultYear();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter26.withChronology(chronology28);
        org.joda.time.Chronology chronology30 = dateTimeFormatter26.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter26.withOffsetParsed();
        java.util.Locale locale32 = java.util.Locale.CHINESE;
        java.util.Locale locale33 = java.util.Locale.CHINESE;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.lang.String str35 = locale32.toLanguageTag();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter31.withLocale(locale32);
        java.util.Locale locale37 = dateTimeFormatter36.getLocale();
        int int38 = dateTimeFormatter36.getDefaultYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder23.append(dateTimeFormatter36);
        java.io.Writer writer40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter36.printTo(writer40, readableInstant41);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2000 + "'", int27 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "zh" + "'", str35, "zh");
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2000 + "'", int38 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
    }

    @Test
    public void test24078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24078");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatterBuilder5.toFormatter();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long13 = dateTimeZone9.convertLocalToUTC((-1L), false, 0L);
        long long15 = dateTimeZone7.getMillisKeepLocal(dateTimeZone9, (long) 100);
        long long17 = dateTimeZone7.convertUTCToLocal((long) (byte) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter6.withZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeFormatter6.getZone();
        boolean boolean20 = dateTimeFormatter6.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter6.withPivotYear(60175);
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = dateTimeFormatter22.getPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3600001L) + "'", long13 == (-3600001L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3599900L) + "'", long15 == (-3599900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimePrinter23);
    }

    @Test
    public void test24079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24079");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendHourOfHalfday((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendHourOfDay(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder15.appendTimeZoneOffset("en-US", true, 10, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendClockhourOfDay((int) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatterBuilder20.toFormatter();
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withLocale(locale24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter25.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter25.withPivotYear((java.lang.Integer) 138);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        long long35 = dateTimeZone31.convertLocalToUTC((-1L), false, 0L);
        long long37 = dateTimeZone29.getMillisKeepLocal(dateTimeZone31, (long) 100);
        long long39 = dateTimeZone29.convertUTCToLocal((long) (byte) 0);
        java.lang.String str41 = dateTimeZone29.getShortName(360000001L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter25.withZone(dateTimeZone29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter25.withOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-3600001L) + "'", long35 == (-3600001L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-3599900L) + "'", long37 == (-3599900L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
    }

    @Test
    public void test24080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24080");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale.Builder builder12 = builder7.addUnicodeLocaleAttribute("Italian");
        java.util.Locale.Builder builder13 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder7.setExtension(' ', "+00:00:00.0106+00:00:00.01000000000000000000000000053333583333300015000000000+00:00:00.010");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test24081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24081");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withChronology(chronology4);
        boolean boolean6 = dateTimeFormatter5.isParser();
        boolean boolean7 = dateTimeFormatter5.isParser();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long14 = dateTimeZone10.convertLocalToUTC((-1L), false, 0L);
        long long16 = dateTimeZone8.getMillisKeepLocal(dateTimeZone10, (long) 100);
        java.lang.String str18 = dateTimeZone10.getShortName((long) (-1));
        java.util.Locale.Category category20 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.lang.String str22 = locale21.getISO3Language();
        java.util.Locale.setDefault(category20, locale21);
        java.lang.String str24 = dateTimeZone10.getShortName(97L, locale21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter5.withLocale(locale21);
        int int26 = dateTimeFormatter25.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter25.withPivotYear((java.lang.Integer) 46);
        boolean boolean29 = dateTimeFormatter28.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeFormatter28.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter28.withPivotYear((int) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withPivotYear((java.lang.Integer) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter32.withPivotYear(60042);
        boolean boolean37 = dateTimeFormatter36.isOffsetParsed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3600001L) + "'", long14 == (-3600001L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599900L) + "'", long16 == (-3599900L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+01:00" + "'", str18, "+01:00");
        org.junit.Assert.assertTrue("'" + category20 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category20.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "kor" + "'", str22, "kor");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+01:00" + "'", str24, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2000 + "'", int26 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test24082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24082");
        java.io.IOException iOException3 = new java.io.IOException("");
        java.io.IOException iOException4 = new java.io.IOException("\uc601\uc5b4", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Throwable throwable9 = null;
        java.io.IOException iOException10 = new java.io.IOException(throwable9);
        java.io.IOException iOException11 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException("+00:00:00.100", (java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException("\u4e2d\u6587", (java.lang.Throwable) iOException11);
        iOException4.addSuppressed((java.lang.Throwable) iOException11);
        java.io.IOException iOException15 = new java.io.IOException("-00:00:00.001", (java.lang.Throwable) iOException11);
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException15);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test24083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24083");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        long long9 = dateTimeZone5.convertLocalToUTC((-1L), false, 0L);
        long long11 = dateTimeZone3.getMillisKeepLocal(dateTimeZone5, (long) 100);
        java.lang.String str13 = dateTimeZone5.getName(1L);
        long long15 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        long long20 = dateTimeZone5.convertLocalToUTC((long) (byte) 1, true, (long) (short) -1);
        long long22 = dateTimeZone5.convertUTCToLocal((long) 'a');
        java.lang.String str23 = dateTimeZone5.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        long long27 = dateTimeZone25.nextTransition((-359999999L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        long long30 = dateTimeZone5.getMillisKeepLocal(dateTimeZone25, 90L);
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone5.isLocalDateTimeGap(localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3600001L) + "'", long9 == (-3600001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3599900L) + "'", long11 == (-3599900L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:00" + "'", str13, "+01:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 34320035L + "'", long15 == 34320035L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3599999L) + "'", long20 == (-3599999L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3600097L + "'", long22 == 3600097L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+01:00" + "'", str23, "+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-359999999L) + "'", long27 == (-359999999L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-356399910L) + "'", long30 == (-356399910L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test24084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24084");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale4 = new java.util.Locale("English", "", "dayOfYear");
        java.lang.String str5 = locale0.getDisplayCountry(locale4);
        java.util.Locale locale6 = locale4.stripExtensions();
        boolean boolean7 = locale4.hasExtensions();
        java.lang.String str8 = locale4.getVariant();
        java.lang.String str9 = locale4.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals(locale4.toString(), "english__dayOfYear");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "english__dayOfYear");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dayOfYear" + "'", str8, "dayOfYear");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "english" + "'", str9, "english");
    }

    @Test
    public void test24085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24085");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder4 = builder2.setLanguage("English");
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale.Builder builder6 = builder2.setLocale(locale5);
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setVariant("weekyear");
        java.util.Locale.Builder builder10 = builder6.clear();
        java.util.Locale locale11 = builder6.build();
        java.util.Locale.Builder builder13 = builder6.addUnicodeLocaleAttribute("Englisch");
        java.util.Locale.Builder builder15 = builder6.setLanguage("CA");
        java.util.Locale locale16 = builder15.build();
        java.util.Locale.Builder builder17 = builder15.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder17.setVariant("java.io.IOException: TWN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: java.io.IOException: TWN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ca__#u-englisch");
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test24086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24086");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        boolean boolean10 = dateTimeFormatterBuilder7.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendMinuteOfHour((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        int int16 = dateTimeFormatter15.getDefaultYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder12.append(dateTimeFormatter15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap19 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendTimeZoneShortName(strMap19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder18.appendText(dateTimeFieldType21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatterBuilder23.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser25 = dateTimeFormatter24.getParser();
        int int26 = dateTimeParser25.estimateParsedLength();
        int int27 = dateTimeParser25.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder17.appendOptional(dateTimeParser25);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder28.appendMinuteOfDay((int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder28.appendYearOfCentury((int) (byte) 10, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder28.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder35.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder38.appendTimeZoneName();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder39.appendShortText(dateTimeFieldType40);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder39.appendWeekOfWeekyear(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap45 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder44.appendTimeZoneShortName(strMap45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType48 = dateTimeFieldType47.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder44.appendText(dateTimeFieldType47);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap50 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder44.appendTimeZoneShortName(strMap50);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder51.appendLiteral("en_US");
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType55 = dateTimeFieldType54.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder53.appendDecimal(dateTimeFieldType54, 360000000, 2000);
        java.lang.String str59 = dateTimeFieldType54.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder43.appendFraction(dateTimeFieldType54, (int) ' ', 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder28.appendShortText(dateTimeFieldType54);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = dateTimeFormatterBuilder28.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder64.appendMillisOfSecond(20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2000 + "'", int16 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeParser25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 24 + "'", int26 == 24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24 + "'", int27 == 24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "weekOfWeekyear" + "'", str59, "weekOfWeekyear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder64);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
    }

    @Test
    public void test24087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24087");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        boolean boolean1 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 10);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap4 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendTimeZoneName(strMap4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder3.appendTwoDigitWeekyear(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder3.appendTwoDigitYear((int) (short) 100, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder3.appendLiteral("hourOfHalfday");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder3.appendTimeZoneOffset("", false, (int) (byte) 1, (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendClockhourOfDay(56);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        int int23 = dateTimeFormatter22.getDefaultYear();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withChronology(chronology24);
        boolean boolean26 = dateTimeFormatter25.isParser();
        boolean boolean27 = dateTimeFormatter25.isParser();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long34 = dateTimeZone30.convertLocalToUTC((-1L), false, 0L);
        long long36 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 100);
        java.lang.String str38 = dateTimeZone30.getShortName((long) (-1));
        java.util.Locale.Category category40 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale41 = java.util.Locale.KOREAN;
        java.lang.String str42 = locale41.getISO3Language();
        java.util.Locale.setDefault(category40, locale41);
        java.lang.String str44 = dateTimeZone30.getShortName(97L, locale41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter25.withLocale(locale41);
        int int46 = dateTimeFormatter45.getDefaultYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder17.append(dateTimeFormatter45);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder48.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap52 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder51.appendTimeZoneShortName(strMap52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType55 = dateTimeFieldType54.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder51.appendText(dateTimeFieldType54);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder50.appendShortText(dateTimeFieldType54);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder50.appendYearOfEra(0, (int) (short) 100);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap61 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder60.appendTimeZoneShortName(strMap61);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder62.appendFractionOfSecond(58, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap67 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder66.appendTimeZoneShortName(strMap67);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str70 = dateTimeFieldType69.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder68.appendDecimal(dateTimeFieldType69, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap74 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder75 = dateTimeFormatterBuilder73.appendTimeZoneName(strMap74);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder77 = dateTimeFormatterBuilder73.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder79 = dateTimeFormatterBuilder73.appendHourOfHalfday((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder81 = dateTimeFormatterBuilder79.appendClockhourOfHalfday((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder84 = dateTimeFormatterBuilder81.appendFractionOfDay(24, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder85 = dateTimeFormatterBuilder84.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeParser dateTimeParser86 = dateTimeFormatterBuilder84.toParser();
        int int87 = dateTimeParser86.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder88 = dateTimeFormatterBuilder65.appendOptional(dateTimeParser86);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder89 = dateTimeFormatterBuilder47.append(dateTimeParser86);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder91 = dateTimeFormatterBuilder89.appendMinuteOfDay(2085000000);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2000 + "'", int23 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-360000001L) + "'", long34 == (-360000001L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-359999900L) + "'", long36 == (-359999900L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+100:00" + "'", str38, "+100:00");
        org.junit.Assert.assertTrue("'" + category40 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category40.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "kor" + "'", str42, "kor");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+100:00" + "'", str44, "+100:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2000 + "'", int46 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "dayOfYear" + "'", str70, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder75);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder77);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder79);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder81);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder84);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder85);
        org.junit.Assert.assertNotNull(dateTimeParser86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 56 + "'", int87 == 56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder88);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder89);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder91);
    }

    @Test
    public void test24088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24088");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendHourOfHalfday((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendClockhourOfHalfday((int) (byte) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap16 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendTimeZoneShortName(strMap16);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder21.appendTimeZoneName();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendShortText(dateTimeFieldType23);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder13.appendSignedDecimal(dateTimeFieldType23, (int) '#', 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder13.appendLiteral("\u97d3\u56fd\u8a9e");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendDayOfWeek(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder31.appendMinuteOfDay(115200000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder31.appendSecondOfDay(60000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder31.appendTwoDigitYear(173, false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
    }

    @Test
    public void test24089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24089");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder11.appendClockhourOfHalfday((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendSecondOfDay((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder15.appendDayOfMonth((int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder15.appendYearOfCentury((int) (byte) 100, (-60001));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
    }

    @Test
    public void test24090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24090");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendHourOfHalfday((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder7.appendMinuteOfDay((int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder7.appendHourOfDay(2000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder7.appendTwoDigitWeekyear((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder7.appendWeekyear((int) (byte) 100, 236);
        org.joda.time.format.DateTimeParser dateTimeParser23 = dateTimeFormatterBuilder22.toParser();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = dateTimeParser23.parseInto(dateTimeParserBucket24, "-01:00365", 297);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -288");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeParser23);
    }

    @Test
    public void test24091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24091");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder4 = builder0.setRegion("US");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.addUnicodeLocaleAttribute("English");
        java.util.Locale.Builder builder8 = builder4.clear();
        java.util.Locale locale9 = builder4.build();
        java.util.Locale.Builder builder10 = builder4.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setRegion("");
        java.util.Locale locale13 = builder10.build();
        java.util.Locale locale14 = builder10.build();
        java.util.Locale.setDefault(locale14);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
    }

    @Test
    public void test24092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24092");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatterBuilder5.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withZone(dateTimeZone9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withDefaultYear(236);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTimeFormatter10.parseDateTime("zh");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
    }

    @Test
    public void test24093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24093");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) ' ');
        long long5 = dateTimeZone2.adjustOffset((-359999900L), true);
        boolean boolean7 = dateTimeZone2.isStandardOffset((-720000001L));
        java.util.TimeZone timeZone8 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-359999900L) + "'", long5 == (-359999900L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+10:32");
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test24094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24094");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("IT-IT");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test24095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24095");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder3.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder4.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendFractionOfSecond((int) '4', (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendDayOfWeekText();
        boolean boolean18 = dateTimeFormatterBuilder14.canBuildPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = dateTimeFormatterBuilder14.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendTwoDigitYear((-1), true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder23.appendTwoDigitYear((int) (short) 10, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendPattern("zh");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder28.appendSecondOfMinute(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder30.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder32.appendYear(58, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap37 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendTimeZoneShortName(strMap37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str40 = dateTimeFieldType39.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder38.appendDecimal(dateTimeFieldType39, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap44 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendTimeZoneName(strMap44);
        boolean boolean46 = dateTimeFormatterBuilder43.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder43.appendMinuteOfHour((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter49 = null;
        org.joda.time.format.DateTimeParser dateTimeParser50 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter49, dateTimeParser50);
        int int52 = dateTimeFormatter51.getDefaultYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder48.append(dateTimeFormatter51);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap55 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder54.appendTimeZoneShortName(strMap55);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType58 = dateTimeFieldType57.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder54.appendText(dateTimeFieldType57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatterBuilder59.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser61 = dateTimeFormatter60.getParser();
        int int62 = dateTimeParser61.estimateParsedLength();
        int int63 = dateTimeParser61.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = dateTimeFormatterBuilder53.appendOptional(dateTimeParser61);
        int int65 = dateTimeParser61.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder35.append(dateTimeParser61);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder30.appendOptional(dateTimeParser61);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder13.append(dateTimePrinter19, dateTimeParser61);
        int int69 = dateTimeParser61.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder70 = dateTimeFormatterBuilder5.append(dateTimeParser61);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder70.appendTwoDigitYear((-115200134), true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimePrinter19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "dayOfYear" + "'", str40, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2000 + "'", int52 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(dateTimeParser61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 24 + "'", int62 == 24);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 24 + "'", int63 == 24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 24 + "'", int65 == 24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 24 + "'", int69 == 24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder70);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
    }

    @Test
    public void test24096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24096");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withChronology(chronology3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        boolean boolean6 = dateTimeFormatter4.isParser();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        long long12 = dateTimeZone8.convertLocalToUTC((-1L), false, 0L);
        int int14 = dateTimeZone8.getStandardOffset(1L);
        long long16 = dateTimeZone8.previousTransition((long) (short) 0);
        java.lang.String str18 = dateTimeZone8.getShortName((-1L));
        int int20 = dateTimeZone8.getOffsetFromLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter4.withZone(dateTimeZone8);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = dateTimeFormatter21.getPrinter();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter21.withChronology(chronology23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        long long34 = dateTimeZone30.convertLocalToUTC((-1L), false, 0L);
        long long36 = dateTimeZone28.getMillisKeepLocal(dateTimeZone30, (long) 100);
        java.lang.String str38 = dateTimeZone30.getName(1L);
        long long40 = dateTimeZone27.getMillisKeepLocal(dateTimeZone30, (long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter21.withZone(dateTimeZone30);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter42.withChronology(chronology43);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360000001L) + "'", long12 == (-360000001L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 360000000 + "'", int14 == 360000000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+100:00" + "'", str18, "+100:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 360000000 + "'", int20 == 360000000);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNull(dateTimePrinter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-360000001L) + "'", long34 == (-360000001L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-359999900L) + "'", long36 == (-359999900L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+100:00" + "'", str38, "+100:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-322079965L) + "'", long40 == (-322079965L));
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
    }

    @Test
    public void test24097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24097");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendHourOfHalfday((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendClockhourOfHalfday((int) (byte) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap16 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendTimeZoneShortName(strMap16);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder21.appendTimeZoneName();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendShortText(dateTimeFieldType23);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder13.appendSignedDecimal(dateTimeFieldType23, (int) '#', 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap28 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendTimeZoneShortName(strMap28);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap30 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder27.appendTimeZoneShortName(strMap30);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder31.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder31.appendSecondOfMinute(579);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder34.appendWeekyear(1440092, (-237));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder37.appendMillisOfDay(2248);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
    }

    @Test
    public void test24098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24098");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long6 = dateTimeZone2.convertLocalToUTC((-1L), false, 0L);
        long long8 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) 100);
        long long10 = dateTimeZone2.convertUTCToLocal((-206879965L));
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.lang.String str14 = locale12.getDisplayVariant(locale13);
        java.lang.String str15 = locale12.toLanguageTag();
        java.lang.String str16 = locale12.getDisplayLanguage();
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str18 = locale17.getLanguage();
        java.util.Locale locale19 = locale17.stripExtensions();
        java.lang.String str20 = locale12.getDisplayScript(locale17);
        java.util.Locale locale21 = java.util.Locale.JAPANESE;
        java.util.Locale.setDefault(locale21);
        java.lang.String str23 = locale12.getDisplayName(locale21);
        java.lang.String str24 = locale12.toLanguageTag();
        java.lang.String str25 = dateTimeZone2.getName(1440000L, locale12);
        java.lang.String str26 = locale12.getISO3Country();
        boolean boolean27 = locale12.hasExtensions();
        java.lang.String str28 = locale12.getISO3Language();
        java.lang.Object obj29 = locale12.clone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-360000001L) + "'", long6 == (-360000001L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-359999900L) + "'", long8 == (-359999900L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 153120035L + "'", long10 == 153120035L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh" + "'", str15, "zh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinese" + "'", str16, "Chinese");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh" + "'", str18, "zh");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u56fd\u8a9e" + "'", str23, "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "zh" + "'", str24, "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+100:00" + "'", str25, "+100:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zho" + "'", str28, "zho");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "zh");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "zh");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "zh");
    }

    @Test
    public void test24099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24099");
        java.io.IOException iOException6 = new java.io.IOException("");
        java.io.IOException iOException7 = new java.io.IOException("\uc601\uc5b4", (java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("dayOfYear", (java.lang.Throwable) iOException7);
        java.io.IOException iOException12 = new java.io.IOException("");
        java.io.IOException iOException13 = new java.io.IOException("\uc601\uc5b4", (java.lang.Throwable) iOException12);
        java.io.IOException iOException14 = new java.io.IOException("dayOfYear", (java.lang.Throwable) iOException13);
        iOException7.addSuppressed((java.lang.Throwable) iOException13);
        java.lang.Throwable throwable18 = null;
        java.io.IOException iOException19 = new java.io.IOException(throwable18);
        java.io.IOException iOException20 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException("eng", (java.lang.Throwable) iOException20);
        java.lang.Throwable throwable22 = null;
        java.io.IOException iOException23 = new java.io.IOException(throwable22);
        java.lang.Throwable throwable25 = null;
        java.io.IOException iOException26 = new java.io.IOException(throwable25);
        java.io.IOException iOException27 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException26);
        iOException23.addSuppressed((java.lang.Throwable) iOException26);
        java.io.IOException iOException30 = new java.io.IOException("hi!");
        java.lang.Throwable throwable33 = null;
        java.io.IOException iOException34 = new java.io.IOException(throwable33);
        java.io.IOException iOException35 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException34);
        java.io.IOException iOException36 = new java.io.IOException("eng", (java.lang.Throwable) iOException35);
        iOException30.addSuppressed((java.lang.Throwable) iOException36);
        iOException23.addSuppressed((java.lang.Throwable) iOException30);
        iOException20.addSuppressed((java.lang.Throwable) iOException30);
        java.lang.Throwable throwable43 = null;
        java.io.IOException iOException44 = new java.io.IOException(throwable43);
        java.io.IOException iOException45 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException44);
        java.io.IOException iOException46 = new java.io.IOException("eng", (java.lang.Throwable) iOException45);
        java.io.IOException iOException47 = new java.io.IOException("ko", (java.lang.Throwable) iOException45);
        java.lang.Throwable throwable48 = null;
        java.io.IOException iOException49 = new java.io.IOException(throwable48);
        java.lang.Throwable[] throwableArray50 = iOException49.getSuppressed();
        iOException47.addSuppressed((java.lang.Throwable) iOException49);
        iOException30.addSuppressed((java.lang.Throwable) iOException49);
        iOException7.addSuppressed((java.lang.Throwable) iOException49);
        java.io.IOException iOException54 = new java.io.IOException("US", (java.lang.Throwable) iOException7);
        java.io.IOException iOException55 = new java.io.IOException("+00:00:00.01042", (java.lang.Throwable) iOException7);
        java.io.IOException iOException56 = new java.io.IOException("weekyearOfCentury", (java.lang.Throwable) iOException55);
        java.io.IOException iOException57 = new java.io.IOException((java.lang.Throwable) iOException55);
        org.junit.Assert.assertNotNull(throwableArray50);
    }

    @Test
    public void test24100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24100");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap4 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendTimeZoneShortName(strMap4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendText(dateTimeFieldType6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder2.appendShortText(dateTimeFieldType6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder2.appendLiteral('a');
        boolean boolean12 = dateTimeFormatterBuilder11.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendMonthOfYear((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        int int18 = dateTimeFormatter17.getDefaultYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withChronology(chronology19);
        boolean boolean21 = dateTimeFormatter17.isOffsetParsed();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder14.append(dateTimeFormatter17);
        boolean boolean23 = dateTimeFormatter17.isOffsetParsed();
        java.lang.Integer int24 = dateTimeFormatter17.getPivotYear();
        org.joda.time.ReadWritableInstant readWritableInstant25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = dateTimeFormatter17.parseInto(readWritableInstant25, "\u661f\u671f\u4e8c", 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2000 + "'", int18 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(int24);
    }

    @Test
    public void test24101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24101");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneShortName(strMap8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str11 = dateTimeFieldType10.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendDecimal(dateTimeFieldType10, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap16 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendTimeZoneShortName(strMap16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder15.appendText(dateTimeFieldType18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatterBuilder20.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser22 = dateTimeFormatter21.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder9.append(dateTimeParser22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder6.append(dateTimeParser22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendHourOfDay((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendMonthOfYearShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType28.getField(chronology29);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder27.appendText(dateTimeFieldType28);
        org.joda.time.format.DateTimePrinter dateTimePrinter32 = dateTimeFormatterBuilder27.toPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "dayOfYear" + "'", str11, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeParser22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimePrinter32);
    }

    @Test
    public void test24102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24102");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder1.appendClockhourOfDay((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder1.appendClockhourOfDay(2000);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendTwoDigitYear((-1), true);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendFixedDecimal(dateTimeFieldType11, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap20 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendTimeZoneShortName(strMap20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str23 = dateTimeFieldType22.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder21.appendDecimal(dateTimeFieldType22, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder18.appendText(dateTimeFieldType22);
        org.joda.time.format.DateTimePrinter dateTimePrinter28 = dateTimeFormatterBuilder27.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap30 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendTimeZoneShortName(strMap30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType32.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder29.appendText(dateTimeFieldType32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatterBuilder34.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser36 = dateTimeFormatter35.getParser();
        int int37 = dateTimeParser36.estimateParsedLength();
        int int38 = dateTimeParser36.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = null;
        int int42 = dateTimeParser36.parseInto(dateTimeParserBucket39, "en_US", (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap44 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendTimeZoneShortName(strMap44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str47 = dateTimeFieldType46.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder45.appendDecimal(dateTimeFieldType46, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser51 = dateTimeFormatterBuilder45.toParser();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray52 = new org.joda.time.format.DateTimeParser[] { dateTimeParser36, dateTimeParser51 };
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder13.append(dateTimePrinter28, dateTimeParserArray52);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder1.append(dateTimePrinter6, dateTimeParserArray52);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder1.appendTwoDigitYear(360000000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder56.appendDayOfWeekShortText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "dayOfYear" + "'", str23, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimePrinter28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeParser36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 24 + "'", int37 == 24);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 24 + "'", int38 == 24);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "dayOfYear" + "'", str47, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeParser51);
        org.junit.Assert.assertNotNull(dateTimeParserArray52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
    }

    @Test
    public void test24103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24103");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long6 = dateTimeZone2.convertLocalToUTC((-1L), false, 0L);
        long long8 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) 100);
        long long10 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.getDisplayScript();
        java.lang.String str14 = locale12.toLanguageTag();
        java.lang.String str15 = dateTimeZone0.getName((long) '#', locale12);
        java.lang.String str17 = dateTimeZone0.getName((long) (byte) 0);
        long long19 = dateTimeZone0.previousTransition(117L);
        java.lang.String str20 = dateTimeZone0.getID();
        boolean boolean22 = dateTimeZone0.isStandardOffset(107L);
        int int24 = dateTimeZone0.getOffset((-3599980L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-360000001L) + "'", long6 == (-360000001L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-359999900L) + "'", long8 == (-359999900L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-US" + "'", str14, "en-US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 117L + "'", long19 == 117L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test24104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24104");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long6 = dateTimeZone2.convertLocalToUTC((-1L), false, 0L);
        long long8 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) 100);
        java.lang.String str10 = dateTimeZone2.getShortName((long) (-1));
        java.lang.String str11 = dateTimeZone2.toString();
        long long14 = dateTimeZone2.convertLocalToUTC((long) 'a', false);
        java.util.Locale locale17 = new java.util.Locale("java.io.IOException: java.io.IOException: +00:00");
        java.util.Locale locale18 = locale17.stripExtensions();
        java.lang.String str19 = dateTimeZone2.getShortName((long) (short) 0, locale17);
        java.lang.String str20 = locale17.getDisplayCountry();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-360000001L) + "'", long6 == (-360000001L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-359999900L) + "'", long8 == (-359999900L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+100:00" + "'", str10, "+100:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+100:00" + "'", str11, "+100:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-359999903L) + "'", long14 == (-359999903L));
        org.junit.Assert.assertEquals(locale17.toString(), "java.io.ioexception: java.io.ioexception: +00:00");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "java.io.ioexception: java.io.ioexception: +00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+100:00" + "'", str19, "+100:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test24105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24105");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) 'x');
        boolean boolean5 = dateTimeFormatterBuilder4.canBuildParser();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatterBuilder4.toParser();
        int int7 = dateTimeParser6.estimateParsedLength();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeParser6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 121 + "'", int7 == 121);
    }

    @Test
    public void test24106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24106");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale5.getDisplayVariant();
        java.lang.String str7 = locale5.toLanguageTag();
        java.util.Locale locale9 = new java.util.Locale("zh");
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale5.getDisplayScript(locale9);
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale.Category category13 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder14.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale locale17 = java.util.Locale.US;
        java.lang.String str18 = locale17.getDisplayVariant();
        java.lang.String str19 = locale17.getDisplayLanguage();
        java.util.Locale.Builder builder20 = builder14.setLocale(locale17);
        java.util.Locale locale21 = builder20.build();
        java.util.Locale.setDefault(category13, locale21);
        java.util.Locale.setDefault(locale21);
        java.lang.String str24 = locale21.getDisplayName();
        java.util.Locale.setDefault(category0, locale21);
        java.util.Locale locale26 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kor" + "'", str2, "kor");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category13.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u82f1\u6587" + "'", str19, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "English (United States)" + "'", str24, "English (United States)");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
    }

    @Test
    public void test24107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24107");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long6 = dateTimeZone2.convertLocalToUTC((-1L), false, 0L);
        long long8 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) 100);
        java.lang.String str10 = dateTimeZone2.getName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long13 = dateTimeZone2.convertUTCToLocal((-322079965L));
        java.lang.String str15 = dateTimeZone2.getShortName((long) 'x');
        long long19 = dateTimeZone2.convertLocalToUTC(37920035L, true, 2000L);
        int int21 = dateTimeZone2.getOffset((long) 10);
        int int23 = dateTimeZone2.getOffset(360000096L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean25 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-360000001L) + "'", long6 == (-360000001L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-359999900L) + "'", long8 == (-359999900L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+100:00" + "'", str10, "+100:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 37920035L + "'", long13 == 37920035L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+100:00" + "'", str15, "+100:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-322079965L) + "'", long19 == (-322079965L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 360000000 + "'", int21 == 360000000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 360000000 + "'", int23 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test24108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24108");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendFraction(dateTimeFieldType3, (int) (short) 100, (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder2.appendWeekyear((int) (byte) 1, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendFractionOfHour(360000000, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendClockhourOfHalfday((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendYear(2000, 123);
        boolean boolean19 = dateTimeFormatterBuilder18.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder18.appendTimeZoneOffset("\u6cd5\u6587\u52a0\u62ff\u5927)", "java.io.IOException: dayOfYear", true, (int) (byte) 100, 105);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap26 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.appendTimeZoneShortName(strMap26);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder28.appendTwoDigitYear((-1), true);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder31.appendFixedDecimal(dateTimeFieldType32, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder34.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatterBuilder35.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder35.appendYear((int) (short) 0, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder35.appendDayOfWeek((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap43 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder42.appendTimeZoneShortName(strMap43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType45.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder42.appendText(dateTimeFieldType45);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap48 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder42.appendTimeZoneShortName(strMap48);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder49.appendLiteral("en_US");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder51.appendYear(24, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder51.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatterBuilder55.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType58 = dateTimeFieldType57.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder55.appendText(dateTimeFieldType57);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder35.appendFraction(dateTimeFieldType57, (int) 'x', (int) (byte) 1);
        org.joda.time.Chronology chronology63 = null;
        boolean boolean64 = dateTimeFieldType57.isSupported(chronology63);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder27.appendFraction(dateTimeFieldType57, 98, 59040000);
        java.lang.String str68 = dateTimeFieldType57.getName();
        java.lang.String str69 = dateTimeFieldType57.toString();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "era" + "'", str68, "era");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "era" + "'", str69, "era");
    }

    @Test
    public void test24109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24109");
        java.io.IOException iOException2 = new java.io.IOException("");
        java.io.IOException iOException5 = new java.io.IOException("TWN");
        java.io.IOException iOException6 = new java.io.IOException("\u82f1\u8a9e\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd)", (java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        iOException2.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException11 = new java.io.IOException("");
        java.io.IOException iOException12 = new java.io.IOException("eng", (java.lang.Throwable) iOException11);
        java.io.IOException iOException13 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.io.IOException iOException16 = new java.io.IOException("hi!");
        java.lang.Throwable throwable19 = null;
        java.io.IOException iOException20 = new java.io.IOException(throwable19);
        java.io.IOException iOException21 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException20);
        java.io.IOException iOException22 = new java.io.IOException("eng", (java.lang.Throwable) iOException21);
        iOException16.addSuppressed((java.lang.Throwable) iOException22);
        java.io.IOException iOException24 = new java.io.IOException("", (java.lang.Throwable) iOException16);
        java.io.IOException iOException25 = new java.io.IOException((java.lang.Throwable) iOException24);
        java.lang.Throwable throwable29 = null;
        java.io.IOException iOException30 = new java.io.IOException(throwable29);
        java.io.IOException iOException31 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException30);
        java.io.IOException iOException32 = new java.io.IOException("eng", (java.lang.Throwable) iOException31);
        java.lang.Throwable[] throwableArray33 = iOException31.getSuppressed();
        java.io.IOException iOException34 = new java.io.IOException("en-US", (java.lang.Throwable) iOException31);
        java.io.IOException iOException35 = new java.io.IOException((java.lang.Throwable) iOException34);
        iOException24.addSuppressed((java.lang.Throwable) iOException34);
        iOException13.addSuppressed((java.lang.Throwable) iOException24);
        java.lang.Throwable throwable40 = null;
        java.io.IOException iOException41 = new java.io.IOException(throwable40);
        java.io.IOException iOException42 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException41);
        java.io.IOException iOException43 = new java.io.IOException("eng", (java.lang.Throwable) iOException42);
        java.lang.Throwable[] throwableArray44 = iOException42.getSuppressed();
        java.io.IOException iOException45 = new java.io.IOException((java.lang.Throwable) iOException42);
        java.lang.Throwable throwable48 = null;
        java.io.IOException iOException49 = new java.io.IOException(throwable48);
        java.io.IOException iOException50 = new java.io.IOException("+00:00", (java.lang.Throwable) iOException49);
        java.io.IOException iOException51 = new java.io.IOException("eng", (java.lang.Throwable) iOException50);
        java.lang.Throwable[] throwableArray52 = iOException50.getSuppressed();
        java.io.IOException iOException53 = new java.io.IOException((java.lang.Throwable) iOException50);
        iOException45.addSuppressed((java.lang.Throwable) iOException53);
        java.io.IOException iOException55 = new java.io.IOException((java.lang.Throwable) iOException53);
        iOException24.addSuppressed((java.lang.Throwable) iOException55);
        iOException2.addSuppressed((java.lang.Throwable) iOException24);
        java.io.IOException iOException58 = new java.io.IOException((java.lang.Throwable) iOException24);
        java.io.IOException iOException59 = new java.io.IOException("ENG", (java.lang.Throwable) iOException58);
        java.io.IOException iOException60 = new java.io.IOException((java.lang.Throwable) iOException58);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray52);
    }

    @Test
    public void test24110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24110");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatterBuilder5.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withZone(dateTimeZone9);
        java.util.Locale locale11 = dateTimeFormatter10.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withDefaultYear(31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test24111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24111");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatterBuilder5.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withZoneUTC();
        java.lang.Integer int9 = dateTimeFormatter8.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withDefaultYear(151);
        org.joda.time.format.DateTimeParser dateTimeParser12 = dateTimeFormatter8.getParser();
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(stringBuffer13, 35819999L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeParser12);
    }

    @Test
    public void test24112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24112");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        boolean boolean1 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendMinuteOfHour((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFractionOfMinute((int) (short) 1, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendMinuteOfDay(58);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder8.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getRangeDurationType();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType11.getField(chronology13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder8.appendFixedDecimal(dateTimeFieldType11, 111);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder8.appendMillisOfDay((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNull(durationFieldType12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test24113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24113");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap4 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendTimeZoneShortName(strMap4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendText(dateTimeFieldType6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder2.appendShortText(dateTimeFieldType6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder2.appendLiteral('a');
        boolean boolean12 = dateTimeFormatterBuilder11.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendMonthOfYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder11.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder15.appendTimeZoneOffset("+32:00 (+00:0042,hi!)", true, 51, 2100000);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap21 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder15.appendTimeZoneShortName(strMap21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder15.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder15.appendTimeZoneOffset("zh-TW", true, 160, 115200133);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
    }

    @Test
    public void test24114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24114");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withChronology(chronology4);
        boolean boolean6 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long12 = dateTimeZone10.nextTransition((long) 2000);
        long long16 = dateTimeZone10.convertLocalToUTC((-359999900L), true, (-322079965L));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter8.withZone(dateTimeZone10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter8.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter8.withPivotYear(1440000);
        org.joda.time.format.DateTimeParser dateTimeParser22 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withChronology(chronology24);
        boolean boolean26 = dateTimeFormatter25.isPrinter();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2000L + "'", long12 == 2000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-360000000L) + "'", long16 == (-360000000L));
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNull(dateTimeParser22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test24115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24115");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendLiteral("en_US");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYear(24, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatterBuilder13.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendText(dateTimeFieldType15);
        org.joda.time.format.DateTimeParser dateTimeParser18 = dateTimeFormatterBuilder13.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder13.appendLiteral('x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder21.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder24.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap27 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendTimeZoneShortName(strMap27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str30 = dateTimeFieldType29.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder28.appendDecimal(dateTimeFieldType29, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder25.appendText(dateTimeFieldType29);
        org.joda.time.format.DateTimePrinter dateTimePrinter35 = dateTimeFormatterBuilder34.toPrinter();
        int int36 = dateTimePrinter35.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap38 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder37.appendTimeZoneShortName(strMap38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType40.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder37.appendText(dateTimeFieldType40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatterBuilder42.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser44 = dateTimeFormatter43.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter35, dateTimeParser44);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder20.append(dateTimeParser44);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder20.appendLiteral('4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder48.appendClockhourOfHalfday(2000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder48.appendTwoDigitYear(56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeParser18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "dayOfYear" + "'", str30, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimePrinter35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 58 + "'", int36 == 58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeParser44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
    }

    @Test
    public void test24116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24116");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        boolean boolean10 = dateTimeFormatterBuilder7.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendMinuteOfHour((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        int int16 = dateTimeFormatter15.getDefaultYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder12.append(dateTimeFormatter15);
        java.util.Locale locale18 = dateTimeFormatter15.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withOffsetParsed();
        java.lang.Appendable appendable20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(appendable20, readableInstant21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2000 + "'", int16 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test24117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24117");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder1.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.getDisplayVariant();
        java.lang.String str6 = locale4.getDisplayLanguage();
        java.util.Locale.Builder builder7 = builder1.setLocale(locale4);
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.setDefault(category0, locale8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long16 = dateTimeZone12.convertLocalToUTC((-1L), false, 0L);
        long long18 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 100);
        java.lang.String str20 = dateTimeZone12.getName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        long long23 = dateTimeZone12.convertUTCToLocal((-322079965L));
        int int25 = dateTimeZone12.getOffset((long) '#');
        java.lang.String str26 = dateTimeZone12.getID();
        java.util.Locale locale28 = java.util.Locale.CHINESE;
        java.util.Locale locale29 = java.util.Locale.CHINESE;
        java.lang.String str30 = locale28.getDisplayVariant(locale29);
        java.lang.String str31 = locale28.getDisplayLanguage();
        java.util.Locale locale32 = java.util.Locale.CHINESE;
        java.util.Locale locale33 = java.util.Locale.CHINESE;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        java.lang.String str35 = locale28.getDisplayLanguage(locale33);
        java.lang.String str36 = dateTimeZone12.getShortName(360000096L, locale28);
        java.util.Set<java.lang.String> strSet37 = locale28.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale28);
        java.util.Locale locale39 = java.util.Locale.CHINESE;
        java.util.Locale locale40 = java.util.Locale.CHINESE;
        java.lang.String str41 = locale39.getDisplayVariant(locale40);
        java.lang.String str42 = locale39.getDisplayLanguage();
        java.util.Locale locale43 = java.util.Locale.CHINESE;
        java.util.Locale locale44 = java.util.Locale.CHINESE;
        java.lang.String str45 = locale43.getDisplayVariant(locale44);
        java.lang.String str46 = locale39.getDisplayLanguage(locale44);
        java.util.Locale locale47 = java.util.Locale.ITALY;
        java.lang.String str48 = locale44.getDisplayCountry(locale47);
        java.util.Set<java.lang.Character> charSet49 = locale44.getExtensionKeys();
        java.util.Locale locale50 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str51 = locale50.getVariant();
        java.util.Locale locale52 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimePrinter dateTimePrinter53 = null;
        org.joda.time.format.DateTimeParser dateTimeParser54 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter53, dateTimeParser54);
        int int56 = dateTimeFormatter55.getDefaultYear();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter55.withChronology(chronology57);
        java.util.Locale locale59 = java.util.Locale.CHINESE;
        java.util.Locale locale60 = java.util.Locale.CHINESE;
        java.lang.String str61 = locale59.getDisplayVariant(locale60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter58.withLocale(locale60);
        java.lang.String str63 = locale52.getDisplayScript(locale60);
        java.lang.String str64 = locale60.getVariant();
        java.util.Locale locale65 = locale60.stripExtensions();
        java.lang.String str66 = locale50.getDisplayLanguage(locale65);
        java.lang.String str67 = locale44.getDisplayScript(locale65);
        java.util.Locale.setDefault(category0, locale65);
        java.util.Locale locale69 = java.util.Locale.getDefault(category0);
        java.util.Locale.Builder builder70 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder72 = builder70.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder73 = builder72.clear();
        java.util.Locale locale74 = builder72.build();
        java.lang.String str75 = locale74.getScript();
        java.lang.String str76 = locale74.getDisplayName();
        java.util.Locale.setDefault(category0, locale74);
        java.util.Locale locale78 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\uc601\uc5b4" + "'", str6, "\uc601\uc5b4");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-360000001L) + "'", long16 == (-360000001L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-359999900L) + "'", long18 == (-359999900L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+100:00" + "'", str20, "+100:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 37920035L + "'", long23 == 37920035L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 360000000 + "'", int25 == 360000000);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+100:00" + "'", str26, "+100:00");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Chinese" + "'", str31, "Chinese");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u4e2d\u6587" + "'", str35, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+100:00" + "'", str36, "+100:00");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e2d\u6587" + "'", str42, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\u4e2d\u6587" + "'", str46, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ja");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2000 + "'", int56 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\u4e2d\u6587" + "'", str66, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh");
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "");
    }

    @Test
    public void test24118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24118");
        java.util.Locale locale3 = new java.util.Locale("+100:005", "java.io.ioexception", "990000000000000+00:005");
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "+100:005_JAVA.IO.IOEXCEPTION_990000000000000+00:005");
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test24119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24119");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 0);
        java.util.Locale locale11 = java.util.Locale.PRC;
        boolean boolean12 = locale11.hasExtensions();
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.lang.String str14 = locale11.getDisplayScript(locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter6.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withOffsetParsed();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withChronology(chronology17);
        java.io.Writer writer19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter18.printTo(writer19, readableInstant20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test24120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24120");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendShortText(dateTimeFieldType8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendLiteral('a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTimeZoneShortName(strMap13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str16 = dateTimeFieldType15.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder14.appendDecimal(dateTimeFieldType15, (int) (byte) 0, (int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType15.getDurationType();
        java.lang.String str21 = dateTimeFieldType15.getName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder11.appendText(dateTimeFieldType15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap24 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendTimeZoneShortName(strMap24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str27 = dateTimeFieldType26.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder25.appendDecimal(dateTimeFieldType26, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap31 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendTimeZoneName(strMap31);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder30.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder34.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder34.appendClockhourOfHalfday((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder34.appendTwoDigitYear(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder34.appendDayOfYear(2000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap44 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendTimeZoneShortName(strMap44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str47 = dateTimeFieldType46.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder45.appendDecimal(dateTimeFieldType46, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap51 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder50.appendTimeZoneName(strMap51);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder50.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder54.appendFractionOfDay(0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder57.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder58.appendHourOfHalfday(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder60.appendMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder60.appendSignedDecimal(dateTimeFieldType63, 24, (int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType68 = dateTimeFieldType67.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder71 = dateTimeFormatterBuilder60.appendSignedDecimal(dateTimeFieldType67, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder72 = dateTimeFormatterBuilder71.appendEraText();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTimeField dateTimeField75 = dateTimeFieldType73.getField(chronology74);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder77 = dateTimeFormatterBuilder71.appendFixedSignedDecimal(dateTimeFieldType73, (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder80 = dateTimeFormatterBuilder42.appendSignedDecimal(dateTimeFieldType73, (int) (short) 0, 58);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder83 = dateTimeFormatterBuilder22.appendDecimal(dateTimeFieldType73, 579, (int) 'u');
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.DateTimeField dateTimeField85 = dateTimeFieldType73.getField(chronology84);
        org.joda.time.DurationFieldType durationFieldType86 = dateTimeFieldType73.getRangeDurationType();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "dayOfYear" + "'", str16, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "dayOfYear" + "'", str21, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "dayOfYear" + "'", str27, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "dayOfYear" + "'", str47, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder71);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder72);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder77);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder80);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder83);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(durationFieldType86);
    }

    @Test
    public void test24121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24121");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((-1L), false, 0L);
        int int7 = dateTimeZone1.getStandardOffset(1L);
        java.lang.String str9 = dateTimeZone1.getName((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) ' ');
        long long15 = dateTimeZone12.adjustOffset((-359999900L), true);
        boolean boolean16 = dateTimeZone12.isFixed();
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        int int21 = dateTimeZone12.getStandardOffset((-719999991L));
        java.lang.String str23 = dateTimeZone12.getName((-246239883L));
        int int25 = dateTimeZone12.getStandardOffset(2099989L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-360000001L) + "'", long5 == (-360000001L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360000000 + "'", int7 == 360000000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+100:00" + "'", str9, "+100:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-359999900L) + "'", long15 == (-359999900L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 322080000L + "'", long18 == 322080000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 37920000 + "'", int21 == 37920000);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+10:32" + "'", str23, "+10:32");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 37920000 + "'", int25 == 37920000);
    }

    @Test
    public void test24122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24122");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFractionOfDay(0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendHourOfHalfday(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder17.appendSignedDecimal(dateTimeFieldType20, 24, (int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder17.appendFractionOfSecond((int) '#', (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder17.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap29 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder28.appendTimeZoneShortName(strMap29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType32 = dateTimeFieldType31.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder28.appendText(dateTimeFieldType31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatterBuilder33.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser35 = dateTimeFormatter34.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter34.withPivotYear((int) 'u');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter34.withDefaultYear(56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter34.withDefaultYear(60000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter41.withPivotYear((java.lang.Integer) 115200127);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder27.append(dateTimeFormatter43);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder27.appendTwoDigitWeekyear(630, true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeParser35);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
    }

    @Test
    public void test24123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24123");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale2.getDisplayScript();
        java.lang.String str4 = locale2.toLanguageTag();
        java.util.Locale locale5 = java.util.Locale.US;
        java.lang.String str6 = locale2.getDisplayName(locale5);
        java.util.Locale locale7 = java.util.Locale.JAPANESE;
        java.lang.String str8 = locale2.getDisplayLanguage(locale7);
        java.lang.String str9 = locale7.toLanguageTag();
        java.lang.String str10 = dateTimeZone0.getShortName((long) ' ', locale7);
        java.lang.String str11 = dateTimeZone0.getID();
        boolean boolean12 = dateTimeZone0.isFixed();
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale14.getLanguage();
        java.util.Locale locale16 = locale14.stripExtensions();
        java.util.Locale.setDefault(locale14);
        java.lang.String str18 = dateTimeZone0.getName(361440000L, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-US" + "'", str4, "en-US");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United States)" + "'", str6, "English (United States)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u82f1\u8a9e" + "'", str8, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ja" + "'", str9, "ja");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:32" + "'", str10, "+10:32");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:32" + "'", str11, "+10:32");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh" + "'", str15, "zh");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+10:32" + "'", str18, "+10:32");
    }

    @Test
    public void test24124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24124");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale locale10 = java.util.Locale.getDefault(category6);
        java.lang.String str11 = locale10.getDisplayScript();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long18 = dateTimeZone14.convertLocalToUTC((-1L), false, 0L);
        long long20 = dateTimeZone12.getMillisKeepLocal(dateTimeZone14, (long) 100);
        java.lang.String str22 = dateTimeZone14.getName(1L);
        long long25 = dateTimeZone14.adjustOffset((long) (short) 1, false);
        long long28 = dateTimeZone14.convertLocalToUTC((-322079965L), false);
        java.util.Locale locale31 = new java.util.Locale("Chinese");
        java.lang.String str33 = locale31.getExtension('x');
        java.lang.String str34 = dateTimeZone14.getShortName((long) 115200000, locale31);
        java.util.Locale locale36 = java.util.Locale.US;
        java.lang.String str37 = locale36.getDisplayScript();
        java.lang.String str38 = locale36.toLanguageTag();
        java.util.Set<java.lang.String> strSet39 = locale36.getUnicodeLocaleKeys();
        java.util.Locale locale40 = java.util.Locale.JAPANESE;
        java.lang.String str41 = locale36.getDisplayCountry(locale40);
        java.lang.String str42 = locale36.getDisplayName();
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        java.util.Locale locale44 = java.util.Locale.CHINESE;
        java.util.Locale locale45 = java.util.Locale.CHINESE;
        java.lang.String str46 = locale44.getDisplayVariant(locale45);
        java.lang.String str47 = locale44.getDisplayLanguage();
        java.util.Locale locale48 = java.util.Locale.CHINESE;
        java.util.Locale locale49 = java.util.Locale.CHINESE;
        java.lang.String str50 = locale48.getDisplayVariant(locale49);
        java.lang.String str51 = locale44.getDisplayLanguage(locale49);
        java.lang.String str52 = locale43.getDisplayLanguage(locale44);
        java.lang.String str53 = locale36.getDisplayName(locale44);
        java.lang.String str54 = dateTimeZone14.getName(97L, locale44);
        java.lang.String str55 = locale10.getDisplayLanguage(locale44);
        java.util.Locale.Builder builder56 = builder2.setLocale(locale44);
        java.util.Locale.Builder builder57 = builder2.clear();
        java.util.Locale.Builder builder58 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder60 = builder58.setScript("+100:009+100:0013333333449January0000000000000000000000081");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: +100:009+100:0013333333449January0000000000000000000000081 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "kor" + "'", str8, "kor");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-37920001L) + "'", long18 == (-37920001L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-37919900L) + "'", long20 == (-37919900L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:32" + "'", str22, "+10:32");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-359999965L) + "'", long28 == (-359999965L));
        org.junit.Assert.assertEquals(locale31.toString(), "chinese");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+10:32" + "'", str34, "+10:32");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "en-US" + "'", str38, "en-US");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd" + "'", str41, "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\uc601\uc5b4\ubbf8\uad6d)" + "'", str42, "\uc601\uc5b4\ubbf8\uad6d)");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "de");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str47, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u4e2d\u6587" + "'", str51, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\u5fb7\u6587" + "'", str52, "\u5fb7\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\u82f1\u6587\u7f8e\u56fd)" + "'", str53, "\u82f1\u6587\u7f8e\u56fd)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+10:32" + "'", str54, "+10:32");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\u671d\u9c9c\u6587" + "'", str55, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test24125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24125");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withChronology(chronology3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        int int10 = dateTimeFormatter9.getDefaultYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withChronology(chronology11);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale13.getDisplayVariant(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withLocale(locale14);
        java.lang.String str17 = locale6.getDisplayScript(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter4.withLocale(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeFormatter4.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter4.withDefaultYear(115200000);
        org.joda.time.Chronology chronology24 = dateTimeFormatter4.getChronolgy();
        org.joda.time.format.DateTimeParser dateTimeParser25 = dateTimeFormatter4.getParser();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter4.withZone(dateTimeZone27);
        boolean boolean29 = dateTimeFormatter4.isOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2000 + "'", int10 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNull(chronology24);
        org.junit.Assert.assertNull(dateTimeParser25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test24126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24126");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        int int3 = dateTimeZone1.getOffsetFromLocal((-115200152L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        long long8 = dateTimeZone4.convertLocalToUTC(37920097L, false, (-115200000L));
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (-395999989L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 360000000 + "'", int3 == 360000000);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-73919989L) + "'", long10 == (-73919989L));
    }

    @Test
    public void test24127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24127");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withChronology(chronology4);
        boolean boolean6 = dateTimeFormatter2.isParser();
        int int7 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(94);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withZone(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTimeFormatter10.parseDateTime("\uc601\uc5b4\ubbf8\uad6d)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test24128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24128");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withChronology(chronology4);
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withLocale(locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((java.lang.Integer) 58);
        org.joda.time.Chronology chronology12 = dateTimeFormatter9.getChronolgy();
        boolean boolean13 = dateTimeFormatter9.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        long long20 = dateTimeZone16.convertLocalToUTC((-1L), false, 0L);
        long long22 = dateTimeZone14.getMillisKeepLocal(dateTimeZone16, (long) 100);
        java.lang.String str24 = dateTimeZone16.getName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        long long27 = dateTimeZone16.convertUTCToLocal((-322079965L));
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.lang.String str30 = locale29.getLanguage();
        java.lang.String str31 = locale29.getISO3Country();
        java.lang.String str32 = dateTimeZone16.getShortName((long) (byte) 1, locale29);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder36 = builder34.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder38 = builder36.setRegion("");
        java.util.Locale locale39 = builder38.build();
        java.util.Locale locale40 = builder38.build();
        boolean boolean41 = dateTimeZone16.equals((java.lang.Object) locale40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter9.withZone(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNull(chronology12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-37920001L) + "'", long20 == (-37920001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-37919900L) + "'", long22 == (-37919900L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:32" + "'", str24, "+10:32");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-284159965L) + "'", long27 == (-284159965L));
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ko" + "'", str30, "ko");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+10:32" + "'", str32, "+10:32");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
    }

    @Test
    public void test24129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24129");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFractionOfDay(0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendHourOfHalfday(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder17.appendSignedDecimal(dateTimeFieldType20, 24, (int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType24.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder17.appendSignedDecimal(dateTimeFieldType24, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder28.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder28.appendCenturyOfEra(69, 360000124);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder32.appendHourOfDay(23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
    }

    @Test
    public void test24130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24130");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test24131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24131");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFractionOfDay(0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatterBuilder14.toFormatter();
        java.lang.Integer int17 = dateTimeFormatter16.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter16.withPivotYear((int) 'x');
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = dateTimeFormatter16.getPrinter();
        java.lang.Integer int21 = dateTimeFormatter16.getPivotYear();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimePrinter20);
        org.junit.Assert.assertNull(int21);
    }

    @Test
    public void test24132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24132");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withChronology(chronology3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        int int10 = dateTimeFormatter9.getDefaultYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withChronology(chronology11);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale13.getDisplayVariant(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withLocale(locale14);
        java.lang.String str17 = locale6.getDisplayScript(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter4.withLocale(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeFormatter4.getZone();
        boolean boolean22 = dateTimeFormatter4.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter4.withZoneUTC();
        java.lang.Integer int24 = dateTimeFormatter23.getPivotYear();
        org.joda.time.Chronology chronology25 = dateTimeFormatter23.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter23.withDefaultYear(39120000);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeFormatter27.getZone();
        boolean boolean29 = dateTimeFormatter27.isParser();
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2000 + "'", int10 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test24133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24133");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder11.appendClockhourOfHalfday((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder15.appendFractionOfSecond((int) 'x', 236);
        java.lang.Class<?> wildcardClass20 = dateTimeFormatterBuilder15.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test24134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24134");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFractionOfDay(0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendHourOfHalfday(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder17.appendSignedDecimal(dateTimeFieldType20, 24, (int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType24.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder17.appendSignedDecimal(dateTimeFieldType24, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder28.appendEraText();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType30.getField(chronology31);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder28.appendFixedSignedDecimal(dateTimeFieldType30, (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap36 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendTimeZoneShortName(strMap36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str39 = dateTimeFieldType38.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder37.appendDecimal(dateTimeFieldType38, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap44 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendTimeZoneShortName(strMap44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType47 = dateTimeFieldType46.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder43.appendText(dateTimeFieldType46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatterBuilder48.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser50 = dateTimeFormatter49.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder37.append(dateTimeParser50);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder34.appendOptional(dateTimeParser50);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder34.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder53.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder54.appendDayOfYear(1440000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder56.appendTimeZoneShortName();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "dayOfYear" + "'", str39, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNotNull(dateTimeParser50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
    }

    @Test
    public void test24135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24135");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTimeZoneShortName(strMap13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str16 = dateTimeFieldType15.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder14.appendDecimal(dateTimeFieldType15, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap20 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendTimeZoneName(strMap20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder19.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder23.appendFractionOfDay(0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendHourOfHalfday(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder29.appendSignedDecimal(dateTimeFieldType32, 24, (int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType37 = dateTimeFieldType36.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder29.appendSignedDecimal(dateTimeFieldType36, (int) (byte) 0, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder7.appendShortText(dateTimeFieldType36);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder7.appendMonthOfYearShortText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap43 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder42.appendTimeZoneName(strMap43);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap46 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder45.appendTimeZoneShortName(strMap46);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType49 = dateTimeFieldType48.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder45.appendText(dateTimeFieldType48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatterBuilder50.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser52 = dateTimeFormatter51.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter51.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter53.withPivotYear(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder42.append(dateTimeFormatter55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter55.withDefaultYear(60000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter55.withDefaultYear((int) (byte) 1);
        java.util.Locale locale61 = dateTimeFormatter60.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser62 = dateTimeFormatter60.getParser();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "dayOfYear" + "'", str16, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeParser52);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNull(locale61);
        org.junit.Assert.assertNotNull(dateTimeParser62);
    }

    @Test
    public void test24136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24136");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withChronology(chronology5);
        java.lang.Integer int7 = dateTimeFormatter6.getPivotYear();
        boolean boolean8 = dateTimeFormatter6.isParser();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long14 = dateTimeZone10.convertLocalToUTC((-1L), false, 0L);
        int int16 = dateTimeZone10.getStandardOffset(1L);
        long long18 = dateTimeZone10.previousTransition((long) (short) 0);
        java.lang.String str20 = dateTimeZone10.getShortName((-1L));
        int int22 = dateTimeZone10.getOffsetFromLocal(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter6.withZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        long long30 = dateTimeZone26.convertLocalToUTC((-1L), false, 0L);
        long long32 = dateTimeZone24.getMillisKeepLocal(dateTimeZone26, (long) 100);
        java.lang.String str34 = dateTimeZone26.getShortName((long) (-1));
        java.util.Locale.Category category36 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale37 = java.util.Locale.KOREAN;
        java.lang.String str38 = locale37.getISO3Language();
        java.util.Locale.setDefault(category36, locale37);
        java.lang.String str40 = dateTimeZone26.getShortName(97L, locale37);
        java.util.Locale locale41 = java.util.Locale.US;
        java.lang.String str42 = locale41.getDisplayScript();
        java.lang.String str43 = locale41.toLanguageTag();
        java.util.Locale locale44 = java.util.Locale.US;
        java.lang.String str45 = locale41.getDisplayName(locale44);
        java.lang.String str46 = locale44.getISO3Language();
        java.lang.String str47 = locale44.getCountry();
        java.lang.String str48 = locale37.getDisplayVariant(locale44);
        java.util.Locale locale49 = java.util.Locale.US;
        java.util.Locale locale50 = java.util.Locale.CHINESE;
        java.util.Locale locale51 = java.util.Locale.CHINESE;
        java.lang.String str52 = locale50.getDisplayVariant(locale51);
        boolean boolean53 = locale50.hasExtensions();
        java.lang.String str54 = locale50.getScript();
        java.lang.String str55 = locale49.getDisplayCountry(locale50);
        java.util.Locale locale56 = java.util.Locale.GERMAN;
        java.util.Locale locale57 = java.util.Locale.CHINESE;
        java.util.Locale locale58 = java.util.Locale.CHINESE;
        java.lang.String str59 = locale57.getDisplayVariant(locale58);
        java.lang.String str60 = locale57.getDisplayLanguage();
        java.util.Locale locale61 = java.util.Locale.CHINESE;
        java.util.Locale locale62 = java.util.Locale.CHINESE;
        java.lang.String str63 = locale61.getDisplayVariant(locale62);
        java.lang.String str64 = locale57.getDisplayLanguage(locale62);
        java.lang.String str65 = locale56.getDisplayLanguage(locale57);
        java.lang.String str66 = locale50.getDisplayVariant(locale56);
        java.lang.String str67 = locale37.getDisplayVariant(locale56);
        java.util.Locale locale68 = java.util.Locale.US;
        java.util.Locale locale69 = java.util.Locale.CHINESE;
        java.util.Locale locale70 = java.util.Locale.CHINESE;
        java.lang.String str71 = locale69.getDisplayVariant(locale70);
        boolean boolean72 = locale69.hasExtensions();
        java.lang.String str73 = locale69.getScript();
        java.lang.String str74 = locale68.getDisplayCountry(locale69);
        java.util.Locale locale75 = java.util.Locale.GERMAN;
        java.util.Locale locale76 = java.util.Locale.CHINESE;
        java.util.Locale locale77 = java.util.Locale.CHINESE;
        java.lang.String str78 = locale76.getDisplayVariant(locale77);
        java.lang.String str79 = locale76.getDisplayLanguage();
        java.util.Locale locale80 = java.util.Locale.CHINESE;
        java.util.Locale locale81 = java.util.Locale.CHINESE;
        java.lang.String str82 = locale80.getDisplayVariant(locale81);
        java.lang.String str83 = locale76.getDisplayLanguage(locale81);
        java.lang.String str84 = locale75.getDisplayLanguage(locale76);
        java.lang.String str85 = locale69.getDisplayVariant(locale75);
        java.lang.String str86 = locale56.getDisplayLanguage(locale75);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter87 = dateTimeFormatter23.withLocale(locale56);
        java.lang.String str88 = dateTimeZone0.getName(9L, locale56);
        java.lang.String str90 = dateTimeZone0.getShortName(397920015L);
        boolean boolean91 = dateTimeZone0.isFixed();
        long long95 = dateTimeZone0.convertLocalToUTC((-35998045L), false, (-397918010L));
        org.joda.time.ReadableInstant readableInstant96 = null;
        int int97 = dateTimeZone0.getOffset(readableInstant96);
        long long99 = dateTimeZone0.previousTransition((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-37920001L) + "'", long14 == (-37920001L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 37920000 + "'", int16 == 37920000);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:32" + "'", str20, "+10:32");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 37920000 + "'", int22 == 37920000);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-37920001L) + "'", long30 == (-37920001L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-37919900L) + "'", long32 == (-37919900L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+10:32" + "'", str34, "+10:32");
        org.junit.Assert.assertTrue("'" + category36 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category36.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "kor" + "'", str38, "kor");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+10:32" + "'", str40, "+10:32");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "en-US" + "'", str43, "en-US");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "English (United States)" + "'", str45, "English (United States)");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "eng" + "'", str46, "eng");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "US" + "'", str47, "US");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\u7f8e\u56fd" + "'", str55, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "de");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str60, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\u4e2d\u6587" + "'", str64, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\u5fb7\u6587" + "'", str65, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\u7f8e\u56fd" + "'", str74, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "de");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str79, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "zh");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\u4e2d\u6587" + "'", str83, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\u5fb7\u6587" + "'", str84, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Deutsch" + "'", str86, "Deutsch");
        org.junit.Assert.assertNotNull(dateTimeFormatter87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "+00:00" + "'", str88, "+00:00");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "+00:00" + "'", str90, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + (-35998045L) + "'", long95 == (-35998045L));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + long99 + "' != '" + (-1L) + "'", long99 == (-1L));
    }

    @Test
    public void test24137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24137");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.addUnicodeLocaleAttribute("German");
        java.util.Locale.Builder builder9 = builder3.setExtension('a', "inglese");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder9.setLanguageTag("ita");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test24138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24138");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long6 = dateTimeZone2.convertLocalToUTC((-1L), false, 0L);
        long long8 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) 100);
        java.lang.String str10 = dateTimeZone2.getName(1L);
        long long12 = dateTimeZone2.nextTransition((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long19 = dateTimeZone15.convertLocalToUTC((-1L), false, 0L);
        long long21 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) 100);
        java.lang.String str23 = dateTimeZone15.getShortName((long) (-1));
        java.util.Locale.Category category25 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.lang.String str27 = locale26.getISO3Language();
        java.util.Locale.setDefault(category25, locale26);
        java.lang.String str29 = dateTimeZone15.getShortName(97L, locale26);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone15.isLocalDateTimeGap(localDateTime30);
        long long34 = dateTimeZone15.adjustOffset((long) ' ', false);
        long long36 = dateTimeZone2.getMillisKeepLocal(dateTimeZone15, (long) (byte) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        java.lang.String str39 = dateTimeZone15.getName((-322079955L));
        java.lang.String str41 = dateTimeZone15.getName((long) 60000);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours(100);
        long long47 = dateTimeZone43.convertLocalToUTC(77280024L, true, 359999999L);
        long long49 = dateTimeZone15.getMillisKeepLocal(dateTimeZone43, (-323519955L));
        int int51 = dateTimeZone15.getOffset((-2100001L));
        int int53 = dateTimeZone15.getOffsetFromLocal((-2122919900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-37920001L) + "'", long6 == (-37920001L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-37919900L) + "'", long8 == (-37919900L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:32" + "'", str10, "+10:32");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-37920001L) + "'", long19 == (-37920001L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-37919900L) + "'", long21 == (-37919900L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+10:32" + "'", str23, "+10:32");
        org.junit.Assert.assertTrue("'" + category25 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category25.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "kor" + "'", str27, "kor");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+10:32" + "'", str29, "+10:32");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+10:32" + "'", str39, "+10:32");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+10:32" + "'", str41, "+10:32");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-282719976L) + "'", long47 == (-282719976L));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-645599955L) + "'", long49 == (-645599955L));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 37920000 + "'", int51 == 37920000);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 37920000 + "'", int53 == 37920000);
    }

    @Test
    public void test24139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24139");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(46, 0);
        java.lang.String str4 = dateTimeZone2.getShortName((-718560001L));
        java.lang.String str6 = dateTimeZone2.getName((long) 183600000);
        java.lang.String str8 = dateTimeZone2.getNameKey(363600020L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+46:00" + "'", str4, "+46:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+46:00" + "'", str6, "+46:00");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test24140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24140");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder3.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendFractionOfSecond((int) '4', (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder4.appendMinuteOfDay((int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder4.appendTwoDigitYear(16, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendTwoDigitWeekyear(120, false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
    }

    @Test
    public void test24141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24141");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendShortText(dateTimeFieldType8);
        boolean boolean10 = dateTimeFormatterBuilder9.canBuildParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendFixedSignedDecimal(dateTimeFieldType11, (int) '4');
        dateTimeFormatterBuilder13.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap16 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendTimeZoneShortName(strMap16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str19 = dateTimeFieldType18.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder17.appendDecimal(dateTimeFieldType18, (int) (byte) 0, (int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendShortText(dateTimeFieldType23);
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType23.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder13.appendFraction(dateTimeFieldType23, 2000, (int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap30 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendTimeZoneShortName(strMap30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str33 = dateTimeFieldType32.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder31.appendDecimal(dateTimeFieldType32, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap37 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendTimeZoneName(strMap37);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder36.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder40.appendFractionOfDay(0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder43.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder44.appendHourOfHalfday(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder46.appendMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder46.appendSignedDecimal(dateTimeFieldType49, 24, (int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder13.appendDecimal(dateTimeFieldType49, (int) '#', (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder55.appendMinuteOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder57.appendWeekOfWeekyear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatterBuilder59.toFormatter();
        java.util.Locale locale64 = new java.util.Locale("kor", "US", "dayOfYear");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter60.withLocale(locale64);
        java.util.Locale locale66 = dateTimeFormatter60.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter60.withDefaultYear((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = dateTimeFormatter60.print(387L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "dayOfYear" + "'", str19, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNull(durationFieldType25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "dayOfYear" + "'", str33, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertEquals(locale64.toString(), "kor_US_dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNull(locale66);
        org.junit.Assert.assertNotNull(dateTimeFormatter68);
    }

    @Test
    public void test24142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24142");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withChronology(chronology4);
        boolean boolean6 = dateTimeFormatter5.isParser();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter5.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter5.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withPivotYear(24);
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter10.printTo(stringBuffer11, readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test24143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24143");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendDayOfMonth((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendTimeZoneShortName(strMap7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str10 = dateTimeFieldType9.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder8.appendDecimal(dateTimeFieldType9, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap14 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendTimeZoneName(strMap14);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendHourOfHalfday((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder13.appendMinuteOfDay((int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder13.appendLiteral(' ');
        boolean boolean24 = dateTimeFormatterBuilder23.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.appendClockhourOfDay((int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder25.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder25.appendTwoDigitWeekyear(21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder25.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap33 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder32.appendTimeZoneShortName(strMap33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType35.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder32.appendText(dateTimeFieldType35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatterBuilder37.toFormatter();
        boolean boolean39 = dateTimeFormatterBuilder37.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder37.appendMinuteOfHour((int) (byte) 100);
        boolean boolean42 = dateTimeFormatterBuilder41.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder41.appendDayOfYear(360000000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder44.appendMinuteOfDay((int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder47.appendText(dateTimeFieldType48);
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType48.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder44.appendFixedDecimal(dateTimeFieldType48, 151);
        org.joda.time.Chronology chronology53 = null;
        boolean boolean54 = dateTimeFieldType48.isSupported(chronology53);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder25.appendFixedDecimal(dateTimeFieldType48, 236);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder5.appendShortText(dateTimeFieldType48);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder57.appendLiteral(' ');
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "dayOfYear" + "'", str10, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(durationFieldType50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
    }

    @Test
    public void test24144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24144");
        java.util.Locale.Category category0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long7 = dateTimeZone3.convertLocalToUTC((-1L), false, 0L);
        long long9 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 100);
        java.lang.String str11 = dateTimeZone3.getShortName((long) (-1));
        java.util.Locale.Category category13 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.lang.String str15 = locale14.getISO3Language();
        java.util.Locale.setDefault(category13, locale14);
        java.lang.String str17 = dateTimeZone3.getShortName(97L, locale14);
        java.util.Locale locale18 = java.util.Locale.US;
        java.lang.String str19 = locale18.getDisplayScript();
        java.lang.String str20 = locale18.toLanguageTag();
        java.util.Locale locale21 = java.util.Locale.US;
        java.lang.String str22 = locale18.getDisplayName(locale21);
        java.lang.String str23 = locale21.getISO3Language();
        java.lang.String str24 = locale21.getCountry();
        java.lang.String str25 = locale14.getDisplayVariant(locale21);
        java.util.Locale locale26 = java.util.Locale.US;
        java.util.Locale locale27 = java.util.Locale.CHINESE;
        java.util.Locale locale28 = java.util.Locale.CHINESE;
        java.lang.String str29 = locale27.getDisplayVariant(locale28);
        boolean boolean30 = locale27.hasExtensions();
        java.lang.String str31 = locale27.getScript();
        java.lang.String str32 = locale26.getDisplayCountry(locale27);
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.util.Locale locale34 = java.util.Locale.CHINESE;
        java.util.Locale locale35 = java.util.Locale.CHINESE;
        java.lang.String str36 = locale34.getDisplayVariant(locale35);
        java.lang.String str37 = locale34.getDisplayLanguage();
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        java.util.Locale locale39 = java.util.Locale.CHINESE;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        java.lang.String str41 = locale34.getDisplayLanguage(locale39);
        java.lang.String str42 = locale33.getDisplayLanguage(locale34);
        java.lang.String str43 = locale27.getDisplayVariant(locale33);
        java.lang.String str44 = locale14.getDisplayVariant(locale33);
        java.util.Locale.Builder builder45 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder47 = builder45.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale locale48 = java.util.Locale.US;
        java.lang.String str49 = locale48.getDisplayVariant();
        java.lang.String str50 = locale48.getDisplayLanguage();
        java.util.Locale.Builder builder51 = builder45.setLocale(locale48);
        java.util.Locale locale52 = builder51.build();
        java.lang.String str53 = locale52.getDisplayScript();
        java.lang.String str54 = locale33.getDisplayLanguage(locale52);
        java.util.Locale.Builder builder55 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder57 = builder55.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder59 = builder55.setRegion("US");
        java.util.Locale.Builder builder60 = builder55.clear();
        java.util.Locale locale61 = builder60.build();
        java.lang.String str62 = locale33.getDisplayLanguage(locale61);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-37920001L) + "'", long7 == (-37920001L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-37919900L) + "'", long9 == (-37919900L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:32" + "'", str11, "+10:32");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category13.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "kor" + "'", str15, "kor");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:32" + "'", str17, "+10:32");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en-US" + "'", str20, "en-US");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "English (United States)" + "'", str22, "English (United States)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "eng" + "'", str23, "eng");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "US" + "'", str24, "US");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u7f8e\u56fd" + "'", str32, "\u7f8e\u56fd");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str37, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u4e2d\u6587" + "'", str41, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u5fb7\u6587" + "'", str42, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\uc601\uc5b4" + "'", str50, "\uc601\uc5b4");
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "German" + "'", str54, "German");
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "German" + "'", str62, "German");
    }

    @Test
    public void test24145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24145");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        boolean boolean10 = dateTimeFormatterBuilder7.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendDayOfWeekText();
        boolean boolean14 = dateTimeFormatterBuilder13.canBuildParser();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test24146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24146");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendSecondOfMinute(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendYearOfCentury((int) (byte) 1, 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withChronology(chronology12);
        java.lang.Integer int14 = dateTimeFormatter13.getPivotYear();
        java.util.Locale locale15 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        int int19 = dateTimeFormatter18.getDefaultYear();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter18.withChronology(chronology20);
        java.util.Locale locale22 = java.util.Locale.CHINESE;
        java.util.Locale locale23 = java.util.Locale.CHINESE;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter21.withLocale(locale23);
        java.lang.String str26 = locale15.getDisplayScript(locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter13.withLocale(locale23);
        java.util.Locale locale28 = dateTimeFormatter13.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser29 = dateTimeFormatter13.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder8.append(dateTimeFormatter13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter13.withPivotYear(121);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ja");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2000 + "'", int19 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNull(dateTimeParser29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
    }

    @Test
    public void test24147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24147");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withChronology(chronology3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withDefaultYear(1);
        java.util.Locale locale10 = new java.util.Locale("zh");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter4.withLocale(locale10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long21 = dateTimeZone17.convertLocalToUTC((-1L), false, 0L);
        long long23 = dateTimeZone15.getMillisKeepLocal(dateTimeZone17, (long) 100);
        java.lang.String str25 = dateTimeZone17.getName(1L);
        long long27 = dateTimeZone14.getMillisKeepLocal(dateTimeZone17, (long) '#');
        java.lang.String str29 = dateTimeZone17.getNameKey(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter4.withZone(dateTimeZone17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter4.withDefaultYear((-60001));
        java.lang.Appendable appendable33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter32.printTo(appendable33, readableInstant34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-37920001L) + "'", long21 == (-37920001L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-37919900L) + "'", long23 == (-37919900L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+10:32" + "'", str25, "+10:32");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 35L + "'", long27 == 35L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
    }

    @Test
    public void test24148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24148");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendFraction(dateTimeFieldType3, (int) (short) 100, (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder2.appendSecondOfMinute(24);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap10 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendTimeZoneShortName(strMap10);
        dateTimeFormatterBuilder11.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap17 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendTimeZoneShortName(strMap17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder16.appendText(dateTimeFieldType19);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder15.appendShortText(dateTimeFieldType19);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder15.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder15.appendDayOfYear(360000000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.appendHourOfDay((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder27.appendWeekyear((int) (short) 1, 360000000);
        boolean boolean31 = dateTimeFormatterBuilder30.canBuildPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter32 = dateTimeFormatterBuilder30.toPrinter();
        int int33 = dateTimePrinter32.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder34.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder34.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder34.appendEraText();
        org.joda.time.format.DateTimeParser dateTimeParser39 = dateTimeFormatterBuilder38.toParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter32, dateTimeParser39);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder41.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder44.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap47 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder46.appendTimeZoneShortName(strMap47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str50 = dateTimeFieldType49.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder48.appendDecimal(dateTimeFieldType49, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder45.appendText(dateTimeFieldType49);
        org.joda.time.format.DateTimePrinter dateTimePrinter55 = dateTimeFormatterBuilder54.toPrinter();
        int int56 = dateTimePrinter55.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap58 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder57.appendTimeZoneShortName(strMap58);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType61 = dateTimeFieldType60.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder57.appendText(dateTimeFieldType60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatterBuilder62.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser64 = dateTimeFormatter63.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter55, dateTimeParser64);
        int int66 = dateTimeParser64.estimateParsedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter32, dateTimeParser64);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder11.appendOptional(dateTimeParser64);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder70 = dateTimeFormatterBuilder11.appendTwoDigitYear(360000030);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTimePrinter32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 720000110 + "'", int33 == 720000110);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeParser39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "dayOfYear" + "'", str50, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimePrinter55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 58 + "'", int56 == 58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertNotNull(durationFieldType61);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(dateTimeParser64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 24 + "'", int66 == 24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder70);
    }

    @Test
    public void test24149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24149");
        java.util.Locale locale3 = new java.util.Locale("+100:00364+100:000000000000000027500000", "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)", "+100:005");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)_+100:005");
    }

    @Test
    public void test24150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24150");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.US;
        java.lang.String str4 = locale3.getDisplayScript();
        java.lang.String str5 = locale3.toLanguageTag();
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Locale locale11 = java.util.Locale.US;
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale10, locale11 };
        java.util.ArrayList<java.util.Locale> localeList13 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList13, localeArray12);
        java.util.List<java.util.Locale> localeList15 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList13);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Locale[] localeArray21 = new java.util.Locale[] { locale19, locale20 };
        java.util.ArrayList<java.util.Locale> localeList22 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList22, localeArray21);
        java.util.List<java.util.Locale> localeList24 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList22);
        java.util.Locale locale25 = java.util.Locale.US;
        java.lang.String str26 = locale25.getDisplayVariant();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale25, locale27, locale28 };
        java.util.ArrayList<java.util.Locale> localeList30 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList30, localeArray29);
        java.util.Locale locale32 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.util.Locale>) localeList30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList36);
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList36);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.util.Locale locale44 = java.util.Locale.US;
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale43, locale44 };
        java.util.ArrayList<java.util.Locale> localeList46 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList46, localeArray45);
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList46);
        java.util.Locale locale49 = java.util.Locale.US;
        java.lang.String str50 = locale49.getDisplayVariant();
        java.util.Locale locale51 = java.util.Locale.getDefault();
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.util.Locale[] localeArray53 = new java.util.Locale[] { locale49, locale51, locale52 };
        java.util.ArrayList<java.util.Locale> localeList54 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList54, localeArray53);
        java.util.Locale locale56 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList54);
        java.util.Locale.FilteringMode filteringMode57 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList58 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList54, filteringMode57);
        java.util.List<java.lang.String> strList59 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet6, filteringMode57);
        java.util.Locale locale60 = java.util.Locale.CHINESE;
        java.util.Locale locale61 = java.util.Locale.CHINESE;
        java.lang.String str62 = locale60.getDisplayVariant(locale61);
        java.lang.String str63 = locale60.toLanguageTag();
        java.lang.String str64 = locale60.getDisplayLanguage();
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str66 = locale65.getLanguage();
        java.util.Locale locale67 = locale65.stripExtensions();
        java.lang.String str68 = locale60.getDisplayScript(locale65);
        java.util.Set<java.lang.String> strSet69 = locale65.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList70 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet69);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap71 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList72 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap71);
        java.util.Locale.LanguageRange[] languageRangeArray73 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList74 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList74, languageRangeArray73);
        java.util.Locale locale76 = java.util.Locale.US;
        java.lang.String str77 = locale76.getDisplayScript();
        java.lang.String str78 = locale76.toLanguageTag();
        java.util.Set<java.lang.String> strSet79 = locale76.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.lang.String>) strSet79);
        java.util.Locale.LanguageRange[] languageRangeArray81 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList82 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList82, languageRangeArray81);
        java.util.Locale locale84 = java.util.Locale.getDefault();
        java.util.Locale locale85 = java.util.Locale.US;
        java.util.Locale[] localeArray86 = new java.util.Locale[] { locale84, locale85 };
        java.util.ArrayList<java.util.Locale> localeList87 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList87, localeArray86);
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList82, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList74, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter(languageRangeList72, (java.util.Collection<java.util.Locale>) localeList89);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "en-US" + "'", str5, "en-US");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(localeList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(localeList24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(localeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(localeList48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(localeArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(locale56);
        org.junit.Assert.assertTrue("'" + filteringMode57 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode57.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList58);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "zh" + "'", str63, "zh");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str64, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "zh" + "'", str66, "zh");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(languageRangeList72);
        org.junit.Assert.assertNotNull(languageRangeArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "en-US" + "'", str78, "en-US");
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertNotNull(languageRangeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "en_US");
        org.junit.Assert.assertNotNull(localeArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(localeList89);
        org.junit.Assert.assertNotNull(localeList90);
        org.junit.Assert.assertNotNull(localeList91);
    }

    @Test
    public void test24151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24151");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        int int14 = dateTimeFormatter13.getDefaultYear();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withChronology(chronology15);
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.lang.String str19 = locale17.getDisplayVariant(locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter16.withLocale(locale18);
        java.lang.String str21 = locale10.getDisplayScript(locale18);
        java.util.Locale.Builder builder22 = builder9.setLocale(locale18);
        java.util.Locale.Builder builder23 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder25 = builder23.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder27 = builder25.setRegion("");
        java.util.Locale.Builder builder28 = builder25.clear();
        java.util.Locale.Builder builder29 = builder25.clearExtensions();
        java.util.Locale locale30 = builder29.build();
        java.util.Locale.Builder builder31 = builder22.setLocale(locale30);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2000 + "'", int14 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test24152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24152");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withChronology(chronology3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear((-1));
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        boolean boolean8 = locale7.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withLocale(locale7);
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.lang.String str12 = locale10.getDisplayVariant(locale11);
        java.lang.String str13 = locale10.getDisplayLanguage();
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        java.lang.String str17 = locale10.getDisplayLanguage(locale15);
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.lang.String str19 = locale15.getDisplayCountry(locale18);
        java.util.Set<java.lang.Character> charSet20 = locale15.getExtensionKeys();
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str22 = locale21.getVariant();
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        int int27 = dateTimeFormatter26.getDefaultYear();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter26.withChronology(chronology28);
        java.util.Locale locale30 = java.util.Locale.CHINESE;
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter29.withLocale(locale31);
        java.lang.String str34 = locale23.getDisplayScript(locale31);
        java.lang.String str35 = locale31.getVariant();
        java.util.Locale locale36 = locale31.stripExtensions();
        java.lang.String str37 = locale21.getDisplayLanguage(locale36);
        java.lang.String str38 = locale15.getDisplayScript(locale36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter9.withLocale(locale15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter9.withDefaultYear(94);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter41.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.format.DateTimePrinter dateTimePrinter45 = null;
        org.joda.time.format.DateTimeParser dateTimeParser46 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter45, dateTimeParser46);
        org.joda.time.format.DateTimePrinter dateTimePrinter48 = dateTimeFormatter47.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeFormatter47.getZone();
        java.lang.Integer int50 = dateTimeFormatter47.getPivotYear();
        boolean boolean51 = dateTimeZone44.equals((java.lang.Object) dateTimeFormatter47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter41.withZone(dateTimeZone44);
        org.joda.time.ReadWritableInstant readWritableInstant53 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int56 = dateTimeFormatter41.parseInto(readWritableInstant53, "+00:00361", 109);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str13, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u6587" + "'", str17, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2000 + "'", int27 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNull(dateTimePrinter48);
        org.junit.Assert.assertNull(dateTimeZone49);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
    }

    @Test
    public void test24153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24153");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        boolean boolean3 = locale0.hasExtensions();
        java.lang.String str5 = locale0.getExtension('a');
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str8 = locale7.getLanguage();
        java.util.Locale locale9 = locale7.stripExtensions();
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale locale11 = java.util.Locale.getDefault(category6);
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.lang.String str13 = locale12.getLanguage();
        java.util.Locale.setDefault(category6, locale12);
        java.util.Locale locale15 = java.util.Locale.getDefault(category6);
        java.lang.String str16 = locale0.getDisplayName(locale15);
        java.lang.String str17 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh" + "'", str8, "zh");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko" + "'", str13, "ko");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str16, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test24154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24154");
        java.util.Locale locale3 = new java.util.Locale("", "und", "\uc11c\uae305");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\uc11c\uae305");
    }

    @Test
    public void test24155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24155");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long6 = dateTimeZone2.convertLocalToUTC((-1L), false, 0L);
        long long8 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) 100);
        java.lang.String str10 = dateTimeZone2.getName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long13 = dateTimeZone2.convertUTCToLocal((-322079965L));
        int int15 = dateTimeZone2.getOffset((long) '#');
        java.lang.String str16 = dateTimeZone2.getID();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long23 = dateTimeZone19.convertLocalToUTC((-1L), false, 0L);
        long long25 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 100);
        java.lang.String str27 = dateTimeZone19.getShortName((long) (-1));
        long long30 = dateTimeZone19.convertLocalToUTC((long) 1, true);
        java.util.Locale locale32 = java.util.Locale.US;
        java.lang.String str33 = locale32.getDisplayScript();
        java.lang.String str34 = locale32.toLanguageTag();
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = locale32.getDisplayName(locale35);
        java.util.Locale locale37 = java.util.Locale.JAPANESE;
        java.lang.String str38 = locale32.getDisplayLanguage(locale37);
        java.lang.String str39 = locale37.toLanguageTag();
        java.lang.String str40 = dateTimeZone19.getName((long) '4', locale37);
        long long42 = dateTimeZone2.getMillisKeepLocal(dateTimeZone19, 115200014L);
        long long45 = dateTimeZone2.adjustOffset((-37919893L), true);
        java.util.Locale.Category category47 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.lang.String str49 = locale48.getISO3Language();
        java.util.Locale.setDefault(category47, locale48);
        java.util.Locale locale51 = java.util.Locale.getDefault(category47);
        java.util.Locale locale52 = java.util.Locale.getDefault(category47);
        java.util.Locale locale53 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet54 = locale53.getUnicodeLocaleAttributes();
        java.util.Locale locale55 = java.util.Locale.CHINESE;
        java.util.Locale locale56 = java.util.Locale.CHINESE;
        java.lang.String str57 = locale55.getDisplayVariant(locale56);
        boolean boolean58 = locale55.hasExtensions();
        java.lang.String str59 = locale55.getScript();
        java.lang.String str60 = locale53.getDisplayScript(locale55);
        java.lang.String str61 = locale53.getVariant();
        java.util.Locale.setDefault(category47, locale53);
        java.util.Locale locale63 = java.util.Locale.JAPAN;
        java.lang.String str64 = locale63.getDisplayName();
        java.util.Locale.Builder builder65 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder67 = builder65.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder69 = builder67.setLanguage("English");
        java.util.Locale.Builder builder70 = builder67.clearExtensions();
        java.util.Locale locale71 = builder67.build();
        java.lang.String str72 = locale63.getDisplayName(locale71);
        java.lang.String str73 = locale53.getDisplayScript(locale71);
        java.lang.String str74 = dateTimeZone2.getName((-36000001L), locale53);
        long long78 = dateTimeZone2.convertLocalToUTC((-2099965L), false, 359999979L);
        int int80 = dateTimeZone2.getStandardOffset((-115200045L));
        long long84 = dateTimeZone2.convertLocalToUTC(75839990L, true, 37919899L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-37920001L) + "'", long6 == (-37920001L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-37919900L) + "'", long8 == (-37919900L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:32" + "'", str10, "+10:32");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-284159965L) + "'", long13 == (-284159965L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37920000 + "'", int15 == 37920000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:32" + "'", str16, "+10:32");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-37920001L) + "'", long23 == (-37920001L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-37919900L) + "'", long25 == (-37919900L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+10:32" + "'", str27, "+10:32");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-37919999L) + "'", long30 == (-37919999L));
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "en-US" + "'", str34, "en-US");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "English (United States)" + "'", str36, "English (United States)");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u82f1\u8a9e" + "'", str38, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ja" + "'", str39, "ja");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+10:32" + "'", str40, "+10:32");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 115200014L + "'", long42 == 115200014L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-37919893L) + "'", long45 == (-37919893L));
        org.junit.Assert.assertTrue("'" + category47 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category47.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "kor" + "'", str49, "kor");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "ja_JP");
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\u65e5\u6587\u65e5\u672c)" + "'", str64, "\u65e5\u6587\u65e5\u672c)");
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "english");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Japanese (Japan)" + "'", str72, "Japanese (Japan)");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "+10:32" + "'", str74, "+10:32");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-40019965L) + "'", long78 == (-40019965L));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 37920000 + "'", int80 == 37920000);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 37919990L + "'", long84 == 37919990L);
    }

    @Test
    public void test24156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24156");
        java.util.Locale locale1 = new java.util.Locale("java.io.IOException: java.io.IOException: java.io.IOException: en-US");
        org.junit.Assert.assertEquals(locale1.toString(), "java.io.ioexception: java.io.ioexception: java.io.ioexception: en-us");
    }

    @Test
    public void test24157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24157");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear((-1), true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendTwoDigitYear((int) (short) 10, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendPattern("zh");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendSecondOfMinute(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendMillisOfSecond(100);
        boolean boolean13 = dateTimeFormatterBuilder12.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder12.appendYear((int) (short) 10, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendClockhourOfHalfday((int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap20 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendTimeZoneShortName(strMap20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str23 = dateTimeFieldType22.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder21.appendDecimal(dateTimeFieldType22, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap27 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendTimeZoneName(strMap27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder26.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder30.appendFractionOfDay(0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder33.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder34.appendHourOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendDayOfMonth((int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap40 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder39.appendTimeZoneShortName(strMap40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str43 = dateTimeFieldType42.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder41.appendDecimal(dateTimeFieldType42, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap47 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder46.appendTimeZoneName(strMap47);
        boolean boolean49 = dateTimeFormatterBuilder46.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder46.appendMinuteOfHour((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter52 = null;
        org.joda.time.format.DateTimeParser dateTimeParser53 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter52, dateTimeParser53);
        int int55 = dateTimeFormatter54.getDefaultYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder51.append(dateTimeFormatter54);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder56.appendHourOfDay((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder59.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap63 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = dateTimeFormatterBuilder62.appendTimeZoneShortName(strMap63);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType66 = dateTimeFieldType65.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder62.appendText(dateTimeFieldType65);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder61.appendShortText(dateTimeFieldType65);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder69 = dateTimeFormatterBuilder68.appendHalfdayOfDayText();
        dateTimeFormatterBuilder69.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder71 = dateTimeFormatterBuilder69.appendTimeZoneName();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder75 = dateTimeFormatterBuilder69.appendDecimal(dateTimeFieldType72, 115200000, 56);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder78 = dateTimeFormatterBuilder56.appendFraction(dateTimeFieldType72, (int) (byte) 100, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder81 = dateTimeFormatterBuilder38.appendSignedDecimal(dateTimeFieldType72, 278, (int) '4');
        org.joda.time.DurationFieldType durationFieldType82 = dateTimeFieldType72.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder85 = dateTimeFormatterBuilder16.appendDecimal(dateTimeFieldType72, 45, 38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "dayOfYear" + "'", str23, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "dayOfYear" + "'", str43, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2000 + "'", int55 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder64);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
        org.junit.Assert.assertNotNull(durationFieldType66);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder69);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder71);
        org.junit.Assert.assertNotNull(dateTimeFieldType72);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder75);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder78);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder81);
        org.junit.Assert.assertNotNull(durationFieldType82);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder85);
    }

    @Test
    public void test24158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24158");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendClockhourOfDay(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap12 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendTimeZoneShortName(strMap12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str15 = dateTimeFieldType14.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder13.appendDecimal(dateTimeFieldType14, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder10.appendText(dateTimeFieldType14);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = dateTimeFormatterBuilder19.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder5.append(dateTimePrinter20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendClockhourOfDay(236);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder23.appendFractionOfSecond(10, 2248);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "dayOfYear" + "'", str15, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimePrinter20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
    }

    @Test
    public void test24159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24159");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear((-1), true);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType4, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder10.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTimeZoneShortName(strMap13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str16 = dateTimeFieldType15.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder14.appendDecimal(dateTimeFieldType15, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder11.appendText(dateTimeFieldType15);
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = dateTimeFormatterBuilder20.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap23 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendTimeZoneShortName(strMap23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder22.appendText(dateTimeFieldType25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatterBuilder27.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser29 = dateTimeFormatter28.getParser();
        int int30 = dateTimeParser29.estimateParsedLength();
        int int31 = dateTimeParser29.estimateParsedLength();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = null;
        int int35 = dateTimeParser29.parseInto(dateTimeParserBucket32, "en_US", (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap37 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendTimeZoneShortName(strMap37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str40 = dateTimeFieldType39.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder38.appendDecimal(dateTimeFieldType39, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser44 = dateTimeFormatterBuilder38.toParser();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray45 = new org.joda.time.format.DateTimeParser[] { dateTimeParser29, dateTimeParser44 };
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder6.append(dateTimePrinter21, dateTimeParserArray45);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder6.appendWeekyear((int) (short) 0, 257);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder49.appendHourOfHalfday(51);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder49.appendDayOfWeekText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "dayOfYear" + "'", str16, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimePrinter21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeParser29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24 + "'", int30 == 24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 24 + "'", int31 == 24);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "dayOfYear" + "'", str40, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeParser44);
        org.junit.Assert.assertNotNull(dateTimeParserArray45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
    }

    @Test
    public void test24160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24160");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap4 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendTimeZoneShortName(strMap4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder3.appendText(dateTimeFieldType6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder2.appendShortText(dateTimeFieldType6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder2.appendLiteral('a');
        boolean boolean12 = dateTimeFormatterBuilder11.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendMonthOfYear((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        int int18 = dateTimeFormatter17.getDefaultYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withChronology(chronology19);
        boolean boolean21 = dateTimeFormatter17.isOffsetParsed();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder14.append(dateTimeFormatter17);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap24 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendTimeZoneShortName(strMap24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str27 = dateTimeFieldType26.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder25.appendDecimal(dateTimeFieldType26, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap31 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendTimeZoneName(strMap31);
        boolean boolean33 = dateTimeFormatterBuilder30.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder30.appendMinuteOfHour((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = null;
        org.joda.time.format.DateTimeParser dateTimeParser37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter36, dateTimeParser37);
        int int39 = dateTimeFormatter38.getDefaultYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder35.append(dateTimeFormatter38);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder40.appendFractionOfHour((int) ' ', (int) 'x');
        boolean boolean44 = dateTimeFormatterBuilder43.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder43.appendTwoDigitWeekyear(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder46.appendSecondOfMinute((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder48.appendTimeZoneShortName();
        org.joda.time.format.DateTimeParser dateTimeParser50 = dateTimeFormatterBuilder49.toParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.lang.String str52 = dateTimeFieldType51.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder49.appendText(dateTimeFieldType51);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder14.appendShortText(dateTimeFieldType51);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder14.appendHalfdayOfDayText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap56 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder55.appendTimeZoneShortName(strMap56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2000 + "'", int18 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "dayOfYear" + "'", str27, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2000 + "'", int39 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeParser50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "weekOfWeekyear" + "'", str52, "weekOfWeekyear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
    }

    @Test
    public void test24161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24161");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFractionOfDay(0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendHourOfHalfday(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder17.appendSignedDecimal(dateTimeFieldType20, 24, (int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder23.appendSignedDecimal(dateTimeFieldType24, 24, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder23.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder23.appendMonthOfYearText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
    }

    @Test
    public void test24162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24162");
        java.util.Locale locale1 = new java.util.Locale("GB");
        java.lang.String str2 = locale1.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "gb");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24163");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((-1L), false, 0L);
        java.lang.String str7 = dateTimeZone1.getShortName((long) 100);
        long long9 = dateTimeZone1.convertUTCToLocal((long) (byte) 10);
        long long11 = dateTimeZone1.nextTransition((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone13, (long) 'a');
        long long18 = dateTimeZone13.convertLocalToUTC(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-37920001L) + "'", long5 == (-37920001L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:32" + "'", str7, "+10:32");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 37920010L + "'", long9 == 37920010L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 37920096L + "'", long15 == 37920096L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test24164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24164");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter2.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 0);
        java.util.Locale locale11 = java.util.Locale.PRC;
        boolean boolean12 = locale11.hasExtensions();
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.lang.String str14 = locale11.getDisplayScript(locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter6.withLocale(locale11);
        org.joda.time.Chronology chronology16 = dateTimeFormatter6.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(22);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long25 = dateTimeZone21.convertLocalToUTC((-1L), false, 0L);
        long long27 = dateTimeZone19.getMillisKeepLocal(dateTimeZone21, (long) 100);
        long long29 = dateTimeZone19.convertUTCToLocal((long) (byte) 0);
        java.util.Locale locale31 = java.util.Locale.US;
        java.lang.String str32 = locale31.getDisplayScript();
        java.lang.String str33 = locale31.toLanguageTag();
        java.lang.String str34 = dateTimeZone19.getName((long) '#', locale31);
        java.lang.String str36 = dateTimeZone19.getName((long) (byte) 0);
        long long38 = dateTimeZone19.previousTransition(117L);
        boolean boolean40 = dateTimeZone19.isStandardOffset(360000197L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        long long43 = dateTimeZone18.getMillisKeepLocal(dateTimeZone19, 52L);
        int int45 = dateTimeZone18.getStandardOffset(100L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter6.withZone(dateTimeZone18);
        long long48 = dateTimeZone18.previousTransition(3599999L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-37920001L) + "'", long25 == (-37920001L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-37919900L) + "'", long27 == (-37919900L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "en-US" + "'", str33, "en-US");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 117L + "'", long38 == 117L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 74L + "'", long43 == 74L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 22 + "'", int45 == 22);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 3599999L + "'", long48 == 3599999L);
    }

    @Test
    public void test24165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24165");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        boolean boolean10 = dateTimeFormatterBuilder7.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendMinuteOfHour((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder7.appendClockhourOfDay((int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendMillisOfSecond((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder14.appendTwoDigitYear(115200000, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendWeekOfWeekyear(1440000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder22.appendFractionOfSecond(59040000, 236);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.appendDayOfWeek(1440244);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
    }

    @Test
    public void test24166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24166");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long6 = dateTimeZone2.convertLocalToUTC((-1L), false, 0L);
        long long8 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) 100);
        java.lang.String str10 = dateTimeZone2.getName(1L);
        long long12 = dateTimeZone2.nextTransition((long) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap14 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendTimeZoneShortName(strMap14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str17 = dateTimeFieldType16.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder15.appendDecimal(dateTimeFieldType16, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap21 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendTimeZoneName(strMap21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder20.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder24.appendFractionOfDay(0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder27.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder28.appendHourOfHalfday(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder30.appendSignedDecimal(dateTimeFieldType33, 24, (int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder30.appendSignedDecimal(dateTimeFieldType37, (int) (byte) 0, (int) (byte) 1);
        boolean boolean42 = dateTimeZone2.equals((java.lang.Object) (byte) 0);
        boolean boolean44 = dateTimeZone2.isStandardOffset(118800000L);
        int int46 = dateTimeZone2.getStandardOffset(358560001L);
        long long48 = dateTimeZone2.nextTransition(106L);
        java.util.TimeZone timeZone49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        long long54 = dateTimeZone50.convertLocalToUTC((-1L), false, 0L);
        java.lang.String str56 = dateTimeZone50.getShortName((long) 100);
        java.lang.String str57 = dateTimeZone50.toString();
        boolean boolean59 = dateTimeZone50.isStandardOffset(32L);
        long long62 = dateTimeZone50.adjustOffset((-37919900L), true);
        long long64 = dateTimeZone50.previousTransition(359999989L);
        boolean boolean65 = dateTimeZone2.equals((java.lang.Object) long64);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "dayOfYear" + "'", str17, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 106L + "'", long48 == 106L);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00" + "'", str56, "+00:00");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "UTC" + "'", str57, "UTC");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-37919900L) + "'", long62 == (-37919900L));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 359999989L + "'", long64 == 359999989L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test24167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24167");
        java.util.Locale locale2 = new java.util.Locale("English", "+100:00");
        java.util.Locale locale3 = locale2.stripExtensions();
        java.lang.String str4 = locale2.getScript();
        org.junit.Assert.assertEquals(locale2.toString(), "english_+100:00");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "english_+100:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test24168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24168");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendHourOfHalfday((int) (short) 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendTimeZoneShortName(strMap5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder4.appendText(dateTimeFieldType7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatterBuilder9.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter10.getParser();
        int int12 = dateTimeParser11.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap14 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendTimeZoneShortName(strMap14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder13.appendText(dateTimeFieldType16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatterBuilder18.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatter19.getParser();
        int int21 = dateTimeParser20.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap23 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendTimeZoneShortName(strMap23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder22.appendText(dateTimeFieldType25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatterBuilder27.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser29 = dateTimeFormatter28.getParser();
        int int30 = dateTimeParser29.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap32 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder31.appendTimeZoneShortName(strMap32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType34.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder31.appendText(dateTimeFieldType34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatterBuilder36.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser38 = dateTimeFormatter37.getParser();
        int int39 = dateTimeParser38.estimateParsedLength();
        org.joda.time.format.DateTimeParser[] dateTimeParserArray40 = new org.joda.time.format.DateTimeParser[] { dateTimeParser11, dateTimeParser20, dateTimeParser29, dateTimeParser38 };
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder2.append(dateTimePrinter3, dateTimeParserArray40);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder2.appendFractionOfDay(13, 39120000);
        org.joda.time.format.DateTimePrinter dateTimePrinter45 = dateTimeFormatterBuilder44.toPrinter();
        int int46 = dateTimePrinter45.estimatePrintedLength();
        int int47 = dateTimePrinter45.estimatePrintedLength();
        int int48 = dateTimePrinter45.estimatePrintedLength();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeParser11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 24 + "'", int12 == 24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeParser20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeParser29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24 + "'", int30 == 24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeParser38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 24 + "'", int39 == 24);
        org.junit.Assert.assertNotNull(dateTimeParserArray40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimePrinter45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 20 + "'", int46 == 20);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20 + "'", int47 == 20);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 20 + "'", int48 == 20);
    }

    @Test
    public void test24169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24169");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.io.Writer writer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer4, readablePartial5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test24170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24170");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendMinuteOfDay(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder0.appendYear((int) (short) 10, 579);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap18 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendTimeZoneShortName(strMap18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder17.appendText(dateTimeFieldType20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder16.appendShortText(dateTimeFieldType20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder16.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = new org.joda.time.format.DateTimeFormatterBuilder();
        boolean boolean28 = dateTimeFormatterBuilder27.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder27.appendMinuteOfHour((int) (short) 10);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap31 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendTimeZoneName(strMap31);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder30.appendTwoDigitWeekyear(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder30.appendTwoDigitYear((int) (short) 100, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap39 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder38.appendTimeZoneShortName(strMap39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str42 = dateTimeFieldType41.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder40.appendDecimal(dateTimeFieldType41, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap46 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder45.appendTimeZoneName(strMap46);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder45.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder49.appendFractionOfDay(0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder52.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder53.appendHourOfHalfday(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder55.appendMonthOfYear((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder57.appendDayOfMonth((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder59.appendTwoDigitYear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder59.appendSignedDecimal(dateTimeFieldType62, (int) 'a', (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder30.appendFixedDecimal(dateTimeFieldType62, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder70 = dateTimeFormatterBuilder26.appendFraction(dateTimeFieldType62, 579, 579);
        java.lang.String str71 = dateTimeFieldType62.getName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder72 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "dayOfYear" + "'", str42, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "monthOfYear" + "'", str71, "monthOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder72);
    }

    @Test
    public void test24171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24171");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        boolean boolean10 = dateTimeFormatterBuilder7.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendMinuteOfDay(579);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
    }

    @Test
    public void test24172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24172");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder12 = builder9.setExtension('x', "Cina");
        java.util.Locale.Builder builder13 = builder9.clearExtensions();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale locale15 = builder14.build();
        java.util.Locale.Builder builder16 = builder14.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder14.setUnicodeLocaleKeyword("zh_tw", "\uc601\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: zh_tw [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test24173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24173");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendLiteral("en_US");
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendDecimal(dateTimeFieldType10, 360000000, 2000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder9.appendLiteral('x');
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        java.lang.String str18 = dateTimeFieldType17.getName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder9.appendFraction(dateTimeFieldType17, 115200000, 1);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = null;
        org.joda.time.format.DateTimeParser dateTimeParser23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser23);
        int int25 = dateTimeFormatter24.getDefaultYear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter24.withChronology(chronology26);
        boolean boolean28 = dateTimeFormatter27.isParser();
        boolean boolean29 = dateTimeFormatter27.isParser();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        long long36 = dateTimeZone32.convertLocalToUTC((-1L), false, 0L);
        long long38 = dateTimeZone30.getMillisKeepLocal(dateTimeZone32, (long) 100);
        java.lang.String str40 = dateTimeZone32.getShortName((long) (-1));
        java.util.Locale.Category category42 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale43 = java.util.Locale.KOREAN;
        java.lang.String str44 = locale43.getISO3Language();
        java.util.Locale.setDefault(category42, locale43);
        java.lang.String str46 = dateTimeZone32.getShortName(97L, locale43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter27.withLocale(locale43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter27.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeFormatter27.getZone();
        java.lang.Integer int50 = dateTimeFormatter27.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter27.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter51.withOffsetParsed();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder21.append(dateTimeFormatter51);
        org.joda.time.format.DateTimeParser dateTimeParser54 = dateTimeFormatterBuilder21.toParser();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hourOfHalfday" + "'", str18, "hourOfHalfday");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2000 + "'", int25 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertTrue("'" + category42 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category42.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "kor" + "'", str44, "kor");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNull(dateTimeZone49);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeParser54);
    }

    @Test
    public void test24174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24174");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale locale7 = new java.util.Locale("Chinese");
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale8.getDisplayLanguage();
        java.util.Locale locale12 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str13 = locale8.getDisplayVariant(locale12);
        java.lang.String str14 = locale7.getDisplayLanguage(locale12);
        java.util.Locale.Builder builder15 = builder5.setLocale(locale12);
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.setRegion("+00:00:00.01042+00:00:00.010000000000000000000000034942788888888");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: +00:00:00.01042+00:00:00.010000000000000000000000034942788888888 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale7.toString(), "chinese");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str11, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "chinese" + "'", str14, "chinese");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test24175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24175");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTwoDigitYear((-1), true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder3.appendTwoDigitYear((int) (short) 10, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder3.appendTimeZoneOffset("ja", false, (int) (short) 10, (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendTwoDigitYear(24, true);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatterBuilder11.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap17 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendTimeZoneShortName(strMap17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str20 = dateTimeFieldType19.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder18.appendDecimal(dateTimeFieldType19, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap24 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendTimeZoneName(strMap24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder23.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder23.appendHourOfHalfday((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendClockhourOfHalfday((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder31.appendFractionOfDay(24, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder34.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeParser dateTimeParser36 = dateTimeFormatterBuilder34.toParser();
        int int37 = dateTimeParser36.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder11.appendOptional(dateTimeParser36);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder38.appendClockhourOfDay(2506);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimePrinter15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "dayOfYear" + "'", str20, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeParser36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 56 + "'", int37 == 56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
    }

    @Test
    public void test24176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24176");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType3.getDurationType();
        java.lang.String str9 = dateTimeFieldType3.getName();
        org.joda.time.Chronology chronology10 = null;
        boolean boolean11 = dateTimeFieldType3.isSupported(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dayOfYear" + "'", str9, "dayOfYear");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test24177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24177");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-3600000));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap4 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendTimeZoneShortName(strMap4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str7 = dateTimeFieldType6.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder5.appendDecimal(dateTimeFieldType6, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap11 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendTimeZoneName(strMap11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder10.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendFractionOfDay(0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendHourOfHalfday(24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendMonthOfYear((int) (byte) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatterBuilder22.toFormatter();
        boolean boolean24 = dateTimeFormatter23.isPrinter();
        boolean boolean25 = dateTimeFormatter23.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withOffsetParsed();
        java.util.Locale locale27 = java.util.Locale.GERMANY;
        java.util.Locale locale29 = new java.util.Locale("\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        java.lang.String str30 = locale27.getDisplayScript(locale29);
        java.util.Locale locale31 = java.util.Locale.US;
        java.util.Locale locale32 = java.util.Locale.CHINESE;
        java.util.Locale locale33 = java.util.Locale.CHINESE;
        java.lang.String str34 = locale32.getDisplayVariant(locale33);
        boolean boolean35 = locale32.hasExtensions();
        java.lang.String str36 = locale32.getScript();
        java.lang.String str37 = locale31.getDisplayCountry(locale32);
        java.lang.String str39 = locale32.getExtension('a');
        java.lang.String str40 = locale29.getDisplayVariant(locale32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter26.withLocale(locale32);
        java.lang.String str42 = dateTimeZone1.getName(358559999L, locale32);
        java.util.Locale locale43 = null;
        java.lang.String str44 = locale32.getDisplayScript(locale43);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "dayOfYear" + "'", str7, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de_DE");
        org.junit.Assert.assertEquals(locale29.toString(), "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u7f8e\u56fd" + "'", str37, "\u7f8e\u56fd");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-01:00" + "'", str42, "-01:00");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test24178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24178");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        boolean boolean10 = dateTimeFormatterBuilder7.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendMinuteOfHour((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        int int16 = dateTimeFormatter15.getDefaultYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder12.append(dateTimeFormatter15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap19 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendTimeZoneShortName(strMap19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder18.appendText(dateTimeFieldType21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatterBuilder23.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser25 = dateTimeFormatter24.getParser();
        int int26 = dateTimeParser25.estimateParsedLength();
        int int27 = dateTimeParser25.estimateParsedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder17.appendOptional(dateTimeParser25);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder28.appendFractionOfDay(360000000, (int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder31.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder31.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder31.appendSecondOfMinute((int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2000 + "'", int16 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeParser25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 24 + "'", int26 == 24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24 + "'", int27 == 24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
    }

    @Test
    public void test24179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24179");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        boolean boolean10 = dateTimeFormatterBuilder7.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder7.appendMinuteOfHour((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        int int16 = dateTimeFormatter15.getDefaultYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder12.append(dateTimeFormatter15);
        boolean boolean18 = dateTimeFormatter15.isParser();
        java.lang.Appendable appendable19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter15.printTo(appendable19, readableInstant20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2000 + "'", int16 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test24180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24180");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder3.appendTimeZoneName();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendShortText(dateTimeFieldType5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendDayOfMonth((int) (short) 100);
        boolean boolean11 = dateTimeFormatterBuilder7.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendTimeZoneShortName(strMap13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str16 = dateTimeFieldType15.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder14.appendDecimal(dateTimeFieldType15, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap20 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendTimeZoneName(strMap20);
        boolean boolean22 = dateTimeFormatterBuilder19.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder19.appendMinuteOfHour((int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        int int28 = dateTimeFormatter27.getDefaultYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder24.append(dateTimeFormatter27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder29.appendFractionOfHour((int) ' ', (int) 'x');
        boolean boolean33 = dateTimeFormatterBuilder32.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder32.appendTwoDigitWeekyear(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap37 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendTimeZoneShortName(strMap37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str40 = dateTimeFieldType39.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder38.appendDecimal(dateTimeFieldType39, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap44 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendTimeZoneName(strMap44);
        boolean boolean46 = dateTimeFormatterBuilder43.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder43.appendTwoDigitWeekyear((int) (byte) 0, false);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap50 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder43.appendTimeZoneShortName(strMap50);
        org.joda.time.format.DateTimePrinter dateTimePrinter52 = null;
        org.joda.time.format.DateTimeParser dateTimeParser53 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter52, dateTimeParser53);
        int int55 = dateTimeFormatter54.getDefaultYear();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter54.withChronology(chronology56);
        boolean boolean58 = dateTimeFormatter57.isParser();
        boolean boolean59 = dateTimeFormatter57.isParser();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forTimeZone(timeZone61);
        long long66 = dateTimeZone62.convertLocalToUTC((-1L), false, 0L);
        long long68 = dateTimeZone60.getMillisKeepLocal(dateTimeZone62, (long) 100);
        java.lang.String str70 = dateTimeZone62.getShortName((long) (-1));
        java.util.Locale.Category category72 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale73 = java.util.Locale.KOREAN;
        java.lang.String str74 = locale73.getISO3Language();
        java.util.Locale.setDefault(category72, locale73);
        java.lang.String str76 = dateTimeZone62.getShortName(97L, locale73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = dateTimeFormatter57.withLocale(locale73);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder78 = dateTimeFormatterBuilder51.append(dateTimeFormatter77);
        org.joda.time.format.DateTimeParser dateTimeParser79 = dateTimeFormatterBuilder51.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder80 = dateTimeFormatterBuilder35.append(dateTimeParser79);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder81 = dateTimeFormatterBuilder7.appendOptional(dateTimeParser79);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder82 = dateTimeFormatterBuilder7.appendDayOfWeekText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "dayOfYear" + "'", str16, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2000 + "'", int28 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "dayOfYear" + "'", str40, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2000 + "'", int55 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 100L + "'", long68 == 100L);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "+00:00" + "'", str70, "+00:00");
        org.junit.Assert.assertTrue("'" + category72 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category72.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "kor" + "'", str74, "kor");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "+00:00" + "'", str76, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter77);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder78);
        org.junit.Assert.assertNotNull(dateTimeParser79);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder80);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder81);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder82);
    }

    @Test
    public void test24181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24181");
        java.util.Locale locale1 = new java.util.Locale("jpn");
        org.junit.Assert.assertEquals(locale1.toString(), "jpn");
    }

    @Test
    public void test24182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24182");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.CHINESE;
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.lang.String str4 = locale1.getCountry();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale1);
        java.util.Locale.Category category6 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale7.getISO3Language();
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale locale10 = java.util.Locale.getDefault(category6);
        java.util.Locale locale11 = java.util.Locale.getDefault(category6);
        java.lang.String str12 = locale11.getScript();
        java.util.Locale.Builder builder13 = builder5.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setLanguage("+00:000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: +00:000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category6.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "kor" + "'", str8, "kor");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test24183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24183");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder2.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder3.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendFractionOfMinute((int) (short) 0, (int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder4.appendSecondOfDay(360000000);
        boolean boolean10 = dateTimeFormatterBuilder4.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder4.appendTwoDigitWeekyear((int) (short) 1, true);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatterBuilder13.toFormatter();
        java.lang.Integer int15 = dateTimeFormatter14.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = dateTimeFormatter14.parseLocalDate("\uc911\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.io.ioexception: java.io.ioe...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test24184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24184");
        java.util.Locale locale3 = new java.util.Locale("java.io.IOException: hi!", "secondOfMinute", "utc");
        java.util.Locale locale4 = java.util.Locale.CHINESE;
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.lang.String str7 = locale4.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale4.getDisplayLanguage(locale9);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale9.getDisplayCountry(locale12);
        java.util.Locale.setDefault(locale9);
        java.lang.String str15 = locale9.getISO3Country();
        java.lang.String str16 = locale3.getDisplayCountry(locale9);
        java.util.Locale locale17 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimeParser dateTimeParser19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser19);
        int int21 = dateTimeFormatter20.getDefaultYear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter20.withChronology(chronology22);
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.util.Locale locale25 = java.util.Locale.CHINESE;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter23.withLocale(locale25);
        java.lang.String str28 = locale17.getDisplayScript(locale25);
        java.lang.String str29 = locale25.getLanguage();
        java.lang.String str30 = locale25.getISO3Country();
        java.lang.String str31 = locale3.getDisplayVariant(locale25);
        java.lang.String str32 = locale3.getDisplayScript();
        boolean boolean33 = locale3.hasExtensions();
        java.util.Set<java.lang.String> strSet34 = locale3.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for SECONDOFMINUTE");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "java.io.ioexception: hi!_SECONDOFMINUTE_utc");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str7, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587" + "'", str11, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SECONDOFMINUTE" + "'", str16, "SECONDOFMINUTE");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2000 + "'", int21 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh" + "'", str29, "zh");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "utc" + "'", str31, "utc");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test24185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24185");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        boolean boolean10 = dateTimeFormatterBuilder7.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendMonthOfYearShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder11.appendSignedDecimal(dateTimeFieldType13, 360000000, 115200000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder11.appendCenturyOfEra(2000, 115200214);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder11.appendSecondOfDay(90);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test24186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24186");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(123, 442800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 442800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24187");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendLiteral("en_US");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYear(24, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatterBuilder13.toFormatter();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendText(dateTimeFieldType15);
        org.joda.time.format.DateTimeParser dateTimeParser18 = dateTimeFormatterBuilder13.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder13.appendLiteral('x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder21.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder24.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap27 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendTimeZoneShortName(strMap27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str30 = dateTimeFieldType29.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder28.appendDecimal(dateTimeFieldType29, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder25.appendText(dateTimeFieldType29);
        org.joda.time.format.DateTimePrinter dateTimePrinter35 = dateTimeFormatterBuilder34.toPrinter();
        int int36 = dateTimePrinter35.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap38 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder37.appendTimeZoneShortName(strMap38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType40.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder37.appendText(dateTimeFieldType40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatterBuilder42.toFormatter();
        org.joda.time.format.DateTimeParser dateTimeParser44 = dateTimeFormatter43.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter35, dateTimeParser44);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder20.append(dateTimeParser44);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder20.appendLiteral('4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder20.appendCenturyOfEra(44, 56);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder51.appendYearOfEra((int) (byte) 10, 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap55 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder51.appendTimeZoneShortName(strMap55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeParser18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "dayOfYear" + "'", str30, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimePrinter35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 58 + "'", int36 == 58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertNotNull(dateTimeParser44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
    }

    @Test
    public void test24188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24188");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatterBuilder2.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder2.appendMinuteOfDay((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder10.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendFractionOfSecond((int) (byte) 100, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap18 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendTimeZoneShortName(strMap18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str21 = dateTimeFieldType20.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder19.appendDecimal(dateTimeFieldType20, (int) (byte) 0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder16.appendText(dateTimeFieldType20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.appendClockhourOfDay((int) (short) 1);
        dateTimeFormatterBuilder27.clear();
        boolean boolean29 = dateTimeFormatterBuilder27.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder27.appendCenturyOfEra(56, (int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder32.appendEraText();
        org.joda.time.format.DateTimeParser dateTimeParser34 = dateTimeFormatterBuilder33.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder11.appendOptional(dateTimeParser34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "dayOfYear" + "'", str21, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeParser34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
    }

    @Test
    public void test24189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24189");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendYear(58, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendLiteral("hi!");
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        int int9 = dateTimeFormatter8.getDefaultYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withChronology(chronology10);
        boolean boolean12 = dateTimeFormatter8.isOffsetParsed();
        boolean boolean13 = dateTimeFormatter8.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter8.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder5.append(dateTimeFormatter8);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeFormatter8.getZone();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2000 + "'", int9 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dateTimePrinter14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNull(dateTimeZone16);
    }

    @Test
    public void test24190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24190");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long5 = dateTimeZone1.convertLocalToUTC((-1L), false, 0L);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 2000);
        long long10 = dateTimeZone1.convertUTCToLocal(360000010L);
        java.lang.String str11 = dateTimeZone1.getID();
        long long14 = dateTimeZone1.adjustOffset((long) '#', true);
        long long16 = dateTimeZone1.convertUTCToLocal((long) 432060000);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone1.getOffset(readableInstant17);
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        long long24 = dateTimeZone20.convertLocalToUTC((-1L), false, 0L);
        int int26 = dateTimeZone20.getStandardOffset(1L);
        long long28 = dateTimeZone20.previousTransition((long) (short) 0);
        java.lang.String str30 = dateTimeZone20.getShortName((-1L));
        long long32 = dateTimeZone20.nextTransition(52L);
        long long34 = dateTimeZone1.getMillisKeepLocal(dateTimeZone20, 360000000L);
        int int36 = dateTimeZone1.getOffset(37920001L);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        long long43 = dateTimeZone39.convertLocalToUTC((-1L), false, 0L);
        java.lang.String str45 = dateTimeZone39.getShortName((long) 100);
        java.lang.String str46 = dateTimeZone39.toString();
        boolean boolean48 = dateTimeZone39.isStandardOffset(32L);
        long long51 = dateTimeZone39.adjustOffset((-37919900L), true);
        int int53 = dateTimeZone39.getStandardOffset((-9L));
        java.util.Locale locale55 = java.util.Locale.US;
        java.lang.String str56 = locale55.getDisplayScript();
        java.lang.String str57 = locale55.toLanguageTag();
        java.util.Locale locale58 = java.util.Locale.US;
        java.lang.String str59 = locale55.getDisplayName(locale58);
        java.util.Locale locale60 = java.util.Locale.JAPANESE;
        java.lang.String str61 = locale55.getDisplayLanguage(locale60);
        java.lang.String str62 = locale55.toLanguageTag();
        java.lang.String str63 = locale55.getDisplayLanguage();
        java.util.Locale locale65 = new java.util.Locale("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        java.util.Set<java.lang.String> strSet66 = locale65.getUnicodeLocaleKeys();
        java.lang.String str67 = locale55.getDisplayName(locale65);
        java.lang.String str68 = dateTimeZone39.getShortName(87L, locale65);
        java.lang.String str69 = dateTimeZone1.getShortName((-719999991L), locale65);
        java.lang.String str70 = locale65.getCountry();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2000L + "'", long8 == 2000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 360000010L + "'", long10 == 360000010L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 432060000L + "'", long16 == 432060000L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 360000000L + "'", long34 == 360000000L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTC" + "'", str46, "UTC");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-37919900L) + "'", long51 == (-37919900L));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "en-US" + "'", str57, "en-US");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "English (United States)" + "'", str59, "English (United States)");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\u82f1\u8a9e" + "'", str61, "\u82f1\u8a9e");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "en-US" + "'", str62, "en-US");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u82f1\u6587" + "'", str63, "\u82f1\u6587");
        org.junit.Assert.assertEquals(locale65.toString(), "\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "English (United States)" + "'", str67, "English (United States)");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "+00:00" + "'", str68, "+00:00");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "+00:00" + "'", str69, "+00:00");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test24191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24191");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder0.appendWeekOfWeekyear((int) 'x');
        boolean boolean5 = dateTimeFormatterBuilder4.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendDayOfMonth(151);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendDayOfWeekShortText();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder7.toPrinter();
        int int10 = dateTimePrinter9.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap12 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendTimeZoneShortName(strMap12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str15 = dateTimeFieldType14.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder13.appendDecimal(dateTimeFieldType14, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap19 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendTimeZoneName(strMap19);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder18.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder18.appendHourOfHalfday((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendClockhourOfHalfday((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder26.appendFractionOfDay(24, (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder29.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeParser dateTimeParser31 = dateTimeFormatterBuilder29.toParser();
        int int32 = dateTimeParser31.estimateParsedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser31);
        boolean boolean34 = dateTimeFormatter33.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate36 = dateTimeFormatter33.parseLocalDate("english (united states)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 278 + "'", int10 == 278);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "dayOfYear" + "'", str15, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeParser31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 56 + "'", int32 == 56);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test24192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24192");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        int int3 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withChronology(chronology4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter5.withZone(dateTimeZone11);
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter5.withLocale(locale13);
        java.lang.StringBuffer stringBuffer15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer15, readableInstant16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2000 + "'", int3 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test24193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24193");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setLanguageTag("ja");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder12 = builder9.setExtension('x', "Cina");
        java.util.Locale.Builder builder13 = builder9.clearExtensions();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale locale15 = builder14.build();
        java.util.Locale.Builder builder16 = builder14.clearExtensions();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long23 = dateTimeZone19.convertLocalToUTC((-1L), false, 0L);
        long long25 = dateTimeZone17.getMillisKeepLocal(dateTimeZone19, (long) 100);
        java.lang.String str27 = dateTimeZone19.getName(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        long long30 = dateTimeZone19.convertUTCToLocal((-322079965L));
        int int32 = dateTimeZone19.getOffset((long) '#');
        java.lang.String str33 = dateTimeZone19.getID();
        java.util.Locale locale35 = java.util.Locale.CHINESE;
        java.util.Locale locale36 = java.util.Locale.CHINESE;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.lang.String str38 = locale35.getDisplayLanguage();
        java.util.Locale locale39 = java.util.Locale.CHINESE;
        java.util.Locale locale40 = java.util.Locale.CHINESE;
        java.lang.String str41 = locale39.getDisplayVariant(locale40);
        java.lang.String str42 = locale35.getDisplayLanguage(locale40);
        java.lang.String str43 = dateTimeZone19.getShortName(360000096L, locale35);
        java.util.Set<java.lang.String> strSet44 = locale35.getUnicodeLocaleAttributes();
        java.util.Locale locale45 = locale35.stripExtensions();
        java.lang.String str46 = locale45.getDisplayCountry();
        java.lang.String str47 = locale45.getDisplayName();
        java.lang.String str48 = locale45.getLanguage();
        java.util.Set<java.lang.Character> charSet49 = locale45.getExtensionKeys();
        java.util.Locale.Builder builder50 = builder16.setLocale(locale45);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-322079965L) + "'", long30 == (-322079965L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u4e2d\u6587" + "'", str38, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e2d\u6587" + "'", str42, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00" + "'", str43, "+00:00");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u4e2d\u6587" + "'", str47, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "zh" + "'", str48, "zh");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test24194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24194");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("Chinese");
        java.util.Locale locale3 = java.util.Locale.US;
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayLanguage();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder9 = builder0.setExtension('a', "English");
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("it");
        java.util.Locale.Builder builder16 = builder13.clearExtensions();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = builder16.build();
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587" + "'", str5, "\u82f1\u6587");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str19, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test24195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24195");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendDayOfMonth((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendMinuteOfDay(1440000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendDayOfYear(2100000);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
    }

    @Test
    public void test24196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24196");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("+00:01");
        java.util.Locale locale2 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str3 = locale2.getISO3Language();
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.getDisplayScript();
        java.lang.String str6 = locale4.toLanguageTag();
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleKeys();
        java.util.Locale locale8 = java.util.Locale.JAPANESE;
        java.lang.String str9 = locale4.getDisplayCountry(locale8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long16 = dateTimeZone12.convertLocalToUTC((-1L), false, 0L);
        long long18 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) 100);
        java.lang.String str20 = dateTimeZone12.getShortName((long) (-1));
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.lang.String str24 = locale23.getISO3Language();
        java.util.Locale.setDefault(category22, locale23);
        java.lang.String str26 = dateTimeZone12.getShortName(97L, locale23);
        java.lang.String str27 = locale4.getDisplayCountry(locale23);
        java.util.Locale locale29 = new java.util.Locale("hi!");
        java.lang.String str30 = locale23.getDisplayCountry(locale29);
        java.lang.String str32 = locale23.getUnicodeLocaleType("de");
        java.util.Locale.setDefault(locale23);
        java.lang.String str34 = locale2.getDisplayLanguage(locale23);
        java.lang.String str35 = locale2.getDisplayVariant();
        java.lang.String str36 = locale1.getDisplayName(locale2);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-US" + "'", str6, "en-US");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd" + "'", str9, "\u30a2\u30e1\u30ea\u30ab\u5408\u8846\u56fd");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category22.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "kor" + "'", str24, "kor");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\ubbf8\uad6d" + "'", str27, "\ubbf8\uad6d");
        org.junit.Assert.assertEquals(locale29.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str34, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test24197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24197");
        java.util.Locale locale2 = new java.util.Locale("\uc911\uad6d\uc5b4\ub300\ub9cc)", "+32:0043");
        java.lang.String str3 = locale2.getVariant();
        org.junit.Assert.assertEquals(locale2.toString(), "\uc911\uad6d\uc5b4\ub300\ub9cc)_+32:0043");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test24198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24198");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendWeekOfWeekyear((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendDayOfMonth(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendTwoDigitYear((-1), true);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendFixedDecimal(dateTimeFieldType18, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder20.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendTwoDigitYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap25 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendTimeZoneShortName(strMap25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str28 = dateTimeFieldType27.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder26.appendDecimal(dateTimeFieldType27, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap32 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder31.appendTimeZoneName(strMap32);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder31.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder35.appendClockhourOfHalfday((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder35.appendLiteral("\u4e2d\u6587");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder35.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap44 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendTimeZoneShortName(strMap44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str47 = dateTimeFieldType46.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder45.appendDecimal(dateTimeFieldType46, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap51 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder50.appendTimeZoneName(strMap51);
        boolean boolean53 = dateTimeFormatterBuilder50.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder50.appendMinuteOfHour((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder50.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap59 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder58.appendTimeZoneShortName(strMap59);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType62 = dateTimeFieldType61.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder58.appendText(dateTimeFieldType61);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = dateTimeFormatterBuilder58.appendMonthOfYearText();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str66 = dateTimeFieldType65.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder64.appendFixedDecimal(dateTimeFieldType65, (int) (short) 10);
        org.joda.time.Chronology chronology69 = null;
        boolean boolean70 = dateTimeFieldType65.isSupported(chronology69);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder57.appendSignedDecimal(dateTimeFieldType65, (int) (short) 10, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder74 = dateTimeFormatterBuilder42.appendShortText(dateTimeFieldType65);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder77 = dateTimeFormatterBuilder21.appendDecimal(dateTimeFieldType65, (int) (short) 10, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder80 = dateTimeFormatterBuilder13.appendSignedDecimal(dateTimeFieldType65, 160, 151);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder83 = dateTimeFormatterBuilder13.appendFractionOfDay(123, 630);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "dayOfYear" + "'", str28, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "dayOfYear" + "'", str47, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder64);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "dayOfYear" + "'", str66, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder74);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder77);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder80);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder83);
    }

    @Test
    public void test24199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24199");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType3.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType3);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap6);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendLiteral("en_US");
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendDecimal(dateTimeFieldType10, 360000000, 2000);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter17.withChronology(chronology18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter17.withDefaultYear((-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder14.append(dateTimeFormatter17);
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = null;
        org.joda.time.format.DateTimeParser dateTimeParser24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter23, dateTimeParser24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withChronology(chronology26);
        java.lang.Integer int28 = dateTimeFormatter27.getPivotYear();
        java.util.Locale locale29 = java.util.Locale.JAPANESE;
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        int int33 = dateTimeFormatter32.getDefaultYear();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter32.withChronology(chronology34);
        java.util.Locale locale36 = java.util.Locale.CHINESE;
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.lang.String str38 = locale36.getDisplayVariant(locale37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter35.withLocale(locale37);
        java.lang.String str40 = locale29.getDisplayScript(locale37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter27.withLocale(locale37);
        org.joda.time.Chronology chronology42 = dateTimeFormatter41.getChronology();
        java.lang.Integer int43 = dateTimeFormatter41.getPivotYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder22.append(dateTimeFormatter41);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder22.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder22.appendMonthOfYear(115200000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder47.appendPattern("\u4e2d\u6587\u4e2d\u56fd)");
        org.joda.time.format.DateTimePrinter dateTimePrinter50 = dateTimeFormatterBuilder47.toPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ja");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2000 + "'", int33 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNull(chronology42);
        org.junit.Assert.assertNull(int43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimePrinter50);
    }

    @Test
    public void test24200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24200");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str4 = dateTimeFieldType3.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder2.appendDecimal(dateTimeFieldType3, (int) (byte) 0, (int) (short) 1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendTimeZoneName(strMap8);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMillisOfSecond((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder11.appendClockhourOfHalfday((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder11.appendLiteral("\u4e2d\u6587");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder11.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder11.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendYearOfEra(1440000, 2000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendHourOfDay(22);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap25 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendTimeZoneShortName(strMap25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "dayOfYear" + "'", str4, "dayOfYear");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
    }
}
