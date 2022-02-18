import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest40 {

    public static boolean debug = false;

    @Test
    public void test20001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20001");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.List<java.util.Locale> localeList6 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale12.getCountry();
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.lang.String str16 = locale12.getDisplayVariant(locale15);
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("weekOfWeekyear");
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.lang.String str23 = locale19.getDisplayLanguage(locale21);
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("weekOfWeekyear");
        java.util.Locale.Category category26 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale27 = java.util.Locale.ENGLISH;
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.lang.String str29 = locale27.getDisplayCountry(locale28);
        java.lang.String str30 = locale27.getDisplayName();
        java.util.Locale.setDefault(category26, locale27);
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.lang.String str34 = locale32.getDisplayCountry(locale33);
        java.lang.String str35 = locale32.getDisplayName();
        boolean boolean36 = locale32.hasExtensions();
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale8, locale9, locale10, locale12, locale18, locale21, locale25, locale27, locale32 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap41);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList42, strMap43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList42, strMap45);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localeList6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "English" + "'", str23, "English");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.FORMAT + "'", category26.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "English" + "'", str30, "English");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "English" + "'", str35, "English");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(languageRangeList46);
    }

    @Test
    public void test20002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20002");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYearOfCentury((int) 'x', 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField(chronology14);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder9.appendText(dateTimeFieldType13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder9.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder9.appendYearOfCentury(100, 421200000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendSecondOfDay(22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder23.appendFraction(dateTimeFieldType26, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder29.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder29.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder32.appendDayOfMonth((int) (short) 0);
        org.joda.time.format.DateTimeParser dateTimeParser35 = dateTimeFormatterBuilder34.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder20.append(dateTimeParser35);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder36.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder36.appendMillisOfDay(38400000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeParser35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
    }

    @Test
    public void test20003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20003");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.lang.String str3 = locale1.getCountry();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale1.getDisplayVariant(locale4);
        java.lang.String str6 = locale1.getDisplayVariant();
        java.lang.String str7 = locale1.getCountry();
        java.util.Set<java.lang.String> strSet8 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale1.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test20004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20004");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ko-KR");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder2.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder6 = builder4.setLanguage("English");
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.util.Set<java.lang.Character> charSet10 = locale7.getExtensionKeys();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("dayOfMonth");
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.lang.String str16 = locale14.getCountry();
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.lang.String str18 = locale14.getDisplayVariant(locale17);
        java.util.Locale locale19 = locale14.stripExtensions();
        java.lang.String str20 = locale12.getDisplayCountry(locale19);
        java.lang.String str21 = locale7.getDisplayLanguage(locale12);
        java.util.Locale locale22 = locale7.stripExtensions();
        java.util.Locale.Builder builder23 = builder6.setLocale(locale22);
        java.util.Locale.Builder builder25 = builder6.addUnicodeLocaleAttribute("UTC");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = org.joda.time.format.DateTimeFormat.fullDateTime();
        boolean boolean27 = dateTimeFormatter26.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter26.withDefaultYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter29.withOffsetParsed();
        org.joda.time.ReadableInstant readableInstant31 = null;
        java.lang.String str32 = dateTimeFormatter30.print(readableInstant31);
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.util.Locale locale34 = java.util.Locale.ENGLISH;
        java.util.Locale locale35 = java.util.Locale.ENGLISH;
        java.lang.String str36 = locale34.getDisplayCountry(locale35);
        java.util.Set<java.lang.Character> charSet37 = locale34.getExtensionKeys();
        java.lang.String str38 = locale33.getDisplayVariant(locale34);
        java.util.Locale locale39 = java.util.Locale.ENGLISH;
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.lang.String str41 = locale39.getDisplayCountry(locale40);
        java.lang.String str42 = locale40.getCountry();
        java.util.Locale locale43 = java.util.Locale.CHINA;
        java.lang.String str44 = locale40.getDisplayVariant(locale43);
        java.lang.String str45 = locale34.getDisplayScript(locale40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter30.withLocale(locale40);
        java.util.Locale.Builder builder47 = builder25.setLocale(locale40);
        java.lang.String str48 = locale1.getDisplayScript(locale40);
        java.util.Locale locale49 = locale40.stripExtensions();
        java.util.Set<java.lang.String> strSet50 = locale40.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "English" + "'", str21, "English");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Friday, February 11, 2022 10:00:48 AM +00:00" + "'", str32, "Friday, February 11, 2022 10:00:48 AM +00:00");
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(charSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en");
        org.junit.Assert.assertNotNull(strSet50);
    }

    @Test
    public void test20005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20005");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendFractionOfHour(2000, (int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendFixedSignedDecimal(dateTimeFieldType6, (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendFractionOfSecond(40, (int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendDayOfMonth((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendMonthOfYearShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType15.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType18 = dateTimeFieldType15.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder14.appendFraction(dateTimeFieldType15, (int) 'u', 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder14.appendSecondOfDay(26);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder14.appendMillisOfDay((int) 'x');
        java.lang.Class<?> wildcardClass26 = dateTimeFormatterBuilder14.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test20006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20006");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatterBuilder8.toPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter10.getZone();
        int int12 = dateTimeFormatter10.getDefaultYear();
        java.util.Locale locale13 = dateTimeFormatter10.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser14 = dateTimeFormatter10.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser14);
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.lang.String str20 = locale16.getDisplayLanguage(locale18);
        java.lang.String str21 = locale16.getCountry();
        java.lang.String str22 = locale16.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter15.withLocale(locale16);
        java.lang.String str25 = locale16.getUnicodeLocaleType("ZH");
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone26.adjustOffset((long) (short) 10, false);
        long long31 = dateTimeZone26.convertUTCToLocal((long) (byte) 1);
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.util.Locale locale34 = java.util.Locale.ENGLISH;
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        java.lang.String str36 = locale33.getDisplayName();
        java.lang.String str37 = locale33.getISO3Country();
        java.util.Locale locale38 = null;
        java.lang.String str39 = locale33.getDisplayScript(locale38);
        java.lang.String str40 = dateTimeZone26.getName(100L, locale33);
        java.util.Locale locale43 = new java.util.Locale("\u4e2d\u6587", "hi!");
        java.lang.String str44 = locale33.getDisplayName(locale43);
        java.lang.String str45 = locale16.getDisplayVariant(locale43);
        java.lang.String str46 = locale16.toLanguageTag();
        java.lang.String str47 = locale16.toLanguageTag();
        java.util.Locale locale50 = new java.util.Locale("yearOfEra", "2/11/22");
        java.lang.String str51 = locale50.getDisplayVariant();
        java.util.Locale locale52 = java.util.Locale.CHINESE;
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.util.Locale locale54 = java.util.Locale.ENGLISH;
        java.util.Locale locale55 = java.util.Locale.ENGLISH;
        java.lang.String str56 = locale54.getDisplayCountry(locale55);
        java.util.Set<java.lang.Character> charSet57 = locale54.getExtensionKeys();
        java.lang.String str58 = locale53.getDisplayVariant(locale54);
        java.lang.String str59 = locale52.getDisplayCountry(locale53);
        java.util.Set<java.lang.String> strSet60 = locale52.getUnicodeLocaleKeys();
        java.lang.String str61 = locale50.getDisplayLanguage(locale52);
        java.lang.String str62 = locale16.getDisplayLanguage(locale50);
        java.util.Set<java.lang.Character> charSet63 = locale16.getExtensionKeys();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(dateTimeParser14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "eng" + "'", str22, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "English" + "'", str36, "English");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertEquals(locale43.toString(), "\u4e2d\u6587_HI!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "English" + "'", str44, "English");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "en" + "'", str46, "en");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "en" + "'", str47, "en");
        org.junit.Assert.assertEquals(locale50.toString(), "yearofera_2/11/22");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh");
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "en");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(charSet57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "yearofera" + "'", str61, "yearofera");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "English" + "'", str62, "English");
        org.junit.Assert.assertNotNull(charSet63);
    }

    @Test
    public void test20007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20007");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendFractionOfHour(2000, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendDayOfWeek((int) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.longTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withOffsetParsed();
        boolean boolean10 = dateTimeFormatter8.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter8.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendOptional(dateTimeParser11);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder0.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder13.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendMillisOfDay((int) (short) 10);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap17 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder14.appendTimeZoneShortName(strMap17);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder18.appendTimeZoneName();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder18.appendFraction(dateTimeFieldType20, 0, 246);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
    }

    @Test
    public void test20008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20008");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = dateTimeFormatter0.getPrinter();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone4.adjustOffset((long) (short) 10, false);
        long long11 = dateTimeZone4.convertLocalToUTC((long) 1, false, (long) ' ');
        long long13 = dateTimeZone4.nextTransition((long) 1);
        boolean boolean14 = dateTimeZone4.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter3.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = dateTimeFormatter16.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = dateTimeFormatter16.getPrinter();
        org.joda.time.Chronology chronology21 = dateTimeFormatter16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeFormatter16.getZone();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimePrinter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimePrinter19);
        org.junit.Assert.assertNotNull(dateTimePrinter20);
        org.junit.Assert.assertNull(chronology21);
        org.junit.Assert.assertNull(dateTimeZone22);
    }

    @Test
    public void test20009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20009");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale0.getDisplayScript(locale1);
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.lang.String str7 = locale5.getCountry();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale5.getDisplayVariant(locale8);
        java.lang.String str10 = locale0.getDisplayCountry(locale8);
        java.lang.String str11 = locale0.getDisplayScript();
        java.lang.String str12 = locale0.getDisplayName();
        java.lang.String str13 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Japanese" + "'", str12, "Japanese");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test20010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20010");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.lang.String str4 = locale1.getDisplayName();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category6);
        java.util.Locale locale10 = java.util.Locale.getDefault(category6);
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale11.getISO3Language();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.lang.String str20 = locale16.getDisplayLanguage(locale18);
        java.lang.String str21 = locale16.getCountry();
        java.lang.String str22 = locale15.getDisplayVariant(locale16);
        java.lang.String str23 = locale15.getScript();
        java.util.Locale locale27 = new java.util.Locale("", "English", "");
        java.lang.String str28 = locale15.getDisplayScript(locale27);
        java.lang.String str29 = locale11.getDisplayScript(locale27);
        java.util.Locale.setDefault(category6, locale27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.util.Locale locale34 = java.util.Locale.ENGLISH;
        java.lang.String str35 = locale33.getDisplayCountry(locale34);
        java.lang.String str36 = locale32.getDisplayLanguage(locale34);
        java.util.Locale locale37 = java.util.Locale.ENGLISH;
        java.util.Locale locale38 = java.util.Locale.ENGLISH;
        java.lang.String str39 = locale37.getDisplayCountry(locale38);
        java.lang.String str40 = locale37.getDisplayName();
        boolean boolean41 = locale37.hasExtensions();
        boolean boolean42 = locale37.hasExtensions();
        java.lang.String str43 = locale32.getDisplayName(locale37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter31.withLocale(locale37);
        java.util.Locale locale45 = locale37.stripExtensions();
        java.util.Locale.setDefault(locale45);
        java.util.Locale.setDefault(category6, locale45);
        java.util.Locale locale48 = java.util.Locale.getDefault(category6);
        java.lang.String str49 = locale1.getDisplayScript(locale48);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ita" + "'", str13, "ita");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals(locale27.toString(), "_ENGLISH");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "English" + "'", str36, "English");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "English" + "'", str40, "English");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "English" + "'", str43, "English");
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test20011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20011");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("China");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "und");
        java.util.Locale.Builder builder12 = builder5.setLanguageTag("TWN");
        java.util.Locale locale13 = builder12.build();
        java.lang.String str14 = locale13.getISO3Country();
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale16.getDisplayCountry(locale17);
        java.util.Set<java.lang.Character> charSet19 = locale16.getExtensionKeys();
        java.lang.String str20 = locale15.getDisplayVariant(locale16);
        boolean boolean21 = locale16.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.lang.String str26 = locale24.getDisplayCountry(locale25);
        java.lang.String str27 = locale23.getDisplayLanguage(locale25);
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.lang.String str30 = locale28.getDisplayCountry(locale29);
        java.lang.String str31 = locale28.getDisplayName();
        boolean boolean32 = locale28.hasExtensions();
        boolean boolean33 = locale28.hasExtensions();
        java.lang.String str34 = locale23.getDisplayName(locale28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter22.withLocale(locale28);
        java.util.Locale locale36 = java.util.Locale.ENGLISH;
        java.util.Locale locale37 = java.util.Locale.ENGLISH;
        java.lang.String str38 = locale36.getDisplayCountry(locale37);
        java.lang.String str39 = locale37.getCountry();
        java.util.Locale locale40 = java.util.Locale.CHINA;
        java.lang.String str41 = locale37.getDisplayVariant(locale40);
        java.util.Locale locale44 = new java.util.Locale("yearOfEra", "zh");
        java.lang.String str45 = locale37.getDisplayLanguage(locale44);
        java.lang.String str46 = locale28.getDisplayVariant(locale37);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        long long51 = dateTimeZone48.adjustOffset((long) (short) 10, false);
        long long55 = dateTimeZone48.convertLocalToUTC((long) 1, false, (long) ' ');
        long long57 = dateTimeZone48.nextTransition((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone48);
        long long60 = dateTimeZone47.getMillisKeepLocal(dateTimeZone48, (long) 'x');
        boolean boolean62 = dateTimeZone48.isStandardOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.UTC;
        long long66 = dateTimeZone63.adjustOffset((long) (short) 10, false);
        long long68 = dateTimeZone48.getMillisKeepLocal(dateTimeZone63, 0L);
        java.lang.String str70 = dateTimeZone63.getName((long) (short) 100);
        java.lang.String str71 = dateTimeZone63.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.util.Locale locale74 = java.util.Locale.ENGLISH;
        java.util.Locale locale75 = java.util.Locale.ENGLISH;
        java.util.Locale locale76 = java.util.Locale.ENGLISH;
        java.lang.String str77 = locale75.getDisplayCountry(locale76);
        java.lang.String str78 = locale74.getDisplayLanguage(locale76);
        java.util.Locale locale79 = java.util.Locale.ENGLISH;
        java.util.Locale locale80 = java.util.Locale.ENGLISH;
        java.lang.String str81 = locale79.getDisplayCountry(locale80);
        java.lang.String str82 = locale79.getDisplayName();
        boolean boolean83 = locale79.hasExtensions();
        boolean boolean84 = locale79.hasExtensions();
        java.lang.String str85 = locale74.getDisplayName(locale79);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = dateTimeFormatter73.withLocale(locale79);
        java.lang.String str87 = locale79.getCountry();
        java.lang.String str88 = dateTimeZone63.getName((long) 0, locale79);
        java.lang.String str89 = locale28.getDisplayVariant(locale79);
        java.lang.String str90 = locale16.getDisplayLanguage(locale79);
        java.lang.String str91 = locale79.getLanguage();
        java.lang.String str92 = locale79.getLanguage();
        java.lang.String str93 = locale13.getDisplayName(locale79);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "twn");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "English" + "'", str27, "English");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "English" + "'", str31, "English");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "English" + "'", str34, "English");
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals(locale44.toString(), "yearofera_ZH");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "English" + "'", str45, "English");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L + "'", long51 == 10L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 120L + "'", long60 == 120L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 10L + "'", long66 == 10L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "+00:00" + "'", str70, "+00:00");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "UTC" + "'", str71, "UTC");
        org.junit.Assert.assertNotNull(dateTimeFormatter73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "English" + "'", str78, "English");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "en");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "English" + "'", str82, "English");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "English" + "'", str85, "English");
        org.junit.Assert.assertNotNull(dateTimeFormatter86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "+00:00" + "'", str88, "+00:00");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "English" + "'", str90, "English");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "en" + "'", str91, "en");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "en" + "'", str92, "en");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "twn" + "'", str93, "twn");
    }

    @Test
    public void test20012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20012");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale2.getDisplayCountry(locale3);
        java.lang.String str5 = locale1.getDisplayLanguage(locale3);
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale6.getDisplayCountry(locale7);
        java.lang.String str9 = locale6.getDisplayName();
        boolean boolean10 = locale6.hasExtensions();
        boolean boolean11 = locale6.hasExtensions();
        java.lang.String str12 = locale1.getDisplayName(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter0.withLocale(locale6);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = locale14.getDisplayCountry(locale15);
        java.lang.String str17 = locale15.getCountry();
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.lang.String str19 = locale15.getDisplayVariant(locale18);
        java.util.Locale locale22 = new java.util.Locale("yearOfEra", "zh");
        java.lang.String str23 = locale15.getDisplayLanguage(locale22);
        java.lang.String str24 = locale6.getDisplayVariant(locale15);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone26.adjustOffset((long) (short) 10, false);
        long long33 = dateTimeZone26.convertLocalToUTC((long) 1, false, (long) ' ');
        long long35 = dateTimeZone26.nextTransition((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        long long38 = dateTimeZone25.getMillisKeepLocal(dateTimeZone26, (long) 'x');
        boolean boolean40 = dateTimeZone26.isStandardOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        long long44 = dateTimeZone41.adjustOffset((long) (short) 10, false);
        long long46 = dateTimeZone26.getMillisKeepLocal(dateTimeZone41, 0L);
        java.lang.String str48 = dateTimeZone41.getName((long) (short) 100);
        java.lang.String str49 = dateTimeZone41.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.util.Locale locale52 = java.util.Locale.ENGLISH;
        java.util.Locale locale53 = java.util.Locale.ENGLISH;
        java.util.Locale locale54 = java.util.Locale.ENGLISH;
        java.lang.String str55 = locale53.getDisplayCountry(locale54);
        java.lang.String str56 = locale52.getDisplayLanguage(locale54);
        java.util.Locale locale57 = java.util.Locale.ENGLISH;
        java.util.Locale locale58 = java.util.Locale.ENGLISH;
        java.lang.String str59 = locale57.getDisplayCountry(locale58);
        java.lang.String str60 = locale57.getDisplayName();
        boolean boolean61 = locale57.hasExtensions();
        boolean boolean62 = locale57.hasExtensions();
        java.lang.String str63 = locale52.getDisplayName(locale57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter51.withLocale(locale57);
        java.lang.String str65 = locale57.getCountry();
        java.lang.String str66 = dateTimeZone41.getName((long) 0, locale57);
        java.lang.String str67 = locale6.getDisplayVariant(locale57);
        java.util.Locale locale70 = new java.util.Locale("fr_FR", "Friday, February 11, 2022 9:53:09 AM +00:00");
        java.lang.String str71 = locale57.getDisplayLanguage(locale70);
        java.lang.String str72 = locale57.getDisplayCountry();
        java.lang.String str73 = locale57.getDisplayScript();
        java.lang.String str74 = locale57.toLanguageTag();
        java.util.Locale locale75 = java.util.Locale.getDefault();
        java.util.Locale locale76 = java.util.Locale.ENGLISH;
        java.util.Locale locale77 = java.util.Locale.ENGLISH;
        java.lang.String str78 = locale76.getDisplayCountry(locale77);
        java.util.Set<java.lang.Character> charSet79 = locale76.getExtensionKeys();
        java.lang.String str80 = locale75.getDisplayVariant(locale76);
        java.lang.String str81 = locale57.getDisplayVariant(locale75);
        java.lang.String str82 = locale75.getDisplayName();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English" + "'", str9, "English");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals(locale22.toString(), "yearofera_ZH");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "English" + "'", str23, "English");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 120L + "'", long38 == 120L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 10L + "'", long44 == 10L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "UTC" + "'", str49, "UTC");
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "English" + "'", str56, "English");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "English" + "'", str60, "English");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "English" + "'", str63, "English");
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "+00:00" + "'", str66, "+00:00");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals(locale70.toString(), "fr_fr_FRIDAY, FEBRUARY 11, 2022 9:53:09 AM +00:00");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "English" + "'", str71, "English");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "en" + "'", str74, "en");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(charSet79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "English" + "'", str82, "English");
    }

    @Test
    public void test20013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20013");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        java.lang.String str3 = dateTimeZone1.getShortName(116L);
        boolean boolean5 = dateTimeZone1.isStandardOffset(162L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:00" + "'", str3, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20014");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = dateTimeFormatter0.getPrinter();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone4.adjustOffset((long) (short) 10, false);
        long long11 = dateTimeZone4.convertLocalToUTC((long) 1, false, (long) ' ');
        long long13 = dateTimeZone4.nextTransition((long) 1);
        boolean boolean14 = dateTimeZone4.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter3.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 52);
        org.joda.time.Chronology chronology18 = dateTimeFormatter3.getChronology();
        java.lang.Appendable appendable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(appendable19, (-474600138L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimePrinter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(chronology18);
    }

    @Test
    public void test20015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20015");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = dateTimeFormatter0.getPrinter();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone4.adjustOffset((long) (short) 10, false);
        long long11 = dateTimeZone4.convertLocalToUTC((long) 1, false, (long) ' ');
        long long13 = dateTimeZone4.nextTransition((long) 1);
        boolean boolean14 = dateTimeZone4.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter3.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter15.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withPivotYear((java.lang.Integer) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = dateTimeFormatter16.getPrinter();
        boolean boolean20 = dateTimeFormatter16.isPrinter();
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(stringBuffer21, (long) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimePrinter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimePrinter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test20016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20016");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getISO3Language();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
    }

    @Test
    public void test20017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20017");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTimeZoneShortName();
        dateTimeFormatterBuilder3.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder5.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendTwoDigitYear(4200000, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendLiteral("Chinese");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendSecondOfMinute((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder11.appendPattern("\u5e74\u6708\u65e5\u661f\u671f\u4e09\u4e0b\u5348\u6642\u5206\u79d2 +00:00");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendMinuteOfHour(101);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendTwoDigitYear(2234, false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test20018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20018");
        java.util.Locale locale1 = new java.util.Locale("\u5e74\u6708\u65e5\u661f\u671f\u4e09\u4e0b\u5348\u6642\u5206\u79d2 +00:00");
        java.util.Locale.Category category2 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale3 = java.util.Locale.PRC;
        java.util.Locale.setDefault(category2, locale3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category2);
        java.util.Locale locale6 = java.util.Locale.getDefault(category2);
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale7.getISO3Language();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.lang.String str16 = locale12.getDisplayLanguage(locale14);
        java.lang.String str17 = locale12.getCountry();
        java.lang.String str18 = locale11.getDisplayVariant(locale12);
        java.lang.String str19 = locale11.getScript();
        java.util.Locale locale23 = new java.util.Locale("", "English", "");
        java.lang.String str24 = locale11.getDisplayScript(locale23);
        java.lang.String str25 = locale7.getDisplayScript(locale23);
        java.util.Locale.setDefault(category2, locale23);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder27.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder28.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder28.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder28.appendCenturyOfEra(0, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder28.appendMinuteOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter40 = dateTimeFormatter39.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder36.append(dateTimePrinter40);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder41.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder41.appendLiteral('a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale47 = java.util.Locale.ENGLISH;
        java.lang.String str48 = locale47.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter46.withLocale(locale47);
        boolean boolean50 = dateTimeFormatter49.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter49.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder41.append(dateTimeFormatter52);
        org.joda.time.DateTime dateTime55 = dateTimeFormatter52.parseDateTime("Thursday, January 1, 1970");
        java.util.Locale locale56 = dateTimeFormatter52.getLocale();
        java.util.Locale locale57 = locale56.stripExtensions();
        java.util.Locale.setDefault(category2, locale56);
        java.util.Locale locale60 = java.util.Locale.forLanguageTag("\u4e0a\u5348\u65f6\u5206\u79d2");
        java.lang.String str61 = locale56.getDisplayScript(locale60);
        java.lang.String str62 = locale56.getISO3Language();
        java.lang.String str63 = locale56.getDisplayScript();
        java.lang.String str64 = locale1.getDisplayLanguage(locale56);
        java.lang.String str65 = locale56.toLanguageTag();
        java.lang.Object obj66 = locale56.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "\u5e74\u6708\u65e5\u661f\u671f\u4e09\u4e0b\u5348\u6642\u5206\u79d2 +00:00");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.FORMAT + "'", category2.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ita" + "'", str9, "ita");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "English" + "'", str16, "English");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals(locale23.toString(), "_ENGLISH");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimePrinter40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "eng" + "'", str48, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "eng" + "'", str62, "eng");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\u5e74\u6708\u65e5\u661f\u671f\u4e09\u4e0b\u5348\u6642\u5206\u79d2 +00:00" + "'", str64, "\u5e74\u6708\u65e5\u661f\u671f\u4e09\u4e0b\u5348\u6642\u5206\u79d2 +00:00");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "en" + "'", str65, "en");
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj66), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "en");
    }

    @Test
    public void test20019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20019");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("mercredi 31 d\351cembre 1969 23 h 59 +00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: mercredi 31 de?cembre 1969 23 h 59 +00:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20020");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder1.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder1.appendCenturyOfEra(0, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = dateTimeFormatter12.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.append(dateTimePrinter13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder14.appendLiteral('a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter19.withLocale(locale20);
        boolean boolean23 = dateTimeFormatter22.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder14.append(dateTimeFormatter25);
        org.joda.time.DateTime dateTime28 = dateTimeFormatter25.parseDateTime("Thursday, January 1, 1970");
        java.lang.String str30 = dateTimeFormatter25.print((-4199900L));
        java.util.Locale locale31 = dateTimeFormatter25.getLocale();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimePrinter13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "eng" + "'", str21, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Wednesday, December 31, 1969" + "'", str30, "Wednesday, December 31, 1969");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
    }

    @Test
    public void test20021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20021");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder4 = builder2.setLanguage("English");
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        java.util.Set<java.lang.Character> charSet8 = locale5.getExtensionKeys();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("dayOfMonth");
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale12.getCountry();
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.lang.String str16 = locale12.getDisplayVariant(locale15);
        java.util.Locale locale17 = locale12.stripExtensions();
        java.lang.String str18 = locale10.getDisplayCountry(locale17);
        java.lang.String str19 = locale5.getDisplayLanguage(locale10);
        java.util.Locale locale20 = locale5.stripExtensions();
        java.util.Locale.Builder builder21 = builder4.setLocale(locale20);
        java.util.Locale.Builder builder23 = builder4.addUnicodeLocaleAttribute("UTC");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = org.joda.time.format.DateTimeFormat.fullDateTime();
        boolean boolean25 = dateTimeFormatter24.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter24.withDefaultYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter27.withOffsetParsed();
        org.joda.time.ReadableInstant readableInstant29 = null;
        java.lang.String str30 = dateTimeFormatter28.print(readableInstant29);
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.util.Locale locale33 = java.util.Locale.ENGLISH;
        java.lang.String str34 = locale32.getDisplayCountry(locale33);
        java.util.Set<java.lang.Character> charSet35 = locale32.getExtensionKeys();
        java.lang.String str36 = locale31.getDisplayVariant(locale32);
        java.util.Locale locale37 = java.util.Locale.ENGLISH;
        java.util.Locale locale38 = java.util.Locale.ENGLISH;
        java.lang.String str39 = locale37.getDisplayCountry(locale38);
        java.lang.String str40 = locale38.getCountry();
        java.util.Locale locale41 = java.util.Locale.CHINA;
        java.lang.String str42 = locale38.getDisplayVariant(locale41);
        java.lang.String str43 = locale32.getDisplayScript(locale38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter28.withLocale(locale38);
        java.util.Locale.Builder builder45 = builder23.setLocale(locale38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder47 = builder23.addUnicodeLocaleAttribute("fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "English" + "'", str19, "English");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Friday, February 11, 2022 10:00:49 AM +00:00" + "'", str30, "Friday, February 11, 2022 10:00:49 AM +00:00");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(charSet35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test20022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20022");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'u', 1);
        boolean boolean3 = dateTimeZone2.isFixed();
        long long6 = dateTimeZone2.convertLocalToUTC((-3600000L), false);
        long long9 = dateTimeZone2.adjustOffset((-4200000L), false);
        java.lang.String str10 = dateTimeZone2.toString();
        int int12 = dateTimeZone2.getStandardOffset((long) 10);
        boolean boolean13 = dateTimeZone2.isFixed();
        long long15 = dateTimeZone2.convertUTCToLocal((-34199990L));
        int int17 = dateTimeZone2.getOffset(96L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-424860000L) + "'", long6 == (-424860000L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-4200000L) + "'", long9 == (-4200000L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+117:01" + "'", str10, "+117:01");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 421260000 + "'", int12 == 421260000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 387060010L + "'", long15 == 387060010L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 421260000 + "'", int17 == 421260000);
    }

    @Test
    public void test20023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20023");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale2.getDisplayCountry(locale3);
        java.lang.String str5 = locale2.getDisplayName();
        java.lang.String str6 = locale2.getISO3Country();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder11 = builder7.setExtension('u', "");
        java.util.Locale.Builder builder13 = builder7.setVariant("");
        java.util.Locale.Builder builder15 = builder13.removeUnicodeLocaleAttribute("english");
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("English");
        java.util.Locale.Builder builder18 = builder15.setLocale(locale17);
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(category19, locale20);
        java.util.Locale locale22 = java.util.Locale.getDefault(category19);
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.lang.String str26 = locale24.getDisplayCountry(locale25);
        java.lang.String str27 = locale23.getDisplayLanguage(locale25);
        java.lang.String str28 = locale23.getCountry();
        java.lang.String str29 = locale23.getISO3Language();
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.lang.String str33 = locale31.getDisplayCountry(locale32);
        java.util.Set<java.lang.Character> charSet34 = locale31.getExtensionKeys();
        java.lang.String str35 = locale30.getDisplayVariant(locale31);
        java.lang.String str36 = locale23.getDisplayVariant(locale31);
        java.lang.String str37 = locale31.getDisplayVariant();
        java.util.Locale.setDefault(locale31);
        java.lang.String str39 = locale31.toLanguageTag();
        java.util.Locale.setDefault(category19, locale31);
        java.util.Locale locale41 = java.util.Locale.ITALIAN;
        java.util.Locale locale42 = locale41.stripExtensions();
        java.util.Locale locale43 = locale41.stripExtensions();
        java.lang.String str44 = locale41.getDisplayLanguage();
        java.util.Locale.Category category45 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale46 = java.util.Locale.PRC;
        java.util.Locale.setDefault(category45, locale46);
        java.util.Locale locale48 = java.util.Locale.getDefault(category45);
        java.util.Locale locale49 = java.util.Locale.getDefault(category45);
        java.util.Locale locale50 = java.util.Locale.getDefault(category45);
        java.lang.String str51 = locale41.getDisplayName(locale50);
        java.lang.String str52 = locale31.getDisplayVariant(locale50);
        java.lang.String str53 = locale50.getISO3Language();
        java.lang.String str54 = locale50.getISO3Country();
        java.util.Locale.Builder builder55 = builder18.setLocale(locale50);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder57 = builder55.setLanguageTag("\u5e74\u6708\u65e5\u661f\u671f\u4e94\u4e0a\u5348\u65f6\u5206\u79d2 +00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 2022?2?11? ??? ??10?00?27? +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "english");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.FORMAT + "'", category19.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "English" + "'", str27, "English");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "eng" + "'", str29, "eng");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(charSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en" + "'", str39, "en");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "it");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Italian" + "'", str44, "Italian");
        org.junit.Assert.assertTrue("'" + category45 + "' != '" + java.util.Locale.Category.FORMAT + "'", category45.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str51, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "zho" + "'", str53, "zho");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "CHN" + "'", str54, "CHN");
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test20024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20024");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder8.appendWeekOfWeekyear((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendLiteral("weekOfWeekyear");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter13.getZone();
        int int15 = dateTimeFormatter13.getDefaultYear();
        java.util.Locale locale16 = dateTimeFormatter13.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = dateTimeFormatter13.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendMinuteOfDay(0);
        boolean boolean21 = dateTimeFormatterBuilder18.canBuildFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeFormatter22.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser24 = dateTimeFormatter22.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder18.append(dateTimeParser24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder10.append(dateTimeParser24);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder10.appendFixedSignedDecimal(dateTimeFieldType28, 2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter32 = dateTimeFormatter31.getPrinter();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter31.withChronology(chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeFormatter34.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter34.withPivotYear((java.lang.Integer) 40);
        org.joda.time.format.DateTimePrinter dateTimePrinter38 = dateTimeFormatter37.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeFormatter39.getZone();
        int int41 = dateTimeFormatter39.getDefaultYear();
        java.util.Locale locale42 = dateTimeFormatter39.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser43 = dateTimeFormatter39.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder44.appendMinuteOfDay(0);
        boolean boolean47 = dateTimeFormatterBuilder44.canBuildFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatterBuilder44.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter50 = dateTimeFormatter49.getPrinter();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter49.withChronology(chronology51);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.UTC;
        long long56 = dateTimeZone53.adjustOffset((long) (short) 10, false);
        long long60 = dateTimeZone53.convertLocalToUTC((long) 1, false, (long) ' ');
        long long62 = dateTimeZone53.nextTransition((long) 1);
        boolean boolean63 = dateTimeZone53.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter52.withZone(dateTimeZone53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter64.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter66 = dateTimeFormatter65.getPrinter();
        int int67 = dateTimeFormatter65.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser68 = dateTimeFormatter65.getParser();
        org.joda.time.format.DateTimeParser dateTimeParser69 = dateTimeFormatter65.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder70 = dateTimeFormatterBuilder44.appendOptional(dateTimeParser69);
        org.joda.time.format.DateTimeParser[] dateTimeParserArray71 = new org.joda.time.format.DateTimeParser[] { dateTimeParser43, dateTimeParser69 };
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder72 = dateTimeFormatterBuilder10.append(dateTimePrinter38, dateTimeParserArray71);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder72.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder74 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder77 = dateTimeFormatterBuilder74.appendFixedDecimal(dateTimeFieldType75, (int) (byte) 10);
        org.joda.time.Chronology chronology78 = null;
        boolean boolean79 = dateTimeFieldType75.isSupported(chronology78);
        org.joda.time.DurationFieldType durationFieldType80 = dateTimeFieldType75.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder83 = dateTimeFormatterBuilder73.appendSignedDecimal(dateTimeFieldType75, 108, 22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder85 = dateTimeFormatterBuilder73.appendMinuteOfDay((-23));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2000 + "'", int15 == 2000);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(dateTimePrinter17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeParser24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNotNull(dateTimePrinter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimePrinter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2000 + "'", int41 == 2000);
        org.junit.Assert.assertNull(locale42);
        org.junit.Assert.assertNotNull(dateTimeParser43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNotNull(dateTimePrinter50);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10L + "'", long56 == 10L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNotNull(dateTimePrinter66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2000 + "'", int67 == 2000);
        org.junit.Assert.assertNotNull(dateTimeParser68);
        org.junit.Assert.assertNotNull(dateTimeParser69);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder70);
        org.junit.Assert.assertNotNull(dateTimeParserArray71);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder72);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
        org.junit.Assert.assertNotNull(dateTimeFieldType75);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(durationFieldType80);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder83);
    }

    @Test
    public void test20025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20025");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYearOfCentury((int) 'x', 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField(chronology14);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder9.appendText(dateTimeFieldType13);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType17.getField(chronology18);
        org.joda.time.Chronology chronology20 = null;
        boolean boolean21 = dateTimeFieldType17.isSupported(chronology20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder16.appendDecimal(dateTimeFieldType17, (int) (short) 100, (int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder24.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.appendClockhourOfDay(38400000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
    }

    @Test
    public void test20026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20026");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendYearOfEra((int) (short) 1, (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder10.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendDayOfMonth((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder14.appendFraction(dateTimeFieldType17, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder20.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendDayOfMonth((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder23.appendClockhourOfHalfday((int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder27.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder29.appendFraction(dateTimeFieldType32, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder29.appendMinuteOfDay(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter38 = dateTimeFormatterBuilder37.toPrinter();
        int int39 = dateTimePrinter38.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeFormatter40.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser42 = dateTimeFormatter40.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder27.append(dateTimePrinter38, dateTimeParser42);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder13.append(dateTimePrinter38);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder44.appendMillisOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder47.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder47.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder47.appendFractionOfHour(2000, (int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder52.appendFixedSignedDecimal(dateTimeFieldType53, (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder52.appendFractionOfSecond(40, (int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder58.appendDayOfMonth((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder58.appendMonthOfYearShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType63 = dateTimeFieldType62.getDurationType();
        org.joda.time.DurationFieldType durationFieldType64 = dateTimeFieldType62.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType65 = dateTimeFieldType62.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder61.appendFraction(dateTimeFieldType62, (int) 'u', 1);
        java.lang.String str69 = dateTimeFieldType62.toString();
        org.joda.time.DurationFieldType durationFieldType70 = dateTimeFieldType62.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder44.appendFraction(dateTimeFieldType62, 279, (int) (short) 1);
        java.lang.String str74 = dateTimeFieldType62.toString();
        java.lang.String str75 = dateTimeFieldType62.getName();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimePrinter38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 26 + "'", int39 == 26);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTimeParser42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "weekOfWeekyear" + "'", str69, "weekOfWeekyear");
        org.junit.Assert.assertNotNull(durationFieldType70);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "weekOfWeekyear" + "'", str74, "weekOfWeekyear");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "weekOfWeekyear" + "'", str75, "weekOfWeekyear");
    }

    @Test
    public void test20027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20027");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendDayOfMonth((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder5.appendHourOfHalfday(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendFractionOfDay((int) '#', (int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendMonthOfYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendHourOfHalfday(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = dateTimeFormatter18.getPrinter();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter18.withChronology(chronology20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        long long25 = dateTimeZone22.adjustOffset((long) (short) 10, false);
        long long29 = dateTimeZone22.convertLocalToUTC((long) 1, false, (long) ' ');
        long long31 = dateTimeZone22.nextTransition((long) 1);
        boolean boolean32 = dateTimeZone22.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter21.withZone(dateTimeZone22);
        boolean boolean34 = dateTimeFormatter33.isParser();
        java.util.Locale locale35 = dateTimeFormatter33.getLocale();
        org.joda.time.Chronology chronology36 = dateTimeFormatter33.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter37 = dateTimeFormatter33.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder17.append(dateTimePrinter37);
        org.joda.time.format.DateTimePrinter dateTimePrinter39 = dateTimeFormatterBuilder17.toPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimePrinter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(locale35);
        org.junit.Assert.assertNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimePrinter37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimePrinter39);
    }

    @Test
    public void test20028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20028");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFixedDecimal(dateTimeFieldType1, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendSecondOfMinute((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendMinuteOfDay(2000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatterBuilder5.toFormatter();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        boolean boolean11 = dateTimeFormatter8.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withDefaultYear(187260000);
        boolean boolean16 = dateTimeFormatter12.isPrinter();
        boolean boolean17 = dateTimeFormatter12.isParser();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test20029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20029");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((int) 'x');
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone9.isFixed();
        int int12 = dateTimeZone9.getOffset((long) (byte) -1);
        long long14 = dateTimeZone9.convertUTCToLocal((-4199900L));
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 40);
        java.lang.String str19 = dateTimeZone17.getNameKey((long) 26);
        long long21 = dateTimeZone9.getMillisKeepLocal(dateTimeZone17, 36600116L);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        boolean boolean24 = dateTimeZone22.isStandardOffset((long) 'a');
        int int26 = dateTimeZone22.getOffsetFromLocal((long) (short) -1);
        java.util.Locale locale28 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str29 = dateTimeZone22.getName((long) (-1), locale28);
        java.util.Locale locale30 = locale28.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter4.printTo(writer5, (long) 93660000, chronology7, 102, dateTimeZone17, locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimePrinter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-4199900L) + "'", long14 == (-4199900L));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1799884L) + "'", long21 == (-1799884L));
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
    }

    @Test
    public void test20030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20030");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale locale9 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale9.getUnicodeLocaleType("\u5e74\u6708\u65e5\u661f\u671f\u4e94\u4e0a\u5348\u65f6\u5206\u79d2 +00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 1970?1?2? ??? ??01?50?00? +00:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test20031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20031");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        int int2 = dateTimeFormatter0.getDefaultYear();
        java.util.Locale locale3 = dateTimeFormatter0.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter0.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter0.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendFraction(dateTimeFieldType9, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder6.appendMinuteOfDay(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatterBuilder14.toPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeFormatter16.getZone();
        int int18 = dateTimeFormatter16.getDefaultYear();
        java.util.Locale locale19 = dateTimeFormatter16.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser20 = dateTimeFormatter16.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours(52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withZone(dateTimeZone24);
        java.util.TimeZone timeZone26 = dateTimeZone24.toTimeZone();
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder28.setLanguage("");
        java.util.Locale.Builder builder32 = builder30.addUnicodeLocaleAttribute("English");
        java.util.Locale locale33 = builder30.build();
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("eng");
        java.lang.String str36 = locale33.getDisplayCountry(locale35);
        java.lang.String str37 = locale35.getLanguage();
        java.lang.String str38 = locale35.getDisplayScript();
        java.lang.String str39 = dateTimeZone24.getShortName((long) (-23), locale35);
        java.lang.String str40 = locale35.getLanguage();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2000 + "'", int2 == 2000);
        org.junit.Assert.assertNull(locale3);
        org.junit.Assert.assertNotNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimePrinter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2000 + "'", int18 == 2000);
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNotNull(dateTimeParser20);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "eng");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "eng" + "'", str37, "eng");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+52:00" + "'", str39, "+52:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "eng" + "'", str40, "eng");
    }

    @Test
    public void test20032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20032");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatterBuilder0.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendWeekOfWeekyear(279);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder5.appendLiteral('a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYearOfEra(97, 42600115);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendMillisOfDay(474600137);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
    }

    @Test
    public void test20033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20033");
        java.util.Locale locale2 = new java.util.Locale("Friday, February 11, 2022 9:56:09 AM +00:00", "PMDecember1119000000000000000000000000000000000310000086399");
        org.junit.Assert.assertEquals(locale2.toString(), "friday, february 11, 2022 9:56:09 am +00:00_PMDECEMBER1119000000000000000000000000000000000310000086399");
    }

    @Test
    public void test20034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20034");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatterBuilder0.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder5.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder5.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder5.appendYear(0, 22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendDayOfWeekShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder11.appendSignedDecimal(dateTimeFieldType12, 4200000, 92);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendWeekyear(102, 100);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test20035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20035");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 'a');
        int int4 = dateTimeZone0.getOffsetFromLocal((long) (short) -1);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        java.lang.String str6 = dateTimeZone0.getID();
        java.lang.String str7 = dateTimeZone0.getID();
        java.lang.String str8 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test20036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20036");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.adjustOffset((long) (short) 10, false);
        long long7 = dateTimeZone0.convertLocalToUTC((long) 1, false, (long) ' ');
        long long9 = dateTimeZone0.nextTransition((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int12 = dateTimeZone0.getOffsetFromLocal((long) 'x');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test20037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20037");
        java.util.Locale locale3 = new java.util.Locale("ZH", "dayOfMonth", "weekyear");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.getDisplayName();
        java.lang.String str6 = locale3.getDisplayScript();
        java.util.Set<java.lang.String> strSet7 = locale3.getUnicodeLocaleKeys();
        java.util.Locale locale11 = new java.util.Locale("\u82f1\u6587\u82f1\u56fd)", "English (United Kingdom)", "Friday, February 11, 2022 9:53:47 AM +00:00");
        java.lang.String str12 = locale3.getDisplayLanguage(locale11);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_DAYOFMONTH_weekyear");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DAYOFMONTH" + "'", str4, "DAYOFMONTH");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (DAYOFMONTH,weekyear)" + "'", str5, "Chinese (DAYOFMONTH,weekyear)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals(locale11.toString(), "\u82f1\u6587\u82f1\u56fd)_ENGLISH (UNITED KINGDOM)_Friday, February 11, 2022 9:53:47 AM +00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinese" + "'", str12, "Chinese");
    }

    @Test
    public void test20038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20038");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendFractionOfMinute((int) (short) 1, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendText(dateTimeFieldType12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendSecondOfMinute((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendClockhourOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendWeekOfWeekyear(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder19.appendFraction(dateTimeFieldType20, (int) (short) 10, (int) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatterBuilder23.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withPivotYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter24.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology29 = dateTimeFormatter28.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate31 = dateTimeFormatter28.parseLocalDate("Friday, February 11, 2022 9:53:54 AM +00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Friday, February 11, 2022 9:53:5...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(chronology29);
    }

    @Test
    public void test20039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20039");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYearOfCentury((int) 'x', 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField(chronology14);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder9.appendText(dateTimeFieldType13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendLiteral("halfdayOfDay");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeFormatter19.getZone();
        int int21 = dateTimeFormatter19.getDefaultYear();
        boolean boolean22 = dateTimeFormatter19.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter19.withZoneUTC();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder18.append(dateTimeFormatter19);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder18.appendTwoDigitWeekyear((int) (byte) 10, false);
        boolean boolean28 = dateTimeFormatterBuilder18.canBuildParser();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap29 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder18.appendTimeZoneShortName(strMap29);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder18.appendTimeZoneId();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2000 + "'", int21 == 2000);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
    }

    @Test
    public void test20040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20040");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.adjustOffset((long) (short) 10, false);
        long long8 = dateTimeZone1.convertLocalToUTC((long) 1, false, (long) ' ');
        long long10 = dateTimeZone1.nextTransition((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long13 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) 'x');
        long long16 = dateTimeZone1.convertLocalToUTC((long) (short) 100, false);
        long long19 = dateTimeZone1.adjustOffset(0L, false);
        boolean boolean20 = dateTimeZone1.isFixed();
        boolean boolean21 = dateTimeZone1.isFixed();
        int int23 = dateTimeZone1.getOffsetFromLocal(432000000L);
        long long25 = dateTimeZone1.convertUTCToLocal((-364199900L));
        java.lang.String str26 = dateTimeZone1.toString();
        java.util.TimeZone timeZone27 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone28 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 120L + "'", long13 == 120L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-364199900L) + "'", long25 == (-364199900L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test20041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20041");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfMonth((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendClockhourOfHalfday((int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendSecondOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder16.appendFraction(dateTimeFieldType19, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder16.appendMinuteOfDay(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap25 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder16.appendTimeZoneName(strMap25);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder16.appendClockhourOfDay((int) (byte) 10);
        boolean boolean29 = dateTimeFormatterBuilder28.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder28.appendFractionOfDay(2000, 40);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder32.appendMillisOfDay(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str36 = dateTimeFieldType35.getName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder34.appendFixedSignedDecimal(dateTimeFieldType35, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder39.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder39.appendFraction(dateTimeFieldType42, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder39.appendMinuteOfDay(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter48 = dateTimeFormatterBuilder47.toPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone50 = dateTimeFormatter49.getZone();
        int int51 = dateTimeFormatter49.getDefaultYear();
        java.util.Locale locale52 = dateTimeFormatter49.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser53 = dateTimeFormatter49.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter48, dateTimeParser53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone56 = dateTimeFormatter55.getZone();
        int int57 = dateTimeFormatter55.getDefaultYear();
        java.util.Locale locale58 = dateTimeFormatter55.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser59 = dateTimeFormatter55.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter60 = dateTimeFormatter55.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.DateTimeZone dateTimeZone62 = dateTimeFormatter61.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser63 = dateTimeFormatter61.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter60, dateTimeParser63);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder38.append(dateTimePrinter48, dateTimeParser63);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder13.appendOptional(dateTimeParser63);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder13.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder13.appendEraText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "dayOfMonth" + "'", str36, "dayOfMonth");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertNotNull(dateTimePrinter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2000 + "'", int51 == 2000);
        org.junit.Assert.assertNull(locale52);
        org.junit.Assert.assertNotNull(dateTimeParser53);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNull(dateTimeZone56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2000 + "'", int57 == 2000);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(dateTimeParser59);
        org.junit.Assert.assertNotNull(dateTimePrinter60);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(dateTimeParser63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
    }

    @Test
    public void test20042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20042");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder1.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMinuteOfDay((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendTwoDigitWeekyear((int) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatterBuilder6.toFormatter();
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.lang.String str11 = locale10.getDisplayScript();
        java.util.Locale locale12 = locale10.stripExtensions();
        java.util.Locale.setDefault(locale10);
        java.lang.String str14 = locale10.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter9.withLocale(locale10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter9.withOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zho" + "'", str14, "zho");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test20043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20043");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone4.adjustOffset((long) (short) 10, false);
        long long11 = dateTimeZone4.convertLocalToUTC((long) 1, false, (long) ' ');
        int int13 = dateTimeZone4.getStandardOffset((long) 100);
        boolean boolean14 = languageRange1.equals((java.lang.Object) int13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "english" + "'", str3, "english");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20044");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder1.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder1.appendCenturyOfEra(0, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder1.appendDayOfMonth((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfWeek((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendFractionOfHour((int) 'a', (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder9.appendMillisOfDay((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder16.appendTwoDigitWeekyear((int) 'x', true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder19.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendHourOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder19.appendTwoDigitWeekyear(235, true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
    }

    @Test
    public void test20045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 'u');
        long long7 = dateTimeZone1.convertLocalToUTC((-4200001L), false, (-1L));
        java.lang.String str8 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone11.adjustOffset((long) (short) 10, false);
        int int16 = dateTimeZone11.getStandardOffset(100L);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone17.adjustOffset((long) (short) 10, false);
        long long23 = dateTimeZone17.convertLocalToUTC((long) (byte) 1, true);
        boolean boolean24 = dateTimeZone17.isFixed();
        java.util.TimeZone timeZone25 = dateTimeZone17.toTimeZone();
        long long27 = dateTimeZone17.previousTransition(52L);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        boolean boolean30 = dateTimeZone28.isStandardOffset((long) 'a');
        int int32 = dateTimeZone28.getOffsetFromLocal((long) (short) -1);
        java.util.TimeZone timeZone33 = dateTimeZone28.toTimeZone();
        long long35 = dateTimeZone28.convertUTCToLocal((long) 40);
        long long37 = dateTimeZone28.previousTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        boolean boolean40 = dateTimeZone38.isStandardOffset((long) 'a');
        int int42 = dateTimeZone38.getOffsetFromLocal((long) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = org.joda.time.format.DateTimeFormat.fullDateTime();
        boolean boolean44 = dateTimeFormatter43.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter43.withDefaultYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder47.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder48.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder48.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder48.appendCenturyOfEra(0, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder48.appendMinuteOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder56.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter60 = dateTimeFormatter59.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder56.append(dateTimePrinter60);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder61.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder61.appendLiteral('a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale67 = java.util.Locale.ENGLISH;
        java.lang.String str68 = locale67.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter66.withLocale(locale67);
        boolean boolean70 = dateTimeFormatter69.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter69.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder61.append(dateTimeFormatter72);
        org.joda.time.DateTime dateTime75 = dateTimeFormatter72.parseDateTime("Thursday, January 1, 1970");
        java.lang.String str76 = dateTimeFormatter46.print((org.joda.time.ReadableInstant) dateTime75);
        int int77 = dateTimeZone38.getOffset((org.joda.time.ReadableInstant) dateTime75);
        int int78 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) dateTime75);
        int int79 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) dateTime75);
        int int80 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateTime75);
        int int81 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime75);
        boolean boolean82 = dateTimeZone1.isFixed();
        boolean boolean84 = dateTimeZone1.isStandardOffset(0L);
        boolean boolean85 = dateTimeZone1.isFixed();
        long long88 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.util.Locale locale91 = java.util.Locale.forLanguageTag("China");
        java.lang.String str92 = dateTimeZone1.getShortName((long) 20, locale91);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-364200001L) + "'", long7 == (-364200001L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:00" + "'", str8, "+100:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 40L + "'", long35 == 40L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimePrinter60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertNotNull(dateTimeFormatter66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "eng" + "'", str68, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter72);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
        org.junit.Assert.assertNotNull(dateTime75);
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\u5e74\u6708\u65e5\u661f\u671f\u56db\u4e0a\u5348\u65f6\u5206\u79d2 +00:00" + "'", str76, "\u5e74\u6708\u65e5\u661f\u671f\u56db\u4e0a\u5348\u65f6\u5206\u79d2 +00:00");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 360000000 + "'", int81 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + (-360000000L) + "'", long88 == (-360000000L));
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "china");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "+100:00" + "'", str92, "+100:00");
    }

    @Test
    public void test20046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20046");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("coreano (Corea del Sud)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=coreano(coreadelsud)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20047");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        long long3 = dateTimeZone1.convertUTCToLocal((long) 115200000);
        int int5 = dateTimeZone1.getStandardOffset(415680000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 475200000L + "'", long3 == 475200000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 360000000 + "'", int5 == 360000000);
    }

    @Test
    public void test20048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20048");
        java.util.Locale locale1 = new java.util.Locale("Friday, February 11, 2022 9:54:55 AM +00:00");
        org.junit.Assert.assertEquals(locale1.toString(), "friday, february 11, 2022 9:54:55 am +00:00");
    }

    @Test
    public void test20049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20049");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguage("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("UTC");
        java.util.Locale.Builder builder7 = builder3.removeUnicodeLocaleAttribute("weekyear");
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Locale.Builder builder9 = builder7.setLocale(locale8);
        java.util.Locale.Builder builder10 = builder7.clearExtensions();
        java.util.Locale.Builder builder11 = builder7.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test20050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20050");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendFractionOfMinute((int) (short) 1, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder8.appendMonthOfYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder8.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder8.appendYearOfCentury((int) '#', (int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.joda.time.format.DateTimeFormat.longTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter18.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser21 = dateTimeFormatter18.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder8.appendOptional(dateTimeParser21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendMonthOfYear(40);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder22.appendWeekOfWeekyear(195);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeParser21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
    }

    @Test
    public void test20051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20051");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.toLanguageTag();
        boolean boolean3 = locale0.hasExtensions();
        java.util.Locale locale4 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
    }

    @Test
    public void test20052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20052");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType2);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap4 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendTimeZoneName(strMap4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendYearOfCentury((int) (short) 1, 0);
        org.joda.time.format.DateTimeParser dateTimeParser9 = dateTimeFormatterBuilder0.toParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatterBuilder0.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendLiteral("und");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendClockhourOfHalfday(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendDayOfWeek((int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder14.appendTwoDigitWeekyear(0, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder19.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendTwoDigitYear((-3600000));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder22.appendMonthOfYearShortText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder22.appendYearOfCentury((-144000314), 2045);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeParser9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test20053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20053");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder1.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder1.appendCenturyOfEra(0, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder1.appendDayOfMonth((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder9.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendHourOfHalfday(421200000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder10.appendMinuteOfHour(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendDayOfMonth((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder16.appendFractionOfSecond(35, 26);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap20 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendTimeZoneShortName(strMap20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder21.appendLiteral("de");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test20054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20054");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale2.getDisplayCountry(locale3);
        java.util.Set<java.lang.Character> charSet5 = locale2.getExtensionKeys();
        java.lang.String str6 = locale1.getDisplayVariant(locale2);
        java.lang.String str7 = locale0.getDisplayCountry(locale1);
        java.lang.String str8 = locale0.getDisplayScript();
        java.lang.String str9 = locale0.toLanguageTag();
        java.util.Locale locale10 = locale0.stripExtensions();
        java.util.Locale locale11 = locale0.stripExtensions();
        java.util.Locale locale13 = new java.util.Locale("Friday, February 11, 2022 9:50:57 AM +00:00");
        java.util.Locale.setDefault(locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeFormatter15.getZone();
        int int17 = dateTimeFormatter15.getDefaultYear();
        java.lang.Integer int18 = dateTimeFormatter15.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withOffsetParsed();
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale20.getDisplayCountry(locale21);
        java.lang.String str23 = locale20.getDisplayName();
        boolean boolean24 = locale20.hasExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter15.withLocale(locale20);
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.util.Locale locale30 = java.util.Locale.ENGLISH;
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.lang.String str32 = locale28.getDisplayLanguage(locale30);
        java.lang.String str33 = locale28.getCountry();
        java.lang.String str34 = locale27.getDisplayVariant(locale28);
        java.lang.String str35 = locale20.getDisplayName(locale28);
        java.lang.String str36 = locale13.getDisplayScript(locale28);
        java.lang.String str37 = locale28.getVariant();
        java.lang.String str38 = locale0.getDisplayVariant(locale28);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertEquals(locale13.toString(), "friday, february 11, 2022 9:50:57 am +00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2000 + "'", int17 == 2000);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "English" + "'", str23, "English");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "English" + "'", str32, "English");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "English" + "'", str35, "English");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test20055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20055");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendTwoDigitYear(26, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendYear(1, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendLiteral("Friday, February 11, 2022 9:51:04 AM +00:00");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendTwoDigitWeekyear((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder15.appendMonthOfYear((int) (byte) 100);
        boolean boolean20 = dateTimeFormatterBuilder19.canBuildPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test20056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20056");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendTimeZoneOffset("yearOfEra", "", true, (int) (byte) 10, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendClockhourOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder16.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendMinuteOfDay(0);
        boolean boolean21 = dateTimeFormatterBuilder18.canBuildFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeFormatter22.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser24 = dateTimeFormatter22.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder18.append(dateTimeParser24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder16.appendOptional(dateTimeParser24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder26.appendSecondOfDay(4200000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendMillisOfDay(38400000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder29.appendDayOfMonth((int) 'u');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = org.joda.time.format.DateTimeFormat.mediumDate();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder29.append(dateTimeFormatter34);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendMonthOfYear(180);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeParser24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
    }

    @Test
    public void test20057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20057");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("+32:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test20058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20058");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = dateTimeFormatter0.getPrinter();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone4.adjustOffset((long) (short) 10, false);
        long long11 = dateTimeZone4.convertLocalToUTC((long) 1, false, (long) ' ');
        long long13 = dateTimeZone4.nextTransition((long) 1);
        boolean boolean14 = dateTimeZone4.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter3.withZone(dateTimeZone4);
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = dateTimeFormatter15.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder18.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder18.appendCenturyOfEra(0, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder18.appendDayOfMonth((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendDayOfWeek((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder26.appendFractionOfHour((int) 'a', (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder26.appendMillisOfDay((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder33.appendTimeZoneOffset("Thursday, January 1, 1970", false, (int) '4', (int) (byte) 100);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap39 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder38.appendTimeZoneName(strMap39);
        org.joda.time.format.DateTimeParser dateTimeParser41 = dateTimeFormatterBuilder38.toParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser41);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeFormatter42.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime45 = dateTimeFormatter42.parseLocalDateTime("Friday, February 11, 2022 9:56:52 AM +00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Friday, February 11, 2022 9:56:5...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimePrinter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimePrinter16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeParser41);
        org.junit.Assert.assertNull(dateTimeZone43);
    }

    @Test
    public void test20059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20059");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfMonth((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendClockhourOfHalfday((int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendSecondOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder16.appendYear(349200000, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder16.appendMinuteOfHour(299);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder22.appendFraction(dateTimeFieldType25, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder28.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder29.appendTimeZoneOffset("yearOfEra", "", true, (int) (byte) 10, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendClockhourOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder35.appendLiteral('a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder35.appendHourOfDay((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder41.appendFixedSignedDecimal(dateTimeFieldType42, (int) 'a');
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType42.getField(chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType42.getField(chronology47);
        java.lang.String str49 = dateTimeFieldType42.toString();
        java.lang.String str50 = dateTimeFieldType42.getName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder16.appendSignedDecimal(dateTimeFieldType42, 160, 4010);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType42.getField(chronology54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "secondOfMinute" + "'", str49, "secondOfMinute");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "secondOfMinute" + "'", str50, "secondOfMinute");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeField55);
    }

    @Test
    public void test20060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20060");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType2);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap4 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendTimeZoneName(strMap4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendYearOfCentury((int) (short) 1, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendMillisOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendFractionOfDay((int) ' ', 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendClockhourOfHalfday(42600115);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder16.appendEraText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test20061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20061");
        java.util.Locale locale2 = new java.util.Locale("000000000", "zh_CN");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale2.toString(), "000000000_ZH_CN");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test20062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20062");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendTimeZoneOffset("yearOfEra", "", true, (int) (byte) 10, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder13.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendHourOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendYear((int) 'x', (-421200001));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendYearOfCentury((-33), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
    }

    @Test
    public void test20063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20063");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        boolean boolean1 = dateTimeFormatter0.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 0);
        boolean boolean4 = dateTimeFormatter0.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withDefaultYear((int) '#');
        boolean boolean7 = dateTimeFormatter6.isOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test20064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20064");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder2.appendFraction(dateTimeFieldType5, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder2.appendMinuteOfDay(0);
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) dateTimeFormatterBuilder10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder10.appendClockhourOfHalfday(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder10.appendFractionOfSecond(360000294, 2372);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
    }

    @Test
    public void test20065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20065");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.lang.String str4 = locale2.getDisplayCountry(locale3);
        java.lang.String str5 = locale2.getDisplayName();
        java.lang.String str6 = locale2.getISO3Country();
        java.util.Locale.Builder builder7 = builder0.setLocale(locale2);
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.setLanguage("ENGLISH");
        java.util.Locale.Builder builder13 = builder10.setExtension('u', "");
        java.util.Locale locale14 = builder13.build();
        java.util.Locale.Builder builder15 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.lang.String str20 = locale17.getDisplayName();
        java.lang.String str21 = locale17.getISO3Country();
        java.util.Locale.Builder builder22 = builder15.setLocale(locale17);
        boolean boolean23 = locale17.hasExtensions();
        java.lang.String str24 = locale17.toLanguageTag();
        java.lang.String str25 = locale17.getVariant();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        java.util.Locale locale30 = java.util.Locale.ENGLISH;
        java.lang.String str31 = locale29.getDisplayCountry(locale30);
        java.lang.String str32 = locale28.getDisplayLanguage(locale30);
        java.lang.String str33 = locale28.getCountry();
        java.lang.String str34 = locale27.getDisplayVariant(locale28);
        java.lang.String str35 = locale27.getScript();
        java.util.Locale locale39 = new java.util.Locale("", "English", "");
        java.lang.String str40 = locale27.getDisplayScript(locale39);
        java.lang.String str41 = locale39.getLanguage();
        java.lang.String str42 = locale39.getISO3Language();
        java.lang.String str43 = locale17.getDisplayLanguage(locale39);
        java.util.Locale locale44 = java.util.Locale.CHINESE;
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.util.Locale locale46 = java.util.Locale.ENGLISH;
        java.util.Locale locale47 = java.util.Locale.ENGLISH;
        java.lang.String str48 = locale46.getDisplayCountry(locale47);
        java.util.Set<java.lang.Character> charSet49 = locale46.getExtensionKeys();
        java.lang.String str50 = locale45.getDisplayVariant(locale46);
        java.lang.String str51 = locale44.getDisplayCountry(locale45);
        java.util.Locale locale52 = java.util.Locale.ENGLISH;
        java.util.Locale locale53 = java.util.Locale.ENGLISH;
        java.util.Locale locale54 = java.util.Locale.ENGLISH;
        java.lang.String str55 = locale53.getDisplayCountry(locale54);
        java.lang.String str56 = locale52.getDisplayLanguage(locale54);
        java.lang.String str57 = locale52.getCountry();
        java.lang.String str58 = locale52.getISO3Language();
        java.util.Locale locale59 = java.util.Locale.getDefault();
        java.util.Locale locale60 = java.util.Locale.ENGLISH;
        java.util.Locale locale61 = java.util.Locale.ENGLISH;
        java.lang.String str62 = locale60.getDisplayCountry(locale61);
        java.util.Set<java.lang.Character> charSet63 = locale60.getExtensionKeys();
        java.lang.String str64 = locale59.getDisplayVariant(locale60);
        java.lang.String str65 = locale52.getDisplayVariant(locale60);
        java.lang.String str66 = locale44.getDisplayLanguage(locale60);
        java.lang.String str68 = locale44.getExtension('u');
        java.lang.String str69 = locale39.getDisplayScript(locale44);
        java.util.Locale.Builder builder70 = builder13.setLocale(locale44);
        java.util.Locale.Builder builder71 = builder70.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder73 = builder70.setLanguageTag("monthOfYear");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: monthOfYear [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "english");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en" + "'", str24, "en");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "English" + "'", str32, "English");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals(locale39.toString(), "_ENGLISH");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "English" + "'", str43, "English");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "friday, february 11, 2022 9:50:57 am +00:00");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "English" + "'", str56, "English");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "eng" + "'", str58, "eng");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "friday, february 11, 2022 9:50:57 am +00:00");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(charSet63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Chinese" + "'", str66, "Chinese");
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
    }

    @Test
    public void test20066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20066");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendMillisOfDay((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField(chronology14);
        java.lang.String str16 = dateTimeFieldType13.getName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder12.appendDecimal(dateTimeFieldType13, 100, (int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder12.appendTwoDigitWeekyear(360000000, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder12.appendTwoDigitWeekyear(96);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder12.appendSecondOfMinute(144000000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder27.appendFraction(dateTimeFieldType30, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder33.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder34.appendMillisOfDay(40);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder36.appendTimeZoneOffset("GB", "\u52a0\u62ff\u5927", false, (int) (short) 1, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder43.appendFraction(dateTimeFieldType46, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder49.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder50.appendTimeZoneOffset("yearOfEra", "", true, (int) (byte) 10, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder56.appendClockhourOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder58.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder59.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder61.appendMinuteOfDay(0);
        boolean boolean64 = dateTimeFormatterBuilder61.canBuildFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.DateTimeZone dateTimeZone66 = dateTimeFormatter65.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser67 = dateTimeFormatter65.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder61.append(dateTimeParser67);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder69 = dateTimeFormatterBuilder59.appendOptional(dateTimeParser67);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder70 = dateTimeFormatterBuilder42.appendOptional(dateTimeParser67);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder71 = dateTimeFormatterBuilder26.appendOptional(dateTimeParser67);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder26.appendLiteral("AM1970+00:0070");
        org.joda.time.format.DateTimeParser dateTimeParser74 = dateTimeFormatterBuilder73.toParser();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "yearOfCentury" + "'", str16, "yearOfCentury");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(dateTimeParser67);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder69);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder70);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder71);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
        org.junit.Assert.assertNotNull(dateTimeParser74);
    }

    @Test
    public void test20067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20067");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withPivotYear((java.lang.Integer) 26);
        boolean boolean4 = dateTimeFormatter3.isOffsetParsed();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("eng");
        java.lang.String str7 = locale6.getDisplayVariant();
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.lang.String str10 = locale8.getDisplayCountry(locale9);
        java.lang.String str11 = locale8.getDisplayName();
        java.lang.String str12 = locale8.getISO3Country();
        boolean boolean13 = locale8.hasExtensions();
        boolean boolean14 = locale8.hasExtensions();
        java.lang.String str15 = locale6.getDisplayScript(locale8);
        java.lang.String str16 = locale8.getDisplayLanguage();
        java.lang.String str17 = locale8.getDisplayScript();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter3.withLocale(locale8);
        java.util.Locale locale19 = dateTimeFormatter3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = dateTimeFormatter3.getPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "eng");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English" + "'", str11, "English");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "English" + "'", str16, "English");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimePrinter21);
    }

    @Test
    public void test20068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20068");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendYearOfEra((int) (short) 1, (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder10.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter13.getZone();
        int int15 = dateTimeFormatter13.getDefaultYear();
        java.util.Locale locale16 = dateTimeFormatter13.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = dateTimeFormatter13.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeFormatter18.getZone();
        int int20 = dateTimeFormatter18.getDefaultYear();
        java.util.Locale locale21 = dateTimeFormatter18.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser22 = dateTimeFormatter18.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder11.append(dateTimePrinter17, dateTimeParser22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = dateTimeFormatter24.getPrinter();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter24.withChronology(chronology26);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long31 = dateTimeZone28.adjustOffset((long) (short) 10, false);
        long long35 = dateTimeZone28.convertLocalToUTC((long) 1, false, (long) ' ');
        long long37 = dateTimeZone28.nextTransition((long) 1);
        boolean boolean38 = dateTimeZone28.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter27.withZone(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter39.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter41 = dateTimeFormatter40.getPrinter();
        int int42 = dateTimeFormatter40.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser43 = dateTimeFormatter40.getParser();
        org.joda.time.format.DateTimeParser dateTimeParser44 = dateTimeFormatter40.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser44);
        int int46 = dateTimeParser44.estimateParsedLength();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2000 + "'", int15 == 2000);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(dateTimePrinter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2000 + "'", int20 == 2000);
        org.junit.Assert.assertNull(locale21);
        org.junit.Assert.assertNotNull(dateTimeParser22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimePrinter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimePrinter41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2000 + "'", int42 == 2000);
        org.junit.Assert.assertNotNull(dateTimeParser43);
        org.junit.Assert.assertNotNull(dateTimeParser44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 40 + "'", int46 == 40);
    }

    @Test
    public void test20069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20069");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfMonth((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendSecondOfDay(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder13.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder15.appendFraction(dateTimeFieldType18, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder15.appendMinuteOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder23.appendFractionOfMinute((int) (short) 1, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder23.appendMonthOfYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder23.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder23.appendYear((int) (short) 1, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder32.appendDecimal(dateTimeFieldType33, (int) (byte) 10, (-1));
        java.lang.String str37 = dateTimeFieldType33.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder14.appendFixedSignedDecimal(dateTimeFieldType33, 360000000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder40.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder40.appendFraction(dateTimeFieldType43, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder46.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder47.appendYearOfEra((int) (short) 1, (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder51.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder51.appendFraction(dateTimeFieldType54, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder51.appendMinuteOfDay(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter60 = dateTimeFormatterBuilder59.toPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone62 = dateTimeFormatter61.getZone();
        int int63 = dateTimeFormatter61.getDefaultYear();
        java.util.Locale locale64 = dateTimeFormatter61.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser65 = dateTimeFormatter61.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter60, dateTimeParser65);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder47.appendOptional(dateTimeParser65);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder69 = dateTimeFormatterBuilder67.appendWeekOfWeekyear((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder70 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder72 = dateTimeFormatterBuilder70.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder76 = dateTimeFormatterBuilder70.appendFraction(dateTimeFieldType73, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder77 = dateTimeFormatterBuilder76.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder80 = dateTimeFormatterBuilder77.appendYearOfEra((int) (short) 1, (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder81 = dateTimeFormatterBuilder80.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder83 = dateTimeFormatterBuilder80.appendDayOfMonth((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder87 = dateTimeFormatterBuilder83.appendDecimal(dateTimeFieldType84, (int) (byte) 1, (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder90 = dateTimeFormatterBuilder67.appendFraction(dateTimeFieldType84, (int) (byte) 100, 0);
        org.joda.time.Chronology chronology91 = null;
        org.joda.time.DateTimeField dateTimeField92 = dateTimeFieldType84.getField(chronology91);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder94 = dateTimeFormatterBuilder14.appendFixedDecimal(dateTimeFieldType84, 52);
        org.joda.time.DurationFieldType durationFieldType95 = dateTimeFieldType84.getRangeDurationType();
        java.lang.String str96 = dateTimeFieldType84.toString();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "secondOfMinute" + "'", str37, "secondOfMinute");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimePrinter60);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertNull(dateTimeZone62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2000 + "'", int63 == 2000);
        org.junit.Assert.assertNull(locale64);
        org.junit.Assert.assertNotNull(dateTimeParser65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder69);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder72);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder76);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder77);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder80);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder81);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder83);
        org.junit.Assert.assertNotNull(dateTimeFieldType84);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder87);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder90);
        org.junit.Assert.assertNotNull(dateTimeField92);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder94);
        org.junit.Assert.assertNotNull(durationFieldType95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "yearOfCentury" + "'", str96, "yearOfCentury");
    }

    @Test
    public void test20070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20070");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        boolean boolean1 = dateTimeFormatter0.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone2.adjustOffset((long) (short) 10, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone2);
        java.util.Locale locale9 = new java.util.Locale("weekyear");
        java.lang.String str10 = dateTimeZone2.getShortName((long) 40, locale9);
        java.util.TimeZone timeZone11 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone12.isLocalDateTimeGap(localDateTime13);
        boolean boolean15 = dateTimeZone12.isFixed();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertEquals(locale9.toString(), "weekyear");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20071");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withLocale(locale1);
        boolean boolean4 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        boolean boolean8 = dateTimeFormatter6.isPrinter();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withChronology(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone12.adjustOffset((long) (short) 10, false);
        long long19 = dateTimeZone12.convertLocalToUTC((long) 1, false, (long) ' ');
        long long21 = dateTimeZone12.nextTransition((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        long long24 = dateTimeZone11.getMillisKeepLocal(dateTimeZone12, (long) 'x');
        boolean boolean26 = dateTimeZone12.isStandardOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        long long30 = dateTimeZone27.adjustOffset((long) (short) 10, false);
        long long32 = dateTimeZone12.getMillisKeepLocal(dateTimeZone27, 0L);
        java.lang.String str34 = dateTimeZone27.getNameKey((-4199974L));
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.util.Locale locale37 = java.util.Locale.ENGLISH;
        java.util.Locale locale38 = java.util.Locale.ENGLISH;
        java.lang.String str39 = locale37.getDisplayCountry(locale38);
        java.util.Set<java.lang.Character> charSet40 = locale37.getExtensionKeys();
        java.lang.String str41 = locale36.getDisplayVariant(locale37);
        boolean boolean42 = locale37.hasExtensions();
        java.lang.String str43 = dateTimeZone27.getName((long) 4200000, locale37);
        boolean boolean44 = dateTimeZone27.isFixed();
        int int46 = dateTimeZone27.getOffset((long) (short) 1);
        org.joda.time.LocalDateTime localDateTime47 = null;
        boolean boolean48 = dateTimeZone27.isLocalDateTimeGap(localDateTime47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter6.withZone(dateTimeZone27);
        java.lang.String str51 = dateTimeZone27.getShortName((-110400026L));
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 120L + "'", long24 == 120L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "friday, february 11, 2022 9:50:57 am +00:00");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(charSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00" + "'", str43, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00" + "'", str51, "+00:00");
    }

    @Test
    public void test20072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20072");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder4 = builder2.setLanguage("English");
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category6);
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.lang.String str11 = locale9.getDisplayLanguage();
        java.util.Locale.Builder builder12 = builder5.setLocale(locale9);
        java.util.Locale.Builder builder13 = builder5.clearExtensions();
        java.util.Locale locale14 = builder13.build();
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale16.getDisplayCountry(locale17);
        java.lang.String str19 = locale15.getDisplayLanguage(locale17);
        java.lang.String str20 = locale15.getCountry();
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("dayOfMonth");
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        java.lang.String str25 = locale23.getDisplayCountry(locale24);
        java.lang.String str26 = locale24.getCountry();
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.lang.String str28 = locale24.getDisplayVariant(locale27);
        java.util.Locale locale29 = locale24.stripExtensions();
        java.lang.String str30 = locale22.getDisplayCountry(locale29);
        java.lang.String str31 = locale22.toLanguageTag();
        java.lang.String str32 = locale22.getDisplayName();
        java.lang.String str33 = locale15.getDisplayVariant(locale22);
        java.util.Locale.Builder builder34 = builder13.setLocale(locale15);
        java.util.Locale locale36 = new java.util.Locale("\u82f1\u56fd");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.util.Locale locale38 = java.util.Locale.ENGLISH;
        java.util.Locale locale39 = java.util.Locale.ENGLISH;
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.lang.String str41 = locale39.getDisplayCountry(locale40);
        java.lang.String str42 = locale38.getDisplayLanguage(locale40);
        java.util.Locale locale43 = java.util.Locale.ENGLISH;
        java.util.Locale locale44 = java.util.Locale.ENGLISH;
        java.lang.String str45 = locale43.getDisplayCountry(locale44);
        java.lang.String str46 = locale43.getDisplayName();
        boolean boolean47 = locale43.hasExtensions();
        boolean boolean48 = locale43.hasExtensions();
        java.lang.String str49 = locale38.getDisplayName(locale43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter37.withLocale(locale43);
        java.lang.String str51 = locale36.getDisplayName(locale43);
        java.lang.String str52 = locale36.getScript();
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder54 = builder53.clearExtensions();
        java.util.Locale locale55 = java.util.Locale.ENGLISH;
        java.util.Locale locale56 = java.util.Locale.ENGLISH;
        java.lang.String str57 = locale55.getDisplayCountry(locale56);
        java.lang.String str58 = locale55.getDisplayName();
        java.lang.String str59 = locale55.getISO3Country();
        java.util.Locale.Builder builder60 = builder53.setLocale(locale55);
        java.util.Locale.Builder builder62 = builder53.setScript("");
        java.util.Locale locale63 = builder53.build();
        java.lang.String str64 = locale63.getScript();
        java.lang.String str65 = locale36.getDisplayLanguage(locale63);
        java.util.Locale.Builder builder66 = builder34.setLocale(locale63);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.UTC;
        boolean boolean69 = dateTimeZone67.isStandardOffset((long) 'a');
        boolean boolean71 = dateTimeZone67.isStandardOffset((long) 1);
        java.util.Locale locale72 = java.util.Locale.ENGLISH;
        java.util.Locale locale73 = java.util.Locale.ENGLISH;
        java.util.Locale locale74 = java.util.Locale.ENGLISH;
        java.lang.String str75 = locale73.getDisplayCountry(locale74);
        java.lang.String str76 = locale72.getDisplayLanguage(locale74);
        boolean boolean77 = dateTimeZone67.equals((java.lang.Object) locale74);
        java.lang.String str78 = locale74.getDisplayLanguage();
        java.util.Locale.Builder builder79 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder81 = builder79.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder83 = builder81.setLanguage("English");
        java.util.Locale.Builder builder84 = builder81.clearExtensions();
        java.util.Locale locale85 = builder84.build();
        java.lang.String str86 = locale74.getDisplayLanguage(locale85);
        java.lang.String str87 = locale74.getDisplayVariant();
        java.util.Locale.Builder builder88 = builder66.setLocale(locale74);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "English" + "'", str19, "English");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "und" + "'", str31, "und");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals(locale36.toString(), "\u82f1\u56fd");
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "English" + "'", str42, "English");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "English" + "'", str46, "English");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "English" + "'", str49, "English");
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u82f1\u56fd" + "'", str51, "\u82f1\u56fd");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "English" + "'", str58, "English");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\u82f1\u56fd" + "'", str65, "\u82f1\u56fd");
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "English" + "'", str76, "English");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "English" + "'", str78, "English");
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "english");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "English" + "'", str86, "English");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(builder88);
    }

    @Test
    public void test20073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20073");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 'a');
        boolean boolean4 = dateTimeZone0.isStandardOffset((long) 26);
        int int6 = dateTimeZone0.getOffsetFromLocal(40L);
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.mediumTime();
        boolean boolean9 = dateTimeFormatter8.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 10);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone14.getOffset(readableInstant15);
        long long19 = dateTimeZone14.adjustOffset((-4199900L), false);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone21.adjustOffset((long) (short) 10, false);
        long long28 = dateTimeZone21.convertLocalToUTC((long) 1, false, (long) ' ');
        long long30 = dateTimeZone21.nextTransition((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        long long33 = dateTimeZone20.getMillisKeepLocal(dateTimeZone21, (long) 'x');
        long long36 = dateTimeZone21.convertLocalToUTC((long) (short) 100, false);
        boolean boolean37 = dateTimeZone21.isFixed();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        boolean boolean39 = dateTimeZone38.isFixed();
        java.lang.String str41 = dateTimeZone38.getName((long) 'u');
        java.lang.String str42 = dateTimeZone38.toString();
        long long44 = dateTimeZone21.getMillisKeepLocal(dateTimeZone38, (long) (short) 100);
        long long47 = dateTimeZone38.convertLocalToUTC((long) (short) 10, true);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        boolean boolean50 = dateTimeZone48.isStandardOffset((long) 'a');
        int int52 = dateTimeZone48.getOffsetFromLocal((long) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = org.joda.time.format.DateTimeFormat.fullDateTime();
        boolean boolean54 = dateTimeFormatter53.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter53.withDefaultYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder57.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder58.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder58.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = dateTimeFormatterBuilder58.appendCenturyOfEra(0, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder58.appendMinuteOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder66.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter70 = dateTimeFormatter69.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder71 = dateTimeFormatterBuilder66.append(dateTimePrinter70);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder71.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder75 = dateTimeFormatterBuilder71.appendLiteral('a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale77 = java.util.Locale.ENGLISH;
        java.lang.String str78 = locale77.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter79 = dateTimeFormatter76.withLocale(locale77);
        boolean boolean80 = dateTimeFormatter79.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter82 = dateTimeFormatter79.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder83 = dateTimeFormatterBuilder71.append(dateTimeFormatter82);
        org.joda.time.DateTime dateTime85 = dateTimeFormatter82.parseDateTime("Thursday, January 1, 1970");
        java.lang.String str86 = dateTimeFormatter56.print((org.joda.time.ReadableInstant) dateTime85);
        int int87 = dateTimeZone48.getOffset((org.joda.time.ReadableInstant) dateTime85);
        int int88 = dateTimeZone38.getOffset((org.joda.time.ReadableInstant) dateTime85);
        int int89 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime85);
        java.lang.String str90 = dateTimeFormatter8.print((org.joda.time.ReadableInstant) dateTime85);
        int int91 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4200000 + "'", int16 == 4200000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-4199900L) + "'", long19 == (-4199900L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 120L + "'", long33 == 120L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder64);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertNotNull(dateTimePrinter70);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder71);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder75);
        org.junit.Assert.assertNotNull(dateTimeFormatter76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "eng" + "'", str78, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter82);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder83);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Thursday, January 1, 1970 12:00:00 AM +00:00" + "'", str86, "Thursday, January 1, 1970 12:00:00 AM +00:00");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 4200000 + "'", int89 == 4200000);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "12:00:00 AM" + "'", str90, "12:00:00 AM");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test20074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20074");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendFixedDecimal(dateTimeFieldType1, (int) (byte) 10);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatterBuilder0.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder5.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendMinuteOfDay((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder12.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder13.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendCenturyOfEra(0, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder13.appendDayOfMonth((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType22.getField(chronology23);
        java.lang.String str25 = dateTimeFieldType22.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder13.appendFraction(dateTimeFieldType22, (int) '4', (-1));
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder13.appendHourOfDay((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeFormatter31.getZone();
        int int33 = dateTimeFormatter31.getDefaultYear();
        java.util.Locale locale34 = dateTimeFormatter31.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser35 = dateTimeFormatter31.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = dateTimeFormatter31.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder30.append(dateTimePrinter36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = org.joda.time.format.DateTimeFormat.longTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter38.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter38.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser41 = dateTimeFormatter40.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder9.append(dateTimePrinter36, dateTimeParser41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser41);
        int int44 = dateTimeFormatter43.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime46 = dateTimeFormatter43.parseMutableDateTime("\u5e74\u6708\u65e5\u4e0b\u5348\u65f6\u5206\u79d2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1969?12?31? ??11?59?59?\" is malformed at \"69?12?31? ??11?59?59?\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "yearOfCentury" + "'", str25, "yearOfCentury");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2000 + "'", int33 == 2000);
        org.junit.Assert.assertNull(locale34);
        org.junit.Assert.assertNotNull(dateTimeParser35);
        org.junit.Assert.assertNotNull(dateTimePrinter36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(dateTimeParser41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2000 + "'", int44 == 2000);
    }

    @Test
    public void test20075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20075");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendTwoDigitYear(26, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendFractionOfHour(0, (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendWeekyear(38400204, (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
    }

    @Test
    public void test20076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20076");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap2 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap2);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder3.appendSecondOfDay((int) '4');
        boolean boolean6 = dateTimeFormatterBuilder3.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder7.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendFraction(dateTimeFieldType10, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder13.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder16.appendYearOfCentury((int) 'x', 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType20.getField(chronology21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder16.appendText(dateTimeFieldType20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder16.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder24.appendFractionOfDay(4010, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder27.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType29.getDurationType();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType29.getField(chronology31);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder27.appendShortText(dateTimeFieldType29);
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType29.getRangeDurationType();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType29.getField(chronology35);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder3.appendFixedDecimal(dateTimeFieldType29, 20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
    }

    @Test
    public void test20077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20077");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguage("");
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.util.Locale.Builder builder7 = builder3.setLocale(locale5);
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.lang.String str12 = locale10.getDisplayCountry(locale11);
        java.lang.String str13 = locale9.getDisplayLanguage(locale11);
        java.lang.String str14 = locale9.getCountry();
        java.lang.String str15 = locale9.getISO3Language();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.util.Set<java.lang.Character> charSet20 = locale17.getExtensionKeys();
        java.lang.String str21 = locale16.getDisplayVariant(locale17);
        java.lang.String str22 = locale9.getDisplayVariant(locale17);
        java.lang.String str23 = locale17.getDisplayVariant();
        java.util.Locale.setDefault(locale17);
        java.util.Locale.Builder builder25 = builder7.setLocale(locale17);
        java.util.Locale.Builder builder27 = builder7.removeUnicodeLocaleAttribute("KOR");
        java.util.Locale.Builder builder29 = builder27.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder31 = builder27.setRegion("Wednesday, December 31, 1969 12:00:00 AM +00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Wednesday, December 31, 1969 12:00:00 AM +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "English" + "'", str13, "English");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eng" + "'", str15, "eng");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "friday, february 11, 2022 9:50:57 am +00:00");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test20078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20078");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfMonth((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendClockhourOfHalfday((int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendSecondOfDay((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendFixedSignedDecimal(dateTimeFieldType16, 26);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder15.appendMinuteOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder15.appendLiteral("zho");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendTwoDigitYear(246);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
    }

    @Test
    public void test20079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20079");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        java.lang.String str5 = locale0.getDisplayVariant(locale1);
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale6.getDisplayCountry(locale7);
        java.lang.String str9 = locale7.getCountry();
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale7.getDisplayVariant(locale10);
        java.lang.String str12 = locale1.getDisplayScript(locale7);
        java.lang.String str13 = locale1.toLanguageTag();
        java.lang.String str14 = locale1.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test20080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20080");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("China");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder10 = builder5.setExtension('a', "und");
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.util.Set<java.lang.Character> charSet14 = locale11.getExtensionKeys();
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("dayOfMonth");
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.lang.String str20 = locale18.getCountry();
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.lang.String str22 = locale18.getDisplayVariant(locale21);
        java.util.Locale locale23 = locale18.stripExtensions();
        java.lang.String str24 = locale16.getDisplayCountry(locale23);
        java.lang.String str25 = locale11.getDisplayLanguage(locale16);
        java.util.Locale locale26 = locale11.stripExtensions();
        java.util.Locale.Builder builder27 = builder5.setLocale(locale11);
        java.util.Locale.Builder builder28 = builder5.clear();
        java.util.Locale.Builder builder30 = builder5.setLanguage("");
        java.util.Locale locale31 = java.util.Locale.UK;
        java.util.Locale locale32 = locale31.stripExtensions();
        java.lang.String str33 = locale31.getCountry();
        java.util.Locale locale34 = locale31.stripExtensions();
        java.util.Locale.Builder builder35 = builder5.setLocale(locale31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder37 = builder35.setScript("Friday, February 11, 2022 9:54:12 AM +00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Friday, February 11, 2022 9:54:12 AM +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "English" + "'", str25, "English");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "GB" + "'", str33, "GB");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_GB");
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test20081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20081");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfMonth((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendClockhourOfHalfday((int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder13.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder15.appendFraction(dateTimeFieldType18, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder15.appendMinuteOfDay(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = dateTimeFormatterBuilder23.toPrinter();
        int int25 = dateTimePrinter24.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeFormatter26.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter26.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder13.append(dateTimePrinter24, dateTimeParser28);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder13.appendFractionOfMinute(100, (int) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatterBuilder13.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder13.appendSecondOfMinute((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder13.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatterBuilder13.toFormatter();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter37.withChronology(chronology38);
        java.lang.Integer int40 = dateTimeFormatter39.getPivotYear();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimePrinter24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 26 + "'", int25 == 26);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeParser28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNull(int40);
    }

    @Test
    public void test20082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20082");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder1.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder1.appendCenturyOfEra(0, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder1.appendDayOfMonth((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfWeek((int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendFractionOfHour((int) 'a', (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder9.appendMillisOfDay((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder16.appendTwoDigitWeekyear((int) 'x', true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder16.appendCenturyOfEra((int) (short) 1, 22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = org.joda.time.format.DateTimeFormat.longTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withOffsetParsed();
        boolean boolean25 = dateTimeFormatter23.isOffsetParsed();
        java.util.Locale locale26 = dateTimeFormatter23.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser27 = dateTimeFormatter23.getParser();
        org.joda.time.Chronology chronology28 = dateTimeFormatter23.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter23.withPivotYear((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder16.append(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertNotNull(dateTimeParser27);
        org.junit.Assert.assertNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
    }

    @Test
    public void test20083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20083");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        boolean boolean1 = dateTimeFormatter0.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone2.adjustOffset((long) (short) 10, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withDefaultYear(40);
        boolean boolean12 = dateTimeFormatter11.isPrinter();
        boolean boolean13 = dateTimeFormatter11.isPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20084");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType2);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap4 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendTimeZoneName(strMap4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendHourOfDay((int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendTwoDigitYear(10);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap10 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendTimeZoneName(strMap10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendYearOfCentury(2000, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder11.appendPattern("+00:00:00.052");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder11.appendMinuteOfDay(263);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test20085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20085");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = dateTimeFormatter0.getPrinter();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withChronology(chronology2);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter3.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter3.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withZoneUTC();
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) (-72));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.joda.time.format.DateTimeFormat.longDate();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = dateTimeFormatter11.getPrinter();
        java.lang.String str14 = dateTimeFormatter11.print((long) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withOffsetParsed();
        org.joda.time.Chronology chronology16 = dateTimeFormatter11.getChronolgy();
        boolean boolean17 = dateTimeFormatter11.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.joda.time.format.DateTimeFormat.fullDateTime();
        boolean boolean19 = dateTimeFormatter18.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        long long23 = dateTimeZone20.adjustOffset((long) (short) 10, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter18.withZone(dateTimeZone20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter24.withOffsetParsed();
        java.lang.String str27 = dateTimeFormatter24.print((long) 'u');
        java.util.Locale locale30 = new java.util.Locale("hi!", "weekyear");
        java.util.Locale locale31 = locale30.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter24.withLocale(locale30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale34 = java.util.Locale.ENGLISH;
        java.lang.String str35 = locale34.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter33.withLocale(locale34);
        boolean boolean37 = dateTimeFormatter36.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter36.withPivotYear((int) (short) 100);
        boolean boolean40 = dateTimeFormatter39.isParser();
        java.util.Locale locale41 = java.util.Locale.CHINESE;
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.util.Locale locale43 = java.util.Locale.ENGLISH;
        java.util.Locale locale44 = java.util.Locale.ENGLISH;
        java.lang.String str45 = locale43.getDisplayCountry(locale44);
        java.util.Set<java.lang.Character> charSet46 = locale43.getExtensionKeys();
        java.lang.String str47 = locale42.getDisplayVariant(locale43);
        java.lang.String str48 = locale41.getDisplayCountry(locale42);
        java.lang.String str49 = locale41.getDisplayScript();
        java.lang.String str50 = locale41.toLanguageTag();
        java.util.Locale locale51 = locale41.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter39.withLocale(locale41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale54 = java.util.Locale.ENGLISH;
        java.lang.String str55 = locale54.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter53.withLocale(locale54);
        boolean boolean57 = dateTimeFormatter56.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter56.withPivotYear((int) (short) 100);
        org.joda.time.LocalDate localDate61 = dateTimeFormatter56.parseLocalDate("Wednesday, December 31, 1969");
        java.lang.String str62 = dateTimeFormatter52.print((org.joda.time.ReadablePartial) localDate61);
        java.lang.String str63 = dateTimeFormatter32.print((org.joda.time.ReadablePartial) localDate61);
        java.lang.String str64 = dateTimeFormatter11.print((org.joda.time.ReadablePartial) localDate61);
        java.lang.String str65 = dateTimeFormatter10.print((org.joda.time.ReadablePartial) localDate61);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(stringBuffer7, (org.joda.time.ReadablePartial) localDate61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimePrinter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimePrinter12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "January 1, 1970" + "'", str14, "January 1, 1970");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(chronology16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Thursday, January 1, 1970 12:00:00 AM +00:00" + "'", str27, "Thursday, January 1, 1970 12:00:00 AM +00:00");
        org.junit.Assert.assertEquals(locale30.toString(), "hi!_WEEKYEAR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "hi!_WEEKYEAR");
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "eng" + "'", str35, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(charSet46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "zh" + "'", str50, "zh");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeFormatter53);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "eng" + "'", str55, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(localDate61);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\u5e74\u6708\u65e5\u661f\u671f\u4e09" + "'", str62, "\u5e74\u6708\u65e5\u661f\u671f\u4e09");
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd " + "'", str63, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd ");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "December 31, 1969" + "'", str64, "December 31, 1969");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\ufffd\ufffd\ufffd\ufffd" + "'", str65, "\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test20086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20086");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("UTC", (double) 0);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        java.lang.String str5 = languageRange2.getRange();
        double double6 = languageRange2.getWeight();
        java.lang.String str7 = languageRange2.getRange();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "utc" + "'", str5, "utc");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "utc" + "'", str7, "utc");
    }

    @Test
    public void test20087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20087");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.adjustOffset((long) (short) 10, false);
        long long6 = dateTimeZone0.convertLocalToUTC((long) (byte) 1, true);
        boolean boolean7 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        long long10 = dateTimeZone0.previousTransition(52L);
        long long12 = dateTimeZone0.nextTransition((long) 'x');
        int int14 = dateTimeZone0.getOffset(71L);
        boolean boolean16 = dateTimeZone0.isStandardOffset(52L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 120L + "'", long12 == 120L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20088");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("\u5e74\u6708\u65e5\u661f\u671f\u4e94\u4e0a\u5348\u65f6\u5206\u79d2 +00:00");
        org.joda.time.Chronology chronology2 = dateTimeFormatter1.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter1.withPivotYear(115200000);
        java.util.Locale locale5 = dateTimeFormatter1.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.mediumDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear(4200000);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withChronology(chronology9);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder11.appendFraction(dateTimeFieldType14, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder17.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendYearOfCentury((int) 'x', 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder20.appendText(dateTimeFieldType24);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendLiteral("halfdayOfDay");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeFormatter30.getZone();
        int int32 = dateTimeFormatter30.getDefaultYear();
        boolean boolean33 = dateTimeFormatter30.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter30.withZoneUTC();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder29.append(dateTimeFormatter30);
        java.lang.String str37 = dateTimeFormatter30.print((-23L));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale39 = java.util.Locale.ENGLISH;
        java.lang.String str40 = locale39.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter38.withLocale(locale39);
        boolean boolean42 = dateTimeFormatter41.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter41.withPivotYear((int) (short) 100);
        boolean boolean45 = dateTimeFormatter44.isParser();
        java.util.Locale locale46 = java.util.Locale.CHINESE;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.util.Locale locale48 = java.util.Locale.ENGLISH;
        java.util.Locale locale49 = java.util.Locale.ENGLISH;
        java.lang.String str50 = locale48.getDisplayCountry(locale49);
        java.util.Set<java.lang.Character> charSet51 = locale48.getExtensionKeys();
        java.lang.String str52 = locale47.getDisplayVariant(locale48);
        java.lang.String str53 = locale46.getDisplayCountry(locale47);
        java.lang.String str54 = locale46.getDisplayScript();
        java.lang.String str55 = locale46.toLanguageTag();
        java.util.Locale locale56 = locale46.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter44.withLocale(locale46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale59 = java.util.Locale.ENGLISH;
        java.lang.String str60 = locale59.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter58.withLocale(locale59);
        boolean boolean62 = dateTimeFormatter61.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter61.withPivotYear((int) (short) 100);
        org.joda.time.LocalDate localDate66 = dateTimeFormatter61.parseLocalDate("Wednesday, December 31, 1969");
        java.lang.String str67 = dateTimeFormatter57.print((org.joda.time.ReadablePartial) localDate66);
        java.lang.String str68 = dateTimeFormatter30.print((org.joda.time.ReadablePartial) localDate66);
        java.lang.String str69 = dateTimeFormatter10.print((org.joda.time.ReadablePartial) localDate66);
        java.lang.String str70 = dateTimeFormatter1.print((org.joda.time.ReadablePartial) localDate66);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime72 = dateTimeFormatter1.parseLocalTime("Monday, December 29, 1969 7:59:00 PM +00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Monday, December 29, 1969 7:59:0...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2000 + "'", int32 == 2000);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Wednesday, December 31, 1969 11:59:59 PM +00:00" + "'", str37, "Wednesday, December 31, 1969 11:59:59 PM +00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "eng" + "'", str40, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(charSet51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "zh" + "'", str55, "zh");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "eng" + "'", str60, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
        org.junit.Assert.assertNotNull(localDate66);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\u5e74\u6708\u65e5\u661f\u671f\u4e09" + "'", str67, "\u5e74\u6708\u65e5\u661f\u671f\u4e09");
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd " + "'", str68, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd ");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str69, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\u5e74\u6708\u65e5\u661f\u671f\u4e94\u4e0a\u5348\u65f6\u5206\u79d2 +00:00" + "'", str70, "\u5e74\u6708\u65e5\u661f\u671f\u4e94\u4e0a\u5348\u65f6\u5206\u79d2 +00:00");
    }

    @Test
    public void test20089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20089");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfMonth((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendYearOfCentury(4200000, 26);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendWeekOfWeekyear((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder16.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder17.appendWeekyear(279, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        java.lang.String str22 = dateTimeFieldType21.getName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder20.appendShortText(dateTimeFieldType21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder20.appendHourOfHalfday(299);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.append(dateTimeFormatter26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No formatter supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "halfdayOfDay" + "'", str22, "halfdayOfDay");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
    }

    @Test
    public void test20090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20090");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder2.appendHourOfDay((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder4.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder4.appendDayOfWeek(52);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder7.appendMonthOfYearText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
    }

    @Test
    public void test20091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20091");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder7.appendTimeZoneOffset("yearOfEra", "", true, (int) (byte) 10, (int) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeFormatter14.getZone();
        int int16 = dateTimeFormatter14.getDefaultYear();
        java.util.Locale locale17 = dateTimeFormatter14.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = dateTimeFormatter14.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = dateTimeFormatter14.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder20.appendFraction(dateTimeFieldType23, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder26.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeFormatter28.getZone();
        int int30 = dateTimeFormatter28.getDefaultYear();
        java.util.Locale locale31 = dateTimeFormatter28.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter32 = dateTimeFormatter28.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = dateTimeFormatter28.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeFormatter34.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser36 = dateTimeFormatter34.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder27.append(dateTimePrinter33, dateTimeParser36);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder7.append(dateTimePrinter19, dateTimeParser36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = org.joda.time.format.DateTimeFormat.fullDateTime();
        boolean boolean40 = dateTimeFormatter39.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter39.withDefaultYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter42.withOffsetParsed();
        boolean boolean44 = dateTimeFormatter43.isOffsetParsed();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder38.append(dateTimeFormatter43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter43.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.util.Locale locale48 = java.util.Locale.ENGLISH;
        java.util.Locale locale49 = java.util.Locale.ENGLISH;
        java.util.Locale locale50 = java.util.Locale.ENGLISH;
        java.lang.String str51 = locale49.getDisplayCountry(locale50);
        java.lang.String str52 = locale48.getDisplayLanguage(locale50);
        java.util.Locale locale53 = java.util.Locale.ENGLISH;
        java.util.Locale locale54 = java.util.Locale.ENGLISH;
        java.lang.String str55 = locale53.getDisplayCountry(locale54);
        java.lang.String str56 = locale53.getDisplayName();
        boolean boolean57 = locale53.hasExtensions();
        boolean boolean58 = locale53.hasExtensions();
        java.lang.String str59 = locale48.getDisplayName(locale53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter47.withLocale(locale53);
        java.util.Locale locale61 = locale53.stripExtensions();
        java.util.Locale.setDefault(locale61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter63 = dateTimeFormatter46.withLocale(locale61);
        java.util.Locale locale64 = locale61.stripExtensions();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2000 + "'", int16 == 2000);
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(dateTimePrinter18);
        org.junit.Assert.assertNotNull(dateTimePrinter19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2000 + "'", int30 == 2000);
        org.junit.Assert.assertNull(locale31);
        org.junit.Assert.assertNotNull(dateTimePrinter32);
        org.junit.Assert.assertNotNull(dateTimePrinter33);
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeParser36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "English" + "'", str52, "English");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "English" + "'", str56, "English");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "English" + "'", str59, "English");
        org.junit.Assert.assertNotNull(dateTimeFormatter60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en");
        org.junit.Assert.assertNotNull(dateTimeFormatter63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en");
    }

    @Test
    public void test20092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20092");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.lang.String str3 = locale1.getDisplayCountry(locale2);
        java.lang.String str4 = locale1.getDisplayName();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.lang.String str7 = locale6.getDisplayScript();
        java.util.Locale locale8 = locale6.stripExtensions();
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Locale locale12 = java.util.Locale.getDefault(category0);
        java.util.Locale locale13 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "English" + "'", str4, "English");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
    }

    @Test
    public void test20093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20093");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap9 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder0.appendTimeZoneName(strMap9);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendClockhourOfDay((int) (byte) 10);
        boolean boolean13 = dateTimeFormatterBuilder12.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder12.appendFractionOfDay(2000, 40);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendMillisOfDay(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str20 = dateTimeFieldType19.getName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder18.appendFixedSignedDecimal(dateTimeFieldType19, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder23.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder24.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder24.appendHourOfHalfday((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType28.getField(chronology29);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder27.appendFixedDecimal(dateTimeFieldType28, 100);
        org.joda.time.Chronology chronology33 = null;
        boolean boolean34 = dateTimeFieldType28.isSupported(chronology33);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder18.appendFraction(dateTimeFieldType28, 22, 264);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder18.appendMonthOfYearShortText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "dayOfMonth" + "'", str20, "dayOfMonth");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
    }

    @Test
    public void test20094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20094");
        java.util.Locale locale1 = new java.util.Locale("+01:32");
        java.lang.String str3 = locale1.getExtension('a');
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.lang.String str10 = locale6.getDisplayLanguage(locale8);
        java.lang.String str11 = locale6.getCountry();
        java.lang.String str12 = locale5.getDisplayVariant(locale6);
        java.lang.String str13 = locale5.toLanguageTag();
        java.lang.String str14 = locale5.getISO3Country();
        java.lang.String str15 = locale1.getDisplayScript(locale5);
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale18.getDisplayCountry(locale19);
        java.lang.String str21 = locale18.getDisplayName();
        java.lang.String str22 = locale18.getISO3Country();
        java.util.Locale.Builder builder23 = builder16.setLocale(locale18);
        java.util.Locale locale24 = java.util.Locale.UK;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.lang.String str26 = locale18.getDisplayScript(locale25);
        java.util.Locale locale30 = new java.util.Locale("\u65e5\u6587", "Canada", "Friday, February 11, 2022 9:51:14 AM +00:00");
        java.lang.String str31 = locale18.getDisplayCountry(locale30);
        java.lang.String str33 = locale30.getExtension('x');
        java.util.Locale locale34 = java.util.Locale.KOREAN;
        java.lang.String str35 = locale34.getDisplayScript();
        java.lang.String str36 = locale34.getDisplayLanguage();
        java.lang.String str37 = locale30.getDisplayScript(locale34);
        java.util.Set<java.lang.String> strSet38 = locale30.getUnicodeLocaleKeys();
        java.lang.String str39 = locale5.getDisplayVariant(locale30);
        org.junit.Assert.assertEquals(locale1.toString(), "+01:32");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English" + "'", str10, "English");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko-KR" + "'", str13, "ko-KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "KOR" + "'", str14, "KOR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "English" + "'", str21, "English");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals(locale30.toString(), "\u65e5\u6587_CANADA_Friday, February 11, 2022 9:51:14 AM +00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Korean" + "'", str36, "Korean");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test20095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20095");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendFractionOfMinute((int) (short) 1, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendText(dateTimeFieldType12);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendSecondOfMinute((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendClockhourOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendWeekOfWeekyear(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder19.appendFraction(dateTimeFieldType20, (int) (short) 10, (int) 'a');
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType20.getField(chronology24);
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType20.getDurationType();
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType20.getDurationType();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(durationFieldType27);
    }

    @Test
    public void test20096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20096");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendFractionOfHour(2000, (int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder5.appendFixedSignedDecimal(dateTimeFieldType6, (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder5.appendFractionOfSecond(40, (int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder5.appendPattern("+00:00");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder5.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder15.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder17.appendFraction(dateTimeFieldType20, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder23.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder23.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder26.appendDayOfMonth((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder28.appendSecondOfDay(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType32 = dateTimeFieldType31.getDurationType();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType31.getRangeDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder30.appendText(dateTimeFieldType31);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder30.appendCenturyOfEra((int) (byte) 1, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder38.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder38.appendFraction(dateTimeFieldType41, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder38.appendMinuteOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder46.appendFractionOfMinute((int) (short) 1, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder46.appendMonthOfYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder46.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder46.appendYear((int) (short) 1, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder55.appendDecimal(dateTimeFieldType56, (int) (byte) 10, (-1));
        java.lang.String str60 = dateTimeFieldType56.toString();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTimeField dateTimeField62 = dateTimeFieldType56.getField(chronology61);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder37.appendText(dateTimeFieldType56);
        java.lang.String str64 = dateTimeFieldType56.getName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder15.appendShortText(dateTimeFieldType56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder65.appendYear((-203), (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "secondOfMinute" + "'", str60, "secondOfMinute");
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "secondOfMinute" + "'", str64, "secondOfMinute");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
    }

    @Test
    public void test20097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20097");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder3 = dateTimeFormatterBuilder0.appendText(dateTimeFieldType2);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap4 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder5 = dateTimeFormatterBuilder0.appendTimeZoneName(strMap4);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendHourOfDay((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter8.getPrinter();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withChronology(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone12.adjustOffset((long) (short) 10, false);
        long long19 = dateTimeZone12.convertLocalToUTC((long) 1, false, (long) ' ');
        long long21 = dateTimeZone12.nextTransition((long) 1);
        boolean boolean22 = dateTimeZone12.isFixed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter11.withZone(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withOffsetParsed();
        java.lang.Integer int25 = dateTimeFormatter24.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter24.withDefaultYear((int) (short) 100);
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter27.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter27.withDefaultYear(40);
        org.joda.time.format.DateTimeParser dateTimeParser31 = dateTimeFormatter30.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder7.append(dateTimeParser31);
        boolean boolean33 = dateTimeFormatterBuilder32.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder34.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder34.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder34.appendFractionOfHour(2000, (int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder39.appendFixedSignedDecimal(dateTimeFieldType40, (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder39.appendFractionOfSecond(40, (int) 'x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder39.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder39.appendTwoDigitYear(26, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder39.appendCenturyOfEra((int) (byte) 1, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder39.appendTwoDigitYear((int) '4', true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder39.appendHourOfHalfday(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder58.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = dateTimeFormatterBuilder58.appendFraction(dateTimeFieldType61, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder64.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone67 = dateTimeFormatter66.getZone();
        int int68 = dateTimeFormatter66.getDefaultYear();
        java.util.Locale locale69 = dateTimeFormatter66.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter70 = dateTimeFormatter66.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter71 = dateTimeFormatter66.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.DateTimeZone dateTimeZone73 = dateTimeFormatter72.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser74 = dateTimeFormatter72.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder75 = dateTimeFormatterBuilder65.append(dateTimePrinter71, dateTimeParser74);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder77 = dateTimeFormatterBuilder65.appendLiteral('a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder78 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder80 = dateTimeFormatterBuilder78.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder84 = dateTimeFormatterBuilder78.appendFraction(dateTimeFieldType81, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder85 = dateTimeFormatterBuilder84.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder88 = dateTimeFormatterBuilder85.appendYearOfEra((int) (short) 1, (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder89 = dateTimeFormatterBuilder88.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder90 = dateTimeFormatterBuilder89.appendTimeZoneId();
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder93 = dateTimeFormatterBuilder89.appendFixedDecimal(dateTimeFieldType91, (int) ' ');
        java.lang.String str94 = dateTimeFieldType91.getName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder97 = dateTimeFormatterBuilder77.appendDecimal(dateTimeFieldType91, (int) 'a', (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder98 = dateTimeFormatterBuilder39.appendText(dateTimeFieldType91);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder99 = dateTimeFormatterBuilder32.appendShortText(dateTimeFieldType91);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder5);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimePrinter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeParser28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeParser31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder64);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertNotNull(dateTimeFormatter66);
        org.junit.Assert.assertNull(dateTimeZone67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2000 + "'", int68 == 2000);
        org.junit.Assert.assertNull(locale69);
        org.junit.Assert.assertNotNull(dateTimePrinter70);
        org.junit.Assert.assertNotNull(dateTimePrinter71);
        org.junit.Assert.assertNotNull(dateTimeFormatter72);
        org.junit.Assert.assertNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(dateTimeParser74);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder75);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder77);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder80);
        org.junit.Assert.assertNotNull(dateTimeFieldType81);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder84);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder85);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder88);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder89);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder90);
        org.junit.Assert.assertNotNull(dateTimeFieldType91);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "halfdayOfDay" + "'", str94, "halfdayOfDay");
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder97);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder98);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder99);
    }

    @Test
    public void test20098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20098");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        boolean boolean1 = dateTimeFormatter0.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone2.adjustOffset((long) (short) 10, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withZone(dateTimeZone2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withOffsetParsed();
        java.lang.String str9 = dateTimeFormatter6.print((long) 'u');
        java.util.Locale locale12 = new java.util.Locale("hi!", "weekyear");
        java.util.Locale locale13 = locale12.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter6.withLocale(locale12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter14.withZoneUTC();
        org.joda.time.Chronology chronology16 = dateTimeFormatter15.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone17.adjustOffset((long) (short) 10, false);
        int int22 = dateTimeZone17.getStandardOffset(100L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long26 = dateTimeZone23.adjustOffset((long) (short) 10, false);
        long long29 = dateTimeZone23.convertLocalToUTC((long) (byte) 1, true);
        boolean boolean30 = dateTimeZone23.isFixed();
        java.util.TimeZone timeZone31 = dateTimeZone23.toTimeZone();
        long long33 = dateTimeZone23.previousTransition(52L);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        boolean boolean36 = dateTimeZone34.isStandardOffset((long) 'a');
        int int38 = dateTimeZone34.getOffsetFromLocal((long) (short) -1);
        java.util.TimeZone timeZone39 = dateTimeZone34.toTimeZone();
        long long41 = dateTimeZone34.convertUTCToLocal((long) 40);
        long long43 = dateTimeZone34.previousTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        boolean boolean46 = dateTimeZone44.isStandardOffset((long) 'a');
        int int48 = dateTimeZone44.getOffsetFromLocal((long) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = org.joda.time.format.DateTimeFormat.fullDateTime();
        boolean boolean50 = dateTimeFormatter49.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter49.withDefaultYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder53.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder54.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder54.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder54.appendCenturyOfEra(0, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder54.appendMinuteOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = dateTimeFormatterBuilder62.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter66 = dateTimeFormatter65.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder62.append(dateTimePrinter66);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder69 = dateTimeFormatterBuilder67.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder71 = dateTimeFormatterBuilder67.appendLiteral('a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale73 = java.util.Locale.ENGLISH;
        java.lang.String str74 = locale73.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = dateTimeFormatter72.withLocale(locale73);
        boolean boolean76 = dateTimeFormatter75.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = dateTimeFormatter75.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder79 = dateTimeFormatterBuilder67.append(dateTimeFormatter78);
        org.joda.time.DateTime dateTime81 = dateTimeFormatter78.parseDateTime("Thursday, January 1, 1970");
        java.lang.String str82 = dateTimeFormatter52.print((org.joda.time.ReadableInstant) dateTime81);
        int int83 = dateTimeZone44.getOffset((org.joda.time.ReadableInstant) dateTime81);
        int int84 = dateTimeZone34.getOffset((org.joda.time.ReadableInstant) dateTime81);
        int int85 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime81);
        int int86 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) dateTime81);
        java.lang.String str87 = dateTimeFormatter15.print((org.joda.time.ReadableInstant) dateTime81);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter89 = dateTimeFormatter15.withPivotYear((java.lang.Integer) (-195));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter91 = dateTimeFormatter89.withDefaultYear(143);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Thursday, January 1, 1970 12:00:00 AM +00:00" + "'", str9, "Thursday, January 1, 1970 12:00:00 AM +00:00");
        org.junit.Assert.assertEquals(locale12.toString(), "hi!_WEEKYEAR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_WEEKYEAR");
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 52L + "'", long33 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 40L + "'", long41 == 40L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder64);
        org.junit.Assert.assertNotNull(dateTimeFormatter65);
        org.junit.Assert.assertNotNull(dateTimePrinter66);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder69);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder71);
        org.junit.Assert.assertNotNull(dateTimeFormatter72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "eng" + "'", str74, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter78);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder79);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Thursday, January 1, 1970 12:00:00 AM +00:00" + "'", str82, "Thursday, January 1, 1970 12:00:00 AM +00:00");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Thursday, January 1, 1970 12:00:00 AM +00:00" + "'", str87, "Thursday, January 1, 1970 12:00:00 AM +00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter89);
        org.junit.Assert.assertNotNull(dateTimeFormatter91);
    }

    @Test
    public void test20099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20099");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.adjustOffset((long) (short) 10, false);
        long long6 = dateTimeZone0.convertLocalToUTC((long) (byte) 1, true);
        boolean boolean7 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.lang.String str12 = locale10.getDisplayCountry(locale11);
        java.lang.String str13 = locale10.getDisplayName();
        boolean boolean14 = locale10.hasExtensions();
        java.lang.String str15 = locale10.getDisplayCountry();
        java.lang.String str16 = dateTimeZone0.getShortName((long) ' ', locale10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = dateTimeFormatter17.getPrinter();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withChronology(chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withPivotYear((java.lang.Integer) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter22.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withPivotYear(100);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        long long29 = dateTimeZone26.adjustOffset((long) (short) 10, false);
        long long33 = dateTimeZone26.convertLocalToUTC((long) 1, false, (long) ' ');
        long long35 = dateTimeZone26.nextTransition((long) 1);
        boolean boolean36 = dateTimeZone26.isFixed();
        boolean boolean37 = dateTimeZone26.isFixed();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        boolean boolean40 = dateTimeZone38.isStandardOffset((long) 'a');
        int int42 = dateTimeZone38.getOffsetFromLocal((long) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = org.joda.time.format.DateTimeFormat.fullDateTime();
        boolean boolean44 = dateTimeFormatter43.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter43.withDefaultYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder47.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder48.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder48.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder48.appendCenturyOfEra(0, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder48.appendMinuteOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder56.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter60 = dateTimeFormatter59.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder56.append(dateTimePrinter60);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder61.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder61.appendLiteral('a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale67 = java.util.Locale.ENGLISH;
        java.lang.String str68 = locale67.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter66.withLocale(locale67);
        boolean boolean70 = dateTimeFormatter69.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter69.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder61.append(dateTimeFormatter72);
        org.joda.time.DateTime dateTime75 = dateTimeFormatter72.parseDateTime("Thursday, January 1, 1970");
        java.lang.String str76 = dateTimeFormatter46.print((org.joda.time.ReadableInstant) dateTime75);
        int int77 = dateTimeZone38.getOffset((org.joda.time.ReadableInstant) dateTime75);
        int int78 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) dateTime75);
        java.lang.String str79 = dateTimeFormatter25.print((org.joda.time.ReadableInstant) dateTime75);
        int int80 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime75);
        java.lang.String str82 = dateTimeZone0.getShortName(0L);
        java.util.TimeZone timeZone83 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.forTimeZone(timeZone83);
        java.lang.String str85 = dateTimeZone84.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "English" + "'", str13, "English");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimePrinter18);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimePrinter60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertNotNull(dateTimeFormatter66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "eng" + "'", str68, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter72);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Thursday, January 1, 1970 12:00:00 AM +00:00" + "'", str76, "Thursday, January 1, 1970 12:00:00 AM +00:00");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Thursday, January 1, 1970 12:00:00 AM +00:00" + "'", str79, "Thursday, January 1, 1970 12:00:00 AM +00:00");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "+00:00" + "'", str82, "+00:00");
        org.junit.Assert.assertNotNull(timeZone83);
        org.junit.Assert.assertEquals(timeZone83.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "UTC" + "'", str85, "UTC");
    }

    @Test
    public void test20100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20100");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("weekyear");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder4.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder4.appendFraction(dateTimeFieldType7, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder4.appendMinuteOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder4.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder4.appendMinuteOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder4.appendSecondOfMinute(432000163);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder4.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder4.appendMillisOfSecond((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder4.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder4.appendDayOfWeekText();
        boolean boolean24 = languageRange1.equals((java.lang.Object) dateTimeFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test20101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20101");
        java.util.Locale locale2 = new java.util.Locale("Friday, February 11, 2022 11:03:14 AM +01:10", "Friday, February 11, 2022 9:53:03 AM +00:00");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        long long8 = dateTimeZone4.convertLocalToUTC((long) 26, false, 52L);
        long long12 = dateTimeZone4.convertLocalToUTC((-364199900L), true, (long) '4');
        boolean boolean13 = dateTimeZone4.isFixed();
        java.util.Locale.Category category15 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale16.getDisplayCountry(locale17);
        java.lang.String str19 = locale16.getDisplayName();
        java.util.Locale.setDefault(category15, locale16);
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.lang.String str22 = locale21.getDisplayScript();
        java.util.Locale locale23 = locale21.stripExtensions();
        java.util.Locale.setDefault(category15, locale23);
        java.lang.String str25 = dateTimeZone4.getName(1L, locale23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = locale23.getDisplayCountry(locale26);
        java.lang.String str28 = locale2.getDisplayVariant(locale26);
        java.lang.String str29 = locale2.getDisplayName();
        org.junit.Assert.assertEquals(locale2.toString(), "friday, february 11, 2022 11:03:14 am +01:10_FRIDAY, FEBRUARY 11, 2022 9:53:03 AM +00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25L + "'", long8 == 25L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-364199901L) + "'", long12 == (-364199901L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.FORMAT + "'", category15.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "English" + "'", str19, "English");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.001" + "'", str25, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "friday, february 11, 2022 11:03:14 am +01:10 (FRIDAY, FEBRUARY 11, 2022 9:53:03 AM +00:00)" + "'", str29, "friday, february 11, 2022 11:03:14 am +01:10 (FRIDAY, FEBRUARY 11, 2022 9:53:03 AM +00:00)");
    }

    @Test
    public void test20102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20102");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfMonth((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendHourOfDay((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendSecondOfDay(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendMillisOfSecond(2000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendLiteral("Thursday, January 1, 1970 12:00:00 AM +00:00");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap20 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendTimeZoneShortName(strMap20);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder19.appendClockhourOfDay((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder19.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder24.appendLiteral('u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder26.appendCenturyOfEra(355, 187200000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder30.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder30.appendFractionOfHour(2000, (int) 'u');
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder35.appendFixedSignedDecimal(dateTimeFieldType36, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType40 = dateTimeFieldType39.getDurationType();
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType39.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType39.getDurationType();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder38.appendText(dateTimeFieldType39);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder43.appendDecimal(dateTimeFieldType44, 100, 96);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder26.appendFixedSignedDecimal(dateTimeFieldType44, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal number of digits: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
    }

    @Test
    public void test20103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20103");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder4 = builder2.setLanguage("English");
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category6);
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.lang.String str11 = locale9.getDisplayLanguage();
        java.util.Locale.Builder builder12 = builder5.setLocale(locale9);
        java.util.Locale.Builder builder13 = builder5.clearExtensions();
        java.util.Locale locale14 = builder13.build();
        java.lang.String str15 = locale14.getScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chinese" + "'", str11, "Chinese");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test20104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20104");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale0.getDisplayCountry(locale1);
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale0.toLanguageTag();
        java.lang.String str5 = locale0.getCountry();
        java.util.Locale locale7 = new java.util.Locale("Friday, February 11, 2022 9:51:21 AM +00:00");
        java.lang.String str8 = locale0.getDisplayScript(locale7);
        java.util.Set<java.lang.String> strSet9 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals(locale7.toString(), "friday, february 11, 2022 9:51:21 am +00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test20105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20105");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendTwoDigitYear(26, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder7.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendHalfdayOfDayText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendMinuteOfHour((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
    }

    @Test
    public void test20106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20106");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendYearOfEra((int) (short) 1, (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder10.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder11.appendSecondOfDay(22);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder11.appendTwoDigitWeekyear(92, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder11.appendHourOfDay(187260000);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
    }

    @Test
    public void test20107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20107");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguage("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("UTC");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("UTC");
        java.util.Locale locale9 = builder6.build();
        java.util.Locale.Builder builder10 = builder6.clearExtensions();
        java.util.Locale.Category category11 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale12 = java.util.Locale.getDefault(category11);
        java.util.Locale locale13 = java.util.Locale.getDefault(category11);
        java.lang.String str14 = locale13.getDisplayName();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.lang.String str16 = locale13.getISO3Language();
        boolean boolean17 = locale13.hasExtensions();
        java.util.Locale.Builder builder18 = builder6.setLocale(locale13);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "utc");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.FORMAT + "'", category11.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese (China)" + "'", str14, "Chinese (China)");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test20108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20108");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder4 = builder2.setLanguage("English");
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.removeUnicodeLocaleAttribute("Taiwan");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder11 = builder8.clear();
        java.util.Locale locale12 = builder8.build();
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.util.Locale.setDefault(category13, locale14);
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale17.getDisplayCountry(locale18);
        java.util.Set<java.lang.Character> charSet20 = locale17.getExtensionKeys();
        java.lang.String str21 = locale16.getDisplayVariant(locale17);
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.lang.String str24 = locale22.getDisplayCountry(locale23);
        java.lang.String str25 = locale23.getCountry();
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.lang.String str27 = locale23.getDisplayVariant(locale26);
        java.lang.String str28 = locale17.getDisplayScript(locale23);
        java.util.Locale.setDefault(category13, locale23);
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.util.Locale locale31 = locale30.stripExtensions();
        java.lang.String str32 = locale30.getISO3Language();
        java.util.Locale locale33 = locale30.stripExtensions();
        java.util.Locale.setDefault(category13, locale30);
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.util.Set<java.lang.String> strSet37 = locale36.getUnicodeLocaleAttributes();
        java.lang.String str38 = locale36.getDisplayName();
        java.lang.String str39 = locale36.getScript();
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.util.Locale locale41 = java.util.Locale.ENGLISH;
        java.lang.String str42 = locale40.getDisplayCountry(locale41);
        java.lang.String str43 = locale41.getCountry();
        java.util.Locale locale44 = java.util.Locale.CHINA;
        java.lang.String str45 = locale41.getDisplayVariant(locale44);
        java.lang.String str46 = locale41.getDisplayVariant();
        java.lang.String str47 = locale41.getCountry();
        java.lang.String str48 = locale41.getDisplayScript();
        java.lang.String str49 = locale36.getDisplayScript(locale41);
        java.util.Locale.setDefault(category13, locale41);
        java.util.Locale.Builder builder51 = builder8.setLocale(locale41);
        java.lang.String str52 = locale41.getCountry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "english");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "it");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ita" + "'", str32, "ita");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "it");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Korean (South Korea)" + "'", str38, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test20109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20109");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.PRC;
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.util.Set<java.lang.Character> charSet7 = locale4.getExtensionKeys();
        java.lang.String str8 = locale3.getDisplayVariant(locale4);
        java.util.Locale locale9 = java.util.Locale.ENGLISH;
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str11 = locale9.getDisplayCountry(locale10);
        java.lang.String str12 = locale10.getCountry();
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale10.getDisplayVariant(locale13);
        java.lang.String str15 = locale4.getDisplayScript(locale10);
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale18.getDisplayCountry(locale19);
        java.util.Set<java.lang.Character> charSet21 = locale18.getExtensionKeys();
        java.lang.String str22 = locale17.getDisplayVariant(locale18);
        boolean boolean23 = locale18.hasExtensions();
        java.lang.String str24 = locale18.getScript();
        java.util.Locale locale28 = new java.util.Locale("China", "", "");
        java.lang.String str29 = locale18.getDisplayCountry(locale28);
        java.util.Locale.setDefault(category0, locale18);
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("1/1/70");
        java.util.Locale locale34 = new java.util.Locale("");
        java.lang.String str35 = locale32.getDisplayLanguage(locale34);
        java.util.Set<java.lang.String> strSet36 = locale32.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category0, locale32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale39 = java.util.Locale.ENGLISH;
        java.lang.String str40 = locale39.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter38.withLocale(locale39);
        java.util.Locale.setDefault(category0, locale39);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        long long47 = dateTimeZone44.adjustOffset((long) (short) 10, false);
        long long51 = dateTimeZone44.convertLocalToUTC((long) 1, false, (long) ' ');
        long long53 = dateTimeZone44.nextTransition((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone44);
        long long56 = dateTimeZone43.getMillisKeepLocal(dateTimeZone44, (long) 'x');
        boolean boolean58 = dateTimeZone44.isStandardOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.UTC;
        long long62 = dateTimeZone59.adjustOffset((long) (short) 10, false);
        long long64 = dateTimeZone44.getMillisKeepLocal(dateTimeZone59, 0L);
        java.lang.String str65 = dateTimeZone59.getID();
        boolean boolean67 = dateTimeZone59.isStandardOffset(10L);
        java.util.Locale locale69 = java.util.Locale.CANADA;
        java.util.Locale locale70 = java.util.Locale.ENGLISH;
        java.util.Locale locale71 = java.util.Locale.ENGLISH;
        java.util.Locale locale72 = java.util.Locale.ENGLISH;
        java.lang.String str73 = locale71.getDisplayCountry(locale72);
        java.lang.String str74 = locale70.getDisplayLanguage(locale72);
        java.lang.String str75 = locale70.getCountry();
        java.lang.String str76 = locale70.getISO3Language();
        java.util.Locale locale77 = java.util.Locale.getDefault();
        java.util.Locale locale78 = java.util.Locale.ENGLISH;
        java.util.Locale locale79 = java.util.Locale.ENGLISH;
        java.lang.String str80 = locale78.getDisplayCountry(locale79);
        java.util.Set<java.lang.Character> charSet81 = locale78.getExtensionKeys();
        java.lang.String str82 = locale77.getDisplayVariant(locale78);
        java.lang.String str83 = locale70.getDisplayVariant(locale78);
        java.util.Locale locale84 = locale78.stripExtensions();
        java.lang.String str85 = locale69.getDisplayLanguage(locale78);
        java.lang.String str86 = dateTimeZone59.getName(22L, locale78);
        java.util.Locale.setDefault(locale78);
        java.util.Locale.setDefault(category0, locale78);
        java.util.Locale locale89 = java.util.Locale.getDefault(category0);
        java.lang.String str90 = locale89.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale28.toString(), "china");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "eng" + "'", str40, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 120L + "'", long56 == 120L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10L + "'", long62 == 10L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "UTC" + "'", str65, "UTC");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "English" + "'", str74, "English");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "eng" + "'", str76, "eng");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "en");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "en");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(charSet81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "English" + "'", str85, "English");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "+00:00" + "'", str86, "+00:00");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "en");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test20110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20110");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendMillisOfDay((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder10.appendTwoDigitWeekyear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder10.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder10.appendLiteral("");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatterBuilder10.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder10.appendWeekyear(432000000, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder21.appendTimeZoneOffset("friday, february 11, 2022 9:53:27 am +00:00", false, 26, (-236));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
    }

    @Test
    public void test20111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20111");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withOffsetParsed();
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test20112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20112");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder1.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder1.appendCenturyOfEra(0, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = dateTimeFormatter12.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.append(dateTimePrinter13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder14.appendTwoDigitYear((int) (byte) 0, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder14.appendLiteral('x');
        dateTimeFormatterBuilder14.clear();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder14.appendHourOfHalfday(301);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimePrinter13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
    }

    @Test
    public void test20113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20113");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder7.appendYearOfEra((int) (short) 1, (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder10.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeFormatter13.getZone();
        int int15 = dateTimeFormatter13.getDefaultYear();
        java.util.Locale locale16 = dateTimeFormatter13.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = dateTimeFormatter13.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeFormatter18.getZone();
        int int20 = dateTimeFormatter18.getDefaultYear();
        java.util.Locale locale21 = dateTimeFormatter18.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser22 = dateTimeFormatter18.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder11.append(dateTimePrinter17, dateTimeParser22);
        boolean boolean24 = dateTimeFormatterBuilder23.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder23.appendMillisOfDay((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder23.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder23.appendLiteral("AM2022+00:0022");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder29.appendMonthOfYearShortText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2000 + "'", int15 == 2000);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(dateTimePrinter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2000 + "'", int20 == 2000);
        org.junit.Assert.assertNull(locale21);
        org.junit.Assert.assertNotNull(dateTimeParser22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
    }

    @Test
    public void test20114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20114");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getOffset((long) (short) 100);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test20115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20115");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDate();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = dateTimeFormatter0.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.util.Locale locale8 = java.util.Locale.ENGLISH;
        java.lang.String str9 = locale7.getDisplayCountry(locale8);
        java.lang.String str10 = locale6.getDisplayLanguage(locale8);
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.lang.String str14 = locale11.getDisplayName();
        boolean boolean15 = locale11.hasExtensions();
        boolean boolean16 = locale11.hasExtensions();
        java.lang.String str17 = locale6.getDisplayName(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter5.withLocale(locale11);
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale19.getDisplayCountry(locale20);
        java.lang.String str22 = locale20.getCountry();
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.lang.String str24 = locale20.getDisplayVariant(locale23);
        java.util.Locale locale27 = new java.util.Locale("yearOfEra", "zh");
        java.lang.String str28 = locale20.getDisplayLanguage(locale27);
        java.lang.String str29 = locale11.getDisplayVariant(locale20);
        java.lang.String str30 = dateTimeZone3.getName(32L, locale20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter0.withLocale(locale20);
        java.lang.String str33 = dateTimeFormatter0.print(0L);
        int int34 = dateTimeFormatter0.getDefaultYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimePrinter1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "English" + "'", str10, "English");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "English" + "'", str14, "English");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "English" + "'", str17, "English");
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals(locale27.toString(), "yearofera_ZH");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "English" + "'", str28, "English");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+100:00" + "'", str30, "+100:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "January 1, 1970" + "'", str33, "January 1, 1970");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2000 + "'", int34 == 2000);
    }

    @Test
    public void test20116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20116");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("");
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder7 = builder4.clearExtensions();
        java.util.Locale locale8 = builder4.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test20117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20117");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYearOfCentury((int) 'x', 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField(chronology14);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder9.appendText(dateTimeFieldType13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeFormatter17.getZone();
        int int19 = dateTimeFormatter17.getDefaultYear();
        java.util.Locale locale20 = dateTimeFormatter17.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser21 = dateTimeFormatter17.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder9.appendOptional(dateTimeParser21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder23.appendFixedDecimal(dateTimeFieldType24, (int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder27.appendFraction(dateTimeFieldType30, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder33.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder34.appendYearOfEra((int) (short) 1, (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder37.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder38.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeFormatter40.getZone();
        int int42 = dateTimeFormatter40.getDefaultYear();
        java.util.Locale locale43 = dateTimeFormatter40.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter44 = dateTimeFormatter40.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone46 = dateTimeFormatter45.getZone();
        int int47 = dateTimeFormatter45.getDefaultYear();
        java.util.Locale locale48 = dateTimeFormatter45.getLocale();
        org.joda.time.format.DateTimeParser dateTimeParser49 = dateTimeFormatter45.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder38.append(dateTimePrinter44, dateTimeParser49);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder26.append(dateTimePrinter44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone53 = dateTimeFormatter52.getZone();
        int int54 = dateTimeFormatter52.getDefaultYear();
        java.util.Locale locale55 = dateTimeFormatter52.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter56 = dateTimeFormatter52.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder57.appendMinuteOfDay(0);
        boolean boolean60 = dateTimeFormatterBuilder57.canBuildFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.DateTimeZone dateTimeZone62 = dateTimeFormatter61.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser63 = dateTimeFormatter61.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder64 = dateTimeFormatterBuilder57.append(dateTimeParser63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter56, dateTimeParser63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter44, dateTimeParser63);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder9.append(dateTimeFormatter66);
        java.util.Locale locale68 = java.util.Locale.ENGLISH;
        java.util.Locale locale69 = java.util.Locale.ENGLISH;
        java.lang.String str70 = locale68.getDisplayCountry(locale69);
        java.lang.String str71 = locale68.getDisplayName();
        java.lang.String str72 = locale68.getISO3Country();
        java.util.Locale locale73 = null;
        java.lang.String str74 = locale68.getDisplayScript(locale73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = dateTimeFormatter66.withLocale(locale68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = dateTimeFormatter75.withPivotYear(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = dateTimeFormatter77.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser79 = dateTimeFormatter77.getParser();
        int int80 = dateTimeParser79.estimateParsedLength();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2000 + "'", int19 == 2000);
        org.junit.Assert.assertNull(locale20);
        org.junit.Assert.assertNotNull(dateTimeParser21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2000 + "'", int42 == 2000);
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertNotNull(dateTimePrinter44);
        org.junit.Assert.assertNotNull(dateTimeFormatter45);
        org.junit.Assert.assertNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2000 + "'", int47 == 2000);
        org.junit.Assert.assertNull(locale48);
        org.junit.Assert.assertNotNull(dateTimeParser49);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertNull(dateTimeZone53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2000 + "'", int54 == 2000);
        org.junit.Assert.assertNull(locale55);
        org.junit.Assert.assertNotNull(dateTimePrinter56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(dateTimeParser63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder64);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "en");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "English" + "'", str71, "English");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter75);
        org.junit.Assert.assertNotNull(dateTimeFormatter77);
        org.junit.Assert.assertNotNull(dateTimeFormatter78);
        org.junit.Assert.assertNotNull(dateTimeParser79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 40 + "'", int80 == 40);
    }

    @Test
    public void test20118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20118");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder8.appendFractionOfMinute((int) (short) 1, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder8.appendMonthOfYear((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder8.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendFractionOfSecond((int) (byte) 1, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.yearOfEra();
        java.lang.String str22 = dateTimeFieldType21.getName();
        boolean boolean23 = dateTimeZone18.equals((java.lang.Object) dateTimeFieldType21);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder14.appendFixedDecimal(dateTimeFieldType21, 2000);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder14.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatterBuilder26.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter27.withDefaultYear((int) (short) -1);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withChronology(chronology30);
        java.lang.Integer int32 = dateTimeFormatter31.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser33 = dateTimeFormatter31.getParser();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "yearOfEra" + "'", str22, "yearOfEra");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(dateTimeParser33);
    }

    @Test
    public void test20119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20119");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("weekyear", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap5);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("Korean");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList8, strMap9);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale[] localeArray14 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.List<java.util.Locale> localeList17 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList15);
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.util.Locale locale19 = locale18.stripExtensions();
        java.util.Locale locale20 = java.util.Locale.CHINESE;
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.lang.String str24 = locale22.getDisplayCountry(locale23);
        java.lang.String str25 = locale23.getCountry();
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.lang.String str27 = locale23.getDisplayVariant(locale26);
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("weekOfWeekyear");
        java.util.Locale locale30 = java.util.Locale.ENGLISH;
        java.util.Locale locale31 = java.util.Locale.ENGLISH;
        java.util.Locale locale32 = java.util.Locale.ENGLISH;
        java.lang.String str33 = locale31.getDisplayCountry(locale32);
        java.lang.String str34 = locale30.getDisplayLanguage(locale32);
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("weekOfWeekyear");
        java.util.Locale.Category category37 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale38 = java.util.Locale.ENGLISH;
        java.util.Locale locale39 = java.util.Locale.ENGLISH;
        java.lang.String str40 = locale38.getDisplayCountry(locale39);
        java.lang.String str41 = locale38.getDisplayName();
        java.util.Locale.setDefault(category37, locale38);
        java.util.Locale locale43 = java.util.Locale.ENGLISH;
        java.util.Locale locale44 = java.util.Locale.ENGLISH;
        java.lang.String str45 = locale43.getDisplayCountry(locale44);
        java.lang.String str46 = locale43.getDisplayName();
        boolean boolean47 = locale43.hasExtensions();
        java.util.Locale[] localeArray48 = new java.util.Locale[] { locale19, locale20, locale21, locale23, locale29, locale32, locale36, locale38, locale43 };
        java.util.ArrayList<java.util.Locale> localeList49 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList49, localeArray48);
        java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList49);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap52 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList53 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, strMap52);
        java.util.Locale.LanguageRange languageRange56 = new java.util.Locale.LanguageRange("eng", (double) 0);
        double double57 = languageRange56.getWeight();
        java.util.Locale.LanguageRange languageRange60 = new java.util.Locale.LanguageRange("eng", (double) 0);
        java.util.Locale.LanguageRange languageRange63 = new java.util.Locale.LanguageRange("UTC", (double) 0);
        java.util.Locale.LanguageRange languageRange66 = new java.util.Locale.LanguageRange("eng", (double) 0);
        java.lang.String str67 = languageRange66.getRange();
        java.util.Locale.LanguageRange languageRange70 = new java.util.Locale.LanguageRange("UTC", (double) 0);
        java.util.Locale.LanguageRange[] languageRangeArray71 = new java.util.Locale.LanguageRange[] { languageRange56, languageRange60, languageRange63, languageRange66, languageRange70 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList72 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList72, languageRangeArray71);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap74 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList72, strMap74);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap76 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList75, strMap76);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap79 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList80 = java.util.Locale.LanguageRange.parse("CHN", strMap79);
        java.util.Locale.LanguageRange[] languageRangeArray81 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList82 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList82, languageRangeArray81);
        java.util.Locale[] localeArray84 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList85 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList85, localeArray84);
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList82, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.Locale.FilteringMode filteringMode88 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList89 = java.util.Locale.filter(languageRangeList80, (java.util.Collection<java.util.Locale>) localeList87, filteringMode88);
        java.util.Locale locale90 = java.util.Locale.lookup(languageRangeList77, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.Locale locale91 = java.util.Locale.lookup(languageRangeList53, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.Locale locale92 = java.util.Locale.lookup(languageRangeList8, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.Locale locale93 = java.util.Locale.lookup(languageRangeList2, (java.util.Collection<java.util.Locale>) localeList89);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localeList17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "English" + "'", str34, "English");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertTrue("'" + category37 + "' != '" + java.util.Locale.Category.FORMAT + "'", category37.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "English" + "'", str41, "English");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "English" + "'", str46, "English");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(localeList51);
        org.junit.Assert.assertNotNull(languageRangeList53);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "eng" + "'", str67, "eng");
        org.junit.Assert.assertNotNull(languageRangeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertNotNull(languageRangeList80);
        org.junit.Assert.assertNotNull(languageRangeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(localeArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertTrue("'" + filteringMode88 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode88.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList89);
        org.junit.Assert.assertNull(locale90);
        org.junit.Assert.assertNull(locale91);
        org.junit.Assert.assertNull(locale92);
        org.junit.Assert.assertNull(locale93);
    }

    @Test
    public void test20120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20120");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder5 = builder0.setExtension('u', "");
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder5.setExtension('u', "Italian");
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("eng");
        java.lang.String str12 = locale11.getDisplayVariant();
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.lang.String str16 = locale13.getDisplayName();
        java.lang.String str17 = locale13.getISO3Country();
        boolean boolean18 = locale13.hasExtensions();
        boolean boolean19 = locale13.hasExtensions();
        java.lang.String str20 = locale11.getDisplayScript(locale13);
        java.util.Locale.Builder builder21 = builder9.setLocale(locale11);
        java.util.Locale.Builder builder22 = builder9.clearExtensions();
        java.util.Locale locale23 = builder22.build();
        java.util.Locale.Builder builder25 = builder22.removeUnicodeLocaleAttribute("Chinese");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "eng");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "English" + "'", str16, "English");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "eng");
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test20121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20121");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(421200000);
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.lang.String str5 = locale3.getDisplayCountry(locale4);
        java.lang.String str6 = locale3.getDisplayName();
        java.lang.String str7 = locale3.getISO3Country();
        boolean boolean8 = locale3.hasExtensions();
        java.lang.String str9 = dateTimeZone1.getName((-4199999L), locale3);
        java.lang.String str10 = locale3.getDisplayScript();
        java.lang.String str11 = locale3.getDisplayScript();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English" + "'", str6, "English");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+117:00" + "'", str9, "+117:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test20122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20122");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguage("");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("UTC");
        java.util.Locale.Builder builder6 = builder3.clear();
        java.util.Locale.Builder builder8 = builder6.setLanguageTag("UTC");
        java.util.Locale locale9 = builder6.build();
        java.util.Locale.Builder builder10 = builder6.clearExtensions();
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.util.Set<java.lang.Character> charSet16 = locale13.getExtensionKeys();
        java.lang.String str17 = locale12.getDisplayVariant(locale13);
        java.lang.String str18 = locale11.getDisplayCountry(locale12);
        java.util.Set<java.lang.String> strSet19 = locale11.getUnicodeLocaleKeys();
        java.lang.String str20 = locale11.getDisplayCountry();
        java.lang.String str21 = locale11.getISO3Language();
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("1/1/70");
        java.util.Locale locale25 = new java.util.Locale("");
        java.lang.String str26 = locale23.getDisplayLanguage(locale25);
        java.lang.String str27 = locale11.getDisplayLanguage(locale23);
        java.util.Locale.Builder builder28 = builder6.setLocale(locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder30 = builder6.setRegion("\u4e0a\u53481969+00:0069");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ??1969+00:0069 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "utc");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zho" + "'", str21, "zho");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese" + "'", str27, "Chinese");
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test20123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20123");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ENGLISH");
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale locale3 = java.util.Locale.ENGLISH;
        java.util.Locale locale4 = java.util.Locale.ENGLISH;
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.lang.String str7 = locale3.getDisplayLanguage(locale5);
        java.lang.String str8 = locale3.getCountry();
        java.lang.String str9 = locale3.getISO3Language();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale11.getDisplayCountry(locale12);
        java.util.Set<java.lang.Character> charSet14 = locale11.getExtensionKeys();
        java.lang.String str15 = locale10.getDisplayVariant(locale11);
        java.lang.String str16 = locale3.getDisplayVariant(locale11);
        java.util.Locale locale17 = locale11.stripExtensions();
        java.lang.String str18 = locale2.getDisplayLanguage(locale11);
        java.lang.String str19 = locale1.getDisplayScript(locale2);
        java.util.Locale locale22 = new java.util.Locale("Chinese (JPN,United Kingdom)", "KOR");
        java.lang.String str23 = locale2.getDisplayScript(locale22);
        java.lang.String str24 = locale2.getDisplayScript();
        java.util.Locale.setDefault(locale2);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "english");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "eng" + "'", str9, "eng");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English" + "'", str18, "English");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals(locale22.toString(), "chinese (jpn,united kingdom)_KOR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test20124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20124");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendFraction(dateTimeFieldType3, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYearOfCentury((int) 'x', 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendClockhourOfHalfday(40);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder12.appendText(dateTimeFieldType15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendMinuteOfDay(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder17.appendFraction(dateTimeFieldType20, 2000, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder17.appendMinuteOfDay(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.appendWeekOfWeekyear((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendLiteral("weekOfWeekyear");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeFormatter30.getZone();
        int int32 = dateTimeFormatter30.getDefaultYear();
        java.util.Locale locale33 = dateTimeFormatter30.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter34 = dateTimeFormatter30.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendMinuteOfDay(0);
        boolean boolean38 = dateTimeFormatterBuilder35.canBuildFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = org.joda.time.format.DateTimeFormat.fullDate();
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeFormatter39.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser41 = dateTimeFormatter39.getParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder35.append(dateTimeParser41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter34, dateTimeParser41);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder27.append(dateTimeParser41);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder16.appendOptional(dateTimeParser41);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder45.appendHourOfDay(264);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder47.appendTwoDigitYear((int) (short) 10, false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2000 + "'", int32 == 2000);
        org.junit.Assert.assertNull(locale33);
        org.junit.Assert.assertNotNull(dateTimePrinter34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeParser41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
    }

    @Test
    public void test20125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20125");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder1 = dateTimeFormatterBuilder0.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder1.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder4 = dateTimeFormatterBuilder1.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder1.appendCenturyOfEra(0, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder1.appendMinuteOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = dateTimeFormatter12.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.append(dateTimePrinter13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder14.appendLiteral('a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter19.withLocale(locale20);
        boolean boolean23 = dateTimeFormatter22.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder14.append(dateTimeFormatter25);
        org.joda.time.DateTime dateTime28 = dateTimeFormatter25.parseDateTime("Thursday, January 1, 1970");
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter25.withLocale(locale29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter30.withChronology(chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = org.joda.time.format.DateTimeFormat.longDate();
        org.joda.time.format.DateTimePrinter dateTimePrinter34 = dateTimeFormatter33.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.util.Locale locale39 = java.util.Locale.ENGLISH;
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.util.Locale locale41 = java.util.Locale.ENGLISH;
        java.lang.String str42 = locale40.getDisplayCountry(locale41);
        java.lang.String str43 = locale39.getDisplayLanguage(locale41);
        java.util.Locale locale44 = java.util.Locale.ENGLISH;
        java.util.Locale locale45 = java.util.Locale.ENGLISH;
        java.lang.String str46 = locale44.getDisplayCountry(locale45);
        java.lang.String str47 = locale44.getDisplayName();
        boolean boolean48 = locale44.hasExtensions();
        boolean boolean49 = locale44.hasExtensions();
        java.lang.String str50 = locale39.getDisplayName(locale44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter38.withLocale(locale44);
        java.util.Locale locale52 = java.util.Locale.ENGLISH;
        java.util.Locale locale53 = java.util.Locale.ENGLISH;
        java.lang.String str54 = locale52.getDisplayCountry(locale53);
        java.lang.String str55 = locale53.getCountry();
        java.util.Locale locale56 = java.util.Locale.CHINA;
        java.lang.String str57 = locale53.getDisplayVariant(locale56);
        java.util.Locale locale60 = new java.util.Locale("yearOfEra", "zh");
        java.lang.String str61 = locale53.getDisplayLanguage(locale60);
        java.lang.String str62 = locale44.getDisplayVariant(locale53);
        java.lang.String str63 = dateTimeZone36.getName(32L, locale53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter33.withLocale(locale53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter64.withPivotYear(61);
        org.joda.time.Chronology chronology67 = dateTimeFormatter64.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter64.withPivotYear(263);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTimeFormatter64.parseMutableDateTime("December 27, 1969");
        int int74 = dateTimeFormatter32.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime71, "AM1970+00:0070", 97);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder4);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder7);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimePrinter13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "eng" + "'", str21, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko");
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimePrinter34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "English" + "'", str43, "English");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "English" + "'", str47, "English");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "English" + "'", str50, "English");
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals(locale60.toString(), "yearofera_ZH");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "English" + "'", str61, "English");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+100:00" + "'", str63, "+100:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
        org.junit.Assert.assertNotNull(dateTimeFormatter66);
        org.junit.Assert.assertNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-98) + "'", int74 == (-98));
    }

    @Test
    public void test20126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20126");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getStandardOffset(4010L);
        java.lang.String str5 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
    }

    @Test
    public void test20127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20127");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        boolean boolean2 = dateTimeZone1.isFixed();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder8 = builder6.setLanguage("English");
        java.util.Locale.Builder builder9 = builder6.clearExtensions();
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.util.Locale.setDefault(category10, locale11);
        java.util.Locale locale13 = java.util.Locale.getDefault(category10);
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.lang.String str15 = locale13.getDisplayLanguage();
        java.util.Locale.Builder builder16 = builder9.setLocale(locale13);
        java.lang.String str17 = dateTimeZone1.getName((-359999990L), locale13);
        java.util.TimeZone timeZone18 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        long long21 = dateTimeZone19.convertUTCToLocal((long) 280);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese" + "'", str15, "Chinese");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-01:00" + "'", str17, "-01:00");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-3599720L) + "'", long21 == (-3599720L));
    }

    @Test
    public void test20128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20128");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("ita", (double) 1);
        java.lang.String str3 = languageRange2.getRange();
        java.lang.String str4 = languageRange2.getRange();
        double double5 = languageRange2.getWeight();
        double double6 = languageRange2.getWeight();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ita" + "'", str3, "ita");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test20129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20129");
        java.util.Locale locale2 = new java.util.Locale("\u5e74\u6708\u65e5\u661f\u671f\u4e94\u4e0a\u5348\u65f6\u5206\u79d2 +00:00", "Friday, February 11, 2022 9:56:56 AM +00:00");
        boolean boolean4 = locale2.equals((java.lang.Object) "GBR");
        org.junit.Assert.assertEquals(locale2.toString(), "\u5e74\u6708\u65e5\u661f\u671f\u4e94\u4e0a\u5348\u65f6\u5206\u79d2 +00:00_FRIDAY, FEBRUARY 11, 2022 9:56:56 AM +00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test20130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20130");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.adjustOffset((long) (short) 10, false);
        long long7 = dateTimeZone0.convertLocalToUTC((long) 1, false, (long) ' ');
        long long9 = dateTimeZone0.nextTransition((long) 1);
        boolean boolean10 = dateTimeZone0.isFixed();
        boolean boolean11 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        boolean boolean14 = dateTimeZone12.isStandardOffset((long) 'a');
        int int16 = dateTimeZone12.getOffsetFromLocal((long) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.DateTimeFormat.fullDateTime();
        boolean boolean18 = dateTimeFormatter17.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withDefaultYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder21.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder22.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder22.appendHourOfHalfday((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder22.appendCenturyOfEra(0, (int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder22.appendMinuteOfDay((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendMillisOfSecond(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter34 = dateTimeFormatter33.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder30.append(dateTimePrinter34);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder35.appendLiteral('a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale41 = java.util.Locale.ENGLISH;
        java.lang.String str42 = locale41.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter40.withLocale(locale41);
        boolean boolean44 = dateTimeFormatter43.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter43.withPivotYear((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder35.append(dateTimeFormatter46);
        org.joda.time.DateTime dateTime49 = dateTimeFormatter46.parseDateTime("Thursday, January 1, 1970");
        java.lang.String str50 = dateTimeFormatter20.print((org.joda.time.ReadableInstant) dateTime49);
        int int51 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime49);
        int int52 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime49);
        java.lang.String str54 = dateTimeZone0.getName((long) 432000000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.UTC;
        boolean boolean59 = dateTimeZone57.isStandardOffset((long) 'a');
        boolean boolean61 = dateTimeZone57.isStandardOffset((long) (byte) 100);
        java.util.Locale locale63 = java.util.Locale.CHINESE;
        java.util.Locale locale64 = java.util.Locale.getDefault();
        java.util.Locale locale65 = java.util.Locale.ENGLISH;
        java.util.Locale locale66 = java.util.Locale.ENGLISH;
        java.lang.String str67 = locale65.getDisplayCountry(locale66);
        java.util.Set<java.lang.Character> charSet68 = locale65.getExtensionKeys();
        java.lang.String str69 = locale64.getDisplayVariant(locale65);
        java.lang.String str70 = locale63.getDisplayCountry(locale64);
        java.lang.String str71 = locale63.getDisplayScript();
        java.lang.String str72 = dateTimeZone57.getShortName((-364200001L), locale63);
        java.lang.String str73 = dateTimeZone0.getShortName((long) 'u', locale63);
        long long76 = dateTimeZone0.adjustOffset((-4199999L), false);
        java.lang.String str78 = dateTimeZone0.getName(25L);
        int int80 = dateTimeZone0.getOffset((-1004399634L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimePrinter34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "eng" + "'", str42, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Thursday, January 1, 1970 12:00:00 o'clock AM +00:00" + "'", str50, "Thursday, January 1, 1970 12:00:00 o'clock AM +00:00");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00" + "'", str54, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(charSet68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "+00:00" + "'", str72, "+00:00");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "+00:00" + "'", str73, "+00:00");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-4199999L) + "'", long76 == (-4199999L));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "+00:00" + "'", str78, "+00:00");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test20131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20131");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.lang.String str2 = locale1.getISO3Language();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withLocale(locale1);
        boolean boolean4 = dateTimeFormatter0.isPrinter();
        boolean boolean5 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter0.getPrinter();
        boolean boolean7 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter0.getZone();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(dateTimeZone8);
    }
}
