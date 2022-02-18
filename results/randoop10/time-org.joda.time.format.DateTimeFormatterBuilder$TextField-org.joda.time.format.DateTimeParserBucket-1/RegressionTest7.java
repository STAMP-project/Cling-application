import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("JPN");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("Germany");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setVariant("und");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: und [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(31);
        long long5 = dateTimeZone1.convertLocalToUTC(31795200000L, false, 27654780000L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 31795199969L + "'", long5 == 31795199969L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.031" + "'", str6, "+00:00:00.031");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.util.Locale locale1 = new java.util.Locale("+10:00");
        org.junit.Assert.assertEquals(locale1.toString(), "+10:00");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertUTCToLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-292122054L));
        java.lang.String str12 = dateTimeZone1.getName((-62104024800001L));
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        long long11 = dateTimeParserBucket7.computeMillis(true, "\u4e2d\u6587\u4e2d\u56fd)");
        int int12 = dateTimeParserBucket7.getOffset();
        java.util.Locale locale13 = dateTimeParserBucket7.getLocale();
        org.joda.time.Chronology chronology14 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.minutes();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        java.lang.String str19 = dateTimeField17.getAsText((long) (-3600000));
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 69L + "'", long11 == 69L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "19" + "'", str19, "19");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.setUnicodeLocaleKeyword("48", "English");
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale6.getScript();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale6);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.setExtension(' ', "ko_KR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.io.IOException iOException1 = new java.io.IOException("X-LVARIANT-0");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-100751458));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("thu");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "thu");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("UTC");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale locale7 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.lang.String str9 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet8);
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList12 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.lang.String>) strSet11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList16 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, strMap15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.getISO3Country();
        java.lang.String str22 = locale20.getISO3Language();
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale20.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology27, locale28, (java.lang.Integer) 100);
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale31.getISO3Country();
        java.lang.String str33 = locale31.getISO3Language();
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale31.getDisplayVariant(locale34);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale36.getISO3Country();
        java.util.Locale locale38 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale20, locale25, locale28, locale31, locale36, locale38 };
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale locale42 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList40);
        java.lang.String[] strArray46 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.lang.String str49 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList47);
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale53.getISO3Country();
        java.lang.String str55 = locale53.getISO3Language();
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = locale53.getDisplayVariant(locale56);
        java.util.Locale locale58 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology60 = null;
        java.util.Locale locale61 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology60, locale61, (java.lang.Integer) 100);
        java.util.Locale locale64 = java.util.Locale.getDefault();
        java.lang.String str65 = locale64.getISO3Country();
        java.lang.String str66 = locale64.getISO3Language();
        java.util.Locale locale67 = java.util.Locale.getDefault();
        java.lang.String str68 = locale64.getDisplayVariant(locale67);
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale69.getISO3Country();
        java.util.Locale locale71 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray72 = new java.util.Locale[] { locale53, locale58, locale61, locale64, locale69, locale71 };
        java.util.ArrayList<java.util.Locale> localeList73 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList73, localeArray72);
        java.util.Locale locale75 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale locale77 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale locale78 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale locale82 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean83 = locale82.hasExtensions();
        java.util.Locale locale84 = java.util.Locale.CHINA;
        java.lang.String str85 = locale82.getDisplayVariant(locale84);
        java.util.Set<java.lang.String> strSet86 = locale84.getUnicodeLocaleKeys();
        java.lang.String str87 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet86);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeList16);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "CHN" + "'", str21, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zho" + "'", str22, "zho");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "CHN" + "'", str32, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "zho" + "'", str33, "zho");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "CHN" + "'", str37, "CHN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(locale42);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "CHN" + "'", str54, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "zho" + "'", str55, "zho");
        org.junit.Assert.assertNotNull(locale56);
// flaky:         org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
// flaky:         org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
// flaky:         org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "CHN" + "'", str65, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "zho" + "'", str66, "zho");
        org.junit.Assert.assertNotNull(locale67);
// flaky:         org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(locale69);
// flaky:         org.junit.Assert.assertEquals(locale69.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "CHN" + "'", str70, "CHN");
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(locale75);
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNull(locale77);
        org.junit.Assert.assertNull(locale78);
        org.junit.Assert.assertEquals(locale82.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "+00:00" + "'", str85, "+00:00");
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertNull(str87);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setRegion("CN");
        java.util.Locale.Builder builder13 = builder10.clear();
        java.util.Locale.Builder builder15 = builder13.removeUnicodeLocaleAttribute("italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setVariant("3");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 3 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) (byte) -1);
        long long7 = dateTimeZone1.convertUTCToLocal(64713600000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str10 = dateTimeZone1.getShortName(54874799L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 64713600000L + "'", long7 == 64713600000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        java.util.Locale.LanguageRange languageRange4 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str5 = languageRange4.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange4 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale.LanguageRange languageRange10 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] { languageRange10 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale.LanguageRange[] languageRangeArray14 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList15 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList15, languageRangeArray14);
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale17.getISO3Country();
        java.lang.String str19 = locale17.getISO3Language();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale17.getDisplayVariant(locale20);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 100);
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale28.getISO3Country();
        java.lang.String str30 = locale28.getISO3Language();
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale28.getDisplayVariant(locale31);
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = locale33.getISO3Country();
        java.util.Locale locale35 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale17, locale22, locale25, locale28, locale33, locale35 };
        java.util.ArrayList<java.util.Locale> localeList37 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList37, localeArray36);
        java.util.Locale locale39 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList15, (java.util.Collection<java.util.Locale>) localeList37);
        java.util.Locale.FilteringMode filteringMode40 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList37, filteringMode40);
        java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList41);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList44, strMap45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList46, strMap47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "germany" + "'", str5, "germany");
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(languageRangeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zho" + "'", str19, "zho");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zho" + "'", str30, "zho");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(locale39);
        org.junit.Assert.assertTrue("'" + filteringMode40 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode40.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList41);
        org.junit.Assert.assertNotNull(localeList42);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertNotNull(languageRangeList48);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("1970");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder10 = builder1.setLanguage("it");
        java.util.Locale.Builder builder11 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder11.setExtension('u', "java.io.ioexception: ita");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: java.io.ioexception: ita [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.io.IOException iOException1 = new java.io.IOException("Italiano");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        int int3 = dateTimeZone0.getOffsetFromLocal(60480000010L);
        long long7 = dateTimeZone0.convertLocalToUTC(18748800052L, false, 259200087L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str10 = dateTimeZone9.getID();
        long long12 = dateTimeZone9.previousTransition((long) 'a');
        boolean boolean13 = dateTimeZone9.isFixed();
        long long17 = dateTimeZone9.convertLocalToUTC(0L, false, (long) (short) 100);
        long long19 = dateTimeZone0.getMillisKeepLocal(dateTimeZone9, (long) 5207);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str22 = dateTimeZone21.getID();
        long long24 = dateTimeZone21.nextTransition((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        java.lang.String str26 = dateTimeZone21.getID();
        long long28 = dateTimeZone0.getMillisKeepLocal(dateTimeZone21, 93623040172800008L);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone0.getOffset(readableInstant29);
        java.lang.String str32 = dateTimeZone0.getName((long) (-6011));
        int int34 = dateTimeZone0.getStandardOffset((long) 187800000);
        long long37 = dateTimeZone0.convertLocalToUTC(156764096841600022L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 18748800052L + "'", long7 == 18748800052L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5207L + "'", long19 == 5207L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 93623040172800008L + "'", long28 == 93623040172800008L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 156764096841600022L + "'", long37 == 156764096841600022L);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) '#', locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("chinois");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.setLanguage("ITA");
        java.util.Locale.Builder builder6 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setVariant("java.io.IOException: Oct");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: java.io.IOException: Oct [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        long long4 = dateTimeZone1.adjustOffset(24L, false);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str6 = dateTimeZone5.getID();
        int int8 = dateTimeZone5.getOffsetFromLocal(60480000010L);
        long long12 = dateTimeZone5.convertLocalToUTC(18748800052L, false, 259200087L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str15 = dateTimeZone14.getID();
        long long17 = dateTimeZone14.previousTransition((long) 'a');
        boolean boolean18 = dateTimeZone14.isFixed();
        long long22 = dateTimeZone14.convertLocalToUTC(0L, false, (long) (short) 100);
        long long24 = dateTimeZone5.getMillisKeepLocal(dateTimeZone14, (long) 5207);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str27 = dateTimeZone26.getID();
        long long29 = dateTimeZone26.nextTransition((-1L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        java.lang.String str31 = dateTimeZone26.getID();
        long long33 = dateTimeZone5.getMillisKeepLocal(dateTimeZone26, 93623040172800008L);
        long long35 = dateTimeZone1.getMillisKeepLocal(dateTimeZone26, 3124396800014L);
        java.lang.String str37 = dateTimeZone26.getShortName((-97379000L));
        java.util.TimeZone timeZone38 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        java.lang.String str41 = dateTimeZone39.getName(429378710400000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 24L + "'", long4 == 24L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 18748800052L + "'", long12 == 18748800052L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5207L + "'", long24 == 5207L);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 93623040172800008L + "'", long33 == 93623040172800008L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 3124393200014L + "'", long35 == 3124393200014L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale6 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean7 = locale6.hasExtensions();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 100);
        java.lang.String str13 = locale6.getDisplayCountry(locale10);
        java.lang.String str14 = dateTimeZone1.getShortName((long) (short) 1, locale10);
        long long18 = dateTimeZone1.convertLocalToUTC((-156764159999998813L), false, 3084498489600000L);
        long long21 = dateTimeZone1.convertLocalToUTC((-259200010L), false);
        java.lang.String str22 = dateTimeZone1.getID();
        int int24 = dateTimeZone1.getStandardOffset((long) (-30));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals(locale6.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-156764159999998813L) + "'", long18 == (-156764159999998813L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-259200010L) + "'", long21 == (-259200010L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket7.getZone();
        dateTimeParserBucket7.setOffset((java.lang.Integer) 1);
        long long13 = dateTimeParserBucket7.computeMillis();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 99L + "'", long13 == 99L);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder11 = builder7.addUnicodeLocaleAttribute("86399999");
        java.util.Locale.Builder builder13 = builder11.setLanguage("JPN");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("december");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology8.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(1497);
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, 28166400000L);
        boolean boolean17 = dateTimeZone13.isStandardOffset(28857600110L);
        java.lang.String str19 = dateTimeZone13.getNameKey(41L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 28166398503L + "'", long15 == 28166398503L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale3.getDisplayName(locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale9.getISO3Country();
        java.lang.String str11 = locale9.getISO3Language();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale9.getDisplayVariant(locale12);
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.lang.String str15 = locale14.getDisplayName();
        java.lang.String str16 = locale14.getISO3Language();
        java.lang.String str17 = locale12.getDisplayScript(locale14);
        java.lang.String str18 = locale7.getDisplayScript(locale14);
        java.lang.String str19 = locale14.getISO3Language();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CHN" + "'", str10, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zho" + "'", str11, "zho");
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str15, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ita" + "'", str16, "ita");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ita" + "'", str19, "ita");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.io.IOException iOException1 = new java.io.IOException("weekyearOfCentury");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Throwable throwable7 = null;
        java.io.IOException iOException8 = new java.io.IOException("UTC", throwable7);
        java.io.IOException iOException9 = new java.io.IOException(throwable7);
        iOException4.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("UTC", (java.lang.Throwable) iOException9);
        java.io.IOException iOException13 = new java.io.IOException();
        java.io.IOException iOException14 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException13);
        iOException9.addSuppressed((java.lang.Throwable) iOException13);
        java.io.IOException iOException17 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray18 = iOException17.getSuppressed();
        java.lang.Throwable throwable20 = null;
        java.io.IOException iOException21 = new java.io.IOException("UTC", throwable20);
        java.io.IOException iOException22 = new java.io.IOException(throwable20);
        iOException17.addSuppressed((java.lang.Throwable) iOException22);
        iOException9.addSuppressed((java.lang.Throwable) iOException22);
        iOException1.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.String str26 = iOException9.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.io.IOException" + "'", str26, "java.io.IOException");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("allemand");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'allemand' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale2 = new java.util.Locale("java.io.IOException: ita");
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Set<java.lang.String> strSet4 = locale2.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "java.io.ioexception: ita");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "java.io.ioexception: ita");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale27, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(100L, chronology24, locale27);
        int int31 = dateTimeParserBucket30.getOffset();
        java.lang.Object obj32 = dateTimeParserBucket30.saveState();
        java.util.Locale locale33 = dateTimeParserBucket30.getLocale();
        java.util.Locale locale34 = dateTimeParserBucket30.getLocale();
        java.util.Locale.Builder builder35 = builder22.setLocale(locale34);
        java.util.Locale.Builder builder37 = builder35.setLanguageTag("ita");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.io.IOException iOException1 = new java.io.IOException("weekyear");
        java.io.IOException iOException3 = new java.io.IOException("CHN");
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray6 = iOException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder7.build();
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale.Builder builder15 = builder12.setExtension('a', "100");
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        java.util.Locale locale17 = builder16.build();
        boolean boolean18 = locale17.hasExtensions();
        java.lang.String str19 = locale9.getDisplayName(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = locale17.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder14 = builder12.removeUnicodeLocaleAttribute("1969");
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder16.removeUnicodeLocaleAttribute("java.io.IOException: 5100");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: java.io.IOException: 5100 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder9.setLanguage("CN");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setUnicodeLocaleKeyword("France", "Thursday");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: France [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.Object obj8 = dateTimeParserBucket7.saveState();
        dateTimeParserBucket7.setOffset((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.util.Locale locale13 = java.util.Locale.US;
        dateTimeParserBucket7.saveField(dateTimeFieldType11, "centuryOfEra", locale13);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket7.getChronology();
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 11);
        dateTimeParserBucket7.setOffset(240);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.io.IOException iOException1 = new java.io.IOException("Januar");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getScript();
        java.lang.String str3 = locale0.getISO3Country();
        java.util.Locale.setDefault(locale0);
        java.lang.String str5 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("18");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 18 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.weekOfWeekyear();
        boolean boolean11 = dateTimeField10.isSupported();
        long long13 = dateTimeField10.remainder(946789342790L);
        long long15 = dateTimeField10.roundFloor(0L);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it_IT");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 536542790L + "'", long13 == 536542790L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-259200000L) + "'", long15 == (-259200000L));
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("DateTimeField[dayOfYear]");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.util.Locale locale2 = new java.util.Locale("168 (DATETIMEFIELD[MILLISOFDAY],dayOfYear)", "Chine");
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder4.setExtension('a', "");
        java.util.Locale.Builder builder9 = builder4.setLanguage("ita");
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale13 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology11, locale13, (java.lang.Integer) 1, 0);
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale13.getDisplayName(locale17);
        java.lang.String str19 = locale13.getISO3Country();
        java.util.Locale.Builder builder20 = builder9.setLocale(locale13);
        java.util.Locale.Builder builder23 = builder20.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder25 = builder23.addUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder27 = builder25.addUnicodeLocaleAttribute("italia");
        java.util.Locale.Builder builder29 = builder25.setVariant("");
        boolean boolean30 = locale2.equals((java.lang.Object) "");
        org.junit.Assert.assertEquals(locale2.toString(), "168 (datetimefield[millisofday],dayofyear)_CHINE");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC(0L, false, (long) (short) 100);
        int int11 = dateTimeZone1.getOffsetFromLocal(0L);
        java.lang.String str13 = dateTimeZone1.getNameKey(18748800052L);
        boolean boolean15 = dateTimeZone1.isStandardOffset((long) (short) 100);
        long long18 = dateTimeZone1.convertLocalToUTC(90L, false);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone1.getOffset(readableInstant19);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 90L + "'", long18 == 90L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale8 = new java.util.Locale("Italian");
        java.lang.String str9 = locale8.toLanguageTag();
        java.util.Locale.Builder builder10 = builder5.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setExtension('u', "7");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: 7 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale8.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italian" + "'", str9, "italian");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.util.Locale locale3 = new java.util.Locale("+168:09", "WEEKOFWEEKYEAR", "Deutsch (Deutschland)");
        org.junit.Assert.assertEquals(locale3.toString(), "+168:09_WEEKOFWEEKYEAR_Deutsch (Deutschland)");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder17.setLanguage("ita");
        java.util.Locale.Builder builder25 = builder17.setExtension('a', "de_DE");
        java.util.Locale.Builder builder26 = builder17.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(53, 53);
        long long4 = dateTimeZone2.previousTransition((-259200000L));
        boolean boolean6 = dateTimeZone2.isStandardOffset(2056399L);
        int int8 = dateTimeZone2.getOffset(34830180000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-259200000L) + "'", long4 == (-259200000L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 193980000 + "'", int8 == 193980000);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.util.Locale locale3 = new java.util.Locale("+01:00", "java.io.IOException: java.io.IOException: ", "0");
        java.lang.String str4 = locale3.getLanguage();
        java.util.Locale locale5 = locale3.stripExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "+01:00_JAVA.IO.IOEXCEPTION: JAVA.IO.IOEXCEPTION: _0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "+01:00_JAVA.IO.IOEXCEPTION: JAVA.IO.IOEXCEPTION: _0");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long6 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        java.lang.String str7 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.adjustOffset(259200048L, true);
        int int13 = dateTimeZone1.getStandardOffset(86400100L);
        java.lang.String str14 = dateTimeZone1.toString();
        long long17 = dateTimeZone1.adjustOffset(3148833600100L, false);
        long long19 = dateTimeZone1.nextTransition((-212399991L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 259200048L + "'", long11 == 259200048L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3148833600100L + "'", long17 == 3148833600100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-212399991L) + "'", long19 == (-212399991L));
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet7, filteringMode8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.lang.String str14 = locale13.getISO3Country();
        java.lang.String str15 = locale13.getISO3Language();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = locale13.getDisplayVariant(locale16);
        java.util.Locale locale18 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 100);
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale24.getISO3Country();
        java.lang.String str26 = locale24.getISO3Language();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale24.getDisplayVariant(locale27);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = locale29.getISO3Country();
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray32 = new java.util.Locale[] { locale13, locale18, locale21, locale24, locale29, locale31 };
        java.util.ArrayList<java.util.Locale> localeList33 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList33, localeArray32);
        java.util.Locale locale35 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList33);
        java.lang.String[] strArray39 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        java.lang.String str42 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList40);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = locale46.getISO3Country();
        java.lang.String str48 = locale46.getISO3Language();
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.lang.String str50 = locale46.getDisplayVariant(locale49);
        java.util.Locale locale51 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology53 = null;
        java.util.Locale locale54 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology53, locale54, (java.lang.Integer) 100);
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = locale57.getISO3Country();
        java.lang.String str59 = locale57.getISO3Language();
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.lang.String str61 = locale57.getDisplayVariant(locale60);
        java.util.Locale locale62 = java.util.Locale.getDefault();
        java.lang.String str63 = locale62.getISO3Country();
        java.util.Locale locale64 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray65 = new java.util.Locale[] { locale46, locale51, locale54, locale57, locale62, locale64 };
        java.util.ArrayList<java.util.Locale> localeList66 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList66, localeArray65);
        java.util.Locale locale68 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.List<java.util.Locale> localeList69 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.Locale.LanguageRange[] languageRangeArray70 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList71 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList71, languageRangeArray70);
        java.util.Locale locale73 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet74 = locale73.getUnicodeLocaleKeys();
        java.lang.String str75 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList71, (java.util.Collection<java.lang.String>) strSet74);
        java.lang.String str76 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strSet74);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap77 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList78 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap77);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap79 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList80 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList78, strMap79);
        java.util.Locale locale81 = java.util.Locale.CHINESE;
        java.lang.String str82 = locale81.toLanguageTag();
        java.lang.String str83 = locale81.getLanguage();
        java.util.Locale.Builder builder84 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder85 = builder84.clear();
        java.util.Locale locale86 = builder85.build();
        java.util.Locale locale87 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str88 = locale86.getDisplayLanguage(locale87);
        java.lang.String str89 = locale81.getDisplayCountry(locale86);
        java.util.Set<java.lang.String> strSet90 = locale86.getUnicodeLocaleKeys();
        java.lang.String str91 = java.util.Locale.lookupTag(languageRangeList78, (java.util.Collection<java.lang.String>) strSet90);
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet90);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap93 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList94 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap93);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode8.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ITA" + "'", str14, "ITA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ita" + "'", str15, "ita");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ITA" + "'", str25, "ITA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ita" + "'", str26, "ita");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ITA" + "'", str30, "ITA");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(locale35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ITA" + "'", str47, "ITA");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ita" + "'", str48, "ita");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ITA" + "'", str58, "ITA");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ita" + "'", str59, "ita");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ITA" + "'", str63, "ITA");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(locale68);
        org.junit.Assert.assertNotNull(localeList69);
        org.junit.Assert.assertNotNull(languageRangeArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(languageRangeList78);
        org.junit.Assert.assertNotNull(languageRangeList80);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "zh" + "'", str82, "zh");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "zh" + "'", str83, "zh");
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNotNull(strSet90);
        org.junit.Assert.assertNull(str91);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(languageRangeList94);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        dateTimeParserBucket4.setZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getShortName(18748800052L);
        int int13 = dateTimeZone8.getOffsetFromLocal((long) 4969628);
        int int15 = dateTimeZone8.getOffsetFromLocal(5207L);
        long long17 = dateTimeZone8.convertUTCToLocal((-3599991L));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+100:00" + "'", str11, "+100:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 360000000 + "'", int13 == 360000000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 360000000 + "'", int15 == 360000000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 356400009L + "'", long17 == 356400009L);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        java.io.IOException iOException2 = new java.io.IOException();
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) iOException2);
        int int5 = dateTimeZone1.getStandardOffset((-359999903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3600000 + "'", int5 == 3600000);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("monthOfYear", (double) 156764147421600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.567641474216E17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.io.IOException iOException1 = new java.io.IOException("utc");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Throwable[] throwableArray3 = iOException1.getSuppressed();
        java.lang.String str4 = iOException1.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException: utc" + "'", str4, "java.io.IOException: utc");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology8.getDateTimeMillis(101, 19, 5306, 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial11 = null;
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        java.lang.String str17 = dateTimeField10.getAsText(readablePartial11, (-434), locale14);
        java.lang.String str18 = locale14.getVariant();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-434" + "'", str17, "-434");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("6926399", (double) 950400000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=9.504E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long6 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        java.lang.String str7 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.adjustOffset(259200048L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        int int16 = dateTimeZone1.getStandardOffset(2322259200695L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 259200048L + "'", long11 == 259200048L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder18 = builder6.clearExtensions();
        java.util.Locale locale19 = builder6.build();
        java.util.Locale.Builder builder21 = builder6.setLanguage("FR");
        java.util.Locale.Builder builder22 = builder6.clearExtensions();
        java.util.Locale locale23 = builder22.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder7.setLanguage("+59:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: +59:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 0, false, (long) (short) 1);
        java.lang.String str7 = dateTimeZone1.getName(61084800010L);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        int int11 = dateTimeZone1.getOffset(259200059L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-7200000L) + "'", long5 == (-7200000L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+02:00" + "'", str7, "+02:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7200000 + "'", int11 == 7200000);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.util.Locale locale1 = new java.util.Locale("\u52a0\u62ff\u5927");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getDisplayVariant();
        org.junit.Assert.assertEquals(locale1.toString(), "\u52a0\u62ff\u5927");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "\u52a0\u62ff\u5927");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setRegion("CN");
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = builder12.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder12.setUnicodeLocaleKeyword("+35:00", "26");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: +35:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"-3\" is malformed at \"3\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u661f\u671f\u516d");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CHINESE");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.setUnicodeLocaleKeyword("49", "");
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = builder8.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("java.io.IOException: ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception:");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder10.setExtension('a', "-525593976");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getISO3Country();
        java.lang.String str7 = locale5.getISO3Language();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.lang.String str9 = locale5.getDisplayVariant(locale8);
        java.util.Locale.setDefault(category0, locale8);
        java.util.Locale locale11 = java.util.Locale.getDefault(category0);
        java.util.Locale locale15 = new java.util.Locale("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd", "weekofweekyear", "\u6cd5\u6587");
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str17 = locale15.getDisplayLanguage(locale16);
        java.util.Set<java.lang.Character> charSet18 = locale15.getExtensionKeys();
        java.util.Locale.setDefault(category0, locale15);
        java.util.Locale locale20 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germania" + "'", str2, "Germania");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ita" + "'", str7, "ita");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "it");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "it");
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd\u6cd5\u6587");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str17, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd\u6cd5\u6587");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long4 = dateTimeZone1.adjustOffset(60480000010L, true);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) ' ', locale8);
        long long12 = dateTimeZone1.convertLocalToUTC(0L, false);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 60480000010L + "'", long4 == 60480000010L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7200000 + "'", int6 == 7200000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+02:00" + "'", str9, "+02:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-7200000L) + "'", long12 == (-7200000L));
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+02:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7200000 + "'", int15 == 7200000);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder9.removeUnicodeLocaleAttribute("-434:00_DEUTSCH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: -434:00_DEUTSCH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("-10368000", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-10368000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2937600);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder17.setLanguage("ita");
        java.util.Locale.Builder builder24 = builder17.removeUnicodeLocaleAttribute("18720052");
        java.util.Locale locale25 = builder24.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ita__#u-35");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getISO3Country();
        java.lang.String str3 = locale0.getISO3Country();
        java.lang.String str4 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ITA" + "'", str2, "ITA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ITA" + "'", str3, "ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "italiano" + "'", str4, "italiano");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguageTag("-8");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.io.IOException iOException1 = new java.io.IOException("java.io.IOException: und");
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException("UTC", throwable4);
        java.io.IOException iOException6 = new java.io.IOException(throwable4);
        java.io.IOException iOException7 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException6);
        java.lang.Throwable throwable9 = null;
        java.io.IOException iOException10 = new java.io.IOException("UTC", throwable9);
        java.io.IOException iOException11 = new java.io.IOException(throwable9);
        java.io.IOException iOException13 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray14 = iOException13.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException13);
        iOException11.addSuppressed((java.lang.Throwable) iOException13);
        iOException7.addSuppressed((java.lang.Throwable) iOException11);
        iOException1.addSuppressed((java.lang.Throwable) iOException7);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.util.Locale locale3 = new java.util.Locale("X-LVARIANT-0", "UTC", "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getScript();
        java.util.Locale.setDefault(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str4, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("8", (double) (-93600000L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-9.36E7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("java.io.IOException: utc", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception:utc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.util.Locale locale3 = new java.util.Locale("CHINESE", "DateTimeField[dayOfWeek]", "71340010");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        org.junit.Assert.assertEquals(locale3.toString(), "chinese_DATETIMEFIELD[DAYOFWEEK]_71340010");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode8 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList9 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet7, filteringMode8);
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] { languageRange11 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = null; // flaky: locale18.getISO3Country();
        java.lang.String str20 = null; // flaky: locale18.getISO3Language();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale18.getDisplayVariant(locale21);
        java.util.Locale locale23 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale26, (java.lang.Integer) 100);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = null; // flaky: locale29.getISO3Country();
        java.lang.String str31 = null; // flaky: locale29.getISO3Language();
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = locale29.getDisplayVariant(locale32);
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = null; // flaky: locale34.getISO3Country();
        java.util.Locale locale36 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale18, locale23, locale26, locale29, locale34, locale36 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.Locale locale40 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Locale.FilteringMode filteringMode41 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList38, filteringMode41);
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Locale.LanguageRange languageRange45 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] { languageRange45 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.util.Locale.LanguageRange[] languageRangeArray49 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList50 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList50, languageRangeArray49);
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = null; // flaky: locale52.getISO3Country();
        java.lang.String str54 = null; // flaky: locale52.getISO3Language();
        java.util.Locale locale55 = java.util.Locale.getDefault();
        java.lang.String str56 = locale52.getDisplayVariant(locale55);
        java.util.Locale locale57 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology59, locale60, (java.lang.Integer) 100);
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.lang.String str64 = null; // flaky: locale63.getISO3Country();
        java.lang.String str65 = null; // flaky: locale63.getISO3Language();
        java.util.Locale locale66 = java.util.Locale.getDefault();
        java.lang.String str67 = locale63.getDisplayVariant(locale66);
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.lang.String str69 = null; // flaky: locale68.getISO3Country();
        java.util.Locale locale70 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray71 = new java.util.Locale[] { locale52, locale57, locale60, locale63, locale68, locale70 };
        java.util.ArrayList<java.util.Locale> localeList72 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList72, localeArray71);
        java.util.Locale locale74 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList50, (java.util.Collection<java.util.Locale>) localeList72);
        java.util.Locale.FilteringMode filteringMode75 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.util.Locale>) localeList72, filteringMode75);
        java.util.Locale locale77 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList72);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap78 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList79 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap78);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + filteringMode8 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode8.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zho" + "'", str20, "zho");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertNotNull(locale26);
// flaky:         org.junit.Assert.assertEquals(locale26.toString(), "zh");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zho" + "'", str31, "zho");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(locale40);
        org.junit.Assert.assertTrue("'" + filteringMode41 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode41.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList42);
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertNotNull(languageRangeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(languageRangeArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "zho" + "'", str54, "zho");
        org.junit.Assert.assertNotNull(locale55);
// flaky:         org.junit.Assert.assertEquals(locale55.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
// flaky:         org.junit.Assert.assertEquals(locale57.toString(), "zh");
        org.junit.Assert.assertNotNull(locale60);
// flaky:         org.junit.Assert.assertEquals(locale60.toString(), "zh");
        org.junit.Assert.assertNotNull(locale63);
// flaky:         org.junit.Assert.assertEquals(locale63.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "zho" + "'", str65, "zho");
        org.junit.Assert.assertNotNull(locale66);
// flaky:         org.junit.Assert.assertEquals(locale66.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(locale68);
// flaky:         org.junit.Assert.assertEquals(locale68.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(locale74);
        org.junit.Assert.assertTrue("'" + filteringMode75 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode75.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNull(locale77);
        org.junit.Assert.assertNotNull(languageRangeList79);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("Oct");
        java.util.Locale.Builder builder9 = builder5.clearExtensions();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone11.getOffset(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone11.getOffset(readableInstant14);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology18, locale19, (java.lang.Integer) 100);
        java.lang.String str22 = dateTimeZone11.getShortName(10L, locale19);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale27, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(100L, chronology24, locale27);
        java.lang.String str31 = locale27.getScript();
        java.lang.String str33 = locale27.getExtension('u');
        java.util.Set<java.lang.String> strSet34 = locale27.getUnicodeLocaleAttributes();
        java.lang.String str35 = locale27.getDisplayScript();
        java.lang.String str36 = locale27.getDisplayLanguage();
        java.lang.String str37 = locale19.getDisplayScript(locale27);
        java.util.Locale.Builder builder38 = null; // flaky: builder5.setLocale(locale27);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587" + "'", str36, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
// flaky:         org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone9.getOffset(readableInstant12);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 3599999L);
        java.lang.String str17 = dateTimeZone1.getName((long) 12);
        int int19 = dateTimeZone1.getOffsetFromLocal(18720052L);
        int int21 = dateTimeZone1.getOffset(24L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3599999L + "'", long15 == 3599999L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("29", "datetimefield[yearofcentury]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: datetimefield[yearofcentury] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder10 = builder7.setLanguage("zho");
        java.util.Locale.Builder builder12 = builder10.addUnicodeLocaleAttribute("168");
        java.util.Locale locale13 = builder10.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder10.removeUnicodeLocaleAttribute("+100:32");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: +100:32 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zho__#u-168");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.io.IOException iOException2 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("ITA", (java.lang.Throwable) iOException2);
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException10 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray11 = iOException10.getSuppressed();
        java.lang.Throwable throwable13 = null;
        java.io.IOException iOException14 = new java.io.IOException("UTC", throwable13);
        java.io.IOException iOException15 = new java.io.IOException(throwable13);
        iOException10.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException("UTC", (java.lang.Throwable) iOException15);
        java.io.IOException iOException19 = new java.io.IOException();
        java.io.IOException iOException20 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException19);
        iOException15.addSuppressed((java.lang.Throwable) iOException19);
        java.lang.Throwable throwable25 = null;
        java.io.IOException iOException26 = new java.io.IOException("UTC", throwable25);
        java.io.IOException iOException27 = new java.io.IOException(throwable25);
        java.io.IOException iOException28 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException27);
        java.lang.Throwable[] throwableArray29 = iOException28.getSuppressed();
        java.io.IOException iOException30 = new java.io.IOException("cinese", (java.lang.Throwable) iOException28);
        iOException19.addSuppressed((java.lang.Throwable) iOException28);
        java.io.IOException iOException32 = new java.io.IOException("Deutschland", (java.lang.Throwable) iOException28);
        java.lang.Throwable throwable35 = null;
        java.io.IOException iOException36 = new java.io.IOException("UTC", throwable35);
        java.io.IOException iOException37 = new java.io.IOException(throwable35);
        java.io.IOException iOException38 = new java.io.IOException("7", (java.lang.Throwable) iOException37);
        java.io.IOException iOException39 = new java.io.IOException((java.lang.Throwable) iOException37);
        iOException28.addSuppressed((java.lang.Throwable) iOException37);
        java.io.IOException iOException42 = new java.io.IOException("jpn");
        java.io.IOException iOException45 = new java.io.IOException("UTC");
        java.io.IOException iOException47 = new java.io.IOException("zho");
        iOException45.addSuppressed((java.lang.Throwable) iOException47);
        java.io.IOException iOException49 = new java.io.IOException("2", (java.lang.Throwable) iOException45);
        iOException42.addSuppressed((java.lang.Throwable) iOException49);
        java.lang.Throwable[] throwableArray51 = iOException49.getSuppressed();
        java.io.IOException iOException54 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray55 = iOException54.getSuppressed();
        java.io.IOException iOException56 = new java.io.IOException((java.lang.Throwable) iOException54);
        java.io.IOException iOException57 = new java.io.IOException("ITA", (java.lang.Throwable) iOException54);
        java.io.IOException iOException58 = new java.io.IOException((java.lang.Throwable) iOException57);
        iOException49.addSuppressed((java.lang.Throwable) iOException57);
        java.io.IOException iOException60 = new java.io.IOException((java.lang.Throwable) iOException49);
        java.io.IOException iOException61 = new java.io.IOException((java.lang.Throwable) iOException49);
        iOException37.addSuppressed((java.lang.Throwable) iOException61);
        iOException5.addSuppressed((java.lang.Throwable) iOException61);
        java.io.IOException iOException66 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray67 = iOException66.getSuppressed();
        java.lang.Throwable throwable69 = null;
        java.io.IOException iOException70 = new java.io.IOException("UTC", throwable69);
        java.io.IOException iOException71 = new java.io.IOException(throwable69);
        iOException66.addSuppressed((java.lang.Throwable) iOException71);
        java.io.IOException iOException73 = new java.io.IOException("UTC", (java.lang.Throwable) iOException71);
        java.lang.Throwable[] throwableArray74 = iOException71.getSuppressed();
        java.io.IOException iOException75 = new java.io.IOException((java.lang.Throwable) iOException71);
        java.lang.Throwable[] throwableArray76 = iOException75.getSuppressed();
        iOException61.addSuppressed((java.lang.Throwable) iOException75);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray76);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("BC");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.parse("germany");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList5, strMap6);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.parse("ja");
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] { languageRange11 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.lang.String str19 = null; // flaky: locale18.getISO3Country();
        java.lang.String str20 = null; // flaky: locale18.getISO3Language();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale18.getDisplayVariant(locale21);
        java.util.Locale locale23 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale26, (java.lang.Integer) 100);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        java.lang.String str30 = null; // flaky: locale29.getISO3Country();
        java.lang.String str31 = null; // flaky: locale29.getISO3Language();
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.lang.String str33 = locale29.getDisplayVariant(locale32);
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = null; // flaky: locale34.getISO3Country();
        java.util.Locale locale36 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray37 = new java.util.Locale[] { locale18, locale23, locale26, locale29, locale34, locale36 };
        java.util.ArrayList<java.util.Locale> localeList38 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList38, localeArray37);
        java.util.Locale locale40 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList38);
        java.util.Locale.FilteringMode filteringMode41 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList38, filteringMode41);
        java.util.Locale locale43 = java.util.Locale.lookup(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList42);
        java.util.Locale.LanguageRange languageRange45 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str46 = languageRange45.getRange();
        java.util.Locale.LanguageRange languageRange48 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str49 = languageRange48.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray50 = new java.util.Locale.LanguageRange[] { languageRange45, languageRange48 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList51 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList51, languageRangeArray50);
        java.util.Locale.LanguageRange languageRange54 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] { languageRange54 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.util.Locale locale61 = java.util.Locale.getDefault();
        java.lang.String str62 = null; // flaky: locale61.getISO3Country();
        java.lang.String str63 = null; // flaky: locale61.getISO3Language();
        java.util.Locale locale64 = java.util.Locale.getDefault();
        java.lang.String str65 = locale61.getDisplayVariant(locale64);
        java.util.Locale locale66 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology68 = null;
        java.util.Locale locale69 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology68, locale69, (java.lang.Integer) 100);
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.lang.String str73 = null; // flaky: locale72.getISO3Country();
        java.lang.String str74 = null; // flaky: locale72.getISO3Language();
        java.util.Locale locale75 = java.util.Locale.getDefault();
        java.lang.String str76 = locale72.getDisplayVariant(locale75);
        java.util.Locale locale77 = java.util.Locale.getDefault();
        java.lang.String str78 = null; // flaky: locale77.getISO3Country();
        java.util.Locale locale79 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray80 = new java.util.Locale[] { locale61, locale66, locale69, locale72, locale77, locale79 };
        java.util.ArrayList<java.util.Locale> localeList81 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList81, localeArray80);
        java.util.Locale locale83 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, (java.util.Collection<java.util.Locale>) localeList81);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.util.Locale>) localeList81, filteringMode84);
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList51, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.List<java.util.Locale> localeList87 = java.util.Locale.filter(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList85);
        java.util.Locale locale88 = java.util.Locale.lookup(languageRangeList7, (java.util.Collection<java.util.Locale>) localeList87);
        java.util.Locale locale89 = java.util.Locale.lookup(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList87);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "zho" + "'", str20, "zho");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertNotNull(locale26);
// flaky:         org.junit.Assert.assertEquals(locale26.toString(), "zh");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zho" + "'", str31, "zho");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(locale40);
        org.junit.Assert.assertTrue("'" + filteringMode41 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode41.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList42);
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "germany" + "'", str46, "germany");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "germany" + "'", str49, "germany");
        org.junit.Assert.assertNotNull(languageRangeArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(locale61);
// flaky:         org.junit.Assert.assertEquals(locale61.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "zho" + "'", str63, "zho");
        org.junit.Assert.assertNotNull(locale64);
// flaky:         org.junit.Assert.assertEquals(locale64.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(locale66);
// flaky:         org.junit.Assert.assertEquals(locale66.toString(), "zh");
        org.junit.Assert.assertNotNull(locale69);
// flaky:         org.junit.Assert.assertEquals(locale69.toString(), "zh");
        org.junit.Assert.assertNotNull(locale72);
// flaky:         org.junit.Assert.assertEquals(locale72.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "zho" + "'", str74, "zho");
        org.junit.Assert.assertNotNull(locale75);
// flaky:         org.junit.Assert.assertEquals(locale75.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(locale77);
// flaky:         org.junit.Assert.assertEquals(locale77.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(locale83);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode84.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertNotNull(localeList86);
        org.junit.Assert.assertNotNull(localeList87);
        org.junit.Assert.assertNull(locale88);
        org.junit.Assert.assertNull(locale89);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(36000000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("26", (double) 5184000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=5.184E9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayScript();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.lang.String str5 = locale0.getVariant();
        java.util.Set<java.lang.String> strSet6 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko-KR" + "'", str1, "ko-KR");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u97e9\u56fd" + "'", str2, "\u97e9\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale9.getDisplayScript();
        java.util.Locale.Builder builder12 = builder7.setLocale(locale9);
        java.util.Locale.Builder builder15 = builder12.setExtension('a', "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder12.setLanguageTag("inglese (Stati Uniti)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: inglese (Stati Uniti) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("+100:32");
        java.util.Locale locale2 = locale1.stripExtensions();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        long long3 = dateTimeZone1.convertUTCToLocal((long) (short) -1);
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.lang.String str8 = locale7.getDisplayCountry();
        java.util.Locale.setDefault(category6, locale7);
        java.util.Locale locale10 = java.util.Locale.getDefault(category6);
        java.util.Locale locale11 = java.util.Locale.getDefault(category6);
        java.lang.String str12 = locale5.getDisplayName(locale11);
        java.lang.String str13 = dateTimeZone1.getShortName((long) 22, locale11);
        java.lang.String str14 = locale11.getScript();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9L + "'", long3 == 9L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u5fb7\u56fd" + "'", str8, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str12, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.010" + "'", str13, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("12");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(345599969L, chronology1, locale3, (java.lang.Integer) 101, 50);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.io.IOException iOException1 = new java.io.IOException("dayofyear");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException4 = new java.io.IOException("und");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException2.getSuppressed();
        java.lang.String str7 = iOException2.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.io.IOException: java.io.IOException: dayofyear" + "'", str7, "java.io.IOException: java.io.IOException: dayofyear");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        java.util.Locale locale3 = new java.util.Locale("2", "ko", "265");
        java.util.Locale locale4 = null;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale3.toString(), "2_KO_265");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        java.util.Locale locale3 = new java.util.Locale("French (France)", "361920000", "java.io.IOException: Japanese");
        org.junit.Assert.assertEquals(locale3.toString(), "french (france)_361920000_java.io.IOException: Japanese");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setLanguageTag("java.io.IOException: 1497");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: java.io.IOException: 1497 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("cinese");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for cinese");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "cinese");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("java.io.IOException: SECONDOFMINUTE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'java.io.IOException: SECONDOFMINUTE' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        java.io.IOException iOException1 = new java.io.IOException("secondOfDay");
        java.io.IOException iOException6 = new java.io.IOException("");
        java.io.IOException iOException7 = new java.io.IOException("USA", (java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("-1", (java.lang.Throwable) iOException6);
        java.io.IOException iOException9 = new java.io.IOException("X-LVARIANT-0", (java.lang.Throwable) iOException8);
        iOException1.addSuppressed((java.lang.Throwable) iOException8);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder11 = builder9.setVariant("25200000");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.String str8 = locale4.getScript();
        java.lang.String str10 = locale4.getExtension('u');
        java.lang.String str11 = locale4.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("KOR", 0.0d);
        java.lang.String str3 = languageRange2.getRange();
        double double4 = languageRange2.getWeight();
        java.lang.String str5 = languageRange2.getRange();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "kor" + "'", str5, "kor");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Corea del Sud", (double) 79199977L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=7.9199977E7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("yearOfCentury");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.util.Locale locale2 = new java.util.Locale("+00:00:00.009", "\u6708");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u6708");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder13 = builder10.setVariant("");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str2 = locale0.getDisplayName();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chinese" + "'", str2, "Chinese");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        java.io.IOException iOException2 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("", (java.lang.Throwable) iOException2);
        java.lang.String str6 = iOException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: zho" + "'", str6, "java.io.IOException: zho");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone5.getOffset(readableInstant8);
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology12, locale13, (java.lang.Integer) 100);
        java.lang.String str16 = dateTimeZone5.getShortName(10L, locale13);
        java.util.Locale.Builder builder17 = null; // flaky: builder0.setLocale(locale13);
        java.util.Locale.Builder builder18 = null; // flaky: builder17.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = null; // flaky: builder18.addUnicodeLocaleAttribute("Stati Uniti");
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: Stati Uniti [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
// flaky:         org.junit.Assert.assertNotNull(builder17);
// flaky:         org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Collection<java.util.Locale> localeCollection1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale2 = java.util.Locale.lookup(languageRangeList0, localeCollection1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder9.clearExtensions();
        java.util.Locale.Builder builder15 = builder9.setLanguageTag("ja");
        java.util.Locale.Builder builder18 = builder15.setExtension('x', "BC");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        java.util.Locale locale3 = new java.util.Locale("DateTimeField[hourOfDay]", "365", "345599");
        org.junit.Assert.assertEquals(locale3.toString(), "datetimefield[hourofday]_365_345599");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("2", (java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray8 = iOException6.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException11 = new java.io.IOException();
        java.io.IOException iOException12 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException12.getSuppressed();
        iOException6.addSuppressed((java.lang.Throwable) iOException12);
        java.lang.Throwable[] throwableArray15 = iOException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 0, false, (long) (short) 1);
        java.lang.String str7 = dateTimeZone1.getName(61084800010L);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        int int11 = dateTimeZone1.getOffset(28162800000L);
        long long13 = dateTimeZone1.nextTransition((long) 31);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-7200000L) + "'", long5 == (-7200000L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+02:00" + "'", str7, "+02:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7200000 + "'", int11 == 7200000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 31L + "'", long13 == 31L);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayScript();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.lang.String str7 = dateTimeZone0.getShortName(0L, locale2);
        int int9 = dateTimeZone0.getOffsetFromLocal((-298800000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ko-KR" + "'", str3, "ko-KR");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u97e9\u56fd" + "'", str4, "\u97e9\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setRegion("United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getNameKey((-3L));
        java.util.Locale locale13 = java.util.Locale.ENGLISH;
        java.lang.String str14 = dateTimeZone8.getShortName(97L, locale13);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.io.IOException iOException1 = new java.io.IOException("ko");
        java.io.IOException iOException3 = new java.io.IOException("jpn");
        java.io.IOException iOException6 = new java.io.IOException("UTC");
        java.io.IOException iOException8 = new java.io.IOException("zho");
        iOException6.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("2", (java.lang.Throwable) iOException6);
        iOException3.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException("jpn");
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.io.IOException iOException16 = new java.io.IOException("35", (java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        iOException10.addSuppressed((java.lang.Throwable) iOException16);
        iOException1.addSuppressed((java.lang.Throwable) iOException16);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException16);
        java.lang.String str21 = iOException20.toString();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.io.IOException: java.io.IOException: 35" + "'", str21, "java.io.IOException: java.io.IOException: 35");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket7.getZone();
        long long14 = dateTimeZone11.adjustOffset((-62104024800001L), false);
        java.lang.String str16 = dateTimeZone11.getShortName(17999999L);
        java.lang.String str18 = dateTimeZone11.getNameKey((-288000000L));
        java.lang.String str19 = dateTimeZone11.toString();
        java.lang.String str21 = dateTimeZone11.getNameKey((-21L));
        long long23 = dateTimeZone11.convertUTCToLocal(930825160L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-62104024800001L) + "'", long14 == (-62104024800001L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 930825160L + "'", long23 == 930825160L);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 100);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        boolean boolean7 = dateTimeZone1.isFixed();
        boolean boolean9 = dateTimeZone1.isStandardOffset(0L);
        int int11 = dateTimeZone1.getStandardOffset(308760000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = null; // flaky: locale0.getISO3Country();
        java.lang.String str2 = null; // flaky: locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.lang.String str7 = locale0.getDisplayCountry(locale4);
        java.util.Locale.setDefault(locale4);
        java.lang.String str9 = locale4.getLanguage();
        java.util.Locale locale10 = locale4.stripExtensions();
        java.lang.String str11 = locale4.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh" + "'", str9, "zh");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh" + "'", str11, "zh");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        long long6 = dateTimeZone1.convertLocalToUTC((-23L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-24L) + "'", long6 == (-24L));
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("UTC");
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("\u5fb7\u56fd");
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = locale4.getDisplayName(locale5);
        java.lang.String str9 = locale4.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        java.lang.String str17 = locale10.getDisplayScript(locale14);
        java.lang.String str18 = locale14.getDisplayScript();
        java.lang.String str19 = null; // flaky: locale14.getISO3Country();
        java.lang.String str20 = locale4.getDisplayScript(locale14);
        java.util.Locale.Builder builder21 = null; // flaky: builder0.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = null; // flaky: builder21.removeUnicodeLocaleAttribute("en-US");
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en-US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky:         org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("UTC");
        java.util.Locale locale6 = builder3.build();
        java.lang.String str7 = locale6.getDisplayVariant();
        java.lang.String str8 = locale6.getISO3Language();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "utc");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "utc" + "'", str8, "utc");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        int int4 = dateTimeZone0.getOffset(1187L);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        java.lang.String str6 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        int int10 = dateTimeZone8.getOffsetFromLocal((long) (byte) 1);
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = new java.util.Locale("US");
        java.lang.String str15 = locale14.getVariant();
        java.util.Locale.setDefault(category12, locale14);
        java.lang.String str17 = dateTimeZone8.getShortName(0L, locale14);
        long long21 = dateTimeZone8.convertLocalToUTC(87L, false, 28425599999L);
        long long25 = dateTimeZone8.convertLocalToUTC(3260494944001380L, false, 14L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale14.toString(), "us");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 87L + "'", long21 == 87L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3260494944001380L + "'", long25 == 3260494944001380L);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.util.Locale locale1 = new java.util.Locale("+02:00");
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "+02:00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+02:00" + "'", str2, "+02:00");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getOffsetInteger();
        org.joda.time.Chronology chronology6 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology6.centuries();
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("US");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "us" + "'", str2, "us");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us" + "'", str3, "us");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getLanguage();
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale27, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(100L, chronology24, locale27);
        int int31 = dateTimeParserBucket30.getOffset();
        java.lang.Object obj32 = dateTimeParserBucket30.saveState();
        java.util.Locale locale33 = dateTimeParserBucket30.getLocale();
        java.util.Locale locale34 = dateTimeParserBucket30.getLocale();
        java.util.Locale.Builder builder35 = null; // flaky: builder22.setLocale(locale34);
        java.util.Locale.Builder builder37 = null; // flaky: builder35.removeUnicodeLocaleAttribute("4969628");
        java.util.Locale.Builder builder38 = null; // flaky: builder35.clear();
        java.util.Locale.Builder builder39 = null; // flaky: builder38.clear();
        java.util.Locale.Builder builder42 = null; // flaky: builder38.setExtension('a', "20");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder44 = null; // flaky: builder38.addUnicodeLocaleAttribute("\u82f1\u6587\u7f8e\u56fd)");
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertNotNull(builder35);
// flaky:         org.junit.Assert.assertNotNull(builder37);
// flaky:         org.junit.Assert.assertNotNull(builder38);
// flaky:         org.junit.Assert.assertNotNull(builder39);
// flaky:         org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(240);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        java.lang.String str17 = locale10.getDisplayScript(locale14);
        java.lang.String str18 = locale10.getISO3Language();
        dateTimeParserBucket7.saveField(dateTimeFieldType8, "DateTimeField[dayOfYear]", locale10);
        dateTimeParserBucket7.setPivotYear((java.lang.Integer) 2);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket7.getZone();
        int int24 = dateTimeZone22.getOffset(117L);
        java.lang.String str25 = dateTimeZone22.getID();
        int int27 = dateTimeZone22.getStandardOffset((long) 1969);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder24 = builder20.removeUnicodeLocaleAttribute("Cina");
        java.util.Locale locale26 = new java.util.Locale("CHN");
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Locale.Builder builder28 = builder20.setLocale(locale26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder30 = builder20.setLanguageTag("Italienisch");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Italienisch [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals(locale26.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "chn" + "'", str27, "chn");
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = null; // flaky: locale0.getISO3Country();
        java.lang.String str2 = null; // flaky: locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.lang.String str7 = locale0.getDisplayCountry(locale4);
        java.util.Set<java.lang.String> strSet8 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHN" + "'", str1, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder4 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setScript("+00:00:00.011");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: +00:00:00.011 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.String str8 = locale4.getScript();
        java.util.Set<java.lang.String> strSet9 = locale4.getUnicodeLocaleKeys();
        java.lang.String str10 = locale4.getDisplayCountry();
        java.util.Locale locale14 = new java.util.Locale("10 (JPN,us)", "22", "2922789");
        java.lang.String str15 = locale14.getDisplayVariant();
        java.lang.String str16 = locale14.getLanguage();
        java.lang.String str17 = locale4.getDisplayName(locale14);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale14.toString(), "10 (jpn,us)_22_2922789");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2922789" + "'", str15, "2922789");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 (jpn,us)" + "'", str16, "10 (jpn,us)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Chinese (China)" + "'", str17, "Chinese (China)");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.Object obj8 = dateTimeParserBucket7.saveState();
        dateTimeParserBucket7.setOffset((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.util.Locale locale13 = java.util.Locale.US;
        dateTimeParserBucket7.saveField(dateTimeFieldType11, "centuryOfEra", locale13);
        java.lang.String str15 = locale13.getDisplayVariant();
        java.lang.String str16 = locale13.getCountry();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "US" + "'", str16, "US");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        java.io.IOException iOException4 = new java.io.IOException("UTC");
        java.io.IOException iOException6 = new java.io.IOException("zho");
        iOException4.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException9 = new java.io.IOException("Thu", (java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.io.IOException iOException12 = new java.io.IOException("UTC");
        java.io.IOException iOException14 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray15 = iOException14.getSuppressed();
        java.io.IOException iOException17 = new java.io.IOException("dayofyear");
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException17);
        iOException14.addSuppressed((java.lang.Throwable) iOException17);
        iOException12.addSuppressed((java.lang.Throwable) iOException17);
        iOException10.addSuppressed((java.lang.Throwable) iOException12);
        java.io.IOException iOException22 = new java.io.IOException("English", (java.lang.Throwable) iOException10);
        java.io.IOException iOException23 = new java.io.IOException("-1562400000", (java.lang.Throwable) iOException10);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.io.IOException iOException1 = new java.io.IOException("weekyear");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(99, 3);
        int int4 = dateTimeZone2.getStandardOffset(1860087L);
        long long6 = dateTimeZone2.previousTransition(70000L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone2.getOffset(readableInstant7);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 356580000 + "'", int4 == 356580000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 70000L + "'", long6 == 70000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 356580000 + "'", int8 == 356580000);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("java.io.IOException: java.io.IOException: ITA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'java.io.IOException: java.io.IOException: ITA' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.removeUnicodeLocaleAttribute("35");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 35 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        java.util.Locale locale2 = new java.util.Locale("Thu", "Italia");
        java.util.Locale.setDefault(locale2);
        java.lang.String str4 = locale2.toLanguageTag();
        java.lang.String str6 = locale2.getExtension('x');
        org.junit.Assert.assertEquals(locale2.toString(), "thu_ITALIA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "thu" + "'", str4, "thu");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        java.io.IOException iOException1 = new java.io.IOException("hi! (ISOCHRONOLOGY[UTC])");
        java.io.IOException iOException3 = new java.io.IOException("ISOChronology[UTC]");
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException7 = new java.io.IOException("CHN");
        java.io.IOException iOException11 = new java.io.IOException("UTC");
        java.io.IOException iOException13 = new java.io.IOException("zho");
        iOException11.addSuppressed((java.lang.Throwable) iOException13);
        java.io.IOException iOException15 = new java.io.IOException("2", (java.lang.Throwable) iOException11);
        java.io.IOException iOException16 = new java.io.IOException("java.io.IOException: zho", (java.lang.Throwable) iOException11);
        iOException7.addSuppressed((java.lang.Throwable) iOException16);
        iOException1.addSuppressed((java.lang.Throwable) iOException16);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 53);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Korean", (double) (-7464959992799992L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-7.464959992799992E15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = null; // flaky: locale3.getISO3Country();
        java.lang.String str5 = locale3.getISO3Language();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 100);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = null; // flaky: locale14.getISO3Country();
        java.lang.String str16 = locale14.getISO3Language();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale14.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = null; // flaky: locale19.getISO3Country();
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale3, locale8, locale11, locale14, locale19, locale21 };
        java.util.ArrayList<java.util.Locale> localeList23 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList23, localeArray22);
        java.util.Locale locale25 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList23);
        java.lang.String[] strArray29 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = null; // flaky: locale36.getISO3Country();
        java.lang.String str38 = locale36.getISO3Language();
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale36.getDisplayVariant(locale39);
        java.util.Locale locale41 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = null; // flaky: locale47.getISO3Country();
        java.lang.String str49 = locale47.getISO3Language();
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale47.getDisplayVariant(locale50);
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = null; // flaky: locale52.getISO3Country();
        java.util.Locale locale54 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale36, locale41, locale44, locale47, locale52, locale54 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.Locale locale58 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Locale locale63 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleKeys();
        java.lang.String str65 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.lang.String>) strSet64);
        java.lang.String str66 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap69);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap71 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList72 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap71);
        java.util.Locale locale73 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet74 = locale73.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList75 = java.util.Locale.filterTags(languageRangeList72, (java.util.Collection<java.lang.String>) strSet74);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zho" + "'", str38, "zho");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "zh");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "zh");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "zho" + "'", str49, "zho");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertNotNull(languageRangeList72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(strList75);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone9.getOffset(readableInstant12);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 3599999L);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        int int19 = dateTimeZone17.getStandardOffset((long) (byte) -1);
        java.lang.String str20 = dateTimeZone17.toString();
        java.lang.String str22 = dateTimeZone17.getShortName((long) '#');
        long long24 = dateTimeZone9.getMillisKeepLocal(dateTimeZone17, 35L);
        long long26 = dateTimeZone9.convertUTCToLocal(31449600097L);
        java.util.Locale locale31 = new java.util.Locale("thu", "italiano", "DateTimeField[secondOfDay]");
        java.lang.String str32 = dateTimeZone9.getName(360000097L, locale31);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3599999L + "'", long15 == 3599999L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3600000 + "'", int19 == 3600000);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:00" + "'", str20, "+01:00");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+01:00" + "'", str22, "+01:00");
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3599965L) + "'", long24 == (-3599965L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 31449600097L + "'", long26 == 31449600097L);
        org.junit.Assert.assertEquals(locale31.toString(), "thu_ITALIANO_DateTimeField[secondOfDay]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u30c9\u30a4\u30c4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("gennaio");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: gennaio");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        long long13 = dateTimeZone10.adjustOffset(3974400001L, false);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3974400001L + "'", long13 == 3974400001L);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long6 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        java.lang.String str7 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(53, 53);
        long long13 = dateTimeZone11.previousTransition((-259200000L));
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone11.getOffset(readableInstant14);
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) 86399);
        java.util.TimeZone timeZone18 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-259200000L) + "'", long13 == (-259200000L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 193980000 + "'", int15 == 193980000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-193893601L) + "'", long17 == (-193893601L));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone9.getOffset(readableInstant12);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 3599999L);
        long long17 = dateTimeZone9.convertUTCToLocal((long) (byte) 100);
        long long19 = dateTimeZone9.nextTransition((-62104024800001L));
        java.lang.String str20 = dateTimeZone9.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3599999L + "'", long15 == 3599999L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-62104024800001L) + "'", long19 == (-62104024800001L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long6 = dateTimeZone1.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.util.Locale locale12 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str13 = dateTimeZone1.getName((long) 'a', locale12);
        long long16 = dateTimeZone1.convertLocalToUTC(2937600087L, false);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        int int20 = dateTimeZone1.getOffsetFromLocal((long) (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals(locale12.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2937600087L + "'", long16 == 2937600087L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        boolean boolean4 = dateTimeZone1.isStandardOffset((long) (byte) 100);
        long long7 = dateTimeZone1.convertLocalToUTC(179566L, true);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale12 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology10, locale12, (java.lang.Integer) 1, 0);
        java.util.Locale locale16 = java.util.Locale.ENGLISH;
        java.lang.String str17 = locale12.getDisplayName(locale16);
        java.util.Locale locale21 = new java.util.Locale("ko-KR", "32", "");
        java.lang.String str22 = locale16.getDisplayLanguage(locale21);
        java.lang.String str23 = locale16.getDisplayName();
        java.lang.String str24 = dateTimeZone1.getName(124416000000000L, locale16);
        java.lang.String str26 = locale16.getUnicodeLocaleType("40");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 179556L + "'", long7 == 179556L);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals(locale21.toString(), "ko-kr_32");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "English" + "'", str22, "English");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u82f1\u6587" + "'", str23, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.010" + "'", str24, "+00:00:00.010");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekyearOfCentury();
        java.lang.String str15 = dateTimeField13.getAsShortText((long) 'u');
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale19 = new java.util.Locale("\u610f\u5927\u5229\u6587");
        java.lang.String str20 = dateTimeField13.getAsShortText(readablePartial16, 23, locale19);
        java.util.Set<java.lang.String> strSet21 = locale19.getUnicodeLocaleAttributes();
        java.lang.String str22 = locale19.toString();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "70" + "'", str15, "70");
        org.junit.Assert.assertEquals(locale19.toString(), "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "23" + "'", str20, "23");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str22, "\u610f\u5927\u5229\u6587");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        dateTimeParserBucket6.setOffset((int) (short) 100);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.centuryOfEra();
        long long13 = dateTimeField11.remainder((-30L));
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-30L) + "'", long13 == (-30L));
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long4 = dateTimeZone1.adjustOffset(60480000010L, true);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        java.lang.String str8 = dateTimeZone1.getName((long) '4');
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone1.getOffset(readableInstant9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long13 = dateTimeZone1.convertUTCToLocal(0L);
        int int15 = dateTimeZone1.getOffset((-25486L));
        long long17 = dateTimeZone1.convertUTCToLocal((long) 34);
        long long20 = dateTimeZone1.adjustOffset(28800035L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 60480000010L + "'", long4 == 60480000010L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7200000 + "'", int6 == 7200000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+02:00" + "'", str8, "+02:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7200000 + "'", int10 == 7200000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 7200000L + "'", long13 == 7200000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7200000 + "'", int15 == 7200000);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 7200034L + "'", long17 == 7200034L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 28800035L + "'", long20 == 28800035L);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long7 = dateTimeZone1.nextTransition(27654880117L);
        long long10 = dateTimeZone1.convertLocalToUTC(28126798503L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3600000 + "'", int4 == 3600000);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 27654880117L + "'", long7 == 27654880117L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 28123198503L + "'", long10 == 28123198503L);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setRegion("");
        java.util.Locale.Builder builder13 = builder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder10.setScript("1380");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 1380 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 97L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str7 = dateTimeZone1.getShortName(3600000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        java.util.Locale locale1 = new java.util.Locale("java.io.IOException: ISOChronology[UTC]");
        org.junit.Assert.assertEquals(locale1.toString(), "java.io.ioexception: isochronology[utc]");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("java.io.IOException: java.io.IOException: Thu");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception:java.io.ioexception:thu");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("826");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=826");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        java.io.IOException iOException2 = new java.io.IOException("utc");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException("\u6708\u66dc\u65e5", (java.lang.Throwable) iOException3);
        java.lang.String str5 = iOException4.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6708\u66dc\u65e5" + "'", str5, "\u6708\u66dc\u65e5");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str4 = locale2.getDisplayLanguage(locale3);
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleKeys();
        java.lang.String str6 = locale2.getCountry();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getName(259200107L);
        long long16 = dateTimeZone10.convertLocalToUTC(70000L, false, 259200100L);
        boolean boolean18 = dateTimeZone10.isStandardOffset(6652800031L);
        int int20 = dateTimeZone10.getOffset(6040800035L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "ja");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
// flaky:         org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 70000L + "'", long16 == 70000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (short) 0);
        int int4 = dateTimeZone2.getOffset((long) 7);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3600000 + "'", int4 == 3600000);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        java.io.IOException iOException1 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException("UTC", throwable4);
        java.io.IOException iOException6 = new java.io.IOException(throwable4);
        iOException1.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException10 = new java.io.IOException("");
        java.io.IOException iOException11 = new java.io.IOException("USA", (java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException14 = new java.io.IOException("java.io.IOException");
        iOException12.addSuppressed((java.lang.Throwable) iOException14);
        iOException6.addSuppressed((java.lang.Throwable) iOException14);
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = null; // flaky: locale0.getISO3Country();
        java.lang.String str2 = locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        java.util.Set<java.lang.String> strSet4 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setExtension('a', "");
        java.util.Locale.Builder builder11 = builder6.setLanguage("ita");
        java.util.Locale locale12 = builder11.build();
        java.lang.String str13 = locale0.getDisplayScript(locale12);
        java.lang.String str14 = locale12.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        java.util.Locale locale2 = new java.util.Locale("\u97e9\u56fd", "8");
        org.junit.Assert.assertEquals(locale2.toString(), "\u97e9\u56fd_8");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("7199", throwable1);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("UTC");
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Germania");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("1970");
        java.lang.String str11 = locale8.getDisplayScript(locale10);
        java.lang.String str12 = locale8.getVariant();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "utc");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(212400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder1.setUnicodeLocaleKeyword("52", "6");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: 6 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = builder7.build();
        java.util.Locale locale11 = new java.util.Locale("December");
        java.util.Locale.Builder builder12 = builder7.setLocale(locale11);
        java.util.Locale.Builder builder14 = builder12.setRegion("CN");
        java.util.Locale.Builder builder15 = builder14.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals(locale11.toString(), "december");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        java.io.IOException iOException1 = new java.io.IOException("dayofyear");
        java.io.IOException iOException2 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException5 = new java.io.IOException("utc");
        java.io.IOException iOException6 = new java.io.IOException((java.lang.Throwable) iOException5);
        java.io.IOException iOException8 = new java.io.IOException("jpn");
        java.io.IOException iOException11 = new java.io.IOException("UTC");
        java.io.IOException iOException13 = new java.io.IOException("zho");
        iOException11.addSuppressed((java.lang.Throwable) iOException13);
        java.io.IOException iOException15 = new java.io.IOException("2", (java.lang.Throwable) iOException11);
        iOException8.addSuppressed((java.lang.Throwable) iOException15);
        java.lang.Throwable[] throwableArray17 = iOException8.getSuppressed();
        iOException5.addSuppressed((java.lang.Throwable) iOException8);
        iOException1.addSuppressed((java.lang.Throwable) iOException5);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        java.util.Locale locale2 = new java.util.Locale("fr,FR", "+00:00:00.032");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for +00:00:00.032");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "fr,fr_+00:00:00.032");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(100L, chronology3, locale6);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeParserBucket9);
        long long12 = dateTimeZone1.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        java.util.Locale locale2 = new java.util.Locale("java.io.IOException: zho", "year");
        boolean boolean3 = locale2.hasExtensions();
        org.junit.Assert.assertEquals(locale2.toString(), "java.io.ioexception: zho_YEAR");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale6 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean7 = locale6.hasExtensions();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 100);
        java.lang.String str13 = locale6.getDisplayCountry(locale10);
        java.lang.String str14 = dateTimeZone1.getShortName((long) (short) 1, locale10);
        java.lang.String str15 = dateTimeZone1.getID();
        int int17 = dateTimeZone1.getStandardOffset(60480000010L);
        long long21 = dateTimeZone1.convertLocalToUTC(0L, false, 61084800010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals(locale6.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder10 = builder1.setLanguage("it");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setRegion("java.io.ioexception: weekyear");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: java.io.ioexception: weekyear [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder18 = builder17.clear();
        java.util.Locale.Builder builder21 = builder18.setExtension('x', "24");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder21.setUnicodeLocaleKeyword("java.io.IOException: java.io.IOException: germany", "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: java.io.IOException: java.io.IOException: germany [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        java.util.Locale locale1 = new java.util.Locale("\u610f\u5927\u5229\u6587");
        java.lang.String str2 = locale1.getVariant();
        java.lang.Object obj3 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "\u610f\u5927\u5229\u6587");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(4492738, (-525593976));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -525593976");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone13.getOffset(readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone13.getOffset(readableInstant16);
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology20, locale21, (java.lang.Integer) 100);
        java.lang.String str24 = dateTimeZone13.getShortName(10L, locale21);
        long long26 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, 11L);
        java.lang.String str27 = dateTimeZone11.toString();
        java.lang.String str29 = dateTimeZone11.getNameKey(60897000000L);
        long long31 = dateTimeZone11.previousTransition((long) (short) 1);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 11L + "'", long26 == 11L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setRegion("CN");
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("ko-kr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setLanguageTag("1969");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 1969 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long5 = dateTimeZone1.adjustOffset(604801053L, true);
        java.lang.String str6 = dateTimeZone1.getID();
        long long9 = dateTimeZone1.adjustOffset(54L, false);
        int int11 = dateTimeZone1.getOffset(18745200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 604801053L + "'", long5 == 604801053L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 54L + "'", long9 == 54L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology4, locale5, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(100L, chronology2, locale5);
        int int9 = dateTimeParserBucket8.getOffset();
        java.lang.Object obj10 = dateTimeParserBucket8.saveState();
        java.util.Locale locale11 = dateTimeParserBucket8.getLocale();
        java.lang.Integer int12 = dateTimeParserBucket8.getOffsetInteger();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyearOfCentury();
        java.util.Locale locale18 = new java.util.Locale("X-LVARIANT-0", "UTC", "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        java.lang.String str19 = locale18.getDisplayVariant();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(3124137600000L, chronology13, locale18, (java.lang.Integer) 193980000, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField23 = chronology13.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str19, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(100L, chronology5, locale8);
        java.lang.String str12 = locale8.getDisplayScript();
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str15 = locale8.getExtension('u');
        java.util.Locale locale19 = new java.util.Locale("2", "Chinese", "clockhourOfHalfday");
        java.lang.String str20 = locale8.getDisplayCountry(locale19);
        java.lang.String str22 = locale19.getUnicodeLocaleType("en");
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale23.toLanguageTag();
        java.lang.String str25 = locale23.getDisplayCountry();
        java.lang.String str26 = locale23.getDisplayScript();
        java.lang.String str27 = locale23.getDisplayVariant();
        java.lang.String str28 = locale19.getDisplayVariant(locale23);
        java.lang.String str29 = locale23.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5fb7\u56fd" + "'", str2, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals(locale19.toString(), "2_CHINESE_clockhourOfHalfday");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ko-KR" + "'", str24, "ko-KR");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u97e9\u56fd" + "'", str25, "\u97e9\u56fd");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "clockhourOfHalfday" + "'", str28, "clockhourOfHalfday");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        java.io.IOException iOException2 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.lang.Throwable throwable5 = null;
        java.io.IOException iOException6 = new java.io.IOException("UTC", throwable5);
        java.io.IOException iOException7 = new java.io.IOException(throwable5);
        iOException2.addSuppressed((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException("UTC", (java.lang.Throwable) iOException7);
        java.io.IOException iOException11 = new java.io.IOException();
        java.io.IOException iOException12 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException11);
        iOException7.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray14 = iOException7.getSuppressed();
        java.io.IOException iOException17 = new java.io.IOException("CN");
        java.io.IOException iOException18 = new java.io.IOException("72000", (java.lang.Throwable) iOException17);
        iOException7.addSuppressed((java.lang.Throwable) iOException17);
        java.lang.Throwable[] throwableArray20 = iOException17.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\uc11c\uae30");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("12");
        java.util.Locale.setDefault(category0, locale7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category0);
        java.lang.String str10 = locale9.getDisplayLanguage();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u5fb7\u56fd" + "'", str2, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.nextTransition((-1L));
        boolean boolean6 = dateTimeZone1.isStandardOffset((long) (-1));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        long long11 = dateTimeZone1.adjustOffset((-292275054L), false);
        java.lang.String str13 = dateTimeZone1.getNameKey((long) 47);
        long long15 = dateTimeZone1.convertUTCToLocal(7343999999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-292275054L) + "'", long11 == (-292275054L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 7343999999L + "'", long15 == 7343999999L);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = null; // flaky: locale0.getISO3Country();
        java.lang.String str2 = locale0.getISO3Language();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale0.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale5.getDisplayName();
        java.lang.String str7 = locale5.getISO3Language();
        java.lang.String str8 = locale3.getDisplayScript(locale5);
        java.lang.String str9 = locale3.getDisplayName();
        java.lang.String str10 = locale3.getVariant();
        java.lang.String str11 = locale3.getLanguage();
        java.lang.String str12 = null; // flaky: locale3.getISO3Country();
        java.lang.String str13 = locale3.getLanguage();
        boolean boolean14 = locale3.hasExtensions();
        java.lang.String str15 = locale3.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str6, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ita" + "'", str7, "ita");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587" + "'", str9, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh" + "'", str11, "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        java.io.IOException iOException1 = new java.io.IOException("DateTimeField[hourOfDay]");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        java.io.IOException iOException9 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray10 = iOException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = iOException9.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException("DateTimeField[millisOfDay]", (java.lang.Throwable) iOException9);
        java.io.IOException iOException13 = new java.io.IOException("Japanese", (java.lang.Throwable) iOException9);
        java.io.IOException iOException15 = new java.io.IOException("dayofyear");
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException15);
        iOException13.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException19 = new java.io.IOException("Italy");
        java.lang.Throwable[] throwableArray20 = iOException19.getSuppressed();
        iOException13.addSuppressed((java.lang.Throwable) iOException19);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.lang.Throwable[] throwableArray23 = iOException22.getSuppressed();
        boolean boolean24 = languageRange1.equals((java.lang.Object) iOException22);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "germany" + "'", str4, "germany");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        java.util.Locale locale3 = new java.util.Locale("360660000", "", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)");
        java.lang.String str4 = locale3.getDisplayLanguage();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "360660000" + "'", str4, "360660000");
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale5 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean6 = locale5.hasExtensions();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology8, locale9, (java.lang.Integer) 100);
        java.lang.String str12 = locale5.getDisplayCountry(locale9);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale13.getDisplayScript();
        java.lang.String str16 = locale5.getDisplayCountry(locale13);
        java.lang.String str17 = locale13.getScript();
        java.lang.String str19 = locale13.getExtension('u');
        java.lang.String str20 = locale13.getISO3Country();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(51408000100L, chronology1, locale13, (java.lang.Integer) 18000000, 31);
        java.lang.Integer int24 = dateTimeParserBucket23.getOffsetInteger();
        int int25 = dateTimeParserBucket23.getOffset();
        org.junit.Assert.assertEquals(locale5.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("US");
        java.lang.String str3 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology7, locale8, (java.lang.Integer) (-1), 0);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getScript();
        java.lang.String str14 = locale12.getScript();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) locale12);
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale17 = java.util.Locale.getDefault(category0);
        java.util.Locale locale18 = java.util.Locale.getDefault(category0);
        java.util.Locale locale20 = new java.util.Locale("\u5fb7\u56fd");
        java.util.Locale.setDefault(category0, locale20);
        java.util.Locale locale22 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "us");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "us");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale20.toString(), "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "\u5fb7\u56fd");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 14);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology6, locale7, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket(100L, chronology4, locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 100);
        java.lang.String str20 = locale13.getDisplayScript(locale17);
        java.lang.String str21 = locale13.getISO3Language();
        dateTimeParserBucket10.saveField(dateTimeFieldType11, "DateTimeField[dayOfYear]", locale13);
        dateTimeParserBucket10.setPivotYear((java.lang.Integer) 2);
        dateTimeParserBucket10.setPivotYear((java.lang.Integer) 53);
        dateTimeParserBucket10.setPivotYear((java.lang.Integer) 366);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology32, locale33, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(100L, chronology30, locale33);
        org.joda.time.Chronology chronology37 = dateTimeParserBucket36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology37.getZone();
        dateTimeParserBucket10.setZone(dateTimeZone40);
        long long43 = dateTimeZone2.getMillisKeepLocal(dateTimeZone40, 313200000L);
        int int45 = dateTimeZone2.getOffsetFromLocal(54874799L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zho" + "'", str21, "zho");
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh");
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 308760000L + "'", long43 == 308760000L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-4440000) + "'", int45 == (-4440000));
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        double double7 = languageRange1.getWeight();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "germany" + "'", str4, "germany");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(168);
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = builder4.build();
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = new java.util.Locale("US");
        java.lang.String str9 = locale8.getVariant();
        java.util.Locale.setDefault(category6, locale8);
        java.util.Locale locale11 = java.util.Locale.getDefault(category6);
        java.util.Locale locale12 = java.util.Locale.getDefault(category6);
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale12.getCountry();
        java.lang.String str15 = locale5.getDisplayVariant(locale12);
        java.lang.String str16 = locale5.getISO3Country();
        java.lang.String str17 = locale5.getDisplayVariant();
        java.lang.String str18 = dateTimeZone1.getShortName(609219L, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale8.toString(), "us");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "us");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "us");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+168:00" + "'", str18, "+168:00");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fr-FR");
        java.lang.String str3 = locale1.getExtension('x');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale1.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        java.util.Locale locale1 = new java.util.Locale("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        org.junit.Assert.assertEquals(locale1.toString(), "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = null; // flaky: locale3.getISO3Country();
        java.lang.String str5 = locale3.getISO3Language();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 100);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = null; // flaky: locale14.getISO3Country();
        java.lang.String str16 = locale14.getISO3Language();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale14.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = null; // flaky: locale19.getISO3Country();
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale3, locale8, locale11, locale14, locale19, locale21 };
        java.util.ArrayList<java.util.Locale> localeList23 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList23, localeArray22);
        java.util.Locale locale25 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList23);
        java.lang.String[] strArray29 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = null; // flaky: locale36.getISO3Country();
        java.lang.String str38 = locale36.getISO3Language();
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale36.getDisplayVariant(locale39);
        java.util.Locale locale41 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = null; // flaky: locale47.getISO3Country();
        java.lang.String str49 = locale47.getISO3Language();
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale47.getDisplayVariant(locale50);
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = null; // flaky: locale52.getISO3Country();
        java.util.Locale locale54 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale36, locale41, locale44, locale47, locale52, locale54 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.Locale locale58 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Locale locale63 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleKeys();
        java.lang.String str65 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.lang.String>) strSet64);
        java.lang.String str66 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap67);
        java.util.Collection<java.lang.String> strCollection69 = null;
        java.lang.String str70 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection69);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zho" + "'", str38, "zho");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "zh");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "zh");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "zho" + "'", str49, "zho");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        java.util.Locale locale3 = new java.util.Locale("KOR", "IT", "-434:00");
        org.junit.Assert.assertEquals(locale3.toString(), "kor_IT_-434:00");
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("UTC");
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = null; // flaky: locale3.getISO3Country();
        java.lang.String str5 = locale3.getISO3Language();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.lang.String str9 = locale8.getDisplayName();
        java.lang.String str10 = locale8.getISO3Language();
        java.lang.String str11 = locale6.getDisplayScript(locale8);
        java.lang.String str12 = locale6.getDisplayName();
        java.lang.String str13 = locale6.getVariant();
        java.lang.String str14 = locale6.getLanguage();
        java.util.Locale.Builder builder15 = null; // flaky: builder0.setLocale(locale6);
        java.util.Locale.Builder builder17 = null; // flaky: builder15.addUnicodeLocaleAttribute("Korean");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = null; // flaky: builder15.removeUnicodeLocaleAttribute("java.io.IOException: java.io.IOException: germany");
// flaky:             org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: java.io.IOException: java.io.IOException: germany [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str9, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ita" + "'", str10, "ita");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh" + "'", str14, "zh");
// flaky:         org.junit.Assert.assertNotNull(builder15);
// flaky:         org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("January");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        java.util.Locale locale3 = new java.util.Locale("datetimefield[yearofcentury] (SECONDOFMINUTE,italiano)", "8", "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.GERMAN;
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale10 = new java.util.Locale("java.io.IOException: weekyear", "\u65e5\u672c\u8a9e");
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = builder13.build();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale18 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology16, locale18, (java.lang.Integer) 1, 0);
        java.lang.String str22 = locale14.getDisplayVariant(locale18);
        java.util.Set<java.lang.Character> charSet23 = locale18.getExtensionKeys();
        java.util.Locale locale24 = locale18.stripExtensions();
        java.lang.String str25 = locale10.getDisplayName(locale24);
        java.util.Locale.setDefault(category0, locale10);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germany" + "'", str2, "Germany");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
        org.junit.Assert.assertNotNull(locale5);
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "\u65e5\u672c\u8a9e");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u65e5\u672c\u8a9e)" + "'", str25, "\u65e5\u672c\u8a9e)");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 100);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        boolean boolean7 = dateTimeZone1.isFixed();
        int int9 = dateTimeZone1.getOffsetFromLocal((long) '4');
        java.lang.String str10 = dateTimeZone1.getID();
        int int12 = dateTimeZone1.getStandardOffset(0L);
        java.lang.String str13 = dateTimeZone1.getID();
        int int15 = dateTimeZone1.getOffset(6048863930090L);
        java.lang.String str16 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC(0L, false, (long) (short) 100);
        int int11 = dateTimeZone1.getOffsetFromLocal(0L);
        java.lang.String str13 = dateTimeZone1.getNameKey(18748800052L);
        java.lang.String str14 = dateTimeZone1.getID();
        java.lang.String str16 = dateTimeZone1.getShortName((long) (byte) 10);
        long long18 = dateTimeZone1.convertUTCToLocal((long) '#');
        java.lang.String str20 = dateTimeZone1.getShortName((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder18 = builder17.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder17.setScript("italian");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: italian [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) (byte) -1);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Koordinierte Universalzeit");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setLanguage("Italy");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setExtension('#', "24");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("java.io.IOException: Japanese", (double) 1861920000031L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.861920000031E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("datetimefield[yearofcentury] (SECONDOFMINUTE,italiano)", (double) 471600048L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=4.71600048E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("cinese");
        java.util.Locale.Builder builder12 = builder9.clear();
        java.util.Locale locale13 = builder12.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder12.setExtension('#', "+100:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(7343661);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str3 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+02:02:23.661" + "'", str3, "+02:02:23.661");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder5 = builder1.setUnicodeLocaleKeyword("48", "English");
        java.util.Locale locale6 = java.util.Locale.ITALY;
        java.lang.String str7 = locale6.getScript();
        java.util.Set<java.lang.String> strSet8 = locale6.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale6);
        java.util.Locale.Builder builder10 = builder5.setLocale(locale6);
        boolean boolean12 = locale6.equals((java.lang.Object) 345598998L);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder8.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder8.setExtension('x', "S\374dkorea");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: Su?dkorea [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial11 = null;
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        java.lang.String str17 = dateTimeField10.getAsText(readablePartial11, (-434), locale14);
        java.lang.String str18 = locale14.toString();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-434" + "'", str17, "-434");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "it" + "'", str18, "it");
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder9.setRegion("97");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 97 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setVariant("DEUTSCH");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder4.setLanguage("+11:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: +11:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 100);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        boolean boolean7 = dateTimeZone1.isFixed();
        long long10 = dateTimeZone1.adjustOffset(6048000035L, false);
        int int12 = dateTimeZone1.getOffsetFromLocal(102819600000L);
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = locale14.getDisplayName();
        java.lang.String str16 = dateTimeZone1.getName(0L, locale14);
        java.lang.String str17 = locale14.getCountry();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 6048000035L + "'", long10 == 6048000035L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)" + "'", str15, "\u4e2d\u56fd\u8a9e\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CN" + "'", str17, "CN");
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("deutsch");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.lang.String str7 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strSet6);
        java.util.Locale locale8 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strSet9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, strMap11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale locale16 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet17);
        java.util.Locale locale19 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strSet20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale25.getISO3Country();
        java.lang.String str27 = locale25.getISO3Language();
        java.util.Locale locale28 = java.util.Locale.getDefault();
        java.lang.String str29 = locale25.getDisplayVariant(locale28);
        java.util.Locale locale30 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology32, locale33, (java.lang.Integer) 100);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale36.getISO3Country();
        java.lang.String str38 = locale36.getISO3Language();
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale36.getDisplayVariant(locale39);
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.lang.String str42 = locale41.getISO3Country();
        java.util.Locale locale43 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale25, locale30, locale33, locale36, locale41, locale43 };
        java.util.ArrayList<java.util.Locale> localeList45 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList45, localeArray44);
        java.util.Locale locale47 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList45);
        java.lang.String[] strArray51 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        java.lang.String str54 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList52);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.lang.String str59 = locale58.getISO3Country();
        java.lang.String str60 = locale58.getISO3Language();
        java.util.Locale locale61 = java.util.Locale.getDefault();
        java.lang.String str62 = locale58.getDisplayVariant(locale61);
        java.util.Locale locale63 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale66 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology65, locale66, (java.lang.Integer) 100);
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale69.getISO3Country();
        java.lang.String str71 = locale69.getISO3Language();
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.lang.String str73 = locale69.getDisplayVariant(locale72);
        java.util.Locale locale74 = java.util.Locale.getDefault();
        java.lang.String str75 = locale74.getISO3Country();
        java.util.Locale locale76 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray77 = new java.util.Locale[] { locale58, locale63, locale66, locale69, locale74, locale76 };
        java.util.ArrayList<java.util.Locale> localeList78 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList78, localeArray77);
        java.util.Locale locale80 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter(languageRangeList12, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.Locale locale84 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList83);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "jpn" + "'", str27, "jpn");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "ja");
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "ja");
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "jpn" + "'", str38, "jpn");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(locale47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "jpn" + "'", str60, "jpn");
        org.junit.Assert.assertNotNull(locale61);
// flaky:         org.junit.Assert.assertEquals(locale61.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
// flaky:         org.junit.Assert.assertEquals(locale63.toString(), "ja");
        org.junit.Assert.assertNotNull(locale66);
// flaky:         org.junit.Assert.assertEquals(locale66.toString(), "ja");
        org.junit.Assert.assertNotNull(locale69);
// flaky:         org.junit.Assert.assertEquals(locale69.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "jpn" + "'", str71, "jpn");
        org.junit.Assert.assertNotNull(locale72);
// flaky:         org.junit.Assert.assertEquals(locale72.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(locale74);
// flaky:         org.junit.Assert.assertEquals(locale74.toString(), "ja");
// flaky:         org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(locale80);
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertNotNull(localeList82);
        org.junit.Assert.assertNotNull(localeList83);
        org.junit.Assert.assertNull(locale84);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.nextTransition((-1L));
        boolean boolean6 = dateTimeZone1.isStandardOffset((long) (-1));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str12 = dateTimeZone1.getID();
        java.lang.String str14 = dateTimeZone1.getNameKey((long) 47);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.setUnicodeLocaleKeyword("49", "");
        java.util.Locale locale9 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setScript("java.io.IOException: 117");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: java.io.IOException: 117 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("DATETIMEFIELD[CLOCKHOUROFHALFDAY]", (double) 842400001L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=8.42400001E8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("JPN");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setExtension('a', "");
        java.util.Locale.Builder builder11 = builder6.setLanguage("ita");
        java.util.Locale.Builder builder12 = builder6.clearExtensions();
        java.util.Locale.Builder builder14 = builder6.setRegion("ko");
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale.Builder builder18 = builder14.setExtension('x', "French");
        java.util.Locale.Builder builder21 = builder14.setExtension('u', "Cina");
        boolean boolean22 = languageRange1.equals((java.lang.Object) "Cina");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jpn" + "'", str4, "jpn");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.clear();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder11.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder12.setExtension('x', "\u7d00\u5143\u524d");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\uc911\uad6d\uc5b4", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????????");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder18 = builder17.clear();
        java.util.Locale.Builder builder21 = builder18.setExtension('x', "24");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder18.setRegion("Chinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Chinese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        boolean boolean3 = dateTimeZone0.isStandardOffset((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        long long10 = dateTimeZone5.convertLocalToUTC((long) 1, true);
        java.lang.String str11 = dateTimeZone5.toString();
        long long14 = dateTimeZone5.convertLocalToUTC(2L, false);
        long long16 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 'u');
        java.lang.Object obj17 = null;
        boolean boolean18 = dateTimeZone5.equals(obj17);
        long long20 = dateTimeZone5.previousTransition(60000L);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone5.isLocalDateTimeGap(localDateTime21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone5.getOffset(readableInstant23);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 117L + "'", long16 == 117L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60000L + "'", long20 == 60000L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale1.getDisplayName();
        java.lang.String str3 = locale1.toLanguageTag();
        java.util.Set<java.lang.Character> charSet4 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30a4\u30bf\u30ea\u30a2\u8a9e" + "'", str2, "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(100L, chronology5, locale8);
        java.lang.String str12 = locale8.getDisplayScript();
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str15 = locale8.getExtension('u');
        java.lang.String str16 = locale8.getVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u30c9\u30a4\u30c4" + "'", str2, "\u30c9\u30a4\u30c4");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u56fd");
        java.lang.String str2 = locale1.getISO3Language();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("halfdayOfDay");
        java.lang.String str5 = locale1.getDisplayLanguage(locale4);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        java.util.Locale locale1 = new java.util.Locale("19");
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "19");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getStandardOffset((long) (byte) -1);
        long long5 = dateTimeZone1.previousTransition(1L);
        int int7 = dateTimeZone1.getOffset(259200100L);
        long long10 = dateTimeZone1.convertLocalToUTC(345599990L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 345599990L + "'", long10 == 345599990L);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("inglese");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        int int3 = dateTimeZone0.getOffsetFromLocal(60480000010L);
        long long7 = dateTimeZone0.convertLocalToUTC(18748800052L, false, 259200087L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str10 = dateTimeZone9.getID();
        long long12 = dateTimeZone9.previousTransition((long) 'a');
        boolean boolean13 = dateTimeZone9.isFixed();
        long long17 = dateTimeZone9.convertLocalToUTC(0L, false, (long) (short) 100);
        long long19 = dateTimeZone0.getMillisKeepLocal(dateTimeZone9, (long) 5207);
        long long22 = dateTimeZone0.adjustOffset(608400000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 18748800052L + "'", long7 == 18748800052L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5207L + "'", long19 == 5207L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 608400000L + "'", long22 == 608400000L);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        java.util.Locale locale3 = new java.util.Locale("ko-KR", "\u30c9\u30a4\u30c4", "0");
        java.lang.String str4 = locale3.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for ????");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u30c9\u30a4\u30c4_0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-lvariant-0" + "'", str4, "x-lvariant-0");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setUnicodeLocaleKeyword("\u610f\u5927\u5229", "DateTimeField[halfdayOfDay]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("gennaio");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        java.io.IOException iOException3 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        java.lang.Throwable throwable6 = null;
        java.io.IOException iOException7 = new java.io.IOException("UTC", throwable6);
        java.io.IOException iOException8 = new java.io.IOException(throwable6);
        iOException3.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("UTC", (java.lang.Throwable) iOException8);
        java.io.IOException iOException12 = new java.io.IOException();
        java.io.IOException iOException13 = new java.io.IOException("\u5fb7\u56fd", (java.lang.Throwable) iOException12);
        iOException8.addSuppressed((java.lang.Throwable) iOException12);
        java.lang.Throwable throwable18 = null;
        java.io.IOException iOException19 = new java.io.IOException("UTC", throwable18);
        java.io.IOException iOException20 = new java.io.IOException(throwable18);
        java.io.IOException iOException21 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException20);
        java.lang.Throwable[] throwableArray22 = iOException21.getSuppressed();
        java.io.IOException iOException23 = new java.io.IOException("cinese", (java.lang.Throwable) iOException21);
        iOException12.addSuppressed((java.lang.Throwable) iOException21);
        java.io.IOException iOException25 = new java.io.IOException("Deutschland", (java.lang.Throwable) iOException21);
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) iOException25);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder5 = builder1.setLanguageTag("Chine");
        java.util.Locale.Builder builder7 = builder1.setVariant("Chine");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.setUnicodeLocaleKeyword("java.io.ioexception: zho", "China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: java.io.ioexception: zho [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-6105720), (-6105720));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -6105720");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder9 = builder8.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        java.io.IOException iOException1 = new java.io.IOException("dayOfYear");
        java.io.IOException iOException3 = new java.io.IOException("jpn");
        java.io.IOException iOException6 = new java.io.IOException("UTC");
        java.io.IOException iOException8 = new java.io.IOException("zho");
        iOException6.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException10 = new java.io.IOException("2", (java.lang.Throwable) iOException6);
        iOException3.addSuppressed((java.lang.Throwable) iOException10);
        java.lang.Throwable[] throwableArray12 = iOException10.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray16 = iOException15.getSuppressed();
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException15);
        java.io.IOException iOException18 = new java.io.IOException("ITA", (java.lang.Throwable) iOException15);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) iOException18);
        iOException10.addSuppressed((java.lang.Throwable) iOException18);
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException10);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException21);
        iOException1.addSuppressed((java.lang.Throwable) iOException22);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        java.lang.String str2 = dateTimeFieldType0.getName();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType0.getDurationType();
        java.lang.String str4 = dateTimeFieldType0.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "era" + "'", str2, "era");
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "era" + "'", str4, "era");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "centuryOfEra" + "'", str1, "centuryOfEra");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket7.getZone();
        long long14 = dateTimeZone11.convertLocalToUTC(3149193600100L, true);
        long long16 = dateTimeZone11.nextTransition(0L);
        long long19 = dateTimeZone11.adjustOffset((long) '#', false);
        long long21 = dateTimeZone11.convertUTCToLocal(1638872037055564460L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3149193600100L + "'", long14 == 3149193600100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1638872037055564460L + "'", long21 == 1638872037055564460L);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str5 = dateTimeZone1.toString();
        long long7 = dateTimeZone1.nextTransition(211450278993L);
        boolean boolean9 = dateTimeZone1.isStandardOffset(18489599990L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-32L) + "'", long4 == (-32L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.032" + "'", str5, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 211450278993L + "'", long7 == 211450278993L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        java.util.Locale locale2 = new java.util.Locale("2073600695", "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u30d5\u30e9\u30f3\u30b9\u8a9e\u30ab\u30ca\u30c0)");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        java.io.IOException iOException1 = new java.io.IOException("jpn");
        java.io.IOException iOException4 = new java.io.IOException("UTC");
        java.io.IOException iOException6 = new java.io.IOException("zho");
        iOException4.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("2", (java.lang.Throwable) iOException4);
        iOException1.addSuppressed((java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray10 = iOException8.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray14 = iOException13.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException16 = new java.io.IOException("ITA", (java.lang.Throwable) iOException13);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        iOException8.addSuppressed((java.lang.Throwable) iOException16);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray21 = iOException8.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getISO3Country();
        java.lang.String str5 = null; // flaky: locale3.getISO3Language();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology10, locale11, (java.lang.Integer) 100);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = null; // flaky: locale14.getISO3Language();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale14.getDisplayVariant(locale17);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale19.getISO3Country();
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale3, locale8, locale11, locale14, locale19, locale21 };
        java.util.ArrayList<java.util.Locale> localeList23 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList23, localeArray22);
        java.util.Locale locale25 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList23);
        java.lang.String[] strArray29 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        java.lang.String str32 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale36.getISO3Country();
        java.lang.String str38 = null; // flaky: locale36.getISO3Language();
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale36.getDisplayVariant(locale39);
        java.util.Locale locale41 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology43, locale44, (java.lang.Integer) 100);
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.lang.String str48 = locale47.getISO3Country();
        java.lang.String str49 = null; // flaky: locale47.getISO3Language();
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale47.getDisplayVariant(locale50);
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = locale52.getISO3Country();
        java.util.Locale locale54 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale36, locale41, locale44, locale47, locale52, locale54 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.Locale locale58 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList56);
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Locale locale63 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleKeys();
        java.lang.String str65 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.lang.String>) strSet64);
        java.lang.String str66 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap69 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList70 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap69);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap71 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList72 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap71);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap73 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList74 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList72, strMap73);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap75 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList76 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList74, strMap75);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zho" + "'", str5, "zho");
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(locale25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zho" + "'", str38, "zho");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "zh");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "zh");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "zho" + "'", str49, "zho");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(languageRangeList68);
        org.junit.Assert.assertNotNull(languageRangeList70);
        org.junit.Assert.assertNotNull(languageRangeList72);
        org.junit.Assert.assertNotNull(languageRangeList74);
        org.junit.Assert.assertNotNull(languageRangeList76);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.clear();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale.Builder builder13 = builder12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setLanguage("+07:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: +07:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap11);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.parse("ja");
        java.util.Locale.LanguageRange languageRange16 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] { languageRange16 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale23.getISO3Country();
        java.lang.String str25 = null; // flaky: locale23.getISO3Language();
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.lang.String str27 = locale23.getDisplayVariant(locale26);
        java.util.Locale locale28 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology30, locale31, (java.lang.Integer) 100);
        java.util.Locale locale34 = java.util.Locale.getDefault();
        java.lang.String str35 = locale34.getISO3Country();
        java.lang.String str36 = null; // flaky: locale34.getISO3Language();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.lang.String str38 = locale34.getDisplayVariant(locale37);
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale39.getISO3Country();
        java.util.Locale locale41 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray42 = new java.util.Locale[] { locale23, locale28, locale31, locale34, locale39, locale41 };
        java.util.ArrayList<java.util.Locale> localeList43 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList43, localeArray42);
        java.util.Locale locale45 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.util.Locale>) localeList43);
        java.util.Locale.FilteringMode filteringMode46 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.util.Locale>) localeList43, filteringMode46);
        java.util.Locale locale48 = java.util.Locale.lookup(languageRangeList14, (java.util.Collection<java.util.Locale>) localeList47);
        java.util.Locale.LanguageRange languageRange50 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str51 = languageRange50.getRange();
        java.util.Locale.LanguageRange languageRange53 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str54 = languageRange53.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] { languageRange50, languageRange53 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Locale.LanguageRange languageRange59 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray60 = new java.util.Locale.LanguageRange[] { languageRange59 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList61 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList61, languageRangeArray60);
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        java.util.Locale locale66 = java.util.Locale.getDefault();
        java.lang.String str67 = locale66.getISO3Country();
        java.lang.String str68 = null; // flaky: locale66.getISO3Language();
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale66.getDisplayVariant(locale69);
        java.util.Locale locale71 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology73 = null;
        java.util.Locale locale74 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology73, locale74, (java.lang.Integer) 100);
        java.util.Locale locale77 = java.util.Locale.getDefault();
        java.lang.String str78 = locale77.getISO3Country();
        java.lang.String str79 = null; // flaky: locale77.getISO3Language();
        java.util.Locale locale80 = java.util.Locale.getDefault();
        java.lang.String str81 = locale77.getDisplayVariant(locale80);
        java.util.Locale locale82 = java.util.Locale.getDefault();
        java.lang.String str83 = locale82.getISO3Country();
        java.util.Locale locale84 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray85 = new java.util.Locale[] { locale66, locale71, locale74, locale77, locale82, locale84 };
        java.util.ArrayList<java.util.Locale> localeList86 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList86, localeArray85);
        java.util.Locale locale88 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.util.Locale>) localeList86);
        java.util.Locale.FilteringMode filteringMode89 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList61, (java.util.Collection<java.util.Locale>) localeList86, filteringMode89);
        java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter(languageRangeList14, (java.util.Collection<java.util.Locale>) localeList90);
        java.util.Locale locale93 = java.util.Locale.lookup(languageRangeList12, (java.util.Collection<java.util.Locale>) localeList90);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "chn" + "'", str25, "chn");
        org.junit.Assert.assertNotNull(locale26);
// flaky:         org.junit.Assert.assertEquals(locale26.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "chn");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "chn");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "chn" + "'", str36, "chn");
        org.junit.Assert.assertNotNull(locale37);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(locale45);
        org.junit.Assert.assertTrue("'" + filteringMode46 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode46.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertNull(locale48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "germany" + "'", str51, "germany");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "germany" + "'", str54, "germany");
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(languageRangeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(locale66);
// flaky:         org.junit.Assert.assertEquals(locale66.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "chn" + "'", str68, "chn");
        org.junit.Assert.assertNotNull(locale69);
// flaky:         org.junit.Assert.assertEquals(locale69.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(locale71);
// flaky:         org.junit.Assert.assertEquals(locale71.toString(), "chn");
        org.junit.Assert.assertNotNull(locale74);
// flaky:         org.junit.Assert.assertEquals(locale74.toString(), "chn");
        org.junit.Assert.assertNotNull(locale77);
// flaky:         org.junit.Assert.assertEquals(locale77.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "chn" + "'", str79, "chn");
        org.junit.Assert.assertNotNull(locale80);
// flaky:         org.junit.Assert.assertEquals(locale80.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(locale82);
// flaky:         org.junit.Assert.assertEquals(locale82.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNull(locale88);
        org.junit.Assert.assertTrue("'" + filteringMode89 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode89.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList90);
        org.junit.Assert.assertNotNull(localeList91);
        org.junit.Assert.assertNotNull(localeList92);
        org.junit.Assert.assertNull(locale93);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        boolean boolean3 = dateTimeZone0.isStandardOffset((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        long long10 = dateTimeZone5.convertLocalToUTC((long) 1, true);
        java.lang.String str11 = dateTimeZone5.toString();
        long long14 = dateTimeZone5.convertLocalToUTC(2L, false);
        long long16 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 'u');
        long long18 = dateTimeZone5.previousTransition(5835600035L);
        long long20 = dateTimeZone5.previousTransition(307584000000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 117L + "'", long16 == 117L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5835600035L + "'", long18 == 5835600035L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 307584000000L + "'", long20 == 307584000000L);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        long long9 = dateTimeZone1.convertLocalToUTC(0L, false, (long) (short) 100);
        int int11 = dateTimeZone1.getOffsetFromLocal(0L);
        java.lang.String str13 = dateTimeZone1.getNameKey(18748800052L);
        int int15 = dateTimeZone1.getOffset((long) 5207);
        long long17 = dateTimeZone1.nextTransition(3103354800000L);
        boolean boolean19 = dateTimeZone1.isStandardOffset(19353600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3103354800000L + "'", long17 == 3103354800000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(100L, chronology5, locale8);
        java.lang.String str12 = locale8.getDisplayScript();
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str15 = locale8.getExtension('u');
        java.util.Locale locale19 = new java.util.Locale("2", "Chinese", "clockhourOfHalfday");
        java.lang.String str20 = locale8.getDisplayCountry(locale19);
        java.lang.String str22 = locale19.getUnicodeLocaleType("en");
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale26 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology24, locale26, (java.lang.Integer) 1, 0);
        java.util.Locale locale30 = java.util.Locale.ENGLISH;
        java.lang.String str31 = locale26.getDisplayName(locale30);
        java.lang.String str32 = locale30.toLanguageTag();
        java.lang.String str33 = locale30.getDisplayName();
        java.lang.String str34 = locale30.getDisplayScript();
        java.lang.String str35 = locale19.getDisplayScript(locale30);
        java.lang.String str36 = locale19.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germany" + "'", str2, "Germany");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals(locale19.toString(), "2_CHINESE_clockhourOfHalfday");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "en" + "'", str32, "en");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "English" + "'", str33, "English");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2_CHINESE_clockhourOfHalfday" + "'", str36, "2_CHINESE_clockhourOfHalfday");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("italiano (Italia)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'italiano (Italia)' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        int int10 = dateTimeZone8.getOffsetFromLocal((long) (byte) 1);
        long long14 = dateTimeZone8.convertLocalToUTC((long) 52, false, 18968400000L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "chn");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("X-LVARIANT-0");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x-lvariant-0" + "'", str4, "x-lvariant-0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "x-lvariant-0" + "'", str5, "x-lvariant-0");
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("AD");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ad" + "'", str2, "ad");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ad" + "'", str3, "ad");
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder11 = builder8.setExtension('u', "DE");
        java.util.Locale.Builder builder13 = builder8.setLanguageTag("Italian");
        java.util.Locale.Builder builder15 = builder13.setLanguageTag("fr-CA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder13.setLanguage("datetimefield[yearofcentury]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: datetimefield[yearofcentury] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("US");
        java.lang.String str3 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology7, locale8, (java.lang.Integer) (-1), 0);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getScript();
        java.lang.String str14 = locale12.getScript();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) locale12);
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale18 = new java.util.Locale("eng");
        java.lang.String str19 = locale18.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale18);
        java.util.Locale locale21 = java.util.Locale.getDefault(category0);
        java.util.Locale locale22 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "us");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "us");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(locale18.toString(), "eng");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "eng");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "eng");
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        java.util.Locale locale1 = new java.util.Locale("+00:52");
        org.junit.Assert.assertEquals(locale1.toString(), "+00:52");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setScript("Cina");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("200");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 200 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("de");
        java.lang.String str2 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(7343661, 259200032);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 259200032");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale locale7 = builder6.build();
        boolean boolean8 = locale7.hasExtensions();
        java.lang.String str9 = locale7.getDisplayScript();
        boolean boolean10 = locale7.hasExtensions();
        java.lang.String str11 = locale7.getDisplayScript();
        java.util.Locale.setDefault(locale7);
        java.lang.String str13 = locale7.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale7.getUnicodeLocaleType("DateTimeField[clockhourOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: DateTimeField[clockhourOfDay]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ita");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ita" + "'", str13, "ita");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("\u65e5\u672c\u8a9e");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '???' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        java.lang.String str1 = dateTimeFieldType0.toString();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "millisOfDay" + "'", str1, "millisOfDay");
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("zh-TW");
        org.junit.Assert.assertNotNull(languageRangeList1);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.lang.String str2 = locale0.getDisplayVariant();
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale0.getDisplayName(locale3);
        java.lang.String str5 = locale3.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinese" + "'", str4, "Chinese");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English" + "'", str5, "English");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        java.io.IOException iOException1 = new java.io.IOException("DEUTSCH");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long6 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        java.lang.String str7 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.adjustOffset(259200048L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        int int16 = dateTimeZone1.getOffsetFromLocal((long) 5100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 259200048L + "'", long11 == 259200048L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("weekyear", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket7.getZone();
        long long14 = dateTimeZone11.adjustOffset((-62104024800001L), false);
        java.lang.String str16 = dateTimeZone11.getShortName(17999999L);
        java.lang.String str18 = dateTimeZone11.getNameKey((-288000000L));
        java.lang.Class<?> wildcardClass19 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-62104024800001L) + "'", long14 == (-62104024800001L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        java.io.IOException iOException1 = new java.io.IOException("566");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setLanguageTag("year");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setVariant("java.io.IOException: java.io.IOException: DateTimeField[weekOfWeekyear]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: java.io.IOException: java.io.IOException: DateTimeField[weekOfWeekyear] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(8);
        int int3 = dateTimeZone1.getStandardOffset((long) 3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(100L, chronology5, locale8);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket11.getZone();
        int int14 = dateTimeZone12.getOffsetFromLocal(102816006301L);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 360001970L);
        java.util.TimeZone timeZone17 = dateTimeZone12.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 360001978L + "'", long16 == 360001978L);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Francia");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Francia' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder10 = builder3.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder12 = builder10.setRegion("CN");
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = builder12.build();
        java.util.Locale locale15 = builder12.build();
        java.util.Locale locale16 = builder12.build();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        java.io.IOException iOException1 = new java.io.IOException("25");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Italian");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("cinese (Cina)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=cinese(cina)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(345599);
        java.lang.String str3 = dateTimeZone1.getName(6707674799L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:05:45.599" + "'", str3, "+00:05:45.599");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getLanguage();
        java.util.Locale locale3 = locale0.stripExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        java.lang.String str3 = dateTimeFieldType0.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "monthOfYear" + "'", str2, "monthOfYear");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "monthOfYear" + "'", str3, "monthOfYear");
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("16280", (double) (-7199900L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-7199900.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2937600, 210);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 210");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("-10368000", (double) 64713600032L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=6.4713600032E10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder18 = builder6.clearExtensions();
        java.util.Locale locale19 = builder6.build();
        java.util.Locale.Builder builder21 = builder6.setLanguage("FR");
        java.util.Locale locale24 = new java.util.Locale("South Korea", "+100:00");
        java.util.Locale locale25 = java.util.Locale.CHINESE;
        java.lang.String str26 = locale25.toLanguageTag();
        java.lang.String str27 = locale25.getLanguage();
        java.lang.String str28 = locale25.toLanguageTag();
        java.util.Locale locale29 = java.util.Locale.ROOT;
        java.util.Locale locale30 = locale29.stripExtensions();
        java.util.Locale locale31 = locale30.stripExtensions();
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder33 = builder32.clear();
        java.util.Locale locale34 = builder33.build();
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale38 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology36, locale38, (java.lang.Integer) 1, 0);
        java.lang.String str42 = locale34.getDisplayVariant(locale38);
        java.lang.String str43 = locale31.getDisplayLanguage(locale38);
        java.lang.String str44 = locale25.getDisplayCountry(locale38);
        java.util.Locale locale46 = new java.util.Locale("");
        java.lang.String str47 = locale46.getISO3Language();
        java.lang.String str48 = locale46.getDisplayScript();
        java.util.Set<java.lang.Character> charSet49 = locale46.getExtensionKeys();
        java.lang.String str50 = locale25.getDisplayScript(locale46);
        java.lang.String str51 = locale46.getDisplayName();
        java.lang.String str52 = locale24.getDisplayLanguage(locale46);
        java.lang.String str53 = locale24.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder54 = builder6.setLocale(locale24);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: south korea [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals(locale24.toString(), "south korea_+100:00");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zh" + "'", str26, "zh");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh" + "'", str27, "zh");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zh" + "'", str28, "zh");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "south korea" + "'", str52, "south korea");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("weekofweekyear (UTC,+00:00)", throwable1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException6 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray7 = iOException6.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException9 = new java.io.IOException("ITA", (java.lang.Throwable) iOException6);
        iOException2.addSuppressed((java.lang.Throwable) iOException9);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale1.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology7, locale8, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket(100L, chronology5, locale8);
        java.lang.String str12 = locale8.getDisplayScript();
        java.util.Locale.setDefault(category0, locale8);
        java.lang.String str14 = locale8.getDisplayName();
        java.lang.String str15 = locale8.getScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Germany" + "'", str2, "Germany");
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "10_JPN_us");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 (JPN,us)" + "'", str14, "10 (JPN,us)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        java.io.IOException iOException1 = new java.io.IOException("7223");
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale locale9 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder1.setScript("dayofyear (35)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: dayofyear (35) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder24 = builder20.removeUnicodeLocaleAttribute("Cina");
        java.util.Locale.Builder builder25 = builder20.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder28 = builder20.setExtension('a', "187800000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: 187800000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale9.getDisplayScript();
        java.util.Locale.Builder builder12 = builder7.setLocale(locale9);
        java.util.Locale.Builder builder13 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder13.setLanguage("79200");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 79200 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh" + "'", str10, "zh");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        dateTimeParserBucket6.setOffset((int) (short) 100);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology10.getZone();
        long long13 = dateTimeZone11.nextTransition(10904400097L);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10904400097L + "'", long13 == 10904400097L);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Italian (Italy)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=italian (italy)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology26, locale27, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(100L, chronology24, locale27);
        int int31 = dateTimeParserBucket30.getOffset();
        java.lang.Object obj32 = dateTimeParserBucket30.saveState();
        java.util.Locale locale33 = dateTimeParserBucket30.getLocale();
        java.util.Locale locale34 = dateTimeParserBucket30.getLocale();
        java.util.Locale.Builder builder35 = builder22.setLocale(locale34);
        java.util.Locale.Builder builder36 = builder35.clear();
        java.util.Locale.Builder builder37 = builder36.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh");
        org.junit.Assert.assertNotNull(locale34);
// flaky:         org.junit.Assert.assertEquals(locale34.toString(), "zh");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("era");
        java.util.Locale locale12 = builder11.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = locale12.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1562400000));
        java.lang.String str3 = dateTimeZone1.getShortName(18514500000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-434:00" + "'", str3, "-434:00");
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.halfdayOfDay();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(50, 2067);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 2067");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Sat", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.setVariant("18000000");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder6.setLanguage("datetimefield[weekofweekyear] (ko-KR)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: datetimefield[weekofweekyear] (ko-KR) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ita");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        java.io.IOException iOException1 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Throwable throwable7 = null;
        java.io.IOException iOException8 = new java.io.IOException("UTC", throwable7);
        java.io.IOException iOException9 = new java.io.IOException(throwable7);
        iOException4.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("UTC", (java.lang.Throwable) iOException9);
        iOException1.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray13 = iOException1.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException("\u5fb7\u6587");
        java.io.IOException iOException17 = new java.io.IOException("7200000", (java.lang.Throwable) iOException16);
        iOException1.addSuppressed((java.lang.Throwable) iOException17);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long6 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        java.lang.String str7 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long11 = dateTimeZone1.adjustOffset(259200048L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        long long16 = dateTimeZone1.convertUTCToLocal((-111311L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 259200048L + "'", long11 == 259200048L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-111311L) + "'", long16 == (-111311L));
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder18 = builder17.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder18.removeUnicodeLocaleAttribute("DateTimeField[secondOfDay]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: DateTimeField[secondOfDay] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        java.io.IOException iOException1 = new java.io.IOException("UTC");
        java.io.IOException iOException3 = new java.io.IOException("zho");
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray6 = iOException3.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("CHN");
        java.io.IOException iOException12 = new java.io.IOException("UTC");
        java.io.IOException iOException14 = new java.io.IOException("zho");
        iOException12.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException16 = new java.io.IOException("2", (java.lang.Throwable) iOException12);
        java.io.IOException iOException17 = new java.io.IOException("java.io.IOException: zho", (java.lang.Throwable) iOException12);
        iOException8.addSuppressed((java.lang.Throwable) iOException17);
        iOException3.addSuppressed((java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray20 = iOException3.getSuppressed();
        java.lang.Throwable[] throwableArray21 = iOException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        java.util.Locale locale1 = new java.util.Locale("millisOfDay");
        org.junit.Assert.assertEquals(locale1.toString(), "millisofday");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.getID();
        boolean boolean3 = dateTimeZone0.isStandardOffset((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        long long10 = dateTimeZone5.convertLocalToUTC((long) 1, true);
        java.lang.String str11 = dateTimeZone5.toString();
        long long14 = dateTimeZone5.convertLocalToUTC(2L, false);
        long long16 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 'u');
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone0.isLocalDateTimeGap(localDateTime17);
        long long20 = dateTimeZone0.nextTransition((-61409835360000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 117L + "'", long16 == 117L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-61409835360000L) + "'", long20 == (-61409835360000L));
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        java.io.IOException iOException1 = new java.io.IOException("CAN");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder12 = builder7.setExtension('x', "99");
        java.util.Locale.Builder builder14 = builder7.removeUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder15 = builder14.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.setScript("+00:01:26.399");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: +00:01:26.399 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setUnicodeLocaleKeyword("yearOfEra", "DateTimeField[year]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: yearOfEra [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setVariant("\u52a0\u62ff\u5927");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder9 = builder1.clear();
        java.util.Locale.Builder builder10 = builder1.clearExtensions();
        java.util.Locale.Builder builder12 = builder1.addUnicodeLocaleAttribute("CAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder1.setScript("-46");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: -46 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder24 = builder20.removeUnicodeLocaleAttribute("Cina");
        java.util.Locale locale26 = new java.util.Locale("CHN");
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Locale.Builder builder28 = builder20.setLocale(locale26);
        boolean boolean29 = locale26.hasExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals(locale26.toString(), "chn");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "chn" + "'", str27, "chn");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder10 = builder7.setLanguage("zho");
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale locale13 = builder12.build();
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale.Builder builder15 = builder10.setLocale(locale13);
        java.util.Locale.Builder builder16 = builder15.clear();
        java.util.Locale locale17 = builder15.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder15.addUnicodeLocaleAttribute("22");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 22 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "und" + "'", str14, "und");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        java.io.IOException iOException2 = new java.io.IOException("utc");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException5 = new java.io.IOException("jpn");
        java.io.IOException iOException8 = new java.io.IOException("UTC");
        java.io.IOException iOException10 = new java.io.IOException("zho");
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        java.io.IOException iOException12 = new java.io.IOException("2", (java.lang.Throwable) iOException8);
        iOException5.addSuppressed((java.lang.Throwable) iOException12);
        java.lang.Throwable[] throwableArray14 = iOException5.getSuppressed();
        iOException2.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException16 = new java.io.IOException("120 (DECEMBER)", (java.lang.Throwable) iOException5);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("de");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap6 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList7 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap6);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology12, locale13, (java.lang.Integer) 100);
        java.util.Locale[] localeArray16 = new java.util.Locale[] { locale13 };
        java.util.ArrayList<java.util.Locale> localeList17 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList17, localeArray16);
        java.util.Locale locale19 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList17);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology24, locale25, (java.lang.Integer) 100);
        java.util.Locale[] localeArray28 = new java.util.Locale[] { locale25 };
        java.util.ArrayList<java.util.Locale> localeList29 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList29, localeArray28);
        java.util.Locale locale31 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.util.Locale>) localeList29);
        java.util.Locale locale32 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList29);
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale36 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology34, locale36, (java.lang.Integer) 1, 0);
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.lang.String str41 = locale36.getDisplayName(locale40);
        java.util.Set<java.lang.String> strSet42 = locale36.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strSet42);
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology45, locale46, (java.lang.Integer) (-1), 0);
        java.util.Locale locale50 = locale46.stripExtensions();
        java.util.Set<java.lang.String> strSet51 = locale50.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet52 = locale50.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode53 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strSet52, filteringMode53);
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strList54);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeList7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(localeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(localeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(locale31);
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "fr");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "fr");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertTrue("'" + filteringMode53 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode53.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList55);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        double double7 = languageRange1.getWeight();
        java.lang.String str8 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "germany" + "'", str2, "germany");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "germany" + "'", str3, "germany");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "germany" + "'", str4, "germany");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "germany" + "'", str5, "germany");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "germany" + "'", str8, "germany");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        dateTimeParserBucket4.setZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getShortName(18748800052L);
        java.lang.String str13 = dateTimeZone8.getNameKey(93623040172800008L);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology16, locale17, (java.lang.Integer) (-1), 0);
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = locale21.getScript();
        java.lang.String str23 = locale21.getScript();
        boolean boolean24 = dateTimeParserBucket20.restoreState((java.lang.Object) locale21);
        java.lang.String str25 = dateTimeZone8.getShortName(31L, locale21);
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+100:00" + "'", str11, "+100:00");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+100:00" + "'", str25, "+100:00");
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        java.util.Locale locale1 = new java.util.Locale("Cina");
        java.lang.String str2 = locale1.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "cina");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cina" + "'", str2, "cina");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale6 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean7 = locale6.hasExtensions();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 100);
        java.lang.String str13 = locale6.getDisplayCountry(locale10);
        java.lang.String str14 = dateTimeZone1.getShortName((long) (short) 1, locale10);
        java.lang.String str15 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone1.getOffset(readableInstant16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals(locale6.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "10_JPN_us");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        java.io.IOException iOException1 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Throwable throwable7 = null;
        java.io.IOException iOException8 = new java.io.IOException("UTC", throwable7);
        java.io.IOException iOException9 = new java.io.IOException(throwable7);
        iOException4.addSuppressed((java.lang.Throwable) iOException9);
        java.io.IOException iOException11 = new java.io.IOException("UTC", (java.lang.Throwable) iOException9);
        iOException1.addSuppressed((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray13 = iOException9.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1380);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder0.build();
        java.lang.String str4 = locale3.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder10 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder7.setUnicodeLocaleKeyword("\u4e2d\u56fd\u8a9e (FRANZ\366SISCH (FRANKREICH))", "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ??? (FRANZo?SISCH (FRANKREICH)) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("de");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleKeys();
        java.lang.String str11 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strSet10);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleKeys();
        java.lang.String str17 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strSet16);
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList20 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strSet19);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale24.getISO3Country();
        java.lang.String str26 = locale24.getISO3Language();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale24.getDisplayVariant(locale27);
        java.util.Locale locale29 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology31, locale32, (java.lang.Integer) 100);
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale35.getISO3Country();
        java.lang.String str37 = locale35.getISO3Language();
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale35.getDisplayVariant(locale38);
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = locale40.getISO3Country();
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale24, locale29, locale32, locale35, locale40, locale42 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.Locale locale46 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList44);
        java.lang.String[] strArray50 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.lang.String str53 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList51);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = locale57.getISO3Country();
        java.lang.String str59 = locale57.getISO3Language();
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.lang.String str61 = locale57.getDisplayVariant(locale60);
        java.util.Locale locale62 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology64 = null;
        java.util.Locale locale65 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology64, locale65, (java.lang.Integer) 100);
        java.util.Locale locale68 = java.util.Locale.getDefault();
        java.lang.String str69 = locale68.getISO3Country();
        java.lang.String str70 = locale68.getISO3Language();
        java.util.Locale locale71 = java.util.Locale.getDefault();
        java.lang.String str72 = locale68.getDisplayVariant(locale71);
        java.util.Locale locale73 = java.util.Locale.getDefault();
        java.lang.String str74 = locale73.getISO3Country();
        java.util.Locale locale75 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray76 = new java.util.Locale[] { locale57, locale62, locale65, locale68, locale73, locale75 };
        java.util.ArrayList<java.util.Locale> localeList77 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList77, localeArray76);
        java.util.Locale locale79 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.List<java.util.Locale> localeList80 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.List<java.util.Locale> localeList81 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.Locale.LanguageRange[] languageRangeArray82 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList83 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList83, languageRangeArray82);
        java.util.Locale locale85 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet86 = locale85.getUnicodeLocaleKeys();
        java.lang.String str87 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList83, (java.util.Collection<java.lang.String>) strSet86);
        java.util.Locale locale88 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet89 = locale88.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode90 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList91 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList83, (java.util.Collection<java.lang.String>) strSet89, filteringMode90);
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList77, filteringMode90);
        java.util.Locale locale93 = java.util.Locale.lookup(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList77);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap94 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList95 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList3, strMap94);
        java.util.Collection<java.lang.String> strCollection96 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str97 = java.util.Locale.lookupTag(languageRangeList3, strCollection96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "jpn" + "'", str26, "jpn");
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "ja");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "ja");
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "jpn" + "'", str37, "jpn");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
// flaky:         org.junit.Assert.assertEquals(locale40.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(locale57);
// flaky:         org.junit.Assert.assertEquals(locale57.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "jpn" + "'", str59, "jpn");
        org.junit.Assert.assertNotNull(locale60);
// flaky:         org.junit.Assert.assertEquals(locale60.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(locale62);
// flaky:         org.junit.Assert.assertEquals(locale62.toString(), "ja");
        org.junit.Assert.assertNotNull(locale65);
// flaky:         org.junit.Assert.assertEquals(locale65.toString(), "ja");
        org.junit.Assert.assertNotNull(locale68);
// flaky:         org.junit.Assert.assertEquals(locale68.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "jpn" + "'", str70, "jpn");
        org.junit.Assert.assertNotNull(locale71);
// flaky:         org.junit.Assert.assertEquals(locale71.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(locale73);
// flaky:         org.junit.Assert.assertEquals(locale73.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(locale79);
        org.junit.Assert.assertNotNull(localeList80);
        org.junit.Assert.assertNotNull(localeList81);
        org.junit.Assert.assertNotNull(languageRangeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet86);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertTrue("'" + filteringMode90 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode90.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList91);
        org.junit.Assert.assertNotNull(localeList92);
        org.junit.Assert.assertNull(locale93);
        org.junit.Assert.assertNotNull(languageRangeList95);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 52);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.String str4 = dateTimeZone1.getName(1187L);
        long long7 = dateTimeZone1.adjustOffset(356580000L, false);
        java.lang.String str8 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 356580000L + "'", long7 == 356580000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Germany");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.lang.String str5 = languageRange1.getRange();
        double double6 = languageRange1.getWeight();
        java.lang.String str7 = languageRange1.getRange();
        java.lang.String str8 = languageRange1.getRange();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "germany" + "'", str5, "germany");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "germany" + "'", str7, "germany");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "germany" + "'", str8, "germany");
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        java.io.IOException iOException1 = new java.io.IOException("jpn");
        java.io.IOException iOException4 = new java.io.IOException("UTC");
        java.io.IOException iOException6 = new java.io.IOException("zho");
        iOException4.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException8 = new java.io.IOException("2", (java.lang.Throwable) iOException4);
        iOException1.addSuppressed((java.lang.Throwable) iOException8);
        java.lang.Throwable[] throwableArray10 = iOException8.getSuppressed();
        java.io.IOException iOException13 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray14 = iOException13.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException13);
        java.io.IOException iOException16 = new java.io.IOException("ITA", (java.lang.Throwable) iOException13);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException16);
        iOException8.addSuppressed((java.lang.Throwable) iOException16);
        java.io.IOException iOException19 = new java.io.IOException((java.lang.Throwable) iOException8);
        java.io.IOException iOException20 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.lang.Throwable[] throwableArray21 = iOException19.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("999", (double) 297734401645L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=2.97734401645E11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 1380);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 1380");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("18", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=18");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        java.io.IOException iOException1 = new java.io.IOException("\u671d\u9c9c\u6587\u97e9\u56fd)");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.addUnicodeLocaleAttribute("+00:00:00.032");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: +00:00:00.032 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.TimeZone timeZone10 = dateTimeZone8.toTimeZone();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone8.isLocalDateTimeGap(localDateTime11);
        java.lang.String str14 = dateTimeZone8.getName(363599999L);
        long long17 = dateTimeZone8.convertLocalToUTC(7061040000022L, false);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 7061040000022L + "'", long17 == 7061040000022L);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("yearOfCentury");
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.TimeZone timeZone10 = dateTimeZone8.toTimeZone();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone8.getOffset(readableInstant11);
        long long14 = dateTimeZone8.nextTransition(604801053L);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 10);
        long long19 = dateTimeZone8.getMillisKeepLocal(dateTimeZone17, 61084800010L);
        long long21 = dateTimeZone17.nextTransition(259199665L);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 604801053L + "'", long14 == 604801053L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60897000010L + "'", long19 == 60897000010L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 259199665L + "'", long21 == 259199665L);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        java.io.IOException iOException1 = new java.io.IOException("\u6cd5\u56fd");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getISO3Language();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale0.getDisplayVariant(locale3);
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale5.getDisplayName();
        java.lang.String str7 = locale5.getISO3Language();
        java.lang.String str8 = locale3.getDisplayScript(locale5);
        java.lang.String str9 = locale3.getDisplayName();
        java.lang.String str10 = locale3.getVariant();
        java.lang.String str11 = locale3.getVariant();
        java.lang.String str12 = locale3.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CHN" + "'", str1, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)" + "'", str6, "\u610f\u5927\u5229\u6587\u610f\u5927\u5229)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ita" + "'", str7, "ita");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str9, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("259200032");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 259200032 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale6 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean7 = locale6.hasExtensions();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 100);
        java.lang.String str13 = locale6.getDisplayCountry(locale10);
        java.lang.String str14 = dateTimeZone1.getShortName((long) (short) 1, locale10);
        java.lang.String str15 = locale10.getDisplayVariant();
        java.lang.String str16 = locale10.getDisplayScript();
        java.lang.String str17 = locale10.getISO3Language();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals(locale6.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zho" + "'", str17, "zho");
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.Locale locale6 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean7 = locale6.hasExtensions();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 100);
        java.lang.String str13 = locale6.getDisplayCountry(locale10);
        java.lang.String str14 = dateTimeZone1.getShortName((long) (short) 1, locale10);
        long long18 = dateTimeZone1.convertLocalToUTC((-156764159999998813L), false, 3084498489600000L);
        long long21 = dateTimeZone1.convertLocalToUTC((-259200010L), false);
        java.lang.String str22 = dateTimeZone1.getID();
        java.lang.String str23 = dateTimeZone1.toString();
        long long26 = dateTimeZone1.adjustOffset(31449600000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals(locale6.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-156764159999998813L) + "'", long18 == (-156764159999998813L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-259200010L) + "'", long21 == (-259200010L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 31449600000L + "'", long26 == 31449600000L);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 0);
        long long5 = dateTimeZone2.adjustOffset(1L, false);
        int int7 = dateTimeZone2.getStandardOffset((long) (-1));
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone2.isLocalDateTimeGap(localDateTime8);
        long long12 = dateTimeZone2.adjustOffset((-3599903L), false);
        long long15 = dateTimeZone2.convertLocalToUTC((-73L), true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 360000000 + "'", int7 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3599903L) + "'", long12 == (-3599903L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-360000073L) + "'", long15 == (-360000073L));
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder19 = builder17.setLanguage("English");
        java.util.Locale.Builder builder21 = builder17.addUnicodeLocaleAttribute("English");
        java.util.Locale.Builder builder22 = builder21.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getISO3Country();
        java.lang.String str2 = locale0.getISO3Language();
        java.util.Locale.setDefault(locale0);
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale5 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str6 = locale4.getDisplayCountry(locale5);
        java.lang.String str7 = locale0.getDisplayCountry(locale4);
        java.lang.String str9 = locale0.getExtension('u');
        java.util.Set<java.lang.String> strSet10 = locale0.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale0.getUnicodeLocaleType("363");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 363");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zho" + "'", str2, "zho");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        java.util.Locale locale1 = new java.util.Locale("java.io.IOException: java.io.IOException: dayofyear");
        org.junit.Assert.assertEquals(locale1.toString(), "java.io.ioexception: java.io.ioexception: dayofyear");
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("360660000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 360660000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long4 = dateTimeZone1.nextTransition(64713600009L);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        int int8 = dateTimeZone1.getOffset(36161L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 64713600009L + "'", long4 == 64713600009L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        java.util.Locale.Builder builder10 = builder1.setLanguage("it");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.clearExtensions();
        java.util.Locale locale13 = builder10.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder10.addUnicodeLocaleAttribute("\u5fb7\u6587\u5fb7\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale8 = new java.util.Locale("Italian");
        java.lang.String str9 = locale8.toLanguageTag();
        java.util.Locale.Builder builder10 = builder5.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder5.setLanguageTag("java.io.IOException: UTC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: java.io.IOException: UTC [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale8.toString(), "italian");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "italian" + "'", str9, "italian");
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 97L);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology9, locale10, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket(100L, chronology7, locale10);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeParserBucket13.getZone();
        int int16 = dateTimeZone14.getOffsetFromLocal((long) (byte) 1);
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = new java.util.Locale("US");
        java.lang.String str21 = locale20.getVariant();
        java.util.Locale.setDefault(category18, locale20);
        java.lang.String str23 = dateTimeZone14.getShortName(0L, locale20);
        java.lang.String str25 = dateTimeZone14.getName((long) 100);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 2L);
        long long31 = dateTimeZone1.convertLocalToUTC(6048863930090L, false, 6652801000L);
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = locale33.getISO3Country();
        java.lang.String str35 = locale33.getISO3Language();
        java.util.Locale locale36 = java.util.Locale.getDefault();
        java.lang.String str37 = locale33.getDisplayVariant(locale36);
        java.lang.String str38 = locale36.getVariant();
        java.util.Locale locale39 = locale36.stripExtensions();
        java.util.Set<java.lang.Character> charSet40 = locale39.getExtensionKeys();
        java.lang.String str41 = dateTimeZone1.getShortName((-61409836800000L), locale39);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + category18 + "' != '" + java.util.Locale.Category.FORMAT + "'", category18.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale20.toString(), "us");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 2L + "'", long27 == 2L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 6048863930090L + "'", long31 == 6048863930090L);
        org.junit.Assert.assertNotNull(locale33);
// flaky:         org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "CHN" + "'", str34, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "zho" + "'", str35, "zho");
        org.junit.Assert.assertNotNull(locale36);
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder4 = builder1.addUnicodeLocaleAttribute("Chinese");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.removeUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("Japanese");
        java.util.Locale.Builder builder13 = builder11.setRegion("982");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder11.setLanguageTag("java.io.IOException: dayOfYear");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: java.io.IOException: dayOfYear [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-23), (-2678388));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -2678388");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fra", strMap1);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("Franz\366sisch (Frankreich)");
        java.lang.String str5 = locale4.toLanguageTag();
        java.util.Set<java.lang.String> strSet6 = locale4.getUnicodeLocaleAttributes();
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("de");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList8, strMap9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList8, strMap11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList8, strMap13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.util.Locale locale18 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleKeys();
        java.lang.String str20 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strSet19);
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strSet22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale27.getISO3Country();
        java.lang.String str29 = locale27.getISO3Language();
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale27.getDisplayVariant(locale30);
        java.util.Locale locale32 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology34, locale35, (java.lang.Integer) 100);
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.lang.String str39 = locale38.getISO3Country();
        java.lang.String str40 = locale38.getISO3Language();
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.lang.String str42 = locale38.getDisplayVariant(locale41);
        java.util.Locale locale43 = java.util.Locale.getDefault();
        java.lang.String str44 = locale43.getISO3Country();
        java.util.Locale locale45 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray46 = new java.util.Locale[] { locale27, locale32, locale35, locale38, locale43, locale45 };
        java.util.ArrayList<java.util.Locale> localeList47 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList47, localeArray46);
        java.util.Locale locale49 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList47);
        java.lang.String[] strArray53 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        java.lang.String str56 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList54);
        java.util.Locale.LanguageRange[] languageRangeArray57 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList58 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList58, languageRangeArray57);
        java.util.Locale locale60 = java.util.Locale.getDefault();
        java.lang.String str61 = locale60.getISO3Country();
        java.lang.String str62 = locale60.getISO3Language();
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.lang.String str64 = locale60.getDisplayVariant(locale63);
        java.util.Locale locale65 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology67 = null;
        java.util.Locale locale68 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology67, locale68, (java.lang.Integer) 100);
        java.util.Locale locale71 = java.util.Locale.getDefault();
        java.lang.String str72 = locale71.getISO3Country();
        java.lang.String str73 = locale71.getISO3Language();
        java.util.Locale locale74 = java.util.Locale.getDefault();
        java.lang.String str75 = locale71.getDisplayVariant(locale74);
        java.util.Locale locale76 = java.util.Locale.getDefault();
        java.lang.String str77 = locale76.getISO3Country();
        java.util.Locale locale78 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray79 = new java.util.Locale[] { locale60, locale65, locale68, locale71, locale76, locale78 };
        java.util.ArrayList<java.util.Locale> localeList80 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList80, localeArray79);
        java.util.Locale locale82 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList58, (java.util.Collection<java.util.Locale>) localeList80);
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList80);
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList80);
        java.util.Locale.FilteringMode filteringMode85 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter(languageRangeList8, (java.util.Collection<java.util.Locale>) localeList84, filteringMode85);
        java.util.List<java.lang.String> strList87 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet6, filteringMode85);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "und" + "'", str5, "und");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "CHN" + "'", str28, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zho" + "'", str29, "zho");
        org.junit.Assert.assertNotNull(locale30);
// flaky:         org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
// flaky:         org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
// flaky:         org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "CHN" + "'", str39, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "zho" + "'", str40, "zho");
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(locale43);
// flaky:         org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "CHN" + "'", str44, "CHN");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(locale49);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(languageRangeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(locale60);
// flaky:         org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "CHN" + "'", str61, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "zho" + "'", str62, "zho");
        org.junit.Assert.assertNotNull(locale63);
// flaky:         org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(locale65);
// flaky:         org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale68);
// flaky:         org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale71);
// flaky:         org.junit.Assert.assertEquals(locale71.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "CHN" + "'", str72, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "zho" + "'", str73, "zho");
        org.junit.Assert.assertNotNull(locale74);
// flaky:         org.junit.Assert.assertEquals(locale74.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale76);
// flaky:         org.junit.Assert.assertEquals(locale76.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "CHN" + "'", str77, "CHN");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(locale82);
        org.junit.Assert.assertNotNull(localeList83);
        org.junit.Assert.assertNotNull(localeList84);
        org.junit.Assert.assertTrue("'" + filteringMode85 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode85.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList86);
        org.junit.Assert.assertNotNull(strList87);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        java.io.IOException iOException1 = new java.io.IOException("zho");
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.io.IOException iOException5 = new java.io.IOException("UTC");
        java.io.IOException iOException7 = new java.io.IOException("zho");
        iOException5.addSuppressed((java.lang.Throwable) iOException7);
        java.io.IOException iOException9 = new java.io.IOException("2", (java.lang.Throwable) iOException5);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.io.IOException iOException12 = new java.io.IOException("+01:00");
        iOException9.addSuppressed((java.lang.Throwable) iOException12);
        java.io.IOException iOException14 = new java.io.IOException((java.lang.Throwable) iOException9);
        iOException1.addSuppressed((java.lang.Throwable) iOException14);
        java.lang.String str16 = iOException14.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.io.IOException: java.io.IOException: 2" + "'", str16, "java.io.IOException: java.io.IOException: 2");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        int int10 = dateTimeZone8.getOffsetFromLocal((long) (byte) 1);
        boolean boolean11 = dateTimeZone8.isFixed();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone8.getOffset(readableInstant12);
        long long16 = dateTimeZone8.adjustOffset((long) 5, false);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5L + "'", long16 == 5L);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fr,FR", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(100L, chronology3, locale6);
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeParserBucket9);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        java.lang.String str13 = dateTimeZone1.getNameKey((long) '4');
        long long15 = dateTimeZone1.convertUTCToLocal(0L);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology18, locale19, (java.lang.Integer) (-1), 0);
        java.util.Locale locale23 = java.util.Locale.ITALY;
        java.lang.String str24 = locale23.getScript();
        java.lang.String str25 = locale23.getScript();
        boolean boolean26 = dateTimeParserBucket22.restoreState((java.lang.Object) locale23);
        java.lang.String str27 = locale23.getVariant();
        java.util.Set<java.lang.Character> charSet28 = locale23.getExtensionKeys();
        java.lang.String str29 = dateTimeZone1.getName(0L, locale23);
        java.lang.String str30 = locale23.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "it_IT" + "'", str30, "it_IT");
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray6 = iOException2.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("weekOfWeekyear", (java.lang.Throwable) iOException2);
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException7);
        java.lang.Throwable[] throwableArray9 = iOException7.getSuppressed();
        java.lang.Throwable throwable11 = null;
        java.io.IOException iOException12 = new java.io.IOException("UTC", throwable11);
        java.io.IOException iOException13 = new java.io.IOException(throwable11);
        java.io.IOException iOException14 = new java.io.IOException(throwable11);
        java.io.IOException iOException16 = new java.io.IOException("UTC");
        java.io.IOException iOException18 = new java.io.IOException("zho");
        iOException16.addSuppressed((java.lang.Throwable) iOException18);
        iOException14.addSuppressed((java.lang.Throwable) iOException18);
        iOException7.addSuppressed((java.lang.Throwable) iOException14);
        java.io.IOException iOException26 = new java.io.IOException("");
        java.io.IOException iOException27 = new java.io.IOException("USA", (java.lang.Throwable) iOException26);
        java.io.IOException iOException28 = new java.io.IOException("-1", (java.lang.Throwable) iOException26);
        java.lang.Throwable[] throwableArray29 = iOException26.getSuppressed();
        java.io.IOException iOException30 = new java.io.IOException((java.lang.Throwable) iOException26);
        java.io.IOException iOException31 = new java.io.IOException("999", (java.lang.Throwable) iOException30);
        iOException14.addSuppressed((java.lang.Throwable) iOException30);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("de-DE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'de-DE' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), 338855);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 338855");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.toLanguageTag();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it" + "'", str2, "it");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder14 = builder12.removeUnicodeLocaleAttribute("1969");
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder15.removeUnicodeLocaleAttribute("\u5927\u97d3\u6c11\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setScript("Cina");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.removeUnicodeLocaleAttribute("HALFDAYOFDAY");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: HALFDAYOFDAY [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        java.util.Locale locale1 = new java.util.Locale("Korean (South Korea)");
        org.junit.Assert.assertEquals(locale1.toString(), "korean (south korea)");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        java.lang.String str1 = dateTimeFieldType0.toString();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "year" + "'", str1, "year");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "year" + "'", str2, "year");
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder24 = builder20.removeUnicodeLocaleAttribute("Cina");
        java.util.Locale.Builder builder25 = builder20.clearExtensions();
        java.util.Locale.Builder builder27 = builder20.setLanguage("jpn");
        java.util.Locale.Builder builder28 = builder27.clear();
        java.util.Locale.Builder builder29 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder30 = builder29.clear();
        java.util.Locale.Builder builder32 = builder29.setLanguageTag("year");
        java.util.Locale.Builder builder34 = builder32.setLanguageTag("UTC");
        java.util.Locale locale35 = builder32.build();
        java.util.Locale.Builder builder36 = builder27.setLocale(locale35);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder39 = builder27.setUnicodeLocaleKeyword("DateTimeField[hourOfHalfday]", "-46");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: DateTimeField[hourOfHalfday] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "utc");
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '8' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("eng");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket(259200031L, chronology1, locale3);
        java.lang.String str5 = locale3.getLanguage();
        java.util.Locale locale7 = new java.util.Locale("CAN");
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str11 = dateTimeZone10.getID();
        long long13 = dateTimeZone10.previousTransition((long) 'a');
        boolean boolean14 = dateTimeZone10.isFixed();
        int int16 = dateTimeZone10.getOffset((long) (short) 100);
        boolean boolean18 = dateTimeZone10.isStandardOffset((long) 0);
        int int20 = dateTimeZone10.getStandardOffset((long) 8);
        long long23 = dateTimeZone10.convertLocalToUTC(259200000L, true);
        java.util.TimeZone timeZone24 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str28 = dateTimeZone27.getID();
        long long32 = dateTimeZone27.convertLocalToUTC((long) 53, true, 60220800000L);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone27.getOffset(readableInstant33);
        java.util.Locale locale38 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str39 = dateTimeZone27.getName((long) 'a', locale38);
        java.lang.String str40 = locale38.getDisplayCountry();
        java.lang.String str41 = dateTimeZone10.getName((-262800000L), locale38);
        java.lang.String str42 = locale7.getDisplayCountry(locale38);
        java.lang.String str43 = locale7.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "eng");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
        org.junit.Assert.assertEquals(locale7.toString(), "can");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 259200000L + "'", long23 == 259200000L);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 53L + "'", long32 == 53L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals(locale38.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "X-LVARIANT-0" + "'", str40, "X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("UTC", throwable2);
        java.io.IOException iOException4 = new java.io.IOException(throwable2);
        java.io.IOException iOException6 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray7 = iOException6.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException((java.lang.Throwable) iOException6);
        iOException4.addSuppressed((java.lang.Throwable) iOException6);
        java.io.IOException iOException10 = new java.io.IOException("ISOChronology[UTC]", (java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray11 = iOException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.setRegion("");
        java.util.Locale locale13 = builder12.build();
        java.util.Locale.Builder builder14 = builder12.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 97L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long7 = dateTimeZone1.nextTransition(66304800000L);
        boolean boolean8 = dateTimeZone1.isFixed();
        long long11 = dateTimeZone1.adjustOffset((-5472313414176599090L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 66304800000L + "'", long7 == 66304800000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-5472313414176599090L) + "'", long11 == (-5472313414176599090L));
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getStandardOffset((long) (byte) -1);
        java.lang.String str4 = dateTimeZone1.toString();
        java.lang.String str6 = dateTimeZone1.getShortName((long) '#');
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) locale7);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str11 = dateTimeZone10.getID();
        long long13 = dateTimeZone10.previousTransition((long) 'a');
        boolean boolean14 = dateTimeZone10.isFixed();
        int int16 = dateTimeZone10.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone18.getOffset(readableInstant19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone18.getOffset(readableInstant21);
        long long24 = dateTimeZone10.getMillisKeepLocal(dateTimeZone18, 3599999L);
        long long26 = dateTimeZone18.convertUTCToLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone18.isLocalDateTimeGap(localDateTime27);
        long long30 = dateTimeZone1.getMillisKeepLocal(dateTimeZone18, (long) 8);
        java.lang.String str32 = dateTimeZone18.getShortName(616481218396800000L);
        long long34 = dateTimeZone18.previousTransition(1555200000000022L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3599999L + "'", long24 == 3599999L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 8L + "'", long30 == 8L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1555200000000022L + "'", long34 == 1555200000000022L);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'u', 338855);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 338855");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("2", (java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.lang.Throwable[] throwableArray8 = iOException6.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.io.IOException iOException11 = new java.io.IOException("\u4e2d\u56fd");
        java.lang.Throwable[] throwableArray12 = iOException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.lang.Throwable throwable16 = null;
        java.io.IOException iOException17 = new java.io.IOException("UTC", throwable16);
        java.io.IOException iOException18 = new java.io.IOException(throwable16);
        java.io.IOException iOException19 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException18);
        java.lang.Throwable[] throwableArray20 = iOException19.getSuppressed();
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException19);
        java.io.IOException iOException22 = new java.io.IOException((java.lang.Throwable) iOException19);
        iOException11.addSuppressed((java.lang.Throwable) iOException19);
        java.lang.Throwable[] throwableArray24 = iOException11.getSuppressed();
        iOException9.addSuppressed((java.lang.Throwable) iOException11);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+14:27:53.340");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder8.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setVariant("363");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 363 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder14 = builder11.setExtension('a', "");
        java.util.Locale.Builder builder16 = builder11.setLanguage("ita");
        java.util.Locale.Builder builder17 = builder11.clearExtensions();
        java.util.Locale.Builder builder19 = builder17.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder21 = builder19.setLanguageTag("cinese");
        boolean boolean22 = dateTimeParserBucket7.restoreState((java.lang.Object) builder21);
        long long23 = dateTimeParserBucket7.computeMillis();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 90L + "'", long23 == 90L);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        java.io.IOException iOException1 = new java.io.IOException("FRA");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale.Builder builder6 = builder3.setScript("Cina");
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (short) 0);
        java.util.Locale locale12 = new java.util.Locale("\u5927\u97d3\u6c11\u56fd");
        java.lang.String str13 = dateTimeZone9.getShortName((-3599965L), locale12);
        boolean boolean14 = locale12.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder6.setLocale(locale12);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals(locale12.toString(), "\u5927\u97d3\u6c11\u56fd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+01:00" + "'", str13, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        java.lang.String str7 = locale3.getLanguage();
        java.lang.String str8 = locale3.getISO3Country();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (-8807));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -8807");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale.Builder builder11 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setScript("java.io.IOException: 5100");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: java.io.IOException: 5100 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayScript();
        boolean boolean4 = locale1.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getOffset((long) (short) 100);
        boolean boolean9 = dateTimeZone1.isStandardOffset((long) 0);
        int int11 = dateTimeZone1.getStandardOffset((long) 8);
        long long14 = dateTimeZone1.convertLocalToUTC(259200000L, true);
        long long17 = dateTimeZone1.convertLocalToUTC(19450859000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 259200000L + "'", long14 == 259200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 19450859000L + "'", long17 == 19450859000L);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        java.util.Locale locale3 = new java.util.Locale("CAN", "\u65e5\u672c\u8a9e)", "10 (JPN,us)");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u65e5\u672c\u8a9e)_10 (JPN,us)");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("weekofweekyear (UTC,+00:00)", throwable1);
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        java.util.Locale locale1 = new java.util.Locale("\u5fb7\u56fd");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale locale8 = builder7.build();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder11 = builder7.addUnicodeLocaleAttribute("86399999");
        java.util.Locale.Builder builder13 = builder11.setLanguage("JPN");
        java.util.Locale locale14 = builder11.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder11.addUnicodeLocaleAttribute("java.io.IOException: Japanese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: java.io.IOException: Japanese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "eng");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "jpn__#u-86399999");
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("1971");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1971");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        java.util.Locale locale3 = new java.util.Locale("dayofyear (35)", "centuryOfEra", "");
        java.lang.String str4 = locale3.getDisplayVariant();
        java.lang.String str5 = locale3.getDisplayVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "dayofyear (35)_CENTURYOFERA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setScript("fr,FR");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: fr,FR [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(53);
        java.lang.String str2 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+53:00" + "'", str2, "+53:00");
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.setScript("");
        java.util.Locale.Builder builder9 = builder7.setVariant("weekyear");
        java.util.Locale.Builder builder10 = builder7.clearExtensions();
        java.util.Locale.Builder builder12 = builder10.removeUnicodeLocaleAttribute("chn");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder10.setRegion("7199");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 7199 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("ita");
        java.util.Locale.Category category4 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale5 = java.util.Locale.GERMANY;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.util.Locale.setDefault(category4, locale5);
        java.util.Locale.Builder builder8 = builder3.setLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setLanguage("946");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 946 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.FORMAT + "'", category4.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u5fb7\u56fd" + "'", str6, "\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("java.io.IOException: utc");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.io.ioexception:utc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("20", (double) 36161L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=36161.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        java.util.Locale locale3 = new java.util.Locale("+53:53", "DateTimeField[secondOfDay]", "\u6708");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6708");
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "100");
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale locale7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("DateTimeField[dayOfMonth]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: DateTimeField[dayOfMonth] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        long long7 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, 28166400000L);
        boolean boolean8 = dateTimeZone4.isFixed();
        java.lang.String str10 = dateTimeZone4.getName(102816006301L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone4.getOffset(readableInstant11);
        java.util.TimeZone timeZone13 = dateTimeZone4.toTimeZone();
        long long16 = dateTimeZone4.convertLocalToUTC(32L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 28166400000L + "'", long7 == 28166400000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale locale10 = dateTimeParserBucket7.getLocale();
        java.lang.Integer int11 = dateTimeParserBucket7.getOffsetInteger();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket7.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekyearOfCentury();
        java.lang.String str15 = dateTimeField13.getAsShortText((long) 'u');
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale19 = new java.util.Locale("\u610f\u5927\u5229\u6587");
        java.lang.String str20 = dateTimeField13.getAsShortText(readablePartial16, 23, locale19);
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder22.clear();
        java.util.Locale locale24 = builder23.build();
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str26 = locale24.getDisplayLanguage(locale25);
        java.util.Set<java.lang.String> strSet27 = locale25.getUnicodeLocaleKeys();
        boolean boolean28 = locale25.hasExtensions();
        java.lang.String str29 = dateTimeField13.getAsText(8515079926L, locale25);
        java.lang.String str30 = dateTimeField13.toString();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
// flaky:         org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "70" + "'", str15, "70");
        org.junit.Assert.assertEquals(locale19.toString(), "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "23" + "'", str20, "23");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "70" + "'", str29, "70");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "DateTimeField[weekyearOfCentury]" + "'", str30, "DateTimeField[weekyearOfCentury]");
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket7.getZone();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getName(259200107L);
        long long16 = dateTimeZone10.convertLocalToUTC(70000L, false, 259200100L);
        boolean boolean18 = dateTimeZone10.isStandardOffset(6652800031L);
        long long22 = dateTimeZone10.convertLocalToUTC((long) (-9), true, (long) '4');
        boolean boolean23 = dateTimeZone10.isFixed();
        long long26 = dateTimeZone10.convertLocalToUTC(54874799L, true);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 70000L + "'", long16 == 70000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-9L) + "'", long22 == (-9L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 54874799L + "'", long26 == 54874799L);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("it-IT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'it-IT' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1972);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Friday", (double) 13305600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.33056E10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        java.io.IOException iOException1 = new java.io.IOException("dayOfYear");
        java.io.IOException iOException3 = new java.io.IOException("germany");
        java.lang.Throwable[] throwableArray4 = iOException3.getSuppressed();
        iOException1.addSuppressed((java.lang.Throwable) iOException3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("Japanese");
        java.util.Locale.Builder builder13 = builder11.setRegion("982");
        java.util.Locale.Builder builder15 = builder11.removeUnicodeLocaleAttribute("Chine");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("chinese", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getISO3Country();
        java.lang.String str8 = locale6.getISO3Language();
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale6.getDisplayVariant(locale9);
        java.util.Locale locale11 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.lang.String str18 = locale17.getISO3Country();
        java.lang.String str19 = locale17.getISO3Language();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale17.getDisplayVariant(locale20);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale22.getISO3Country();
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale6, locale11, locale14, locale17, locale22, locale24 };
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale locale28 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList26);
        java.lang.String[] strArray32 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList33);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale39.getISO3Country();
        java.lang.String str41 = locale39.getISO3Language();
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale39.getDisplayVariant(locale42);
        java.util.Locale locale44 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology46, locale47, (java.lang.Integer) 100);
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale50.getISO3Country();
        java.lang.String str52 = locale50.getISO3Language();
        java.util.Locale locale53 = java.util.Locale.getDefault();
        java.lang.String str54 = locale50.getDisplayVariant(locale53);
        java.util.Locale locale55 = java.util.Locale.getDefault();
        java.lang.String str56 = locale55.getISO3Country();
        java.util.Locale locale57 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray58 = new java.util.Locale[] { locale39, locale44, locale47, locale50, locale55, locale57 };
        java.util.ArrayList<java.util.Locale> localeList59 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList59, localeArray58);
        java.util.Locale locale61 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList59);
        java.util.List<java.util.Locale> localeList62 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList59);
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        java.util.Locale locale66 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet67 = locale66.getUnicodeLocaleKeys();
        java.lang.String str68 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, (java.util.Collection<java.lang.String>) strSet67);
        java.lang.String str69 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet67);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap70 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList71 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap70);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap72 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList73 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap72);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap74 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap74);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap76 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList77 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList75, strMap76);
        java.util.Locale.Builder builder78 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder79 = builder78.clearExtensions();
        java.util.Locale.Builder builder82 = builder79.setExtension('a', "");
        java.util.Locale.Builder builder84 = builder79.setLanguage("ita");
        java.util.Locale.Builder builder85 = builder79.clearExtensions();
        java.util.Locale.Builder builder87 = builder79.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder89 = builder87.removeUnicodeLocaleAttribute("Japanese");
        java.util.Locale locale90 = builder87.build();
        java.util.Set<java.lang.String> strSet91 = locale90.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList92 = java.util.Locale.filterTags(languageRangeList77, (java.util.Collection<java.lang.String>) strSet91);
        java.util.List<java.lang.String> strList93 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList92);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zho" + "'", str8, "zho");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "zh");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zho" + "'", str19, "zho");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "zho" + "'", str41, "zho");
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
// flaky:         org.junit.Assert.assertEquals(locale44.toString(), "zh");
        org.junit.Assert.assertNotNull(locale47);
// flaky:         org.junit.Assert.assertEquals(locale47.toString(), "zh");
        org.junit.Assert.assertNotNull(locale50);
// flaky:         org.junit.Assert.assertEquals(locale50.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "zho" + "'", str52, "zho");
        org.junit.Assert.assertNotNull(locale53);
// flaky:         org.junit.Assert.assertEquals(locale53.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
// flaky:         org.junit.Assert.assertEquals(locale55.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(locale61);
        org.junit.Assert.assertNotNull(localeList62);
        org.junit.Assert.assertNotNull(languageRangeArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(languageRangeList71);
        org.junit.Assert.assertNotNull(languageRangeList73);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertNotNull(languageRangeList77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "ita");
        org.junit.Assert.assertNotNull(strSet91);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(strList93);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("eng");
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        java.lang.String str6 = locale5.getDisplayScript();
        java.lang.String str7 = locale5.getDisplayLanguage();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str3 = locale1.getDisplayScript();
        java.lang.String str4 = locale1.getCountry();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setScript("");
        java.util.Locale.Builder builder11 = builder8.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder13 = builder8.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder15 = builder8.addUnicodeLocaleAttribute("ita");
        java.util.Locale.Builder builder17 = builder15.setRegion("CN");
        java.util.Locale.Builder builder18 = builder17.clear();
        java.util.Locale locale19 = builder17.build();
        java.util.Locale locale20 = builder17.build();
        java.util.Locale locale21 = builder17.build();
        java.lang.String str22 = locale1.getDisplayCountry(locale21);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("year");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("\u5fb7\u56fd");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        java.lang.String str5 = locale3.getISO3Country();
        java.lang.String str7 = locale3.getExtension('x');
        java.lang.String str8 = locale3.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "year");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "year" + "'", str4, "year");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        java.util.Locale locale1 = new java.util.Locale("+00:00:00.011");
        org.junit.Assert.assertEquals(locale1.toString(), "+00:00:00.011");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        java.lang.Object obj8 = dateTimeParserBucket7.saveState();
        dateTimeParserBucket7.setOffset((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.util.Locale locale13 = java.util.Locale.US;
        dateTimeParserBucket7.saveField(dateTimeFieldType11, "centuryOfEra", locale13);
        java.lang.String str15 = dateTimeFieldType11.getName();
        java.lang.String str16 = dateTimeFieldType11.getName();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType11.getDurationType();
        java.lang.String str18 = dateTimeFieldType11.toString();
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "yearOfCentury" + "'", str15, "yearOfCentury");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "yearOfCentury" + "'", str16, "yearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "yearOfCentury" + "'", str18, "yearOfCentury");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("weekyear");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "weekyear" + "'", str2, "weekyear");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "weekyear" + "'", str3, "weekyear");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale2 = new java.util.Locale("US");
        java.lang.String str3 = locale2.getVariant();
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale5 = java.util.Locale.getDefault(category0);
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology7, locale8, (java.lang.Integer) (-1), 0);
        java.util.Locale locale12 = java.util.Locale.ITALY;
        java.lang.String str13 = locale12.getScript();
        java.lang.String str14 = locale12.getScript();
        boolean boolean15 = dateTimeParserBucket11.restoreState((java.lang.Object) locale12);
        java.util.Locale.setDefault(category0, locale12);
        java.lang.String str17 = locale12.getDisplayCountry();
        java.lang.String str18 = locale12.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale2.toString(), "us");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "us");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italia" + "'", str17, "Italia");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "IT" + "'", str18, "IT");
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        java.util.Locale locale2 = new java.util.Locale("+01:00", "x-lvariant-0");
        java.lang.String str3 = locale2.getLanguage();
        java.lang.String str4 = locale2.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleAttributes();
        java.lang.Class<?> wildcardClass6 = strSet5.getClass();
        org.junit.Assert.assertEquals(locale2.toString(), "+01:00_X-LVARIANT-0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:00" + "'", str3, "+01:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 100);
        java.lang.Integer int5 = dateTimeParserBucket4.getOffsetInteger();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int9 = dateTimeZone7.getStandardOffset((long) (byte) -1);
        java.lang.String str11 = dateTimeZone7.getName(32054400100L);
        dateTimeParserBucket4.setZone(dateTimeZone7);
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 0);
        long long17 = dateTimeParserBucket4.computeMillis(false, "java.io.IOException: java.io.IOException: Thu");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.setUnicodeLocaleKeyword("49", "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder1.setLanguage("java.io.IOException: java.io.IOException: ITA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: java.io.IOException: java.io.IOException: ITA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(259200032, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) '#', locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.lang.String str8 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC((long) 2, false, 35L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long15 = dateTimeZone1.nextTransition(21168000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 21168000000L + "'", long15 == 21168000000L);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.lang.Throwable throwable9 = null;
        java.io.IOException iOException10 = new java.io.IOException("UTC", throwable9);
        java.io.IOException iOException11 = new java.io.IOException(throwable9);
        java.io.IOException iOException12 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException12.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException("cinese", (java.lang.Throwable) iOException12);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException12);
        iOException4.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException("\uc11c\uae30", (java.lang.Throwable) iOException15);
        java.io.IOException iOException18 = new java.io.IOException((java.lang.Throwable) iOException17);
        java.lang.Throwable[] throwableArray19 = iOException18.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("18720052");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=18720052");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        java.util.Locale locale3 = new java.util.Locale("193980000", "java.io.IOException: java.io.IOException: ", "\u516c\u5143");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u516c\u5143");
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder3.build();
        java.util.Locale locale5 = builder3.build();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 0, chronology1, locale5);
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-8));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("25200000");
        java.util.Locale locale2 = null;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(2);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 0, false, (long) (short) 1);
        boolean boolean6 = dateTimeZone1.isFixed();
        java.lang.String str8 = dateTimeZone1.getName((-10L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale12.toLanguageTag();
        java.lang.String str14 = locale12.getDisplayCountry();
        java.lang.String str15 = locale12.getDisplayScript();
        java.util.Locale locale16 = locale12.stripExtensions();
        java.lang.String str17 = dateTimeZone10.getShortName(0L, locale12);
        java.lang.String str18 = locale12.getDisplayVariant();
        java.lang.String str19 = dateTimeZone1.getName(67161149665L, locale12);
        long long21 = dateTimeZone1.previousTransition(218513859898140063L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-7200000L) + "'", long5 == (-7200000L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+02:00" + "'", str8, "+02:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko-KR" + "'", str13, "ko-KR");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u97e9\u56fd" + "'", str14, "\u97e9\u56fd");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+02:00" + "'", str19, "+02:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 218513859898140063L + "'", long21 == 218513859898140063L);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(24);
        java.lang.String str3 = dateTimeZone1.getShortName((-61449544343L));
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.024" + "'", str3, "+00:00:00.024");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long6 = dateTimeZone1.convertLocalToUTC((long) 1, true);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.lang.Object obj9 = null;
        boolean boolean10 = dateTimeZone1.equals(obj9);
        long long14 = dateTimeZone1.convertLocalToUTC((long) (-33000000), false, 272648970086400010L);
        long long16 = dateTimeZone1.nextTransition((long) 4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-33000000L) + "'", long14 == (-33000000L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 4L + "'", long16 == 4L);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguageTag("eng");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("hi! (ISOCHRONOLOGY[UTC])");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: hi! (ISOCHRONOLOGY[UTC]) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getNameKey((long) (-434));
        boolean boolean6 = dateTimeZone1.isStandardOffset(60480000010L);
        int int8 = dateTimeZone1.getStandardOffset(0L);
        long long11 = dateTimeZone1.adjustOffset(100L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        java.util.Locale locale3 = new java.util.Locale("8831", "DateTimeField[weekyearOfCentury]", "5207");
        boolean boolean4 = locale3.hasExtensions();
        java.lang.Object obj5 = locale3.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "8831_DATETIMEFIELD[WEEKYEAROFCENTURY]_5207");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "8831_DATETIMEFIELD[WEEKYEAROFCENTURY]_5207");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "8831_DATETIMEFIELD[WEEKYEAROFCENTURY]_5207");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "8831_DATETIMEFIELD[WEEKYEAROFCENTURY]_5207");
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale10 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology8, locale10, (java.lang.Integer) 1, 0);
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.lang.String str15 = locale10.getDisplayName(locale14);
        java.lang.String str16 = locale10.getISO3Country();
        java.util.Locale.Builder builder17 = builder6.setLocale(locale10);
        java.util.Locale.Builder builder20 = builder17.setUnicodeLocaleKeyword("35", "");
        java.util.Locale.Builder builder22 = builder20.addUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder24 = builder20.removeUnicodeLocaleAttribute("Cina");
        java.util.Locale.Builder builder25 = builder20.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder27 = builder20.setScript("Korean");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Korean [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) '#', locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.lang.String str9 = dateTimeZone1.getShortName((-604799903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        java.util.Locale locale1 = new java.util.Locale("clockhourOfHalfday");
        org.junit.Assert.assertEquals(locale1.toString(), "clockhourofhalfday");
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("UTC");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale1.getScript();
        java.lang.String str5 = locale1.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "utc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "utc" + "'", str2, "utc");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "utc" + "'", str5, "utc");
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        java.util.Locale locale1 = new java.util.Locale("DateTimeField[halfdayOfDay]");
        org.junit.Assert.assertEquals(locale1.toString(), "datetimefield[halfdayofday]");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Thu");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.Object obj4 = null;
        boolean boolean5 = languageRange1.equals(obj4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "thu" + "'", str3, "thu");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-46), 52);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone4.getOffset(readableInstant5);
        long long9 = dateTimeZone4.convertLocalToUTC((long) 1, true);
        long long12 = dateTimeZone4.convertLocalToUTC((-3L), true);
        long long14 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, 71341000L);
        java.lang.String str15 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-97379000L) + "'", long14 == (-97379000L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-46:52" + "'", str15, "-46:52");
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(18720052);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale9.getISO3Country();
        java.lang.String str11 = locale9.getISO3Language();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale9.getDisplayVariant(locale12);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology16, locale17, (java.lang.Integer) 100);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.getISO3Country();
        java.lang.String str22 = locale20.getISO3Language();
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = locale20.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale25.getISO3Country();
        java.util.Locale locale27 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray28 = new java.util.Locale[] { locale9, locale14, locale17, locale20, locale25, locale27 };
        java.util.ArrayList<java.util.Locale> localeList29 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList29, localeArray28);
        java.util.Locale locale31 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList29);
        java.lang.String[] strArray35 = new java.lang.String[] { "zh", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList36);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList36, filteringMode39);
        java.util.Locale.LanguageRange languageRange42 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str43 = languageRange42.getRange();
        java.util.Locale.LanguageRange languageRange45 = new java.util.Locale.LanguageRange("Germany");
        java.lang.String str46 = languageRange45.getRange();
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] { languageRange42, languageRange45 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Locale.LanguageRange languageRange51 = new java.util.Locale.LanguageRange("Germany");
        java.util.Locale.LanguageRange[] languageRangeArray52 = new java.util.Locale.LanguageRange[] { languageRange51 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList53 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList53, languageRangeArray52);
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Locale locale58 = java.util.Locale.getDefault();
        java.lang.String str59 = locale58.getISO3Country();
        java.lang.String str60 = locale58.getISO3Language();
        java.util.Locale locale61 = java.util.Locale.getDefault();
        java.lang.String str62 = locale58.getDisplayVariant(locale61);
        java.util.Locale locale63 = java.util.Locale.getDefault();
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale66 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology65, locale66, (java.lang.Integer) 100);
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.lang.String str70 = locale69.getISO3Country();
        java.lang.String str71 = locale69.getISO3Language();
        java.util.Locale locale72 = java.util.Locale.getDefault();
        java.lang.String str73 = locale69.getDisplayVariant(locale72);
        java.util.Locale locale74 = java.util.Locale.getDefault();
        java.lang.String str75 = locale74.getISO3Country();
        java.util.Locale locale76 = java.util.Locale.CHINESE;
        java.util.Locale[] localeArray77 = new java.util.Locale[] { locale58, locale63, locale66, locale69, locale74, locale76 };
        java.util.ArrayList<java.util.Locale> localeList78 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList78, localeArray77);
        java.util.Locale locale80 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.util.Locale>) localeList78);
        java.util.Locale.FilteringMode filteringMode81 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList82 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList53, (java.util.Collection<java.util.Locale>) localeList78, filteringMode81);
        java.util.List<java.util.Locale> localeList83 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList82);
        java.util.Collection<java.lang.String> strCollection85 = null;
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection85);
        java.util.Collection<java.lang.String> strCollection87 = null;
        java.util.List<java.lang.String> strList88 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strCollection87);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "jpn" + "'", str11, "jpn");
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(locale17);
// flaky:         org.junit.Assert.assertEquals(locale17.toString(), "ja");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "jpn" + "'", str22, "jpn");
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(locale31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode39.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "germany" + "'", str43, "germany");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "germany" + "'", str46, "germany");
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(languageRangeArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(locale58);
// flaky:         org.junit.Assert.assertEquals(locale58.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "jpn" + "'", str60, "jpn");
        org.junit.Assert.assertNotNull(locale61);
// flaky:         org.junit.Assert.assertEquals(locale61.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
// flaky:         org.junit.Assert.assertEquals(locale63.toString(), "ja");
        org.junit.Assert.assertNotNull(locale66);
// flaky:         org.junit.Assert.assertEquals(locale66.toString(), "ja");
        org.junit.Assert.assertNotNull(locale69);
// flaky:         org.junit.Assert.assertEquals(locale69.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "jpn" + "'", str71, "jpn");
        org.junit.Assert.assertNotNull(locale72);
// flaky:         org.junit.Assert.assertEquals(locale72.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(locale74);
// flaky:         org.junit.Assert.assertEquals(locale74.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "zh");
        org.junit.Assert.assertNotNull(localeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(locale80);
        org.junit.Assert.assertTrue("'" + filteringMode81 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode81.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList82);
        org.junit.Assert.assertNotNull(localeList83);
        org.junit.Assert.assertNotNull(localeList84);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(strList88);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertUTCToLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-292122054L));
        long long13 = dateTimeZone1.convertLocalToUTC(8816400000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 8816400000L + "'", long13 == 8816400000L);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("KOR", (double) 6048787730090L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=6.04878773009E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("eng");
        java.lang.String str2 = locale1.getScript();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "eng");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("UTC");
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("\u5fb7\u56fd");
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale5.getScript();
        java.lang.String str8 = locale4.getDisplayName(locale5);
        java.lang.String str9 = locale4.getISO3Country();
        java.util.Locale locale10 = java.util.Locale.CHINESE;
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale14, (java.lang.Integer) 100);
        java.lang.String str17 = locale10.getDisplayScript(locale14);
        java.lang.String str18 = locale14.getDisplayScript();
        java.lang.String str19 = locale14.getISO3Country();
        java.lang.String str20 = locale4.getDisplayScript(locale14);
        java.util.Locale.Builder builder21 = builder0.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder24 = builder21.setUnicodeLocaleKeyword("java.io.IOException: java.io.IOException: dayofyear", "101537");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: java.io.IOException: java.io.IOException: dayofyear [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(locale14);
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ITA" + "'", str19, "ITA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("italia");
        double double2 = languageRange1.getWeight();
        java.lang.Object obj3 = null;
        boolean boolean4 = languageRange1.equals(obj3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale locale3 = builder0.build();
        java.util.Locale locale4 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setUnicodeLocaleKeyword("Germany", "weekofweekyear");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Germany [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("+07:00", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=+07:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.setRegion("");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setExtension(' ', "Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale4 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology2, locale4, (java.lang.Integer) 1, 0);
        dateTimeParserBucket7.setOffset((int) (short) 100);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket7.getChronology();
        java.util.Locale locale12 = new java.util.Locale("2");
        java.util.Locale locale15 = new java.util.Locale("java.io.IOException: ita", "java.io.IOException: UTC");
        java.lang.String str16 = locale12.getDisplayScript(locale15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(3600000L, chronology10, locale15, (java.lang.Integer) 59);
        java.lang.Integer int19 = dateTimeParserBucket18.getOffsetInteger();
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals(locale12.toString(), "2");
        org.junit.Assert.assertEquals(locale15.toString(), "java.io.ioexception: ita_JAVA.IO.IOEXCEPTION: UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(int19);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(11675);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setScript("");
        java.util.Locale.Builder builder6 = builder3.setExtension('u', "ko-KR");
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("Germany");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("Italian");
        java.util.Locale.Builder builder12 = builder9.clearExtensions();
        java.util.Locale.Builder builder14 = builder12.removeUnicodeLocaleAttribute("1969");
        java.util.Locale.Builder builder15 = builder14.clearExtensions();
        java.util.Locale.Builder builder16 = builder15.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder15.removeUnicodeLocaleAttribute("\u5fb7\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        java.util.Locale locale2 = new java.util.Locale("99", "\u30a4\u30bf\u30ea\u30a2\u8a9e");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for 99");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u30a4\u30bf\u30ea\u30a2\u8a9e");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone9.getOffset(readableInstant12);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 3599999L);
        java.lang.String str17 = dateTimeZone1.getName((long) 12);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = locale19.getISO3Country();
        java.lang.String str21 = locale19.getISO3Language();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale19.getDisplayVariant(locale22);
        java.lang.String str24 = dateTimeZone1.getShortName((long) 4969628, locale19);
        java.lang.String str25 = locale19.getLanguage();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3599999L + "'", long15 == 3599999L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(locale19);
// flaky:         org.junit.Assert.assertEquals(locale19.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zho" + "'", str21, "zho");
        org.junit.Assert.assertNotNull(locale22);
// flaky:         org.junit.Assert.assertEquals(locale22.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh" + "'", str25, "zh");
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        java.io.IOException iOException1 = new java.io.IOException("ko-KR");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: ko-KR" + "'", str2, "java.io.IOException: ko-KR");
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        java.lang.Throwable throwable3 = null;
        java.io.IOException iOException4 = new java.io.IOException("UTC", throwable3);
        java.io.IOException iOException5 = new java.io.IOException(throwable3);
        java.io.IOException iOException6 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException5);
        java.lang.Throwable[] throwableArray7 = iOException6.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("cinese", (java.lang.Throwable) iOException6);
        java.io.IOException iOException10 = new java.io.IOException("DE");
        iOException8.addSuppressed((java.lang.Throwable) iOException10);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        java.lang.String str1 = dateTimeFieldType0.getName();
        java.lang.String str2 = dateTimeFieldType0.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "dayOfWeek" + "'", str1, "dayOfWeek");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "dayOfWeek" + "'", str2, "dayOfWeek");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder1.setRegion("ko");
        java.util.Locale.Builder builder10 = builder9.clearExtensions();
        java.util.Locale.Builder builder13 = builder9.setExtension('x', "French");
        java.util.Locale.Builder builder16 = builder9.setExtension('u', "Cina");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder9.setUnicodeLocaleKeyword("java.io.IOException: java.io.IOException", "java.io.IOException: zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: java.io.IOException: java.io.IOException [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Italian", (double) (-55540245599966L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-5.5540245599966E13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setLanguageTag("year");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("UTC");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("KOR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setRegion("18000000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 18000000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        java.io.IOException iOException2 = new java.io.IOException("UTC");
        java.io.IOException iOException4 = new java.io.IOException("zho");
        iOException2.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException6 = new java.io.IOException("2", (java.lang.Throwable) iOException2);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        java.lang.String str8 = iOException7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.io.IOException: java.io.IOException: 2" + "'", str8, "java.io.IOException: java.io.IOException: 2");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.DurationFieldType durationFieldType2 = dateTimeFieldType0.getDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "secondOfDay" + "'", str1, "secondOfDay");
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("ko-KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology3, locale4, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(100L, chronology1, locale4);
        int int8 = dateTimeParserBucket7.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket7.saveState();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        java.util.Locale.Builder builder14 = builder11.setExtension('a', "");
        java.util.Locale.Builder builder16 = builder11.setLanguage("ita");
        java.util.Locale.Builder builder17 = builder11.clearExtensions();
        java.util.Locale.Builder builder19 = builder17.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder21 = builder19.setLanguageTag("cinese");
        boolean boolean22 = dateTimeParserBucket7.restoreState((java.lang.Object) builder21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder21.setUnicodeLocaleKeyword("USA", "DEUTSCH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: USA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        java.util.Locale locale2 = new java.util.Locale("zh-tw", "UTC");
        org.junit.Assert.assertEquals(locale2.toString(), "zh-tw_UTC");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 100);
        long long6 = dateTimeZone1.convertUTCToLocal((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-292122054L));
        java.lang.String str12 = dateTimeZone1.getName(0L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(69);
        boolean boolean15 = dateTimeZone14.isFixed();
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, (-61851599999991L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-61851600000060L) + "'", long17 == (-61851600000060L));
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        dateTimeParserBucket6.setOffset((int) (short) 100);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = chronology9.get(readablePeriod10, (long) 53, 124416041759566L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("jpn");
        java.util.Locale.Builder builder11 = builder7.setLanguageTag("ita");
        java.util.Locale.Builder builder12 = builder7.clear();
        java.util.Locale.Builder builder13 = builder12.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        java.util.Locale locale2 = new java.util.Locale("Oct", "minuteOfDay");
        org.junit.Assert.assertEquals(locale2.toString(), "oct_MINUTEOFDAY");
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        java.lang.String str5 = dateTimeZone1.getName(10540800087L);
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder11 = builder8.setExtension('a', "");
        java.util.Locale.Builder builder13 = builder8.setLanguage("ita");
        java.util.Locale.Builder builder14 = builder8.clear();
        java.util.Locale locale15 = builder8.build();
        java.util.Locale.Builder builder16 = builder8.clear();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = builder16.build();
        java.lang.String str19 = dateTimeZone1.getName(0L, locale18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale3 = new java.util.Locale("");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'u', chronology1, locale3, (java.lang.Integer) 1, 0);
        dateTimeParserBucket6.setOffset((int) (short) 100);
        dateTimeParserBucket6.setOffset(8);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getRangeDurationType();
        java.lang.String str13 = dateTimeFieldType11.toString();
        dateTimeParserBucket6.saveField(dateTimeFieldType11, (int) 'u');
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology19, locale20, (java.lang.Integer) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(100L, chronology17, locale20);
        java.lang.Object obj24 = dateTimeParserBucket23.saveState();
        dateTimeParserBucket23.setOffset((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.util.Locale locale29 = java.util.Locale.US;
        dateTimeParserBucket23.saveField(dateTimeFieldType27, "centuryOfEra", locale29);
        java.lang.String str31 = dateTimeFieldType27.getName();
        java.lang.String str32 = dateTimeFieldType27.getName();
        java.util.Locale locale37 = new java.util.Locale("weekOfWeekyear", "UTC", "+00:00");
        boolean boolean38 = locale37.hasExtensions();
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale41 = java.util.Locale.getDefault();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology40, locale41, (java.lang.Integer) 100);
        java.lang.String str44 = locale37.getDisplayCountry(locale41);
        java.util.Locale locale45 = locale41.stripExtensions();
        java.lang.String str46 = locale45.getVariant();
        dateTimeParserBucket6.saveField(dateTimeFieldType27, "\u82f1\u6587", locale45);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTimeParserBucket6.getZone();
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "weekOfWeekyear" + "'", str13, "weekOfWeekyear");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "zh");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "yearOfCentury" + "'", str31, "yearOfCentury");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "yearOfCentury" + "'", str32, "yearOfCentury");
        org.junit.Assert.assertEquals(locale37.toString(), "weekofweekyear_UTC_+00:00");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertNotNull(locale45);
// flaky:         org.junit.Assert.assertEquals(locale45.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(dateTimeZone48);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        java.io.IOException iOException2 = new java.io.IOException("utc");
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.lang.Throwable throwable10 = null;
        java.io.IOException iOException11 = new java.io.IOException("UTC", throwable10);
        java.io.IOException iOException12 = new java.io.IOException(throwable10);
        java.io.IOException iOException13 = new java.io.IOException("weekyear", (java.lang.Throwable) iOException12);
        java.lang.Throwable[] throwableArray14 = iOException13.getSuppressed();
        java.io.IOException iOException15 = new java.io.IOException("cinese", (java.lang.Throwable) iOException13);
        java.io.IOException iOException16 = new java.io.IOException("ISOChronology[+00:00:00.010]", (java.lang.Throwable) iOException15);
        java.io.IOException iOException17 = new java.io.IOException("DateTimeField[year]", (java.lang.Throwable) iOException15);
        iOException4.addSuppressed((java.lang.Throwable) iOException15);
        java.io.IOException iOException19 = new java.io.IOException("java.io.IOException: en-CA", (java.lang.Throwable) iOException4);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(52);
        java.lang.String str3 = dateTimeZone1.getName(3084498754800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.052" + "'", str3, "+00:00:00.052");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale.Builder builder7 = builder1.clear();
        java.util.Locale locale8 = builder1.build();
        java.util.Locale.Builder builder11 = builder1.setExtension('x', "28");
        java.util.Locale.Builder builder13 = builder11.removeUnicodeLocaleAttribute("zho");
        java.lang.Class<?> wildcardClass14 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setExtension('a', "");
        java.util.Locale.Builder builder6 = builder1.setLanguage("ita");
        java.util.Locale locale7 = builder6.build();
        boolean boolean8 = locale7.hasExtensions();
        java.util.Locale locale9 = locale7.stripExtensions();
        java.lang.String str10 = locale7.getISO3Country();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ita");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ita");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(99, 3);
        int int4 = dateTimeZone2.getStandardOffset(1860087L);
        long long6 = dateTimeZone2.previousTransition(70000L);
        java.lang.String str8 = dateTimeZone2.getName((-61851599999991L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 356580000 + "'", int4 == 356580000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 70000L + "'", long6 == 70000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+99:03" + "'", str8, "+99:03");
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.getID();
        long long4 = dateTimeZone1.previousTransition((long) 'a');
        boolean boolean5 = dateTimeZone1.isFixed();
        int int7 = dateTimeZone1.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone9.getOffset(readableInstant12);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 3599999L);
        int int17 = dateTimeZone9.getOffset((-55540245599966L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3599999L + "'", long15 == 3599999L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }
}
