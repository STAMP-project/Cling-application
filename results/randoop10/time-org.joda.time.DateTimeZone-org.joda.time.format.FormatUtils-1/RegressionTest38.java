import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest38 {

    public static boolean debug = false;

    @Test
    public void test19001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19001");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1, chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.ROOT;
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale5.getDisplayScript(locale6);
        java.util.Locale locale8 = java.util.Locale.JAPAN;
        java.lang.String str9 = locale6.getDisplayScript(locale8);
        java.lang.String str10 = locale8.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayScript(locale8);
        int int12 = property3.getMaximumShortTextLength(locale8);
        org.joda.time.LocalDateTime localDateTime13 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMonths(42);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withYearOfCentury(3);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withEra((int) (short) 1);
        int int24 = localDateTime23.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = localDateTime23.getFieldType(1);
        org.joda.time.LocalDateTime.Property property27 = localDateTime15.property(dateTimeFieldType26);
        org.joda.time.Chronology chronology28 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime15.withCenturyOfEra(3652);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withSecondOfMinute(1);
        java.util.Date date35 = localDateTime31.toDate();
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.hourOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withSecondOfMinute(1);
        boolean boolean40 = localDateTime31.equals((java.lang.Object) localDateTime39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime31.era();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfMonth();
        java.lang.String str44 = property43.getAsShortText();
        boolean boolean45 = property43.isLeap();
        org.joda.time.LocalDateTime localDateTime46 = property43.roundFloorCopy();
        int[] intArray47 = localDateTime46.getValues();
        int int48 = localDateTime46.getHourOfDay();
        org.joda.time.LocalDateTime.Property property49 = localDateTime46.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundHalfEvenCopy();
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withPeriodAdded(readablePeriod51, 35581261);
        boolean boolean54 = localDateTime30.isAfter((org.joda.time.ReadablePartial) localDateTime53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = null;
        java.lang.String str56 = localDateTime30.toString(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ja-JP" + "'", str10, "ja-JP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1" + "'", str44, "1");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "365266-07-01T00:00:00.000" + "'", str56, "365266-07-01T00:00:00.000");
    }

    @Test
    public void test19002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19002");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str3 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.035" + "'", str3, "+00:00:00.035");
    }

    @Test
    public void test19003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19003");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.DurationFieldType durationFieldType3 = null;
        boolean boolean4 = localDateTime0.isSupported(durationFieldType3);
        java.util.Date date5 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromDateFields(date5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromDateFields(date5);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromDateFields(date5);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.fromDateFields(date5);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMonths(151);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.yearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 285 + "'", int2 == 285);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test19004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19004");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withPeriodAdded(readablePeriod6, (int) '#');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusHours(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withWeekyear(35341420);
        org.joda.time.LocalDateTime.Property property13 = localDateTime8.monthOfYear();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.minusYears(256);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.withPeriodAdded(readablePeriod16, 47);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusDays(38656016);
        int int21 = localDateTime20.getHourOfDay();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.yearOfEra();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test19005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19005");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime3.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withSecondOfMinute(1);
        java.util.Date date11 = localDateTime7.toDate();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withSecondOfMinute(1);
        boolean boolean16 = localDateTime7.equals((java.lang.Object) localDateTime15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime7.era();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfEvenCopy();
        java.lang.String str19 = property17.getName();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.util.Locale locale21 = locale20.stripExtensions();
        int int22 = property17.getMaximumShortTextLength(locale20);
        java.lang.String str23 = property17.getAsText();
        org.joda.time.LocalDateTime localDateTime24 = property17.withMinimumValue();
        int int25 = localDateTime24.getDayOfYear();
        int int26 = property6.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundCeilingCopy();
        int int29 = property27.getMaximumValue();
        java.lang.String str30 = property27.getAsString();
        org.joda.time.LocalDateTime localDateTime31 = property27.withMinimumValue();
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "era" + "'", str19, "era");
        org.junit.Assert.assertNotNull(locale20);
// flaky:         org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
// flaky:         org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AD" + "'", str23, "AD");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 42 + "'", int25 == 42);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "6" + "'", str30, "6");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test19006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19006");
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withSecondOfMinute(1);
        java.util.Date date7 = localDateTime3.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        boolean boolean12 = localDateTime3.equals((java.lang.Object) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime3.era();
        org.joda.time.LocalDateTime.Property property14 = localDateTime3.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone15.getOffset(readableInstant16);
        long long20 = dateTimeZone15.adjustOffset((long) 0, false);
        java.lang.String str21 = dateTimeZone15.toString();
        long long23 = dateTimeZone15.previousTransition(10L);
        java.util.Locale locale25 = java.util.Locale.ROOT;
        java.util.Locale locale26 = java.util.Locale.US;
        java.lang.String str27 = locale25.getDisplayScript(locale26);
        java.util.Locale locale28 = java.util.Locale.JAPAN;
        java.lang.String str29 = locale26.getDisplayScript(locale28);
        java.lang.String str30 = dateTimeZone15.getName((long) 2022, locale26);
        boolean boolean32 = dateTimeZone15.isStandardOffset((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.hourOfDay();
        org.joda.time.ReadableInstant readableInstant36 = null;
        long long37 = property35.getDifferenceAsLong(readableInstant36);
        java.util.Locale locale38 = java.util.Locale.US;
        java.lang.String str39 = locale38.getDisplayName();
        int int40 = property35.getMaximumTextLength(locale38);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.hourOfDay();
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime41.toDateTime(readableInstant43);
        int int45 = property35.compareTo((org.joda.time.ReadableInstant) dateTime44);
        int int46 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime47 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Chronology chronology48 = dateTime47.getChronology();
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(63780284989075L, chronology48);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 64540560, chronology48);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(63780169770482L, chronology48);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(chronology48);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "English (United States)" + "'", str39, "English (United States)");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(localDateTime53);
    }

    @Test
    public void test19007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19007");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        long long5 = dateTimeZone0.adjustOffset((long) 0, false);
        java.lang.String str6 = dateTimeZone0.toString();
        long long8 = dateTimeZone0.previousTransition(10L);
        java.util.Locale locale10 = java.util.Locale.ROOT;
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale10.getDisplayScript(locale11);
        java.util.Locale locale13 = java.util.Locale.JAPAN;
        java.lang.String str14 = locale11.getDisplayScript(locale13);
        java.lang.String str15 = dateTimeZone0.getName((long) 2022, locale11);
        java.util.Set<java.lang.String> strSet16 = locale11.getUnicodeLocaleAttributes();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.hourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withSecondOfMinute(1);
        java.util.Date date21 = localDateTime17.toDate();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.hourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withSecondOfMinute(1);
        boolean boolean26 = localDateTime17.equals((java.lang.Object) localDateTime25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime17.era();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime17.withMillisOfSecond((int) 'x');
        boolean boolean30 = strSet16.contains((java.lang.Object) localDateTime17);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime17.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property33 = localDateTime17.monthOfYear();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime17.plusMinutes(3120000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime37 = localDateTime17.withDayOfWeek(35521713);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35521713 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime35);
    }

    @Test
    public void test19008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19008");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 882, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.year();
        java.lang.String str5 = property4.getName();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundCeilingCopy();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "year" + "'", str5, "year");
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test19009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19009");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Locale locale4 = java.util.Locale.US;
        boolean boolean5 = localDateTime3.equals((java.lang.Object) locale4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        org.joda.time.ReadableInstant readableInstant8 = null;
        long long9 = property7.getDifferenceAsLong(readableInstant8);
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = locale10.getDisplayName();
        int int12 = property7.getMaximumTextLength(locale10);
        java.lang.String str13 = locale4.getDisplayVariant(locale10);
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.util.Locale locale15 = java.util.Locale.US;
        java.lang.String str16 = locale14.getDisplayScript(locale15);
        java.lang.String str17 = locale4.getDisplayName(locale15);
        java.lang.String str18 = locale15.toLanguageTag();
        java.lang.String str19 = locale15.getDisplayCountry();
        java.lang.String str21 = locale15.getExtension('u');
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English (United States)" + "'", str11, "English (United States)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "English (United States)" + "'", str17, "English (United States)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en-US" + "'", str18, "en-US");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "United States" + "'", str19, "United States");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test19010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19010");
        java.io.IOException iOException2 = new java.io.IOException("n. Chr.");
        java.lang.Throwable throwable4 = null;
        java.io.IOException iOException5 = new java.io.IOException(throwable4);
        java.lang.Throwable[] throwableArray6 = iOException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = iOException5.getSuppressed();
        java.io.IOException iOException8 = new java.io.IOException("2022-02-11T09:49:26.741Z", (java.lang.Throwable) iOException5);
        iOException2.addSuppressed((java.lang.Throwable) iOException8);
        java.io.IOException iOException11 = new java.io.IOException("2022-02-11T09:49:30.762Z");
        java.io.IOException iOException12 = new java.io.IOException();
        java.lang.Throwable[] throwableArray13 = iOException12.getSuppressed();
        iOException11.addSuppressed((java.lang.Throwable) iOException12);
        java.lang.Throwable[] throwableArray15 = iOException12.getSuppressed();
        java.io.IOException iOException16 = new java.io.IOException((java.lang.Throwable) iOException12);
        java.lang.Throwable[] throwableArray17 = iOException12.getSuppressed();
        iOException2.addSuppressed((java.lang.Throwable) iOException12);
        java.io.IOException iOException20 = new java.io.IOException("2022-02-11T09:49:30.762Z");
        java.io.IOException iOException21 = new java.io.IOException((java.lang.Throwable) iOException20);
        java.io.IOException iOException24 = new java.io.IOException("2022-02-11T09:49:30.762Z");
        java.io.IOException iOException25 = new java.io.IOException("2022-02-12T17:49:46.862+32:00", (java.lang.Throwable) iOException24);
        java.io.IOException iOException26 = new java.io.IOException((java.lang.Throwable) iOException25);
        iOException20.addSuppressed((java.lang.Throwable) iOException26);
        java.io.IOException iOException28 = new java.io.IOException((java.lang.Throwable) iOException20);
        iOException12.addSuppressed((java.lang.Throwable) iOException28);
        java.io.IOException iOException30 = new java.io.IOException("2022-02-11T09:53:23.451+32:00", (java.lang.Throwable) iOException28);
        java.io.IOException iOException31 = new java.io.IOException((java.lang.Throwable) iOException28);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test19011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19011");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone6.nextTransition(0L);
        long long12 = dateTimeZone6.convertLocalToUTC((long) (short) 0, true, (-115199900L));
        long long15 = dateTimeZone6.convertLocalToUTC((long) 9, true);
        long long17 = dateTimeZone6.convertUTCToLocal((-3600001L));
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 74);
        long long22 = dateTimeZone6.convertLocalToUTC(1644572978951L, true);
        long long24 = dateTimeZone6.previousTransition((long) 22);
        boolean boolean26 = dateTimeZone6.isStandardOffset(1644572978951L);
        long long28 = dateTimeZone6.previousTransition(1644458115651L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9L + "'", long15 == 9L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3600001L) + "'", long17 == (-3600001L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115200074L + "'", long19 == 115200074L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1644572978951L + "'", long22 == 1644572978951L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 22L + "'", long24 == 22L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1644458115651L + "'", long28 == 1644458115651L);
    }

    @Test
    public void test19012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19012");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusMonths(35457723);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusSeconds(240);
        int int8 = localDateTime2.getYear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
    }

    @Test
    public void test19013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19013");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField13 = localDateTime11.getField(0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withDate((int) (short) 10, 4, 4);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withSecondOfMinute(1);
        java.util.Date date22 = localDateTime18.toDate();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withSecondOfMinute(1);
        boolean boolean27 = localDateTime18.equals((java.lang.Object) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime18.era();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundHalfEvenCopy();
        java.lang.String str30 = property28.getName();
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.util.Locale locale32 = locale31.stripExtensions();
        int int33 = property28.getMaximumShortTextLength(locale31);
        java.lang.String str34 = property28.getAsText();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant36 = null;
        int int37 = dateTimeZone35.getOffset(readableInstant36);
        long long40 = dateTimeZone35.adjustOffset((long) 0, false);
        java.lang.String str41 = dateTimeZone35.toString();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.hourOfDay();
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.DateTime dateTime45 = localDateTime42.toDateTime(readableInstant44);
        java.lang.String str46 = dateTime45.toString();
        int int47 = dateTimeZone35.getOffset((org.joda.time.ReadableInstant) dateTime45);
        int int48 = property28.compareTo((org.joda.time.ReadableInstant) dateTime45);
        java.util.Locale locale50 = new java.util.Locale("");
        java.util.Locale.setDefault(locale50);
        java.lang.String str52 = locale50.getISO3Country();
        java.lang.String str53 = property28.getAsShortText(locale50);
        org.joda.time.LocalDateTime localDateTime54 = property28.roundHalfCeilingCopy();
        boolean boolean55 = localDateTime17.isBefore((org.joda.time.ReadablePartial) localDateTime54);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant57 = null;
        int int58 = dateTimeZone56.getOffset(readableInstant57);
        long long61 = dateTimeZone56.adjustOffset((long) 0, false);
        java.lang.String str62 = dateTimeZone56.toString();
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.hourOfDay();
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.DateTime dateTime66 = localDateTime63.toDateTime(readableInstant65);
        java.lang.String str67 = dateTime66.toString();
        int int68 = dateTimeZone56.getOffset((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.Instant instant69 = dateTime66.toInstant();
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.hourOfDay();
        org.joda.time.ReadableInstant readableInstant72 = null;
        long long73 = property71.getDifferenceAsLong(readableInstant72);
        java.util.Locale locale74 = java.util.Locale.US;
        java.lang.String str75 = locale74.getDisplayName();
        int int76 = property71.getMaximumTextLength(locale74);
        org.joda.time.LocalDateTime localDateTime77 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.hourOfDay();
        org.joda.time.ReadableInstant readableInstant79 = null;
        org.joda.time.DateTime dateTime80 = localDateTime77.toDateTime(readableInstant79);
        int int81 = property71.compareTo((org.joda.time.ReadableInstant) dateTime80);
        boolean boolean82 = instant69.isAfter((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.DateTime dateTime83 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = null;
        boolean boolean85 = dateTime83.isSupported(dateTimeFieldType84);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "era" + "'", str30, "era");
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
// flaky:         org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "AD" + "'", str34, "AD");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime45);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2022-02-11T09:59:17.466Z" + "'", str46, "2022-02-11T09:59:17.466Z");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "AD" + "'", str53, "AD");
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "UTC" + "'", str62, "UTC");
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTime66);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "2022-02-11T09:59:17.466Z" + "'", str67, "2022-02-11T09:59:17.466Z");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(instant69);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "English (United States)" + "'", str75, "English (United States)");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2 + "'", int76 == 2);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test19014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19014");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("2022-02-11T09:49:32.374Z");
        java.util.Set<java.lang.String> strSet3 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.util.Set<java.lang.String> strSet5 = provider0.getAvailableIDs();
        int int6 = strSet5.size();
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder10 = builder7.setExtension('a', "era");
        java.util.Locale.Builder builder11 = builder7.clearExtensions();
        java.util.Locale.Builder builder12 = builder7.clearExtensions();
        java.util.Locale locale13 = builder12.build();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = strSet5.contains((java.lang.Object) locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 575 + "'", int6 == 575);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
    }

    @Test
    public void test19015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19015");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        int int6 = localDateTime5.getYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readablePeriod7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.monthOfYear();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        int int11 = localDateTime10.getDayOfMonth();
        int int12 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.yearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test19016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19016");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        long long6 = dateTimeZone1.convertUTCToLocal(3600117L);
        boolean boolean7 = dateTimeZone1.isFixed();
        boolean boolean8 = dateTimeZone1.isFixed();
        long long11 = dateTimeZone1.adjustOffset((long) 3844052, false);
        long long14 = dateTimeZone1.convertLocalToUTC((long) 16, false);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone1);
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale17.getScript();
        java.util.Locale locale21 = new java.util.Locale("2022-02-11T09:49:33.118", "2022-02-11T09:49:32.375Z");
        java.lang.String str22 = locale17.getDisplayCountry(locale21);
        java.lang.String str23 = dateTimeZone1.getName((long) 187600913, locale21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 118800117L + "'", long6 == 118800117L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3844052L + "'", long11 == 3844052L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199984L) + "'", long14 == (-115199984L));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals(locale21.toString(), "2022-02-11t09:49:33.118_2022-02-11T09:49:32.375Z");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+32:00" + "'", str23, "+32:00");
    }

    @Test
    public void test19017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19017");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2022-02-11T09:51:14.011", (double) 3395283L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=3395283.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19018");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime3.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withSecondOfMinute(1);
        java.util.Date date11 = localDateTime7.toDate();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withSecondOfMinute(1);
        boolean boolean16 = localDateTime7.equals((java.lang.Object) localDateTime15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime7.era();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfEvenCopy();
        java.lang.String str19 = property17.getName();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.util.Locale locale21 = locale20.stripExtensions();
        int int22 = property17.getMaximumShortTextLength(locale20);
        java.lang.String str23 = property17.getAsText();
        org.joda.time.LocalDateTime localDateTime24 = property17.withMinimumValue();
        int int25 = localDateTime24.getDayOfYear();
        int int26 = property6.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusMinutes((int) '4');
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        org.joda.time.ReadableInstant readableInstant33 = null;
        long long34 = property32.getDifferenceAsLong(readableInstant33);
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = locale35.getDisplayName();
        int int37 = property32.getMaximumTextLength(locale35);
        org.joda.time.LocalDateTime localDateTime38 = property32.roundHalfFloorCopy();
        boolean boolean39 = localDateTime28.isAfter((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 882, dateTimeZone41);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.year();
        org.joda.time.LocalDateTime.Property property45 = localDateTime43.yearOfEra();
        boolean boolean46 = localDateTime28.isBefore((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime43.minusWeeks(35384740);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusYears(0);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withDayOfYear(35641991);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35641991 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "era" + "'", str19, "era");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AD" + "'", str23, "AD");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 42 + "'", int25 == 42);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "English (United States)" + "'", str36, "English (United States)");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
    }

    @Test
    public void test19019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19019");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray4 = localDateTime3.getFields();
        int int5 = localDateTime3.getWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withCenturyOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime11.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime7.property(dateTimeFieldType13);
        org.joda.time.LocalDateTime localDateTime15 = property14.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime17 = property14.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusHours((int) ' ');
        int int20 = localDateTime19.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundHalfFloorCopy();
        boolean boolean23 = property21.isLeap();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test19020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19020");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int[] intArray2 = localDateTime1.getValues();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withHourOfDay(10);
        boolean boolean7 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.hourOfDay();
        org.joda.time.ReadableInstant readableInstant12 = null;
        long long13 = property11.getDifferenceAsLong(readableInstant12);
        java.util.Locale locale14 = java.util.Locale.US;
        java.lang.String str15 = locale14.getDisplayName();
        int int16 = property11.getMaximumTextLength(locale14);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.hourOfDay();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localDateTime17.toDateTime(readableInstant19);
        int int21 = property11.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone22.getOffset(readableInstant23);
        long long27 = dateTimeZone22.adjustOffset((long) 0, false);
        java.lang.String str28 = dateTimeZone22.toString();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.hourOfDay();
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime29.toDateTime(readableInstant31);
        java.lang.String str33 = dateTime32.toString();
        int int34 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) dateTime32);
        int int35 = property11.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.hourOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withEra((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = localDateTime39.getFieldType(1);
        boolean boolean44 = dateTime32.isSupported(dateTimeFieldType43);
        boolean boolean45 = localDateTime1.isSupported(dateTimeFieldType43);
        int int46 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime1.withTime(3, 49, 10, 6);
        int int52 = localDateTime51.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property53 = localDateTime51.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime51.minusYears(394);
        org.joda.time.LocalDateTime.Property property56 = localDateTime51.dayOfYear();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime51.plusHours(39071031);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minusMillis(352);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.minus(readableDuration61);
        org.junit.Assert.assertNotNull(intArray2);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[2022, 2, 11, 35957578]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "English (United States)" + "'", str15, "English (United States)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2022-02-11T09:59:17.578Z" + "'", str33, "2022-02-11T09:59:17.578Z");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 17 + "'", int46 == 17);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
    }

    @Test
    public void test19021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19021");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withSecondOfMinute(2);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withDayOfYear(31);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.year();
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.util.Locale locale10 = locale9.stripExtensions();
        java.lang.String str11 = property8.getAsShortText(locale10);
        org.joda.time.LocalDateTime localDateTime12 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test19022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19022");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        int int6 = localDateTime5.getYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readablePeriod7);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        int int11 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        int int12 = localDateTime9.getYearOfEra();
        java.lang.String str13 = localDateTime9.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long18 = dateTimeZone15.convertLocalToUTC((long) (byte) 100, false);
        long long20 = dateTimeZone15.previousTransition(0L);
        org.joda.time.DateTime dateTime21 = localDateTime9.toDateTime(dateTimeZone15);
        java.util.TimeZone timeZone22 = dateTimeZone15.toTimeZone();
        long long25 = dateTimeZone15.convertLocalToUTC((long) 74, false);
        long long28 = dateTimeZone15.convertLocalToUTC((long) 35393391, true);
        org.joda.time.DateTime dateTime29 = localDateTime5.toDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property30 = localDateTime5.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withEra((int) (short) 1);
        int int37 = localDateTime36.getYear();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.plus(readablePeriod38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.monthOfYear();
        org.joda.time.LocalDateTime localDateTime41 = property40.roundHalfCeilingCopy();
        int int42 = localDateTime41.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.hourOfDay();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime43.withSecondOfMinute(2);
        int int49 = localDateTime41.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime41.minus(readablePeriod50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.weekyear();
        org.joda.time.DateTime dateTime53 = localDateTime51.toDateTime();
        java.lang.String str54 = localDateTime51.toString();
        boolean boolean55 = localDateTime5.isAfter((org.joda.time.ReadablePartial) localDateTime51);
        int int56 = localDateTime5.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = localDateTime5.toDateTime(dateTimeZone57);
        int int59 = localDateTime5.getEra();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-11T09:59:17.611" + "'", str13, "2022-02-11T09:59:17.611");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115199900L) + "'", long18 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-115199926L) + "'", long25 == (-115199926L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-79806609L) + "'", long28 == (-79806609L));
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2022-02-01T00:00:00.000" + "'", str54, "2022-02-01T00:00:00.000");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 20 + "'", int56 == 20);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test19023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19023");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.minusMillis((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.monthOfYear();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.millisOfDay();
        int int15 = localDateTime11.getEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.year();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime11.withSecondOfMinute((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfDay();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.hourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray25 = localDateTime24.getFields();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withYear((-1));
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.hourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withSecondOfMinute(1);
        java.util.Date date32 = localDateTime28.toDate();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.hourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withSecondOfMinute(1);
        boolean boolean37 = localDateTime28.equals((java.lang.Object) localDateTime36);
        int int38 = localDateTime36.getHourOfDay();
        int int39 = localDateTime24.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime24.minus(readableDuration40);
        int int42 = localDateTime24.getHourOfDay();
        org.joda.time.LocalDateTime.Property property43 = localDateTime24.millisOfSecond();
        java.lang.String str44 = property43.getAsString();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property43.getFieldType();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime19.withField(dateTimeFieldType45, 387);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str51 = dateTimeZone49.getName((long) 115200000);
        int int53 = dateTimeZone49.getStandardOffset((long) 708);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.withWeekyear(909);
        boolean boolean57 = localDateTime47.isBefore((org.joda.time.ReadablePartial) localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldArray25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 9 + "'", int38 == 9);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(localDateTime41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 9 + "'", int42 == 9);
        org.junit.Assert.assertNotNull(property43);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "635" + "'", str44, "635");
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+32:00" + "'", str51, "+32:00");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 115200000 + "'", int53 == 115200000);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test19024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19024");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int[] intArray2 = localDateTime1.getValues();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withHourOfDay(10);
        boolean boolean7 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withCenturyOfEra(6);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusSeconds(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMinuteOfHour(636);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 636 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[2022, 2, 11, 35957674]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test19025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19025");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone6.nextTransition(0L);
        long long12 = dateTimeZone6.convertLocalToUTC((long) (short) 0, true, (-115199900L));
        long long15 = dateTimeZone6.convertLocalToUTC((long) 9, true);
        long long17 = dateTimeZone6.convertUTCToLocal((-3600001L));
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 74);
        boolean boolean21 = dateTimeZone1.equals((java.lang.Object) (short) 1);
        int int23 = dateTimeZone1.getOffset(63780054566714L);
        long long25 = dateTimeZone1.nextTransition((long) 86399999);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        int int28 = dateTimeZone26.getOffsetFromLocal((long) 2022);
        java.lang.String str30 = dateTimeZone26.getName(100L);
        long long32 = dateTimeZone26.nextTransition((long) '4');
        long long34 = dateTimeZone1.getMillisKeepLocal(dateTimeZone26, (long) 35461618);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        java.lang.String str37 = dateTimeZone26.getName((long) 35401928);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9L + "'", long15 == 9L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3600001L) + "'", long17 == (-3600001L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115200074L + "'", long19 == 115200074L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 86399999L + "'", long25 == 86399999L);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 150661618L + "'", long34 == 150661618L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
    }

    @Test
    public void test19026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19026");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withSecondOfMinute(1);
        java.util.Date date7 = localDateTime3.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        boolean boolean12 = localDateTime3.equals((java.lang.Object) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField(0);
        boolean boolean17 = localDateTime0.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withSecondOfMinute(1);
        java.util.Date date22 = localDateTime18.toDate();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withSecondOfMinute(1);
        boolean boolean27 = localDateTime18.equals((java.lang.Object) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime18.era();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        org.joda.time.LocalDateTime.Property property32 = localDateTime14.property(dateTimeFieldType31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime14.plusYears((int) '4');
        int int35 = localDateTime34.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long40 = dateTimeZone37.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        int int43 = localDateTime41.compareTo((org.joda.time.ReadablePartial) localDateTime42);
        int int44 = localDateTime41.getYearOfEra();
        java.lang.String str45 = localDateTime41.toString();
        boolean boolean46 = dateTimeZone37.equals((java.lang.Object) localDateTime41);
        long long50 = dateTimeZone37.convertLocalToUTC((long) 35341075, true, (long) (-1));
        java.lang.String str51 = dateTimeZone37.getID();
        org.joda.time.DateTime dateTime52 = localDateTime34.toDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime.Property property53 = localDateTime34.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime34.withYear(708);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.minusWeeks(2168);
        org.joda.time.DurationFieldType durationFieldType58 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withFieldAdded(durationFieldType58, 360120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-115199900L) + "'", long40 == (-115199900L));
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2022 + "'", int44 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2022-02-11T09:59:17.695" + "'", str45, "2022-02-11T09:59:17.695");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-79858925L) + "'", long50 == (-79858925L));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+32:00" + "'", str51, "+32:00");
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
    }

    @Test
    public void test19027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19027");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1, chronology1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime6.getFields();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYear((-1));
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.plusYears(22);
        boolean boolean12 = localDateTime2.isAfter((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.minusYears(43);
        int int15 = localDateTime14.getDayOfMonth();
        int[] intArray16 = localDateTime14.getValues();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusDays(817);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withCenturyOfEra(35721673);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35721673 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[2001, 2, 11, 35941712]");
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test19028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19028");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("Property[secondOfMinute]");
        java.util.Set<java.lang.String> strSet3 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone5 = provider0.getZone("2022-02-11T09:50:39.230Z");
        org.joda.time.DateTimeZone dateTimeZone7 = provider0.getZone("2022-02-11T09:50:28.779Z");
        org.joda.time.DateTimeZone dateTimeZone9 = provider0.getZone("2022-02-12T17:50:46.644");
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertNull(dateTimeZone9);
    }

    @Test
    public void test19029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19029");
        java.lang.Throwable throwable3 = null;
        java.io.IOException iOException4 = new java.io.IOException(throwable3);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("2022-02-11T09:49:26.741Z", (java.lang.Throwable) iOException4);
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        java.io.IOException iOException9 = new java.io.IOException("2022-02-11T09:49:36.965Z", (java.lang.Throwable) iOException7);
        java.io.IOException iOException10 = new java.io.IOException((java.lang.Throwable) iOException9);
        java.lang.Throwable[] throwableArray11 = iOException9.getSuppressed();
        java.io.IOException iOException12 = new java.io.IOException("2022-02-12T17:51:43.093+32:00", (java.lang.Throwable) iOException9);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test19030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19030");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long6 = dateTimeZone1.adjustOffset((long) 0, false);
        java.lang.String str7 = dateTimeZone1.toString();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.DateTime dateTime11 = localDateTime8.toDateTime(readableInstant10);
        java.lang.String str12 = dateTime11.toString();
        int int13 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime11);
        int int15 = dateTimeZone1.getOffsetFromLocal((long) 4);
        long long19 = dateTimeZone1.convertLocalToUTC((long) 270, true, (long) 69);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 672, dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (short) -1, chronology24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.minuteOfHour();
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale28 = java.util.Locale.ROOT;
        java.util.Locale locale29 = java.util.Locale.US;
        java.lang.String str30 = locale28.getDisplayScript(locale29);
        java.util.Locale locale31 = java.util.Locale.JAPAN;
        java.lang.String str32 = locale29.getDisplayScript(locale31);
        java.lang.String str33 = locale31.toLanguageTag();
        java.lang.String str34 = locale27.getDisplayScript(locale31);
        int int35 = property26.getMaximumShortTextLength(locale31);
        org.joda.time.LocalDateTime localDateTime36 = property26.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusMonths(42);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withYearOfCentury(3);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.hourOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.withEra((int) (short) 1);
        int int47 = localDateTime46.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = localDateTime46.getFieldType(1);
        org.joda.time.LocalDateTime.Property property50 = localDateTime38.property(dateTimeFieldType49);
        org.joda.time.LocalDateTime localDateTime51 = property50.roundHalfCeilingCopy();
        boolean boolean52 = dateTimeZone1.isLocalDateTimeGap(localDateTime51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime51.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022-02-11T09:59:17.738Z" + "'", str12, "2022-02-11T09:59:17.738Z");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 270L + "'", long19 == 270L);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ja-JP" + "'", str33, "ja-JP");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2022 + "'", int47 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(property53);
    }

    @Test
    public void test19031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19031");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minus(readablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusYears(42);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minusMinutes(100);
        int int13 = localDateTime8.getEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.withYear(35341799);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusYears(39121983);
        int int18 = localDateTime15.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withDurationAdded(readableDuration19, 11351564);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test19032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19032");
        java.util.Locale locale1 = new java.util.Locale("2022-02-12T17:58:15.512+32:00");
        org.junit.Assert.assertEquals(locale1.toString(), "2022-02-12t17:58:15.512+32:00");
    }

    @Test
    public void test19033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19033");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("Property[secondOfMinute]");
        org.joda.time.DateTimeZone dateTimeZone4 = provider0.getZone("ap. J.-C.");
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.util.Set<java.lang.String> strSet6 = provider0.getAvailableIDs();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test19034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19034");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withCenturyOfEra(9);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withYear(0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        org.junit.Assert.assertNotNull(localDateTime0);
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 785 + "'", int1 == 785);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test19035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19035");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1, chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.ROOT;
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale5.getDisplayScript(locale6);
        java.util.Locale locale8 = java.util.Locale.JAPAN;
        java.lang.String str9 = locale6.getDisplayScript(locale8);
        java.lang.String str10 = locale8.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayScript(locale8);
        int int12 = property3.getMaximumShortTextLength(locale8);
        org.joda.time.LocalDateTime localDateTime13 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMonths(42);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withYearOfCentury(3);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withEra((int) (short) 1);
        int int24 = localDateTime23.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = localDateTime23.getFieldType(1);
        org.joda.time.LocalDateTime.Property property27 = localDateTime15.property(dateTimeFieldType26);
        org.joda.time.Chronology chronology28 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime15.withCenturyOfEra(3652);
        org.joda.time.LocalDateTime.Property property31 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime33 = property31.setCopy(967);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ja-JP" + "'", str10, "ja-JP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
    }

    @Test
    public void test19036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19036");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        long long6 = dateTimeZone1.previousTransition(0L);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = localDateTime7.getFields();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withWeekyear(35341138);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.withDurationAdded(readableDuration11, 611);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone14.getOffset(readableInstant15);
        long long19 = dateTimeZone14.adjustOffset((long) 0, false);
        java.lang.String str20 = dateTimeZone14.toString();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.hourOfDay();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.DateTime dateTime24 = localDateTime21.toDateTime(readableInstant23);
        java.lang.String str25 = dateTime24.toString();
        int int26 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Instant instant27 = dateTime24.toInstant();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone28.getOffset(readableInstant29);
        long long33 = dateTimeZone28.adjustOffset((long) 0, false);
        java.lang.String str34 = dateTimeZone28.toString();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.hourOfDay();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime35.toDateTime(readableInstant37);
        java.lang.String str39 = dateTime38.toString();
        int int40 = dateTimeZone28.getOffset((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Instant instant41 = dateTime38.toInstant();
        boolean boolean42 = instant27.isBefore((org.joda.time.ReadableInstant) instant41);
        org.joda.time.Instant instant43 = instant41.toInstant();
        org.joda.time.DateTime dateTime44 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) instant43);
        org.joda.time.Instant instant45 = dateTime44.toInstant();
        org.joda.time.Instant instant46 = dateTime44.toInstant();
        org.joda.time.Chronology chronology47 = instant46.getChronology();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        int[] intArray50 = localDateTime49.getValues();
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.hourOfDay();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.withHourOfDay(10);
        boolean boolean55 = localDateTime49.isAfter((org.joda.time.ReadablePartial) localDateTime54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime49.withMillisOfSecond((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusYears((int) '4');
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.plus(readableDuration60);
        int int62 = localDateTime57.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property63 = localDateTime57.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime64 = property63.getLocalDateTime();
        org.joda.time.DateTime dateTime65 = localDateTime64.toDateTime();
        org.joda.time.Instant instant66 = dateTime65.toInstant();
        boolean boolean67 = instant46.isEqual((org.joda.time.ReadableInstant) instant66);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2022-02-11T09:59:17.810Z" + "'", str25, "2022-02-11T09:59:17.810Z");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime38);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2022-02-11T09:59:17.810Z" + "'", str39, "2022-02-11T09:59:17.810Z");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(intArray50);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[2022, 2, 11, 35957810]");
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
// flaky:         org.junit.Assert.assertTrue("'" + int62 + "' != '" + 35957000 + "'", int62 == 35957000);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test19037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19037");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, 438, 451);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19038");
        java.io.IOException iOException0 = new java.io.IOException();
        java.lang.Throwable[] throwableArray1 = iOException0.getSuppressed();
        java.io.IOException iOException2 = new java.io.IOException();
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException2);
        iOException0.addSuppressed((java.lang.Throwable) iOException2);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str9 = dateTimeZone8.getID();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone8);
        java.lang.Throwable throwable12 = null;
        java.io.IOException iOException13 = new java.io.IOException(throwable12);
        java.io.IOException iOException14 = new java.io.IOException("hourOfDay", (java.lang.Throwable) iOException13);
        java.io.IOException iOException15 = new java.io.IOException((java.lang.Throwable) iOException14);
        boolean boolean16 = localDateTime10.equals((java.lang.Object) iOException14);
        java.io.IOException iOException17 = new java.io.IOException((java.lang.Throwable) iOException14);
        java.io.IOException iOException19 = new java.io.IOException("+32:00");
        iOException14.addSuppressed((java.lang.Throwable) iOException19);
        java.io.IOException iOException21 = new java.io.IOException("2022-02-11T09:49:34.236", (java.lang.Throwable) iOException19);
        iOException2.addSuppressed((java.lang.Throwable) iOException21);
        java.io.IOException iOException24 = new java.io.IOException("2022-02-11T09:54:41.302Z");
        iOException2.addSuppressed((java.lang.Throwable) iOException24);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-01:00" + "'", str9, "-01:00");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19039");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.minusMillis((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.monthOfYear();
        boolean boolean14 = property13.isLeap();
        java.lang.String str15 = property13.getAsString();
        boolean boolean16 = property13.isLeap();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2" + "'", str15, "2");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19040");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.ReadableInstant readableInstant2 = null;
        long long3 = property1.getDifferenceAsLong(readableInstant2);
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.getDisplayName();
        int int6 = property1.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime7.toDateTime(readableInstant9);
        int int11 = property1.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone12.getOffset(readableInstant13);
        long long17 = dateTimeZone12.adjustOffset((long) 0, false);
        java.lang.String str18 = dateTimeZone12.toString();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.hourOfDay();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime19.toDateTime(readableInstant21);
        java.lang.String str23 = dateTime22.toString();
        int int24 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime22);
        int int25 = property1.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.hourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withSecondOfMinute(1);
        java.util.Date date30 = localDateTime26.toDate();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withSecondOfMinute(1);
        boolean boolean35 = localDateTime26.equals((java.lang.Object) localDateTime34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime26.era();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime26.withMillisOfSecond((int) 'x');
        org.joda.time.DateTime dateTime39 = localDateTime26.toDateTime();
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.hourOfDay();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.yearOfCentury();
        int int43 = property42.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property42.getFieldType();
        int int45 = dateTime39.get(dateTimeFieldType44);
        boolean boolean46 = dateTime22.isAfter((org.joda.time.ReadableInstant) dateTime39);
        boolean boolean48 = dateTime22.equals((java.lang.Object) "2022-02-11T09:50:10.336Z");
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English (United States)" + "'", str5, "English (United States)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2022-02-11T09:59:17.877Z" + "'", str23, "2022-02-11T09:59:17.877Z");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 22 + "'", int45 == 22);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test19041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19041");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withSecondOfMinute(1);
        java.util.Date date8 = localDateTime4.toDate();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withSecondOfMinute(1);
        boolean boolean13 = localDateTime4.equals((java.lang.Object) localDateTime12);
        int int14 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.dayOfWeek();
        org.joda.time.DurationField durationField16 = property15.getRangeDurationField();
        long long17 = property15.remainder();
        org.joda.time.DurationField durationField18 = property15.getDurationField();
        boolean boolean19 = dateTimeZone1.equals((java.lang.Object) property15);
        boolean boolean21 = dateTimeZone1.isStandardOffset((long) 14307940);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationField16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35941923L + "'", long17 == 35941923L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test19042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19042");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1, chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        int int4 = localDateTime2.getYearOfCentury();
        java.util.Locale locale5 = java.util.Locale.US;
        java.lang.String str7 = locale5.getExtension('u');
        java.util.Set<java.lang.String> strSet8 = locale5.getUnicodeLocaleAttributes();
        boolean boolean9 = localDateTime2.equals((java.lang.Object) locale5);
        java.util.Locale.setDefault(locale5);
        java.util.Locale.setDefault(locale5);
        java.lang.String str12 = locale5.getLanguage();
        java.util.Locale.setDefault(locale5);
        java.lang.String str14 = locale5.getScript();
        java.util.Locale.setDefault(locale5);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en" + "'", str12, "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19043");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = localDateTime7.getFields();
        int int9 = localDateTime7.getWeekyear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        int[] intArray12 = localDateTime11.getValues();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withCenturyOfEra(2);
        int int15 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        int int16 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = property17.getLocalDateTime();
        java.util.Locale locale19 = java.util.Locale.ROOT;
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale19.getDisplayScript(locale20);
        java.util.Locale locale22 = java.util.Locale.JAPAN;
        java.lang.String str23 = locale20.getDisplayScript(locale22);
        java.lang.String str25 = locale20.getExtension('a');
        java.lang.String str26 = locale20.getISO3Language();
        java.lang.String str27 = locale20.toLanguageTag();
        java.lang.String str29 = locale20.getExtension('x');
        java.util.Set<java.lang.String> strSet30 = locale20.getUnicodeLocaleAttributes();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray35 = localDateTime34.getFields();
        int int36 = localDateTime34.getWeekyear();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        int[] intArray39 = localDateTime38.getValues();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withCenturyOfEra(2);
        int int42 = localDateTime34.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        int int43 = localDateTime34.getYear();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime34.withMinuteOfHour((int) '#');
        boolean boolean46 = strSet30.contains((java.lang.Object) localDateTime45);
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.hourOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.hourOfDay();
        org.joda.time.ReadableInstant readableInstant53 = null;
        long long54 = property52.getDifferenceAsLong(readableInstant53);
        java.util.Locale locale55 = java.util.Locale.US;
        java.lang.String str56 = locale55.getDisplayName();
        int int57 = property52.getMaximumTextLength(locale55);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.hourOfDay();
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.DateTime dateTime61 = localDateTime58.toDateTime(readableInstant60);
        int int62 = property52.compareTo((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant64 = null;
        int int65 = dateTimeZone63.getOffset(readableInstant64);
        long long68 = dateTimeZone63.adjustOffset((long) 0, false);
        java.lang.String str69 = dateTimeZone63.toString();
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.hourOfDay();
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.DateTime dateTime73 = localDateTime70.toDateTime(readableInstant72);
        java.lang.String str74 = dateTime73.toString();
        int int75 = dateTimeZone63.getOffset((org.joda.time.ReadableInstant) dateTime73);
        int int76 = property52.compareTo((org.joda.time.ReadableInstant) dateTime73);
        java.util.Locale locale77 = java.util.Locale.US;
        int int78 = property52.getMaximumTextLength(locale77);
        org.joda.time.LocalDateTime localDateTime79 = property52.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = localDateTime79.getFieldType((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime47.withField(dateTimeFieldType81, 258);
        boolean boolean84 = localDateTime45.isSupported(dateTimeFieldType81);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime18.withField(dateTimeFieldType81, 708);
        int int87 = localDateTime18.getWeekyear();
        org.joda.time.LocalDateTime.Property property88 = localDateTime18.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.UTC;
        long long91 = dateTimeZone89.nextTransition(0L);
        java.lang.String str93 = dateTimeZone89.getNameKey((long) 12);
        boolean boolean94 = dateTimeZone89.isFixed();
        org.joda.time.DateTime dateTime95 = localDateTime18.toDateTime(dateTimeZone89);
        long long96 = dateTime95.getMillis();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[2022, 2, 11, 35957946]");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "eng" + "'", str26, "eng");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en-US" + "'", str27, "en-US");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
        org.junit.Assert.assertNotNull(intArray39);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[2022, 2, 11, 35957946]");
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2022 + "'", int43 == 2022);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "English (United States)" + "'", str56, "English (United States)");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "UTC" + "'", str69, "UTC");
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(dateTime73);
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "2022-02-11T09:59:17.946Z" + "'", str74, "2022-02-11T09:59:17.946Z");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertNotNull(dateTimeFieldType81);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2022 + "'", int87 == 2022);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(dateTimeZone89);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 0L + "'", long91 == 0L);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "UTC" + "'", str93, "UTC");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(dateTime95);
// flaky:         org.junit.Assert.assertTrue("'" + long96 + "' != '" + 1644573557946L + "'", long96 == 1644573557946L);
    }

    @Test
    public void test19044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19044");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        int[] intArray14 = localDateTime13.getValues();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withCenturyOfEra(2);
        boolean boolean17 = localDateTime11.isBefore((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plusSeconds((-3600000));
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minus(readablePeriod20);
        int int22 = localDateTime19.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plusHours((int) '4');
        org.joda.time.LocalDateTime.Property property25 = localDateTime19.millisOfDay();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(intArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[2022, 2, 11, 35957992]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64757992 + "'", int22 == 64757992);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test19045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19045");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.fromDateFields(date4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMillis(1752);
        int int8 = localDateTime5.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withYearOfEra(5);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime5.plus(readablePeriod11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withEra(35829611);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35829611 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 09:59:18 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35958998 + "'", int8 == 35958998);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test19046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19046");
        java.util.Locale locale1 = new java.util.Locale("era");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale1.getLanguage();
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale5 = locale1.stripExtensions();
        java.util.Set<java.lang.String> strSet6 = locale1.getUnicodeLocaleKeys();
        java.util.Spliterator<java.lang.String> strSpliterator7 = strSet6.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.lang.String[] strArray15 = new java.lang.String[] { "ja_JP", "ja_JP", "hi!", "ja_JP" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList16);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream19 = languageRangeList9.stream();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, strMap20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList21, strMap22);
        java.lang.String[] strArray35 = new java.lang.String[] { "1", "hi!", "java.io.IOException", "hi!", "", "hi!", "ja_JP", "ja_JP", "en-US", "en-US", "UTC" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        java.util.Spliterator<java.lang.String> strSpliterator38 = strSet36.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator39 = strSet36.spliterator();
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags(languageRangeList21, (java.util.Collection<java.lang.String>) strSet36);
        java.lang.String[] strArray52 = new java.lang.String[] { "1", "hi!", "java.io.IOException", "hi!", "", "hi!", "ja_JP", "ja_JP", "en-US", "en-US", "UTC" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        java.util.Spliterator<java.lang.String> strSpliterator55 = strSet53.spliterator();
        java.util.Locale locale56 = java.util.Locale.UK;
        boolean boolean57 = strSet53.contains((java.lang.Object) locale56);
        java.util.Locale.LanguageRange[] languageRangeArray58 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList59 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59, languageRangeArray58);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap61 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList62 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, strMap61);
        boolean boolean63 = strSet53.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59);
        java.util.Collection<java.util.Locale> localeCollection64 = null;
        java.util.Locale.LanguageRange[] languageRangeArray65 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList66 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList66, languageRangeArray65);
        java.util.Locale.LanguageRange[] languageRangeArray68 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList69 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList69, languageRangeArray68);
        java.lang.String[] strArray75 = new java.lang.String[] { "ja_JP", "ja_JP", "hi!", "ja_JP" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        java.lang.String str78 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList69, (java.util.Collection<java.lang.String>) strList76);
        java.util.Locale.FilteringMode filteringMode79 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, (java.util.Collection<java.lang.String>) strList76, filteringMode79);
        java.util.Collection<java.lang.String> strCollection81 = null;
        java.util.Locale.FilteringMode filteringMode82 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList66, strCollection81, filteringMode82);
        java.util.List<java.util.Locale> localeList84 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList59, localeCollection64, filteringMode82);
        java.util.List<java.util.Locale> localeList85 = java.util.Locale.filter(languageRangeList21, localeCollection64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap86 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList87 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList21, strMap86);
        boolean boolean88 = strSet6.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList87);
        org.joda.time.tz.Provider provider89 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone91 = provider89.getZone("2022-02-11T09:49:32.374Z");
        java.util.Set<java.lang.String> strSet92 = provider89.getAvailableIDs();
        java.lang.Object[] objArray93 = strSet92.toArray();
        java.util.Locale.Builder builder94 = new java.util.Locale.Builder();
        boolean boolean95 = strSet92.equals((java.lang.Object) builder94);
        java.lang.Object[] objArray96 = strSet92.toArray();
        java.util.List<java.lang.String> strList97 = java.util.Locale.filterTags(languageRangeList87, (java.util.Collection<java.lang.String>) strSet92);
        boolean boolean99 = strSet92.add("2022-02-11T09:54:23.803Z");
        org.junit.Assert.assertEquals(locale1.toString(), "era");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "era");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "era" + "'", str3, "era");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "era");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSpliterator7);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(languageRangeStream19);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strSpliterator38);
        org.junit.Assert.assertNotNull(strSpliterator39);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strSpliterator55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(languageRangeArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(languageRangeList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(languageRangeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(languageRangeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + filteringMode79 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode79.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertTrue("'" + filteringMode82 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode82.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(localeList84);
        org.junit.Assert.assertNotNull(localeList85);
        org.junit.Assert.assertNotNull(languageRangeList87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(provider89);
        org.junit.Assert.assertNull(dateTimeZone91);
        org.junit.Assert.assertNotNull(strSet92);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(objArray96);
        org.junit.Assert.assertNotNull(strList97);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test19047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19047");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setLanguage("Wed");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clear();
        java.util.Locale locale6 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setUnicodeLocaleKeyword("2022-02-11T09:56:35.616", "2022-02-12T17:51:51.845+32:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 2022-02-11T09:56:35.616 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test19048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19048");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2022-02-11T09:55:54.089Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-11t09:55:54.089z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19049");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("2022-02-11T09:52:02.678");
        java.lang.String str2 = locale1.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test19050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19050");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withSecondOfMinute(1);
        java.util.Date date7 = localDateTime3.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        boolean boolean12 = localDateTime3.equals((java.lang.Object) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField(0);
        boolean boolean17 = localDateTime0.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withSecondOfMinute(1);
        java.util.Date date22 = localDateTime18.toDate();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withSecondOfMinute(1);
        boolean boolean27 = localDateTime18.equals((java.lang.Object) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime18.era();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        org.joda.time.LocalDateTime.Property property32 = localDateTime14.property(dateTimeFieldType31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime14.plusYears((int) '4');
        org.joda.time.LocalDateTime localDateTime36 = localDateTime14.plusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        int int39 = localDateTime37.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.hourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withSecondOfMinute(1);
        java.util.Date date44 = localDateTime40.toDate();
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.hourOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withSecondOfMinute(1);
        boolean boolean49 = localDateTime40.equals((java.lang.Object) localDateTime48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime40.era();
        org.joda.time.LocalDateTime localDateTime51 = property50.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField53 = localDateTime51.getField(0);
        boolean boolean54 = localDateTime37.isEqual((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.LocalDateTime.Property property55 = localDateTime51.centuryOfEra();
        org.joda.time.Chronology chronology56 = localDateTime51.getChronology();
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime51.plus(readableDuration57);
        int int59 = localDateTime36.compareTo((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime51.withCenturyOfEra(62);
        org.joda.time.Chronology chronology62 = localDateTime51.getChronology();
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now(chronology62);
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(chronology62);
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now(chronology62);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.withYearOfEra(35741764);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray68 = localDateTime67.getFieldTypes();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Feb 11 09:59:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Feb 11 09:59:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Fri Feb 11 09:59:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray68);
    }

    @Test
    public void test19051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19051");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("Property[secondOfMinute]");
        org.joda.time.DateTimeZone dateTimeZone4 = provider0.getZone("ap. J.-C.");
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone dateTimeZone8 = provider0.getZone("2022-02-11T09:49:28.599");
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNull(dateTimeZone8);
    }

    @Test
    public void test19052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19052");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false, (-115199900L));
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone6.nextTransition(0L);
        long long12 = dateTimeZone6.convertLocalToUTC((long) (short) 0, true, (-115199900L));
        long long15 = dateTimeZone6.convertLocalToUTC((long) 9, true);
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (byte) -1);
        java.lang.String str19 = dateTimeZone1.getShortName((long) 49);
        java.lang.String str20 = dateTimeZone1.toString();
        long long22 = dateTimeZone1.nextTransition((long) 33);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone23.getOffset(readableInstant24);
        long long28 = dateTimeZone23.adjustOffset((long) 0, false);
        java.lang.String str29 = dateTimeZone23.toString();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone30.getOffset(readableInstant31);
        long long35 = dateTimeZone30.adjustOffset((long) 0, false);
        java.lang.String str36 = dateTimeZone30.toString();
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.hourOfDay();
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime37.toDateTime(readableInstant39);
        java.lang.String str41 = dateTime40.toString();
        int int42 = dateTimeZone30.getOffset((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Instant instant43 = dateTime40.toInstant();
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.hourOfDay();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withEra((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = localDateTime47.getFieldType(1);
        boolean boolean52 = instant43.isSupported(dateTimeFieldType51);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.hourOfDay();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = localDateTime56.getFieldType((int) (short) 1);
        int int59 = instant43.get(dateTimeFieldType58);
        int int60 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) instant43);
        int int61 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) instant43);
        java.util.TimeZone timeZone62 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600100L + "'", long5 == 3600100L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9L + "'", long15 == 9L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3600001L) + "'", long17 == (-3600001L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-01:00" + "'", str19, "-01:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-01:00" + "'", str20, "-01:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 33L + "'", long22 == 33L);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2022-02-11T09:59:18.164Z" + "'", str41, "2022-02-11T09:59:18.164Z");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-3600000) + "'", int61 == (-3600000));
        org.junit.Assert.assertNotNull(timeZone62);
        org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test19053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19053");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        int int3 = localDateTime0.getYearOfEra();
        java.lang.String str4 = localDateTime0.toString();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withWeekyear(31);
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime0.withSecondOfMinute(49);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDate(112, 847, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 847 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11T09:59:18.182" + "'", str4, "2022-02-11T09:59:18.182");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test19054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19054");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withSecondOfMinute(1);
        java.util.Date date7 = localDateTime3.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        boolean boolean12 = localDateTime3.equals((java.lang.Object) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField(0);
        boolean boolean17 = localDateTime0.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withSecondOfMinute(1);
        java.util.Date date22 = localDateTime18.toDate();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withSecondOfMinute(1);
        boolean boolean27 = localDateTime18.equals((java.lang.Object) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime18.era();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        org.joda.time.LocalDateTime.Property property32 = localDateTime14.property(dateTimeFieldType31);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.hourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.minus(readablePeriod40);
        int int42 = localDateTime41.getEra();
        int int43 = property32.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.Interval interval44 = property32.toInterval();
        org.joda.time.LocalDateTime localDateTime45 = property32.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.minusMonths((-3600000));
        org.joda.time.LocalDateTime.Property property48 = localDateTime45.dayOfYear();
        int int49 = property48.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.hourOfDay();
        org.joda.time.ReadableInstant readableInstant52 = null;
        long long53 = property51.getDifferenceAsLong(readableInstant52);
        java.util.Locale locale54 = java.util.Locale.US;
        java.lang.String str55 = locale54.getDisplayName();
        int int56 = property51.getMaximumTextLength(locale54);
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.hourOfDay();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withSecondOfMinute(1);
        java.util.Date date61 = localDateTime57.toDate();
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.hourOfDay();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.withSecondOfMinute(1);
        boolean boolean66 = localDateTime57.equals((java.lang.Object) localDateTime65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime57.era();
        org.joda.time.LocalDateTime localDateTime68 = property67.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime69 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.now();
        int int71 = localDateTime69.compareTo((org.joda.time.ReadablePartial) localDateTime70);
        int int72 = localDateTime69.getYearOfEra();
        java.lang.String str73 = localDateTime69.toString();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long78 = dateTimeZone75.convertLocalToUTC((long) (byte) 100, false);
        long long80 = dateTimeZone75.previousTransition(0L);
        org.joda.time.DateTime dateTime81 = localDateTime69.toDateTime(dateTimeZone75);
        org.joda.time.DateTime dateTime82 = localDateTime68.toDateTime((org.joda.time.ReadableInstant) dateTime81);
        int int83 = property51.compareTo((org.joda.time.ReadableInstant) dateTime82);
        int int84 = property48.getDifference((org.joda.time.ReadableInstant) dateTime82);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime86 = property48.setCopy("2022-02-11T09:55:57.603Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:55:57.603Z\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Feb 11 09:59:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Feb 11 09:59:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "English (United States)" + "'", str55, "English (United States)");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(date61);
// flaky:         org.junit.Assert.assertEquals(date61.toString(), "Fri Feb 11 09:59:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2022 + "'", int72 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "2022-02-11T09:59:18.192" + "'", str73, "2022-02-11T09:59:18.192");
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-115199900L) + "'", long78 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
    }

    @Test
    public void test19055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19055");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        int int6 = localDateTime5.getYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readablePeriod7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.monthOfYear();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withTime((int) (short) 1, 4, 4, (int) '4');
        int int15 = localDateTime8.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime8.minusHours(882);
        org.joda.time.Chronology chronology18 = localDateTime17.getChronology();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.hourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withSecondOfMinute(1);
        java.util.Date date23 = localDateTime19.toDate();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.hourOfDay();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withSecondOfMinute(1);
        boolean boolean28 = localDateTime19.equals((java.lang.Object) localDateTime27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime19.era();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundHalfEvenCopy();
        java.lang.String str31 = property29.getName();
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.util.Locale locale33 = locale32.stripExtensions();
        int int34 = property29.getMaximumShortTextLength(locale32);
        java.lang.String str35 = property29.getAsText();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = dateTimeZone36.getOffset(readableInstant37);
        long long41 = dateTimeZone36.adjustOffset((long) 0, false);
        java.lang.String str42 = dateTimeZone36.toString();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.hourOfDay();
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.DateTime dateTime46 = localDateTime43.toDateTime(readableInstant45);
        java.lang.String str47 = dateTime46.toString();
        int int48 = dateTimeZone36.getOffset((org.joda.time.ReadableInstant) dateTime46);
        int int49 = property29.compareTo((org.joda.time.ReadableInstant) dateTime46);
        java.util.Locale locale51 = new java.util.Locale("");
        java.util.Locale.setDefault(locale51);
        java.lang.String str53 = locale51.getISO3Country();
        java.lang.String str54 = property29.getAsShortText(locale51);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now();
        int int57 = localDateTime55.compareTo((org.joda.time.ReadablePartial) localDateTime56);
        int int58 = localDateTime55.getYearOfEra();
        org.joda.time.LocalDateTime.Property property59 = localDateTime55.year();
        java.util.Locale locale60 = java.util.Locale.US;
        java.lang.String str61 = locale60.getDisplayName();
        java.lang.String str62 = locale60.getDisplayVariant();
        java.util.Set<java.lang.Character> charSet63 = locale60.getExtensionKeys();
        java.util.Locale locale64 = locale60.stripExtensions();
        int int65 = property59.getMaximumTextLength(locale64);
        java.lang.String str66 = property29.getAsText(locale64);
        org.joda.time.LocalDateTime localDateTime67 = property29.roundHalfEvenCopy();
        boolean boolean68 = localDateTime17.isAfter((org.joda.time.ReadablePartial) localDateTime67);
        int int69 = localDateTime67.getSecondOfMinute();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Feb 11 09:59:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "era" + "'", str31, "era");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AD" + "'", str35, "AD");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2022-02-11T09:59:18.214Z" + "'", str47, "2022-02-11T09:59:18.214Z");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals(locale51.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "AD" + "'", str54, "AD");
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2022 + "'", int58 == 2022);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "English (United States)" + "'", str61, "English (United States)");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(charSet63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 9 + "'", int65 == 9);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "AD" + "'", str66, "AD");
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test19056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19056");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime3.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withSecondOfMinute(1);
        java.util.Date date11 = localDateTime7.toDate();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withSecondOfMinute(1);
        boolean boolean16 = localDateTime7.equals((java.lang.Object) localDateTime15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime7.era();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfEvenCopy();
        java.lang.String str19 = property17.getName();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.util.Locale locale21 = locale20.stripExtensions();
        int int22 = property17.getMaximumShortTextLength(locale20);
        java.lang.String str23 = property17.getAsText();
        org.joda.time.LocalDateTime localDateTime24 = property17.withMinimumValue();
        int int25 = localDateTime24.getDayOfYear();
        int int26 = property6.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusMinutes((int) '4');
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        org.joda.time.ReadableInstant readableInstant33 = null;
        long long34 = property32.getDifferenceAsLong(readableInstant33);
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = locale35.getDisplayName();
        int int37 = property32.getMaximumTextLength(locale35);
        org.joda.time.LocalDateTime localDateTime38 = property32.roundHalfFloorCopy();
        boolean boolean39 = localDateTime28.isAfter((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 882, dateTimeZone41);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.year();
        org.joda.time.LocalDateTime.Property property45 = localDateTime43.yearOfEra();
        boolean boolean46 = localDateTime28.isBefore((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime43.minusWeeks(35384740);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.hourOfDay();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = localDateTime52.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property55 = localDateTime52.dayOfMonth();
        org.joda.time.LocalDateTime.Property property56 = localDateTime52.dayOfWeek();
        org.joda.time.LocalDateTime.Property property57 = localDateTime52.monthOfYear();
        org.joda.time.Chronology chronology58 = localDateTime52.getChronology();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime52.minusWeeks(35428011);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.minusSeconds(200);
        int int63 = localDateTime60.getSecondOfMinute();
        int int64 = localDateTime60.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime60.plusMillis(35525263);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime43.withFields((org.joda.time.ReadablePartial) localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Feb 11 09:59:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "era" + "'", str19, "era");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AD" + "'", str23, "AD");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 42 + "'", int25 == 42);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "English (United States)" + "'", str36, "English (United States)");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int64 + "' != '" + 59 + "'", int64 == 59);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime67);
    }

    @Test
    public void test19057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19057");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime3.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.dayOfWeek();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.monthOfYear();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfEra(882);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withWeekOfWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long19 = dateTimeZone16.convertLocalToUTC((long) (byte) 100, false);
        long long21 = dateTimeZone16.previousTransition(0L);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone16);
        long long24 = dateTimeZone16.convertUTCToLocal(43L);
        long long28 = dateTimeZone16.convertLocalToUTC((-76738925L), false, (long) 241);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 767, dateTimeZone16);
        int int30 = localDateTime29.getEra();
        int int31 = localDateTime29.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime13.withFields((org.joda.time.ReadablePartial) localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115199900L) + "'", long19 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 115200043L + "'", long24 == 115200043L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-191938925L) + "'", long28 == (-191938925L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 19 + "'", int31 == 19);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test19058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19058");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "era");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder11 = builder9.clearExtensions();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test19059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19059");
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        int int4 = localDateTime2.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.monthOfYear();
        org.joda.time.Chronology chronology6 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 35401608, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 1, chronology6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        int[] intArray12 = localDateTime11.getValues();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withHourOfDay(10);
        boolean boolean17 = localDateTime11.isAfter((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime11.withMillisOfDay((int) (short) 1);
        org.joda.time.DateTimeField[] dateTimeFieldArray20 = localDateTime19.getFields();
        int int21 = localDateTime19.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.millisOfDay();
        org.joda.time.LocalDateTime.Property property23 = localDateTime19.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundHalfCeilingCopy();
        boolean boolean25 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withWeekyear(121);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusHours(446);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[2022, 2, 11, 35958321]");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test19060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19060");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfMonth();
        int int13 = localDateTime11.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.secondOfMinute();
        java.lang.String str15 = property14.toString();
        int int16 = property14.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long22 = dateTimeZone19.convertLocalToUTC((long) (byte) 100, false);
        long long24 = dateTimeZone19.previousTransition(0L);
        java.lang.String str26 = dateTimeZone19.getNameKey((long) 10);
        int int28 = dateTimeZone19.getOffsetFromLocal((long) 12);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) (short) -1, chronology31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.minuteOfHour();
        org.joda.time.LocalDateTime.Property property34 = localDateTime32.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = property34.addToCopy((long) (byte) 0);
        java.lang.String str37 = property34.getAsShortText();
        org.joda.time.LocalDateTime localDateTime39 = property34.addToCopy(2022);
        java.util.Locale locale40 = java.util.Locale.GERMAN;
        int int41 = property34.getMaximumShortTextLength(locale40);
        java.lang.String str42 = dateTimeZone19.getName((long) (byte) 10, locale40);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long48 = dateTimeZone44.convertLocalToUTC((long) (byte) 100, false, (-115199900L));
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        long long51 = dateTimeZone49.nextTransition(0L);
        long long55 = dateTimeZone49.convertLocalToUTC((long) (short) 0, true, (-115199900L));
        long long58 = dateTimeZone49.convertLocalToUTC((long) 9, true);
        long long60 = dateTimeZone44.getMillisKeepLocal(dateTimeZone49, (long) (byte) -1);
        long long62 = dateTimeZone19.getMillisKeepLocal(dateTimeZone44, (long) 33);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((-115199926L), dateTimeZone44);
        java.lang.String str65 = dateTimeZone44.getNameKey((long) 2022);
        boolean boolean66 = property14.equals((java.lang.Object) dateTimeZone44);
        java.lang.String str68 = dateTimeZone44.getNameKey((long) 999);
        long long71 = dateTimeZone44.convertLocalToUTC((long) 2730, false);
        java.util.Locale locale73 = java.util.Locale.ROOT;
        java.util.Locale locale74 = java.util.Locale.US;
        java.lang.String str75 = locale73.getDisplayScript(locale74);
        java.lang.String str76 = dateTimeZone44.getName((long) 35468776, locale74);
        java.util.Locale locale77 = java.util.Locale.ROOT;
        java.util.Locale locale78 = java.util.Locale.US;
        java.lang.String str79 = locale77.getDisplayScript(locale78);
        java.lang.String str80 = locale77.getDisplayLanguage();
        java.lang.String str81 = locale77.getVariant();
        java.lang.String str82 = locale77.toLanguageTag();
        java.lang.String str83 = locale74.getDisplayCountry(locale77);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 09:59:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Property[secondOfMinute]" + "'", str15, "Property[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 59 + "'", int16 == 59);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-115199900L) + "'", long22 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 115200000 + "'", int28 == 115200000);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "999" + "'", str37, "999");
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "de");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+32:00" + "'", str42, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 3600100L + "'", long48 == 3600100L);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 9L + "'", long58 == 9L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-3600001L) + "'", long60 == (-3600001L));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 118800033L + "'", long62 == 118800033L);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 3602730L + "'", long71 == 3602730L);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "-01:00" + "'", str76, "-01:00");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "und" + "'", str82, "und");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "United States" + "'", str83, "United States");
    }

    @Test
    public void test19061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19061");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 29);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusDays(0);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 22);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        int int8 = localDateTime6.compareTo((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withSecondOfMinute(1);
        java.util.Date date13 = localDateTime9.toDate();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withSecondOfMinute(1);
        boolean boolean18 = localDateTime9.equals((java.lang.Object) localDateTime17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime9.era();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField22 = localDateTime20.getField(0);
        boolean boolean23 = localDateTime6.isEqual((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime.Property property24 = localDateTime20.centuryOfEra();
        org.joda.time.Chronology chronology25 = localDateTime20.getChronology();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime20.plus(readableDuration26);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.hourOfDay();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.DateTime dateTime31 = localDateTime28.toDateTime(readableInstant30);
        java.lang.String str32 = dateTime31.toString();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.hourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray37 = localDateTime36.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = localDateTime36.getFieldType(0);
        int int40 = dateTime31.get(dateTimeFieldType39);
        int int41 = localDateTime27.indexOf(dateTimeFieldType39);
        boolean boolean42 = localDateTime5.isSupported(dateTimeFieldType39);
        org.joda.time.DurationFieldType durationFieldType43 = null;
        boolean boolean44 = localDateTime5.isSupported(durationFieldType43);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime3.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Fri Feb 11 09:59:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2022-02-11T09:59:18.363Z" + "'", str32, "2022-02-11T09:59:18.363Z");
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldArray37);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2022 + "'", int40 == 2022);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(localDateTime45);
    }

    @Test
    public void test19062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19062");
        java.util.Locale locale3 = new java.util.Locale("2022-02-11T09:49:50.116", "2022-02-12T17:49:45.474", "2022-02-12T17:50:06.898");
        java.lang.String str4 = locale3.getDisplayScript();
        java.lang.String str5 = locale3.getDisplayName();
        org.junit.Assert.assertEquals(locale3.toString(), "2022-02-11t09:49:50.116_2022-02-12T17:49:45.474_2022-02-12T17:50:06.898");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-11t09:49:50.116 (2022-02-12T17:49:45.474,2022-02-12T17:50:06.898)" + "'", str5, "2022-02-11t09:49:50.116 (2022-02-12T17:49:45.474,2022-02-12T17:50:06.898)");
    }

    @Test
    public void test19063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19063");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withSecondOfMinute(1);
        java.util.Date date7 = localDateTime3.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        boolean boolean12 = localDateTime3.equals((java.lang.Object) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField(0);
        boolean boolean17 = localDateTime0.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.centuryOfEra();
        int int19 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.minusYears((int) 'u');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusHours(35341933);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withYear(767);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusYears(35461900);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = null;
        java.lang.String str29 = localDateTime27.toString(dateTimeFormatter28);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = localDateTime27.getFieldTypes();
        int int31 = localDateTime27.getDayOfYear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Feb 11 09:59:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "35462667-01-01T00:00:00.000" + "'", str29, "35462667-01-01T00:00:00.000");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test19064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19064");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false, (-115199900L));
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone6.nextTransition(0L);
        long long12 = dateTimeZone6.convertLocalToUTC((long) (short) 0, true, (-115199900L));
        long long15 = dateTimeZone6.convertLocalToUTC((long) 9, true);
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (byte) -1);
        java.lang.String str19 = dateTimeZone1.getShortName((long) 49);
        java.lang.String str20 = dateTimeZone1.toString();
        long long22 = dateTimeZone1.nextTransition((long) 33);
        boolean boolean24 = dateTimeZone1.isStandardOffset((-118800000L));
        java.lang.String str25 = dateTimeZone1.getID();
        long long28 = dateTimeZone1.adjustOffset(1644573498193L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600100L + "'", long5 == 3600100L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9L + "'", long15 == 9L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3600001L) + "'", long17 == (-3600001L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-01:00" + "'", str19, "-01:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-01:00" + "'", str20, "-01:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 33L + "'", long22 == 33L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-01:00" + "'", str25, "-01:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1644573498193L + "'", long28 == 1644573498193L);
    }

    @Test
    public void test19065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19065");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        long long6 = dateTimeZone1.previousTransition(0L);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone1);
        long long9 = dateTimeZone1.convertUTCToLocal(43L);
        long long13 = dateTimeZone1.convertLocalToUTC((-76738925L), false, (long) 241);
        int int15 = dateTimeZone1.getStandardOffset((long) 115200000);
        int int17 = dateTimeZone1.getOffsetFromLocal(1644572989623L);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.ReadableInstant readableInstant20 = null;
        long long21 = property19.getDifferenceAsLong(readableInstant20);
        java.util.Locale locale22 = java.util.Locale.US;
        java.lang.String str23 = locale22.getDisplayName();
        int int24 = property19.getMaximumTextLength(locale22);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.hourOfDay();
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.DateTime dateTime28 = localDateTime25.toDateTime(readableInstant27);
        int int29 = property19.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone30.getOffset(readableInstant31);
        long long35 = dateTimeZone30.adjustOffset((long) 0, false);
        java.lang.String str36 = dateTimeZone30.toString();
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.hourOfDay();
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime37.toDateTime(readableInstant39);
        java.lang.String str41 = dateTime40.toString();
        int int42 = dateTimeZone30.getOffset((org.joda.time.ReadableInstant) dateTime40);
        int int43 = property19.compareTo((org.joda.time.ReadableInstant) dateTime40);
        java.util.Locale locale44 = java.util.Locale.US;
        int int45 = property19.getMaximumTextLength(locale44);
        org.joda.time.LocalDateTime localDateTime46 = property19.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime48 = property19.addToCopy(5);
        org.joda.time.LocalDateTime localDateTime49 = property19.withMaximumValue();
        org.joda.time.DateTimeField[] dateTimeFieldArray50 = localDateTime49.getFields();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.withWeekyear(12);
        org.joda.time.LocalDateTime.Property property53 = localDateTime49.dayOfMonth();
        org.joda.time.LocalDateTime.Property property54 = localDateTime49.year();
        java.lang.String str55 = property54.getAsShortText();
        boolean boolean56 = dateTimeZone1.equals((java.lang.Object) property54);
        long long59 = dateTimeZone1.adjustOffset(63780172909075L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 115200043L + "'", long9 == 115200043L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-191938925L) + "'", long13 == (-191938925L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 115200000 + "'", int15 == 115200000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "English (United States)" + "'", str23, "English (United States)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2022-02-11T09:59:18.425Z" + "'", str41, "2022-02-11T09:59:18.425Z");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(dateTimeFieldArray50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "2022" + "'", str55, "2022");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 63780172909075L + "'", long59 == 63780172909075L);
    }

    @Test
    public void test19066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19066");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime6 = property4.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.ReadableInstant readableInstant9 = null;
        long long10 = property8.getDifferenceAsLong(readableInstant9);
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale11.getDisplayName();
        int int13 = property8.getMaximumTextLength(locale11);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.DateTime dateTime17 = localDateTime14.toDateTime(readableInstant16);
        int int18 = property8.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone19.getOffset(readableInstant20);
        long long24 = dateTimeZone19.adjustOffset((long) 0, false);
        java.lang.String str25 = dateTimeZone19.toString();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.hourOfDay();
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.DateTime dateTime29 = localDateTime26.toDateTime(readableInstant28);
        java.lang.String str30 = dateTime29.toString();
        int int31 = dateTimeZone19.getOffset((org.joda.time.ReadableInstant) dateTime29);
        int int32 = property8.compareTo((org.joda.time.ReadableInstant) dateTime29);
        java.util.Locale locale33 = java.util.Locale.US;
        int int34 = property8.getMaximumTextLength(locale33);
        org.joda.time.LocalDateTime localDateTime35 = property8.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime37 = property8.addToCopy(5);
        org.joda.time.LocalDateTime localDateTime38 = property8.withMaximumValue();
        org.joda.time.DateTimeField[] dateTimeFieldArray39 = localDateTime38.getFields();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withWeekyear(12);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.withDurationAdded(readableDuration42, (int) 'u');
        org.joda.time.LocalDateTime localDateTime45 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime47 = localDateTime38.minus(readablePeriod46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withWeekyear(38);
        org.joda.time.DateTimeField[] dateTimeFieldArray50 = localDateTime47.getFields();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English (United States)" + "'", str12, "English (United States)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2022-02-11T09:59:18.445Z" + "'", str30, "2022-02-11T09:59:18.445Z");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldArray39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(dateTimeFieldArray50);
    }

    @Test
    public void test19067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19067");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        java.lang.String str12 = property10.getName();
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Locale locale14 = locale13.stripExtensions();
        int int15 = property10.getMaximumShortTextLength(locale13);
        java.lang.String str16 = property10.getAsText();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone17.getOffset(readableInstant18);
        long long22 = dateTimeZone17.adjustOffset((long) 0, false);
        java.lang.String str23 = dateTimeZone17.toString();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.hourOfDay();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.DateTime dateTime27 = localDateTime24.toDateTime(readableInstant26);
        java.lang.String str28 = dateTime27.toString();
        int int29 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) dateTime27);
        int int30 = property10.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology31 = dateTime27.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(chronology31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.dayOfYear();
        int int34 = localDateTime32.getEra();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 09:59:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "era" + "'", str12, "era");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AD" + "'", str16, "AD");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2022-02-11T09:59:18.474Z" + "'", str28, "2022-02-11T09:59:18.474Z");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test19068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19068");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withSecondOfMinute(1);
        java.util.Date date7 = localDateTime3.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        boolean boolean12 = localDateTime3.equals((java.lang.Object) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField(0);
        boolean boolean17 = localDateTime0.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.centuryOfEra();
        int int19 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.minusYears((int) 'u');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusHours(115200000);
        int int24 = localDateTime21.getYear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Feb 11 09:59:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-116) + "'", int24 == (-116));
    }

    @Test
    public void test19069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19069");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        int int7 = property6.get();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundHalfEvenCopy();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withDurationAdded(readableDuration9, 151);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.hourOfDay();
        java.lang.String str13 = property12.getAsText();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 696);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.secondOfMinute();
        boolean boolean17 = property12.equals((java.lang.Object) property16);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19070");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "era");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.clear();
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale locale9 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder5.setRegion("2022-02-11T09:51:49.177+32:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 2022-02-11T09:51:49.177+32:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test19071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19071");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.writePaddedInteger(writer0, 1644573361702L, 788);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19072");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withSecondOfMinute(1);
        java.util.Date date7 = localDateTime3.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        boolean boolean12 = localDateTime3.equals((java.lang.Object) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField(0);
        boolean boolean17 = localDateTime0.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withSecondOfMinute(1);
        java.util.Date date22 = localDateTime18.toDate();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withSecondOfMinute(1);
        boolean boolean27 = localDateTime18.equals((java.lang.Object) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime18.era();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        org.joda.time.LocalDateTime.Property property32 = localDateTime14.property(dateTimeFieldType31);
        org.joda.time.LocalDateTime localDateTime33 = property32.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusYears(46);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusMonths(227);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Feb 11 09:59:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Feb 11 09:59:19 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
    }

    @Test
    public void test19073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19073");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-11T09:49:28.426Z");
        java.util.TimeZone.setDefault(timeZone1);
        timeZone1.setRawOffset(74);
        boolean boolean5 = timeZone1.observesDaylightTime();
        timeZone1.setRawOffset(13829366);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19074");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfMonth();
        int int13 = localDateTime11.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.secondOfMinute();
        java.lang.String str15 = property14.toString();
        org.joda.time.DurationField durationField16 = property14.getLeapDurationField();
        java.lang.String str17 = property14.toString();
        org.joda.time.LocalDateTime localDateTime19 = property14.addWrapFieldToCopy(62);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        long long22 = dateTimeZone20.nextTransition(0L);
        long long26 = dateTimeZone20.convertLocalToUTC((long) (short) 0, true, (-115199900L));
        boolean boolean27 = dateTimeZone20.isFixed();
        org.joda.time.DateTime dateTime28 = localDateTime19.toDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 22);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        int int33 = localDateTime31.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.hourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withSecondOfMinute(1);
        java.util.Date date38 = localDateTime34.toDate();
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.hourOfDay();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withSecondOfMinute(1);
        boolean boolean43 = localDateTime34.equals((java.lang.Object) localDateTime42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime34.era();
        org.joda.time.LocalDateTime localDateTime45 = property44.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField47 = localDateTime45.getField(0);
        boolean boolean48 = localDateTime31.isEqual((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.LocalDateTime.Property property49 = localDateTime45.centuryOfEra();
        org.joda.time.Chronology chronology50 = localDateTime45.getChronology();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime45.plus(readableDuration51);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.hourOfDay();
        org.joda.time.ReadableInstant readableInstant55 = null;
        org.joda.time.DateTime dateTime56 = localDateTime53.toDateTime(readableInstant55);
        java.lang.String str57 = dateTime56.toString();
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.hourOfDay();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray62 = localDateTime61.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = localDateTime61.getFieldType(0);
        int int65 = dateTime56.get(dateTimeFieldType64);
        int int66 = localDateTime52.indexOf(dateTimeFieldType64);
        boolean boolean67 = localDateTime30.isSupported(dateTimeFieldType64);
        boolean boolean68 = dateTime28.isSupported(dateTimeFieldType64);
        long long69 = dateTime28.getMillis();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 09:59:19 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Property[secondOfMinute]" + "'", str15, "Property[secondOfMinute]");
        org.junit.Assert.assertNull(durationField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Property[secondOfMinute]" + "'", str17, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Fri Feb 11 09:59:19 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTime56);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "2022-02-11T09:59:18.565Z" + "'", str57, "2022-02-11T09:59:18.565Z");
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(dateTimeFieldArray62);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2022 + "'", int65 == 2022);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-62135596798000L) + "'", long69 == (-62135596798000L));
    }

    @Test
    public void test19075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19075");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "ja_JP", "ja_JP", "hi!", "ja_JP" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList8);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream11 = languageRangeList1.stream();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap12);
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleKeys();
        java.lang.String str16 = java.util.Locale.lookupTag(languageRangeList13, (java.util.Collection<java.lang.String>) strSet15);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream17 = languageRangeList13.stream();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream18 = languageRangeList13.parallelStream();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList13, strMap19);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(languageRangeStream11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(languageRangeStream17);
        org.junit.Assert.assertNotNull(languageRangeStream18);
        org.junit.Assert.assertNotNull(languageRangeList20);
    }

    @Test
    public void test19076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19076");
        java.lang.String[] strArray12 = new java.lang.String[] { "2022-02-11T09:49:25.989Z", "java.io.IOException", "2022-02-11T09:49:26.788Z", "2022-02-11T09:49:27.064Z", "999", "1", "-01:00", "hi!", "", "Property[hourOfDay]", "Coordinated Universal Time", "ja_JP" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        boolean boolean16 = strSet13.add("2022-02-11T09:49:24.878Z");
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList21, strMap22);
        boolean boolean24 = strSet13.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21);
        org.joda.time.tz.Provider provider25 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone27 = provider25.getZone("2022-02-11T09:49:32.374Z");
        java.util.Set<java.lang.String> strSet28 = provider25.getAvailableIDs();
        java.lang.Object[] objArray29 = strSet28.toArray();
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.lang.String[] strArray37 = new java.lang.String[] { "ja_JP", "ja_JP", "hi!", "ja_JP" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.lang.String str40 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList38);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream41 = languageRangeList31.stream();
        boolean boolean42 = strSet28.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31);
        java.util.Set<java.lang.String> strSet43 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale.LanguageRange[] languageRangeArray44 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList45 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList45, languageRangeArray44);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList45, strMap47);
        boolean boolean49 = strSet43.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48);
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now();
        int int52 = localDateTime50.compareTo((org.joda.time.ReadablePartial) localDateTime51);
        int int53 = localDateTime50.getYearOfEra();
        java.lang.String str54 = localDateTime50.toString();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long59 = dateTimeZone56.convertLocalToUTC((long) (byte) 100, false);
        long long61 = dateTimeZone56.previousTransition(0L);
        org.joda.time.DateTime dateTime62 = localDateTime50.toDateTime(dateTimeZone56);
        java.lang.String str63 = dateTime62.toString();
        org.joda.time.LocalDateTime localDateTime64 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.hourOfDay();
        org.joda.time.ReadableInstant readableInstant66 = null;
        long long67 = property65.getDifferenceAsLong(readableInstant66);
        java.util.Locale locale68 = java.util.Locale.US;
        java.lang.String str69 = locale68.getDisplayName();
        int int70 = property65.getMaximumTextLength(locale68);
        org.joda.time.LocalDateTime localDateTime71 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property72 = localDateTime71.hourOfDay();
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.DateTime dateTime74 = localDateTime71.toDateTime(readableInstant73);
        int int75 = property65.compareTo((org.joda.time.ReadableInstant) dateTime74);
        int int76 = dateTime62.compareTo((org.joda.time.ReadableInstant) dateTime74);
        boolean boolean77 = strSet43.remove((java.lang.Object) int76);
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strSet43);
        java.util.TimeZone timeZone80 = java.util.TimeZone.getTimeZone("en-us_HI!");
        java.lang.String str81 = timeZone80.getID();
        boolean boolean82 = strSet43.contains((java.lang.Object) str81);
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags(languageRangeList21, (java.util.Collection<java.lang.String>) strSet43);
        int int84 = strSet43.size();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(provider25);
        org.junit.Assert.assertNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(languageRangeStream41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(languageRangeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2022 + "'", int53 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2022-02-11T09:59:18.669" + "'", str54, "2022-02-11T09:59:18.669");
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-115199900L) + "'", long59 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(dateTime62);
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "2022-02-11T09:59:18.669+32:00" + "'", str63, "2022-02-11T09:59:18.669+32:00");
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "English (United States)" + "'", str69, "English (United States)");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(timeZone80);
        org.junit.Assert.assertEquals(timeZone80.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "GMT" + "'", str81, "GMT");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test19077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19077");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        int int9 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.monthOfYear();
        int int11 = property10.getMinimumValueOverall();
        java.lang.String str12 = property10.getAsShortText();
        org.joda.time.LocalDateTime localDateTime13 = property10.roundHalfCeilingCopy();
        boolean boolean14 = localDateTime5.isAfter((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMillisOfDay(35486688);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withWeekOfWeekyear((-20));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -20 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feb" + "'", str12, "Feb");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test19078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19078");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.lang.String[] strArray10 = new java.lang.String[] { "era", "en-US", "en-US", "UTC", "Coordinated Universal Time", "java.io.IOException", "Coordinated Universal Time", "hi!", "2022-02-11T09:49:24.878Z" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        boolean boolean13 = strSet11.isEmpty();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.util.Locale locale15 = java.util.Locale.US;
        java.lang.String str16 = locale14.getDisplayScript(locale15);
        java.util.Locale locale17 = java.util.Locale.JAPAN;
        java.lang.String str18 = locale15.getDisplayScript(locale17);
        boolean boolean19 = strSet11.equals((java.lang.Object) locale17);
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale21 = java.util.Locale.ROOT;
        java.util.Locale locale22 = java.util.Locale.US;
        java.lang.String str23 = locale21.getDisplayScript(locale22);
        java.util.Locale locale24 = java.util.Locale.JAPAN;
        java.lang.String str25 = locale22.getDisplayScript(locale24);
        java.lang.String str26 = locale24.toLanguageTag();
        java.lang.String str27 = locale20.getDisplayScript(locale24);
        java.lang.String str28 = locale20.getVariant();
        java.lang.String str29 = locale17.getDisplayCountry(locale20);
        java.lang.String str32 = nameProvider0.getShortName(locale17, "2022-02-11T09:49:27.737+32:00", "2022-02-11T09:49:36.798");
        java.util.Locale locale36 = new java.util.Locale("\u82f1\u6587", "Coordinated Universal Time", "2022-02-11T09:49:32.430Z");
        java.lang.String str39 = nameProvider0.getShortName(locale36, "2022-02-11T09:49:32.375Z", "2022-02-11T09:49:32.296Z");
        java.util.Locale locale40 = null;
        java.lang.String str43 = nameProvider0.getName(locale40, "2022-02-12T17:49:47.427+32:00", "2022-02-11T09:49:50.116");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.hourOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withSecondOfMinute(1);
        java.util.Locale locale49 = java.util.Locale.US;
        boolean boolean50 = localDateTime48.equals((java.lang.Object) locale49);
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.hourOfDay();
        org.joda.time.ReadableInstant readableInstant53 = null;
        long long54 = property52.getDifferenceAsLong(readableInstant53);
        java.util.Locale locale55 = java.util.Locale.US;
        java.lang.String str56 = locale55.getDisplayName();
        int int57 = property52.getMaximumTextLength(locale55);
        java.lang.String str58 = locale49.getDisplayVariant(locale55);
        java.lang.String str61 = nameProvider0.getName(locale49, "2022-02-11T09:50:44.947Z", "");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.tz.NameProvider nameProvider66 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '4');
        java.util.Locale locale71 = java.util.Locale.getDefault();
        java.util.Locale locale72 = locale71.stripExtensions();
        java.lang.String str73 = dateTimeZone69.getName(10L, locale71);
        java.util.Locale locale74 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str75 = locale71.getDisplayLanguage(locale74);
        java.lang.String str76 = locale71.getDisplayScript();
        java.lang.String str79 = nameProvider66.getShortName(locale71, "2022-02-11T09:51:16.466Z", "java.io.IOException: 2022-02-11T09:49:36.327");
        java.lang.String str82 = nameProvider0.getName(locale71, "2022-02-12T17:57:17.323", "2022-02-11T09:56:57.643Z");
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ja-JP" + "'", str26, "ja-JP");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u65e5\u672c" + "'", str29, "\u65e5\u672c");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals(locale36.toString(), "\u82f1\u6587_COORDINATED UNIVERSAL TIME_2022-02-11T09:49:32.430Z");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "English (United States)" + "'", str56, "English (United States)");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(nameProvider66);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "+00:52" + "'", str73, "+00:52");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test19079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19079");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.time.ZoneId zoneId2 = timeZone0.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone(zoneId2);
        int int5 = timeZone4.getRawOffset();
        timeZone4.setRawOffset(0);
        java.time.ZoneId zoneId8 = timeZone4.toZoneId();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone(zoneId8);
        java.util.TimeZone.setDefault(timeZone9);
        int int11 = timeZone9.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test19080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19080");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.minusYears((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.minus(readableDuration4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withTime(38701652, 2044, 33259991, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38701652 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test19081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19081");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfMonth();
        java.lang.String str13 = property12.getAsShortText();
        boolean boolean14 = property12.isLeap();
        org.joda.time.LocalDateTime localDateTime15 = property12.withMaximumValue();
        org.joda.time.DurationField durationField16 = property12.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.hourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withSecondOfMinute(1);
        java.util.Date date21 = localDateTime17.toDate();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.hourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withSecondOfMinute(1);
        boolean boolean26 = localDateTime17.equals((java.lang.Object) localDateTime25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime17.era();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfMonth();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.year();
        java.util.Locale locale31 = java.util.Locale.UK;
        java.lang.String str33 = locale31.getExtension('a');
        int int34 = property30.getMaximumShortTextLength(locale31);
        java.lang.String str35 = locale31.getISO3Language();
        int int36 = property12.getMaximumTextLength(locale31);
        org.joda.time.DateTimeField dateTimeField37 = property12.getField();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 09:59:18 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Fri Feb 11 09:59:18 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_GB");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "eng" + "'", str35, "eng");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test19082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19082");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        int int9 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.monthOfYear();
        int int11 = property10.getMinimumValueOverall();
        java.lang.String str12 = property10.getAsShortText();
        org.joda.time.LocalDateTime localDateTime13 = property10.roundHalfCeilingCopy();
        boolean boolean14 = localDateTime5.isAfter((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime5.withPeriodAdded(readablePeriod15, 454);
        int int18 = localDateTime17.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.year();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.hourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withSecondOfMinute(1);
        java.util.Date date24 = localDateTime20.toDate();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.hourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withSecondOfMinute(1);
        boolean boolean29 = localDateTime20.equals((java.lang.Object) localDateTime28);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.hourOfDay();
        org.joda.time.ReadableInstant readableInstant32 = null;
        long long33 = property31.getDifferenceAsLong(readableInstant32);
        java.util.Locale locale34 = java.util.Locale.US;
        java.lang.String str35 = locale34.getDisplayName();
        int int36 = property31.getMaximumTextLength(locale34);
        org.joda.time.LocalDateTime localDateTime37 = property31.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property31.getFieldType();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime20.withField(dateTimeFieldType38, (int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusMinutes(39008921);
        boolean boolean43 = localDateTime17.isEqual((org.joda.time.ReadablePartial) localDateTime42);
        int int44 = localDateTime17.getYear();
        org.joda.time.DateTimeField[] dateTimeFieldArray45 = localDateTime17.getFields();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feb" + "'", str12, "Feb");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Fri Feb 11 09:59:18 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "English (United States)" + "'", str35, "English (United States)");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2022 + "'", int44 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldArray45);
    }

    @Test
    public void test19083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19083");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime3.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '4');
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = dateTimeZone9.getName(10L, locale11);
        org.joda.time.DateTime dateTime14 = localDateTime3.toDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long19 = dateTimeZone16.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        int int22 = localDateTime20.compareTo((org.joda.time.ReadablePartial) localDateTime21);
        int int23 = localDateTime20.getYearOfEra();
        java.lang.String str24 = localDateTime20.toString();
        boolean boolean25 = dateTimeZone16.equals((java.lang.Object) localDateTime20);
        boolean boolean26 = dateTime14.equals((java.lang.Object) localDateTime20);
        org.joda.time.LocalDateTime.Property property27 = localDateTime20.year();
        org.joda.time.LocalDateTime.Property property28 = localDateTime20.weekOfWeekyear();
        int int29 = property28.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:52" + "'", str13, "+00:52");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115199900L) + "'", long19 == (-115199900L));
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022-02-11T09:59:18.837" + "'", str24, "2022-02-11T09:59:18.837");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test19084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19084");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setRawOffset(1);
        timeZone0.setRawOffset(35457723);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test19085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19085");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.writeUnpaddedInteger(writer0, 115200246L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19086");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        int int6 = localDateTime5.getYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withSecondOfMinute(1);
        java.util.Date date15 = localDateTime11.toDate();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withSecondOfMinute(1);
        boolean boolean20 = localDateTime11.equals((java.lang.Object) localDateTime19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime11.era();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property23.getFieldType();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime5.withField(dateTimeFieldType24, 10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withDayOfYear(49);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.hourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withSecondOfMinute(1);
        java.util.Date date34 = localDateTime30.toDate();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.hourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withSecondOfMinute(1);
        boolean boolean39 = localDateTime30.equals((java.lang.Object) localDateTime38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime30.era();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime30.withMillisOfSecond((int) 'x');
        org.joda.time.DateTime dateTime43 = localDateTime30.toDateTime();
        int int44 = localDateTime30.getYear();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime26.withFields((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.LocalDateTime.Property property46 = localDateTime26.secondOfMinute();
        org.joda.time.LocalDateTime.Property property47 = localDateTime26.monthOfYear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Feb 11 09:59:18 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Fri Feb 11 09:59:18 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2022 + "'", int44 == 2022);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(property47);
    }

    @Test
    public void test19087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        long long6 = dateTimeZone1.previousTransition(0L);
        java.lang.String str8 = dateTimeZone1.getNameKey((long) 10);
        int int10 = dateTimeZone1.getOffsetFromLocal((long) 12);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (short) -1, chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy((long) (byte) 0);
        java.lang.String str19 = property16.getAsShortText();
        org.joda.time.LocalDateTime localDateTime21 = property16.addToCopy(2022);
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        int int23 = property16.getMaximumShortTextLength(locale22);
        java.lang.String str24 = dateTimeZone1.getName((long) (byte) 10, locale22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 882, dateTimeZone26);
        long long30 = dateTimeZone1.getMillisKeepLocal(dateTimeZone26, 9L);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long36 = dateTimeZone33.convertLocalToUTC((long) (byte) 100, false);
        long long38 = dateTimeZone33.previousTransition(0L);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withMinuteOfHour(9);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plus(readableDuration42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusYears(151);
        boolean boolean46 = localDateTime31.isBefore((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime31.era();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "999" + "'", str19, "999");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+32:00" + "'", str24, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 115200009L + "'", long30 == 115200009L);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-115199900L) + "'", long36 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(property47);
    }

    @Test
    public void test19088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19088");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withSecondOfMinute(1);
        java.util.Date date7 = localDateTime3.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        boolean boolean12 = localDateTime3.equals((java.lang.Object) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField(0);
        boolean boolean17 = localDateTime0.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withSecondOfMinute(1);
        java.util.Date date22 = localDateTime18.toDate();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withSecondOfMinute(1);
        boolean boolean27 = localDateTime18.equals((java.lang.Object) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime18.era();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        org.joda.time.LocalDateTime.Property property32 = localDateTime14.property(dateTimeFieldType31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime14.plusYears((int) '4');
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.weekyear();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.plusMinutes(35341847);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusYears(36);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withYearOfCentury(5);
        int int42 = localDateTime41.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.minusHours(3032844);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Feb 11 09:59:18 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Fri Feb 11 09:59:18 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(localDateTime44);
    }

    @Test
    public void test19089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19089");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        java.lang.String str7 = dateTimeZone1.getShortName(0L, locale6);
        int int9 = dateTimeZone1.getOffset((-115199021L));
        boolean boolean11 = dateTimeZone1.isStandardOffset((long) 38656016);
        long long15 = dateTimeZone1.convertLocalToUTC((long) 493, false, 3039916L);
        boolean boolean16 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-115199507L) + "'", long15 == (-115199507L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test19090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19090");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "era");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.clear();
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Category category11 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale12 = java.util.Locale.getDefault(category11);
        java.util.Locale locale13 = java.util.Locale.getDefault(category11);
        java.util.Locale.Builder builder14 = builder10.setLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder14.removeUnicodeLocaleAttribute("2022-02-11T09:53:55.360Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-11T09:53:55.360Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + category11 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category11.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test19091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19091");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '4');
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = dateTimeZone2.getName(10L, locale4);
        boolean boolean7 = locale4.hasExtensions();
        java.util.Set<java.lang.String> strSet8 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        java.lang.String[] strArray19 = new java.lang.String[] { "ja_JP", "ja_JP", "hi!", "ja_JP" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.lang.String str22 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList13, (java.util.Collection<java.lang.String>) strList20);
        java.util.Locale.FilteringMode filteringMode23 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList20, filteringMode23);
        boolean boolean25 = strSet8.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10);
        int int26 = strSet8.size();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        timeZone27.setRawOffset(100);
        java.lang.String str30 = timeZone27.getID();
        timeZone27.setID("+00:52");
        int int34 = timeZone27.getOffset((long) 'u');
        java.lang.String str35 = timeZone27.getID();
        timeZone27.setID("2022-02-11T09:49:32.430Z");
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        timeZone38.setRawOffset(1);
        java.util.TimeZone timeZone41 = java.util.TimeZone.getDefault();
        boolean boolean42 = timeZone41.observesDaylightTime();
        boolean boolean43 = timeZone38.hasSameRules(timeZone41);
        int int45 = timeZone41.getOffset((long) 270);
        java.util.TimeZone timeZone46 = java.util.TimeZone.getDefault();
        boolean boolean47 = timeZone46.observesDaylightTime();
        boolean boolean48 = timeZone41.hasSameRules(timeZone46);
        boolean boolean49 = timeZone27.hasSameRules(timeZone46);
        java.util.TimeZone timeZone50 = java.util.TimeZone.getDefault();
        timeZone50.setRawOffset(1);
        java.util.TimeZone timeZone53 = java.util.TimeZone.getDefault();
        boolean boolean54 = timeZone53.observesDaylightTime();
        boolean boolean55 = timeZone50.hasSameRules(timeZone53);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        boolean boolean57 = timeZone46.hasSameRules(timeZone53);
        boolean boolean58 = timeZone53.observesDaylightTime();
        java.util.TimeZone timeZone59 = java.util.TimeZone.getDefault();
        timeZone59.setRawOffset(1);
        boolean boolean62 = timeZone53.hasSameRules(timeZone59);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        boolean boolean64 = strSet8.contains((java.lang.Object) timeZone53);
        java.time.ZoneId zoneId65 = timeZone53.toZoneId();
        int int66 = timeZone53.getRawOffset();
        timeZone53.setRawOffset(35401359);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:52" + "'", str6, "+00:52");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(languageRangeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + filteringMode23 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode23.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "GMT" + "'", str30, "GMT");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:52" + "'", str35, "+00:52");
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone53);
        org.junit.Assert.assertEquals(timeZone53.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(timeZone59);
        org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(zoneId65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test19092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19092");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray4 = localDateTime3.getFields();
        int int5 = localDateTime3.getWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withCenturyOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime11.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime7.property(dateTimeFieldType13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime7.withDayOfYear(151);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekyear((int) '4');
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test19093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19093");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime3.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '4');
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = dateTimeZone9.getName(10L, locale11);
        org.joda.time.DateTime dateTime14 = localDateTime3.toDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        java.util.TimeZone timeZone16 = dateTimeZone9.toTimeZone();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone9);
        java.util.TimeZone timeZone18 = dateTimeZone9.toTimeZone();
        java.lang.String str19 = timeZone18.getID();
        java.util.TimeZone.setDefault(timeZone18);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:52" + "'", str13, "+00:52");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+00:52");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:52");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GMT+00:52" + "'", str19, "GMT+00:52");
    }

    @Test
    public void test19094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19094");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setLanguage("Wed");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long10 = dateTimeZone6.convertLocalToUTC((long) (byte) 100, false, (-115199900L));
        java.util.Locale locale12 = java.util.Locale.ROOT;
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale12.getDisplayScript(locale13);
        boolean boolean15 = locale13.hasExtensions();
        java.lang.String str16 = dateTimeZone6.getShortName(63780169765442L, locale13);
        java.lang.String str17 = dateTimeZone6.toString();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long22 = dateTimeZone19.convertLocalToUTC((long) (byte) 100, false);
        long long24 = dateTimeZone19.previousTransition(0L);
        long long26 = dateTimeZone6.getMillisKeepLocal(dateTimeZone19, (long) 10);
        java.util.Locale.Category category28 = java.util.Locale.Category.DISPLAY;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) (short) -1, chronology30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.minuteOfHour();
        java.util.Locale locale33 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale34 = java.util.Locale.ROOT;
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = locale34.getDisplayScript(locale35);
        java.util.Locale locale37 = java.util.Locale.JAPAN;
        java.lang.String str38 = locale35.getDisplayScript(locale37);
        java.lang.String str39 = locale37.toLanguageTag();
        java.lang.String str40 = locale33.getDisplayScript(locale37);
        int int41 = property32.getMaximumShortTextLength(locale37);
        java.util.Locale.setDefault(category28, locale37);
        java.util.Locale locale43 = java.util.Locale.getDefault(category28);
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.util.Locale locale45 = locale44.stripExtensions();
        java.util.Locale locale46 = java.util.Locale.ROOT;
        java.lang.String str47 = locale44.getDisplayScript(locale46);
        java.lang.String str48 = locale46.getCountry();
        java.util.Locale.setDefault(category28, locale46);
        java.util.Locale locale50 = locale46.stripExtensions();
        java.lang.String str51 = dateTimeZone19.getShortName(35461900L, locale50);
        java.util.Locale.Builder builder52 = builder3.setLocale(locale50);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder54 = builder3.removeUnicodeLocaleAttribute("2022-02-11T09:49:36.787");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-11T09:49:36.787 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600100L + "'", long10 == 3600100L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:00" + "'", str16, "-01:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-01:00" + "'", str17, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-115199900L) + "'", long22 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-118799990L) + "'", long26 == (-118799990L));
        org.junit.Assert.assertTrue("'" + category28 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category28.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ja-JP" + "'", str39, "ja-JP");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+32:00" + "'", str51, "+32:00");
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test19095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19095");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.lang.String str6 = locale1.getExtension('a');
        java.lang.String str7 = locale1.getISO3Language();
        java.lang.String str8 = locale1.toLanguageTag();
        java.lang.String str10 = locale1.getExtension('x');
        java.util.Set<java.lang.String> strSet11 = locale1.getUnicodeLocaleAttributes();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDateTime15.getFields();
        int int17 = localDateTime15.getWeekyear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        int[] intArray20 = localDateTime19.getValues();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withCenturyOfEra(2);
        int int23 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        int int24 = localDateTime15.getYear();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime15.withMinuteOfHour((int) '#');
        boolean boolean27 = strSet11.contains((java.lang.Object) localDateTime26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long32 = dateTimeZone29.convertLocalToUTC((long) (byte) 100, false);
        long long34 = dateTimeZone29.previousTransition(0L);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone29);
        int int36 = localDateTime35.getWeekOfWeekyear();
        boolean boolean37 = strSet11.contains((java.lang.Object) localDateTime35);
        org.joda.time.LocalDateTime.Property property38 = localDateTime35.hourOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.plusDays(200);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = null;
        java.lang.String str42 = localDateTime35.toString(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eng" + "'", str7, "eng");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en-US" + "'", str8, "en-US");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(intArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[2022, 2, 11, 35959113]");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-115199900L) + "'", long32 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2022-02-12T17:59:19.113" + "'", str42, "2022-02-12T17:59:19.113");
    }

    @Test
    public void test19096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19096");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = property1.getField();
        java.lang.String str3 = property1.getAsText();
        org.joda.time.LocalDateTime localDateTime4 = property1.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusHours(94);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minus(readablePeriod7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withSecondOfMinute(436);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 436 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeField2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9" + "'", str3, "9");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test19097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19097");
        java.util.Locale locale1 = new java.util.Locale("2022-02-12T17:52:45.823+32:00");
        org.junit.Assert.assertEquals(locale1.toString(), "2022-02-12t17:52:45.823+32:00");
    }

    @Test
    public void test19098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19098");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        int int6 = localDateTime5.getYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readablePeriod7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        long long14 = dateTimeZone9.adjustOffset((long) 0, false);
        java.lang.String str15 = dateTimeZone9.toString();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime16.toDateTime(readableInstant18);
        java.lang.String str20 = dateTime19.toString();
        int int21 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Instant instant22 = dateTime19.toInstant();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withEra((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = localDateTime26.getFieldType(1);
        boolean boolean31 = instant22.isSupported(dateTimeFieldType30);
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.hourOfDay();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = localDateTime35.getFieldType((int) (short) 1);
        int int38 = instant22.get(dateTimeFieldType37);
        org.joda.time.Chronology chronology39 = instant22.getChronology();
        org.joda.time.DateTime dateTime40 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) instant22);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime8.minus(readablePeriod41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime8.millisOfDay();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime45 = property43.withMaximumValue();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022-02-11T09:59:19.151Z" + "'", str20, "2022-02-11T09:59:19.151Z");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime45);
    }

    @Test
    public void test19099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19099");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(115200000, 4, 2, 12, (int) (byte) 1, (int) (byte) 0, 3);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property9.getDifferenceAsLong(readableInstant10);
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.getDisplayName();
        int int14 = property9.getMaximumTextLength(locale12);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.hourOfDay();
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.DateTime dateTime18 = localDateTime15.toDateTime(readableInstant17);
        int int19 = property9.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone20.getOffset(readableInstant21);
        long long25 = dateTimeZone20.adjustOffset((long) 0, false);
        java.lang.String str26 = dateTimeZone20.toString();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.hourOfDay();
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.DateTime dateTime30 = localDateTime27.toDateTime(readableInstant29);
        java.lang.String str31 = dateTime30.toString();
        int int32 = dateTimeZone20.getOffset((org.joda.time.ReadableInstant) dateTime30);
        int int33 = property9.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime30.getZone();
        long long36 = dateTimeZone34.nextTransition((long) 43);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.hourOfDay();
        org.joda.time.ReadableInstant readableInstant39 = null;
        long long40 = property38.getDifferenceAsLong(readableInstant39);
        java.util.Locale locale41 = java.util.Locale.US;
        java.lang.String str42 = locale41.getDisplayName();
        int int43 = property38.getMaximumTextLength(locale41);
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.hourOfDay();
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.DateTime dateTime47 = localDateTime44.toDateTime(readableInstant46);
        int int48 = property38.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant50 = null;
        int int51 = dateTimeZone49.getOffset(readableInstant50);
        long long54 = dateTimeZone49.adjustOffset((long) 0, false);
        java.lang.String str55 = dateTimeZone49.toString();
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.hourOfDay();
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.DateTime dateTime59 = localDateTime56.toDateTime(readableInstant58);
        java.lang.String str60 = dateTime59.toString();
        int int61 = dateTimeZone49.getOffset((org.joda.time.ReadableInstant) dateTime59);
        int int62 = property38.compareTo((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.hourOfDay();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.withEra((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = localDateTime66.getFieldType(1);
        boolean boolean71 = dateTime59.isSupported(dateTimeFieldType70);
        int int72 = dateTimeZone34.getOffset((org.joda.time.ReadableInstant) dateTime59);
        java.lang.String str73 = dateTime59.toString();
        org.joda.time.DateTime dateTime74 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime7.withCenturyOfEra((int) '4');
        org.joda.time.LocalDateTime.Property property77 = localDateTime7.monthOfYear();
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "English (United States)" + "'", str13, "English (United States)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2022-02-11T09:59:19.172Z" + "'", str31, "2022-02-11T09:59:19.172Z");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 43L + "'", long36 == 43L);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "English (United States)" + "'", str42, "English (United States)");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "UTC" + "'", str55, "UTC");
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTime59);
// flaky:         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "2022-02-11T09:59:19.172Z" + "'", str60, "2022-02-11T09:59:19.172Z");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "2022-02-11T09:59:19.172Z" + "'", str73, "2022-02-11T09:59:19.172Z");
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(property77);
    }

    @Test
    public void test19100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19100");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.minusMillis((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYearOfEra(46);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDateTime13.getValue(411);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 411");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 09:59:19 GMT+00:52 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test19101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19101");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("eng");
        java.util.Locale locale3 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("java.io.IOException: n. Chr.");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: java.io.IOException: n. Chr. [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "eng");
    }

    @Test
    public void test19102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19102");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setRawOffset(100);
        java.lang.String str3 = timeZone0.getID();
        timeZone0.setID("+00:52");
        int int7 = timeZone0.getOffset((long) 'u');
        java.lang.String str8 = timeZone0.getID();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        timeZone9.setRawOffset(1);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        boolean boolean13 = timeZone12.observesDaylightTime();
        boolean boolean14 = timeZone9.hasSameRules(timeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        boolean boolean16 = timeZone0.hasSameRules(timeZone9);
        java.lang.String str17 = timeZone0.getID();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = timeZone0.getDisplayName(false, 4042);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 4042");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT+00:52" + "'", str3, "GMT+00:52");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:52" + "'", str8, "+00:52");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:52");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:52");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:52" + "'", str17, "+00:52");
    }

    @Test
    public void test19103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19103");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 10);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusYears(2022);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.year();
        java.util.Locale.Category category5 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.lang.String str7 = locale6.getCountry();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str9 = locale6.getDisplayCountry(locale8);
        java.lang.String str10 = property4.getAsText(locale8);
        org.joda.time.LocalDateTime localDateTime11 = property4.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.ReadableInstant readableInstant14 = null;
        long long15 = property13.getDifferenceAsLong(readableInstant14);
        java.util.Locale locale16 = java.util.Locale.US;
        java.lang.String str17 = locale16.getDisplayName();
        int int18 = property13.getMaximumTextLength(locale16);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.hourOfDay();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime19.toDateTime(readableInstant21);
        int int23 = property13.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone24.getOffset(readableInstant25);
        long long29 = dateTimeZone24.adjustOffset((long) 0, false);
        java.lang.String str30 = dateTimeZone24.toString();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localDateTime31.toDateTime(readableInstant33);
        java.lang.String str35 = dateTime34.toString();
        int int36 = dateTimeZone24.getOffset((org.joda.time.ReadableInstant) dateTime34);
        int int37 = property13.compareTo((org.joda.time.ReadableInstant) dateTime34);
        java.util.Locale locale38 = java.util.Locale.US;
        int int39 = property13.getMaximumTextLength(locale38);
        org.joda.time.LocalDateTime localDateTime40 = property13.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime42 = property13.addToCopy(5);
        java.util.Date date43 = localDateTime42.toDate();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.minus(readableDuration44);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime11.withYear(11);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        int int51 = localDateTime49.compareTo((org.joda.time.ReadablePartial) localDateTime50);
        int int52 = localDateTime49.getYearOfEra();
        java.lang.String str53 = localDateTime49.toString();
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime49.plus(readablePeriod54);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime49.minus(readablePeriod56);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime48.withFields((org.joda.time.ReadablePartial) localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category5.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-52" + "'", str10, "-52");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "English (United States)" + "'", str17, "English (United States)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2022-02-11T09:59:19.228Z" + "'", str35, "2022-02-11T09:59:19.228Z");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Fri Feb 11 14:59:19 GMT+00:52 2022");
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2022 + "'", int52 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "2022-02-11T09:59:19.228" + "'", str53, "2022-02-11T09:59:19.228");
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime58);
    }

    @Test
    public void test19104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19104");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone6.nextTransition(0L);
        long long12 = dateTimeZone6.convertLocalToUTC((long) (short) 0, true, (-115199900L));
        long long15 = dateTimeZone6.convertLocalToUTC((long) 9, true);
        long long17 = dateTimeZone6.convertUTCToLocal((-3600001L));
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 74);
        boolean boolean21 = dateTimeZone6.isStandardOffset(1075903729L);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        int int24 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.monthOfYear();
        int int26 = property25.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime28 = property25.addToCopy(9);
        org.joda.time.LocalDateTime localDateTime29 = property25.roundHalfCeilingCopy();
        int int30 = property25.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withSecondOfMinute(1);
        java.util.Date date35 = localDateTime31.toDate();
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.hourOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withSecondOfMinute(1);
        boolean boolean40 = localDateTime31.equals((java.lang.Object) localDateTime39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime31.era();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime43 = localDateTime42.toDateTime();
        int int44 = property25.getDifference((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.LocalDateTime localDateTime45 = property25.roundCeilingCopy();
        boolean boolean46 = dateTimeZone6.equals((java.lang.Object) localDateTime45);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.plusSeconds(38773250);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9L + "'", long15 == 9L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3600001L) + "'", long17 == (-3600001L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115200074L + "'", long19 == 115200074L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(date35);
// flaky:         org.junit.Assert.assertEquals(date35.toString(), "Fri Feb 11 09:59:19 GMT+00:52 2022");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 24253 + "'", int44 == 24253);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(localDateTime48);
    }

    @Test
    public void test19105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19105");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Locale locale4 = java.util.Locale.US;
        boolean boolean5 = localDateTime3.equals((java.lang.Object) locale4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        org.joda.time.ReadableInstant readableInstant8 = null;
        long long9 = property7.getDifferenceAsLong(readableInstant8);
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = locale10.getDisplayName();
        int int12 = property7.getMaximumTextLength(locale10);
        java.lang.String str13 = locale4.getDisplayVariant(locale10);
        java.util.Locale locale14 = locale4.stripExtensions();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusYears(2022);
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 100, false);
        long long26 = dateTimeZone21.previousTransition(0L);
        java.lang.String str28 = dateTimeZone21.getNameKey((long) 10);
        int int30 = dateTimeZone21.getOffsetFromLocal((long) 12);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (short) -1, chronology33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.minuteOfHour();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = property36.addToCopy((long) (byte) 0);
        java.lang.String str39 = property36.getAsShortText();
        org.joda.time.LocalDateTime localDateTime41 = property36.addToCopy(2022);
        java.util.Locale locale42 = java.util.Locale.GERMAN;
        int int43 = property36.getMaximumShortTextLength(locale42);
        java.lang.String str44 = dateTimeZone21.getName((long) (byte) 10, locale42);
        java.util.Locale.setDefault(locale42);
        java.util.Set<java.lang.Character> charSet46 = locale42.getExtensionKeys();
        java.lang.String str47 = property19.getAsText(locale42);
        java.lang.String str48 = locale42.getDisplayCountry();
        java.lang.String str49 = locale4.getDisplayName(locale42);
        java.lang.String str50 = locale42.getISO3Country();
        java.lang.String str51 = locale42.getDisplayVariant();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English (United States)" + "'", str11, "English (United States)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-115199900L) + "'", long24 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 115200000 + "'", int30 == 115200000);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "999" + "'", str39, "999");
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "de");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+32:00" + "'", str44, "+32:00");
        org.junit.Assert.assertNotNull(charSet46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0" + "'", str47, "0");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str49, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test19106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19106");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        java.lang.String str12 = property10.getAsText();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone13.getOffset(readableInstant14);
        long long18 = dateTimeZone13.adjustOffset((long) 0, false);
        java.lang.String str19 = dateTimeZone13.toString();
        boolean boolean21 = dateTimeZone13.isStandardOffset((long) 49);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.lang.String str24 = dateTimeZone13.getShortName((long) ' ', locale23);
        java.lang.String str25 = property10.getAsText(locale23);
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.util.Locale locale27 = java.util.Locale.US;
        java.lang.String str28 = locale26.getDisplayScript(locale27);
        java.util.Locale locale29 = java.util.Locale.JAPAN;
        java.lang.String str30 = locale27.getDisplayScript(locale29);
        java.lang.String str32 = locale27.getExtension('a');
        java.lang.String str33 = locale27.getScript();
        java.lang.String str34 = locale23.getDisplayName(locale27);
        java.util.Locale locale35 = java.util.Locale.ROOT;
        java.util.Locale locale36 = java.util.Locale.US;
        java.lang.String str37 = locale35.getDisplayScript(locale36);
        java.util.Locale locale38 = java.util.Locale.JAPAN;
        java.lang.String str39 = locale36.getDisplayScript(locale38);
        java.lang.String str41 = locale36.getExtension('a');
        java.lang.String str42 = locale36.getISO3Language();
        java.lang.String str43 = locale36.toLanguageTag();
        java.lang.String str45 = locale36.getExtension('x');
        java.lang.String str46 = locale36.getISO3Country();
        java.util.Locale locale47 = java.util.Locale.getDefault();
        java.util.Locale locale48 = locale47.stripExtensions();
        java.util.Set<java.lang.Character> charSet49 = locale48.getExtensionKeys();
        java.util.Locale locale50 = locale48.stripExtensions();
        java.lang.String str51 = locale36.getDisplayScript(locale48);
        java.util.Set<java.lang.Character> charSet52 = locale48.getExtensionKeys();
        java.lang.String str53 = locale48.getVariant();
        java.util.Locale locale54 = java.util.Locale.ITALY;
        java.util.Locale locale56 = new java.util.Locale("");
        java.lang.String str57 = locale54.getDisplayName(locale56);
        java.util.Locale locale58 = locale56.stripExtensions();
        java.lang.String str59 = locale56.getDisplayScript();
        java.lang.String str60 = locale48.getDisplayScript(locale56);
        java.lang.String str61 = locale27.getDisplayCountry(locale56);
        java.lang.String str62 = locale27.getISO3Language();
        java.lang.Object obj63 = locale27.clone();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 09:59:19 GMT+00:52 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "n. Chr." + "'", str12, "n. Chr.");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ap. J.-C." + "'", str25, "ap. J.-C.");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "French (France)" + "'", str34, "French (France)");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "eng" + "'", str42, "eng");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "en-US" + "'", str43, "en-US");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "USA" + "'", str46, "USA");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "de");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "de");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(charSet52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Italian (Italy)" + "'", str57, "Italian (Italy)");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "United States" + "'", str61, "United States");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "eng" + "'", str62, "eng");
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertEquals(obj63.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj63), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj63), "en_US");
    }

    @Test
    public void test19107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19107");
        java.util.Locale locale3 = new java.util.Locale("2022-02-11T09:49:53.176Z", "2022-02-11T09:49:40.688", "2022-02-11T09:49:28.347Z");
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale3.getScript();
        java.util.Set<java.lang.Character> charSet6 = locale3.getExtensionKeys();
        java.lang.String str7 = locale3.getDisplayCountry();
        org.junit.Assert.assertEquals(locale3.toString(), "2022-02-11t09:49:53.176z_2022-02-11T09:49:40.688_2022-02-11T09:49:28.347Z");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-11T09:49:40.688" + "'", str7, "2022-02-11T09:49:40.688");
    }

    @Test
    public void test19108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19108");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.monthOfYear();
        int int4 = property3.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime6 = property3.addToCopy(9);
        org.joda.time.LocalDateTime localDateTime7 = property3.roundHalfCeilingCopy();
        int int8 = property3.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime9 = property3.withMaximumValue();
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = localDateTime9.getFieldTypes();
        int int12 = localDateTime9.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime9.withDate(68, 35648943, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35648943 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 374 + "'", int12 == 374);
    }

    @Test
    public void test19109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19109");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.DurationFieldType durationFieldType3 = null;
        boolean boolean4 = localDateTime0.isSupported(durationFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withSecondOfMinute(1);
        java.util.Date date10 = localDateTime6.toDate();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withSecondOfMinute(1);
        boolean boolean15 = localDateTime6.equals((java.lang.Object) localDateTime14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        org.joda.time.ReadableInstant readableInstant18 = null;
        long long19 = property17.getDifferenceAsLong(readableInstant18);
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale20.getDisplayName();
        int int22 = property17.getMaximumTextLength(locale20);
        org.joda.time.LocalDateTime localDateTime23 = property17.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property17.getFieldType();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime6.withField(dateTimeFieldType24, (int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.hourOfDay();
        org.joda.time.ReadableInstant readableInstant29 = null;
        long long30 = property28.getDifferenceAsLong(readableInstant29);
        java.util.Locale locale31 = java.util.Locale.US;
        java.lang.String str32 = locale31.getDisplayName();
        int int33 = property28.getMaximumTextLength(locale31);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.hourOfDay();
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.DateTime dateTime37 = localDateTime34.toDateTime(readableInstant36);
        int int38 = property28.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant40 = null;
        int int41 = dateTimeZone39.getOffset(readableInstant40);
        long long44 = dateTimeZone39.adjustOffset((long) 0, false);
        java.lang.String str45 = dateTimeZone39.toString();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.hourOfDay();
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.DateTime dateTime49 = localDateTime46.toDateTime(readableInstant48);
        java.lang.String str50 = dateTime49.toString();
        int int51 = dateTimeZone39.getOffset((org.joda.time.ReadableInstant) dateTime49);
        int int52 = property28.compareTo((org.joda.time.ReadableInstant) dateTime49);
        java.util.Locale locale53 = java.util.Locale.US;
        int int54 = property28.getMaximumTextLength(locale53);
        org.joda.time.LocalDateTime localDateTime55 = property28.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime57 = property28.addToCopy(5);
        org.joda.time.LocalDateTime localDateTime58 = property28.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.minusYears((int) ' ');
        org.joda.time.LocalDateTime localDateTime61 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.hourOfDay();
        org.joda.time.ReadableInstant readableInstant63 = null;
        long long64 = property62.getDifferenceAsLong(readableInstant63);
        java.util.Locale locale65 = java.util.Locale.US;
        java.lang.String str66 = locale65.getDisplayName();
        int int67 = property62.getMaximumTextLength(locale65);
        org.joda.time.LocalDateTime localDateTime68 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.hourOfDay();
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.DateTime dateTime71 = localDateTime68.toDateTime(readableInstant70);
        int int72 = property62.compareTo((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant74 = null;
        int int75 = dateTimeZone73.getOffset(readableInstant74);
        long long78 = dateTimeZone73.adjustOffset((long) 0, false);
        java.lang.String str79 = dateTimeZone73.toString();
        org.joda.time.LocalDateTime localDateTime80 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property81 = localDateTime80.hourOfDay();
        org.joda.time.ReadableInstant readableInstant82 = null;
        org.joda.time.DateTime dateTime83 = localDateTime80.toDateTime(readableInstant82);
        java.lang.String str84 = dateTime83.toString();
        int int85 = dateTimeZone73.getOffset((org.joda.time.ReadableInstant) dateTime83);
        int int86 = property62.compareTo((org.joda.time.ReadableInstant) dateTime83);
        java.util.Locale locale87 = java.util.Locale.US;
        int int88 = property62.getMaximumTextLength(locale87);
        org.joda.time.LocalDateTime localDateTime89 = property62.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType91 = localDateTime89.getFieldType((int) (short) 0);
        int int92 = localDateTime60.get(dateTimeFieldType91);
        boolean boolean93 = localDateTime6.isSupported(dateTimeFieldType91);
        boolean boolean94 = localDateTime0.isSupported(dateTimeFieldType91);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime96 = localDateTime0.withCenturyOfEra(35762937);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35762937 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 387 + "'", int2 == 387);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Fri Feb 11 09:59:20 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str21, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str32, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTC" + "'", str45, "UTC");
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTime49);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "2022-02-11T09:59:19.387Z" + "'", str50, "2022-02-11T09:59:19.387Z");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str66, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "UTC" + "'", str79, "UTC");
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(dateTime83);
// flaky:         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "2022-02-11T09:59:19.387Z" + "'", str84, "2022-02-11T09:59:19.387Z");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 2 + "'", int88 == 2);
        org.junit.Assert.assertNotNull(localDateTime89);
        org.junit.Assert.assertNotNull(dateTimeFieldType91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1990 + "'", int92 == 1990);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test19110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19110");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime3.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withSecondOfMinute(1);
        java.util.Date date11 = localDateTime7.toDate();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withSecondOfMinute(1);
        boolean boolean16 = localDateTime7.equals((java.lang.Object) localDateTime15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime7.era();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfEvenCopy();
        java.lang.String str19 = property17.getName();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.util.Locale locale21 = locale20.stripExtensions();
        int int22 = property17.getMaximumShortTextLength(locale20);
        java.lang.String str23 = property17.getAsText();
        org.joda.time.LocalDateTime localDateTime24 = property17.withMinimumValue();
        int int25 = localDateTime24.getDayOfYear();
        int int26 = property6.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusMinutes((int) '4');
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        org.joda.time.ReadableInstant readableInstant33 = null;
        long long34 = property32.getDifferenceAsLong(readableInstant33);
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = locale35.getDisplayName();
        int int37 = property32.getMaximumTextLength(locale35);
        org.joda.time.LocalDateTime localDateTime38 = property32.roundHalfFloorCopy();
        boolean boolean39 = localDateTime28.isAfter((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((long) 882, dateTimeZone41);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.year();
        org.joda.time.LocalDateTime.Property property45 = localDateTime43.yearOfEra();
        boolean boolean46 = localDateTime28.isBefore((org.joda.time.ReadablePartial) localDateTime43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime48 = localDateTime43.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Feb 11 09:59:20 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "era" + "'", str19, "era");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "n. Chr." + "'", str23, "n. Chr.");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 42 + "'", int25 == 42);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str36, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test19111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19111");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        int int14 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        int int15 = localDateTime12.getYearOfEra();
        java.lang.String str16 = localDateTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long21 = dateTimeZone18.convertLocalToUTC((long) (byte) 100, false);
        long long23 = dateTimeZone18.previousTransition(0L);
        org.joda.time.DateTime dateTime24 = localDateTime12.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime25 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime11.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        long long28 = property26.remainder();
        boolean boolean29 = property26.isLeap();
        java.lang.String str30 = property26.getAsText();
        org.joda.time.LocalDateTime localDateTime32 = property26.setCopy(0);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.DateTime dateTime34 = localDateTime32.toDateTime(readableInstant33);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.hourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray39 = localDateTime38.getFields();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withYear((-1));
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.hourOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withSecondOfMinute(1);
        java.util.Date date46 = localDateTime42.toDate();
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.hourOfDay();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withSecondOfMinute(1);
        boolean boolean51 = localDateTime42.equals((java.lang.Object) localDateTime50);
        int int52 = localDateTime50.getHourOfDay();
        int int53 = localDateTime38.compareTo((org.joda.time.ReadablePartial) localDateTime50);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime38.minus(readableDuration54);
        int int56 = localDateTime55.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long61 = dateTimeZone58.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now();
        int int64 = localDateTime62.compareTo((org.joda.time.ReadablePartial) localDateTime63);
        int int65 = localDateTime62.getYearOfEra();
        java.lang.String str66 = localDateTime62.toString();
        boolean boolean67 = dateTimeZone58.equals((java.lang.Object) localDateTime62);
        long long71 = dateTimeZone58.convertLocalToUTC((long) 35341075, true, (long) (-1));
        java.lang.String str73 = dateTimeZone58.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(dateTimeZone58);
        boolean boolean76 = dateTimeZone58.isStandardOffset((long) 158);
        int int78 = dateTimeZone58.getStandardOffset((long) 35401928);
        org.joda.time.DateTime dateTime79 = localDateTime55.toDateTime(dateTimeZone58);
        org.joda.time.LocalDateTime localDateTime80 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property81 = localDateTime80.hourOfDay();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime80.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime83.withEra((int) (short) 1);
        int int86 = localDateTime85.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = localDateTime85.getFieldType(1);
        int int89 = dateTime79.get(dateTimeFieldType88);
        int int90 = dateTime34.get(dateTimeFieldType88);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 09:59:20 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022-02-11T09:59:19.439" + "'", str16, "2022-02-11T09:59:19.439");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-115199900L) + "'", long21 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1" + "'", str30, "1");
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldArray39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Fri Feb 11 09:59:20 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 9 + "'", int52 == 9);
// flaky:         org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-115199900L) + "'", long61 == (-115199900L));
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2022 + "'", int65 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "2022-02-11T09:59:19.440" + "'", str66, "2022-02-11T09:59:19.440");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-79858925L) + "'", long71 == (-79858925L));
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 115200000 + "'", int78 == 115200000);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertNotNull(localDateTime85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 2022 + "'", int86 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2 + "'", int89 == 2);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
    }

    @Test
    public void test19112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19112");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray4 = localDateTime3.getFields();
        int int5 = localDateTime3.getWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withCenturyOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime11.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime7.property(dateTimeFieldType13);
        org.joda.time.LocalDateTime localDateTime15 = property14.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        int int19 = property17.getLeapAmount();
        java.util.Locale locale21 = new java.util.Locale("2022-02-11t09:49:25.838");
        int int22 = property17.getMaximumTextLength(locale21);
        java.lang.String str23 = property14.getAsText(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = locale21.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for 2022-02-11t09:49:25.838");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals(locale21.toString(), "2022-02-11t09:49:25.838");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "February" + "'", str23, "February");
    }

    @Test
    public void test19113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19113");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-11T09:49:51.266+32:00");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.time.ZoneId zoneId3 = timeZone1.toZoneId();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("2022-02-11T09:51:27.491");
        int int6 = timeZone5.getRawOffset();
        boolean boolean7 = timeZone1.hasSameRules(timeZone5);
        boolean boolean8 = timeZone5.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test19114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19114");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(284);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test19115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19115");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(2024, 64757992, 61320000, 543, (-2949838));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 543 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19116");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2022-02-11T09:50:12.066");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test19117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19117");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(241);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        int int4 = localDateTime2.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withYearOfCentury(11);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra((int) (short) 1);
        int int13 = localDateTime12.getYear();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plus(readablePeriod14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.monthOfYear();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfCeilingCopy();
        int int18 = localDateTime17.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.hourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withSecondOfMinute(2);
        int int25 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime17.minus(readablePeriod26);
        boolean boolean28 = localDateTime2.isAfter((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime2.withDurationAdded(readableDuration29, 1970);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime2.minusMillis(0);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.monthOfYear();
        boolean boolean35 = dateTimeZone1.isLocalDateTimeGap(localDateTime33);
        int int36 = localDateTime33.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime38 = localDateTime33.withSecondOfMinute(35589291);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35589291 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 22 + "'", int36 == 22);
    }

    @Test
    public void test19118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19118");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Locale locale4 = java.util.Locale.US;
        boolean boolean5 = localDateTime3.equals((java.lang.Object) locale4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusHours(35341681);
        int int8 = localDateTime7.getMillisOfSecond();
        int int9 = localDateTime7.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withSecondOfMinute(0);
        java.util.Date date12 = localDateTime11.toDate();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 554 + "'", int8 == 554);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Sat Nov 15 10:59:01 GMT+00:00 6053");
    }

    @Test
    public void test19119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19119");
        java.io.IOException iOException1 = new java.io.IOException();
        java.lang.Throwable throwable3 = null;
        java.io.IOException iOException4 = new java.io.IOException(throwable3);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = iOException4.getSuppressed();
        java.io.IOException iOException7 = new java.io.IOException("2022-02-11T09:49:26.741Z", (java.lang.Throwable) iOException4);
        iOException1.addSuppressed((java.lang.Throwable) iOException4);
        java.io.IOException iOException9 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.lang.Throwable throwable10 = null;
        java.io.IOException iOException11 = new java.io.IOException(throwable10);
        iOException9.addSuppressed((java.lang.Throwable) iOException11);
        java.lang.Throwable[] throwableArray13 = iOException11.getSuppressed();
        java.io.IOException iOException14 = new java.io.IOException("2022-02-11T09:58:45.700Z", (java.lang.Throwable) iOException11);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test19120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19120");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime3.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfMonth();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.dayOfWeek();
        org.joda.time.DurationField durationField8 = property7.getRangeDurationField();
        java.lang.String str9 = property7.getName();
        org.joda.time.LocalDateTime localDateTime10 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withHourOfDay((int) (byte) 10);
        int int13 = localDateTime12.size();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dayOfWeek" + "'", str9, "dayOfWeek");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test19121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19121");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withSecondOfMinute(1);
        java.util.Date date7 = localDateTime3.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        boolean boolean12 = localDateTime3.equals((java.lang.Object) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField(0);
        boolean boolean17 = localDateTime0.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.centuryOfEra();
        org.joda.time.Chronology chronology19 = localDateTime14.getChronology();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.withWeekyear(1);
        int int22 = localDateTime21.getCenturyOfEra();
        org.joda.time.DateTimeField[] dateTimeFieldArray23 = localDateTime21.getFields();
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.plusYears((int) '#');
        int int27 = localDateTime26.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property28 = localDateTime26.monthOfYear();
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.era();
        org.joda.time.LocalDateTime localDateTime31 = property29.addWrapFieldToCopy(302);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Feb 11 09:59:20 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldArray23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
    }

    @Test
    public void test19122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19122");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-11T09:59:17.611");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Zeit");
    }

    @Test
    public void test19123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19123");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("jpn");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        java.lang.String str5 = languageRange1.getRange();
        java.lang.String str6 = languageRange1.getRange();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withSecondOfMinute(1);
        java.util.Date date11 = localDateTime7.toDate();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromDateFields(date11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withHourOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusMinutes(4);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        long long19 = dateTimeZone17.nextTransition(0L);
        java.lang.String str21 = dateTimeZone17.getNameKey((long) 12);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone17);
        boolean boolean23 = localDateTime16.equals((java.lang.Object) dateTimeZone17);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        int[] intArray26 = localDateTime25.getValues();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withCenturyOfEra(2);
        java.util.Date date29 = localDateTime25.toDate();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.fromDateFields(date29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withDurationAdded(readableDuration31, 586);
        org.joda.time.LocalDateTime.Property property34 = localDateTime30.millisOfSecond();
        boolean boolean35 = dateTimeZone17.isLocalDateTimeGap(localDateTime30);
        boolean boolean36 = languageRange1.equals((java.lang.Object) localDateTime30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jpn" + "'", str2, "jpn");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "jpn" + "'", str4, "jpn");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jpn" + "'", str5, "jpn");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jpn" + "'", str6, "jpn");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Fri Feb 11 09:59:20 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[2022, 2, 11, 35959619]");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Fri Feb 11 09:59:20 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test19124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19124");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-11T09:49:30.914Z");
        boolean boolean2 = timeZone1.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.time.ZoneId zoneId4 = timeZone1.toZoneId();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Koordinierte Universalzeit");
    }

    @Test
    public void test19125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19125");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        int int7 = property6.get();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundHalfEvenCopy();
        int[] intArray9 = localDateTime8.getValues();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minusMonths(64537100);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 11, 36000000]");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test19126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19126");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(94);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str5 = dateTimeZone3.getName((long) 115200000);
        int int7 = dateTimeZone3.getOffsetFromLocal((long) 'u');
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withEra((int) (short) 1);
        int int14 = localDateTime13.getYear();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plus(readablePeriod15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.monthOfYear();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withTime((int) (short) 1, 4, 4, (int) '4');
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusMonths((-1));
        boolean boolean25 = dateTimeZone3.isLocalDateTimeGap(localDateTime24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        long long28 = dateTimeZone3.getMillisKeepLocal(dateTimeZone26, (long) 62);
        java.lang.String str30 = dateTimeZone3.getName(270L);
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (long) 2038);
        boolean boolean34 = dateTimeZone3.isStandardOffset((long) 43);
        long long37 = dateTimeZone3.adjustOffset((long) 634, false);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 115200062L + "'", long28 == 115200062L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 223202038L + "'", long32 == 223202038L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 634L + "'", long37 == 634L);
        org.junit.Assert.assertNotNull(localDateTime39);
    }

    @Test
    public void test19127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19127");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, (long) 64281767, 35525209);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19128");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.hourOfDay();
        org.joda.time.ReadableInstant readableInstant12 = null;
        long long13 = property11.getDifferenceAsLong(readableInstant12);
        java.util.Locale locale14 = java.util.Locale.US;
        java.lang.String str15 = locale14.getDisplayName();
        int int16 = property11.getMaximumTextLength(locale14);
        org.joda.time.LocalDateTime localDateTime17 = property11.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property11.getFieldType();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime0.withField(dateTimeFieldType18, (int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusMinutes(39008921);
        boolean boolean24 = localDateTime20.equals((java.lang.Object) "2022-02-12T17:51:43.309+32:00");
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.hourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = localDateTime28.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property31 = localDateTime28.dayOfMonth();
        org.joda.time.LocalDateTime.Property property32 = localDateTime28.dayOfWeek();
        org.joda.time.LocalDateTime.Property property33 = localDateTime28.monthOfYear();
        org.joda.time.LocalDateTime localDateTime34 = property33.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withYearOfEra(882);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withDurationAdded(readableDuration37, (int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.withPeriodAdded(readablePeriod40, 646);
        org.joda.time.DateTimeField[] dateTimeFieldArray43 = localDateTime36.getFields();
        boolean boolean44 = localDateTime20.equals((java.lang.Object) localDateTime36);
        org.joda.time.LocalDateTime.Property property45 = localDateTime20.weekyear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 09:59:20 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str15, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(property45);
    }

    @Test
    public void test19129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19129");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        int int3 = localDateTime0.getYearOfEra();
        java.lang.String str4 = localDateTime0.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long9 = dateTimeZone6.convertLocalToUTC((long) (byte) 100, false);
        long long11 = dateTimeZone6.previousTransition(0L);
        org.joda.time.DateTime dateTime12 = localDateTime0.toDateTime(dateTimeZone6);
        java.util.TimeZone timeZone13 = dateTimeZone6.toTimeZone();
        long long16 = dateTimeZone6.convertLocalToUTC((long) 74, false);
        long long19 = dateTimeZone6.convertLocalToUTC((long) 35393391, true);
        long long23 = dateTimeZone6.convertLocalToUTC(3039916L, true, (long) 35401359);
        java.util.TimeZone timeZone24 = dateTimeZone6.toTimeZone();
        java.lang.String str25 = timeZone24.getID();
        int int26 = timeZone24.getDSTSavings();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11T09:59:19.737" + "'", str4, "2022-02-11T09:59:19.737");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115199900L) + "'", long9 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199926L) + "'", long16 == (-115199926L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-79806609L) + "'", long19 == (-79806609L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-112160084L) + "'", long23 == (-112160084L));
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GMT" + "'", str25, "GMT");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test19130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19130");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        int int3 = localDateTime0.getYearOfEra();
        java.lang.String str4 = localDateTime0.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long9 = dateTimeZone6.convertLocalToUTC((long) (byte) 100, false);
        long long11 = dateTimeZone6.previousTransition(0L);
        org.joda.time.DateTime dateTime12 = localDateTime0.toDateTime(dateTimeZone6);
        java.lang.String str14 = dateTimeZone6.getShortName((long) 43);
        java.lang.String str15 = dateTimeZone6.getID();
        java.util.TimeZone timeZone16 = dateTimeZone6.toTimeZone();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.ReadableInstant readableInstant20 = null;
        long long21 = property19.getDifferenceAsLong(readableInstant20);
        java.util.Locale locale22 = java.util.Locale.US;
        java.lang.String str23 = locale22.getDisplayName();
        int int24 = property19.getMaximumTextLength(locale22);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.hourOfDay();
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.DateTime dateTime28 = localDateTime25.toDateTime(readableInstant27);
        int int29 = property19.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DurationField durationField30 = property19.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = localDateTime34.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property37 = localDateTime34.dayOfMonth();
        org.joda.time.LocalDateTime.Property property38 = localDateTime34.dayOfWeek();
        org.joda.time.LocalDateTime.Property property39 = localDateTime34.monthOfYear();
        java.util.Locale locale40 = java.util.Locale.KOREA;
        java.lang.String str41 = locale40.getLanguage();
        int int42 = property39.getMaximumShortTextLength(locale40);
        java.lang.String str43 = property19.getAsText(locale40);
        java.lang.String str44 = locale40.getISO3Country();
        java.lang.String str45 = dateTimeZone6.getName((long) 35401386, locale40);
        java.lang.String str46 = dateTimeZone6.getID();
        boolean boolean48 = dateTimeZone6.equals((java.lang.Object) "2022-02-11T09:55:12.278");
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11T09:59:19.750" + "'", str4, "2022-02-11T09:59:19.750");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115199900L) + "'", long9 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+32:00" + "'", str14, "+32:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str23, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(durationField30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ko" + "'", str41, "ko");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "9" + "'", str43, "9");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "KOR" + "'", str44, "KOR");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+32:00" + "'", str45, "+32:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+32:00" + "'", str46, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test19131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19131");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1, chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.ROOT;
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale5.getDisplayScript(locale6);
        java.util.Locale locale8 = java.util.Locale.JAPAN;
        java.lang.String str9 = locale6.getDisplayScript(locale8);
        java.lang.String str10 = locale8.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayScript(locale8);
        int int12 = property3.getMaximumShortTextLength(locale8);
        org.joda.time.LocalDateTime localDateTime13 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime15 = property3.addToCopy(3600100L);
        java.util.Locale locale16 = java.util.Locale.ITALY;
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = locale16.getDisplayName(locale18);
        java.lang.String str20 = locale18.getDisplayVariant();
        java.lang.String str21 = property3.getAsShortText(locale18);
        int int22 = property3.getMinimumValue();
        java.util.Locale locale24 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = property3.setCopy("JPN", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"JPN\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ja-JP" + "'", str10, "ja-JP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Italian (Italy)" + "'", str19, "Italian (Italy)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "59" + "'", str21, "59");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
    }

    @Test
    public void test19132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19132");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.era();
        org.joda.time.LocalDateTime.Property property11 = localDateTime0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone12.getOffset(readableInstant13);
        long long17 = dateTimeZone12.adjustOffset((long) 0, false);
        java.lang.String str18 = dateTimeZone12.toString();
        long long20 = dateTimeZone12.previousTransition(10L);
        java.util.Locale locale22 = java.util.Locale.ROOT;
        java.util.Locale locale23 = java.util.Locale.US;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.lang.String str26 = locale23.getDisplayScript(locale25);
        java.lang.String str27 = dateTimeZone12.getName((long) 2022, locale23);
        boolean boolean29 = dateTimeZone12.isStandardOffset((long) (short) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        org.joda.time.ReadableInstant readableInstant33 = null;
        long long34 = property32.getDifferenceAsLong(readableInstant33);
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = locale35.getDisplayName();
        int int37 = property32.getMaximumTextLength(locale35);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.hourOfDay();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTime dateTime41 = localDateTime38.toDateTime(readableInstant40);
        int int42 = property32.compareTo((org.joda.time.ReadableInstant) dateTime41);
        int int43 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime44 = localDateTime0.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        java.lang.String str45 = dateTime44.toString();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long50 = dateTimeZone47.convertLocalToUTC((long) (byte) 100, false);
        long long52 = dateTimeZone47.previousTransition(0L);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone47);
        int int54 = localDateTime53.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property55 = localDateTime53.dayOfYear();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime53.withDayOfYear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.withYearOfEra(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = null;
        boolean boolean61 = localDateTime59.isSupported(dateTimeFieldType60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = null;
        java.lang.String str63 = localDateTime59.toString(dateTimeFormatter62);
        int int64 = localDateTime59.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime66 = org.joda.time.LocalDateTime.now();
        int int67 = localDateTime65.compareTo((org.joda.time.ReadablePartial) localDateTime66);
        org.joda.time.LocalDateTime.Property property68 = localDateTime65.monthOfYear();
        org.joda.time.Chronology chronology69 = localDateTime65.getChronology();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime59.withFields((org.joda.time.ReadablePartial) localDateTime65);
        org.joda.time.LocalDateTime.Property property71 = localDateTime65.weekOfWeekyear();
        boolean boolean72 = dateTime44.equals((java.lang.Object) localDateTime65);
        java.lang.Class<?> wildcardClass73 = dateTime44.getClass();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 09:59:20 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str36, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTime44);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2022-02-11T09:59:19.786Z" + "'", str45, "2022-02-11T09:59:19.786Z");
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-115199900L) + "'", long50 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 6 + "'", int54 == 6);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0009-01-01T17:59:19.787" + "'", str63, "0009-01-01T17:59:19.787");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test19133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19133");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-11T09:49:30.914Z");
        boolean boolean2 = timeZone1.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.time.ZoneId zoneId4 = timeZone1.toZoneId();
        java.util.TimeZone.setDefault(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Zeit");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test19134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19134");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("jpn");
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        int int4 = localDateTime2.compareTo((org.joda.time.ReadablePartial) localDateTime3);
        int int5 = localDateTime2.getYearOfEra();
        java.lang.String str6 = localDateTime2.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long11 = dateTimeZone8.convertLocalToUTC((long) (byte) 100, false);
        long long13 = dateTimeZone8.previousTransition(0L);
        org.joda.time.DateTime dateTime14 = localDateTime2.toDateTime(dateTimeZone8);
        java.lang.String str15 = dateTime14.toString();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        org.joda.time.ReadableInstant readableInstant18 = null;
        long long19 = property17.getDifferenceAsLong(readableInstant18);
        java.util.Locale locale20 = java.util.Locale.US;
        java.lang.String str21 = locale20.getDisplayName();
        int int22 = property17.getMaximumTextLength(locale20);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.hourOfDay();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.DateTime dateTime26 = localDateTime23.toDateTime(readableInstant25);
        int int27 = property17.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.hourOfDay();
        org.joda.time.ReadableInstant readableInstant30 = null;
        long long31 = property29.getDifferenceAsLong(readableInstant30);
        java.util.Locale locale32 = java.util.Locale.US;
        java.lang.String str33 = locale32.getDisplayName();
        int int34 = property29.getMaximumTextLength(locale32);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.hourOfDay();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime35.toDateTime(readableInstant37);
        int int39 = property29.compareTo((org.joda.time.ReadableInstant) dateTime38);
        boolean boolean40 = dateTime26.isAfter((org.joda.time.ReadableInstant) dateTime38);
        boolean boolean41 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime26);
        long long42 = dateTime26.getMillis();
        org.joda.time.Instant instant43 = dateTime26.toInstant();
        org.joda.time.Chronology chronology44 = instant43.getChronology();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        boolean boolean46 = languageRange1.equals((java.lang.Object) chronology44);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022-02-11T09:59:19.858" + "'", str6, "2022-02-11T09:59:19.858");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-115199900L) + "'", long11 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022-02-11T09:59:19.858+32:00" + "'", str15, "2022-02-11T09:59:19.858+32:00");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str21, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str33, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1644573559858L + "'", long42 == 1644573559858L);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test19135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19135");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        long long5 = dateTimeZone0.adjustOffset((long) 0, false);
        java.lang.String str6 = dateTimeZone0.toString();
        long long8 = dateTimeZone0.previousTransition(10L);
        java.util.Locale locale10 = java.util.Locale.ROOT;
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale10.getDisplayScript(locale11);
        java.util.Locale locale13 = java.util.Locale.JAPAN;
        java.lang.String str14 = locale11.getDisplayScript(locale13);
        java.lang.String str15 = dateTimeZone0.getName((long) 2022, locale11);
        boolean boolean17 = dateTimeZone0.isStandardOffset((long) (short) 1);
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("2022-02-11T09:49:49.623+32:00");
        java.lang.String str21 = dateTimeZone0.getShortName((long) 35401608, locale20);
        boolean boolean22 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone23 = dateTimeZone0.toTimeZone();
        long long26 = dateTimeZone0.adjustOffset(1644573028779L, false);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Koordinierte Universalzeit");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1644573028779L + "'", long26 == 1644573028779L);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test19136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19136");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        int int6 = localDateTime5.getYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withSecondOfMinute(1);
        java.util.Date date15 = localDateTime11.toDate();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withSecondOfMinute(1);
        boolean boolean20 = localDateTime11.equals((java.lang.Object) localDateTime19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime11.era();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        int int25 = localDateTime23.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        int int26 = localDateTime23.getYearOfEra();
        java.lang.String str27 = localDateTime23.toString();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long32 = dateTimeZone29.convertLocalToUTC((long) (byte) 100, false);
        long long34 = dateTimeZone29.previousTransition(0L);
        org.joda.time.DateTime dateTime35 = localDateTime23.toDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime36 = localDateTime22.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        int[] intArray39 = localDateTime38.getValues();
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.hourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withHourOfDay(10);
        boolean boolean44 = localDateTime38.isAfter((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime38.withMillisOfSecond((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.hourOfDay();
        org.joda.time.ReadableInstant readableInstant49 = null;
        long long50 = property48.getDifferenceAsLong(readableInstant49);
        java.util.Locale locale51 = java.util.Locale.US;
        java.lang.String str52 = locale51.getDisplayName();
        int int53 = property48.getMaximumTextLength(locale51);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.hourOfDay();
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.DateTime dateTime57 = localDateTime54.toDateTime(readableInstant56);
        int int58 = property48.compareTo((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant60 = null;
        int int61 = dateTimeZone59.getOffset(readableInstant60);
        long long64 = dateTimeZone59.adjustOffset((long) 0, false);
        java.lang.String str65 = dateTimeZone59.toString();
        org.joda.time.LocalDateTime localDateTime66 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property67 = localDateTime66.hourOfDay();
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.DateTime dateTime69 = localDateTime66.toDateTime(readableInstant68);
        java.lang.String str70 = dateTime69.toString();
        int int71 = dateTimeZone59.getOffset((org.joda.time.ReadableInstant) dateTime69);
        int int72 = property48.compareTo((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.LocalDateTime localDateTime73 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.hourOfDay();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.withEra((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = localDateTime76.getFieldType(1);
        boolean boolean81 = dateTime69.isSupported(dateTimeFieldType80);
        boolean boolean82 = localDateTime38.isSupported(dateTimeFieldType80);
        boolean boolean83 = dateTime36.isSupported(dateTimeFieldType80);
        org.joda.time.LocalDateTime.Property property84 = localDateTime5.property(dateTimeFieldType80);
        java.util.Date date85 = localDateTime5.toDate();
        org.joda.time.LocalDateTime localDateTime86 = org.joda.time.LocalDateTime.fromDateFields(date85);
        java.lang.String str87 = localDateTime86.toString();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Fri Feb 11 09:59:19 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2022 + "'", int26 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2022-02-11T09:59:19.892" + "'", str27, "2022-02-11T09:59:19.892");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-115199900L) + "'", long32 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(intArray39);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[2022, 2, 11, 35959892]");
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Englisch (Vereinigte Staaten von Amerika)" + "'", str52, "Englisch (Vereinigte Staaten von Amerika)");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "UTC" + "'", str65, "UTC");
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTime69);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "2022-02-11T09:59:19.892Z" + "'", str70, "2022-02-11T09:59:19.892Z");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(dateTimeFieldType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertNotNull(date85);
// flaky:         org.junit.Assert.assertEquals(date85.toString(), "Fri Feb 11 09:59:01 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime86);
// flaky:         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "2022-02-11T09:59:01.892" + "'", str87, "2022-02-11T09:59:01.892");
    }

    @Test
    public void test19137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19137");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.nextTransition(0L);
        long long6 = dateTimeZone0.convertLocalToUTC((long) (short) 0, true, (-115199900L));
        long long9 = dateTimeZone0.convertLocalToUTC((long) 9, true);
        int int11 = dateTimeZone0.getStandardOffset((long) 12);
        boolean boolean12 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9L + "'", long9 == 9L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test19138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19138");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-11T09:50:11.525Z");
        timeZone1.setRawOffset(64281767);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Zeit");
    }

    @Test
    public void test19139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19139");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        int int3 = localDateTime0.getYearOfEra();
        org.joda.time.LocalDateTime.Property property4 = localDateTime0.year();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMonths(115200000);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusWeeks((-1));
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMinutes(64448625);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test19140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19140");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.ReadableInstant readableInstant2 = null;
        long long3 = property1.getDifferenceAsLong(readableInstant2);
        java.util.Locale locale7 = new java.util.Locale("2022-02-11T09:49:36.798", "2022-02-11T09:49:51.342+32:00", "2022-02-11T09:50:44.164");
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale7.getDisplayLanguage(locale8);
        int int10 = property1.getMaximumTextLength(locale8);
        boolean boolean11 = locale8.hasExtensions();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals(locale7.toString(), "2022-02-11t09:49:36.798_2022-02-11T09:49:51.342+32:00_2022-02-11T09:50:44.164");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022-02-11t09:49:36.798" + "'", str9, "2022-02-11t09:49:36.798");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test19141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19141");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int[] intArray2 = localDateTime1.getValues();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withHourOfDay(10);
        boolean boolean7 = localDateTime1.isAfter((org.joda.time.ReadablePartial) localDateTime6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime1.yearOfCentury();
        long long11 = property10.remainder();
        org.joda.time.LocalDateTime localDateTime13 = property10.addToCopy(35341681L);
        int int14 = property10.get();
        org.junit.Assert.assertNotNull(intArray2);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[2022, 2, 11, 35959979]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3578359979L + "'", long11 == 3578359979L);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
    }

    @Test
    public void test19142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19142");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minus(readablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMinutes(43);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plus(readableDuration11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.era();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusMillis(39121983);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.secondOfMinute();
        int int17 = localDateTime12.getDayOfYear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 42 + "'", int17 == 42);
    }

    @Test
    public void test19143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19143");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) (short) -1, chronology2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.minuteOfHour();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.util.Locale locale9 = java.util.Locale.JAPAN;
        java.lang.String str10 = locale7.getDisplayScript(locale9);
        java.lang.String str11 = locale9.toLanguageTag();
        java.lang.String str12 = locale5.getDisplayScript(locale9);
        int int13 = property4.getMaximumShortTextLength(locale9);
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale15 = java.util.Locale.getDefault(category0);
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Locale locale17 = locale16.stripExtensions();
        java.util.Locale locale18 = java.util.Locale.ROOT;
        java.lang.String str19 = locale16.getDisplayScript(locale18);
        java.lang.String str20 = locale18.getCountry();
        java.util.Locale.setDefault(category0, locale18);
        java.util.Locale locale22 = locale18.stripExtensions();
        java.util.Locale locale23 = locale22.stripExtensions();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ja-JP" + "'", str11, "ja-JP");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "de");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
    }

    @Test
    public void test19144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19144");
        java.lang.String[] strArray2 = new java.lang.String[] { "Coordinated Universal Time", "eng" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "ja_JP", "ja_JP", "hi!", "ja_JP" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.lang.String str15 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList13);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream16 = languageRangeList6.stream();
        boolean boolean17 = strSet3.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6);
        java.util.Spliterator<java.lang.String> strSpliterator18 = strSet3.spliterator();
        strSet3.clear();
        boolean boolean21 = strSet3.contains((java.lang.Object) "2022-02-11T09:49:34.503Z");
        java.util.Spliterator<java.lang.String> strSpliterator22 = strSet3.spliterator();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(languageRangeStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSpliterator22);
    }

    @Test
    public void test19145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19145");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        int int7 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime6);
        int int8 = localDateTime5.getYearOfEra();
        java.lang.String str9 = localDateTime5.toString();
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) localDateTime5);
        long long14 = dateTimeZone1.convertLocalToUTC((long) 35341075, true, (long) (-1));
        java.lang.Object obj15 = null;
        boolean boolean16 = dateTimeZone1.equals(obj15);
        long long18 = dateTimeZone1.previousTransition((long) 35430454);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022-02-11T09:59:20.050" + "'", str9, "2022-02-11T09:59:20.050");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-79858925L) + "'", long14 == (-79858925L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35430454L + "'", long18 == 35430454L);
    }

    @Test
    public void test19146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19146");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        int int4 = localDateTime0.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        int int9 = localDateTime5.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withYear(1472571);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withSecondOfMinute(1);
        java.util.Date date16 = localDateTime12.toDate();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.hourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withSecondOfMinute(1);
        boolean boolean21 = localDateTime12.equals((java.lang.Object) localDateTime20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime12.era();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundHalfEvenCopy();
        java.lang.String str24 = property22.getName();
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.util.Locale locale26 = locale25.stripExtensions();
        int int27 = property22.getMaximumShortTextLength(locale25);
        java.lang.String str28 = property22.getAsText();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone29.getOffset(readableInstant30);
        long long34 = dateTimeZone29.adjustOffset((long) 0, false);
        java.lang.String str35 = dateTimeZone29.toString();
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.hourOfDay();
        org.joda.time.ReadableInstant readableInstant38 = null;
        org.joda.time.DateTime dateTime39 = localDateTime36.toDateTime(readableInstant38);
        java.lang.String str40 = dateTime39.toString();
        int int41 = dateTimeZone29.getOffset((org.joda.time.ReadableInstant) dateTime39);
        int int42 = property22.compareTo((org.joda.time.ReadableInstant) dateTime39);
        java.util.Locale locale44 = new java.util.Locale("");
        java.util.Locale.setDefault(locale44);
        java.lang.String str46 = locale44.getISO3Country();
        java.lang.String str47 = property22.getAsShortText(locale44);
        org.joda.time.LocalDateTime localDateTime48 = property22.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property22.getFieldType();
        boolean boolean50 = localDateTime11.isSupported(dateTimeFieldType49);
        boolean boolean51 = localDateTime0.isSupported(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9 == 17);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "era" + "'", str24, "era");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "n. Chr." + "'", str28, "n. Chr.");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime39);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2022-02-12T17:59:20.062+32:00" + "'", str40, "2022-02-12T17:59:20.062+32:00");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "AD" + "'", str47, "AD");
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test19147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19147");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime3.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '4');
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = dateTimeZone9.getName(10L, locale11);
        org.joda.time.DateTime dateTime14 = localDateTime3.toDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long19 = dateTimeZone16.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        int int22 = localDateTime20.compareTo((org.joda.time.ReadablePartial) localDateTime21);
        int int23 = localDateTime20.getYearOfEra();
        java.lang.String str24 = localDateTime20.toString();
        boolean boolean25 = dateTimeZone16.equals((java.lang.Object) localDateTime20);
        boolean boolean26 = dateTime14.equals((java.lang.Object) localDateTime20);
        org.joda.time.LocalDateTime.Property property27 = localDateTime20.dayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:52" + "'", str13, "+00:52");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115199900L) + "'", long19 == (-115199900L));
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022-02-12T17:59:20.093" + "'", str24, "2022-02-12T17:59:20.093");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test19148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19148");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withSecondOfMinute(1);
        java.util.Date date7 = localDateTime3.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        boolean boolean12 = localDateTime3.equals((java.lang.Object) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField(0);
        boolean boolean17 = localDateTime0.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withSecondOfMinute(1);
        java.util.Date date22 = localDateTime18.toDate();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withSecondOfMinute(1);
        boolean boolean27 = localDateTime18.equals((java.lang.Object) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime18.era();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        org.joda.time.LocalDateTime.Property property32 = localDateTime14.property(dateTimeFieldType31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime14.plusYears((int) '4');
        int int35 = localDateTime34.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long40 = dateTimeZone37.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        int int43 = localDateTime41.compareTo((org.joda.time.ReadablePartial) localDateTime42);
        int int44 = localDateTime41.getYearOfEra();
        java.lang.String str45 = localDateTime41.toString();
        boolean boolean46 = dateTimeZone37.equals((java.lang.Object) localDateTime41);
        long long50 = dateTimeZone37.convertLocalToUTC((long) 35341075, true, (long) (-1));
        java.lang.String str51 = dateTimeZone37.getID();
        org.joda.time.DateTime dateTime52 = localDateTime34.toDateTime(dateTimeZone37);
        org.joda.time.LocalDateTime.Property property53 = localDateTime34.weekOfWeekyear();
        int int54 = property53.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime55 = property53.roundHalfCeilingCopy();
        boolean boolean56 = property53.isLeap();
        org.joda.time.LocalDateTime localDateTime57 = property53.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-115199900L) + "'", long40 == (-115199900L));
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2022 + "'", int44 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2022-02-12T17:59:20.108" + "'", str45, "2022-02-12T17:59:20.108");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-79858925L) + "'", long50 == (-79858925L));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+32:00" + "'", str51, "+32:00");
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 52 + "'", int54 == 52);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(localDateTime57);
    }

    @Test
    public void test19149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19149");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfMonth();
        java.lang.String str13 = property12.getAsText();
        org.joda.time.LocalDateTime localDateTime14 = property12.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = property12.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.weekOfWeekyear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test19150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19150");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray4 = localDateTime3.getFields();
        int int5 = localDateTime3.getWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withCenturyOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withHourOfDay(6);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.hourOfDay();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfEvenCopy();
        boolean boolean14 = localDateTime3.isBefore((org.joda.time.ReadablePartial) localDateTime13);
        int int15 = localDateTime13.getEra();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test19151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19151");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYear((-1));
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        java.util.Date date12 = localDateTime8.toDate();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withSecondOfMinute(1);
        boolean boolean17 = localDateTime8.equals((java.lang.Object) localDateTime16);
        int int18 = localDateTime16.getHourOfDay();
        int int19 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime4.minus(readableDuration20);
        int int22 = localDateTime4.getHourOfDay();
        org.joda.time.Chronology chronology23 = localDateTime4.getChronology();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 850, chronology23);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(chronology23);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 17 + "'", int22 == 17);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test19152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19152");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusDays(12);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.weekOfWeekyear();
        java.util.Locale locale8 = java.util.Locale.getDefault();
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Locale locale10 = java.util.Locale.ROOT;
        java.lang.String str11 = locale8.getDisplayScript(locale10);
        java.lang.String str12 = locale10.getCountry();
        java.lang.String str13 = property7.getAsShortText(locale10);
        int int14 = property5.getMaximumTextLength(locale10);
        int int15 = property5.getMinimumValue();
        org.joda.time.DurationField durationField16 = property5.getDurationField();
        org.joda.time.LocalDateTime localDateTime17 = property5.roundHalfEvenCopy();
        java.lang.String str18 = property5.getAsText();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6" + "'", str13, "6");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "64760184" + "'", str18, "64760184");
    }

    @Test
    public void test19153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19153");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(41);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str3 = timeZone2.getID();
        java.util.TimeZone.setDefault(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeZone2.getOffset(0, 35812293, 35761872, 35569167, 219600000, 268);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
    }

    @Test
    public void test19154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19154");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 10);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime3 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfMonth();
        int int5 = localDateTime3.getWeekyear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withWeekOfWeekyear((int) (short) 10);
        java.lang.String str9 = localDateTime8.toString();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(0);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withSecondOfMinute(1);
        java.util.Locale locale16 = java.util.Locale.US;
        boolean boolean17 = localDateTime15.equals((java.lang.Object) locale16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plusHours(35341681);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plus(readableDuration20);
        org.joda.time.DateTime dateTime22 = localDateTime21.toDateTime();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        int[] intArray25 = localDateTime24.getValues();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.hourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withHourOfDay(10);
        boolean boolean30 = localDateTime24.isAfter((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime24.withMillisOfSecond((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusYears((int) '4');
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.plus(readableDuration35);
        int int37 = localDateTime32.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property38 = localDateTime32.secondOfMinute();
        org.joda.time.DateTimeField[] dateTimeFieldArray39 = localDateTime32.getFields();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime32.minus(readableDuration40);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        int int44 = localDateTime42.compareTo((org.joda.time.ReadablePartial) localDateTime43);
        int int45 = localDateTime42.getYearOfEra();
        java.lang.String str46 = localDateTime42.toString();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long51 = dateTimeZone48.convertLocalToUTC((long) (byte) 100, false);
        long long53 = dateTimeZone48.previousTransition(0L);
        org.joda.time.DateTime dateTime54 = localDateTime42.toDateTime(dateTimeZone48);
        java.lang.String str55 = dateTime54.toString();
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.hourOfDay();
        org.joda.time.ReadableInstant readableInstant58 = null;
        long long59 = property57.getDifferenceAsLong(readableInstant58);
        java.util.Locale locale60 = java.util.Locale.US;
        java.lang.String str61 = locale60.getDisplayName();
        int int62 = property57.getMaximumTextLength(locale60);
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.hourOfDay();
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.DateTime dateTime66 = localDateTime63.toDateTime(readableInstant65);
        int int67 = property57.compareTo((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant69 = null;
        int int70 = dateTimeZone68.getOffset(readableInstant69);
        long long73 = dateTimeZone68.adjustOffset((long) 0, false);
        java.lang.String str74 = dateTimeZone68.toString();
        org.joda.time.LocalDateTime localDateTime75 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.hourOfDay();
        org.joda.time.ReadableInstant readableInstant77 = null;
        org.joda.time.DateTime dateTime78 = localDateTime75.toDateTime(readableInstant77);
        java.lang.String str79 = dateTime78.toString();
        int int80 = dateTimeZone68.getOffset((org.joda.time.ReadableInstant) dateTime78);
        int int81 = property57.compareTo((org.joda.time.ReadableInstant) dateTime78);
        java.util.Locale locale82 = java.util.Locale.US;
        int int83 = property57.getMaximumTextLength(locale82);
        org.joda.time.LocalDateTime localDateTime84 = property57.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = localDateTime84.getFieldType((int) (short) 0);
        boolean boolean87 = dateTime54.isSupported(dateTimeFieldType86);
        int int88 = localDateTime32.indexOf(dateTimeFieldType86);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime21.withField(dateTimeFieldType86, (-2022));
        boolean boolean91 = localDateTime8.isSupported(dateTimeFieldType86);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-03-06T08:00:00.010" + "'", str9, "1970-03-06T08:00:00.010");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(intArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[2022, 2, 12, 64760209]");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64760000 + "'", int37 == 64760000);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeFieldArray39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2022 + "'", int45 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2022-02-12T17:59:20.209" + "'", str46, "2022-02-12T17:59:20.209");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-115199900L) + "'", long51 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(dateTime54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "2022-02-12T17:59:20.209+32:00" + "'", str55, "2022-02-12T17:59:20.209+32:00");
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 32L + "'", long59 == 32L);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "English (United States)" + "'", str61, "English (United States)");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "UTC" + "'", str74, "UTC");
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(dateTime78);
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "2022-02-12T17:59:20.209+32:00" + "'", str79, "2022-02-12T17:59:20.209+32:00");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2 + "'", int83 == 2);
        org.junit.Assert.assertNotNull(localDateTime84);
        org.junit.Assert.assertNotNull(dateTimeFieldType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(localDateTime90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test19155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19155");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.addUnicodeLocaleAttribute("9602022");
        java.util.Locale.Builder builder5 = builder3.setScript("");
        java.util.Locale.Builder builder6 = builder3.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.addUnicodeLocaleAttribute("2022-02-11T09:54:08.886Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-11T09:54:08.886Z [at index 0]");
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
    public void test19156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19156");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime3.getFieldType((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long10 = dateTimeZone7.convertLocalToUTC((long) (byte) 100, false);
        long long12 = dateTimeZone7.previousTransition(0L);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        int int17 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withSecondOfMinute(1);
        java.util.Date date22 = localDateTime18.toDate();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withSecondOfMinute(1);
        boolean boolean27 = localDateTime18.equals((java.lang.Object) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime18.era();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField31 = localDateTime29.getField(0);
        boolean boolean32 = localDateTime15.isEqual((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.hourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withSecondOfMinute(1);
        java.util.Date date37 = localDateTime33.toDate();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.hourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withSecondOfMinute(1);
        boolean boolean42 = localDateTime33.equals((java.lang.Object) localDateTime41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime33.era();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property45.getFieldType();
        org.joda.time.LocalDateTime.Property property47 = localDateTime29.property(dateTimeFieldType46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime29.plusYears((int) '4');
        org.joda.time.LocalDateTime localDateTime51 = localDateTime29.plusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime.Property property52 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime localDateTime53 = property52.roundHalfFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plus(readablePeriod54);
        boolean boolean56 = dateTimeZone7.equals((java.lang.Object) localDateTime55);
        org.joda.time.DateTime dateTime57 = localDateTime3.toDateTime(dateTimeZone7);
        int int58 = localDateTime3.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-115199900L) + "'", long10 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 6 + "'", int58 == 6);
    }

    @Test
    public void test19157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19157");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.fromDateFields(date4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withHourOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMinutes(4);
        java.lang.Object obj10 = null;
        boolean boolean11 = localDateTime9.equals(obj10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withYearOfEra(59);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plusWeeks(999);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = localDateTime17.toString(dateTimeFormatter18);
        boolean boolean20 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime17);
        int int21 = localDateTime17.getMonthOfYear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2041-04-06T17:59:20.298" + "'", str19, "2041-04-06T17:59:20.298");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test19158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19158");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Locale locale4 = java.util.Locale.US;
        boolean boolean5 = localDateTime3.equals((java.lang.Object) locale4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusHours(35341681);
        int int8 = localDateTime7.getMillisOfSecond();
        int int9 = localDateTime7.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusMillis(708);
        org.joda.time.LocalDateTime.Property property12 = localDateTime7.hourOfDay();
        boolean boolean14 = localDateTime7.equals((java.lang.Object) "2022-02-11T09:50:42.434Z");
        int int15 = localDateTime7.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField17 = localDateTime7.getField(35641416);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35641416");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 315 + "'", int8 == 315);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
    }

    @Test
    public void test19159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19159");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray4 = localDateTime3.getFields();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYear((-1));
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusYears(22);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMinuteOfHour(36);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plusWeeks(999);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = localDateTime16.toString(dateTimeFormatter17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withMillisOfSecond(134);
        boolean boolean22 = localDateTime12.isBefore((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusHours(35701378);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plus(readablePeriod25);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2041-04-06T17:59:20.328" + "'", str18, "2041-04-06T17:59:20.328");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test19160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19160");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(35881329, 76, 35892146, 748, 1, 45, 934);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 748 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19161");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        int int6 = localDateTime5.getYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withSecondOfMinute(1);
        java.util.Date date15 = localDateTime11.toDate();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withSecondOfMinute(1);
        boolean boolean20 = localDateTime11.equals((java.lang.Object) localDateTime19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime11.era();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property23.getFieldType();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime5.withField(dateTimeFieldType24, 10);
        org.joda.time.LocalDateTime.Property property27 = localDateTime5.hourOfDay();
        int int28 = property27.get();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.weekOfWeekyear();
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.util.Locale locale32 = locale31.stripExtensions();
        java.util.Locale locale33 = java.util.Locale.ROOT;
        java.lang.String str34 = locale31.getDisplayScript(locale33);
        java.lang.String str35 = locale33.getCountry();
        java.lang.String str36 = property30.getAsShortText(locale33);
        java.util.Locale locale37 = java.util.Locale.ROOT;
        java.util.Locale locale38 = java.util.Locale.US;
        java.lang.String str39 = locale37.getDisplayScript(locale38);
        java.lang.String str40 = locale37.getLanguage();
        java.lang.String str41 = locale33.getDisplayLanguage(locale37);
        java.lang.String str43 = locale33.getExtension('a');
        int int44 = property27.getMaximumShortTextLength(locale33);
        org.joda.time.LocalDateTime localDateTime45 = property27.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.era();
        int int47 = property46.getMaximumValue();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 17 + "'", int28 == 17);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "6" + "'", str36, "6");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test19162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19162");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.plusMillis(86399999);
        org.joda.time.LocalDateTime.Property property8 = localDateTime0.centuryOfEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test19163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19163");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.lang.String str1 = locale0.getScript();
        java.util.Locale locale4 = new java.util.Locale("2022-02-11T09:49:33.118", "2022-02-11T09:49:32.375Z");
        java.lang.String str5 = locale0.getDisplayCountry(locale4);
        boolean boolean6 = locale0.hasExtensions();
        java.lang.String str7 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals(locale4.toString(), "2022-02-11t09:49:33.118_2022-02-11T09:49:32.375Z");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test19164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19164");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray4 = localDateTime3.getFields();
        int int5 = localDateTime3.getWeekyear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        int[] intArray8 = localDateTime7.getValues();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withCenturyOfEra(2);
        int int11 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDateTime15.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = localDateTime15.getFieldType(0);
        int int19 = localDateTime7.get(dateTimeFieldType18);
        int int20 = localDateTime7.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime7.withWeekyear((-1));
        org.joda.time.LocalDateTime localDateTime24 = localDateTime7.plusSeconds(69);
        org.joda.time.DateTime dateTime25 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime7.minusHours(6);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime7.minusMonths(35422312);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusHours(779);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.minusMinutes(626);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.hourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withSecondOfMinute(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = localDateTime37.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.dayOfMonth();
        int int41 = property40.getLeapAmount();
        java.lang.String str42 = property40.getAsText();
        org.joda.time.LocalDateTime localDateTime44 = property40.addToCopy(882);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.weekyear();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.hourOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withEra((int) (short) 1);
        int int52 = localDateTime51.getYear();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.plus(readablePeriod53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusHours(0);
        int[] intArray59 = localDateTime58.getValues();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withYear(270);
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.hourOfDay();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.withSecondOfMinute(1);
        java.util.Date date66 = localDateTime62.toDate();
        org.joda.time.LocalDateTime localDateTime67 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.hourOfDay();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime67.withSecondOfMinute(1);
        boolean boolean71 = localDateTime62.equals((java.lang.Object) localDateTime70);
        org.joda.time.LocalDateTime.Property property72 = localDateTime62.era();
        org.joda.time.LocalDateTime localDateTime73 = property72.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime74 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime75 = org.joda.time.LocalDateTime.now();
        int int76 = localDateTime74.compareTo((org.joda.time.ReadablePartial) localDateTime75);
        int int77 = localDateTime74.getYearOfEra();
        java.lang.String str78 = localDateTime74.toString();
        org.joda.time.DateTimeZone dateTimeZone80 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long83 = dateTimeZone80.convertLocalToUTC((long) (byte) 100, false);
        long long85 = dateTimeZone80.previousTransition(0L);
        org.joda.time.DateTime dateTime86 = localDateTime74.toDateTime(dateTimeZone80);
        org.joda.time.DateTime dateTime87 = localDateTime73.toDateTime((org.joda.time.ReadableInstant) dateTime86);
        org.joda.time.LocalDateTime.Property property88 = localDateTime73.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = property88.getFieldType();
        org.joda.time.LocalDateTime.Property property90 = localDateTime61.property(dateTimeFieldType89);
        int int91 = localDateTime44.get(dateTimeFieldType89);
        org.joda.time.LocalDateTime.Property property92 = localDateTime29.property(dateTimeFieldType89);
        org.joda.time.LocalDateTime localDateTime94 = localDateTime29.minusSeconds(28681646);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[2022, 2, 12, 64760389]");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 389 + "'", int20 == 389);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "12" + "'", str42, "12");
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2022 + "'", int52 == 2022);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[2022, 2, 12, 0]");
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(date66);
// flaky:         org.junit.Assert.assertEquals(date66.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2022 + "'", int77 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "2022-02-12T17:59:20.389" + "'", str78, "2022-02-12T17:59:20.389");
        org.junit.Assert.assertNotNull(dateTimeZone80);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + (-115199900L) + "'", long83 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(dateTimeFieldType89);
        org.junit.Assert.assertNotNull(property90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 2024 + "'", int91 == 2024);
        org.junit.Assert.assertNotNull(property92);
        org.junit.Assert.assertNotNull(localDateTime94);
    }

    @Test
    public void test19165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19165");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-11T09:49:51.266+32:00");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.time.ZoneId zoneId3 = timeZone1.toZoneId();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("2022-02-11T09:51:27.491");
        int int6 = timeZone5.getRawOffset();
        boolean boolean7 = timeZone1.hasSameRules(timeZone5);
        int int8 = timeZone5.getRawOffset();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusHours(625);
        java.util.Date date17 = localDateTime16.toDate();
        boolean boolean18 = timeZone5.inDaylightTime(date17);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 17 10:00:00 GMT 2022");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19166");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(35741764, 35401202, 35581028, 35581628, 38672091, 35401254, 936);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35581628 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19167");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str5 = dateTimeZone3.getName((long) 115200000);
        int int7 = dateTimeZone3.getStandardOffset((long) 708);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone3);
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        int int11 = dateTimeZone1.getStandardOffset(1644573387294L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
    }

    @Test
    public void test19168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19168");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra((int) (short) 1);
        int int7 = localDateTime6.getYear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.plus(readablePeriod8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.monthOfYear();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.withTime((int) (short) 1, 4, 4, (int) '4');
        int int16 = localDateTime9.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.minusHours(882);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 7, chronology19);
        int int22 = localDateTime21.getEra();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withDurationAdded(readableDuration23, 35410000);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.plusDays(64381346);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime21.minus(readablePeriod28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime21.weekyear();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test19169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19169");
        java.lang.String[] strArray11 = new java.lang.String[] { "1", "hi!", "java.io.IOException", "hi!", "", "hi!", "ja_JP", "ja_JP", "en-US", "en-US", "UTC" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.Spliterator<java.lang.String> strSpliterator14 = strSet12.spliterator();
        java.util.Locale locale15 = java.util.Locale.UK;
        boolean boolean16 = strSet12.contains((java.lang.Object) locale15);
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap20 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList21 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap20);
        boolean boolean22 = strSet12.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18);
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.util.Locale locale24 = java.util.Locale.US;
        java.lang.String str25 = locale23.getDisplayScript(locale24);
        java.lang.String str26 = locale23.getDisplayLanguage();
        java.lang.String str27 = locale23.getVariant();
        java.lang.String str28 = locale23.toLanguageTag();
        java.util.Set<java.lang.String> strSet29 = locale23.getUnicodeLocaleKeys();
        int int30 = strSet29.size();
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strSet29);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap34 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList35 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap34);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(languageRangeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "und" + "'", str28, "und");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(languageRangeList35);
    }

    @Test
    public void test19170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19170");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone6.nextTransition(0L);
        long long12 = dateTimeZone6.convertLocalToUTC((long) (short) 0, true, (-115199900L));
        long long15 = dateTimeZone6.convertLocalToUTC((long) 9, true);
        long long17 = dateTimeZone6.convertUTCToLocal((-3600001L));
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 74);
        long long22 = dateTimeZone6.convertLocalToUTC(1644572978951L, true);
        java.lang.String str24 = dateTimeZone6.getShortName((long) 35701453);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone6, dateTimeZone25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9L + "'", long15 == 9L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3600001L) + "'", long17 == (-3600001L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115200074L + "'", long19 == 115200074L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1644572978951L + "'", long22 == 1644572978951L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
    }

    @Test
    public void test19171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19171");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.ReadableInstant readableInstant2 = null;
        long long3 = property1.getDifferenceAsLong(readableInstant2);
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.getDisplayName();
        int int6 = property1.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime7.toDateTime(readableInstant9);
        int int11 = property1.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone12.getOffset(readableInstant13);
        long long17 = dateTimeZone12.adjustOffset((long) 0, false);
        java.lang.String str18 = dateTimeZone12.toString();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.hourOfDay();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime19.toDateTime(readableInstant21);
        java.lang.String str23 = dateTime22.toString();
        int int24 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime22);
        int int25 = property1.compareTo((org.joda.time.ReadableInstant) dateTime22);
        java.util.Locale locale26 = java.util.Locale.US;
        int int27 = property1.getMaximumTextLength(locale26);
        java.lang.String str28 = locale26.getLanguage();
        java.util.Locale.setDefault(locale26);
        java.lang.String str31 = locale26.getExtension('a');
        java.util.Set<java.lang.String> strSet32 = locale26.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder33 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder36 = builder33.setExtension('a', "era");
        java.util.Locale.Builder builder37 = builder33.clearExtensions();
        java.util.Locale locale38 = builder33.build();
        java.util.Locale locale39 = null;
        java.lang.String str40 = locale38.getDisplayVariant(locale39);
        java.util.Locale locale44 = new java.util.Locale("2022-02-11T09:49:53.176Z", "2022-02-11T09:49:40.688", "2022-02-11T09:49:28.347Z");
        java.util.Locale.Category category45 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale46 = java.util.Locale.getDefault(category45);
        java.lang.String str47 = locale46.getCountry();
        java.util.Locale locale48 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str49 = locale46.getDisplayCountry(locale48);
        java.lang.String str50 = locale48.getISO3Language();
        java.lang.String str51 = locale44.getDisplayCountry(locale48);
        java.util.Locale locale52 = locale44.stripExtensions();
        java.lang.String str53 = locale38.getDisplayVariant(locale44);
        java.lang.String str55 = locale38.getExtension('u');
        java.lang.String str56 = locale38.getDisplayScript();
        java.lang.String str57 = locale26.getDisplayScript(locale38);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English (United States)" + "'", str5, "English (United States)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2022-02-12T17:59:20.537+32:00" + "'", str23, "2022-02-12T17:59:20.537+32:00");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en" + "'", str28, "en");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals(locale44.toString(), "2022-02-11t09:49:53.176z_2022-02-11T09:49:40.688_2022-02-11T09:49:28.347Z");
        org.junit.Assert.assertTrue("'" + category45 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category45.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "US" + "'", str47, "US");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u7f8e\u56fd" + "'", str49, "\u7f8e\u56fd");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "zho" + "'", str50, "zho");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2022-02-11T09:49:40.688" + "'", str51, "2022-02-11T09:49:40.688");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "2022-02-11t09:49:53.176z_2022-02-11T09:49:40.688_2022-02-11T09:49:28.347Z");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test19172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19172");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.minusMillis((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        int int13 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusDays((-1));
        int int16 = localDateTime11.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withYearOfCentury(9);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusDays(41);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.minusMonths(585);
        org.joda.time.LocalDateTime.Property property23 = localDateTime18.millisOfSecond();
        java.lang.String str24 = property23.getAsText();
        java.lang.String str25 = property23.toString();
        org.joda.time.DateTimeField dateTimeField26 = property23.getField();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64760564 + "'", int16 == 64760564);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "564" + "'", str24, "564");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Property[millisOfSecond]" + "'", str25, "Property[millisOfSecond]");
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test19173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19173");
        java.lang.String[] strArray12 = new java.lang.String[] { "2022-02-11T09:49:25.989Z", "java.io.IOException", "2022-02-11T09:49:26.788Z", "2022-02-11T09:49:27.064Z", "999", "1", "-01:00", "hi!", "", "Property[hourOfDay]", "Coordinated Universal Time", "ja_JP" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        boolean boolean16 = strSet13.add("2022-02-11T09:49:24.878Z");
        java.util.Locale.LanguageRange[] languageRangeArray17 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList18 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList18, languageRangeArray17);
        java.lang.String[] strArray24 = new java.lang.String[] { "ja_JP", "ja_JP", "hi!", "ja_JP" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.lang.String str27 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, (java.util.Collection<java.lang.String>) strList25);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream28 = languageRangeList18.stream();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList18, strMap29);
        java.util.Locale locale31 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleKeys();
        java.lang.String str33 = java.util.Locale.lookupTag(languageRangeList30, (java.util.Collection<java.lang.String>) strSet32);
        boolean boolean34 = strSet13.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30);
        java.lang.String[] strArray44 = new java.lang.String[] { "era", "en-US", "en-US", "UTC", "Coordinated Universal Time", "java.io.IOException", "Coordinated Universal Time", "hi!", "2022-02-11T09:49:24.878Z" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        boolean boolean47 = strSet45.isEmpty();
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags(languageRangeList30, (java.util.Collection<java.lang.String>) strSet45, filteringMode48);
        java.io.IOException iOException51 = new java.io.IOException("2022-02-12T17:50:09.289");
        boolean boolean52 = strSet45.contains((java.lang.Object) iOException51);
        java.io.IOException iOException53 = new java.io.IOException((java.lang.Throwable) iOException51);
        java.io.IOException iOException56 = new java.io.IOException("2022-02-11T09:49:26.253Z");
        java.io.IOException iOException57 = new java.io.IOException("2022-02-11T09:49:36.798", (java.lang.Throwable) iOException56);
        iOException53.addSuppressed((java.lang.Throwable) iOException56);
        java.lang.Throwable[] throwableArray59 = iOException56.getSuppressed();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(languageRangeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(languageRangeStream28);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode48.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(throwableArray59);
    }

    @Test
    public void test19174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19174");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2022-02-11T10:46:07.918");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-11t10:46:07.918");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19175");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        timeZone1.setRawOffset(0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long9 = dateTimeZone5.convertLocalToUTC((long) 191, false, 115200009L);
        int int11 = dateTimeZone5.getOffsetFromLocal((long) 646);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 38701894, dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 191L + "'", long9 == 191L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test19176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19176");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.lang.String str6 = locale1.getExtension('a');
        java.lang.String str7 = locale1.getISO3Language();
        java.lang.String str8 = locale1.toLanguageTag();
        java.lang.String str10 = locale1.getExtension('x');
        java.util.Set<java.lang.String> strSet11 = locale1.getUnicodeLocaleAttributes();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDateTime15.getFields();
        int int17 = localDateTime15.getWeekyear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        int[] intArray20 = localDateTime19.getValues();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withCenturyOfEra(2);
        int int23 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        int int24 = localDateTime15.getYear();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime15.withMinuteOfHour((int) '#');
        boolean boolean27 = strSet11.contains((java.lang.Object) localDateTime26);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.hourOfDay();
        org.joda.time.ReadableInstant readableInstant30 = null;
        long long31 = property29.getDifferenceAsLong(readableInstant30);
        java.util.Locale locale32 = java.util.Locale.US;
        java.lang.String str33 = locale32.getDisplayName();
        int int34 = property29.getMaximumTextLength(locale32);
        org.joda.time.LocalDateTime localDateTime35 = property29.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime37 = property29.addToCopy(9);
        org.joda.time.LocalDateTime localDateTime38 = property29.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.minuteOfHour();
        boolean boolean40 = strSet11.remove((java.lang.Object) property39);
        org.joda.time.LocalDateTime localDateTime41 = property39.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusMinutes(694);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(115200000, 4, 2, 12, (int) (byte) 1, (int) (byte) 0, 3);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.minusSeconds(47);
        int int56 = localDateTime52.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property57 = localDateTime52.hourOfDay();
        java.util.Locale locale58 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet59 = locale58.getUnicodeLocaleKeys();
        int int60 = property57.getMaximumTextLength(locale58);
        java.lang.String str61 = locale58.getLanguage();
        java.lang.String str62 = locale58.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = localDateTime41.toString("2022-02-11T09:55:11.811+32:00", locale58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eng" + "'", str7, "eng");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en-US" + "'", str8, "en-US");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(intArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[2022, 2, 12, 64760607]");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "English (United States)" + "'", str33, "English (United States)");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertNotNull(strSet59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "und" + "'", str62, "und");
    }

    @Test
    public void test19177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19177");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = java.util.Locale.ROOT;
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.util.Locale locale4 = java.util.Locale.JAPAN;
        java.lang.String str5 = locale2.getDisplayScript(locale4);
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale0.getDisplayScript(locale4);
        java.lang.String str8 = locale4.toLanguageTag();
        java.lang.String str9 = locale4.getCountry();
        java.lang.String str10 = locale4.getDisplayCountry();
        java.lang.String str11 = locale4.getISO3Language();
        java.lang.String str12 = locale4.getDisplayName();
        java.lang.String str13 = locale4.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ja-JP" + "'", str6, "ja-JP");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ja-JP" + "'", str8, "ja-JP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JP" + "'", str9, "JP");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Japan" + "'", str10, "Japan");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "jpn" + "'", str11, "jpn");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Japanese (Japan)" + "'", str12, "Japanese (Japan)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ja" + "'", str13, "ja");
    }

    @Test
    public void test19178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19178");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 134);
    }

    @Test
    public void test19179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19179");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.writeUnpaddedInteger(writer0, 35581190);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19180");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfMonth();
        int int13 = localDateTime11.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.secondOfMinute();
        java.lang.String str15 = property14.toString();
        int int16 = property14.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfEvenCopy();
        org.joda.time.DurationField durationField18 = property14.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.hourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withEra((int) (short) 1);
        int int25 = localDateTime24.getYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.plus(readablePeriod26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withMillisOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusHours(0);
        int[] intArray32 = localDateTime31.getValues();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withYear(270);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusMillis(696);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.secondOfMinute();
        boolean boolean38 = property14.equals((java.lang.Object) property37);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Property[secondOfMinute]" + "'", str15, "Property[secondOfMinute]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 59 + "'", int16 == 59);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[2022, 2, 12, 0]");
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test19181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19181");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "era");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale.Builder builder10 = builder8.clearExtensions();
        java.util.Locale.Builder builder11 = builder8.clearExtensions();
        java.util.Locale.Builder builder12 = builder8.clearExtensions();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test19182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19182");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        int int7 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime6);
        int int8 = localDateTime5.getYearOfEra();
        java.lang.String str9 = localDateTime5.toString();
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) localDateTime5);
        long long14 = dateTimeZone1.convertLocalToUTC((long) 35341075, true, (long) (-1));
        java.lang.String str16 = dateTimeZone1.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withEra((int) (short) 1);
        int int24 = localDateTime23.getYear();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.plus(readablePeriod25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.monthOfYear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.withTime((int) (short) 1, 4, 4, (int) '4');
        int int33 = localDateTime26.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime26.minusHours(882);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withWeekyear(39);
        boolean boolean38 = localDateTime17.isAfter((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minus(readablePeriod39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime42 = localDateTime37.withSecondOfMinute(71142577);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 71142577 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022-02-12T17:59:20.672" + "'", str9, "2022-02-12T17:59:20.672");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-79858925L) + "'", long14 == (-79858925L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(localDateTime40);
    }

    @Test
    public void test19183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19183");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        java.lang.String str12 = property10.getName();
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Locale locale14 = locale13.stripExtensions();
        int int15 = property10.getMaximumShortTextLength(locale13);
        java.lang.String str16 = property10.getAsText();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone17.getOffset(readableInstant18);
        long long22 = dateTimeZone17.adjustOffset((long) 0, false);
        java.lang.String str23 = dateTimeZone17.toString();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.hourOfDay();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.DateTime dateTime27 = localDateTime24.toDateTime(readableInstant26);
        java.lang.String str28 = dateTime27.toString();
        int int29 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) dateTime27);
        int int30 = property10.compareTo((org.joda.time.ReadableInstant) dateTime27);
        int int31 = property10.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime32 = property10.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology33 = localDateTime32.getChronology();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minus(readableDuration36);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "era" + "'", str12, "era");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AD" + "'", str16, "AD");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2022-02-12T17:59:20.686+32:00" + "'", str28, "2022-02-12T17:59:20.686+32:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(localDateTime37);
    }

    @Test
    public void test19184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19184");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.time.ZoneId zoneId2 = timeZone0.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone(zoneId2);
        int int5 = timeZone4.getRawOffset();
        timeZone4.setRawOffset(0);
        java.time.ZoneId zoneId8 = timeZone4.toZoneId();
        int int10 = timeZone4.getOffset(1644457776798L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = timeZone4.getDisplayName(false, 171);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 171");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(zoneId8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test19185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19185");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        int int3 = localDateTime0.getYearOfEra();
        java.lang.String str4 = localDateTime0.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long9 = dateTimeZone6.convertLocalToUTC((long) (byte) 100, false);
        long long11 = dateTimeZone6.previousTransition(0L);
        org.joda.time.DateTime dateTime12 = localDateTime0.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        org.joda.time.tz.NameProvider nameProvider15 = org.joda.time.DateTimeZone.getNameProvider();
        java.lang.String[] strArray25 = new java.lang.String[] { "era", "en-US", "en-US", "UTC", "Coordinated Universal Time", "java.io.IOException", "Coordinated Universal Time", "hi!", "2022-02-11T09:49:24.878Z" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        boolean boolean28 = strSet26.isEmpty();
        java.util.Locale locale29 = java.util.Locale.ROOT;
        java.util.Locale locale30 = java.util.Locale.US;
        java.lang.String str31 = locale29.getDisplayScript(locale30);
        java.util.Locale locale32 = java.util.Locale.JAPAN;
        java.lang.String str33 = locale30.getDisplayScript(locale32);
        boolean boolean34 = strSet26.equals((java.lang.Object) locale32);
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale36 = java.util.Locale.ROOT;
        java.util.Locale locale37 = java.util.Locale.US;
        java.lang.String str38 = locale36.getDisplayScript(locale37);
        java.util.Locale locale39 = java.util.Locale.JAPAN;
        java.lang.String str40 = locale37.getDisplayScript(locale39);
        java.lang.String str41 = locale39.toLanguageTag();
        java.lang.String str42 = locale35.getDisplayScript(locale39);
        java.lang.String str43 = locale35.getVariant();
        java.lang.String str44 = locale32.getDisplayCountry(locale35);
        java.lang.String str47 = nameProvider15.getShortName(locale32, "2022-02-11T09:49:27.737+32:00", "2022-02-11T09:49:36.798");
        java.util.Locale locale51 = new java.util.Locale("\u82f1\u6587", "Coordinated Universal Time", "2022-02-11T09:49:32.430Z");
        java.lang.String str54 = nameProvider15.getShortName(locale51, "2022-02-11T09:49:32.375Z", "2022-02-11T09:49:32.296Z");
        java.util.Locale locale55 = null;
        java.lang.String str58 = nameProvider15.getName(locale55, "2022-02-12T17:49:47.427+32:00", "2022-02-11T09:49:50.116");
        java.util.Locale locale59 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale60 = java.util.Locale.ROOT;
        java.util.Locale locale61 = java.util.Locale.US;
        java.lang.String str62 = locale60.getDisplayScript(locale61);
        java.util.Locale locale63 = java.util.Locale.JAPAN;
        java.lang.String str64 = locale61.getDisplayScript(locale63);
        java.lang.String str65 = locale63.toLanguageTag();
        java.lang.String str66 = locale59.getDisplayScript(locale63);
        java.lang.String str67 = locale59.getVariant();
        java.util.Locale.setDefault(locale59);
        java.lang.String str71 = nameProvider15.getShortName(locale59, "2022-02-12T17:49:47.900+32:00", "2022-02-11T09:49:26.561Z");
        java.lang.String str72 = dateTimeZone6.getShortName((long) (-3600000), locale59);
        int int74 = dateTimeZone6.getOffset(115200001L);
        boolean boolean76 = dateTimeZone6.isStandardOffset(618L);
        long long80 = dateTimeZone6.convertLocalToUTC((long) 366, false, (long) 946);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-12T17:59:20.760" + "'", str4, "2022-02-12T17:59:20.760");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-115199900L) + "'", long9 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(nameProvider15);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ja-JP" + "'", str41, "ja-JP");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u65e5\u672c" + "'", str44, "\u65e5\u672c");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals(locale51.toString(), "\u82f1\u6587_COORDINATED UNIVERSAL TIME_2022-02-11T09:49:32.430Z");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ja-JP" + "'", str65, "ja-JP");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "+32:00" + "'", str72, "+32:00");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 115200000 + "'", int74 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + (-115199634L) + "'", long80 == (-115199634L));
    }

    @Test
    public void test19186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19186");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.ReadableInstant readableInstant2 = null;
        long long3 = property1.getDifferenceAsLong(readableInstant2);
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.getDisplayName();
        int int6 = property1.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime7 = property1.roundHalfFloorCopy();
        int int8 = localDateTime7.getEra();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str5, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test19187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19187");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((-115199027L));
    }

    @Test
    public void test19188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19188");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minus(readablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusYears(42);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minusMinutes(100);
        int int13 = localDateTime8.getEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.withYear(35341799);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime16.toDateTime(readableInstant18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withYearOfCentury(39);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMonths((int) 'x');
        int[] intArray24 = localDateTime21.getValues();
        int int25 = localDateTime21.getDayOfYear();
        boolean boolean26 = localDateTime15.isEqual((org.joda.time.ReadablePartial) localDateTime21);
        int int27 = localDateTime21.getYear();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime21.minus(readableDuration28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusWeeks(35421000);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.hourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withEra((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = localDateTime36.getFieldType(1);
        int int41 = localDateTime36.getWeekyear();
        int int42 = localDateTime36.size();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime32.withFields((org.joda.time.ReadablePartial) localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(intArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[2039, 2, 12, 64760800]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 43 + "'", int25 == 43);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2039 + "'", int27 == 2039);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2022 + "'", int41 == 2022);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
        org.junit.Assert.assertNotNull(localDateTime43);
    }

    @Test
    public void test19189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19189");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = localDateTime3.getFieldType(1);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.plus(readableDuration8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        int int11 = localDateTime9.getCenturyOfEra();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
    }

    @Test
    public void test19190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19190");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("2022-02-11T09:57:02.658");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '2022-02-11T09:57:02.658' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19191");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        long long6 = dateTimeZone1.previousTransition(0L);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone1);
        long long9 = dateTimeZone1.convertUTCToLocal(43L);
        int int11 = dateTimeZone1.getOffset((long) 64201877);
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) 1644573023359L);
        long long16 = dateTimeZone1.convertLocalToUTC((long) 2168, false);
        boolean boolean17 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 115200043L + "'", long9 == 115200043L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115197832L) + "'", long16 == (-115197832L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test19192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19192");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2022-02-11T09:56:38.923", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19193");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "era");
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        int int6 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        int int7 = localDateTime4.getYearOfEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusMonths(115200000);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale12.getScript();
        java.lang.String str14 = property11.getAsShortText(locale12);
        java.util.Locale.Builder builder15 = builder0.setLocale(locale12);
        java.util.Locale locale16 = builder0.build();
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleAttributes();
        java.lang.String str19 = locale17.getCountry();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.hourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withSecondOfMinute(1);
        java.util.Date date24 = localDateTime20.toDate();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.hourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withSecondOfMinute(1);
        boolean boolean29 = localDateTime20.equals((java.lang.Object) localDateTime28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime20.era();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        int int34 = localDateTime32.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        int int35 = localDateTime32.getYearOfEra();
        java.lang.String str36 = localDateTime32.toString();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long41 = dateTimeZone38.convertLocalToUTC((long) (byte) 100, false);
        long long43 = dateTimeZone38.previousTransition(0L);
        org.joda.time.DateTime dateTime44 = localDateTime32.toDateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime45 = localDateTime31.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime31.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property46.getFieldType();
        long long48 = property46.remainder();
        java.util.Locale locale49 = java.util.Locale.US;
        java.lang.String str50 = property46.getAsShortText(locale49);
        java.lang.String str51 = locale49.getDisplayCountry();
        java.lang.String str52 = locale17.getDisplayScript(locale49);
        java.lang.String str53 = locale16.getDisplayVariant(locale49);
        java.util.Set<java.lang.String> strSet54 = locale16.getUnicodeLocaleAttributes();
        java.lang.Object obj55 = locale16.clone();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "9602022" + "'", str14, "9602022");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "FR" + "'", str19, "FR");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2022 + "'", int35 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2022-02-12T17:59:20.866" + "'", str36, "2022-02-12T17:59:20.866");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-115199900L) + "'", long41 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "1" + "'", str50, "1");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\u7f8e\u570b" + "'", str51, "\u7f8e\u570b");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "en");
    }

    @Test
    public void test19194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19194");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        long long6 = dateTimeZone1.previousTransition(0L);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(9);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minus(readablePeriod10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withDayOfMonth(478);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 478 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test19195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19195");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        boolean boolean5 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone6.nextTransition(0L);
        long long12 = dateTimeZone6.convertLocalToUTC((long) (short) 0, true, (-115199900L));
        long long15 = dateTimeZone6.convertLocalToUTC((long) 9, true);
        long long17 = dateTimeZone6.convertUTCToLocal((-3600001L));
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) 74);
        boolean boolean21 = dateTimeZone1.equals((java.lang.Object) (short) 1);
        int int23 = dateTimeZone1.getOffset(63780054566714L);
        long long25 = dateTimeZone1.nextTransition((long) 86399999);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        int int28 = dateTimeZone26.getOffsetFromLocal((long) 2022);
        java.lang.String str30 = dateTimeZone26.getName(100L);
        long long32 = dateTimeZone26.nextTransition((long) '4');
        long long34 = dateTimeZone1.getMillisKeepLocal(dateTimeZone26, (long) 35461618);
        int int36 = dateTimeZone1.getStandardOffset((long) 800);
        java.util.TimeZone timeZone37 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9L + "'", long15 == 9L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3600001L) + "'", long17 == (-3600001L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115200074L + "'", long19 == 115200074L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 115200000 + "'", int23 == 115200000);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 86399999L + "'", long25 == 86399999L);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 52L + "'", long32 == 52L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 150661618L + "'", long34 == 150661618L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 115200000 + "'", int36 == 115200000);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u6642\u9593");
    }

    @Test
    public void test19196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19196");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("etc/utc_1", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19197");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("2022-02-11T09:49:26.040");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale3.getDisplayVariant(locale6);
        java.lang.String str8 = locale3.getISO3Country();
        java.lang.String str11 = nameProvider0.getName(locale3, "2022-02-11T09:53:05.273", "2022-02-12T17:51:10.602+32:00");
        java.util.Locale locale14 = new java.util.Locale("Etc/UTC", "1");
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.lang.String str18 = nameProvider0.getName(locale14, "2022-02-11T09:54:37.495Z", "2022-02-11T09:55:25.087Z");
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long24 = dateTimeZone20.convertLocalToUTC((long) (byte) 100, false, (-115199900L));
        boolean boolean26 = dateTimeZone20.isStandardOffset(0L);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) str18, dateTimeZone20);
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals(locale14.toString(), "etc/utc_1");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3600100L + "'", long24 == 3600100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test19198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19198");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(992, 444);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 444");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19199");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Locale locale3 = java.util.Locale.JAPAN;
        java.lang.String str4 = locale1.getDisplayScript(locale3);
        java.lang.String str5 = locale3.getDisplayCountry();
        java.lang.String str6 = locale3.getScript();
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.hourOfDay();
        org.joda.time.ReadableInstant readableInstant11 = null;
        long long12 = property10.getDifferenceAsLong(readableInstant11);
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale13.getDisplayName();
        int int15 = property10.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime16.toDateTime(readableInstant18);
        int int20 = property10.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone21.getOffset(readableInstant22);
        long long26 = dateTimeZone21.adjustOffset((long) 0, false);
        java.lang.String str27 = dateTimeZone21.toString();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.hourOfDay();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.DateTime dateTime31 = localDateTime28.toDateTime(readableInstant30);
        java.lang.String str32 = dateTime31.toString();
        int int33 = dateTimeZone21.getOffset((org.joda.time.ReadableInstant) dateTime31);
        int int34 = property10.compareTo((org.joda.time.ReadableInstant) dateTime31);
        java.util.Locale locale35 = java.util.Locale.US;
        int int36 = property10.getMaximumTextLength(locale35);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.hourOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withSecondOfMinute(1);
        java.util.Date date41 = localDateTime37.toDate();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.hourOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withSecondOfMinute(1);
        boolean boolean46 = localDateTime37.equals((java.lang.Object) localDateTime45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime37.era();
        org.joda.time.LocalDateTime localDateTime48 = property47.roundHalfEvenCopy();
        java.lang.String str49 = property47.getAsText();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant51 = null;
        int int52 = dateTimeZone50.getOffset(readableInstant51);
        long long55 = dateTimeZone50.adjustOffset((long) 0, false);
        java.lang.String str56 = dateTimeZone50.toString();
        boolean boolean58 = dateTimeZone50.isStandardOffset((long) 49);
        java.util.Locale locale60 = java.util.Locale.FRANCE;
        java.lang.String str61 = dateTimeZone50.getShortName((long) ' ', locale60);
        java.lang.String str62 = property47.getAsText(locale60);
        java.lang.String str63 = locale35.getDisplayVariant(locale60);
        java.util.Locale.setDefault(category7, locale35);
        java.lang.String str65 = locale3.getDisplayName(locale35);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u65e5\u672c" + "'", str5, "\u65e5\u672c");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str14, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2022-02-12T17:59:20.969+32:00" + "'", str32, "2022-02-12T17:59:20.969+32:00");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(date41);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Sat Feb 12 17:59:20 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u897f\u5143" + "'", str49, "\u897f\u5143");
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "UTC" + "'", str56, "UTC");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+00:00" + "'", str61, "+00:00");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ap. J.-C." + "'", str62, "ap. J.-C.");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Japanese (Japan)" + "'", str65, "Japanese (Japan)");
    }

    @Test
    public void test19200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19200");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        int int2 = dateTimeZone0.getOffsetFromLocal((long) 2022);
        java.lang.String str4 = dateTimeZone0.getName(100L);
        boolean boolean6 = dateTimeZone0.isStandardOffset(63780169766714L);
        boolean boolean7 = dateTimeZone0.isFixed();
        int int9 = dateTimeZone0.getOffset((long) 64261162);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str15 = dateTimeZone13.getName((long) 115200000);
        int int17 = dateTimeZone13.getStandardOffset((long) 708);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone13);
        boolean boolean19 = dateTimeZone11.isLocalDateTimeGap(localDateTime18);
        java.lang.String str20 = dateTimeZone11.toString();
        long long22 = dateTimeZone0.getMillisKeepLocal(dateTimeZone11, 899455436L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 784255436L + "'", long22 == 784255436L);
    }

    @Test
    public void test19201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19201");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "era");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.UK;
        java.lang.String str7 = locale5.getExtension('a');
        java.util.Locale.Builder builder8 = builder3.setLocale(locale5);
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setLanguageTag("n. Chr.");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: n. Chr. [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test19202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19202");
        java.util.Locale locale2 = new java.util.Locale("2022-02-11T09:51:40.608", "2022-02-11T09:58:09.894+32:00");
        org.junit.Assert.assertEquals(locale2.toString(), "2022-02-11t09:51:40.608_2022-02-11T09:58:09.894+32:00");
    }

    @Test
    public void test19203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19203");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        int int6 = localDateTime5.getYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusYears(35641317);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = localDateTime5.toString(dateTimeFormatter9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime5.monthOfYear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-12T17:59:01.016" + "'", str10, "2022-02-12T17:59:01.016");
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test19204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19204");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusWeeks(999);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = null;
        java.lang.String str5 = localDateTime3.toString(dateTimeFormatter4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = property6.addToCopy(1644572984550L);
        int int9 = localDateTime8.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusSeconds(35905860);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2041-04-06T17:59:21.028" + "'", str5, "2041-04-06T17:59:21.028");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13745578 + "'", int9 == 13745578);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test19205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19205");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1, chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.monthOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test19206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19206");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long6 = dateTimeZone1.adjustOffset((long) 0, false);
        java.lang.String str7 = dateTimeZone1.toString();
        long long9 = dateTimeZone1.previousTransition(10L);
        java.util.Locale locale11 = java.util.Locale.ROOT;
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.util.Locale locale14 = java.util.Locale.JAPAN;
        java.lang.String str15 = locale12.getDisplayScript(locale14);
        java.lang.String str16 = dateTimeZone1.getName((long) 2022, locale12);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(100L, dateTimeZone1);
        int int19 = dateTimeZone1.getStandardOffset((-115199900L));
        long long21 = dateTimeZone1.nextTransition(22L);
        java.util.TimeZone timeZone22 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusDays(39121983);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plus(readableDuration26);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.hourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withSecondOfMinute(1);
        java.util.Date date32 = localDateTime28.toDate();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.hourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withSecondOfMinute(1);
        boolean boolean37 = localDateTime28.equals((java.lang.Object) localDateTime36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime28.minusMillis((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfSecond();
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.monthOfYear();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.plusYears(2022);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.plusMonths(563);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.hourOfDay();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.minus(readablePeriod53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusYears(42);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.withWeekyear(74);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plus(readablePeriod59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.plusYears(36);
        int int63 = localDateTime45.compareTo((org.joda.time.ReadablePartial) localDateTime58);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime45.plusWeeks(61);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.plusHours(5);
        boolean boolean68 = localDateTime23.isBefore((org.joda.time.ReadablePartial) localDateTime65);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 22L + "'", long21 == 22L);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Sat Feb 12 17:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test19207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19207");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2022-02-11T09:56:50.716", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19208");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        int int7 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime6);
        int int8 = localDateTime5.getYearOfEra();
        java.lang.String str9 = localDateTime5.toString();
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) localDateTime5);
        long long14 = dateTimeZone1.convertLocalToUTC((long) 35341075, true, (long) (-1));
        java.lang.String str16 = dateTimeZone1.getNameKey((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withEra((int) (short) 1);
        int int24 = localDateTime23.getYear();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.plus(readablePeriod25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.monthOfYear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.withTime((int) (short) 1, 4, 4, (int) '4');
        int int33 = localDateTime26.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime26.minusHours(882);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withWeekyear(39);
        boolean boolean38 = localDateTime17.isAfter((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime.Property property39 = localDateTime17.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022-02-12T17:59:21.094" + "'", str9, "2022-02-12T17:59:21.094");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-79858925L) + "'", long14 == (-79858925L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(property39);
    }

    @Test
    public void test19209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19209");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        java.lang.String str12 = property10.getAsText();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone13.getOffset(readableInstant14);
        long long18 = dateTimeZone13.adjustOffset((long) 0, false);
        java.lang.String str19 = dateTimeZone13.toString();
        boolean boolean21 = dateTimeZone13.isStandardOffset((long) 49);
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.lang.String str24 = dateTimeZone13.getShortName((long) ' ', locale23);
        java.lang.String str25 = property10.getAsText(locale23);
        org.joda.time.LocalDateTime localDateTime26 = property10.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withMillisOfSecond(35581173);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35581173 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Sat Feb 12 17:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u897f\u5143" + "'", str12, "\u897f\u5143");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ap. J.-C." + "'", str25, "ap. J.-C.");
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test19210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19210");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.ReadableInstant readableInstant2 = null;
        long long3 = property1.getDifferenceAsLong(readableInstant2);
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.getDisplayName();
        int int6 = property1.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime7.toDateTime(readableInstant9);
        int int11 = property1.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone12.getOffset(readableInstant13);
        long long17 = dateTimeZone12.adjustOffset((long) 0, false);
        java.lang.String str18 = dateTimeZone12.toString();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.hourOfDay();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime19.toDateTime(readableInstant21);
        java.lang.String str23 = dateTime22.toString();
        int int24 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime22);
        int int25 = property1.compareTo((org.joda.time.ReadableInstant) dateTime22);
        java.util.Locale locale26 = java.util.Locale.US;
        int int27 = property1.getMaximumTextLength(locale26);
        org.joda.time.LocalDateTime localDateTime28 = property1.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusMinutes(2);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.year();
        java.util.Locale locale32 = java.util.Locale.US;
        java.lang.String str33 = locale32.getDisplayName();
        java.lang.String str34 = locale32.getDisplayVariant();
        java.lang.String str35 = property31.getAsShortText(locale32);
        java.lang.String str36 = property31.getAsText();
        org.joda.time.LocalDateTime localDateTime38 = property31.addToCopy(334);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusHours(789);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.minusSeconds(64381803);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str5, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2022-02-12T17:59:21.122+32:00" + "'", str23, "2022-02-12T17:59:21.122+32:00");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u82f1\u6587\u7f8e\u570b)" + "'", str33, "\u82f1\u6587\u7f8e\u570b)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2022" + "'", str35, "2022");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2022" + "'", str36, "2022");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
    }

    @Test
    public void test19211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19211");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withSecondOfMinute(1);
        java.util.Date date7 = localDateTime3.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        boolean boolean12 = localDateTime3.equals((java.lang.Object) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField(0);
        boolean boolean17 = localDateTime0.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withSecondOfMinute(1);
        java.util.Date date22 = localDateTime18.toDate();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.fromDateFields(date22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withHourOfDay((int) (byte) 10);
        int[] intArray26 = localDateTime23.getValues();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.plusMillis((int) 'x');
        org.joda.time.DateTime dateTime29 = localDateTime23.toDateTime();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        int[] intArray32 = localDateTime31.getValues();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.hourOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withHourOfDay(10);
        boolean boolean37 = localDateTime31.isAfter((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime31.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = localDateTime31.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime23.withField(dateTimeFieldType41, 24);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime14.withField(dateTimeFieldType41, 35704000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime47 = localDateTime14.withMinuteOfHour(35581368);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35581368 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Sat Feb 12 17:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Sat Feb 12 17:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(intArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[2022, 2, 12, 64761142]");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(intArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[2022, 2, 12, 64761142]");
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
    }

    @Test
    public void test19212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19212");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withSecondOfMinute(1);
        java.util.Date date7 = localDateTime3.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        boolean boolean12 = localDateTime3.equals((java.lang.Object) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField(0);
        boolean boolean17 = localDateTime0.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withSecondOfMinute(1);
        java.util.Date date22 = localDateTime18.toDate();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withSecondOfMinute(1);
        boolean boolean27 = localDateTime18.equals((java.lang.Object) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime18.era();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property30.getFieldType();
        org.joda.time.LocalDateTime.Property property32 = localDateTime14.property(dateTimeFieldType31);
        org.joda.time.LocalDateTime localDateTime33 = property32.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusYears(46);
        int int36 = localDateTime33.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property37 = localDateTime33.year();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Sat Feb 12 17:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Sat Feb 12 17:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property37);
    }

    @Test
    public void test19213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19213");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long7 = dateTimeZone4.convertLocalToUTC((long) (byte) 100, false);
        long long9 = dateTimeZone4.previousTransition(0L);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) "2022-02-11T09:49:26.424", dateTimeZone4);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 35476404, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 984, chronology12);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusDays(35581852);
        int int18 = localDateTime15.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115199900L) + "'", long7 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test19214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19214");
        java.util.Locale locale2 = new java.util.Locale("2022-02-12T17:53:00.837+32:00", "+00:00:00.001");
        org.junit.Assert.assertEquals(locale2.toString(), "2022-02-12t17:53:00.837+32:00_+00:00:00.001");
    }

    @Test
    public void test19215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19215");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1, chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.ROOT;
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale5.getDisplayScript(locale6);
        java.util.Locale locale8 = java.util.Locale.JAPAN;
        java.lang.String str9 = locale6.getDisplayScript(locale8);
        java.lang.String str10 = locale8.toLanguageTag();
        java.lang.String str11 = locale4.getDisplayScript(locale8);
        int int12 = property3.getMaximumShortTextLength(locale8);
        org.joda.time.LocalDateTime localDateTime13 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime15 = property3.addToCopy(3600100L);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        int int18 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.hourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withSecondOfMinute(1);
        java.util.Date date23 = localDateTime19.toDate();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.hourOfDay();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withSecondOfMinute(1);
        boolean boolean28 = localDateTime19.equals((java.lang.Object) localDateTime27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime19.era();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField32 = localDateTime30.getField(0);
        boolean boolean33 = localDateTime16.isEqual((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.LocalDateTime.Property property34 = localDateTime30.centuryOfEra();
        org.joda.time.Chronology chronology35 = localDateTime30.getChronology();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime30.withWeekyear(1);
        int int38 = localDateTime37.getCenturyOfEra();
        org.joda.time.DateTimeField[] dateTimeFieldArray39 = localDateTime37.getFields();
        int int40 = property3.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime42 = property3.addToCopy(788);
        int int43 = localDateTime42.getDayOfWeek();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ja-JP" + "'", str10, "ja-JP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Sat Feb 12 17:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
    }

    @Test
    public void test19216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19216");
        java.io.IOException iOException1 = new java.io.IOException("2022-02-11T09:58:53.656Z");
    }

    @Test
    public void test19217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19217");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minus(readablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMinutes(43);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = localDateTime5.isSupported(durationFieldType11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.plusYears(608);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.plusSeconds(4);
        int int17 = localDateTime5.getMinuteOfHour();
        org.joda.time.DurationFieldType durationFieldType18 = null;
        boolean boolean19 = localDateTime5.isSupported(durationFieldType18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(31);
        long long25 = dateTimeZone21.convertLocalToUTC((long) (byte) 1, true, (long) 536);
        java.lang.String str27 = dateTimeZone21.getName((long) 35341681);
        org.joda.time.DateTime dateTime28 = localDateTime5.toDateTime(dateTimeZone21);
        org.joda.time.Instant instant29 = dateTime28.toInstant();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 59 + "'", int17 == 59);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-111599999L) + "'", long25 == (-111599999L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+31:00" + "'", str27, "+31:00");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(instant29);
    }

    @Test
    public void test19218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19218");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(64668275, 35733000, 858, 39400161, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39400161 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19219");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray4 = localDateTime3.getFields();
        int int5 = localDateTime3.getWeekyear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withCenturyOfEra((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        long long9 = property8.remainder();
        org.joda.time.LocalDateTime localDateTime10 = property8.roundHalfEvenCopy();
        java.lang.String str11 = property8.getAsString();
        int int12 = property8.getMinimumValue();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3520741249L + "'", long9 == 3520741249L);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10022" + "'", str11, "10022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-292275054) + "'", int12 == (-292275054));
    }

    @Test
    public void test19220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19220");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray4 = localDateTime3.getFields();
        int int5 = localDateTime3.getWeekyear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        int[] intArray8 = localDateTime7.getValues();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withCenturyOfEra(2);
        int int11 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDateTime15.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = localDateTime15.getFieldType(0);
        int int19 = localDateTime7.get(dateTimeFieldType18);
        int int20 = localDateTime7.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime7.withWeekyear((-1));
        org.joda.time.LocalDateTime localDateTime24 = localDateTime7.plusSeconds(69);
        org.joda.time.DateTime dateTime25 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime7.minusHours(6);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withYearOfEra(35341230);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.minusYears((-20));
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.centuryOfEra();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[2022, 2, 12, 64761259]");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 259 + "'", int20 == 259);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test19221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19221");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setRawOffset(1);
        timeZone0.setID("Sat");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeZone0.getOffset(949, 2089, 35579003, 432000000, 64261610, 35492102);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test19222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19222");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("Property[secondOfMinute]");
        java.util.Set<java.lang.String> strSet3 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone5 = provider0.getZone("2022-02-11T09:50:39.230Z");
        java.util.Set<java.lang.String> strSet6 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test19223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19223");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("2022-02-11T09:50:29.481");
        boolean boolean2 = locale1.hasExtensions();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19224");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 35461201);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.yearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test19225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19225");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "era");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("2022-02-11T09:49:34.640Z");
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("2022-02-11T09:49:49.623+32:00");
        java.util.Locale locale12 = java.util.Locale.US;
        java.util.Locale.setDefault(locale12);
        java.lang.String str14 = locale12.toLanguageTag();
        java.lang.String str15 = locale12.getISO3Country();
        java.lang.String str16 = locale11.getDisplayLanguage(locale12);
        java.lang.String str17 = locale9.getDisplayScript(locale12);
        java.util.Locale.Builder builder18 = builder7.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder7.setScript("2022-02-11T09:55:16.711Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 2022-02-11T09:55:16.711Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-US" + "'", str14, "en-US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "USA" + "'", str15, "USA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test19226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19226");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.monthOfYear();
        int int4 = property3.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime6 = property3.addToCopy(9);
        int int7 = property3.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime9 = property3.addWrapFieldToCopy(69);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readableDuration10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plus(readablePeriod12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.withDurationAdded(readableDuration14, 35401608);
        org.joda.time.LocalDateTime.Property property17 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = property17.addToCopy(35579003L);
        java.lang.String str20 = property17.getAsShortText();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "311" + "'", str20, "311");
    }

    @Test
    public void test19227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19227");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        int[] intArray14 = localDateTime13.getValues();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withCenturyOfEra(2);
        boolean boolean17 = localDateTime11.isBefore((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.hourOfDay();
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.DateTime dateTime23 = localDateTime20.toDateTime(readableInstant22);
        java.lang.String str24 = dateTime23.toString();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.hourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray29 = localDateTime28.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = localDateTime28.getFieldType(0);
        int int32 = dateTime23.get(dateTimeFieldType31);
        boolean boolean33 = localDateTime13.isSupported(dateTimeFieldType31);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime13.withMillisOfDay(326);
        int int36 = localDateTime13.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        int int39 = localDateTime37.compareTo((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.hourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withSecondOfMinute(1);
        java.util.Date date44 = localDateTime40.toDate();
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.hourOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withSecondOfMinute(1);
        boolean boolean49 = localDateTime40.equals((java.lang.Object) localDateTime48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime40.era();
        org.joda.time.LocalDateTime localDateTime51 = property50.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField53 = localDateTime51.getField(0);
        boolean boolean54 = localDateTime37.isEqual((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.withMillisOfDay(35401288);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime51.withMillisOfSecond(17);
        org.joda.time.Chronology chronology59 = localDateTime51.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((java.lang.Object) int36, chronology59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Sat Feb 12 17:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(intArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[2022, 2, 12, 64761322]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022-02-12T17:59:21.322+32:00" + "'", str24, "2022-02-12T17:59:21.322+32:00");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldArray29);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2022 + "'", int32 == 2022);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(localDateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 59 + "'", int36 == 59);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Sat Feb 12 17:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(chronology59);
    }

    @Test
    public void test19228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19228");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1644573073166L);
    }

    @Test
    public void test19229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19229");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        long long5 = dateTimeZone0.adjustOffset((long) 0, false);
        java.lang.String str6 = dateTimeZone0.toString();
        boolean boolean8 = dateTimeZone0.isStandardOffset((long) 49);
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = dateTimeZone0.getShortName((long) ' ', locale10);
        int int13 = dateTimeZone0.getOffset(63780054566714L);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray18 = localDateTime17.getFields();
        int int19 = localDateTime17.getWeekyear();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        int[] intArray22 = localDateTime21.getValues();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withCenturyOfEra(2);
        int int25 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.hourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray30 = localDateTime29.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = localDateTime29.getFieldType(0);
        int int33 = localDateTime21.get(dateTimeFieldType32);
        int int34 = localDateTime21.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime21.withWeekyear((-1));
        org.joda.time.LocalDateTime localDateTime38 = localDateTime21.plusSeconds(69);
        org.joda.time.DateTime dateTime39 = localDateTime21.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime39.getZone();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.hourOfDay();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withSecondOfMinute(1);
        java.util.Locale locale46 = java.util.Locale.US;
        boolean boolean47 = localDateTime45.equals((java.lang.Object) locale46);
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.hourOfDay();
        org.joda.time.ReadableInstant readableInstant50 = null;
        long long51 = property49.getDifferenceAsLong(readableInstant50);
        java.util.Locale locale52 = java.util.Locale.US;
        java.lang.String str53 = locale52.getDisplayName();
        int int54 = property49.getMaximumTextLength(locale52);
        java.lang.String str55 = locale46.getDisplayVariant(locale52);
        java.util.Locale locale56 = java.util.Locale.ROOT;
        java.util.Locale locale57 = java.util.Locale.US;
        java.lang.String str58 = locale56.getDisplayScript(locale57);
        java.lang.String str59 = locale46.getDisplayName(locale57);
        java.util.Set<java.lang.String> strSet60 = locale46.getUnicodeLocaleAttributes();
        java.lang.String str61 = dateTimeZone40.getName(13947392L, locale46);
        java.util.Locale locale66 = new java.util.Locale("2041-04-05T09:50:38.110", "2022-02-15T13:51:58.411+100:02", "Property[year]");
        java.lang.String str67 = dateTimeZone40.getName((-241319883L), locale66);
        long long69 = dateTimeZone0.getMillisKeepLocal(dateTimeZone40, (long) 35590759);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
        org.junit.Assert.assertNotNull(intArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[2022, 2, 12, 64761345]");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldArray30);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 345 + "'", int34 == 345);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 32L + "'", long51 == 32L);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "English (United States)" + "'", str53, "English (United States)");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "English (United States)" + "'", str59, "English (United States)");
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+32:00" + "'", str61, "+32:00");
        org.junit.Assert.assertEquals(locale66.toString(), "2041-04-05t09:50:38.110_2022-02-15T13:51:58.411+100:02_Property[year]");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+32:00" + "'", str67, "+32:00");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-79609241L) + "'", long69 == (-79609241L));
    }

    @Test
    public void test19230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19230");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours(31);
        boolean boolean4 = dateTimeZone2.isStandardOffset((long) 2);
        boolean boolean6 = dateTimeZone2.isStandardOffset(63780169770482L);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) "2022-02-11T09:52:13.791", dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test19231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19231");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '4');
        long long6 = dateTimeZone2.convertLocalToUTC((long) 69, true, 0L);
        java.lang.String str7 = dateTimeZone2.getID();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withEra((int) (short) 1);
        int int14 = localDateTime13.getYear();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plus(readablePeriod15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.monthOfYear();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withTime((int) (short) 1, 4, 4, (int) '4');
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plus(readableDuration23);
        int int25 = localDateTime22.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.hourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withSecondOfMinute(1);
        java.util.Date date30 = localDateTime26.toDate();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.hourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withSecondOfMinute(1);
        boolean boolean35 = localDateTime26.equals((java.lang.Object) localDateTime34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime26.dayOfYear();
        int int37 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        boolean boolean38 = dateTimeZone2.isLocalDateTimeGap(localDateTime26);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime26.minusHours(271);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plus(readableDuration41);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3119931L) + "'", long6 == (-3119931L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:52" + "'", str7, "+00:52");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 43 + "'", int25 == 43);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Sat Feb 12 17:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
    }

    @Test
    public void test19232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19232");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "era");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("ERA");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder7.clear();
        java.util.Locale.Builder builder10 = builder7.clear();
        java.util.Locale locale11 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder7.setUnicodeLocaleKeyword("2022-02-11T09:51:50.147Z", "\u4e2d\u6587\u4e2d\u570b)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 2022-02-11T09:51:50.147Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test19233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19233");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 10);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        java.util.Locale locale3 = java.util.Locale.ROOT;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.lang.String str5 = property2.getAsText(locale3);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
        java.lang.String str7 = property2.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "28800010" + "'", str5, "28800010");
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28800010" + "'", str7, "28800010");
    }

    @Test
    public void test19234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19234");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        int int6 = localDateTime5.getYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readablePeriod7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.monthOfYear();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        int int11 = localDateTime10.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withSecondOfMinute(2);
        int int18 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime10.minus(readablePeriod19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.yearOfEra();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.centuryOfEra();
        org.joda.time.LocalDateTime.Property property23 = localDateTime20.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.plusDays(35581603);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(31861409);
        boolean boolean28 = localDateTime25.equals((java.lang.Object) dateTimeZone27);
        int int30 = dateTimeZone27.getOffsetFromLocal((long) 35486688);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 31861409 + "'", int30 == 31861409);
    }

    @Test
    public void test19235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19235");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra((int) (short) 1);
        int int6 = localDateTime5.getYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plus(readablePeriod7);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        int int11 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        int int12 = localDateTime9.getYearOfEra();
        java.lang.String str13 = localDateTime9.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long18 = dateTimeZone15.convertLocalToUTC((long) (byte) 100, false);
        long long20 = dateTimeZone15.previousTransition(0L);
        org.joda.time.DateTime dateTime21 = localDateTime9.toDateTime(dateTimeZone15);
        java.util.TimeZone timeZone22 = dateTimeZone15.toTimeZone();
        long long25 = dateTimeZone15.convertLocalToUTC((long) 74, false);
        long long28 = dateTimeZone15.convertLocalToUTC((long) 35393391, true);
        org.joda.time.DateTime dateTime29 = localDateTime5.toDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property30 = localDateTime5.dayOfWeek();
        int int31 = localDateTime5.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = localDateTime5.withCenturyOfEra(35494932);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35494932 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-12T17:59:21.431" + "'", str13, "2022-02-12T17:59:21.431");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115199900L) + "'", long18 == (-115199900L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-115199926L) + "'", long25 == (-115199926L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-79806609L) + "'", long28 == (-79806609L));
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 431 + "'", int31 == 431);
    }

    @Test
    public void test19236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19236");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int[] intArray2 = localDateTime1.getValues();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMinutes((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes(70);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minus(readableDuration7);
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = locale10.getUnicodeLocaleType("en");
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withSecondOfMinute(1);
        java.util.Date date18 = localDateTime14.toDate();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.hourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withSecondOfMinute(1);
        boolean boolean23 = localDateTime14.equals((java.lang.Object) localDateTime22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime14.era();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundHalfEvenCopy();
        java.lang.String str26 = property24.getName();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.util.Locale locale28 = locale27.stripExtensions();
        int int29 = property24.getMaximumShortTextLength(locale27);
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        int int31 = property24.getMaximumTextLength(locale30);
        org.joda.time.LocalDateTime localDateTime32 = property24.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        long long35 = dateTimeZone33.nextTransition(0L);
        long long39 = dateTimeZone33.convertLocalToUTC((long) (short) 0, true, (-115199900L));
        int int41 = dateTimeZone33.getOffset((long) 0);
        boolean boolean43 = dateTimeZone33.isStandardOffset((-79858925L));
        boolean boolean44 = property24.equals((java.lang.Object) dateTimeZone33);
        java.util.Locale locale45 = java.util.Locale.ITALY;
        java.lang.String str46 = locale45.getCountry();
        int int47 = property24.getMaximumShortTextLength(locale45);
        java.lang.String str48 = locale10.getDisplayCountry(locale45);
        java.util.Locale locale49 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale50 = locale49.stripExtensions();
        java.lang.String str51 = locale50.toLanguageTag();
        java.lang.String str52 = locale45.getDisplayName(locale50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = localDateTime8.toString("2022-02-11T09:55:39.445Z", locale50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[2022, 2, 12, 64761458]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Sat Feb 12 17:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "era" + "'", str26, "era");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "IT" + "'", str46, "IT");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 11 + "'", int47 == 11);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Stati Uniti" + "'", str48, "Stati Uniti");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "zh-TW" + "'", str51, "zh-TW");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229)" + "'", str52, "\u7fa9\u5927\u5229\u6587\u7fa9\u5927\u5229)");
    }

    @Test
    public void test19237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19237");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, 2022L, 301);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19238");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "era");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        java.util.Locale.Builder builder6 = builder5.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.clear();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale.Builder builder10 = builder9.clear();
        java.util.Locale.Builder builder11 = builder9.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setScript("2022-02-11T09:54:28.582Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 2022-02-11T09:54:28.582Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test19239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19239");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.fromDateFields(date4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withHourOfDay((int) (byte) 10);
        int[] intArray8 = localDateTime5.getValues();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis((int) 'x');
        org.joda.time.DateTime dateTime11 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime.Property property12 = localDateTime5.millisOfDay();
        int int13 = property12.getMaximumValue();
        int int14 = property12.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime15 = property12.getLocalDateTime();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Sat Feb 12 17:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[2022, 2, 12, 64761490]");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 86399999 + "'", int13 == 86399999);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 86399999 + "'", int14 == 86399999);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test19240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19240");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.nextTransition(0L);
        long long6 = dateTimeZone0.convertLocalToUTC((long) (short) 0, true, (-115199900L));
        long long9 = dateTimeZone0.convertLocalToUTC((long) 9, true);
        long long11 = dateTimeZone0.convertUTCToLocal((-3600001L));
        long long15 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, false, (long) 10);
        java.lang.String str17 = dateTimeZone0.getNameKey((long) 22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean20 = dateTimeZone0.isStandardOffset((long) 696);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str23 = dateTimeZone22.getID();
        java.lang.String str24 = dateTimeZone22.toString();
        java.util.Locale locale26 = java.util.Locale.ENGLISH;
        java.lang.String str27 = dateTimeZone22.getName((long) 3120000, locale26);
        int int29 = dateTimeZone22.getOffsetFromLocal((long) 46);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.hourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.hourOfDay();
        int int37 = property36.get();
        org.joda.time.LocalDateTime localDateTime38 = property36.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusYears((int) (byte) 1);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.dayOfMonth();
        boolean boolean42 = dateTimeZone22.isLocalDateTimeGap(localDateTime40);
        long long44 = dateTimeZone0.getMillisKeepLocal(dateTimeZone22, (long) 35341075);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.weekOfWeekyear();
        boolean boolean47 = dateTimeZone0.isLocalDateTimeGap(localDateTime45);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.plusSeconds(64381318);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9L + "'", long9 == 9L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3600001L) + "'", long11 == (-3600001L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-01:00" + "'", str23, "-01:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-01:00" + "'", str24, "-01:00");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-01:00" + "'", str27, "-01:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-3600000) + "'", int29 == (-3600000));
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 38941075L + "'", long44 == 38941075L);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localDateTime49);
    }

    @Test
    public void test19241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19241");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str2 = locale0.getExtension('a');
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Locale.Category category4 = java.util.Locale.Category.DISPLAY;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) (short) -1, chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.minuteOfHour();
        java.util.Locale locale9 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale10 = java.util.Locale.ROOT;
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale10.getDisplayScript(locale11);
        java.util.Locale locale13 = java.util.Locale.JAPAN;
        java.lang.String str14 = locale11.getDisplayScript(locale13);
        java.lang.String str15 = locale13.toLanguageTag();
        java.lang.String str16 = locale9.getDisplayScript(locale13);
        int int17 = property8.getMaximumShortTextLength(locale13);
        java.util.Locale.setDefault(category4, locale13);
        java.util.Locale locale19 = java.util.Locale.getDefault(category4);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.ROOT;
        java.lang.String str23 = locale20.getDisplayScript(locale22);
        java.lang.String str24 = locale22.getCountry();
        java.util.Locale.setDefault(category4, locale22);
        java.util.Locale.Category category26 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale27 = java.util.Locale.getDefault(category26);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.hourOfDay();
        org.joda.time.ReadableInstant readableInstant30 = null;
        long long31 = property29.getDifferenceAsLong(readableInstant30);
        java.util.Locale locale32 = java.util.Locale.US;
        java.lang.String str33 = locale32.getDisplayName();
        int int34 = property29.getMaximumTextLength(locale32);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.hourOfDay();
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.DateTime dateTime38 = localDateTime35.toDateTime(readableInstant37);
        int int39 = property29.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant41 = null;
        int int42 = dateTimeZone40.getOffset(readableInstant41);
        long long45 = dateTimeZone40.adjustOffset((long) 0, false);
        java.lang.String str46 = dateTimeZone40.toString();
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.hourOfDay();
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.DateTime dateTime50 = localDateTime47.toDateTime(readableInstant49);
        java.lang.String str51 = dateTime50.toString();
        int int52 = dateTimeZone40.getOffset((org.joda.time.ReadableInstant) dateTime50);
        int int53 = property29.compareTo((org.joda.time.ReadableInstant) dateTime50);
        java.util.Locale locale54 = java.util.Locale.US;
        int int55 = property29.getMaximumTextLength(locale54);
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.hourOfDay();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.withSecondOfMinute(1);
        java.util.Date date60 = localDateTime56.toDate();
        org.joda.time.LocalDateTime localDateTime61 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.hourOfDay();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime61.withSecondOfMinute(1);
        boolean boolean65 = localDateTime56.equals((java.lang.Object) localDateTime64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime56.era();
        org.joda.time.LocalDateTime localDateTime67 = property66.roundHalfEvenCopy();
        java.lang.String str68 = property66.getAsText();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant70 = null;
        int int71 = dateTimeZone69.getOffset(readableInstant70);
        long long74 = dateTimeZone69.adjustOffset((long) 0, false);
        java.lang.String str75 = dateTimeZone69.toString();
        boolean boolean77 = dateTimeZone69.isStandardOffset((long) 49);
        java.util.Locale locale79 = java.util.Locale.FRANCE;
        java.lang.String str80 = dateTimeZone69.getShortName((long) ' ', locale79);
        java.lang.String str81 = property66.getAsText(locale79);
        java.lang.String str82 = locale54.getDisplayVariant(locale79);
        java.util.Locale.setDefault(category26, locale54);
        java.util.Locale locale84 = java.util.Locale.getDefault(category26);
        java.util.Locale locale86 = java.util.Locale.forLanguageTag("2022-02-11T09:49:34.640Z");
        java.util.Locale.setDefault(category26, locale86);
        java.util.Locale.setDefault(category4, locale86);
        java.util.Locale locale89 = java.util.Locale.getDefault(category4);
        java.lang.String str90 = locale0.getDisplayScript(locale89);
        java.lang.String str91 = locale89.getDisplayCountry();
        java.lang.String str92 = locale89.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eng" + "'", str3, "eng");
        org.junit.Assert.assertTrue("'" + category4 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category4.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ja-JP" + "'", str15, "ja-JP");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + category26 + "' != '" + java.util.Locale.Category.FORMAT + "'", category26.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "English (United States)" + "'", str33, "English (United States)");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTC" + "'", str46, "UTC");
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime50);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2022-02-11T09:59:21.519Z" + "'", str51, "2022-02-11T09:59:21.519Z");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(date60);
// flaky:         org.junit.Assert.assertEquals(date60.toString(), "Fri Feb 11 09:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "AD" + "'", str68, "AD");
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "UTC" + "'", str75, "UTC");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "+00:00" + "'", str80, "+00:00");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "ap. J.-C." + "'", str81, "ap. J.-C.");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "");
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test19242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19242");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(270);
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusWeeks(409);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withYearOfCentury(60);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        org.joda.time.ReadableInstant readableInstant13 = null;
        long long14 = property12.getDifferenceAsLong(readableInstant13);
        java.util.Locale locale15 = java.util.Locale.US;
        java.lang.String str16 = locale15.getDisplayName();
        int int17 = property12.getMaximumTextLength(locale15);
        org.joda.time.LocalDateTime localDateTime18 = property12.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime19 = property12.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime21 = property12.addToCopy((long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime23 = property12.addToCopy(6);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        int int26 = localDateTime24.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        int int27 = localDateTime24.getYearOfEra();
        java.lang.String str28 = localDateTime24.toString();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.withWeekyear(31);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusDays(5);
        int int33 = property12.compareTo((org.joda.time.ReadablePartial) localDateTime30);
        int int34 = localDateTime30.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = localDateTime30.getFieldType(0);
        org.joda.time.LocalDateTime.Property property37 = localDateTime10.property(dateTimeFieldType36);
        java.lang.String str38 = property37.getAsText();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "English (United States)" + "'", str16, "English (United States)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2022 + "'", int27 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2022-02-11T09:59:21.555" + "'", str28, "2022-02-11T09:59:21.555");
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 31 + "'", int34 == 31);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2060" + "'", str38, "2060");
    }

    @Test
    public void test19243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19243");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("Property[secondOfMinute]");
        org.joda.time.DateTimeZone dateTimeZone4 = provider0.getZone("2022-02-11T09:49:40.067+32:00");
        org.joda.time.DateTimeZone dateTimeZone6 = provider0.getZone("2022-02-11T09:51:17.792");
        java.util.Set<java.lang.String> strSet7 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone9 = provider0.getZone("2022-02-11T09:51:47.808Z");
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(dateTimeZone9);
    }

    @Test
    public void test19244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19244");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(35516541);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localDateTime5.getFields();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYear((-1));
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withSecondOfMinute(1);
        java.util.Date date13 = localDateTime9.toDate();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withSecondOfMinute(1);
        boolean boolean18 = localDateTime9.equals((java.lang.Object) localDateTime17);
        int int19 = localDateTime17.getHourOfDay();
        int int20 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime5.minus(readableDuration21);
        int int23 = localDateTime5.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime5.withDurationAdded(readableDuration24, 536);
        boolean boolean27 = dateTimeZone1.isLocalDateTimeGap(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Fri Feb 11 09:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test19245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19245");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withSecondOfMinute(1);
        java.util.Date date4 = localDateTime0.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withSecondOfMinute(1);
        boolean boolean9 = localDateTime0.equals((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime0.era();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfEvenCopy();
        java.lang.String str12 = property10.getName();
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Locale locale14 = locale13.stripExtensions();
        int int15 = property10.getMaximumShortTextLength(locale13);
        java.lang.String str16 = property10.getAsText();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone17.getOffset(readableInstant18);
        long long22 = dateTimeZone17.adjustOffset((long) 0, false);
        java.lang.String str23 = dateTimeZone17.toString();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.hourOfDay();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.DateTime dateTime27 = localDateTime24.toDateTime(readableInstant26);
        java.lang.String str28 = dateTime27.toString();
        int int29 = dateTimeZone17.getOffset((org.joda.time.ReadableInstant) dateTime27);
        int int30 = property10.compareTo((org.joda.time.ReadableInstant) dateTime27);
        java.util.Locale locale32 = new java.util.Locale("");
        java.util.Locale.setDefault(locale32);
        java.lang.String str34 = locale32.getISO3Country();
        java.lang.String str35 = property10.getAsShortText(locale32);
        org.joda.time.LocalDateTime localDateTime36 = property10.roundHalfCeilingCopy();
        int int37 = localDateTime36.getYear();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withDurationAdded(readableDuration38, 35505108);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.plusSeconds(528);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant44 = null;
        int int45 = dateTimeZone43.getOffset(readableInstant44);
        long long48 = dateTimeZone43.adjustOffset((long) 0, false);
        java.lang.String str49 = dateTimeZone43.toString();
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.hourOfDay();
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.DateTime dateTime53 = localDateTime50.toDateTime(readableInstant52);
        java.lang.String str54 = dateTime53.toString();
        int int55 = dateTimeZone43.getOffset((org.joda.time.ReadableInstant) dateTime53);
        int int57 = dateTimeZone43.getOffsetFromLocal((long) 4);
        long long61 = dateTimeZone43.convertLocalToUTC((long) 270, true, (long) 69);
        long long63 = dateTimeZone43.nextTransition((long) 9);
        long long66 = dateTimeZone43.adjustOffset((long) 2022, true);
        java.lang.String str68 = dateTimeZone43.getShortName((-3599008L));
        org.joda.time.LocalDateTime localDateTime69 = org.joda.time.LocalDateTime.now(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.dayOfMonth();
        boolean boolean71 = localDateTime42.isEqual((org.joda.time.ReadablePartial) localDateTime69);
        int int72 = localDateTime42.getYear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Feb 11 09:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "era" + "'", str12, "era");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AD" + "'", str16, "AD");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2022-02-11T09:59:21.594Z" + "'", str28, "2022-02-11T09:59:21.594Z");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "AD" + "'", str35, "AD");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "UTC" + "'", str49, "UTC");
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTime53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2022-02-11T09:59:21.594Z" + "'", str54, "2022-02-11T09:59:21.594Z");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 270L + "'", long61 == 270L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 9L + "'", long63 == 9L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 2022L + "'", long66 == 2022L);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "+00:00" + "'", str68, "+00:00");
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
    }

    @Test
    public void test19246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19246");
        java.util.Locale locale3 = new java.util.Locale("2022-02-11T09:50:28.018", "2022-02-12T17:51:11.814", "2022-02-11T09:52:24.232");
        java.lang.String str4 = locale3.toLanguageTag();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "ja_JP", "ja_JP", "hi!", "ja_JP" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.lang.String str15 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList13);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream16 = languageRangeList6.stream();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList18, strMap19);
        java.lang.String[] strArray23 = new java.lang.String[] { "Coordinated Universal Time", "eng" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.String[] strArray33 = new java.lang.String[] { "ja_JP", "ja_JP", "hi!", "ja_JP" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.lang.String str36 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList34);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream37 = languageRangeList27.stream();
        boolean boolean38 = strSet24.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        java.util.Spliterator<java.lang.String> strSpliterator39 = strSet24.spliterator();
        java.lang.String str40 = java.util.Locale.lookupTag(languageRangeList18, (java.util.Collection<java.lang.String>) strSet24);
        java.util.Spliterator<java.lang.String> strSpliterator41 = strSet24.spliterator();
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale45 = new java.util.Locale("\u5354\u5b9a\u4e16\u754c\u6642", "era");
        java.lang.String str46 = locale42.getDisplayScript(locale45);
        java.util.Set<java.lang.Character> charSet47 = locale45.getExtensionKeys();
        boolean boolean48 = strSet24.contains((java.lang.Object) locale45);
        java.lang.String str49 = locale3.getDisplayName(locale45);
        org.junit.Assert.assertEquals(locale3.toString(), "2022-02-11t09:50:28.018_2022-02-12T17:51:11.814_2022-02-11T09:52:24.232");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "und" + "'", str4, "und");
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(languageRangeStream16);
        org.junit.Assert.assertNotNull(languageRangeList18);
        org.junit.Assert.assertNotNull(languageRangeList20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(languageRangeStream37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strSpliterator39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(strSpliterator41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_CA");
        org.junit.Assert.assertEquals(locale45.toString(), "\u5354\u5b9a\u4e16\u754c\u6642_ERA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(charSet47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2022-02-11t09:50:28.018 (2022-02-12T17:51:11.814,2022-02-11T09:52:24.232)" + "'", str49, "2022-02-11t09:50:28.018 (2022-02-12T17:51:11.814,2022-02-11T09:52:24.232)");
    }

    @Test
    public void test19247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19247");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = property1.getField();
        int int3 = property1.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime4 = property1.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = property1.addToCopy(1644458114873L);
        java.lang.String str7 = property1.getName();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hourOfDay" + "'", str7, "hourOfDay");
    }

    @Test
    public void test19248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19248");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.hourOfDay();
        org.joda.time.ReadableInstant readableInstant2 = null;
        long long3 = property1.getDifferenceAsLong(readableInstant2);
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale4.getDisplayName();
        int int6 = property1.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.DateTime dateTime10 = localDateTime7.toDateTime(readableInstant9);
        int int11 = property1.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone12.getOffset(readableInstant13);
        long long17 = dateTimeZone12.adjustOffset((long) 0, false);
        java.lang.String str18 = dateTimeZone12.toString();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.hourOfDay();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime19.toDateTime(readableInstant21);
        java.lang.String str23 = dateTime22.toString();
        int int24 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime22);
        int int25 = property1.compareTo((org.joda.time.ReadableInstant) dateTime22);
        java.util.Locale locale26 = java.util.Locale.US;
        int int27 = property1.getMaximumTextLength(locale26);
        java.lang.String str28 = locale26.getLanguage();
        java.lang.String str29 = locale26.getCountry();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.hourOfDay();
        org.joda.time.ReadableInstant readableInstant32 = null;
        long long33 = property31.getDifferenceAsLong(readableInstant32);
        java.util.Locale locale34 = java.util.Locale.US;
        java.lang.String str35 = locale34.getDisplayName();
        int int36 = property31.getMaximumTextLength(locale34);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.hourOfDay();
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime37.toDateTime(readableInstant39);
        int int41 = property31.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant43 = null;
        int int44 = dateTimeZone42.getOffset(readableInstant43);
        long long47 = dateTimeZone42.adjustOffset((long) 0, false);
        java.lang.String str48 = dateTimeZone42.toString();
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.hourOfDay();
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.DateTime dateTime52 = localDateTime49.toDateTime(readableInstant51);
        java.lang.String str53 = dateTime52.toString();
        int int54 = dateTimeZone42.getOffset((org.joda.time.ReadableInstant) dateTime52);
        int int55 = property31.compareTo((org.joda.time.ReadableInstant) dateTime52);
        java.util.Locale locale56 = java.util.Locale.US;
        int int57 = property31.getMaximumTextLength(locale56);
        java.lang.String str58 = locale56.getLanguage();
        java.util.Locale.setDefault(locale56);
        java.util.Locale.Builder builder60 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder63 = builder60.setExtension('a', "era");
        java.util.Locale.Builder builder64 = builder60.clearExtensions();
        java.util.Locale.Builder builder65 = builder64.clear();
        java.util.Locale.Builder builder67 = builder65.removeUnicodeLocaleAttribute("ERA");
        java.util.Locale locale68 = builder65.build();
        java.util.Set<java.lang.String> strSet69 = locale68.getUnicodeLocaleAttributes();
        java.lang.String str70 = locale56.getDisplayCountry(locale68);
        java.lang.String str71 = locale26.getDisplayVariant(locale56);
        java.lang.String str72 = locale26.getDisplayScript();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English (United States)" + "'", str5, "English (United States)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2022-02-11T09:59:21.652Z" + "'", str23, "2022-02-11T09:59:21.652Z");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en" + "'", str28, "en");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "US" + "'", str29, "US");
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "English (United States)" + "'", str35, "English (United States)");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "UTC" + "'", str48, "UTC");
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTime52);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "2022-02-11T09:59:21.652Z" + "'", str53, "2022-02-11T09:59:21.652Z");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "en" + "'", str58, "en");
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "United States" + "'", str70, "United States");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test19249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19249");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        java.lang.String str5 = dateTimeZone1.toString();
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        boolean boolean8 = timeZone7.observesDaylightTime();
        java.time.ZoneId zoneId9 = timeZone7.toZoneId();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone(zoneId9);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone(zoneId9);
        int int12 = timeZone11.getRawOffset();
        timeZone11.setRawOffset(0);
        java.time.ZoneId zoneId15 = timeZone11.toZoneId();
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone(zoneId15);
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        boolean boolean19 = timeZone16.hasSameRules(timeZone17);
        int int20 = timeZone17.getRawOffset();
        boolean boolean21 = timeZone6.hasSameRules(timeZone17);
        int int22 = timeZone6.getRawOffset();
        timeZone6.setRawOffset(70822660);
        int int25 = timeZone6.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-115199900L) + "'", long4 == (-115199900L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+32:00" + "'", str5, "+32:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test19250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19250");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) -1, chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = property4.addToCopy((long) (byte) 0);
        java.lang.String str7 = property4.getAsShortText();
        org.joda.time.LocalDateTime localDateTime9 = property4.addToCopy(2022);
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        int int11 = property4.getMaximumShortTextLength(locale10);
        java.lang.String[] strArray21 = new java.lang.String[] { "era", "en-US", "en-US", "UTC", "Coordinated Universal Time", "java.io.IOException", "Coordinated Universal Time", "hi!", "2022-02-11T09:49:24.878Z" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        boolean boolean24 = strSet22.isEmpty();
        java.util.Locale locale25 = java.util.Locale.ROOT;
        java.util.Locale locale26 = java.util.Locale.US;
        java.lang.String str27 = locale25.getDisplayScript(locale26);
        java.util.Locale locale28 = java.util.Locale.JAPAN;
        java.lang.String str29 = locale26.getDisplayScript(locale28);
        boolean boolean30 = strSet22.equals((java.lang.Object) locale28);
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale32 = java.util.Locale.ROOT;
        java.util.Locale locale33 = java.util.Locale.US;
        java.lang.String str34 = locale32.getDisplayScript(locale33);
        java.util.Locale locale35 = java.util.Locale.JAPAN;
        java.lang.String str36 = locale33.getDisplayScript(locale35);
        java.lang.String str37 = locale35.toLanguageTag();
        java.lang.String str38 = locale31.getDisplayScript(locale35);
        java.lang.String str39 = locale31.getVariant();
        java.lang.String str40 = locale28.getDisplayCountry(locale31);
        int int41 = property4.getMaximumShortTextLength(locale31);
        int int42 = property4.getMaximumValue();
        org.joda.time.tz.NameProvider nameProvider43 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider43);
        java.util.Locale locale45 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale48 = new java.util.Locale("\u5354\u5b9a\u4e16\u754c\u6642", "era");
        java.lang.String str49 = locale45.getDisplayScript(locale48);
        java.lang.String str50 = locale45.toLanguageTag();
        java.util.Locale locale51 = locale45.stripExtensions();
        java.lang.String str54 = nameProvider43.getName(locale51, "dopo Cristo", "2022-02-11T09:49:44.550+32:00");
        java.util.Locale locale55 = java.util.Locale.US;
        java.lang.String str56 = locale55.getDisplayName();
        java.lang.String str57 = locale55.getDisplayVariant();
        java.util.Set<java.lang.Character> charSet58 = locale55.getExtensionKeys();
        java.util.Locale locale59 = locale55.stripExtensions();
        java.lang.String str60 = locale59.getDisplayCountry();
        java.util.Set<java.lang.String> strSet61 = locale59.getUnicodeLocaleKeys();
        java.lang.String str62 = locale51.getDisplayVariant(locale59);
        java.lang.String str63 = locale59.getCountry();
        int int64 = property4.getMaximumTextLength(locale59);
        java.lang.String str65 = property4.getName();
        boolean boolean66 = property4.isLeap();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "999" + "'", str7, "999");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ja-JP" + "'", str37, "ja-JP");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\u65e5\u672c" + "'", str40, "\u65e5\u672c");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 999 + "'", int42 == 999);
        org.junit.Assert.assertNotNull(nameProvider43);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "fr_CA");
        org.junit.Assert.assertEquals(locale48.toString(), "\u5354\u5b9a\u4e16\u754c\u6642_ERA");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "fr-CA" + "'", str50, "fr-CA");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr_CA");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "English (United States)" + "'", str56, "English (United States)");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(charSet58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "United States" + "'", str60, "United States");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "US" + "'", str63, "US");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "millisOfSecond" + "'", str65, "millisOfSecond");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test19251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19251");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.nextTransition(0L);
        java.lang.String str4 = dateTimeZone0.getNameKey((long) 12);
        long long7 = dateTimeZone0.convertLocalToUTC((long) 35341407, false);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        long long13 = dateTimeZone9.convertLocalToUTC((long) (byte) 100, false, (-115199900L));
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        long long16 = dateTimeZone14.nextTransition(0L);
        long long20 = dateTimeZone14.convertLocalToUTC((long) (short) 0, true, (-115199900L));
        long long23 = dateTimeZone14.convertLocalToUTC((long) 9, true);
        long long25 = dateTimeZone9.getMillisKeepLocal(dateTimeZone14, (long) (byte) -1);
        int int27 = dateTimeZone9.getStandardOffset(52L);
        long long31 = dateTimeZone9.convertLocalToUTC((long) 'u', false, (long) 'a');
        long long33 = dateTimeZone9.previousTransition((long) 11);
        long long35 = dateTimeZone0.getMillisKeepLocal(dateTimeZone9, 0L);
        java.lang.String str37 = dateTimeZone9.getNameKey((long) 35401493);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        long long40 = dateTimeZone9.convertUTCToLocal((-3119875L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35341407L + "'", long7 == 35341407L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600100L + "'", long13 == 3600100L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9L + "'", long23 == 9L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-3600001L) + "'", long25 == (-3600001L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3600000) + "'", int27 == (-3600000));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 3600117L + "'", long31 == 3600117L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 11L + "'", long33 == 11L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 3600000L + "'", long35 == 3600000L);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-6719875L) + "'", long40 == (-6719875L));
    }

    @Test
    public void test19252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19252");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder1.setLanguage("Wed");
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder3.clear();
        org.joda.time.tz.NameProvider nameProvider6 = org.joda.time.DateTimeZone.getNameProvider();
        java.lang.String[] strArray16 = new java.lang.String[] { "era", "en-US", "en-US", "UTC", "Coordinated Universal Time", "java.io.IOException", "Coordinated Universal Time", "hi!", "2022-02-11T09:49:24.878Z" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean19 = strSet17.isEmpty();
        java.util.Locale locale20 = java.util.Locale.ROOT;
        java.util.Locale locale21 = java.util.Locale.US;
        java.lang.String str22 = locale20.getDisplayScript(locale21);
        java.util.Locale locale23 = java.util.Locale.JAPAN;
        java.lang.String str24 = locale21.getDisplayScript(locale23);
        boolean boolean25 = strSet17.equals((java.lang.Object) locale23);
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale27 = java.util.Locale.ROOT;
        java.util.Locale locale28 = java.util.Locale.US;
        java.lang.String str29 = locale27.getDisplayScript(locale28);
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        java.lang.String str31 = locale28.getDisplayScript(locale30);
        java.lang.String str32 = locale30.toLanguageTag();
        java.lang.String str33 = locale26.getDisplayScript(locale30);
        java.lang.String str34 = locale26.getVariant();
        java.lang.String str35 = locale23.getDisplayCountry(locale26);
        java.lang.String str38 = nameProvider6.getShortName(locale23, "2022-02-11T09:49:27.737+32:00", "2022-02-11T09:49:36.798");
        java.util.Locale locale42 = new java.util.Locale("\u82f1\u6587", "Coordinated Universal Time", "2022-02-11T09:49:32.430Z");
        java.lang.String str45 = nameProvider6.getShortName(locale42, "2022-02-11T09:49:32.375Z", "2022-02-11T09:49:32.296Z");
        java.util.Locale locale46 = null;
        java.lang.String str49 = nameProvider6.getName(locale46, "2022-02-12T17:49:47.427+32:00", "2022-02-11T09:49:50.116");
        java.util.Locale locale52 = new java.util.Locale("2022-02-11T09:49:35.638+32:00", "Italian (Italy)");
        java.lang.String str55 = nameProvider6.getName(locale52, "2022-02-11T09:49:30.914Z", "2022-02-11T09:49:53.730");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder56 = builder5.setLocale(locale52);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 2022-02-11t09:49:35.638+32:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(nameProvider6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ja-JP" + "'", str32, "ja-JP");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u65e5\u672c" + "'", str35, "\u65e5\u672c");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals(locale42.toString(), "\u82f1\u6587_COORDINATED UNIVERSAL TIME_2022-02-11T09:49:32.430Z");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals(locale52.toString(), "2022-02-11t09:49:35.638+32:00_ITALIAN (ITALY)");
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test19253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19253");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        int int2 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withSecondOfMinute(1);
        java.util.Date date7 = localDateTime3.toDate();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withSecondOfMinute(1);
        boolean boolean12 = localDateTime3.equals((java.lang.Object) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField(0);
        boolean boolean17 = localDateTime0.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime20 = property18.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusYears(934);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfDay();
        long long26 = property25.remainder();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Fri Feb 11 09:59:21 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }
}
