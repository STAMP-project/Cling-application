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
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        java.lang.String str9 = localDateTime7.toString();
        int int10 = localDateTime7.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.weekyear();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plus(readableDuration22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withMinuteOfHour(0);
        java.util.Locale locale29 = new java.util.Locale("\u5927\u97d3\u6c11\u56fd");
        java.lang.String str30 = dateTimeField14.getAsShortText((org.joda.time.ReadablePartial) localDateTime23, locale29);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = localDateTime23.getFieldType((int) (byte) 0);
        int int33 = localDateTime7.get(dateTimeFieldType32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime7.era();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime7.withYearOfEra(19559183);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 1);
        int int39 = localDateTime38.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.minusHours((int) (byte) -1);
        int int43 = localDateTime38.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime38.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime38.minus(readablePeriod46);
        int int48 = localDateTime47.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 1);
        int int51 = localDateTime50.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.minusHours((int) (byte) -1);
        int int55 = localDateTime50.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime50.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime50.minus(readablePeriod58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime50.millisOfSecond();
        long long61 = property60.remainder();
        java.lang.String str62 = property60.getName();
        java.util.Locale locale63 = java.util.Locale.CHINA;
        java.lang.String str64 = property60.getAsText(locale63);
        org.joda.time.LocalDateTime localDateTime65 = property60.withMinimumValue();
        boolean boolean67 = property60.equals((java.lang.Object) 59);
        org.joda.time.LocalDateTime localDateTime68 = property60.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((long) 1);
        int int71 = localDateTime70.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime70.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.withPeriodAdded(readablePeriod74, 10);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.withDayOfYear(11);
        org.joda.time.Chronology chronology79 = localDateTime78.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = localDateTime78.getFieldType((int) (byte) 0);
        int int82 = localDateTime68.indexOf(dateTimeFieldType81);
        int int83 = localDateTime47.get(dateTimeFieldType81);
        boolean boolean84 = localDateTime7.equals((java.lang.Object) localDateTime47);
        org.joda.time.LocalDateTime.Property property85 = localDateTime7.secondOfMinute();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01T00:25:00.001" + "'", str9, "1970-01-01T00:25:00.001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertEquals(locale29.toString(), "\u5927\u97d3\u6c11\u56fd");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "100" + "'", str30, "100");
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1970 + "'", int33 == 1970);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 70 + "'", int48 == 70);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "millisOfSecond" + "'", str62, "millisOfSecond");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "1" + "'", str64, "1");
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(localDateTime68);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertNotNull(dateTimeFieldType81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1970 + "'", int83 == 1970);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(property85);
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology2.getZone();
        java.lang.String str7 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.era();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours((int) (byte) -1);
        int int14 = localDateTime10.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withYear(19);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withPeriodAdded(readablePeriod19, 10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusDays(2922789);
        java.util.Locale locale27 = new java.util.Locale("ja_JP", "\u4e2d\u56fd\u8a9e");
        java.util.Locale locale28 = locale27.stripExtensions();
        java.util.Locale locale29 = locale28.stripExtensions();
        java.lang.String str30 = dateTimeField8.getAsText((org.joda.time.ReadablePartial) localDateTime23, 575, locale29);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int38 = localDateTime37.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.hourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = property39.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.plusMinutes(14);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.millisOfDay();
        java.lang.String str46 = localDateTime44.toString();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime23.withFields((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime23.minus(readablePeriod48);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IslamicChronology[+01:00]" + "'", str7, "IslamicChronology[+01:00]");
        org.junit.Assert.assertNotNull(dateTimeField8);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(locale28);
// flaky:         org.junit.Assert.assertEquals(locale28.toString(), "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertNotNull(locale29);
// flaky:         org.junit.Assert.assertEquals(locale29.toString(), "\u4e2d\u56fd\u8a9e");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "575" + "'", str30, "575");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0100-10-14T04:14:32.000" + "'", str46, "0100-10-14T04:14:32.000");
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        java.lang.String str10 = dateTimeZone6.getName(70L);
        int int12 = dateTimeZone6.getOffsetFromLocal((long) 12);
        int int14 = dateTimeZone6.getOffsetFromLocal(10800001L);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:00" + "'", str10, "+01:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3600000 + "'", int12 == 3600000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3600000 + "'", int14 == 3600000);
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 1);
        int int5 = localDateTime4.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = localDateTime7.getFields();
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        long long13 = dateTimeZone1.previousTransition((long) 24);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int int16 = localDateTime15.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localDateTime15.toDateTime(dateTimeZone20);
        java.lang.String str23 = dateTimeZone20.getID();
        java.util.TimeZone timeZone24 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        org.joda.time.DurationField durationField28 = islamicChronology27.weekyears();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology27.halfdayOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType30 = islamicChronology27.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20, leapYearPatternType30);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType30);
        java.lang.String str33 = islamicChronology32.toString();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology32.clockhourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 24L + "'", long13 == 24L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(islamicChronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+01:00" + "'", str23, "+01:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(islamicChronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(leapYearPatternType30);
        org.junit.Assert.assertNotNull(islamicChronology31);
        org.junit.Assert.assertNotNull(islamicChronology32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "IslamicChronology[+01:00]" + "'", str33, "IslamicChronology[+01:00]");
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        boolean boolean5 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet4);
        boolean boolean6 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet2);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale locale10 = java.util.Locale.JAPAN;
        java.lang.String str11 = locale10.getVariant();
        java.util.Locale locale12 = java.util.Locale.JAPAN;
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.lang.String str14 = locale13.getCountry();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale10, locale12, locale13, locale15, locale16 };
        java.util.ArrayList<java.util.Locale> localeList19 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList19, localeArray18);
        java.util.Locale.FilteringMode filteringMode21 = null;
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList19, filteringMode21);
        boolean boolean23 = strSet2.remove((java.lang.Object) localeList19);
        boolean boolean24 = strSet2.isEmpty();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        int int31 = localDateTime26.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime26.minus(readablePeriod34);
        int int36 = localDateTime35.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = localDateTime35.getField(0);
        boolean boolean39 = strSet2.remove((java.lang.Object) 0);
        java.util.Locale locale40 = java.util.Locale.KOREA;
        java.util.Locale locale41 = java.util.Locale.KOREA;
        java.lang.String str42 = locale40.getDisplayLanguage(locale41);
        java.lang.String str43 = locale41.getISO3Country();
        java.util.Set<java.lang.String> strSet44 = locale41.getUnicodeLocaleAttributes();
        boolean boolean45 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet44);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology48 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology48.yearOfCentury();
        org.joda.time.DurationField durationField50 = islamicChronology48.years();
        org.joda.time.DurationField durationField51 = islamicChronology48.halfdays();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology48.hourOfHalfday();
        org.joda.time.DurationField durationField53 = islamicChronology48.hours();
        boolean boolean54 = strSet44.remove((java.lang.Object) islamicChronology48);
        org.joda.time.DurationField durationField55 = islamicChronology48.centuries();
        org.joda.time.DateTimeField dateTimeField56 = islamicChronology48.monthOfYear();
        org.joda.time.DurationField durationField57 = islamicChronology48.centuries();
        org.joda.time.DateTimeField dateTimeField58 = islamicChronology48.clockhourOfDay();
        java.lang.String str59 = dateTimeField58.toString();
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FR" + "'", str14, "FR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(localeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str42, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "KOR" + "'", str43, "KOR");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(islamicChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "DateTimeField[clockhourOfDay]" + "'", str59, "DateTimeField[clockhourOfDay]");
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition(29238815001L);
        java.lang.String str5 = dateTimeZone1.getNameKey((long) 26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 29238815001L + "'", long3 == 29238815001L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int3 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.secondOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology2.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusHours((int) (byte) -1);
        int int17 = localDateTime12.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime12.minus(readablePeriod20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime12.millisOfSecond();
        long long23 = property22.remainder();
        java.lang.String str24 = property22.getName();
        int int25 = property22.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime27 = property22.addWrapFieldToCopy(70);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29);
        org.joda.time.DurationField durationField31 = islamicChronology30.weekyears();
        org.joda.time.DurationField durationField32 = islamicChronology30.halfdays();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology30.yearOfEra();
        org.joda.time.DurationField durationField34 = islamicChronology30.halfdays();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology30);
        boolean boolean36 = property22.equals((java.lang.Object) localDateTime35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime35.weekyear();
        int[] intArray39 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime35, 262860001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "millisOfSecond" + "'", str24, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(islamicChronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[1389, 10, 25, 7260001]");
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField7 = islamicChronology2.centuries();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        int int10 = localDateTime9.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDateTime9.toDateTime(dateTimeZone14);
        long long20 = dateTimeZone14.convertLocalToUTC(0L, true, (-4320000001L));
        java.lang.String str22 = dateTimeZone14.getNameKey((long) 1443);
        org.joda.time.Chronology chronology23 = islamicChronology2.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField24 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3600000L) + "'", long20 == (-3600000L));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getName();
        int int14 = property11.getMinimumValueOverall();
        int int15 = property11.getMinimumValue();
        java.lang.String str16 = property11.toString();
        org.joda.time.LocalDateTime localDateTime17 = property11.withMaximumValue();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.minuteOfHour();
        java.lang.String str19 = property18.getName();
        java.lang.String str20 = property18.getAsString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "millisOfSecond" + "'", str13, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Property[millisOfSecond]" + "'", str16, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "minuteOfHour" + "'", str19, "minuteOfHour");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.millisOfDay();
        java.lang.String str10 = islamicChronology2.toString();
        org.joda.time.DurationField durationField11 = islamicChronology2.centuries();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IslamicChronology[+01:00]" + "'", str6, "IslamicChronology[+01:00]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IslamicChronology[+01:00]" + "'", str10, "IslamicChronology[+01:00]");
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.millisOfSecond();
        java.util.Locale locale11 = java.util.Locale.JAPAN;
        java.lang.String str12 = locale11.getVariant();
        java.lang.String str13 = dateTimeField9.getAsShortText(15272000, locale11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "15272000" + "'", str13, "15272000");
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale locale5 = java.util.Locale.JAPAN;
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.lang.String str7 = locale6.getCountry();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale[] localeArray11 = new java.util.Locale[] { locale3, locale5, locale6, locale8, locale9 };
        java.util.ArrayList<java.util.Locale> localeList12 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList12, localeArray11);
        java.util.Locale.FilteringMode filteringMode14 = null;
        java.util.List<java.util.Locale> localeList15 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList12, filteringMode14);
        java.util.Set<java.lang.String> strSet16 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleAttributes();
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        boolean boolean21 = strSet18.removeAll((java.util.Collection<java.lang.String>) strSet20);
        boolean boolean22 = strSet16.addAll((java.util.Collection<java.lang.String>) strSet18);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Locale locale26 = java.util.Locale.JAPAN;
        java.lang.String str27 = locale26.getVariant();
        java.util.Locale locale28 = java.util.Locale.JAPAN;
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.lang.String str30 = locale29.getCountry();
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleAttributes();
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale26, locale28, locale29, locale31, locale32 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.Locale.FilteringMode filteringMode37 = null;
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList35, filteringMode37);
        boolean boolean39 = strSet18.remove((java.lang.Object) localeList35);
        java.util.Locale locale40 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap41 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList42 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap41);
        java.util.Collection<java.util.Locale> localeCollection43 = null;
        java.util.List<java.util.Locale> localeList44 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection43);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap45 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList46 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap45);
        java.util.Set<java.lang.String> strSet47 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.stream.Stream<java.lang.String> strStream48 = strSet47.stream();
        java.util.Spliterator<java.lang.String> strSpliterator49 = strSet47.spliterator();
        java.lang.String[] strArray64 = new java.lang.String[] { "1970-01-01T00:25:00.001", "+01:00", "", "JPN", "jpn", "19", "1970", "10", "", "FR", "10", "0", "millis", "DurationField[seconds]" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        boolean boolean67 = strSet65.isEmpty();
        java.lang.Object[] objArray68 = strSet65.toArray();
        boolean boolean69 = strSet47.containsAll((java.util.Collection<java.lang.String>) strSet65);
        java.util.Spliterator<java.lang.String> strSpliterator70 = strSet65.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray71 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList72 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList72, languageRangeArray71);
        java.util.Locale locale74 = java.util.Locale.JAPAN;
        java.lang.String str75 = locale74.getVariant();
        java.util.Locale locale76 = java.util.Locale.JAPAN;
        java.util.Locale locale77 = java.util.Locale.FRANCE;
        java.lang.String str78 = locale77.getCountry();
        java.util.Locale locale79 = java.util.Locale.GERMAN;
        java.util.Locale locale80 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet81 = locale80.getUnicodeLocaleAttributes();
        java.util.Locale[] localeArray82 = new java.util.Locale[] { locale74, locale76, locale77, locale79, locale80 };
        java.util.ArrayList<java.util.Locale> localeList83 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList83, localeArray82);
        java.util.Locale.FilteringMode filteringMode85 = null;
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList72, (java.util.Collection<java.util.Locale>) localeList83, filteringMode85);
        java.util.Locale locale87 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet88 = locale87.getUnicodeLocaleAttributes();
        java.util.Locale locale89 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet90 = locale89.getUnicodeLocaleAttributes();
        boolean boolean91 = strSet88.removeAll((java.util.Collection<java.lang.String>) strSet90);
        java.lang.Object[] objArray92 = strSet88.toArray();
        boolean boolean94 = strSet88.equals((java.lang.Object) 342000000L);
        java.util.Locale.FilteringMode filteringMode95 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList96 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList72, (java.util.Collection<java.lang.String>) strSet88, filteringMode95);
        java.util.List<java.lang.String> strList97 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet65, filteringMode95);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FR" + "'", str7, "FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(localeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localeList15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "FR" + "'", str30, "FR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localeList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(locale40);
        org.junit.Assert.assertNotNull(languageRangeList42);
        org.junit.Assert.assertNotNull(localeList44);
        org.junit.Assert.assertNotNull(languageRangeList46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strStream48);
        org.junit.Assert.assertNotNull(strSpliterator49);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[1970-01-01T00:25:00.001, +01:00, , JPN, jpn, 19, 1970, 10, FR, 0, millis, DurationField[seconds]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[1970-01-01T00:25:00.001, +01:00, , JPN, jpn, 19, 1970, 10, FR, 0, millis, DurationField[seconds]]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strSpliterator70);
        org.junit.Assert.assertNotNull(languageRangeArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "FR" + "'", str78, "FR");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "de");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNotNull(localeArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(localeList86);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + filteringMode95 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode95.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList96);
        org.junit.Assert.assertNotNull(strList97);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.months();
        org.joda.time.DurationField durationField3 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis(6, (int) (byte) 0, 2023, (-25831));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -25831 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.minus(readableDuration10);
        int int12 = localDateTime1.getSecondOfMinute();
        int int13 = localDateTime1.getDayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime1.withPeriodAdded(readablePeriod14, 0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime1.minusWeeks(43);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20);
        org.joda.time.DurationField durationField22 = islamicChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology21.millisOfSecond();
        java.lang.String str25 = islamicChronology21.toString();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology21.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 45);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(dateTimeZone30);
        java.lang.String str32 = dateTimeZone30.toString();
        org.joda.time.Chronology chronology33 = islamicChronology21.withZone(dateTimeZone30);
        boolean boolean34 = localDateTime1.equals((java.lang.Object) islamicChronology21);
        org.joda.time.LocalDateTime.Property property35 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime1.withYearOfEra(70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(islamicChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "IslamicChronology[+01:00]" + "'", str25, "IslamicChronology[+01:00]");
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:45" + "'", str32, "+00:45");
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("");
        boolean boolean4 = timeZone1.hasSameRules(timeZone3);
        timeZone1.setRawOffset(355);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long10 = dateTimeZone8.convertUTCToLocal((-1L));
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 45);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = islamicChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology5.millisOfSecond();
        long long11 = islamicChronology5.add((long) (byte) -1, (long) 0, (int) (byte) 10);
        boolean boolean12 = dateTimeZone2.equals((java.lang.Object) long11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        java.util.Locale locale7 = new java.util.Locale("");
        java.lang.String str8 = locale7.getISO3Language();
        int int9 = dateTimeField5.getMaximumShortTextLength(locale7);
        long long11 = dateTimeField5.roundHalfEven((long) ' ');
        org.joda.time.DurationField durationField12 = dateTimeField5.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology15.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology15.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19);
        org.joda.time.DurationField durationField21 = islamicChronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology20.yearOfEra();
        long long24 = dateTimeField22.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        int int30 = localDateTime26.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime26.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime26.minus(readableDuration35);
        java.util.Locale locale37 = java.util.Locale.PRC;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.lang.String str39 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) localDateTime36, locale37);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.plusMillis(9);
        java.util.Locale locale42 = null;
        java.lang.String str43 = dateTimeField17.getAsText((org.joda.time.ReadablePartial) localDateTime41, locale42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.withHourOfDay(0);
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.lang.String str47 = locale46.getScript();
        java.lang.String str48 = dateTimeField5.getAsText((org.joda.time.ReadablePartial) localDateTime41, locale46);
        java.lang.String str49 = locale46.getISO3Country();
        java.lang.String str50 = locale46.toLanguageTag();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5785200000L + "'", long11 == 5785200000L);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(islamicChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5785200000L + "'", long24 == 5785200000L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970" + "'", str39, "1970");
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "60" + "'", str43, "60");
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "de");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "1970" + "'", str48, "1970");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "de" + "'", str50, "de");
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology2.getZone();
        int int7 = dateTimeZone5.getOffsetFromLocal(19800L);
        java.lang.String str8 = dateTimeZone5.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        boolean boolean11 = dateTimeZone5.isStandardOffset((long) 86399);
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3600000 + "'", int7 == 3600000);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(islamicChronology12);
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        java.util.Locale locale3 = new java.util.Locale("1970-01-01T01:00:00.100Z", "Japanisch", "English");
        org.junit.Assert.assertEquals(locale3.toString(), "1970-01-01t01:00:00.100z_JAPANISCH_English");
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.DurationField durationField26 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long30 = dateTimeField27.set(0L, (-86399999));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -86399999 for weekyearOfCentury must be in the range [1,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology2.millis();
        java.lang.String str7 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) islamicChronology2);
        org.joda.time.DurationField durationField11 = islamicChronology2.weekyears();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IslamicChronology[+01:00]" + "'", str7, "IslamicChronology[+01:00]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        java.lang.String[] strArray8 = new java.lang.String[] { "millisOfSecond", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", "KOR", "FR", "\u5927\u97d3\u6c11\u56fd", "\u5927\u97d3\u6c11\u56fd", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        int int11 = strSet9.size();
        java.util.Set<java.lang.String> strSet12 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        boolean boolean17 = strSet14.removeAll((java.util.Collection<java.lang.String>) strSet16);
        boolean boolean18 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet14);
        boolean boolean19 = strSet9.retainAll((java.util.Collection<java.lang.String>) strSet12);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        int int22 = localDateTime21.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusHours((int) (byte) -1);
        int int25 = localDateTime21.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.minusMinutes((int) '#');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29);
        org.joda.time.DurationField durationField31 = islamicChronology30.weekyears();
        org.joda.time.DurationField durationField32 = islamicChronology30.halfdays();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology30.yearOfEra();
        org.joda.time.DurationField durationField34 = islamicChronology30.halfdays();
        org.joda.time.DurationFieldType durationFieldType35 = durationField34.getType();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime21.withFieldAdded(durationFieldType35, (int) (short) 0);
        boolean boolean38 = strSet9.remove((java.lang.Object) localDateTime37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withMillisOfSecond(5);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.weekyear();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.plusMinutes(3600060);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(islamicChronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Spliterator<java.lang.String> strSpliterator3 = strSet2.spliterator();
        java.util.Set<java.lang.String> strSet4 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleAttributes();
        boolean boolean9 = strSet6.removeAll((java.util.Collection<java.lang.String>) strSet8);
        boolean boolean10 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet6);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale locale14 = java.util.Locale.JAPAN;
        java.lang.String str15 = locale14.getVariant();
        java.util.Locale locale16 = java.util.Locale.JAPAN;
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.lang.String str18 = locale17.getCountry();
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet21 = locale20.getUnicodeLocaleAttributes();
        java.util.Locale[] localeArray22 = new java.util.Locale[] { locale14, locale16, locale17, locale19, locale20 };
        java.util.ArrayList<java.util.Locale> localeList23 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList23, localeArray22);
        java.util.Locale.FilteringMode filteringMode25 = null;
        java.util.List<java.util.Locale> localeList26 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList23, filteringMode25);
        boolean boolean27 = strSet6.remove((java.lang.Object) localeList23);
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet29 = locale28.getUnicodeLocaleAttributes();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleAttributes();
        boolean boolean32 = strSet29.removeAll((java.util.Collection<java.lang.String>) strSet31);
        boolean boolean33 = strSet6.addAll((java.util.Collection<java.lang.String>) strSet29);
        java.util.stream.Stream<java.lang.String> strStream34 = strSet6.parallelStream();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.DurationField durationField38 = islamicChronology37.weekyears();
        org.joda.time.DurationField durationField39 = islamicChronology37.months();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology37.minuteOfHour();
        org.joda.time.DurationField durationField41 = islamicChronology37.seconds();
        java.lang.String str42 = durationField41.toString();
        boolean boolean43 = strSet6.equals((java.lang.Object) durationField41);
        boolean boolean44 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet6);
        java.util.stream.Stream<java.lang.String> strStream45 = strSet2.parallelStream();
        java.lang.Object[] objArray46 = strSet2.toArray();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSpliterator3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "FR" + "'", str18, "FR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "de");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(localeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(localeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strStream34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(islamicChronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "DurationField[seconds]" + "'", str42, "DurationField[seconds]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strStream45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField5 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.minuteOfDay();
        long long12 = dateTimeField10.remainder((-3599900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.parse("seconds", strMap2);
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        java.util.Locale locale7 = java.util.Locale.JAPAN;
        java.lang.String str8 = locale7.getVariant();
        java.util.Locale locale9 = java.util.Locale.JAPAN;
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = locale10.getCountry();
        java.util.Locale locale12 = java.util.Locale.GERMAN;
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        java.util.Locale[] localeArray15 = new java.util.Locale[] { locale7, locale9, locale10, locale12, locale13 };
        java.util.ArrayList<java.util.Locale> localeList16 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList16, localeArray15);
        java.util.Locale.FilteringMode filteringMode18 = null;
        java.util.List<java.util.Locale> localeList19 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList16, filteringMode18);
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale22 = new java.util.Locale("");
        java.lang.String str23 = locale22.getISO3Language();
        java.util.Locale locale24 = java.util.Locale.ITALIAN;
        java.util.Locale locale26 = new java.util.Locale("");
        java.lang.String str27 = locale26.getISO3Language();
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet29 = locale28.getUnicodeLocaleAttributes();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale30.getDisplayLanguage(locale31);
        java.lang.String str33 = locale31.getISO3Country();
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale35 = java.util.Locale.PRC;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.util.Locale locale37 = java.util.Locale.PRC;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.lang.String str39 = locale37.getScript();
        java.util.Locale locale40 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet41 = locale40.getUnicodeLocaleAttributes();
        java.util.Locale locale42 = java.util.Locale.PRC;
        java.util.Locale locale43 = locale42.stripExtensions();
        java.lang.String str44 = locale42.getScript();
        java.util.Locale locale46 = new java.util.Locale("");
        java.util.Locale locale47 = java.util.Locale.PRC;
        java.util.Locale locale48 = locale47.stripExtensions();
        java.util.Locale locale49 = java.util.Locale.KOREA;
        java.util.Locale locale50 = java.util.Locale.KOREA;
        java.lang.String str51 = locale49.getDisplayLanguage(locale50);
        java.util.Locale.setDefault(locale49);
        java.util.Locale locale53 = java.util.Locale.ITALIAN;
        java.util.Locale locale54 = java.util.Locale.KOREA;
        java.util.Locale locale55 = java.util.Locale.KOREA;
        java.lang.String str56 = locale54.getDisplayLanguage(locale55);
        java.lang.String str57 = locale55.getISO3Country();
        java.util.Locale locale58 = java.util.Locale.KOREA;
        java.util.Locale locale59 = java.util.Locale.KOREA;
        java.lang.String str60 = locale58.getDisplayLanguage(locale59);
        java.util.Locale.setDefault(locale58);
        java.util.Locale locale62 = java.util.Locale.JAPAN;
        java.lang.String str63 = locale58.getDisplayCountry(locale62);
        java.util.Locale locale64 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet65 = locale64.getUnicodeLocaleAttributes();
        java.util.Locale locale66 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale67 = java.util.Locale.FRANCE;
        java.util.Locale locale68 = java.util.Locale.KOREA;
        java.util.Locale locale69 = java.util.Locale.KOREA;
        java.lang.String str70 = locale68.getDisplayLanguage(locale69);
        java.util.Locale.setDefault(locale68);
        java.util.Locale locale72 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet73 = locale72.getUnicodeLocaleAttributes();
        java.util.Locale locale74 = java.util.Locale.KOREA;
        java.util.Locale locale75 = java.util.Locale.KOREA;
        java.lang.String str76 = locale74.getDisplayLanguage(locale75);
        java.lang.String str77 = locale75.getISO3Country();
        java.util.Locale locale78 = java.util.Locale.KOREA;
        java.util.Locale locale79 = java.util.Locale.KOREA;
        java.lang.String str80 = locale78.getDisplayLanguage(locale79);
        java.lang.String str81 = locale79.getISO3Country();
        java.util.Locale locale82 = java.util.Locale.ITALY;
        java.util.Locale locale83 = java.util.Locale.KOREA;
        java.util.Locale locale85 = new java.util.Locale("");
        java.lang.String str86 = locale85.getISO3Language();
        java.util.Locale[] localeArray87 = new java.util.Locale[] { locale20, locale22, locale24, locale26, locale28, locale31, locale34, locale35, locale37, locale40, locale42, locale46, locale48, locale49, locale53, locale55, locale58, locale64, locale66, locale67, locale68, locale72, locale75, locale79, locale82, locale83, locale85 };
        java.util.ArrayList<java.util.Locale> localeList88 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList88, localeArray87);
        java.util.Locale locale90 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList5, (java.util.Collection<java.util.Locale>) localeList88);
        java.util.Locale.FilteringMode filteringMode91 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter(languageRangeList3, (java.util.Collection<java.util.Locale>) localeList88, filteringMode91);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale93 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FR" + "'", str11, "FR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(localeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localeList19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it");
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str32, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "KOR" + "'", str33, "KOR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str51, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "it");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str56, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "KOR" + "'", str57, "KOR");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str60, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u5927\u97d3\u6c11\u56fd" + "'", str63, "\u5927\u97d3\u6c11\u56fd");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str70, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str76, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "KOR" + "'", str77, "KOR");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str80, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "KOR" + "'", str81, "KOR");
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "ko_KR");
        org.junit.Assert.assertEquals(locale85.toString(), "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(localeArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNull(locale90);
        org.junit.Assert.assertTrue("'" + filteringMode91 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode91.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList92);
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eras");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        double double7 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eras" + "'", str3, "eras");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "eras" + "'", str4, "eras");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "FR");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale.Builder builder8 = builder5.setExtension('a', "11");
        java.util.Locale.Builder builder9 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder9.setVariant("");
        java.util.Locale locale12 = java.util.Locale.PRC;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.lang.String str14 = locale12.getScript();
        java.util.Locale.Builder builder15 = builder9.setLocale(locale12);
        java.util.Locale locale16 = builder15.build();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.lang.String str18 = locale16.getLanguage();
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.lang.String str21 = locale19.getDisplayLanguage(locale20);
        java.util.Set<java.lang.String> strSet22 = locale19.getUnicodeLocaleKeys();
        java.lang.String str23 = locale16.getDisplayLanguage(locale19);
        java.util.Set<java.lang.String> strSet24 = locale16.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet25 = locale16.getExtensionKeys();
        java.util.Locale.Builder builder26 = builder5.setLocale(locale16);
        java.util.Locale.Builder builder27 = builder26.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder29 = builder26.setLanguageTag("\u610f\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh" + "'", str18, "zh");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str21, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str23, "\uc911\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(charSet25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, (long) (short) 1, 411199);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = islamicChronology14.weekyears();
        org.joda.time.DurationField durationField16 = islamicChronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology14.yearOfEra();
        org.joda.time.DurationField durationField18 = islamicChronology14.halfdays();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology14);
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology14.yearOfEra();
        java.util.Locale locale21 = java.util.Locale.US;
        int int22 = dateTimeField20.getMaximumShortTextLength(locale21);
        java.lang.String str23 = locale21.getDisplayLanguage();
        java.lang.String str24 = dateTimeField10.getAsShortText((int) (short) 10, locale21);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\uc601\uc5b4" + "'", str23, "\uc601\uc5b4");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10" + "'", str24, "10");
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField5 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.weekOfWeekyear();
        org.joda.time.Chronology chronology10 = islamicChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = property10.withMaximumValue();
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder15 = builder12.setExtension('a', "FR");
        java.util.Locale.Builder builder17 = builder15.addUnicodeLocaleAttribute("KOR");
        java.util.Locale.Builder builder18 = builder17.clear();
        java.util.Locale locale19 = builder18.build();
        java.util.Locale locale20 = builder18.build();
        int int21 = property10.getMaximumShortTextLength(locale20);
        org.joda.time.LocalDateTime localDateTime23 = property10.addToCopy(5655600101L);
        int int24 = localDateTime23.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49 + "'", int24 == 49);
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder2.build();
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale.Builder builder6 = builder2.setLocale(locale5);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDateTime8.toDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        org.joda.time.DurationField durationField19 = islamicChronology18.weekyears();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21);
        boolean boolean24 = dateTimeZone21.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology25 = islamicChronology18.withZone(dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = islamicChronology18.add(readablePeriod26, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology18.dayOfMonth();
        boolean boolean31 = dateTimeZone13.equals((java.lang.Object) dateTimeField30);
        java.util.Locale.Category category33 = java.util.Locale.Category.DISPLAY;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology36 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone35);
        boolean boolean38 = dateTimeZone35.equals((java.lang.Object) 10L);
        java.util.Locale locale40 = java.util.Locale.JAPAN;
        java.lang.String str41 = locale40.getISO3Country();
        java.lang.String str42 = dateTimeZone35.getShortName(1970L, locale40);
        java.util.Set<java.lang.String> strSet43 = locale40.getUnicodeLocaleKeys();
        java.lang.String str44 = locale40.getCountry();
        java.util.Locale.setDefault(category33, locale40);
        java.lang.String str46 = dateTimeField30.getAsText(35L, locale40);
        java.util.Locale.Builder builder47 = builder2.setLocale(locale40);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(islamicChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(islamicChronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category33.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(islamicChronology36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "JPN" + "'", str41, "JPN");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+01:00" + "'", str42, "+01:00");
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "JP" + "'", str44, "JP");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "22" + "'", str46, "22");
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ko", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        java.lang.String[] strArray13 = new java.lang.String[] { "millisOfSecond", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", "KOR", "FR", "\u5927\u97d3\u6c11\u56fd", "\u5927\u97d3\u6c11\u56fd", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        int int16 = strSet14.size();
        strSet14.clear();
        java.lang.String str18 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet14);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleAttributes();
        boolean boolean23 = strSet20.removeAll((java.util.Collection<java.lang.String>) strSet22);
        java.util.stream.Stream<java.lang.String> strStream24 = strSet22.stream();
        strSet22.clear();
        strSet22.clear();
        java.lang.String str27 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet22);
        java.util.Collection<java.util.Locale> localeCollection28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale29 = java.util.Locale.lookup(languageRangeList2, localeCollection28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strStream24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder4 = builder3.clear();
        java.util.Locale locale5 = builder4.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        java.lang.String[] strArray8 = new java.lang.String[] { "millisOfSecond", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", "KOR", "FR", "\u5927\u97d3\u6c11\u56fd", "\u5927\u97d3\u6c11\u56fd", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        int int11 = strSet9.size();
        java.util.Set<java.lang.String> strSet12 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        boolean boolean17 = strSet14.removeAll((java.util.Collection<java.lang.String>) strSet16);
        boolean boolean18 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet14);
        boolean boolean19 = strSet9.retainAll((java.util.Collection<java.lang.String>) strSet12);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        int int22 = localDateTime21.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusHours((int) (byte) -1);
        int int25 = localDateTime21.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.minusMinutes((int) '#');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology30 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone29);
        org.joda.time.DurationField durationField31 = islamicChronology30.weekyears();
        org.joda.time.DurationField durationField32 = islamicChronology30.halfdays();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology30.yearOfEra();
        org.joda.time.DurationField durationField34 = islamicChronology30.halfdays();
        org.joda.time.DurationFieldType durationFieldType35 = durationField34.getType();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime21.withFieldAdded(durationFieldType35, (int) (short) 0);
        boolean boolean38 = strSet9.remove((java.lang.Object) localDateTime37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.plusHours(40);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.plusWeeks(82832);
        int int43 = localDateTime37.getYearOfCentury();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(islamicChronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 70 + "'", int43 == 70);
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getAsString();
        java.util.Locale.Builder builder14 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder14.setExtension('a', "FR");
        java.util.Locale.Builder builder19 = builder17.addUnicodeLocaleAttribute("KOR");
        java.util.Locale.Builder builder20 = builder19.clear();
        java.util.Locale locale21 = builder20.build();
        java.util.Locale locale22 = builder20.build();
        java.lang.String str23 = locale22.getDisplayLanguage();
        java.lang.String str24 = locale22.getCountry();
        java.lang.String str25 = property11.getAsShortText(locale22);
        java.util.Set<java.lang.String> strSet26 = locale22.getUnicodeLocaleKeys();
        java.lang.String str27 = locale22.getScript();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1" + "'", str25, "1");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone dateTimeZone3 = provider0.getZone("TW");
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.util.Set<java.lang.String> strSet5 = provider0.getAvailableIDs();
        java.util.stream.Stream<java.lang.String> strStream6 = strSet5.parallelStream();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strStream6);
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.yearOfCentury();
        org.joda.time.DurationField durationField15 = islamicChronology13.years();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        int int22 = localDateTime17.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.minus(readablePeriod25);
        int int27 = localDateTime26.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField29 = localDateTime26.getField(0);
        org.joda.time.LocalDateTime.Property property30 = localDateTime26.centuryOfEra();
        int[] intArray32 = islamicChronology13.get((org.joda.time.ReadablePartial) localDateTime26, (long) 0);
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology13.hourOfDay();
        org.joda.time.DurationField durationField34 = islamicChronology13.centuries();
        boolean boolean35 = property8.equals((java.lang.Object) durationField34);
        org.joda.time.LocalDateTime localDateTime36 = property8.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusWeeks(24);
        org.joda.time.DateTimeField dateTimeField40 = localDateTime38.getField((int) (byte) 1);
        org.joda.time.DurationField durationField41 = dateTimeField40.getDurationField();
        long long43 = dateTimeField40.remainder((long) 15272000);
        java.util.Locale locale46 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet47 = locale46.getUnicodeLocaleAttributes();
        java.util.Locale locale48 = java.util.Locale.KOREA;
        java.util.Locale.Category category49 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Locale locale51 = java.util.Locale.JAPAN;
        java.lang.String str52 = locale51.getISO3Country();
        java.lang.String str53 = locale50.getDisplayCountry(locale51);
        java.util.Locale.setDefault(category49, locale51);
        java.lang.String str55 = locale48.getDisplayScript(locale51);
        java.util.Set<java.lang.String> strSet56 = locale51.getUnicodeLocaleAttributes();
        java.lang.String str57 = locale46.getDisplayName(locale51);
        java.lang.String str58 = dateTimeField40.getAsText(3059938800000L, locale51);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 15272000L + "'", long43 == 15272000L);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + category49 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category49.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "de");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "JPN" + "'", str52, "JPN");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\u6708" + "'", str58, "\u6708");
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = islamicChronology2.millis();
        org.joda.time.DurationField durationField9 = islamicChronology2.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) durationField9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.secondOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology2.seconds();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMinutes(0);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minus(readablePeriod9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withPeriodAdded(readablePeriod11, (int) (byte) 10);
        long long15 = islamicChronology2.set((org.joda.time.ReadablePartial) localDateTime6, 2015L);
        int int16 = localDateTime6.getSecondOfMinute();
        org.joda.time.Chronology chronology17 = localDateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime6.plusSeconds(150);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 19360306581260L + "'", long15 == 19360306581260L);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(36, (int) (byte) -1, 38, 0, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfYear();
        org.joda.time.Chronology chronology6 = islamicChronology2.withUTC();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = islamicChronology9.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology9.monthOfYear();
        org.joda.time.DurationField durationField15 = islamicChronology9.weekyears();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = islamicChronology9.add(readablePeriod16, (-3599900L), (-1));
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = islamicChronology23.weekyears();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        boolean boolean29 = dateTimeZone26.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology30 = islamicChronology23.withZone(dateTimeZone26);
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.lang.String str34 = locale32.getDisplayLanguage(locale33);
        java.lang.String str35 = locale33.getISO3Country();
        java.util.Set<java.lang.String> strSet36 = locale33.getUnicodeLocaleAttributes();
        java.lang.String str37 = dateTimeZone26.getName(24796800001L, locale33);
        int int39 = dateTimeZone26.getOffsetFromLocal(1134L);
        java.lang.String str41 = dateTimeZone26.getName(1716L);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(2623241168L, dateTimeZone26);
        org.joda.time.Chronology chronology43 = islamicChronology9.withZone(dateTimeZone26);
        long long47 = dateTimeZone26.convertLocalToUTC((long) 15, false, 17763836400100L);
        org.joda.time.Chronology chronology48 = islamicChronology2.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField49 = chronology48.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-3599900L) + "'", long19 == (-3599900L));
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(islamicChronology27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str34, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "KOR" + "'", str35, "KOR");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+01:00" + "'", str37, "+01:00");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3600000 + "'", int39 == 3600000);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+01:00" + "'", str41, "+01:00");
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-3599985L) + "'", long47 == (-3599985L));
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withHourOfDay(5);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minus(readableDuration4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.year();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = islamicChronology9.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology9.months();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology9.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 1);
        int int15 = localDateTime14.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusHours((int) (byte) -1);
        int int19 = localDateTime14.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime14.minus(readablePeriod22);
        int int24 = localDateTime23.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField26 = localDateTime23.getField(0);
        org.joda.time.LocalDateTime.Property property27 = localDateTime23.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 1);
        int int30 = localDateTime29.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withPeriodAdded(readablePeriod33, 10);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withDayOfYear(11);
        int[] intArray38 = localDateTime37.getValues();
        islamicChronology9.validate((org.joda.time.ReadablePartial) localDateTime23, intArray38);
        int int40 = localDateTime23.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime23.plusMillis(23);
        org.joda.time.DateTime dateTime43 = localDateTime42.toDateTime();
        long long44 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 1, 11, 3600001]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        long long12 = dateTimeZone6.convertLocalToUTC(0L, true, (-4320000001L));
        java.lang.String str14 = dateTimeZone6.getNameKey((long) 1443);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField16 = islamicChronology15.minutes();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology15.centuryOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3600000L) + "'", long12 == (-3600000L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getName();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = property11.getAsText(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property11.withMinimumValue();
        boolean boolean18 = property11.equals((java.lang.Object) 59);
        org.joda.time.DurationField durationField19 = property11.getRangeDurationField();
        java.util.Locale locale23 = new java.util.Locale("DateTimeField[minuteOfDay]", "kor", "fra");
        int int24 = property11.getMaximumTextLength(locale23);
        java.lang.String str25 = property11.toString();
        org.joda.time.LocalDateTime localDateTime26 = property11.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime27 = property11.getLocalDateTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "millisOfSecond" + "'", str13, "millisOfSecond");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertEquals(locale23.toString(), "datetimefield[minuteofday]_KOR_fra");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Property[millisOfSecond]" + "'", str25, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getName();
        org.joda.time.DurationField durationField14 = property11.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        int int17 = localDateTime16.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = localDateTime16.toDateTime(dateTimeZone21);
        long long24 = dateTime23.getMillis();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localDateTime26.toDateTime(dateTimeZone31);
        long long34 = dateTime33.getMillis();
        long long35 = dateTime33.getMillis();
        boolean boolean36 = dateTime23.isAfter((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology37 = dateTime33.getChronology();
        java.util.Locale.FilteringMode filteringMode38 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        boolean boolean39 = dateTime33.equals((java.lang.Object) filteringMode38);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 1);
        int int42 = localDateTime41.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology47 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = localDateTime41.toDateTime(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 1);
        int int51 = localDateTime50.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology56 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone55);
        org.joda.time.DateTime dateTime57 = localDateTime50.toDateTime(dateTimeZone55);
        long long58 = dateTime57.getMillis();
        boolean boolean59 = dateTime48.isAfter((org.joda.time.ReadableInstant) dateTime57);
        int int60 = dateTime33.compareTo((org.joda.time.ReadableInstant) dateTime48);
        int int61 = property11.getDifference((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology64 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone63);
        org.joda.time.DurationField durationField65 = islamicChronology64.weekyears();
        org.joda.time.DurationField durationField66 = islamicChronology64.halfdays();
        org.joda.time.DateTimeField dateTimeField67 = islamicChronology64.yearOfEra();
        org.joda.time.DateTimeField dateTimeField68 = islamicChronology64.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField69 = islamicChronology64.monthOfYear();
        org.joda.time.DurationField durationField70 = islamicChronology64.weekyears();
        org.joda.time.DateTimeField dateTimeField71 = islamicChronology64.dayOfYear();
        java.util.Locale.Builder builder72 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder74 = builder72.setVariant("");
        java.util.Locale locale75 = builder74.build();
        java.util.Locale locale77 = new java.util.Locale("");
        java.util.Locale.Builder builder78 = builder74.setLocale(locale77);
        boolean boolean79 = locale77.hasExtensions();
        int int80 = dateTimeField71.getMaximumShortTextLength(locale77);
        java.lang.String str81 = property11.getAsText(locale77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "millisOfSecond" + "'", str13, "millisOfSecond");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(islamicChronology22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(islamicChronology32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + filteringMode38 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode38.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(islamicChronology47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(islamicChronology56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3600000 + "'", int61 == 3600000);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(islamicChronology64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(durationField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "");
        org.junit.Assert.assertEquals(locale77.toString(), "");
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "1" + "'", str81, "1");
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("");
        boolean boolean4 = timeZone1.hasSameRules(timeZone3);
        int int5 = timeZone1.getRawOffset();
        java.time.ZoneId zoneId6 = timeZone1.toZoneId();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone(zoneId6);
        java.time.ZoneId zoneId8 = timeZone7.toZoneId();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        boolean boolean11 = dateTimeZone9.isStandardOffset(24886800000L);
        long long15 = dateTimeZone9.convertLocalToUTC(21459600000L, false, (long) ' ');
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u30b0\u30ea\u30cb\u30c3\u30b8\u6a19\u6e96\u6642");
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 21459600000L + "'", long15 == 21459600000L);
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getName();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = property11.getAsText(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property11.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        boolean boolean21 = dateTimeZone18.equals((java.lang.Object) 10L);
        java.util.Locale locale23 = java.util.Locale.JAPAN;
        java.lang.String str24 = locale23.getISO3Country();
        java.lang.String str25 = dateTimeZone18.getShortName(1970L, locale23);
        org.joda.time.DateTime dateTime26 = localDateTime16.toDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime16.plusMonths(7);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusHours((-16385303));
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.plus(readableDuration31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime28.weekOfWeekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "millisOfSecond" + "'", str13, "millisOfSecond");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(islamicChronology19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "JPN" + "'", str24, "JPN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+01:00" + "'", str25, "+01:00");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology2.millis();
        java.lang.String str7 = islamicChronology2.toString();
        java.lang.String str8 = islamicChronology2.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IslamicChronology[+01:00]" + "'", str7, "IslamicChronology[+01:00]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[+01:00]" + "'", str8, "IslamicChronology[+01:00]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = islamicChronology2.halfdays();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology2);
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int3 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 45);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears(56);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = islamicChronology11.weekyears();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        boolean boolean17 = dateTimeZone14.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology18 = islamicChronology11.withZone(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = islamicChronology11.add(readablePeriod19, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology11.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology11.hourOfHalfday();
        org.joda.time.DurationField durationField26 = islamicChronology11.weeks();
        org.joda.time.DurationField durationField27 = islamicChronology11.millis();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = islamicChronology11.add(readablePeriod28, 745732313856000070L, 5700000);
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology11.monthOfYear();
        boolean boolean33 = localDateTime8.equals((java.lang.Object) islamicChronology11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(islamicChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 745732313856000070L + "'", long31 == 745732313856000070L);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMillis(59);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.monthOfYear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withMinuteOfHour(24);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int int17 = localDateTime15.getValue((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plus(readablePeriod18);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        int int22 = localDateTime21.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusHours((int) (byte) -1);
        int int26 = localDateTime21.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime21.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime21.minus(readablePeriod29);
        int int31 = localDateTime30.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField33 = localDateTime30.getField(0);
        org.joda.time.LocalDateTime.Property property34 = localDateTime30.centuryOfEra();
        org.joda.time.LocalDateTime.Property property35 = localDateTime30.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime30.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology43 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone42);
        org.joda.time.DurationField durationField44 = islamicChronology43.weekyears();
        org.joda.time.DurationField durationField45 = islamicChronology43.halfdays();
        org.joda.time.DateTimeField dateTimeField46 = islamicChronology43.yearOfEra();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology43.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology43.weekyear();
        org.joda.time.DurationField durationField49 = islamicChronology43.days();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology43.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = dateTimeField50.getType();
        boolean boolean52 = localDateTime40.isSupported(dateTimeFieldType51);
        int int53 = localDateTime15.get(dateTimeFieldType51);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) 1);
        int int56 = localDateTime55.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.minusHours((int) (byte) -1);
        int int59 = localDateTime55.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime55.minusMinutes((int) '#');
        org.joda.time.LocalDateTime localDateTime63 = localDateTime55.plusMonths((-1));
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) 1);
        int int66 = localDateTime65.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology71 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone70);
        org.joda.time.DurationField durationField72 = islamicChronology71.weekyears();
        org.joda.time.DurationField durationField73 = islamicChronology71.halfdays();
        org.joda.time.DateTimeField dateTimeField74 = islamicChronology71.yearOfEra();
        org.joda.time.DurationField durationField75 = islamicChronology71.halfdays();
        org.joda.time.DurationFieldType durationFieldType76 = durationField75.getType();
        boolean boolean77 = localDateTime65.isSupported(durationFieldType76);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime55.withFieldAdded(durationFieldType76, 12);
        boolean boolean80 = localDateTime15.isSupported(durationFieldType76);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime9.withFieldAdded(durationFieldType76, 82800060);
        java.lang.String str83 = localDateTime82.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(islamicChronology43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(islamicChronology71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertNotNull(durationField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertNotNull(durationFieldType76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "115319-06-08T01:01:00.060" + "'", str83, "115319-06-08T01:01:00.060");
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int3 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.millisOfDay();
        long long8 = islamicChronology2.add(2015L, (-3598030L), 19);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = islamicChronology11.weekyears();
        org.joda.time.DurationField durationField13 = islamicChronology11.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology11.yearOfEra();
        org.joda.time.DurationField durationField17 = islamicChronology11.days();
        org.joda.time.DurationField durationField18 = islamicChronology11.weeks();
        org.joda.time.DurationField durationField19 = islamicChronology11.seconds();
        int int20 = islamicChronology11.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology11.year();
        boolean boolean22 = islamicChronology2.equals((java.lang.Object) dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-68360555L) + "'", long8 == (-68360555L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(islamicChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.seconds();
        org.joda.time.Chronology chronology7 = islamicChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (-42404947200001L), 48);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-42404947200001L) + "'", long13 == (-42404947200001L));
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "FR");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder8 = builder3.addUnicodeLocaleAttribute("2022");
        java.util.Locale.Builder builder9 = builder3.clearExtensions();
        java.util.Locale.Builder builder11 = builder3.removeUnicodeLocaleAttribute("999");
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.yearOfCentury();
        org.joda.time.DurationField durationField16 = islamicChronology14.years();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        int int19 = localDateTime18.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusHours((int) (byte) -1);
        int int23 = localDateTime18.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime18.minus(readablePeriod26);
        int int28 = localDateTime27.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField30 = localDateTime27.getField(0);
        org.joda.time.LocalDateTime.Property property31 = localDateTime27.centuryOfEra();
        int[] intArray33 = islamicChronology14.get((org.joda.time.ReadablePartial) localDateTime27, (long) 0);
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology14.millisOfDay();
        org.joda.time.DurationField durationField35 = islamicChronology14.centuries();
        org.joda.time.DateTimeZone dateTimeZone36 = islamicChronology14.getZone();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology14.dayOfWeek();
        org.joda.time.DurationField durationField38 = islamicChronology14.minutes();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology14.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology14.secondOfDay();
        java.util.Locale locale42 = java.util.Locale.FRANCE;
        java.lang.String str43 = dateTimeField40.getAsShortText(86400000L, locale42);
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.lang.String str46 = locale44.getDisplayLanguage(locale45);
        java.util.Locale.setDefault(locale44);
        java.util.Locale locale48 = java.util.Locale.JAPAN;
        java.lang.String str49 = locale44.getDisplayCountry(locale48);
        int int50 = dateTimeField40.getMaximumTextLength(locale44);
        java.util.Locale.Builder builder51 = builder3.setLocale(locale44);
        java.util.Locale locale52 = builder3.build();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "3600" + "'", str43, "3600");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str46, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u5927\u97d3\u6c11\u56fd" + "'", str49, "\u5927\u97d3\u6c11\u56fd");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko_KR");
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.dayOfMonth();
        org.joda.time.DurationField durationField29 = islamicChronology2.days();
        java.lang.String str30 = durationField29.getName();
        int int32 = durationField29.getValue((long) 2);
        java.lang.String str33 = durationField29.getName();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "days" + "'", str30, "days");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "days" + "'", str33, "days");
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.secondOfDay();
        long long8 = islamicChronology2.add(19800L, 4871L, 3600000);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology13.secondOfDay();
        org.joda.time.DurationField durationField16 = islamicChronology13.seconds();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusMinutes(0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minus(readablePeriod20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withPeriodAdded(readablePeriod22, (int) (byte) 10);
        long long26 = islamicChronology13.set((org.joda.time.ReadablePartial) localDateTime17, 2015L);
        int int27 = localDateTime17.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime17.plusMinutes(14);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology33.yearOfCentury();
        org.joda.time.DurationField durationField35 = islamicChronology33.years();
        org.joda.time.DurationField durationField36 = islamicChronology33.halfdays();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 1);
        int int39 = localDateTime38.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.minusHours((int) (byte) -1);
        int int42 = localDateTime38.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime38.plusHours((int) (byte) 100);
        int int47 = localDateTime38.getMillisOfDay();
        int[] intArray49 = islamicChronology33.get((org.joda.time.ReadablePartial) localDateTime38, 3600012L);
        int[] intArray51 = dateTimeField10.addWrapPartial((org.joda.time.ReadablePartial) localDateTime17, 1439, intArray49, 0);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) 1);
        int int55 = localDateTime54.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.minusHours((int) (byte) -1);
        int int58 = localDateTime54.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime54.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.centuryOfEra();
        java.util.Locale locale62 = java.util.Locale.FRENCH;
        java.lang.String str63 = property61.getAsShortText(locale62);
        boolean boolean65 = property61.equals((java.lang.Object) "\u5927\u97d3\u6c11\u56fd");
        java.util.Locale locale69 = new java.util.Locale("+01:00", "19", "1");
        int int70 = property61.getMaximumShortTextLength(locale69);
        java.lang.String str71 = dateTimeField10.getAsShortText((int) (short) 0, locale69);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 17535619800L + "'", long8 == 17535619800L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 19360306581719L + "'", long26 == 19360306581719L);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21 + "'", int27 == 21);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(islamicChronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3600001 + "'", int47 == 3600001);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1389, 10, 22, 7200012]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1389, 10, 22, 7200012]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "19" + "'", str63, "19");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals(locale69.toString(), "+01:00_19_1");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 7 + "'", int70 == 7);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "0" + "'", str71, "0");
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.era();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder2.build();
        java.util.Locale locale5 = new java.util.Locale("");
        java.util.Locale.Builder builder6 = builder2.setLocale(locale5);
        java.util.Locale.Builder builder8 = builder6.addUnicodeLocaleAttribute("JPN");
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder13 = builder8.setExtension('x', "CAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder8.setLanguage("9");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 9 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology4.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology4.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology4.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:00" + "'", str3, "+01:00");
        org.junit.Assert.assertNotNull(islamicChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField7 = islamicChronology2.centuries();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        int int10 = localDateTime9.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDateTime9.toDateTime(dateTimeZone14);
        long long20 = dateTimeZone14.convertLocalToUTC(0L, true, (-4320000001L));
        java.lang.String str22 = dateTimeZone14.getNameKey((long) 1443);
        org.joda.time.Chronology chronology23 = islamicChronology2.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField24 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.yearOfEra();
        long long27 = dateTimeField25.roundHalfFloor(72550058054400000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = dateTimeField25.getType();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3600000L) + "'", long20 == (-3600000L));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 72550069542000000L + "'", long27 == 72550069542000000L);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        boolean boolean4 = strSet1.removeAll((java.util.Collection<java.lang.String>) strSet3);
        java.util.stream.Stream<java.lang.String> strStream5 = strSet3.stream();
        java.util.Spliterator<java.lang.String> strSpliterator6 = strSet3.spliterator();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = islamicChronology9.weekyears();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        boolean boolean15 = dateTimeZone12.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology16 = islamicChronology9.withZone(dateTimeZone12);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = islamicChronology9.add(readablePeriod17, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology9.clockhourOfHalfday();
        boolean boolean23 = strSet3.remove((java.lang.Object) islamicChronology9);
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology9.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertNotNull(strSpliterator6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        int int6 = localDateTime1.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int14 = localDateTime13.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundFloorCopy();
        int int17 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime1.year();
        org.joda.time.LocalDateTime.Property property19 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime1.withMillisOfDay(86399);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.days();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = islamicChronology2.add(readablePeriod24, (long) 'a', (int) (byte) 0);
        org.joda.time.DurationField durationField28 = islamicChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone30);
        boolean boolean33 = dateTimeZone30.equals((java.lang.Object) 10L);
        java.lang.String str35 = dateTimeZone30.getName((long) '#');
        long long39 = dateTimeZone30.convertLocalToUTC(3L, false, 86400000L);
        int int41 = dateTimeZone30.getStandardOffset(35L);
        org.joda.time.Chronology chronology42 = islamicChronology2.withZone(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField44 = islamicChronology2.days();
        // The following exception was thrown during execution in test generation
        try {
            long long47 = durationField44.add(19360306376898L, 216000900000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 216000900000 * 86400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(islamicChronology31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+01:00" + "'", str35, "+01:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-3599997L) + "'", long39 == (-3599997L));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3600000 + "'", int41 == 3600000);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int3 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfDay();
        org.joda.time.Chronology chronology6 = islamicChronology2.withUTC();
        org.joda.time.DurationField durationField7 = islamicChronology2.months();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DurationField durationField6 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        int int10 = localDateTime9.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusHours((int) (byte) -1);
        int int13 = localDateTime9.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.centuryOfEra();
        java.lang.String str17 = localDateTime15.toString();
        int int18 = localDateTime15.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.era();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = islamicChronology23.weekyears();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        boolean boolean29 = dateTimeZone26.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology30 = islamicChronology23.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology23.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 1);
        int int34 = localDateTime33.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology37 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology37.weekyear();
        org.joda.time.ReadablePartial readablePartial39 = null;
        int[] intArray46 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray48 = dateTimeField38.addWrapPartial(readablePartial39, 100, intArray46, (int) (short) 0);
        int int49 = dateTimeField31.getMaximumValue((org.joda.time.ReadablePartial) localDateTime33, intArray46);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 1);
        int int52 = localDateTime51.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.minusHours((int) (byte) -1);
        int int55 = localDateTime51.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime51.minusMinutes((int) '#');
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology60 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone59);
        org.joda.time.DurationField durationField61 = islamicChronology60.weekyears();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology64 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone63);
        boolean boolean66 = dateTimeZone63.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology67 = islamicChronology60.withZone(dateTimeZone63);
        org.joda.time.DateTimeField dateTimeField68 = islamicChronology60.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime((long) 1);
        int int71 = localDateTime70.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology74 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone73);
        org.joda.time.DateTimeField dateTimeField75 = islamicChronology74.weekyear();
        org.joda.time.ReadablePartial readablePartial76 = null;
        int[] intArray83 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray85 = dateTimeField75.addWrapPartial(readablePartial76, 100, intArray83, (int) (short) 0);
        int int86 = dateTimeField68.getMaximumValue((org.joda.time.ReadablePartial) localDateTime70, intArray83);
        int int87 = dateTimeField31.getMinimumValue((org.joda.time.ReadablePartial) localDateTime57, intArray83);
        int[] intArray89 = dateTimeField7.addWrapField((org.joda.time.ReadablePartial) localDateTime15, 3, intArray83, 24);
        org.joda.time.LocalDateTime.Property property90 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime92 = localDateTime15.plusWeeks((-6962));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01T00:25:00.001" + "'", str17, "1970-01-01T00:25:00.001");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(islamicChronology27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(islamicChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[100, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[100, 10, 100, -1, 10]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 11 + "'", int49 == 11);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(islamicChronology60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(islamicChronology64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(islamicChronology74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[100, 10, 100, 23, 10]");
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[100, 10, 100, 23, 10]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 11 + "'", int86 == 11);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[100, 10, 100, 23, 10]");
        org.junit.Assert.assertNotNull(property90);
        org.junit.Assert.assertNotNull(localDateTime92);
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.minus(readableDuration10);
        int int12 = localDateTime11.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfDay();
        org.joda.time.DurationField durationField14 = property13.getLeapDurationField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNull(durationField14);
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        int int11 = localDateTime10.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = localDateTime10.getField(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.centuryOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime10.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = islamicChronology23.weekyears();
        org.joda.time.DurationField durationField25 = islamicChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology23.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology23.weekyear();
        org.joda.time.DurationField durationField29 = islamicChronology23.days();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology23.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = dateTimeField30.getType();
        boolean boolean32 = localDateTime20.isSupported(dateTimeFieldType31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime20.withCenturyOfEra(70);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property37 = localDateTime34.dayOfMonth();
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("1969-12-31T23:25:00.001");
        java.lang.String str40 = property37.getAsShortText(locale39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1" + "'", str40, "1");
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        int int10 = localDateTime9.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusHours((int) (byte) -1);
        int int13 = localDateTime9.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.centuryOfEra();
        java.util.Locale locale18 = java.util.Locale.FRENCH;
        java.lang.String str19 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) localDateTime15, (int) (short) 100, locale18);
        java.util.Set<java.lang.String> strSet20 = locale18.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder21.setVariant("");
        java.util.Locale locale24 = java.util.Locale.PRC;
        java.util.Locale locale25 = locale24.stripExtensions();
        java.lang.String str26 = locale24.getScript();
        java.util.Locale.Builder builder27 = builder21.setLocale(locale24);
        java.util.Locale.Builder builder30 = builder27.setExtension('x', "1969");
        java.util.Locale locale31 = builder27.build();
        java.util.Locale.Builder builder32 = builder27.clearExtensions();
        java.util.Locale locale33 = builder32.build();
        java.util.Locale locale35 = new java.util.Locale("weekOfWeekyear");
        java.lang.String str36 = locale33.getDisplayLanguage(locale35);
        java.lang.String str37 = locale18.getDisplayVariant(locale33);
        java.lang.String str38 = locale18.getDisplayName();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100" + "'", str19, "100");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN_#x-1969");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale35.toString(), "weekofweekyear");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Chinese" + "'", str36, "Chinese");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\ud504\ub791\uc2a4\uc5b4" + "'", str38, "\ud504\ub791\uc2a4\uc5b4");
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDateTime8.toDateTime(dateTimeZone13);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = localDateTime8.isSupported(dateTimeFieldType16);
        int[] intArray19 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime8, (-4323600000L));
        org.joda.time.LocalDateTime.Property property20 = localDateTime8.millisOfDay();
        org.joda.time.LocalDateTime localDateTime21 = property20.withMaximumValue();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1389, 9, 2, 0]");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.plusHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        int int14 = islamicChronology13.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology13.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = islamicChronology13.getZone();
        org.joda.time.DateTime dateTime17 = localDateTime1.toDateTime(dateTimeZone16);
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        java.lang.String str19 = instant18.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str19, "1970-01-01T00:00:00.001Z");
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("");
        boolean boolean4 = timeZone1.hasSameRules(timeZone3);
        timeZone1.setRawOffset(355);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = islamicChronology11.weekyears();
        org.joda.time.DurationField durationField13 = islamicChronology11.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology11.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology11.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        int int19 = localDateTime18.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withPeriodAdded(readablePeriod22, 10);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withDayOfYear(11);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withYear(10);
        org.joda.time.DateTime dateTime29 = localDateTime26.toDateTime();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime26.withYear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DurationField durationField35 = islamicChronology34.weekyears();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology34.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone37 = islamicChronology34.getZone();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology34.millisOfSecond();
        long long41 = dateTimeField38.getDifferenceAsLong((long) 1970, (long) 0);
        long long44 = dateTimeField38.getDifferenceAsLong((long) 11, (-20217598030L));
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 1);
        int int48 = localDateTime47.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.minusHours((int) (byte) -1);
        int int51 = localDateTime47.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime47.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.centuryOfEra();
        java.util.Locale locale55 = java.util.Locale.FRENCH;
        java.lang.String str56 = property54.getAsShortText(locale55);
        boolean boolean58 = property54.equals((java.lang.Object) "\u5927\u97d3\u6c11\u56fd");
        java.util.Locale locale62 = new java.util.Locale("+01:00", "19", "1");
        int int63 = property54.getMaximumShortTextLength(locale62);
        java.lang.String str64 = dateTimeField38.getAsText((int) ' ', locale62);
        java.lang.String str65 = locale62.getLanguage();
        java.lang.String str66 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) localDateTime31, locale62);
        java.lang.String str67 = locale62.getDisplayCountry();
        java.lang.String str68 = locale62.getDisplayName();
        java.lang.String str69 = dateTimeZone7.getName(19360594800000L, locale62);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(islamicChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(islamicChronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1970L + "'", long41 == 1970L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 20217598041L + "'", long44 == 20217598041L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "19" + "'", str56, "19");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals(locale62.toString(), "+01:00_19_1");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 7 + "'", int63 == 7);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "32" + "'", str64, "32");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+01:00" + "'", str65, "+01:00");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "11" + "'", str66, "11");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "19" + "'", str67, "19");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "+01:00 (19,1)" + "'", str68, "+01:00 (19,1)");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "+00:00" + "'", str69, "+00:00");
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DurationField durationField6 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMinutes(0);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minus(readablePeriod12);
        long long15 = islamicChronology2.set((org.joda.time.ReadablePartial) localDateTime9, 0L);
        org.joda.time.DurationField durationField16 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology2.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 19360306582095L + "'", long15 == 19360306582095L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.secondOfMinute();
        org.joda.time.DurationField durationField7 = islamicChronology2.seconds();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology2.getZone();
        java.lang.String str10 = dateTimeZone8.getName(36457200000L);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet14 = locale12.getExtensionKeys();
        boolean boolean15 = locale12.hasExtensions();
        java.lang.String str16 = dateTimeZone8.getShortName(4208703009071022L, locale12);
        java.util.Set<java.lang.Character> charSet17 = locale12.getExtensionKeys();
        java.lang.String str18 = locale12.getLanguage();
        java.lang.Object obj19 = locale12.clone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:00" + "'", str10, "+01:00");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+01:00" + "'", str16, "+01:00");
        org.junit.Assert.assertNotNull(charSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ko" + "'", str18, "ko");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "ko_KR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "ko_KR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "ko_KR");
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = java.util.Locale.PRC;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale3.getScript();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder10 = builder7.setVariant("1380");
        java.util.Locale locale11 = java.util.Locale.ROOT;
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder12.setVariant("");
        java.util.Locale locale15 = java.util.Locale.PRC;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale15.getScript();
        java.util.Locale.Builder builder18 = builder12.setLocale(locale15);
        java.util.Locale locale19 = locale15.stripExtensions();
        java.lang.String str20 = locale11.getDisplayCountry(locale15);
        java.util.Locale.Builder builder21 = builder7.setLocale(locale11);
        java.util.Locale locale22 = builder21.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.util.Locale.setDefault(locale13);
        int int17 = property11.getMaximumShortTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime19 = property11.addToCopy(78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str15, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getName();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = property11.getAsText(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property11.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusMonths(45);
        int[] intArray19 = localDateTime18.getValues();
        java.util.Date date20 = localDateTime18.toDate();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.fromDateFields(date20);
        int int22 = localDateTime21.getYearOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "millisOfSecond" + "'", str13, "millisOfSecond");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1966, 4, 1, 3600000]");
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Fri Apr 01 01:00:00 GMT+00:00 1966");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1966 + "'", int22 == 1966);
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology2.getZone();
        org.joda.time.DurationField durationField10 = islamicChronology2.halfdays();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(101);
        org.joda.time.Chronology chronology13 = islamicChronology2.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = islamicChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.weekOfWeekyear();
        long long18 = dateTimeField15.getDifferenceAsLong((long) 100, 18L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        java.lang.String str10 = property8.toString();
        int int11 = property8.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime12 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 1);
        int int15 = localDateTime14.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusHours((int) (byte) -1);
        int int19 = localDateTime14.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime14.minus(readablePeriod22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime14.millisOfSecond();
        long long25 = property24.remainder();
        java.lang.String str26 = property24.getName();
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.lang.String str28 = property24.getAsText(locale27);
        org.joda.time.LocalDateTime localDateTime29 = property24.withMinimumValue();
        org.joda.time.Interval interval30 = property24.toInterval();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone32);
        org.joda.time.DurationField durationField34 = islamicChronology33.weekyears();
        org.joda.time.DurationField durationField35 = islamicChronology33.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology33.era();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology33.secondOfMinute();
        java.util.Locale locale39 = java.util.Locale.TAIWAN;
        java.lang.String str40 = dateTimeField37.getAsText(17763840000100L, locale39);
        java.lang.String str41 = property24.getAsShortText(locale39);
        org.joda.time.LocalDateTime localDateTime42 = property24.withMinimumValue();
        java.util.Locale.Builder builder43 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder45 = builder43.setVariant("");
        java.util.Locale locale46 = java.util.Locale.PRC;
        java.util.Locale locale47 = locale46.stripExtensions();
        java.lang.String str48 = locale46.getScript();
        java.util.Locale.Builder builder49 = builder43.setLocale(locale46);
        java.lang.String str50 = property24.getAsText(locale46);
        int int51 = property8.getMaximumShortTextLength(locale46);
        java.lang.String str53 = locale46.getExtension('a');
        java.lang.String str54 = locale46.getLanguage();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Property[centuryOfEra]" + "'", str10, "Property[centuryOfEra]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "millisOfSecond" + "'", str26, "millisOfSecond");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1" + "'", str28, "1");
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(islamicChronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1" + "'", str41, "1");
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1" + "'", str50, "1");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 7 + "'", int51 == 7);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "zh" + "'", str54, "zh");
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        java.util.Locale locale2 = new java.util.Locale("8970-01-01T00:25:00.001", "0");
        java.util.Locale locale4 = new java.util.Locale("zh_TW");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime6.millisOfSecond();
        long long17 = property16.remainder();
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale18.getDisplayLanguage(locale19);
        java.util.Locale.setDefault(locale18);
        int int22 = property16.getMaximumShortTextLength(locale18);
        java.lang.String str23 = locale18.getCountry();
        java.lang.String str24 = locale18.getDisplayCountry();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 1);
        int int30 = localDateTime29.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray33 = localDateTime32.getFields();
        boolean boolean34 = dateTimeZone26.isLocalDateTimeGap(localDateTime32);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        java.util.TimeZone timeZone36 = dateTimeZone26.toTimeZone();
        int int38 = dateTimeZone26.getOffsetFromLocal(35L);
        boolean boolean39 = dateTimeZone26.isFixed();
        java.util.Locale locale41 = java.util.Locale.CANADA_FRENCH;
        boolean boolean42 = locale41.hasExtensions();
        java.lang.String str43 = dateTimeZone26.getName((long) (byte) 1, locale41);
        java.lang.String str44 = locale18.getDisplayScript(locale41);
        java.lang.String str45 = locale4.getDisplayVariant(locale18);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone47);
        int int50 = dateTimeZone47.getOffset((long) 5);
        java.util.Locale.Builder builder52 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder54 = builder52.setVariant("");
        java.util.Locale locale55 = builder54.build();
        java.util.Locale locale57 = new java.util.Locale("");
        java.util.Locale.Builder builder58 = builder54.setLocale(locale57);
        java.util.Locale locale59 = builder54.build();
        java.lang.String str60 = dateTimeZone47.getShortName((-2938031L), locale59);
        java.util.Set<java.lang.String> strSet61 = locale59.getUnicodeLocaleKeys();
        java.lang.String str62 = locale4.getDisplayCountry(locale59);
        java.lang.String str63 = locale59.getCountry();
        java.lang.String str64 = locale2.getDisplayScript(locale59);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for 0");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "8970-01-01t00:25:00.001_0");
        org.junit.Assert.assertEquals(locale4.toString(), "zh_tw");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str20, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "KR" + "'", str23, "KR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str24, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(islamicChronology27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3600000 + "'", int38 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_CA");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+01:00" + "'", str43, "+01:00");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-3600000) + "'", int50 == (-3600000));
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "-01:00" + "'", str60, "-01:00");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.year();
        org.joda.time.DurationField durationField5 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology2.add(readablePeriod8, (-68360555L), 2922711);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-68360555L) + "'", long11 == (-68360555L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setExtension('a', "GMT");
        java.util.Locale.Builder builder9 = builder2.setUnicodeLocaleKeyword("59", "fra");
        java.util.Locale.Builder builder11 = builder2.removeUnicodeLocaleAttribute("2022");
        java.util.Locale.Builder builder12 = builder11.clearExtensions();
        java.util.Locale locale13 = builder12.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.util.Locale.setDefault(locale13);
        int int17 = property11.getMaximumShortTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime19 = property11.addToCopy(100L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 1);
        int int25 = localDateTime24.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusHours((int) (byte) -1);
        int int28 = localDateTime24.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.centuryOfEra();
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.lang.String str33 = property31.getAsShortText(locale32);
        boolean boolean34 = dateTimeZone21.equals((java.lang.Object) property31);
        java.util.Locale.Builder builder35 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder37 = builder35.setVariant("");
        java.util.Locale locale38 = java.util.Locale.PRC;
        java.util.Locale locale39 = locale38.stripExtensions();
        java.lang.String str40 = locale38.getScript();
        java.util.Locale.Builder builder41 = builder35.setLocale(locale38);
        java.lang.String str42 = property31.getAsShortText(locale38);
        org.joda.time.Interval interval43 = property31.toInterval();
        boolean boolean44 = property11.equals((java.lang.Object) property31);
        java.lang.String str45 = property11.getAsText();
        org.joda.time.LocalDateTime localDateTime46 = property11.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str15, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 23 + "'", int25 == 23);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "19" + "'", str33, "19");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "19" + "'", str42, "19");
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1" + "'", str45, "1");
        org.junit.Assert.assertNotNull(localDateTime46);
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        int int10 = localDateTime9.getMinuteOfHour();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = islamicChronology2.withZone(dateTimeZone9);
        java.lang.String str12 = dateTimeZone9.getShortName(100L);
        long long15 = dateTimeZone9.convertLocalToUTC(12L, false);
        java.util.TimeZone timeZone16 = dateTimeZone9.toTimeZone();
        java.lang.String str18 = dateTimeZone9.getName(19360332000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 12L + "'", long15 == 12L);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("24358552");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.year();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = islamicChronology13.weekyears();
        org.joda.time.DurationField durationField15 = islamicChronology13.months();
        org.joda.time.DurationField durationField16 = islamicChronology13.centuries();
        org.joda.time.DurationField durationField17 = islamicChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology13.minuteOfHour();
        org.joda.time.DurationField durationField20 = islamicChronology13.weeks();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology13.halfdayOfDay();
        java.util.Locale.Category category22 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category22, locale23);
        java.util.Locale locale26 = java.util.Locale.getDefault(category22);
        java.lang.String str27 = locale26.getCountry();
        int int28 = dateTimeField21.getMaximumTextLength(locale26);
        java.lang.String str29 = dateTimeField9.getAsText(309577158000L, locale26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + category22 + "' != '" + java.util.Locale.Category.FORMAT + "'", category22.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "KR" + "'", str27, "KR");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1399" + "'", str29, "1399");
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.minus(readableDuration10);
        int int12 = localDateTime1.getCenturyOfEra();
        java.lang.String str13 = localDateTime1.toString();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime1.plusHours((int) '#');
        int int16 = localDateTime15.getSecondOfMinute();
        int int17 = localDateTime15.getDayOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1969-12-31T23:00:00.001" + "'", str13, "1969-12-31T23:00:00.001");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.days();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = islamicChronology2.add(readablePeriod24, (long) 'a', (int) (byte) 0);
        org.joda.time.DurationField durationField28 = islamicChronology2.millis();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.weekyearOfCentury();
        long long32 = dateTimeField30.roundFloor(2533488019200000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 2533463391600000L + "'", long32 == 2533463391600000L);
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = islamicChronology2.getZone();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = islamicChronology2.add(readablePeriod26, (long) 3, 10);
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField32 = islamicChronology2.years();
        org.joda.time.DurationField durationField33 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField34 = islamicChronology2.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 3L + "'", long29 == 3L);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(durationField34);
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology2.days();
        org.joda.time.DurationField durationField9 = islamicChronology2.weeks();
        org.joda.time.DurationField durationField10 = islamicChronology2.seconds();
        org.joda.time.DurationField durationField11 = islamicChronology2.days();
        org.joda.time.Chronology chronology12 = islamicChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology2.millis();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.monthOfYear();
        org.joda.time.Chronology chronology8 = islamicChronology2.withUTC();
        java.lang.String str9 = islamicChronology2.toString();
        org.joda.time.DurationField durationField10 = islamicChronology2.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IslamicChronology[+01:00]" + "'", str9, "IslamicChronology[+01:00]");
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DurationField durationField6 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.monthOfYear();
        org.joda.time.DurationField durationField11 = islamicChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.year();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        timeZone1.setID("\u5927\u97d3\u6c11\u56fd");
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("");
        timeZone7.setID("\u5927\u97d3\u6c11\u56fd");
        boolean boolean10 = timeZone5.hasSameRules(timeZone7);
        timeZone7.setID("19");
        timeZone7.setID("60");
        boolean boolean15 = timeZone1.hasSameRules(timeZone7);
        int int16 = timeZone7.getRawOffset();
        int int18 = timeZone7.getOffset((-15282000000L));
        boolean boolean19 = timeZone7.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField5 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localDateTime11.getFields();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale13.getDisplayLanguage(locale14);
        java.lang.String str16 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localDateTime11, locale13);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withSecondOfMinute(45);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = islamicChronology23.weekyears();
        org.joda.time.DurationField durationField25 = islamicChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology23.era();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology23.yearOfCentury();
        boolean boolean28 = localDateTime18.equals((java.lang.Object) dateTimeField27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = localDateTime18.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23 + "'", int9 == 23);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str15, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970" + "'", str16, "1970");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone dateTimeZone3 = provider0.getZone("JPN");
        org.joda.time.DateTimeZone dateTimeZone5 = provider0.getZone("FR");
        org.joda.time.DateTimeZone dateTimeZone7 = provider0.getZone("1970-01-01T01:00:00.000+01:00");
        org.joda.time.DateTimeZone dateTimeZone9 = provider0.getZone("52");
        java.util.Set<java.lang.String> strSet10 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone12 = provider0.getZone("");
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone dateTimeZone15 = provider0.getZone("DateTimeField[clockhourOfDay]");
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone3);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(dateTimeZone12);
        org.junit.Assert.assertNull(dateTimeZone15);
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minus(readableDuration9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        boolean boolean14 = dateTimeZone12.isFixed();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        int int17 = localDateTime16.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = localDateTime16.toDateTime(dateTimeZone21);
        org.joda.time.ReadableInstant readableInstant24 = null;
        boolean boolean25 = dateTime23.isAfter(readableInstant24);
        org.joda.time.Instant instant26 = dateTime23.toInstant();
        java.lang.String str27 = dateTime23.toString();
        int int28 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime29 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        long long30 = dateTime23.getMillis();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 23 + "'", int17 == 23);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(islamicChronology22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1969-12-31T23:00:00.001+01:00" + "'", str27, "1969-12-31T23:00:00.001+01:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3600000 + "'", int28 == 3600000);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-7199999L) + "'", long30 == (-7199999L));
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours((int) (byte) 100);
        int int10 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime1.withWeekOfWeekyear(9);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusSeconds((int) '4');
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plus(readableDuration22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 1);
        int int28 = localDateTime27.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = localDateTime27.toDateTime(dateTimeZone32);
        long long35 = dateTime34.getMillis();
        org.joda.time.DateTime dateTime36 = localDateTime23.toDateTime((org.joda.time.ReadableInstant) dateTime34);
        long long37 = dateTime34.getMillis();
        org.joda.time.DateTime dateTime38 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology41 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone40);
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology41.weekyear();
        org.joda.time.ReadablePartial readablePartial43 = null;
        int[] intArray50 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray52 = dateTimeField42.addWrapPartial(readablePartial43, 100, intArray50, (int) (short) 0);
        int int54 = dateTimeField42.getMinimumValue((long) (short) 0);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) 1);
        int int57 = localDateTime56.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.withPeriodAdded(readablePeriod60, 10);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime59.plusSeconds((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology67 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone66);
        org.joda.time.DateTimeField dateTimeField68 = islamicChronology67.weekyear();
        org.joda.time.ReadablePartial readablePartial69 = null;
        int[] intArray76 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray78 = dateTimeField68.addWrapPartial(readablePartial69, 100, intArray76, (int) (short) 0);
        int int79 = dateTimeField42.getMaximumValue((org.joda.time.ReadablePartial) localDateTime64, intArray78);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology82 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone81);
        org.joda.time.DurationField durationField83 = islamicChronology82.weekyears();
        org.joda.time.DurationField durationField84 = islamicChronology82.halfdays();
        org.joda.time.DateTimeField dateTimeField85 = islamicChronology82.yearOfEra();
        org.joda.time.DateTimeField dateTimeField86 = islamicChronology82.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField87 = islamicChronology82.monthOfYear();
        org.joda.time.DateTimeField dateTimeField88 = islamicChronology82.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = dateTimeField88.getType();
        int int90 = localDateTime64.get(dateTimeFieldType89);
        int int91 = dateTime38.get(dateTimeFieldType89);
        long long92 = dateTime38.getMillis();
        org.joda.time.Chronology chronology93 = dateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField94 = chronology93.weekyearOfCentury();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 82800001 + "'", int10 == 82800001);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 23 + "'", int28 == 23);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(islamicChronology33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-7199999L) + "'", long35 == (-7199999L));
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-7199999L) + "'", long37 == (-7199999L));
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(islamicChronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[100, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[100, 10, 100, -1, 10]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 23 + "'", int57 == 23);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(islamicChronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[100, 10, 100, -1, 10]");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 292271022 + "'", int79 == 292271022);
        org.junit.Assert.assertNotNull(dateTimeZone81);
        org.junit.Assert.assertNotNull(islamicChronology82);
        org.junit.Assert.assertNotNull(durationField83);
        org.junit.Assert.assertNotNull(durationField84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(dateTimeField86);
        org.junit.Assert.assertNotNull(dateTimeField87);
        org.junit.Assert.assertNotNull(dateTimeField88);
        org.junit.Assert.assertNotNull(dateTimeFieldType89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 82832 + "'", int90 == 82832);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 82748 + "'", int91 == 82748);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 4831148001L + "'", long92 == 4831148001L);
        org.junit.Assert.assertNotNull(chronology93);
        org.junit.Assert.assertNotNull(dateTimeField94);
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        java.lang.String str10 = dateTimeZone8.toString();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withPeriodAdded(readablePeriod16, 10);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusSeconds((int) ' ');
        boolean boolean21 = dateTimeZone8.isLocalDateTimeGap(localDateTime20);
        org.joda.time.Chronology chronology22 = islamicChronology2.withZone(dateTimeZone8);
        org.joda.time.DurationField durationField23 = islamicChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology2.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IslamicChronology[+01:00]" + "'", str6, "IslamicChronology[+01:00]");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:00" + "'", str10, "+01:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 23 + "'", int13 == 23);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField7 = islamicChronology2.centuries();
        long long13 = islamicChronology2.getDateTimeMillis(70L, (int) (short) 10, 12, (int) (byte) 10, 0);
        java.lang.String str14 = islamicChronology2.toString();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        int int17 = localDateTime16.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusHours((int) (byte) -1);
        int int20 = localDateTime16.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime16.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime16.minus(readableDuration25);
        int int27 = localDateTime16.getSecondOfMinute();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = localDateTime16.getFieldTypes();
        int int29 = localDateTime16.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime16.plusWeeks(59);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        org.joda.time.DurationField durationField36 = islamicChronology35.weekyears();
        org.joda.time.DurationField durationField37 = islamicChronology35.halfdays();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology35.yearOfEra();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology35.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 1);
        int int42 = localDateTime41.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.minusHours((int) (byte) -1);
        int int45 = localDateTime41.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.minusMinutes((int) '#');
        org.joda.time.LocalDateTime localDateTime49 = localDateTime41.plusMonths((-1));
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) 1);
        int int52 = localDateTime51.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology57 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone56);
        org.joda.time.DurationField durationField58 = islamicChronology57.weekyears();
        org.joda.time.DurationField durationField59 = islamicChronology57.halfdays();
        org.joda.time.DateTimeField dateTimeField60 = islamicChronology57.yearOfEra();
        org.joda.time.DurationField durationField61 = islamicChronology57.halfdays();
        org.joda.time.DurationFieldType durationFieldType62 = durationField61.getType();
        boolean boolean63 = localDateTime51.isSupported(durationFieldType62);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime41.withFieldAdded(durationFieldType62, 12);
        org.joda.time.tz.NameProvider nameProvider66 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale67 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet68 = locale67.getUnicodeLocaleAttributes();
        java.lang.String str70 = locale67.getUnicodeLocaleType("FR");
        java.lang.String str73 = nameProvider66.getName(locale67, "\uc601\uc5b4", "GMT+00:00");
        java.lang.String str74 = dateTimeField39.getAsText((org.joda.time.ReadablePartial) localDateTime41, locale67);
        java.lang.String str75 = locale67.getISO3Language();
        java.util.Locale locale76 = locale67.stripExtensions();
        java.util.Locale locale77 = java.util.Locale.ENGLISH;
        java.lang.String str78 = locale67.getDisplayLanguage(locale77);
        java.lang.String str79 = localDateTime31.toString("2022", locale67);
        int[] intArray81 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime31, 52000L);
        org.joda.time.DateTimeField dateTimeField82 = islamicChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField83 = islamicChronology2.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 33130000L + "'", long13 == 33130000L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IslamicChronology[+01:00]" + "'", str14, "IslamicChronology[+01:00]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 23 + "'", int17 == 23);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(islamicChronology35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 23 + "'", int42 == 23);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 23 + "'", int52 == 23);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(islamicChronology57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(durationField61);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(nameProvider66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "1" + "'", str74, "1");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "kor" + "'", str75, "kor");
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Korean" + "'", str78, "Korean");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "2022" + "'", str79, "2022");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[1389, 10, 22, 3652000]");
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertNotNull(dateTimeField83);
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology2.millis();
        org.joda.time.DurationField durationField16 = islamicChronology2.millis();
        org.joda.time.DurationField durationField17 = islamicChronology2.weeks();
        org.joda.time.DurationField durationField18 = islamicChronology2.seconds();
        long long20 = durationField18.getMillis(349);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 349000L + "'", long20 == 349000L);
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology2);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusHours((int) (byte) -1);
        int int17 = localDateTime12.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime12.minus(readablePeriod20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime12.millisOfSecond();
        long long23 = property22.remainder();
        java.lang.String str24 = property22.getName();
        java.util.Locale locale25 = java.util.Locale.CHINA;
        java.lang.String str26 = property22.getAsText(locale25);
        org.joda.time.LocalDateTime localDateTime27 = property22.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusYears(4);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = islamicChronology2.set((org.joda.time.ReadablePartial) localDateTime29, (long) 1975);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for dayOfMonth must be in the range [1,29]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 23 + "'", int13 == 23);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "millisOfSecond" + "'", str24, "millisOfSecond");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1" + "'", str26, "1");
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = islamicChronology0.add(readablePeriod2, (long) (byte) 10, 0);
        org.joda.time.DurationField durationField6 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getName();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = property11.getAsText(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property11.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusYears(4);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plus(readablePeriod19);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = islamicChronology23.weekyears();
        org.joda.time.DurationField durationField25 = islamicChronology23.halfdays();
        org.joda.time.DurationField durationField26 = islamicChronology23.weeks();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology23.yearOfEra();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 1);
        int int30 = localDateTime29.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray33 = localDateTime32.getFields();
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.lang.String str36 = locale34.getDisplayLanguage(locale35);
        java.lang.String str37 = dateTimeField27.getAsText((org.joda.time.ReadablePartial) localDateTime32, locale34);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = dateTimeField27.getType();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime18.withField(dateTimeFieldType38, (int) ' ');
        org.joda.time.LocalDateTime.Property property41 = localDateTime18.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime42 = property41.withMinimumValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "millisOfSecond" + "'", str13, "millisOfSecond");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23 + "'", int30 == 23);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldArray33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str36, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970" + "'", str37, "1970");
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int3 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1);
        int int8 = localDateTime7.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime10.getFields();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusDays(4);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology16.yearOfCentury();
        org.joda.time.DurationField durationField18 = islamicChronology16.years();
        org.joda.time.DurationField durationField19 = islamicChronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology16.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours((int) (byte) -1);
        int int26 = localDateTime22.getSecondOfMinute();
        int[] intArray33 = new int[] { 292278993, ' ', (short) 1, (short) -1, (byte) -1 };
        int[] intArray35 = dateTimeField20.set((org.joda.time.ReadablePartial) localDateTime22, (int) (byte) 0, intArray33, 10);
        islamicChronology2.validate((org.joda.time.ReadablePartial) localDateTime10, intArray35);
        org.joda.time.DurationField durationField37 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology2.era();
        org.joda.time.DurationField durationField41 = islamicChronology2.millis();
        long long45 = islamicChronology2.add((long) 1965, (long) 1978, 125);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 23 + "'", int8 == 23);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 23 + "'", int23 == 23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[10, 12, 1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[10, 12, 1, 0, -1]");
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 249215L + "'", long45 == 249215L);
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        boolean boolean4 = dateTimeZone1.equals((java.lang.Object) 10L);
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 100);
        long long10 = dateTimeZone1.convertLocalToUTC(2143234800001L, false, (-3599999L));
        int int12 = dateTimeZone1.getStandardOffset(3600001L);
        long long14 = dateTimeZone1.previousTransition((long) 3600005);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:00" + "'", str6, "+01:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2143231200001L + "'", long10 == 2143231200001L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3600000 + "'", int12 == 3600000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3600005L + "'", long14 == 3600005L);
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        int int6 = localDateTime1.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = islamicChronology14.weekyears();
        org.joda.time.DurationField durationField16 = islamicChronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology14.yearOfEra();
        org.joda.time.DurationField durationField18 = islamicChronology14.halfdays();
        org.joda.time.DurationFieldType durationFieldType19 = durationField18.getType();
        boolean boolean20 = localDateTime8.isSupported(durationFieldType19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime8.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23);
        org.joda.time.DurationField durationField25 = islamicChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology24.yearOfEra();
        long long28 = dateTimeField26.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 1);
        int int31 = localDateTime30.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.minusHours((int) (byte) -1);
        int int34 = localDateTime30.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime30.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime30.minus(readableDuration39);
        java.util.Locale locale41 = java.util.Locale.PRC;
        java.util.Locale locale42 = locale41.stripExtensions();
        java.lang.String str43 = dateTimeField26.getAsShortText((org.joda.time.ReadablePartial) localDateTime40, locale41);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.plus(readablePeriod44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusYears(100);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.plusMillis(4);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology53 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone52);
        boolean boolean54 = dateTimeZone52.isFixed();
        long long58 = dateTimeZone52.convertLocalToUTC((long) (byte) 100, false, 10L);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 86399, dateTimeZone52);
        boolean boolean60 = localDateTime45.isEqual((org.joda.time.ReadablePartial) localDateTime59);
        int int61 = property21.compareTo((org.joda.time.ReadablePartial) localDateTime59);
        boolean boolean62 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime59);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime1.minusHours(2922711);
        org.joda.time.LocalDateTime.Property property65 = localDateTime1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType67 = localDateTime1.getFieldType(1679399715);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1679399715");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 23 + "'", int9 == 23);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(islamicChronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5785200000L + "'", long28 == 5785200000L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 23 + "'", int31 == 23);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1969" + "'", str43, "1969");
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(islamicChronology53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-3599900L) + "'", long58 == (-3599900L));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(property65);
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        java.util.Locale locale8 = new java.util.Locale("");
        boolean boolean9 = localDateTime1.equals((java.lang.Object) "");
        int int10 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusHours((int) (byte) -1);
        int int16 = localDateTime12.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.era();
        java.util.Locale locale22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = property20.setCopy("1439", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1439\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 82800001 + "'", int10 == 82800001);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 23 + "'", int13 == 23);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        boolean boolean5 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet4);
        boolean boolean6 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet2);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale locale10 = java.util.Locale.JAPAN;
        java.lang.String str11 = locale10.getVariant();
        java.util.Locale locale12 = java.util.Locale.JAPAN;
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.lang.String str14 = locale13.getCountry();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale10, locale12, locale13, locale15, locale16 };
        java.util.ArrayList<java.util.Locale> localeList19 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList19, localeArray18);
        java.util.Locale.FilteringMode filteringMode21 = null;
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList19, filteringMode21);
        boolean boolean23 = strSet2.remove((java.lang.Object) localeList19);
        boolean boolean24 = strSet2.isEmpty();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        int int31 = localDateTime26.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime26.minus(readablePeriod34);
        int int36 = localDateTime35.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = localDateTime35.getField(0);
        boolean boolean39 = strSet2.remove((java.lang.Object) 0);
        java.util.Locale locale40 = java.util.Locale.KOREA;
        java.util.Locale locale41 = java.util.Locale.KOREA;
        java.lang.String str42 = locale40.getDisplayLanguage(locale41);
        java.lang.String str43 = locale41.getISO3Country();
        java.util.Set<java.lang.String> strSet44 = locale41.getUnicodeLocaleAttributes();
        boolean boolean45 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet44);
        boolean boolean46 = strSet2.isEmpty();
        boolean boolean47 = strSet2.isEmpty();
        int int48 = strSet2.size();
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FR" + "'", str14, "FR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(localeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23 + "'", int27 == 23);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 12 + "'", int31 == 12);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str42, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "KOR" + "'", str43, "KOR");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getAsString();
        org.joda.time.LocalDateTime localDateTime14 = property11.withMaximumValue();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = localDateTime14.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        int int22 = localDateTime17.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.minus(readablePeriod25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime17.millisOfSecond();
        long long28 = property27.remainder();
        java.lang.String str29 = property27.getName();
        java.util.Locale locale30 = java.util.Locale.CHINA;
        java.lang.String str31 = property27.getAsText(locale30);
        org.joda.time.LocalDateTime localDateTime32 = property27.withMinimumValue();
        boolean boolean34 = property27.equals((java.lang.Object) 59);
        org.joda.time.LocalDateTime localDateTime35 = property27.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 1);
        int int38 = localDateTime37.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withPeriodAdded(readablePeriod41, 10);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withDayOfYear(11);
        org.joda.time.Chronology chronology46 = localDateTime45.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = localDateTime45.getFieldType((int) (byte) 0);
        int int49 = localDateTime35.indexOf(dateTimeFieldType48);
        boolean boolean50 = localDateTime14.isEqual((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime14.plus(readableDuration51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 23 + "'", int18 == 23);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "millisOfSecond" + "'", str29, "millisOfSecond");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1" + "'", str31, "1");
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 23 + "'", int38 == 23);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localDateTime52);
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = islamicChronology9.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology9.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology9.hourOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology9.minuteOfDay();
        boolean boolean17 = islamicChronology2.equals((java.lang.Object) dateTimeField16);
        org.joda.time.DurationField durationField18 = islamicChronology2.millis();
        org.joda.time.DurationField durationField19 = islamicChronology2.weeks();
        org.joda.time.DurationField durationField20 = islamicChronology2.minutes();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone dateTimeZone3 = provider0.getZone("1970");
        java.util.Set<java.lang.String> strSet4 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone6 = provider0.getZone("\ud55c\uad6d\uc5b4");
        java.util.Set<java.lang.String> strSet7 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.util.Set<java.lang.String> strSet9 = provider0.getAvailableIDs();
        java.util.Set<java.lang.String> strSet10 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone12 = provider0.getZone("3660");
        java.util.Set<java.lang.String> strSet13 = provider0.getAvailableIDs();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.toString();
        long long5 = dateTimeZone1.nextTransition((long) 1);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType6 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType6);
        org.joda.time.DurationField durationField8 = islamicChronology7.months();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.monthOfYear();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        boolean boolean14 = timeZone11.hasSameRules(timeZone13);
        timeZone13.setRawOffset(11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.Chronology chronology18 = islamicChronology7.withZone(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusHours((int) (byte) -1);
        int int25 = localDateTime20.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime20.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime20.minus(readablePeriod28);
        int int30 = localDateTime29.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField32 = localDateTime29.getField(0);
        org.joda.time.LocalDateTime.Property property33 = localDateTime29.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.plus(readableDuration34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime29.minusMonths(59);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusMillis((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.withPeriodAdded(readablePeriod40, 0);
        int int43 = localDateTime37.getWeekyear();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime37.withYear(19559183);
        boolean boolean46 = dateTimeZone17.isLocalDateTimeGap(localDateTime37);
        java.lang.String str48 = dateTimeZone17.getName(24901200001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+01:00" + "'", str3, "+01:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(leapYearPatternType6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 23 + "'", int21 == 23);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 12 + "'", int25 == 12);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1965 + "'", int43 == 1965);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2000", (double) 1647217523579L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.647217523579E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime11 = property8.roundFloorCopy();
        java.lang.String str12 = property8.getAsText();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DurationField durationField16 = islamicChronology15.weekyears();
        org.joda.time.DurationField durationField17 = islamicChronology15.months();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology15.minuteOfHour();
        org.joda.time.DurationField durationField19 = islamicChronology15.hours();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology15.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology23 = islamicChronology15.withZone(dateTimeZone22);
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = dateTimeZone22.getShortName((long) 11, locale25);
        int int27 = property8.getMaximumShortTextLength(locale25);
        java.util.Locale locale28 = locale25.stripExtensions();
        java.lang.String str29 = locale28.getDisplayName();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\uc601\uc5b4\uce90\ub098\ub2e4)" + "'", str29, "\uc601\uc5b4\uce90\ub098\ub2e4)");
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField7 = islamicChronology2.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.minuteOfDay();
        long long12 = dateTimeField10.roundHalfCeiling(15552000000000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 15552000000000000L + "'", long12 == 15552000000000000L);
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.days();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = islamicChronology2.add(readablePeriod24, (long) 'a', (int) (byte) 0);
        org.joda.time.DurationField durationField28 = islamicChronology2.millis();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.monthOfYear();
        org.joda.time.DurationField durationField30 = islamicChronology2.centuries();
        org.joda.time.DurationField durationField31 = islamicChronology2.centuries();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getISO3Language();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale0.getDisplayScript(locale5);
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder8.setVariant("");
        java.util.Locale locale11 = builder10.build();
        java.util.Locale.Builder builder14 = builder10.setExtension('a', "GMT");
        java.util.Locale.Builder builder16 = builder14.removeUnicodeLocaleAttribute("1969");
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        org.joda.time.DurationField durationField20 = islamicChronology19.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology19.yearOfEra();
        long long23 = dateTimeField21.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusHours((int) (byte) -1);
        int int29 = localDateTime25.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime25.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime25.minus(readableDuration34);
        java.util.Locale locale36 = java.util.Locale.PRC;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.lang.String str38 = dateTimeField21.getAsShortText((org.joda.time.ReadablePartial) localDateTime35, locale36);
        java.lang.String str40 = locale36.getUnicodeLocaleType("JP");
        java.util.Set<java.lang.Character> charSet41 = locale36.getExtensionKeys();
        java.util.Locale.setDefault(locale36);
        java.util.Locale.Builder builder43 = builder16.setLocale(locale36);
        java.util.Set<java.lang.String> strSet44 = locale36.getUnicodeLocaleKeys();
        java.lang.String str45 = locale5.getDisplayCountry(locale36);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "it" + "'", str1, "it");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ita" + "'", str4, "ita");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(islamicChronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5785200000L + "'", long23 == 5785200000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 23 + "'", int26 == 23);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1969" + "'", str38, "1969");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(charSet41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology2.weeks();
        org.joda.time.DurationField durationField9 = islamicChronology2.minutes();
        org.joda.time.DurationField durationField10 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localDateTime20.getFields();
        boolean boolean22 = dateTimeZone14.isLocalDateTimeGap(localDateTime20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        java.util.TimeZone timeZone24 = dateTimeZone14.toTimeZone();
        long long26 = dateTimeZone14.previousTransition((long) 24);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(11L, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(dateTimeZone14);
        org.joda.time.Chronology chronology29 = islamicChronology2.withZone(dateTimeZone14);
        long long31 = dateTimeZone14.nextTransition((long) 2922711);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 23 + "'", int18 == 23);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 24L + "'", long26 == 24L);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 2922711L + "'", long31 == 2922711L);
        org.junit.Assert.assertNotNull(islamicChronology32);
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setExtension('a', "GMT");
        java.util.Locale.Builder builder8 = builder2.setRegion("ja");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder2.removeUnicodeLocaleAttribute("0100-10-10T11:00:32.000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 0100-10-10T11:00:32.000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField5 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField9 = islamicChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField17 = islamicChronology2.weeks();
        org.joda.time.DurationField durationField18 = islamicChronology2.millis();
        org.joda.time.DurationField durationField19 = islamicChronology2.days();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 45);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.monthOfYear();
        org.joda.time.LocalDateTime localDateTime25 = property24.withMaximumValue();
        java.util.Date date26 = localDateTime25.toDate();
        int[] intArray28 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime25, 19360306582095L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(date26);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Wed Dec 21 15:41:23 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[2022, 2, 21, 57382095]");
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField11 = islamicChronology10.weekyears();
        org.joda.time.DurationField durationField12 = islamicChronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology10.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology10.hourOfDay();
        org.joda.time.Chronology chronology16 = islamicChronology10.withUTC();
        boolean boolean17 = islamicChronology2.equals((java.lang.Object) chronology16);
        org.joda.time.DurationField durationField18 = islamicChronology2.millis();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        int int17 = localDateTime16.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusHours((int) (byte) -1);
        int int21 = localDateTime16.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime16.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime16.minus(readablePeriod24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime16.millisOfSecond();
        long long27 = property26.remainder();
        java.lang.String str28 = property26.getName();
        java.util.Locale locale29 = java.util.Locale.CHINA;
        java.lang.String str30 = property26.getAsText(locale29);
        org.joda.time.LocalDateTime localDateTime31 = property26.withMinimumValue();
        boolean boolean33 = property26.equals((java.lang.Object) 59);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 1);
        int int36 = localDateTime35.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray39 = localDateTime38.getFields();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.minusDays(4);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 1);
        int int44 = localDateTime43.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.minusHours((int) (byte) -1);
        int int48 = localDateTime43.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime43.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime43.minus(readablePeriod51);
        int int53 = localDateTime52.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField55 = localDateTime52.getField(0);
        org.joda.time.LocalDateTime.Property property56 = localDateTime52.centuryOfEra();
        org.joda.time.LocalDateTime.Property property57 = localDateTime52.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime52.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean63 = localDateTime38.isBefore((org.joda.time.ReadablePartial) localDateTime62);
        org.joda.time.LocalDateTime.Property property64 = localDateTime62.weekyear();
        boolean boolean65 = property26.equals((java.lang.Object) localDateTime62);
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime((long) 1);
        int int68 = localDateTime67.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime67.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology73 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone72);
        org.joda.time.DurationField durationField74 = islamicChronology73.weekyears();
        org.joda.time.DurationField durationField75 = islamicChronology73.halfdays();
        org.joda.time.DateTimeField dateTimeField76 = islamicChronology73.yearOfEra();
        org.joda.time.DurationField durationField77 = islamicChronology73.halfdays();
        org.joda.time.DurationFieldType durationFieldType78 = durationField77.getType();
        boolean boolean79 = localDateTime67.isSupported(durationFieldType78);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime62.withFields((org.joda.time.ReadablePartial) localDateTime67);
        org.joda.time.ReadableDuration readableDuration81 = null;
        org.joda.time.LocalDateTime localDateTime82 = localDateTime62.minus(readableDuration81);
        org.joda.time.LocalDateTime localDateTime83 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime85 = localDateTime83.minusMinutes(0);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime85.plusMinutes(100);
        int[] intArray88 = localDateTime85.getValues();
        islamicChronology2.validate((org.joda.time.ReadablePartial) localDateTime62, intArray88);
        org.joda.time.DateTimeField dateTimeField90 = islamicChronology2.clockhourOfDay();
        long long92 = dateTimeField90.roundHalfEven(19360306351898L);
        long long94 = dateTimeField90.roundFloor(19L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "millisOfSecond" + "'", str28, "millisOfSecond");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1" + "'", str30, "1");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldArray39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertNotNull(islamicChronology73);
        org.junit.Assert.assertNotNull(durationField74);
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(durationField77);
        org.junit.Assert.assertNotNull(durationFieldType78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertNotNull(localDateTime85);
        org.junit.Assert.assertNotNull(localDateTime87);
        org.junit.Assert.assertNotNull(intArray88);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[2022, 2, 21, 57383159]");
        org.junit.Assert.assertNotNull(dateTimeField90);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 19360306800000L + "'", long92 == 19360306800000L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((-9), 163440000, 0, 322671769, 1951);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 322671769 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, 10);
        int int8 = localDateTime7.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int int16 = localDateTime15.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = localDateTime18.getFields();
        boolean boolean20 = dateTimeZone12.isLocalDateTimeGap(localDateTime18);
        int int21 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime10.plusMonths(5);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime10.plus(readablePeriod24);
        org.joda.time.Chronology chronology26 = localDateTime10.getChronology();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(8969);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays(12);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = islamicChronology6.weekyears();
        org.joda.time.DurationField durationField8 = islamicChronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology6.yearOfEra();
        org.joda.time.DurationField durationField10 = islamicChronology6.halfdays();
        org.joda.time.DurationFieldType durationFieldType11 = durationField10.getType();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withFieldAdded(durationFieldType11, (int) '#');
        int int14 = localDateTime1.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.withPeriodAdded(readablePeriod15, (int) (byte) 10);
        java.lang.String str19 = localDateTime17.toString("\u7fa9\u5927\u5229\u6587");
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u7fa9\u5927\u5229\u6587" + "'", str19, "\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
        java.util.Locale locale2 = new java.util.Locale("weeks", "3601");
        org.junit.Assert.assertEquals(locale2.toString(), "weeks_3601");
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = islamicChronology2.withZone(dateTimeZone9);
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = dateTimeZone9.getShortName((long) 11, locale12);
        java.lang.String str15 = dateTimeZone9.getNameKey(62625345L);
        long long18 = dateTimeZone9.adjustOffset(0L, true);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 1);
        int int22 = localDateTime21.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withPeriodAdded(readablePeriod25, 10);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withDayOfYear(11);
        int[] intArray30 = localDateTime29.getValues();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.plusHours((int) (short) 0);
        int int33 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        int int34 = localDateTime19.getWeekyear();
        org.joda.time.LocalDateTime.Property property35 = localDateTime19.weekyear();
        org.joda.time.DateTime dateTime36 = localDateTime19.toDateTime();
        boolean boolean37 = dateTimeZone9.isLocalDateTimeGap(localDateTime19);
        long long39 = dateTimeZone9.nextTransition((-19985301L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 1, 11, 3600001]");
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2022 + "'", int34 == 2022);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-19985301L) + "'", long39 == (-19985301L));
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.weeks();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1);
        int int8 = localDateTime7.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYear((int) (byte) 100);
        int int11 = localDateTime7.size();
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localDateTime7.getFields();
        org.joda.time.LocalDateTime.Property property13 = localDateTime7.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.minusWeeks(29);
        int int16 = localDateTime15.getMillisOfSecond();
        boolean boolean17 = islamicChronology2.equals((java.lang.Object) int16);
        org.joda.time.DurationField durationField18 = islamicChronology2.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusMinutes(14);
        int int14 = localDateTime10.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime17 = property15.addWrapFieldToCopy(39);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withWeekOfWeekyear((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 41 + "'", int14 == 41);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "FR");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        org.joda.time.tz.NameProvider nameProvider5 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale6.getUnicodeLocaleType("FR");
        java.lang.String str12 = nameProvider5.getName(locale6, "\uc601\uc5b4", "GMT+00:00");
        java.lang.String str13 = locale6.getLanguage();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str16 = locale6.getDisplayScript(locale14);
        boolean boolean17 = locale6.hasExtensions();
        java.util.Locale.Builder builder18 = builder3.setLocale(locale6);
        java.util.Locale locale19 = builder3.build();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(nameProvider5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko" + "'", str13, "ko");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        boolean boolean3 = dateTimeZone1.isFixed();
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(islamicChronology4);
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.monthOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology2.hours();
        java.lang.String str11 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.minuteOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology2.weekyears();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IslamicChronology[+01:00]" + "'", str11, "IslamicChronology[+01:00]");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField5 = islamicChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.centuryOfEra();
        org.joda.time.DurationField durationField10 = islamicChronology2.hours();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-292275054));
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = islamicChronology5.years();
        org.joda.time.DurationField durationField8 = islamicChronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology5.getZone();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) islamicChronology5);
        int int13 = dateTimeZone1.getOffset(19360306116772L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        int int17 = islamicChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology16.secondOfDay();
        org.joda.time.DurationField durationField19 = islamicChronology16.centuries();
        boolean boolean20 = dateTimeZone1.equals((java.lang.Object) durationField19);
        long long23 = dateTimeZone1.convertLocalToUTC(442L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-292275054) + "'", int13 == (-292275054));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 292275496L + "'", long23 == 292275496L);
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        java.lang.String[] strArray1 = new java.lang.String[] { "1970" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.Object[] objArray4 = strSet2.toArray();
        java.util.stream.Stream<java.lang.String> strStream5 = strSet2.parallelStream();
        strSet2.clear();
        boolean boolean7 = strSet2.isEmpty();
        java.util.Iterator<java.lang.String> strItor8 = strSet2.iterator();
        int int9 = strSet2.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1970]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1970]");
        org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology2.days();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.centuryOfEra();
        int int12 = dateTimeField10.getMaximumValue(248401970L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2922711 + "'", int12 == 2922711);
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13642");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.DurationField durationField26 = islamicChronology2.months();
        org.joda.time.DurationField durationField27 = islamicChronology2.millis();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 1);
        int int30 = localDateTime29.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = localDateTime29.toDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) 1);
        int int39 = localDateTime38.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology44 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = localDateTime38.toDateTime(dateTimeZone43);
        long long46 = dateTime45.getMillis();
        boolean boolean47 = dateTime36.isAfter((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime36.getZone();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 1);
        int int51 = localDateTime50.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.minusHours((int) (byte) -1);
        int int54 = localDateTime50.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime50.withMinuteOfHour((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.withDurationAdded(readableDuration57, (int) 'x');
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.minusDays(82800001);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime59.plusHours(60);
        boolean boolean64 = dateTimeZone48.isLocalDateTimeGap(localDateTime59);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology67 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone66);
        org.joda.time.DateTimeField dateTimeField68 = islamicChronology67.yearOfCentury();
        org.joda.time.DurationField durationField69 = islamicChronology67.years();
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime((long) 1);
        int int72 = localDateTime71.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime71.minusHours((int) (byte) -1);
        int int76 = localDateTime71.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime71.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.LocalDateTime localDateTime80 = localDateTime71.minus(readablePeriod79);
        int int81 = localDateTime80.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField83 = localDateTime80.getField(0);
        org.joda.time.LocalDateTime.Property property84 = localDateTime80.centuryOfEra();
        int[] intArray86 = islamicChronology67.get((org.joda.time.ReadablePartial) localDateTime80, (long) 0);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime80.withMillisOfSecond(60);
        int int89 = localDateTime88.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property90 = localDateTime88.dayOfMonth();
        boolean boolean91 = localDateTime59.isEqual((org.joda.time.ReadablePartial) localDateTime88);
        int[] intArray93 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime88, 17763671940001L);
        org.joda.time.DateTimeFieldType dateTimeFieldType94 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime.Property property95 = localDateTime88.property(dateTimeFieldType94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(islamicChronology35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(islamicChronology44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(islamicChronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(property90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[1969, 12, 28, 8340001]");
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13643");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology2.add(readablePeriod6, (long) 11, 82800001);
        org.joda.time.DurationField durationField10 = islamicChronology2.weeks();
        org.joda.time.DurationField durationField11 = islamicChronology2.weekyears();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13644");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withPeriodAdded(readablePeriod12, 10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withDayOfYear(11);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = localDateTime16.getFieldType((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.minus(readablePeriod20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.monthOfYear();
        int int23 = localDateTime21.getYear();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withWeekyear(95913);
        int[] intArray27 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime21, (-1414443600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1343, 8, 11, 14400000]");
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13645");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.monthOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.year();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.year();
        org.joda.time.DurationField durationField12 = islamicChronology2.weekyears();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13646");
        java.util.Locale locale1 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Spliterator<java.lang.String> strSpliterator3 = strSet2.spliterator();
        int int4 = strSet2.size();
        int int5 = strSet2.size();
        int int6 = strSet2.size();
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13647");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "FR");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        org.joda.time.tz.NameProvider nameProvider5 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str9 = locale6.getUnicodeLocaleType("FR");
        java.lang.String str12 = nameProvider5.getName(locale6, "\uc601\uc5b4", "GMT+00:00");
        java.lang.String str13 = locale6.getLanguage();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str16 = locale6.getDisplayScript(locale14);
        boolean boolean17 = locale6.hasExtensions();
        java.util.Locale.Builder builder18 = builder3.setLocale(locale6);
        java.util.Locale.Builder builder20 = builder18.setLanguageTag("italiano");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder18.setVariant("\uc624\uc804");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(nameProvider5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko" + "'", str13, "ko");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13648");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusMonths(100);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusWeeks(10);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withPeriodAdded(readablePeriod21, 10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withDayOfYear(11);
        int[] intArray26 = localDateTime25.getValues();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusMonths((int) 'a');
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withMinuteOfHour(23);
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.minusMonths((-1));
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 1);
        int int38 = localDateTime37.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusHours((int) (byte) -1);
        int int42 = localDateTime37.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime37.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime37.minus(readablePeriod45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime37.millisOfSecond();
        long long48 = property47.remainder();
        java.lang.String str49 = property47.getName();
        java.util.Locale locale50 = java.util.Locale.CHINA;
        java.lang.String str51 = property47.getAsText(locale50);
        org.joda.time.LocalDateTime localDateTime52 = property47.withMinimumValue();
        boolean boolean54 = property47.equals((java.lang.Object) 59);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) 1);
        int int57 = localDateTime56.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray60 = localDateTime59.getFields();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.minusDays(4);
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) 1);
        int int65 = localDateTime64.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.minusHours((int) (byte) -1);
        int int69 = localDateTime64.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime64.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.LocalDateTime localDateTime73 = localDateTime64.minus(readablePeriod72);
        int int74 = localDateTime73.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField76 = localDateTime73.getField(0);
        org.joda.time.LocalDateTime.Property property77 = localDateTime73.centuryOfEra();
        org.joda.time.LocalDateTime.Property property78 = localDateTime73.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime73.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean84 = localDateTime59.isBefore((org.joda.time.ReadablePartial) localDateTime83);
        org.joda.time.LocalDateTime.Property property85 = localDateTime83.weekyear();
        boolean boolean86 = property47.equals((java.lang.Object) localDateTime83);
        java.util.Locale locale87 = java.util.Locale.KOREA;
        java.util.Locale locale88 = java.util.Locale.KOREA;
        java.lang.String str89 = locale87.getDisplayLanguage(locale88);
        int int90 = property47.getMaximumTextLength(locale87);
        org.joda.time.DurationField durationField91 = property47.getLeapDurationField();
        org.joda.time.DurationField durationField92 = property47.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType93 = property47.getFieldType();
        boolean boolean94 = localDateTime35.isSupported(dateTimeFieldType93);
        int int95 = localDateTime15.get(dateTimeFieldType93);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 1, 11, 3600001]");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "millisOfSecond" + "'", str49, "millisOfSecond");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "1" + "'", str51, "1");
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(dateTimeFieldArray60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str89, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 3 + "'", int90 == 3);
        org.junit.Assert.assertNull(durationField91);
        org.junit.Assert.assertNotNull(durationField92);
        org.junit.Assert.assertNotNull(dateTimeFieldType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13649");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = islamicChronology2.halfdays();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = islamicChronology9.weekyears();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        boolean boolean15 = dateTimeZone12.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology16 = islamicChronology9.withZone(dateTimeZone12);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale18.getDisplayLanguage(locale19);
        java.lang.String str21 = locale19.getISO3Country();
        java.util.Set<java.lang.String> strSet22 = locale19.getUnicodeLocaleAttributes();
        java.lang.String str23 = dateTimeZone12.getName(24796800001L, locale19);
        org.joda.time.Chronology chronology24 = islamicChronology2.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField27 = islamicChronology2.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str20, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "KOR" + "'", str21, "KOR");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+01:00" + "'", str23, "+01:00");
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13650");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int3 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.millisOfDay();
        long long8 = islamicChronology2.add(2015L, (-3598030L), 19);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DurationField durationField15 = islamicChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology14.yearOfEra();
        long long18 = dateTimeField16.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 1);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minusHours((int) (byte) -1);
        int int24 = localDateTime20.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime20.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime20.minus(readableDuration29);
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.util.Locale locale32 = locale31.stripExtensions();
        java.lang.String str33 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) localDateTime30, locale31);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.plus(readablePeriod34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime30.plus(readablePeriod36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusMonths((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.plus(readableDuration40);
        int int42 = localDateTime37.size();
        org.joda.time.LocalDateTime.Property property43 = localDateTime37.millisOfSecond();
        java.util.Locale locale44 = java.util.Locale.ENGLISH;
        java.lang.String str45 = locale44.getDisplayLanguage();
        int int46 = property43.getMaximumTextLength(locale44);
        org.joda.time.LocalDateTime localDateTime47 = property43.roundHalfFloorCopy();
        int int48 = dateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) localDateTime47);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-68360555L) + "'", long8 == (-68360555L));
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5785200000L + "'", long18 == 5785200000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970" + "'", str33, "1970");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\u82f1\u6587" + "'", str45, "\u82f1\u6587");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 86399999 + "'", int48 == 86399999);
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13651");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("");
        boolean boolean4 = timeZone1.hasSameRules(timeZone3);
        timeZone1.setID("\uc774\ud0c8\ub9ac\uc544\uc5b4");
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("");
        boolean boolean11 = timeZone8.hasSameRules(timeZone10);
        int int12 = timeZone10.getRawOffset();
        boolean boolean13 = timeZone1.hasSameRules(timeZone10);
        java.time.ZoneId zoneId14 = timeZone10.toZoneId();
        java.lang.String str15 = timeZone10.getID();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = timeZone10.getOffset(355, 3600045, (-683357), 53529512, 1975, 411199);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(zoneId14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GMT" + "'", str15, "GMT");
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13652");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.secondOfMinute();
        long long8 = islamicChronology2.add((-3598030L), (long) 292271022, 9);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        org.joda.time.Chronology chronology11 = islamicChronology2.withZone(dateTimeZone10);
        long long13 = dateTimeZone10.previousTransition(52254151200009L);
        int int15 = dateTimeZone10.getOffsetFromLocal(1065830399996419800L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2626841168L + "'", long8 == 2626841168L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52254151200009L + "'", long13 == 52254151200009L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3600000 + "'", int15 == 3600000);
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13653");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getName();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = property11.getAsText(locale14);
        java.lang.String str16 = property11.getAsText();
        java.lang.String str17 = property11.toString();
        org.joda.time.LocalDateTime localDateTime19 = property11.addToCopy((-475104084L));
        org.joda.time.tz.NameProvider nameProvider20 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str24 = nameProvider20.getName(locale21, "JPN", "0");
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        int int31 = localDateTime26.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime26.minus(readablePeriod34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime26.millisOfSecond();
        long long37 = property36.remainder();
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.lang.String str40 = locale38.getDisplayLanguage(locale39);
        java.util.Locale.setDefault(locale38);
        int int42 = property36.getMaximumShortTextLength(locale38);
        java.lang.String str45 = nameProvider20.getName(locale38, "IslamicChronology[+01:00]", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        java.util.Set<java.lang.String> strSet46 = locale38.getUnicodeLocaleKeys();
        java.lang.String str47 = property11.getAsShortText(locale38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "millisOfSecond" + "'", str13, "millisOfSecond");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Property[millisOfSecond]" + "'", str17, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(nameProvider20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str40, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(strSet46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1" + "'", str47, "1");
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13654");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("");
        boolean boolean4 = timeZone1.hasSameRules(timeZone3);
        int int5 = timeZone1.getRawOffset();
        java.time.ZoneId zoneId6 = timeZone1.toZoneId();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone(zoneId6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13655");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-292275054));
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = islamicChronology5.years();
        org.joda.time.DurationField durationField8 = islamicChronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology5.getZone();
        boolean boolean11 = dateTimeZone1.equals((java.lang.Object) islamicChronology5);
        int int13 = dateTimeZone1.getStandardOffset(19360302568999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-292275054) + "'", int13 == (-292275054));
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13656");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.secondOfMinute();
        org.joda.time.DurationField durationField7 = islamicChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology2);
        int[] intArray10 = localDateTime9.getValues();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1443, 7, 19, 57383747]");
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13657");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
        int int4 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.weekyear();
        org.joda.time.DurationField durationField6 = islamicChronology3.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 59, (org.joda.time.Chronology) islamicChronology3);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) islamicChronology3);
        org.joda.time.DurationField durationField10 = islamicChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.minuteOfHour();
        org.joda.time.DurationField durationField13 = islamicChronology3.halfdays();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        int int16 = localDateTime15.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withPeriodAdded(readablePeriod19, 10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withDayOfYear(11);
        int[] intArray24 = localDateTime23.getValues();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.weekOfWeekyear();
        org.joda.time.Chronology chronology26 = localDateTime23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology29.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology29.hourOfHalfday();
        org.joda.time.DurationField durationField32 = islamicChronology29.days();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology29.year();
        org.joda.time.DurationField durationField34 = islamicChronology29.weekyears();
        org.joda.time.DurationField durationField35 = islamicChronology29.centuries();
        org.joda.time.DateTimeField dateTimeField36 = islamicChronology29.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plus(readableDuration44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withMillisOfSecond(60);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) 1);
        int int50 = localDateTime49.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.minusHours((int) (byte) -1);
        int int54 = localDateTime49.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime49.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime49.minus(readablePeriod57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime49.millisOfSecond();
        long long60 = property59.remainder();
        java.lang.String str61 = property59.getName();
        java.util.Locale locale62 = java.util.Locale.CHINA;
        java.lang.String str63 = property59.getAsText(locale62);
        org.joda.time.LocalDateTime localDateTime64 = property59.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.plusYears(4);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plus(readablePeriod67);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology71 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone70);
        org.joda.time.DurationField durationField72 = islamicChronology71.weekyears();
        org.joda.time.DurationField durationField73 = islamicChronology71.halfdays();
        org.joda.time.DurationField durationField74 = islamicChronology71.weeks();
        org.joda.time.DateTimeField dateTimeField75 = islamicChronology71.yearOfEra();
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((long) 1);
        int int78 = localDateTime77.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime77.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray81 = localDateTime80.getFields();
        java.util.Locale locale82 = java.util.Locale.KOREA;
        java.util.Locale locale83 = java.util.Locale.KOREA;
        java.lang.String str84 = locale82.getDisplayLanguage(locale83);
        java.lang.String str85 = dateTimeField75.getAsText((org.joda.time.ReadablePartial) localDateTime80, locale82);
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = dateTimeField75.getType();
        org.joda.time.LocalDateTime localDateTime88 = localDateTime66.withField(dateTimeFieldType86, (int) ' ');
        org.joda.time.LocalDateTime.Property property89 = localDateTime88.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod90 = null;
        org.joda.time.LocalDateTime localDateTime91 = localDateTime88.plus(readablePeriod90);
        org.joda.time.LocalDateTime.Property property92 = localDateTime88.centuryOfEra();
        org.joda.time.LocalDateTime.Property property93 = localDateTime88.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime95 = localDateTime88.withSecondOfMinute(29);
        int[] intArray96 = localDateTime95.getValues();
        int int97 = dateTimeField36.getMinimumValue((org.joda.time.ReadablePartial) localDateTime47, intArray96);
        islamicChronology3.validate((org.joda.time.ReadablePartial) localDateTime23, intArray96);
        org.joda.time.DateTimeField dateTimeField99 = islamicChronology3.era();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 1, 11, 3600001]");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(islamicChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "millisOfSecond" + "'", str61, "millisOfSecond");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1" + "'", str63, "1");
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(islamicChronology71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertNotNull(durationField73);
        org.junit.Assert.assertNotNull(durationField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(dateTimeFieldArray81);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str84, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "1970" + "'", str85, "1970");
        org.junit.Assert.assertNotNull(dateTimeFieldType86);
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(localDateTime91);
        org.junit.Assert.assertNotNull(property92);
        org.junit.Assert.assertNotNull(property93);
        org.junit.Assert.assertNotNull(localDateTime95);
        org.junit.Assert.assertNotNull(intArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray96), "[32, 1, 1, 3629000]");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(dateTimeField99);
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13658");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(27);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13659");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13660");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        long long6 = dateTimeField4.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusHours((int) (byte) -1);
        int int12 = localDateTime8.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.minus(readableDuration17);
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localDateTime18, locale19);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plus(readablePeriod22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.plus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusMonths((int) (short) 100);
        int[] intArray28 = localDateTime27.getValues();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.weekyear();
        java.lang.String str30 = property29.getAsShortText();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5785200000L + "'", long6 == 5785200000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970" + "'", str21, "1970");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1978, 5, 1, 3600001]");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1978" + "'", str30, "1978");
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13661");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusDays((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plusWeeks(80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13662");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.minuteOfHour();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13663");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("3600120");
        org.joda.time.Chronology chronology2 = localDateTime1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withCenturyOfEra(7200001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7200001 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13664");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale0.getDisplayLanguage(locale1);
        java.lang.String str3 = locale1.getISO3Country();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleAttributes();
        strSet4.clear();
        java.util.Set<java.lang.String> strSet6 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.stream.Stream<java.lang.String> strStream7 = strSet6.stream();
        java.util.Spliterator<java.lang.String> strSpliterator8 = strSet6.spliterator();
        boolean boolean9 = strSet4.removeAll((java.util.Collection<java.lang.String>) strSet6);
        java.util.stream.Stream<java.lang.String> strStream10 = strSet4.parallelStream();
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        boolean boolean15 = strSet12.removeAll((java.util.Collection<java.lang.String>) strSet14);
        java.util.Set<java.lang.String> strSet16 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleAttributes();
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        boolean boolean21 = strSet18.removeAll((java.util.Collection<java.lang.String>) strSet20);
        boolean boolean22 = strSet16.addAll((java.util.Collection<java.lang.String>) strSet18);
        boolean boolean23 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet18);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField27 = islamicChronology26.weekyears();
        org.joda.time.DurationField durationField28 = islamicChronology26.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology26.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology26.minuteOfHour();
        boolean boolean31 = strSet18.contains((java.lang.Object) dateTimeField30);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone33);
        org.joda.time.DurationField durationField35 = islamicChronology34.weekyears();
        org.joda.time.DurationField durationField36 = islamicChronology34.halfdays();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology34.yearOfEra();
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology34.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField39 = islamicChronology34.monthOfYear();
        org.joda.time.Chronology chronology40 = islamicChronology34.withUTC();
        org.joda.time.DurationField durationField41 = islamicChronology34.weekyears();
        org.joda.time.DurationField durationField42 = islamicChronology34.weeks();
        boolean boolean43 = strSet18.remove((java.lang.Object) islamicChronology34);
        boolean boolean44 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet18);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str2, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "KOR" + "'", str3, "KOR");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertNotNull(strSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(islamicChronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(islamicChronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13665");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology27.yearOfCentury();
        org.joda.time.DurationField durationField29 = islamicChronology27.years();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        int int36 = localDateTime31.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime31.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime31.minus(readablePeriod39);
        int int41 = localDateTime40.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField43 = localDateTime40.getField(0);
        org.joda.time.LocalDateTime.Property property44 = localDateTime40.centuryOfEra();
        int[] intArray46 = islamicChronology27.get((org.joda.time.ReadablePartial) localDateTime40, (long) 0);
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology27.millisOfDay();
        org.joda.time.DurationField durationField48 = islamicChronology27.centuries();
        org.joda.time.DateTimeZone dateTimeZone49 = islamicChronology27.getZone();
        org.joda.time.Chronology chronology50 = islamicChronology2.withZone(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField51 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField53 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField54 = islamicChronology2.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) 1);
        int int57 = localDateTime56.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.minusHours((int) (byte) -1);
        int int61 = localDateTime56.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime56.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.LocalDateTime localDateTime65 = localDateTime56.minus(readablePeriod64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime56.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int74 = localDateTime73.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property75 = localDateTime73.hourOfDay();
        org.joda.time.LocalDateTime localDateTime77 = property75.addToCopy((int) (byte) 100);
        int int78 = localDateTime56.compareTo((org.joda.time.ReadablePartial) localDateTime77);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime56.withMinuteOfHour((int) '4');
        int int81 = localDateTime56.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime83 = new org.joda.time.LocalDateTime((long) (byte) 10);
        org.joda.time.LocalDateTime.Property property84 = localDateTime83.yearOfCentury();
        int[] intArray85 = localDateTime83.getValues();
        int int86 = dateTimeField54.getMaximumValue((org.joda.time.ReadablePartial) localDateTime56, intArray85);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(islamicChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[1970, 1, 1, 3600010]");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13666");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 45);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = islamicChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology5.millisOfSecond();
        long long11 = islamicChronology5.add((long) (byte) -1, (long) 0, (int) (byte) 10);
        boolean boolean12 = dateTimeZone2.equals((java.lang.Object) long11);
        long long15 = dateTimeZone2.adjustOffset((-15300000000L), true);
        java.util.TimeZone timeZone16 = dateTimeZone2.toTimeZone();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        int int19 = localDateTime18.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusHours((int) (byte) -1);
        int int23 = localDateTime18.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime18.minus(readablePeriod26);
        int int28 = localDateTime27.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField30 = localDateTime27.getField(0);
        org.joda.time.LocalDateTime.Property property31 = localDateTime27.centuryOfEra();
        org.joda.time.LocalDateTime.Property property32 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime27.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) 1);
        int int40 = localDateTime39.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.minusHours((int) (byte) -1);
        int int44 = localDateTime39.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime39.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime39.minus(readablePeriod47);
        int int49 = localDateTime48.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField51 = localDateTime48.getField(0);
        org.joda.time.LocalDateTime.Property property52 = localDateTime48.centuryOfEra();
        org.joda.time.LocalDateTime.Property property53 = localDateTime48.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property53.getFieldType();
        boolean boolean55 = localDateTime37.isSupported(dateTimeFieldType54);
        int int56 = localDateTime37.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property57 = localDateTime37.dayOfMonth();
        int int58 = localDateTime37.getDayOfWeek();
        boolean boolean59 = dateTimeZone2.isLocalDateTimeGap(localDateTime37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField61 = localDateTime37.getField(26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-15300000000L) + "'", long15 == (-15300000000L));
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:45");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 4 + "'", int58 == 4);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13667");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.dayOfMonth();
        org.joda.time.DurationField durationField15 = dateTimeField14.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        org.joda.time.DurationField durationField19 = islamicChronology18.weekyears();
        org.joda.time.DurationField durationField20 = islamicChronology18.halfdays();
        org.joda.time.DurationField durationField21 = islamicChronology18.weeks();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology18.yearOfEra();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 1);
        int int25 = localDateTime24.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = localDateTime27.getFields();
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = locale29.getDisplayLanguage(locale30);
        java.lang.String str32 = dateTimeField22.getAsText((org.joda.time.ReadablePartial) localDateTime27, locale29);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime27.minusSeconds((int) (short) 100);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeField14.getAsShortText((org.joda.time.ReadablePartial) localDateTime34, 82800001, locale36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime34.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType39 = null;
        boolean boolean40 = localDateTime34.isSupported(durationFieldType39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime34.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(islamicChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldArray28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str31, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970" + "'", str32, "1970");
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "82800001" + "'", str37, "82800001");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13668");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int3 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plus(readablePeriod4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plus(readablePeriod6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.year();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime13.getFields();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusDays(4);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        int int19 = localDateTime18.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusHours((int) (byte) -1);
        int int23 = localDateTime18.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime18.minus(readablePeriod26);
        int int28 = localDateTime27.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField30 = localDateTime27.getField(0);
        org.joda.time.LocalDateTime.Property property31 = localDateTime27.centuryOfEra();
        org.joda.time.LocalDateTime.Property property32 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime27.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean38 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.weekyear();
        int int40 = property39.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        org.joda.time.LocalDateTime.Property property42 = localDateTime5.property(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(property42);
    }

    @Test
    public void test13669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13669");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        long long6 = dateTimeField4.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusHours((int) (byte) -1);
        int int12 = localDateTime8.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.minus(readableDuration17);
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.lang.String str21 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localDateTime18, locale19);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plus(readablePeriod22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.plus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withDayOfYear(5);
        int int30 = localDateTime29.getYear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withWeekyear(51);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5785200000L + "'", long6 == 5785200000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970" + "'", str21, "1970");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1978 + "'", int30 == 1978);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test13670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13670");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, 10);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField14 = islamicChronology13.weekyears();
        org.joda.time.DurationField durationField15 = islamicChronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology13.yearOfEra();
        org.joda.time.DurationField durationField17 = islamicChronology13.halfdays();
        long long20 = durationField17.getValueAsLong((long) 292278993, 11L);
        boolean boolean21 = localDateTime10.equals((java.lang.Object) 11L);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime10.plusWeeks((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 6L + "'", long20 == 6L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test13671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13671");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = islamicChronology17.weekyears();
        org.joda.time.DurationField durationField19 = islamicChronology17.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology17.yearOfEra();
        org.joda.time.DurationField durationField21 = islamicChronology17.halfdays();
        org.joda.time.DurationFieldType durationFieldType22 = durationField21.getType();
        boolean boolean23 = localDateTime11.isSupported(durationFieldType22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime11.minusWeeks(82800001);
        java.util.Locale.Builder builder27 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder29 = builder27.setVariant("");
        java.util.Locale locale30 = builder29.build();
        java.util.Locale locale32 = new java.util.Locale("");
        java.util.Locale.Builder builder33 = builder29.setLocale(locale32);
        java.util.Locale locale34 = builder29.build();
        java.util.Locale.Builder builder36 = builder29.setLanguage("UTC");
        java.util.Locale locale37 = builder36.build();
        java.util.Locale locale38 = builder36.build();
        java.lang.String str39 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localDateTime25, 38, locale38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime41 = localDateTime25.withHourOfDay(360000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 360000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IslamicChronology[+01:00]" + "'", str6, "IslamicChronology[+01:00]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(islamicChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "utc");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "utc");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "38" + "'", str39, "38");
    }

    @Test
    public void test13672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13672");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "FR");
        java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("KOR");
        java.util.Locale locale6 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder7 = builder5.setLocale(locale6);
        java.util.Locale.Builder builder8 = builder5.clearExtensions();
        java.util.Locale locale9 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.removeUnicodeLocaleAttribute("1970-01-01T02:19:00.001");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 1970-01-01T02:19:00.001 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
    }

    @Test
    public void test13673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13673");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.year();
        org.joda.time.DurationField durationField25 = islamicChronology2.millis();
        org.joda.time.DurationField durationField26 = islamicChronology2.years();
        long long30 = islamicChronology2.add((-24796740000L), 0L, 34811400);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-24796740000L) + "'", long30 == (-24796740000L));
    }

    @Test
    public void test13674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13674");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = java.util.Locale.PRC;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale3.getScript();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale3);
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale.Builder builder10 = builder8.setVariant("82800");
        java.util.Locale.Builder builder11 = builder10.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test13675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13675");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale1);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        int int10 = localDateTime9.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDateTime9.toDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        int int19 = localDateTime18.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = localDateTime18.toDateTime(dateTimeZone23);
        long long26 = dateTime25.getMillis();
        boolean boolean27 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime16.getZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology32 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone31);
        org.joda.time.DurationField durationField33 = islamicChronology32.weekyears();
        org.joda.time.DurationField durationField34 = islamicChronology32.halfdays();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology32.yearOfEra();
        org.joda.time.DurationField durationField36 = islamicChronology32.halfdays();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology32);
        org.joda.time.DateTimeField dateTimeField38 = islamicChronology32.yearOfEra();
        java.util.Locale locale39 = java.util.Locale.US;
        int int40 = dateTimeField38.getMaximumShortTextLength(locale39);
        java.lang.String str41 = locale39.getDisplayLanguage();
        java.lang.String str42 = dateTimeZone28.getName(9000L, locale39);
        java.lang.String str43 = dateTimeZone6.getName(20217598041L, locale39);
        java.lang.String str44 = locale39.getDisplayScript();
        java.util.Locale.setDefault(category0, locale39);
        java.util.Locale locale48 = new java.util.Locale("8970-01-01T00:25:00.001", "0");
        java.util.Locale locale49 = java.util.Locale.KOREA;
        java.lang.String str50 = locale49.toLanguageTag();
        java.lang.String str51 = locale48.getDisplayScript(locale49);
        java.util.Locale locale52 = locale49.stripExtensions();
        java.util.Locale.setDefault(category0, locale52);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(islamicChronology24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(islamicChronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\uc601\uc5b4" + "'", str41, "\uc601\uc5b4");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+01:00" + "'", str42, "+01:00");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-01:00" + "'", str43, "-01:00");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals(locale48.toString(), "8970-01-01t00:25:00.001_0");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ko-KR" + "'", str50, "ko-KR");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko_KR");
    }

    @Test
    public void test13676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13676");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withHourOfDay(5);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMinutes(1969);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusSeconds(1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9);
        org.joda.time.DurationField durationField11 = islamicChronology10.weekyears();
        org.joda.time.DurationField durationField12 = islamicChronology10.months();
        org.joda.time.DurationField durationField13 = islamicChronology10.centuries();
        org.joda.time.DateTimeZone dateTimeZone14 = islamicChronology10.getZone();
        long long18 = dateTimeZone14.convertLocalToUTC(839699746L, true, (long) 'x');
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(32011L);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 1);
        int int24 = localDateTime23.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = localDateTime26.getFields();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusDays(4);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        int int36 = localDateTime31.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime31.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime31.minus(readablePeriod39);
        int int41 = localDateTime40.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField43 = localDateTime40.getField(0);
        org.joda.time.LocalDateTime.Property property44 = localDateTime40.centuryOfEra();
        org.joda.time.LocalDateTime.Property property45 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime40.withTime((int) (byte) 1, 0, 5, (int) (byte) 100);
        boolean boolean51 = localDateTime26.isBefore((org.joda.time.ReadablePartial) localDateTime50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime50.weekyear();
        int int53 = property52.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property52.getFieldType();
        int int55 = localDateTime21.get(dateTimeFieldType54);
        org.joda.time.LocalDateTime.Property property56 = localDateTime19.property(dateTimeFieldType54);
        int int57 = localDateTime7.get(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 836099746L + "'", long18 == 836099746L);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldArray27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1970 + "'", int55 == 1970);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1970 + "'", int57 == 1970);
    }

    @Test
    public void test13677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13677");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDateTime10.toDateTime(dateTimeZone15);
        long long18 = dateTime17.getMillis();
        boolean boolean19 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21);
        org.joda.time.DurationField durationField23 = islamicChronology22.weekyears();
        org.joda.time.DurationField durationField24 = islamicChronology22.months();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology22.minuteOfHour();
        long long28 = dateTimeField25.getDifferenceAsLong((long) 4, (-7199999L));
        org.joda.time.DurationField durationField29 = dateTimeField25.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = dateTimeField25.getType();
        int int31 = dateTime8.get(dateTimeFieldType30);
        org.joda.time.Chronology chronology32 = dateTime8.getChronology();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(islamicChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 120L + "'", long28 == 120L);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test13678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13678");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.secondOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test13679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13679");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.yearOfCentury();
        org.joda.time.DurationField durationField15 = islamicChronology13.years();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        int int22 = localDateTime17.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.minus(readablePeriod25);
        int int27 = localDateTime26.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField29 = localDateTime26.getField(0);
        org.joda.time.LocalDateTime.Property property30 = localDateTime26.centuryOfEra();
        int[] intArray32 = islamicChronology13.get((org.joda.time.ReadablePartial) localDateTime26, (long) 0);
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology13.hourOfDay();
        org.joda.time.DurationField durationField34 = islamicChronology13.centuries();
        boolean boolean35 = property8.equals((java.lang.Object) durationField34);
        java.lang.String str36 = property8.getAsText();
        org.joda.time.LocalDateTime localDateTime38 = property8.addToCopy(11);
        org.joda.time.LocalDateTime localDateTime39 = property8.roundHalfEvenCopy();
        long long40 = property8.remainder();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 32000L + "'", long40 == 32000L);
    }

    @Test
    public void test13680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13680");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.monthOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology2.weekyears();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = islamicChronology2.add(readablePeriod9, (-3599900L), (-1));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = islamicChronology16.weekyears();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19);
        boolean boolean22 = dateTimeZone19.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology23 = islamicChronology16.withZone(dateTimeZone19);
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale25.getDisplayLanguage(locale26);
        java.lang.String str28 = locale26.getISO3Country();
        java.util.Set<java.lang.String> strSet29 = locale26.getUnicodeLocaleAttributes();
        java.lang.String str30 = dateTimeZone19.getName(24796800001L, locale26);
        int int32 = dateTimeZone19.getOffsetFromLocal(1134L);
        java.lang.String str34 = dateTimeZone19.getName(1716L);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(2623241168L, dateTimeZone19);
        org.joda.time.Chronology chronology36 = islamicChronology2.withZone(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone37 = chronology36.getZone();
        org.joda.time.DurationField durationField38 = chronology36.millis();
        java.lang.String str39 = chronology36.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3599900L) + "'", long12 == (-3599900L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(islamicChronology20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str27, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "KOR" + "'", str28, "KOR");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+01:00" + "'", str30, "+01:00");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3600000 + "'", int32 == 3600000);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+01:00" + "'", str34, "+01:00");
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "IslamicChronology[+01:00]" + "'", str39, "IslamicChronology[+01:00]");
    }

    @Test
    public void test13681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13681");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField9 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.dayOfWeek();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType11 = islamicChronology2.getLeapYearPatternType();
        org.joda.time.DurationField durationField12 = islamicChronology2.millis();
        long long15 = durationField12.getMillis(355L, (long) 6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(leapYearPatternType11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 355L + "'", long15 == 355L);
    }

    @Test
    public void test13682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13682");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("");
        boolean boolean4 = timeZone1.hasSameRules(timeZone3);
        timeZone3.setRawOffset(11);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = dateTimeZone7.getShortName((long) 'u', locale9);
        long long13 = dateTimeZone7.previousTransition((-3599999L));
        boolean boolean15 = dateTimeZone7.isStandardOffset((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        org.joda.time.DurationField durationField19 = islamicChronology18.weekyears();
        org.joda.time.DurationField durationField20 = islamicChronology18.months();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology18.halfdayOfDay();
        org.joda.time.DurationField durationField22 = islamicChronology18.millis();
        java.lang.String str23 = islamicChronology18.toString();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology18.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DurationField durationField29 = islamicChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology28.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone31 = islamicChronology28.getZone();
        java.lang.String str32 = dateTimeZone31.toString();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) (-1), dateTimeZone31);
        int[] intArray35 = islamicChronology18.get((org.joda.time.ReadablePartial) localDateTime33, (long) ' ');
        org.joda.time.DateTime dateTime36 = localDateTime33.toDateTime();
        boolean boolean37 = dateTimeZone7.equals((java.lang.Object) dateTime36);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertNotNull(timeZone3);
// flaky:         org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "it" + "'", str10, "it");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3599999L) + "'", long13 == (-3599999L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(islamicChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "IslamicChronology[+01:00]" + "'", str23, "IslamicChronology[+01:00]");
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(islamicChronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+01:00" + "'", str32, "+01:00");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1389, 10, 22, 3600032]");
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test13683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13683");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.DurationField durationField26 = islamicChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(12);
        org.joda.time.Chronology chronology32 = islamicChronology2.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone34 = islamicChronology2.getZone();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 1);
        int int37 = localDateTime36.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.minusHours((int) (byte) -1);
        int int41 = localDateTime36.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime36.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime36.minus(readablePeriod44);
        int int46 = localDateTime45.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField48 = localDateTime45.getField(0);
        org.joda.time.LocalDateTime.Property property49 = localDateTime45.centuryOfEra();
        int int50 = property49.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime52 = property49.setCopy(0);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withMillisOfSecond((int) 'a');
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime((long) 1);
        int int57 = localDateTime56.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.minusHours((int) (byte) -1);
        int int60 = localDateTime56.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime56.plusHours((int) (byte) 100);
        int int65 = localDateTime56.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime56.withWeekOfWeekyear(9);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.minusSeconds((int) '4');
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        org.joda.time.ReadableDuration readableDuration77 = null;
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.plus(readableDuration77);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.LocalDateTime localDateTime80 = localDateTime78.plus(readablePeriod79);
        org.joda.time.LocalDateTime localDateTime82 = new org.joda.time.LocalDateTime((long) 1);
        int int83 = localDateTime82.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime85 = localDateTime82.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology88 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone87);
        org.joda.time.DateTime dateTime89 = localDateTime82.toDateTime(dateTimeZone87);
        long long90 = dateTime89.getMillis();
        org.joda.time.DateTime dateTime91 = localDateTime78.toDateTime((org.joda.time.ReadableInstant) dateTime89);
        long long92 = dateTime89.getMillis();
        org.joda.time.DateTime dateTime93 = localDateTime69.toDateTime((org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.DateTime dateTime94 = localDateTime54.toDateTime((org.joda.time.ReadableInstant) dateTime89);
        int int95 = dateTimeZone34.getOffset((org.joda.time.ReadableInstant) dateTime94);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3600001 + "'", int65 == 3600001);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(localDateTime85);
        org.junit.Assert.assertNotNull(dateTimeZone87);
        org.junit.Assert.assertNotNull(islamicChronology88);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1L + "'", long90 == 1L);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
        org.junit.Assert.assertNotNull(dateTime93);
        org.junit.Assert.assertNotNull(dateTime94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 3600000 + "'", int95 == 3600000);
    }

    @Test
    public void test13684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13684");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.minuteOfDay();
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.lang.String str31 = locale30.getDisplayLanguage();
        java.util.Locale locale32 = java.util.Locale.ROOT;
        java.lang.String str33 = locale30.getDisplayScript(locale32);
        java.util.Locale locale34 = locale30.stripExtensions();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.lang.String str36 = locale30.getDisplayCountry(locale35);
        boolean boolean37 = locale35.hasExtensions();
        java.lang.String str38 = dateTimeField28.getAsShortText((long) 30, locale35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str31, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\uc774\ud0c8\ub9ac\uc544" + "'", str36, "\uc774\ud0c8\ub9ac\uc544");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "60" + "'", str38, "60");
    }

    @Test
    public void test13685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13685");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int3 = islamicChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = islamicChronology2.add(readablePeriod9, 3600000L, 30);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
    }

    @Test
    public void test13686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13686");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours((int) (byte) 100);
        java.util.Date date10 = localDateTime9.toDate();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromDateFields(date10);
        java.util.Date date12 = localDateTime11.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 43");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Jan 05 05:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Jan 05 05:00:00 GMT+00:00 1970");
    }

    @Test
    public void test13687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13687");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = islamicChronology2.getZone();
        org.joda.time.DurationField durationField26 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.year();
        org.joda.time.DurationField durationField28 = islamicChronology2.days();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField30 = islamicChronology2.weekyears();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
    }

    @Test
    public void test13688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13688");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusMinutes(14);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime16 = property14.roundFloorCopy();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test13689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13689");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        int int11 = localDateTime10.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = localDateTime10.getField(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.centuryOfEra();
        org.joda.time.DurationField durationField15 = property14.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = islamicChronology18.years();
        org.joda.time.DurationField durationField21 = islamicChronology18.halfdays();
        org.joda.time.DurationField durationField22 = islamicChronology18.hours();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology18.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 1);
        int int26 = localDateTime25.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusHours((int) (byte) -1);
        int int29 = localDateTime25.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.centuryOfEra();
        java.lang.Object obj33 = null;
        boolean boolean34 = localDateTime31.equals(obj33);
        int[] intArray36 = islamicChronology18.get((org.joda.time.ReadablePartial) localDateTime31, 365L);
        boolean boolean37 = property14.equals((java.lang.Object) islamicChronology18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(islamicChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1389, 10, 22, 3600365]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test13690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13690");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        int int10 = localDateTime9.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusHours((int) (byte) -1);
        int int13 = localDateTime9.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.centuryOfEra();
        java.lang.String str17 = localDateTime15.toString();
        int int18 = localDateTime15.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.era();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone21);
        org.joda.time.DurationField durationField23 = islamicChronology22.weekyears();
        org.joda.time.DurationField durationField24 = islamicChronology22.months();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology22.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 1);
        int int28 = localDateTime27.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.minusHours((int) (byte) -1);
        int int32 = localDateTime27.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime27.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime27.minus(readablePeriod35);
        int int37 = localDateTime36.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField39 = localDateTime36.getField(0);
        org.joda.time.LocalDateTime.Property property40 = localDateTime36.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 1);
        int int43 = localDateTime42.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withPeriodAdded(readablePeriod46, 10);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.withDayOfYear(11);
        int[] intArray51 = localDateTime50.getValues();
        islamicChronology22.validate((org.joda.time.ReadablePartial) localDateTime36, intArray51);
        int int53 = dateTimeField7.getMaximumValue((org.joda.time.ReadablePartial) localDateTime15, intArray51);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((long) 1);
        int int56 = localDateTime55.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology61 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone60);
        org.joda.time.DateTime dateTime62 = localDateTime55.toDateTime(dateTimeZone60);
        java.lang.String str63 = dateTimeZone60.getID();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((long) 1);
        int int66 = localDateTime65.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.minusHours((int) (byte) -1);
        int int70 = localDateTime65.getValue((int) (byte) 1);
        boolean boolean71 = dateTimeZone60.equals((java.lang.Object) localDateTime65);
        boolean boolean72 = localDateTime15.isEqual((org.joda.time.ReadablePartial) localDateTime65);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01T00:25:00.001" + "'", str17, "1970-01-01T00:25:00.001");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(islamicChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[100, 1, 11, 3600001]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 59 + "'", int53 == 59);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(islamicChronology61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+01:00" + "'", str63, "+01:00");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test13691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13691");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.DurationField durationField26 = islamicChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.secondOfMinute();
        org.joda.time.DurationField durationField31 = islamicChronology2.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long34 = durationField31.add(6656400000L, (-3599899L));
            org.junit.Assert.fail("Expected exception of type org.joda.time.chrono.LimitChronology.LimitException; message: The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (IslamicChronology[UTC])");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
    }

    @Test
    public void test13692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13692");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.months();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) islamicChronology0);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMonths((int) (short) 0);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfMonth();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test13693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13693");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) (byte) 100);
        int int11 = property8.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = property8.addToCopy((-3600000L));
        org.joda.time.DurationField durationField14 = property8.getDurationField();
        org.joda.time.LocalDateTime localDateTime15 = property8.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime16 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime18 = property8.addToCopy(1167);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 23 + "'", int11 == 23);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test13694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13694");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) 1);
        int int9 = localDateTime7.getValue(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusHours(10);
        int int12 = localDateTime11.getMinuteOfHour();
        int int13 = localDateTime11.getMillisOfSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test13695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13695");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField17 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology2.era();
        org.joda.time.Chronology chronology20 = islamicChronology2.withUTC();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test13696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13696");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology16.weekyear();
        org.joda.time.ReadablePartial readablePartial18 = null;
        int[] intArray25 = new int[] { (short) 100, 10, 100, (short) -1, (byte) 10 };
        int[] intArray27 = dateTimeField17.addWrapPartial(readablePartial18, 100, intArray25, (int) (short) 0);
        int int28 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) localDateTime12, intArray25);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 1);
        int int31 = localDateTime30.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.minusHours((int) (byte) -1);
        int int35 = localDateTime30.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime30.withMillisOfSecond((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime37);
        int int39 = localDateTime37.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.weekOfWeekyear();
        int int41 = localDateTime37.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 10, 100, -1, 10]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 11 + "'", int28 == 11);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 70 + "'", int39 == 70);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test13697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13697");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        int int11 = localDateTime10.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = localDateTime10.getField(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.centuryOfEra();
        int int15 = property14.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime17 = property14.setCopy(0);
        int int18 = localDateTime17.getMillisOfDay();
        int int19 = localDateTime17.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3600001 + "'", int18 == 3600001);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test13698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13698");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, (int) 'x');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays(82800001);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusHours(60);
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime10.withDate(86399, 3600045, 6918);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600045 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test13699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13699");
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int7 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime12 = property8.addToCopy(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withCenturyOfEra(69);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusYears(1);
        int int17 = localDateTime16.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone19);
        org.joda.time.DurationField durationField21 = islamicChronology20.weekyears();
        org.joda.time.DurationField durationField22 = islamicChronology20.halfdays();
        org.joda.time.DurationField durationField23 = islamicChronology20.weeks();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology20.yearOfEra();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray30 = localDateTime29.getFields();
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.lang.String str33 = locale31.getDisplayLanguage(locale32);
        java.lang.String str34 = dateTimeField24.getAsText((org.joda.time.ReadablePartial) localDateTime29, locale31);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime29.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime.Property property37 = localDateTime29.dayOfYear();
        java.lang.String str38 = property37.getAsString();
        int int39 = property37.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int47 = localDateTime46.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property48 = localDateTime46.hourOfDay();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 1);
        int int51 = localDateTime50.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology56 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone55);
        org.joda.time.DateTime dateTime57 = localDateTime50.toDateTime(dateTimeZone55);
        long long58 = dateTime57.getMillis();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) 1);
        int int61 = localDateTime60.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime60.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology66 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone65);
        org.joda.time.DateTime dateTime67 = localDateTime60.toDateTime(dateTimeZone65);
        long long68 = dateTime67.getMillis();
        long long69 = dateTime67.getMillis();
        boolean boolean70 = dateTime57.isAfter((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.Chronology chronology71 = dateTime67.getChronology();
        java.util.Locale.FilteringMode filteringMode72 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        boolean boolean73 = dateTime67.equals((java.lang.Object) filteringMode72);
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) 1);
        int int76 = localDateTime75.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime75.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology81 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone80);
        org.joda.time.DateTime dateTime82 = localDateTime75.toDateTime(dateTimeZone80);
        org.joda.time.LocalDateTime localDateTime84 = new org.joda.time.LocalDateTime((long) 1);
        int int85 = localDateTime84.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime87 = localDateTime84.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology90 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone89);
        org.joda.time.DateTime dateTime91 = localDateTime84.toDateTime(dateTimeZone89);
        long long92 = dateTime91.getMillis();
        boolean boolean93 = dateTime82.isAfter((org.joda.time.ReadableInstant) dateTime91);
        int int94 = dateTime67.compareTo((org.joda.time.ReadableInstant) dateTime82);
        int int95 = property48.getDifference((org.joda.time.ReadableInstant) dateTime82);
        int int96 = property37.compareTo((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.DateTime dateTime97 = localDateTime16.toDateTime((org.joda.time.ReadableInstant) dateTime82);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 69 + "'", int17 == 69);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(islamicChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldArray30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str33, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1970" + "'", str34, "1970");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "1" + "'", str38, "1");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 366 + "'", int39 == 366);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(islamicChronology56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(islamicChronology66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertTrue("'" + filteringMode72 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode72.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(dateTimeZone80);
        org.junit.Assert.assertNotNull(islamicChronology81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(localDateTime87);
        org.junit.Assert.assertNotNull(dateTimeZone89);
        org.junit.Assert.assertNotNull(islamicChronology90);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-16385303) + "'", int95 == (-16385303));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(dateTime97);
    }

    @Test
    public void test13700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13700");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withPeriodAdded(readablePeriod12, 10);
        int int15 = localDateTime14.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plusYears((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.minus(readableDuration18);
        int int20 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        int int21 = localDateTime1.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test13701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13701");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        int[] intArray28 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime26, 10L);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.era();
        org.joda.time.DurationField durationField31 = islamicChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology2.secondOfMinute();
        long long36 = islamicChronology2.add(802638719956810970L, 19360135023104L, 1970);
        org.joda.time.DurationField durationField37 = islamicChronology2.centuries();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1389, 10, 22, 3600010]");
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 840778185952325850L + "'", long36 == 840778185952325850L);
        org.junit.Assert.assertNotNull(durationField37);
    }

    @Test
    public void test13702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13702");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField9 = islamicChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology2.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test13703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13703");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfYear(11);
        int[] intArray10 = localDateTime9.getValues();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMonths((int) 'a');
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMinuteOfHour(23);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusMonths((-1));
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusDays(120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 1, 11, 3600001]");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test13704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13704");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test13705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13705");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = islamicChronology2.withZone(dateTimeZone9);
        java.lang.String str12 = dateTimeZone9.getShortName(100L);
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9);
        int int15 = dateTimeZone9.getOffsetFromLocal(1134L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test13706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13706");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology2.months();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = islamicChronology2.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology2.millisOfSecond();
        java.lang.String str13 = dateTimeField11.getAsShortText((-573L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "427" + "'", str13, "427");
    }

    @Test
    public void test13707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13707");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = islamicChronology2.days();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test13708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13708");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.millisOfSecond();
        long long8 = islamicChronology2.add((long) (byte) -1, (long) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours((int) (byte) -1);
        int int15 = localDateTime10.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime10.minus(readablePeriod18);
        int int20 = localDateTime19.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = localDateTime19.getField(0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime19.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.withMonthOfYear((int) (short) 10);
        boolean boolean26 = islamicChronology2.equals((java.lang.Object) localDateTime19);
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology2.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = islamicChronology2.add(readablePeriod28, 39623639L, 19);
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology35 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        org.joda.time.DurationField durationField36 = islamicChronology35.weekyears();
        org.joda.time.DateTimeField dateTimeField37 = islamicChronology35.yearOfEra();
        long long39 = dateTimeField37.roundCeiling(0L);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 1);
        int int42 = localDateTime41.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.minusHours((int) (byte) -1);
        int int45 = localDateTime41.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime41.plusHours((int) (byte) 100);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime41.minus(readableDuration50);
        java.util.Locale locale52 = java.util.Locale.PRC;
        java.util.Locale locale53 = locale52.stripExtensions();
        java.lang.String str54 = dateTimeField37.getAsShortText((org.joda.time.ReadablePartial) localDateTime51, locale52);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.plus(readablePeriod55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime51.plus(readablePeriod57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.yearOfEra();
        int int60 = dateTimeField32.getMaximumValue((org.joda.time.ReadablePartial) localDateTime58);
        int int61 = localDateTime58.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property62 = localDateTime58.hourOfDay();
        org.joda.time.Interval interval63 = property62.toInterval();
        java.util.Locale locale66 = new java.util.Locale("89", "+00:45");
        java.lang.String str67 = property62.getAsText(locale66);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 39623639L + "'", long31 == 39623639L);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(islamicChronology35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 5785200000L + "'", long39 == 5785200000L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1970" + "'", str54, "1970");
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertEquals(locale66.toString(), "89_+00:45");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1" + "'", str67, "1");
    }

    @Test
    public void test13709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13709");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        int int11 = localDateTime10.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfEra(31);
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.hourOfDay();
        java.lang.String str16 = localDateTime10.toString("19");
        org.joda.time.LocalDateTime.Property property17 = localDateTime10.monthOfYear();
        org.joda.time.LocalDateTime localDateTime18 = property17.withMaximumValue();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.yearOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 70 + "'", int11 == 70);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "19" + "'", str16, "19");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test13710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13710");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, 10);
        int int8 = localDateTime4.getMinuteOfHour();
        int int9 = localDateTime4.getSecondOfMinute();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("");
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("");
        boolean boolean14 = timeZone11.hasSameRules(timeZone13);
        int int15 = timeZone11.getRawOffset();
        java.time.ZoneId zoneId16 = timeZone11.toZoneId();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone(zoneId16);
        java.time.ZoneId zoneId18 = timeZone17.toZoneId();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime20 = localDateTime4.toDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 1);
        int int24 = localDateTime23.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = localDateTime23.toDateTime(dateTimeZone28);
        int int31 = dateTimeZone19.getOffset((org.joda.time.ReadableInstant) dateTime30);
        java.lang.String str32 = dateTime30.toString();
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime30.getZone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(zoneId16);
        org.junit.Assert.assertNotNull(timeZone17);
// flaky:         org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertNotNull(zoneId18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(islamicChronology29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970-01-01T00:00:00.001+01:00" + "'", str32, "1970-01-01T00:00:00.001+01:00");
        org.junit.Assert.assertNotNull(dateTimeZone33);
    }

    @Test
    public void test13711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13711");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.millisOfSecond();
        long long8 = islamicChronology2.add((long) (byte) -1, (long) 0, (int) (byte) 10);
        long long12 = islamicChronology2.add((-708L), (long) 3601970, (-16703));
        org.joda.time.DurationField durationField13 = islamicChronology2.minutes();
        org.joda.time.Chronology chronology14 = islamicChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.halfdayOfDay();
        long long17 = dateTimeField15.roundHalfCeiling((long) 289);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-60163705618L) + "'", long12 == (-60163705618L));
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test13712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13712");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMinuteOfHour((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.plusHours((int) (byte) 100);
        java.util.Date date10 = localDateTime9.toDate();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromDateFields(date10);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromDateFields(date10);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromDateFields(date10);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.fromDateFields(date10);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        int int17 = localDateTime16.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusHours((int) (byte) -1);
        int int21 = localDateTime16.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime16.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime16.minus(readablePeriod24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime16.millisOfSecond();
        int int27 = localDateTime16.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int35 = localDateTime34.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.hourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = property36.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfMonth();
        java.lang.String str40 = property39.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        org.joda.time.LocalDateTime.Property property42 = localDateTime16.property(dateTimeFieldType41);
        int int43 = localDateTime14.get(dateTimeFieldType41);
        int int44 = localDateTime14.getDayOfWeek();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime14.plus(readableDuration45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime14.withYear((-70113));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Jan 05 04:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "14" + "'", str40, "14");
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
    }

    @Test
    public void test13713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13713");
        java.lang.String[] strArray1 = new java.lang.String[] { "1970" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.Object[] objArray4 = strSet2.toArray();
        java.util.stream.Stream<java.lang.String> strStream5 = strSet2.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream6 = strSet2.stream();
        java.util.stream.Stream<java.lang.String> strStream7 = strSet2.parallelStream();
        org.joda.time.tz.Provider provider8 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider8);
        org.joda.time.DateTimeZone dateTimeZone11 = provider8.getZone("1970");
        java.util.Set<java.lang.String> strSet12 = provider8.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone14 = provider8.getZone("\ud55c\uad6d\uc5b4");
        java.util.Set<java.lang.String> strSet15 = provider8.getAvailableIDs();
        boolean boolean16 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet15);
        java.lang.Object[] objArray17 = strSet15.toArray();
        boolean boolean19 = strSet15.add("\u65e5\u672c");
        java.util.stream.Stream<java.lang.String> strStream20 = strSet15.parallelStream();
        java.util.Locale locale24 = new java.util.Locale("\u65e5\u6587\u65e5\u672c)", "0100-10-14T04:00:32.000", "2022-02-21T15:46:59.848");
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleKeys();
        boolean boolean26 = strSet15.addAll((java.util.Collection<java.lang.String>) strSet25);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[1970]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[1970]");
        org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertNotNull(provider8);
        org.junit.Assert.assertNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strStream20);
        org.junit.Assert.assertEquals(locale24.toString(), "\u65e5\u6587\u65e5\u672c)_0100-10-14T04:00:32.000_2022-02-21T15:46:59.848");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test13714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13714");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readablePeriod9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.millisOfSecond();
        long long12 = property11.remainder();
        java.lang.String str13 = property11.getName();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = property11.getAsText(locale14);
        org.joda.time.LocalDateTime localDateTime16 = property11.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusYears(4);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plus(readablePeriod19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withPeriodAdded(readablePeriod21, 45);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withCenturyOfEra(101);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withSecondOfMinute((-683357));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -683357 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "millisOfSecond" + "'", str13, "millisOfSecond");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test13715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13715");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone3);
        org.joda.time.DurationField durationField5 = islamicChronology4.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology4.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology4.minuteOfHour();
        org.joda.time.DurationField durationField8 = islamicChronology4.hours();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology4.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology4.getZone();
        org.joda.time.Chronology chronology11 = islamicChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(islamicChronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test13716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13716");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology2.weekyears();
        org.joda.time.DurationField durationField8 = islamicChronology2.minutes();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test13717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13717");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DurationField durationField6 = islamicChronology2.halfdays();
        org.joda.time.DurationField durationField7 = islamicChronology2.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test13718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13718");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("1970-01-01T01:00:00.019");
        int int2 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13719");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology9 = islamicChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology2.add(readablePeriod10, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology2.yearOfEra();
        long long18 = dateTimeField16.remainder(84927600000011L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 20077200011L + "'", long18 == 20077200011L);
    }

    @Test
    public void test13720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13720");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = islamicChronology9.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology9.months();
        org.joda.time.DurationField durationField12 = islamicChronology9.centuries();
        org.joda.time.DateTimeZone dateTimeZone13 = islamicChronology9.getZone();
        org.joda.time.Chronology chronology14 = islamicChronology2.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone17 = islamicChronology2.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test13721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13721");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.halfdayOfDay();
        java.lang.String str6 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology2.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IslamicChronology[+01:00]" + "'", str6, "IslamicChronology[+01:00]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test13722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13722");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfYear(11);
        int[] intArray10 = localDateTime9.getValues();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        org.joda.time.LocalDateTime localDateTime15 = property13.setCopy(4);
        org.joda.time.LocalDateTime localDateTime17 = property13.addToCopy(100);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withCenturyOfEra(14);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withMillisOfDay(0);
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 1, 11, 1]");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test13723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13723");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int6 = localDateTime1.getValue((int) (byte) 1);
        java.util.Locale locale8 = new java.util.Locale("");
        boolean boolean9 = localDateTime1.equals((java.lang.Object) "");
        int int10 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime1.minusHours(1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        java.lang.Object obj14 = null;
        boolean boolean15 = localDateTime12.equals(obj14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.plusSeconds(729);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.plusMinutes(15);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime12.minusDays((-69));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test13724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13724");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.weekyear();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        int int10 = localDateTime9.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusHours((int) (byte) -1);
        int int13 = localDateTime9.getSecondOfMinute();
        int int14 = localDateTime9.getCenturyOfEra();
        long long16 = islamicChronology2.set((org.joda.time.ReadablePartial) localDateTime9, 70L);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = islamicChronology2.halfdays();
        java.lang.String str20 = islamicChronology2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 17763836400001L + "'", long16 == 17763836400001L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IslamicChronology[+01:00]" + "'", str20, "IslamicChronology[+01:00]");
    }

    @Test
    public void test13725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13725");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.weekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test13726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13726");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        boolean boolean5 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet4);
        boolean boolean6 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet2);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale locale10 = java.util.Locale.JAPAN;
        java.lang.String str11 = locale10.getVariant();
        java.util.Locale locale12 = java.util.Locale.JAPAN;
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.lang.String str14 = locale13.getCountry();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.util.Locale[] localeArray18 = new java.util.Locale[] { locale10, locale12, locale13, locale15, locale16 };
        java.util.ArrayList<java.util.Locale> localeList19 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList19, localeArray18);
        java.util.Locale.FilteringMode filteringMode21 = null;
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList19, filteringMode21);
        boolean boolean23 = strSet2.remove((java.lang.Object) localeList19);
        boolean boolean24 = strSet2.isEmpty();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 1);
        int int27 = localDateTime26.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusHours((int) (byte) -1);
        int int31 = localDateTime26.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime26.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime26.minus(readablePeriod34);
        int int36 = localDateTime35.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = localDateTime35.getField(0);
        boolean boolean39 = strSet2.remove((java.lang.Object) 0);
        java.util.Locale locale40 = java.util.Locale.KOREA;
        java.util.Locale locale41 = java.util.Locale.KOREA;
        java.lang.String str42 = locale40.getDisplayLanguage(locale41);
        java.lang.String str43 = locale41.getISO3Country();
        java.util.Set<java.lang.String> strSet44 = locale41.getUnicodeLocaleAttributes();
        boolean boolean45 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet44);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology48 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone47);
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology48.yearOfCentury();
        org.joda.time.DurationField durationField50 = islamicChronology48.years();
        org.joda.time.DurationField durationField51 = islamicChronology48.halfdays();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology48.hourOfHalfday();
        org.joda.time.DurationField durationField53 = islamicChronology48.hours();
        boolean boolean54 = strSet44.remove((java.lang.Object) islamicChronology48);
        org.joda.time.DurationField durationField55 = islamicChronology48.centuries();
        org.joda.time.DateTimeField dateTimeField56 = islamicChronology48.monthOfYear();
        long long60 = islamicChronology48.add(0L, (-3599901L), 51);
        org.joda.time.DurationField durationField61 = islamicChronology48.years();
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FR" + "'", str14, "FR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(localeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\ud55c\uad6d\uc5b4" + "'", str42, "\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "KOR" + "'", str43, "KOR");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(islamicChronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-183594951L) + "'", long60 == (-183594951L));
        org.junit.Assert.assertNotNull(durationField61);
    }

    @Test
    public void test13727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13727");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
        int int4 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.weekyear();
        org.joda.time.DurationField durationField6 = islamicChronology3.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 59, (org.joda.time.Chronology) islamicChronology3);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) islamicChronology3);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.minuteOfDay();
        java.lang.String str13 = dateTimeField12.toString();
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("ko");
        java.lang.String str16 = locale15.getDisplayScript();
        java.lang.String str17 = locale15.getDisplayCountry();
        int int18 = dateTimeField12.getMaximumShortTextLength(locale15);
        int int20 = dateTimeField12.getLeapAmount((long) 729);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DateTimeField[minuteOfDay]" + "'", str13, "DateTimeField[minuteOfDay]");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test13728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13728");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale locale3 = java.util.Locale.PRC;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale3.getScript();
        java.util.Locale.Builder builder6 = builder0.setLocale(locale3);
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clear();
        java.util.Locale.Builder builder9 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("zho");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zho [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test13729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13729");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = localDateTime1.isSupported(dateTimeFieldType9);
        java.lang.String str11 = localDateTime1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withDayOfYear(7200098);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7200098 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T00:00:00.001" + "'", str11, "1970-01-01T00:00:00.001");
    }

    @Test
    public void test13730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13730");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology2.dayOfMonth();
        org.joda.time.DurationField durationField8 = islamicChronology2.minutes();
        org.joda.time.DurationField durationField9 = islamicChronology2.days();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test13731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13731");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.DurationField durationField5 = islamicChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology2.weeks();
        long long11 = islamicChronology2.add(100L, 1970L, 10);
        org.joda.time.DurationField durationField12 = islamicChronology2.millis();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology2.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = islamicChronology2.getDateTimeMillis((-913574), 354, 10, 86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -913574 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 19800L + "'", long11 == 19800L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test13732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13732");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "fra");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale.Builder builder7 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguageTag("12");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 12 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test13733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13733");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology29 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        int int32 = localDateTime31.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray35 = localDateTime34.getFields();
        boolean boolean36 = dateTimeZone28.isLocalDateTimeGap(localDateTime34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        java.util.TimeZone timeZone38 = dateTimeZone28.toTimeZone();
        org.joda.time.Chronology chronology39 = islamicChronology2.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField45 = islamicChronology2.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(islamicChronology29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT+01:00");
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
    }

    @Test
    public void test13734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13734");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        long long5 = dateTimeZone1.convertLocalToUTC(10L, true);
        java.lang.String str7 = dateTimeZone1.getShortName(3600001L);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1);
        int int10 = localDateTime9.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDateTime9.toDateTime(dateTimeZone14);
        long long17 = dateTime16.getMillis();
        int int18 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime16);
        long long20 = dateTimeZone1.previousTransition(19L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3599990L) + "'", long5 == (-3599990L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3600000 + "'", int18 == 3600000);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 19L + "'", long20 == 19L);
    }

    @Test
    public void test13735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13735");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        boolean boolean4 = dateTimeZone1.isStandardOffset((long) 60);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int10 = localDateTime6.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withFields((org.joda.time.ReadablePartial) localDateTime16);
        boolean boolean18 = dateTimeZone1.isLocalDateTimeGap(localDateTime17);
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime();
        int int20 = localDateTime17.size();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\uc138\uacc4\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test13736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13736");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(19);
        org.joda.time.DateTimeField dateTimeField8 = localDateTime4.getField((int) (byte) 0);
        int int9 = localDateTime4.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime4.get(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test13737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13737");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.millisOfSecond();
        long long8 = islamicChronology2.add((long) (byte) -1, (long) 0, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours((int) (byte) -1);
        int int15 = localDateTime10.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime10.minus(readablePeriod18);
        int int20 = localDateTime19.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = localDateTime19.getField(0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime19.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.withMonthOfYear((int) (short) 10);
        boolean boolean26 = islamicChronology2.equals((java.lang.Object) localDateTime19);
        org.joda.time.DurationField durationField27 = islamicChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology2.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) islamicChronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.IslamicChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test13738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13738");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone24 = islamicChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        int[] intArray28 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime26, 10L);
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology2.era();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField34 = islamicChronology2.weekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1389, 10, 22, 3600010]");
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test13739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13739");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology2.years();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        int int7 = localDateTime6.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minusHours((int) (byte) -1);
        int int11 = localDateTime6.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minus(readablePeriod14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime15.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.centuryOfEra();
        int[] intArray21 = islamicChronology2.get((org.joda.time.ReadablePartial) localDateTime15, (long) 0);
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology2.millisOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone25 = islamicChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = islamicChronology2.getZone();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        java.lang.String str34 = localDateTime33.toString();
        int int36 = localDateTime33.getValue(0);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.withCenturyOfEra((int) '4');
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 1);
        int int41 = localDateTime40.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withYear((int) (byte) 100);
        int int44 = localDateTime40.size();
        org.joda.time.DateTimeField[] dateTimeFieldArray45 = localDateTime40.getFields();
        int[] intArray46 = localDateTime40.getValues();
        islamicChronology2.validate((org.joda.time.ReadablePartial) localDateTime33, intArray46);
        org.joda.time.DateTimeField dateTimeField48 = islamicChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology2.millisOfSecond();
        org.joda.time.DurationField durationField50 = islamicChronology2.months();
        java.lang.String str51 = islamicChronology2.toString();
        org.joda.time.DateTimeField dateTimeField52 = islamicChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.Chronology chronology54 = islamicChronology2.withZone(dateTimeZone53);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(0L);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.withHourOfDay(5);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.plusMinutes((int) (short) 1);
        long long62 = islamicChronology2.set((org.joda.time.ReadablePartial) localDateTime56, (-39489638399999L));
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) 1);
        int int65 = localDateTime64.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.minusHours((int) (byte) -1);
        int int69 = localDateTime64.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime64.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.LocalDateTime localDateTime73 = localDateTime64.minus(readablePeriod72);
        org.joda.time.LocalDateTime.Property property74 = localDateTime64.millisOfSecond();
        int int75 = property74.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property74.getFieldType();
        org.joda.time.LocalDateTime.Property property77 = localDateTime56.property(dateTimeFieldType76);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1389, 10, 22, 3600000]");
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0100-10-10T00:00:32.000" + "'", str34, "0100-10-10T00:00:32.000");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray45);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1970, 1, 1, 3600001]");
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "IslamicChronology[+01:00]" + "'", str51, "IslamicChronology[+01:00]");
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 17763840000000L + "'", long62 == 17763840000000L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType76);
        org.junit.Assert.assertNotNull(property77);
    }

    @Test
    public void test13740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13740");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfYear(11);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYear(10);
        org.joda.time.DateTime dateTime12 = localDateTime9.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.minus(readablePeriod13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYear((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withPeriodAdded(readablePeriod21, 10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withDayOfYear(11);
        int[] intArray26 = localDateTime25.getValues();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
        org.joda.time.LocalDateTime localDateTime31 = property29.setCopy(4);
        org.joda.time.LocalDateTime localDateTime33 = property29.addToCopy(100);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfYear();
        int int35 = property34.getLeapAmount();
        boolean boolean36 = property15.equals((java.lang.Object) int35);
        java.lang.String str37 = property15.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 1, 11, 3600001]");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Property[minuteOfHour]" + "'", str37, "Property[minuteOfHour]");
    }

    @Test
    public void test13741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13741");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(2551440384L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusHours(26);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int14 = localDateTime13.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy((int) (byte) 100);
        int int18 = property15.getMinimumValue();
        java.util.Locale.Builder builder19 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder19.setVariant("");
        java.util.Locale locale22 = builder21.build();
        java.util.Locale locale24 = new java.util.Locale("");
        java.util.Locale.Builder builder25 = builder21.setLocale(locale24);
        java.util.Locale locale26 = java.util.Locale.TAIWAN;
        boolean boolean27 = locale26.hasExtensions();
        java.util.Locale locale28 = locale26.stripExtensions();
        java.lang.String str29 = locale26.getDisplayCountry();
        java.util.Locale locale30 = java.util.Locale.TAIWAN;
        boolean boolean31 = locale30.hasExtensions();
        java.lang.String str32 = locale26.getDisplayCountry(locale30);
        java.util.Locale.Builder builder33 = builder21.setLocale(locale30);
        java.lang.String str34 = property15.getAsText(locale30);
        int int35 = property6.getMaximumShortTextLength(locale30);
        int int36 = property6.get();
        org.joda.time.LocalDateTime localDateTime37 = property6.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\ub300\ub9cc" + "'", str29, "\ub300\ub9cc");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u53f0\u7063" + "'", str32, "\u53f0\u7063");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 27 + "'", int36 == 27);
        org.junit.Assert.assertNotNull(localDateTime37);
    }

    @Test
    public void test13742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13742");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str4 = locale1.getUnicodeLocaleType("FR");
        java.lang.String str7 = nameProvider0.getName(locale1, "\uc601\uc5b4", "GMT+00:00");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(100, (int) (short) 10, (int) (short) 10, (int) (byte) 0, 0, (int) ' ');
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.hourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = property17.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime20 = property17.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = islamicChronology23.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology23.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology23.year();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology23.dayOfYear();
        java.lang.String str28 = dateTimeField27.toString();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 1);
        int int31 = localDateTime30.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.minusHours((int) (byte) -1);
        int int35 = localDateTime30.getValue((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime30.withMillisOfSecond((int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime30.minus(readablePeriod38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime30.millisOfSecond();
        long long41 = property40.remainder();
        java.lang.String str42 = property40.getName();
        int int43 = property40.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime45 = property40.addWrapFieldToCopy(70);
        java.lang.String str46 = property40.getAsShortText();
        org.joda.time.LocalDateTime localDateTime47 = property40.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusMillis((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology52 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone51);
        org.joda.time.DurationField durationField53 = islamicChronology52.weekyears();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology56 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone55);
        boolean boolean58 = dateTimeZone55.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology59 = islamicChronology52.withZone(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField60 = chronology59.monthOfYear();
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) 1);
        int int63 = localDateTime62.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.minusHours((int) (byte) -1);
        int int66 = localDateTime62.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime62.minusMinutes((int) '#');
        org.joda.time.LocalDateTime localDateTime70 = localDateTime62.plusMonths((-1));
        java.util.Locale locale73 = new java.util.Locale("100");
        java.lang.String str74 = locale73.getDisplayLanguage();
        java.lang.String str75 = dateTimeField60.getAsShortText((org.joda.time.ReadablePartial) localDateTime62, 86399, locale73);
        java.lang.String str76 = dateTimeField27.getAsShortText((org.joda.time.ReadablePartial) localDateTime47, locale73);
        java.util.Set<java.lang.String> strSet77 = locale73.getUnicodeLocaleAttributes();
        java.lang.String str78 = property17.getAsShortText(locale73);
        java.lang.String str81 = nameProvider0.getShortName(locale73, "1390", "\u897f\u5143");
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DateTimeField[dayOfYear]" + "'", str28, "DateTimeField[dayOfYear]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "millisOfSecond" + "'", str42, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1" + "'", str46, "1");
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(islamicChronology52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(islamicChronology56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertEquals(locale73.toString(), "100");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "100" + "'", str74, "100");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "86399" + "'", str75, "86399");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "1" + "'", str76, "1");
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "0" + "'", str78, "0");
        org.junit.Assert.assertNull(str81);
    }

    @Test
    public void test13743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13743");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        long long8 = islamicChronology0.getDateTimeMillis((int) 'x', (int) (short) 1, 29, (int) 'x');
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = islamicChronology0.get(readablePeriod10, (-9184513017600000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-38875683599880L) + "'", long8 == (-38875683599880L));
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test13744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13744");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusDays(4);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        int int10 = localDateTime9.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 1);
        int int13 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusHours((int) (byte) -1);
        int int16 = localDateTime12.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.minusMinutes((int) '#');
        org.joda.time.LocalDateTime localDateTime20 = localDateTime12.plusMonths((-1));
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone27);
        org.joda.time.DurationField durationField29 = islamicChronology28.weekyears();
        org.joda.time.DurationField durationField30 = islamicChronology28.halfdays();
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology28.yearOfEra();
        org.joda.time.DurationField durationField32 = islamicChronology28.halfdays();
        org.joda.time.DurationFieldType durationFieldType33 = durationField32.getType();
        boolean boolean34 = localDateTime22.isSupported(durationFieldType33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime12.withFieldAdded(durationFieldType33, 12);
        boolean boolean37 = localDateTime9.isSupported(durationFieldType33);
        org.joda.time.LocalDateTime.Property property38 = localDateTime9.hourOfDay();
        java.lang.String str39 = property38.getAsShortText();
        org.joda.time.DurationField durationField40 = property38.getRangeDurationField();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 69 + "'", int10 == 69);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(islamicChronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2" + "'", str39, "2");
        org.junit.Assert.assertNotNull(durationField40);
    }

    @Test
    public void test13745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13745");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology2 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = islamicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = islamicChronology2.millis();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(islamicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test13746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13746");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        int int2 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusHours((int) (byte) -1);
        int int5 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusMinutes((int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime10 = property8.roundHalfFloorCopy();
        int int11 = property8.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        boolean boolean15 = dateTimeZone13.isFixed();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = localDateTime17.toDateTime(dateTimeZone22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        boolean boolean26 = dateTime24.isAfter(readableInstant25);
        org.joda.time.Instant instant27 = dateTime24.toInstant();
        java.lang.String str28 = dateTime24.toString();
        int int29 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime24);
        long long30 = dateTime24.getMillis();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone32);
        java.lang.String str34 = dateTimeZone32.toString();
        long long36 = dateTimeZone32.nextTransition((long) 1);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType37 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone32, leapYearPatternType37);
        org.joda.time.DurationField durationField39 = islamicChronology38.months();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology38.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology38.dayOfWeek();
        boolean boolean42 = dateTime24.equals((java.lang.Object) islamicChronology38);
        int int43 = property8.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01T01:00:00.001+01:00" + "'", str28, "1970-01-01T01:00:00.001+01:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3600000 + "'", int29 == 3600000);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(islamicChronology33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+01:00" + "'", str34, "+01:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertNotNull(leapYearPatternType37);
        org.junit.Assert.assertNotNull(islamicChronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }
}
