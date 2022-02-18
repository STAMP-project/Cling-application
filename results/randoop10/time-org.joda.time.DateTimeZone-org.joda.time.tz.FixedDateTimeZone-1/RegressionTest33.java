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
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withSecondOfMinute(10);
        int[] intArray7 = localDateTime4.getValues();
        int int8 = localDateTime4.getMillisOfSecond();
        int int9 = localDateTime4.getHourOfDay();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 1, 10, 35098862]");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 862 + "'", int8 == 862);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('x', "Italian");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("2122-02-11T08:00:11.407-01:35");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder7 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = builder0.clearExtensions();
        java.util.Locale.Builder builder10 = builder0.setLanguage("francese");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder4 = builder0.setLanguageTag("zh");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setLanguageTag("2122-02-11T09:35:52.575Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 2122 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        int int15 = property7.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime17 = property7.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime(readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime19.getZone();
        java.lang.String str22 = dateTimeZone20.getNameKey((-3155679300L));
        int int24 = dateTimeZone20.getStandardOffset(4800245735513L);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime();
        int int38 = localDateTime37.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withFields((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minus(readableDuration40);
        boolean boolean42 = localDateTime31.isBefore((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime41.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.plus(readableDuration44);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        int int48 = dateTimeZone46.getOffset((long) 10);
        boolean boolean49 = dateTimeZone46.isFixed();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime50.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime50.plusMillis(0);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.yearOfEra();
        org.joda.time.ReadableInstant readableInstant58 = null;
        int int59 = property57.getDifference(readableInstant58);
        java.util.Locale locale63 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleAttributes();
        int int65 = property57.getMaximumTextLength(locale63);
        org.joda.time.LocalDateTime localDateTime67 = property57.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant68 = null;
        org.joda.time.DateTime dateTime69 = localDateTime67.toDateTime(readableInstant68);
        long long70 = dateTime69.getMillis();
        int int71 = dateTimeZone46.getOffset((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime41, dateTimeZone46);
        boolean boolean73 = dateTimeZone20.isLocalDateTimeGap(localDateTime72);
        org.joda.time.LocalDateTime.Property property74 = localDateTime72.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime76 = localDateTime72.withDayOfMonth(120);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2122-02-11T09:35:10.520Z" + "'", str22, "2122-02-11T09:35:10.520Z");
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 93 + "'", int24 == 93);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2022 + "'", int38 == 2022);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals(locale63.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 9 + "'", int65 == 9);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
// flaky:         org.junit.Assert.assertTrue("'" + long70 + "' != '" + 4800246298867L + "'", long70 == 4800246298867L);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(property74);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2122-02-11T09:36:29.423Z");
        timeZone1.setID("14");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone8 = new org.joda.time.tz.FixedDateTimeZone("italiano", "2122-02-11T08:00:12.990-01:35", 6, (int) (short) 1);
        long long10 = fixedDateTimeZone8.nextTransition((long) (byte) 100);
        int int12 = fixedDateTimeZone8.getOffsetFromLocal(4800245715085L);
        java.util.TimeZone timeZone13 = fixedDateTimeZone8.toTimeZone();
        int int15 = fixedDateTimeZone8.getOffsetFromLocal(3576983560L);
        java.lang.String str17 = fixedDateTimeZone8.getNameKey(4800245852772L);
        java.util.TimeZone timeZone18 = fixedDateTimeZone8.toTimeZone();
        boolean boolean19 = timeZone1.hasSameRules(timeZone18);
        timeZone18.setID("2122-02-11T09:38:39.564Z");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("2122-02-11T09:35:07.818Z", "Italian", (int) ' ', (int) (byte) 0);
        long long28 = fixedDateTimeZone26.previousTransition((long) 9);
        boolean boolean30 = fixedDateTimeZone26.isStandardOffset(4800245710661L);
        int int32 = fixedDateTimeZone26.getStandardOffset((long) (-798211));
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (short) 1);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime();
        int int41 = localDateTime40.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withFields((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minus(readableDuration43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.withYearOfCentury((int) ' ');
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.withMillisOfSecond((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withYear((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime50.withYearOfEra(263);
        int int55 = localDateTime50.getWeekyear();
        int int56 = localDateTime50.getYear();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime34.withFields((org.joda.time.ReadablePartial) localDateTime50);
        boolean boolean58 = fixedDateTimeZone26.equals((java.lang.Object) localDateTime57);
        java.util.TimeZone timeZone60 = java.util.TimeZone.getTimeZone("2122-02-11T09:36:29.975Z");
        boolean boolean61 = fixedDateTimeZone26.equals((java.lang.Object) timeZone60);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone66 = new org.joda.time.tz.FixedDateTimeZone("italiano", "2122-02-11T08:00:12.990-01:35", 6, (int) (short) 1);
        long long69 = fixedDateTimeZone66.convertLocalToUTC((long) (-798211), true);
        long long71 = fixedDateTimeZone66.previousTransition(2022L);
        java.util.TimeZone timeZone72 = fixedDateTimeZone66.toTimeZone();
        java.util.TimeZone timeZone73 = fixedDateTimeZone66.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '#');
        org.joda.time.LocalDateTime localDateTime77 = org.joda.time.LocalDateTime.now(dateTimeZone76);
        java.util.TimeZone timeZone78 = dateTimeZone76.toTimeZone();
        java.time.ZoneId zoneId79 = timeZone78.toZoneId();
        java.util.TimeZone timeZone80 = java.util.TimeZone.getTimeZone(zoneId79);
        java.util.TimeZone timeZone81 = java.util.TimeZone.getTimeZone(zoneId79);
        java.util.TimeZone timeZone82 = java.util.TimeZone.getTimeZone(zoneId79);
        java.util.TimeZone timeZone83 = java.util.TimeZone.getTimeZone(zoneId79);
        boolean boolean84 = timeZone73.hasSameRules(timeZone83);
        int int85 = timeZone83.getRawOffset();
        int int87 = timeZone83.getOffset(4800245969811L);
        boolean boolean88 = timeZone60.hasSameRules(timeZone83);
        boolean boolean89 = timeZone18.hasSameRules(timeZone60);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2122-02-11T08:00:12.990-01:35" + "'", str17, "2122-02-11T08:00:12.990-01:35");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 9L + "'", long28 == 9L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2022 + "'", int41 == 2022);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2022 + "'", int55 == 2022);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2022 + "'", int56 == 2022);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-798217L) + "'", long69 == (-798217L));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 2022L + "'", long71 == 2022L);
        org.junit.Assert.assertNotNull(timeZone72);
        org.junit.Assert.assertEquals(timeZone72.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone73);
        org.junit.Assert.assertEquals(timeZone73.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone76);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(timeZone78);
        org.junit.Assert.assertEquals(timeZone78.getDisplayName(), "GMT-01:35");
        org.junit.Assert.assertNotNull(zoneId79);
        org.junit.Assert.assertNotNull(timeZone80);
        org.junit.Assert.assertEquals(timeZone80.getDisplayName(), "GMT-01:35");
        org.junit.Assert.assertNotNull(timeZone81);
        org.junit.Assert.assertEquals(timeZone81.getDisplayName(), "GMT-01:35");
        org.junit.Assert.assertNotNull(timeZone82);
        org.junit.Assert.assertEquals(timeZone82.getDisplayName(), "GMT-01:35");
        org.junit.Assert.assertNotNull(timeZone83);
        org.junit.Assert.assertEquals(timeZone83.getDisplayName(), "GMT-01:35");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-5700000) + "'", int85 == (-5700000));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-5700000) + "'", int87 == (-5700000));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.weekyear();
        org.joda.time.Interval interval7 = property6.toInterval();
        int int8 = property6.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime10 = property6.addToCopy(590);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime();
        int int24 = localDateTime23.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withFields((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readableDuration26);
        boolean boolean28 = localDateTime17.isBefore((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime17.plusDays(292278993);
        org.joda.time.LocalDateTime.Property property31 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime33 = property31.addWrapFieldToCopy((int) ' ');
        org.joda.time.LocalDateTime localDateTime34 = property31.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minus(readablePeriod35);
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        java.util.Locale locale43 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Locale[] localeArray44 = new java.util.Locale[] { locale43 };
        java.util.ArrayList<java.util.Locale> localeList45 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList45, localeArray44);
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.util.Locale>) localeList45);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap48 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList49 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, strMap48);
        java.util.Set<java.lang.String> strSet50 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean51 = strSet50.isEmpty();
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strSet50);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime53.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime65.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime();
        int int71 = localDateTime70.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime69.withFields((org.joda.time.ReadablePartial) localDateTime70);
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.minus(readableDuration73);
        boolean boolean75 = localDateTime64.isBefore((org.joda.time.ReadablePartial) localDateTime74);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime64.plusMillis((int) (byte) 10);
        boolean boolean78 = localDateTime57.isEqual((org.joda.time.ReadablePartial) localDateTime64);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(chronology79);
        int int81 = localDateTime80.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property82 = localDateTime80.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime84 = localDateTime80.minusSeconds((int) 'u');
        org.joda.time.LocalDateTime.Property property85 = localDateTime80.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = property85.getFieldType();
        boolean boolean87 = localDateTime57.isSupported(dateTimeFieldType86);
        org.joda.time.Chronology chronology88 = localDateTime57.getChronology();
        org.joda.time.LocalDateTime localDateTime89 = new org.joda.time.LocalDateTime(chronology88);
        org.joda.time.LocalDateTime localDateTime91 = localDateTime89.plusWeeks(764);
        boolean boolean92 = strSet50.equals((java.lang.Object) localDateTime91);
        int int93 = localDateTime91.getYearOfCentury();
        boolean boolean94 = localDateTime34.isBefore((org.joda.time.ReadablePartial) localDateTime91);
        int int95 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 292278993 + "'", int8 == 292278993);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals(locale43.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(localeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertNotNull(languageRangeList49);
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2022 + "'", int71 == 2022);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 22 + "'", int81 == 22);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(localDateTime84);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(dateTimeFieldType86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertNotNull(localDateTime91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 36 + "'", int93 == 36);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('x', "Italian");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setExtension('x', "2122-02-11T09:43:29.657Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: 11T09:43:29.657Z [at index 8]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("2122-02-11T09:35:07.818Z", "Italian", (int) ' ', (int) (byte) 0);
        long long7 = fixedDateTimeZone5.previousTransition((long) 9);
        long long9 = fixedDateTimeZone5.nextTransition(4800245711010L);
        long long11 = fixedDateTimeZone5.previousTransition((long) 305);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.plusMillis(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.yearOfEra();
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = property19.getDifference(readableInstant20);
        java.util.Locale locale25 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleAttributes();
        int int27 = property19.getMaximumTextLength(locale25);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.plusMillis(0);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.yearOfEra();
        org.joda.time.ReadableInstant readableInstant36 = null;
        int int37 = property35.getDifference(readableInstant36);
        java.util.Locale locale41 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        int int43 = property35.getMaximumTextLength(locale41);
        org.joda.time.LocalDateTime localDateTime45 = property35.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.DateTime dateTime47 = localDateTime45.toDateTime(readableInstant46);
        long long48 = dateTime47.getMillis();
        int int49 = property19.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.LocalDateTime localDateTime51 = property19.setCopy(100);
        org.joda.time.LocalDateTime localDateTime52 = property19.roundHalfCeilingCopy();
        int int53 = localDateTime52.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property59.getFieldType();
        boolean boolean61 = localDateTime52.isSupported(dateTimeFieldType60);
        org.joda.time.LocalDateTime.Property property62 = localDateTime52.weekyear();
        org.joda.time.LocalDateTime localDateTime63 = property62.getLocalDateTime();
        boolean boolean64 = fixedDateTimeZone5.isLocalDateTimeGap(localDateTime63);
        java.util.TimeZone timeZone65 = fixedDateTimeZone5.toTimeZone();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(0L, (org.joda.time.DateTimeZone) fixedDateTimeZone5);
        java.lang.String str67 = fixedDateTimeZone5.getID();
        java.util.TimeZone timeZone68 = fixedDateTimeZone5.toTimeZone();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4800245711010L + "'", long9 == 4800245711010L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 305L + "'", long11 == 305L);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals(locale25.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals(locale41.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 4800246299014L + "'", long48 == 4800246299014L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 6 + "'", int53 == 6);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(timeZone65);
        org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "2122-02-11T09:35:07.818Z" + "'", str67, "2122-02-11T09:35:07.818Z");
        org.junit.Assert.assertNotNull(timeZone68);
        org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("2022-01-10T08:06:29.400");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-01-10t08:06:29.400");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        int int6 = localDateTime5.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readableDuration8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusYears(0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDayOfYear((int) (short) 10);
        int int14 = localDateTime9.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.withYearOfEra(35);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.year();
        boolean boolean18 = property17.isLeap();
        org.joda.time.LocalDateTime localDateTime19 = property17.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusMinutes(493);
        int int22 = localDateTime21.getMillisOfSecond();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 68 + "'", int22 == 68);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readableDuration15);
        boolean boolean17 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        int int18 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withYearOfCentury((int) (short) 0);
        org.joda.time.LocalDateTime.Property property21 = localDateTime16.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime24 = property21.setCopy("21");
        org.joda.time.LocalDateTime localDateTime26 = property21.addToCopy((long) 18);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusMonths(34781606);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getYearOfCentury();
        int int3 = localDateTime1.getMillisOfSecond();
        int int4 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusYears((int) '4');
        int int7 = localDateTime1.getDayOfYear();
        int int8 = localDateTime1.getEra();
        int int9 = localDateTime1.getYear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime1.minusDays(35);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYear(34529046);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.centuryOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 105 + "'", int3 == 105);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 42 + "'", int7 == 42);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusMonths(1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(durationFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime8 = property6.addToCopy((long) 838);
        org.joda.time.LocalDateTime localDateTime9 = property6.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfEra(626);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(53);
        int int3 = dateTimeZone1.getOffset(0L);
        java.lang.String str4 = dateTimeZone1.getID();
        int int6 = dateTimeZone1.getOffset(4800246046644L);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.053" + "'", str4, "+00:00:00.053");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minus(readableDuration16);
        boolean boolean18 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localDateTime17);
        int int19 = localDateTime17.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withYearOfCentury((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plusMillis(0);
        org.joda.time.LocalDateTime.Property property29 = localDateTime22.minuteOfHour();
        boolean boolean31 = property29.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDateTime localDateTime32 = property29.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.centuryOfEra();
        boolean boolean34 = localDateTime17.isBefore((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.minusWeeks(4);
        org.joda.time.Chronology chronology37 = localDateTime32.getChronology();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(4800245885713L, chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withDayOfYear(96);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.plusMillis(0);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.yearOfEra();
        org.joda.time.ReadableInstant readableInstant49 = null;
        int int50 = property48.getDifference(readableInstant49);
        java.util.Locale locale54 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleAttributes();
        int int56 = property48.getMaximumTextLength(locale54);
        org.joda.time.LocalDateTime localDateTime58 = property48.addToCopy((int) (byte) 100);
        java.util.TimeZone timeZone59 = null;
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forTimeZone(timeZone59);
        java.util.Locale locale62 = java.util.Locale.GERMANY;
        java.lang.String str63 = dateTimeZone60.getName((long) 292278993, locale62);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone60);
        org.joda.time.DateTime dateTime65 = localDateTime58.toDateTime(dateTimeZone60);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime58.minusWeeks(529);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plus(readableDuration68);
        int int70 = localDateTime40.compareTo((org.joda.time.ReadablePartial) localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
// flaky:         org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals(locale54.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 9 + "'", int56 == 9);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+00:00:00.021" + "'", str63, "+00:00:00.021");
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        int int6 = localDateTime5.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.minuteOfHour();
        java.lang.String str9 = property8.getAsShortText();
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        org.joda.time.LocalDateTime localDateTime12 = property8.setCopy("35", locale11);
        org.joda.time.LocalDateTime localDateTime13 = property8.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime14 = property8.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        int int22 = localDateTime21.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withFields((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minus(readableDuration24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withYearOfCentury((int) ' ');
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.weekyear();
        org.joda.time.Chronology chronology31 = localDateTime27.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(chronology31);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.year();
        int int35 = localDateTime33.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusMonths(1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray39 = localDateTime36.getFieldTypes();
        org.joda.time.LocalDateTime.Property property40 = localDateTime36.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property40.getFieldType();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime33.withField(dateTimeFieldType41, 13);
        int int44 = localDateTime32.get(dateTimeFieldType41);
        int int45 = localDateTime14.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.Chronology chronology46 = localDateTime32.getChronology();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime32.minus(readablePeriod47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime32.era();
        boolean boolean50 = property49.isLeap();
        org.joda.time.LocalDateTime localDateTime51 = property49.roundHalfFloorCopy();
        int int52 = property49.getMaximumValueOverall();
        int int53 = property49.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime54.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime61.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime();
        int int67 = localDateTime66.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.withFields((org.joda.time.ReadablePartial) localDateTime66);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.minus(readableDuration69);
        boolean boolean71 = localDateTime60.isBefore((org.joda.time.ReadablePartial) localDateTime70);
        org.joda.time.LocalDateTime.Property property72 = localDateTime70.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime70.plusMinutes((-100));
        org.joda.time.LocalDateTime localDateTime76 = localDateTime70.plusYears(528);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime76.withWeekyear(230);
        int int79 = property49.compareTo((org.joda.time.ReadablePartial) localDateTime78);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "44" + "'", str9, "44");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 59 + "'", int35 == 59);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2022 + "'", int44 == 2022);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2022 + "'", int67 == 2022);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(35074797);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusMillis(0);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        java.util.Locale locale10 = java.util.Locale.PRC;
        java.lang.String str11 = property9.getAsShortText(locale10);
        int int12 = property9.getMaximumValueOverall();
        java.util.Locale locale13 = java.util.Locale.ROOT;
        java.lang.String str14 = locale13.getScript();
        java.lang.String str15 = property9.getAsShortText(locale13);
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale.Builder builder18 = builder16.clear();
        java.util.Locale.Builder builder20 = builder16.setLanguageTag("zh");
        java.util.Locale locale21 = builder16.build();
        java.util.Locale locale25 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Locale locale29 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str30 = locale25.getDisplayVariant(locale29);
        java.lang.String str31 = locale21.getDisplayCountry(locale29);
        java.lang.String str32 = locale13.getDisplayCountry(locale29);
        java.lang.String str33 = locale13.getDisplayScript();
        java.lang.String str34 = locale0.getDisplayVariant(locale13);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292278993 + "'", int12 == 292278993);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022" + "'", str15, "2022");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh");
        org.junit.Assert.assertEquals(locale25.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals(locale29.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        int int15 = property7.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusMillis(0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = property23.getDifference(readableInstant24);
        java.util.Locale locale29 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        int int31 = property23.getMaximumTextLength(locale29);
        org.joda.time.LocalDateTime localDateTime33 = property23.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime(readableInstant34);
        long long36 = dateTime35.getMillis();
        int int37 = property7.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDateTime localDateTime39 = property7.setCopy(100);
        org.joda.time.LocalDateTime localDateTime40 = property7.roundHalfCeilingCopy();
        int int41 = localDateTime40.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property47.getFieldType();
        boolean boolean49 = localDateTime40.isSupported(dateTimeFieldType48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime40.weekyear();
        org.joda.time.LocalDateTime localDateTime52 = property50.addToCopy(350);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minusYears(39);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.withMillisOfSecond(507);
        org.joda.time.LocalDateTime.Property property57 = localDateTime52.monthOfYear();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 4800246299232L + "'", long36 == 4800246299232L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 6 + "'", int41 == 6);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property57);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        int int15 = property7.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusMillis(0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = property23.getDifference(readableInstant24);
        java.util.Locale locale29 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        int int31 = property23.getMaximumTextLength(locale29);
        org.joda.time.LocalDateTime localDateTime33 = property23.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime(readableInstant34);
        long long36 = dateTime35.getMillis();
        int int37 = property7.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDateTime localDateTime39 = property7.setCopy(100);
        org.joda.time.LocalDateTime localDateTime40 = property7.roundHalfCeilingCopy();
        int int41 = localDateTime40.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property47.getFieldType();
        boolean boolean49 = localDateTime40.isSupported(dateTimeFieldType48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime40.weekyear();
        org.joda.time.LocalDateTime localDateTime51 = property50.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime53 = property50.addWrapFieldToCopy(529);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusMinutes(11);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.minusSeconds(552);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusDays(77770339);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 4800246299263L + "'", long36 == 4800246299263L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 6 + "'", int41 == 6);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime59);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        int int15 = property7.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime17 = property7.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime(readableInstant18);
        java.lang.String str20 = dateTime19.toString();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.plusMillis(0);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.yearOfEra();
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = property28.getDifference(readableInstant29);
        java.util.Locale locale34 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet35 = locale34.getUnicodeLocaleAttributes();
        int int36 = property28.getMaximumTextLength(locale34);
        org.joda.time.LocalDateTime localDateTime38 = property28.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime38.toDateTime(readableInstant39);
        java.lang.String str41 = dateTime40.toString();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime();
        int int48 = localDateTime47.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withFields((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minus(readableDuration50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime55 = localDateTime51.minusHours(9);
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = property61.getFieldType();
        boolean boolean63 = localDateTime55.isSupported(dateTimeFieldType62);
        int int64 = dateTime40.get(dateTimeFieldType62);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime65.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime();
        int int71 = localDateTime70.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime69.withFields((org.joda.time.ReadablePartial) localDateTime70);
        org.joda.time.LocalDateTime.Property property73 = localDateTime69.monthOfYear();
        boolean boolean74 = dateTime40.equals((java.lang.Object) localDateTime69);
        boolean boolean75 = dateTime19.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Instant instant76 = dateTime40.toInstant();
        java.util.Locale locale80 = new java.util.Locale("2122-02-11T08:00:17.784-01:35", "2022-01-09T11:37:10.696", "2122-02-11t08:00:17.784-01:35 (11,2122-02-11T08:00:14.774-01:35)");
        java.lang.String str81 = locale80.getScript();
        boolean boolean82 = instant76.equals((java.lang.Object) locale80);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2122-02-11T09:44:59.319+00:00:00.021" + "'", str20, "2122-02-11T09:44:59.319+00:00:00.021");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2122-02-11T09:44:59.319+00:00:00.021" + "'", str41, "2122-02-11T09:44:59.319+00:00:00.021");
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2022 + "'", int48 == 2022);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 22 + "'", int64 == 22);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2022 + "'", int71 == 2022);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(instant76);
        org.junit.Assert.assertEquals(locale80.toString(), "2122-02-11t08:00:17.784-01:35_2022-01-09T11:37:10.696_2122-02-11t08:00:17.784-01:35 (11,2122-02-11T08:00:14.774-01:35)");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        int int15 = property7.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime17 = property7.addToCopy((int) (byte) 100);
        int int18 = localDateTime17.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.dayOfMonth();
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.hourOfDay();
        org.joda.time.LocalDateTime localDateTime21 = property20.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime22 = property20.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plusMillis(0);
        org.joda.time.DateTimeField dateTimeField31 = localDateTime29.getField((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property32 = localDateTime29.era();
        org.joda.time.DateTimeField dateTimeField33 = property32.getField();
        int int34 = property32.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime35 = property32.withMaximumValue();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray36 = localDateTime35.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.minusSeconds(5740084);
        int int39 = property20.compareTo((org.joda.time.ReadablePartial) localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(604, 496, 294, 34848961, 443, 34895990, 34724471);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34848961 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        int int15 = property7.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime17 = property7.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime(readableInstant18);
        java.lang.String str20 = dateTime19.toString();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.plusMillis(0);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.yearOfEra();
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = property28.getDifference(readableInstant29);
        java.util.Locale locale34 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet35 = locale34.getUnicodeLocaleAttributes();
        int int36 = property28.getMaximumTextLength(locale34);
        org.joda.time.LocalDateTime localDateTime38 = property28.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.DateTime dateTime40 = localDateTime38.toDateTime(readableInstant39);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.plusMillis(0);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.yearOfEra();
        org.joda.time.ReadableInstant readableInstant49 = null;
        int int50 = property48.getDifference(readableInstant49);
        java.util.Locale locale54 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleAttributes();
        int int56 = property48.getMaximumTextLength(locale54);
        org.joda.time.LocalDateTime localDateTime58 = property48.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime58.toDateTime(readableInstant59);
        boolean boolean61 = dateTime40.isBefore(readableInstant59);
        boolean boolean62 = dateTime19.isEqual((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime63.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property68.getFieldType();
        boolean boolean70 = dateTime19.isSupported(dateTimeFieldType69);
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime71.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime71.plusMillis(0);
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.yearOfEra();
        org.joda.time.ReadableInstant readableInstant79 = null;
        int int80 = property78.getDifference(readableInstant79);
        java.util.Locale locale84 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet85 = locale84.getUnicodeLocaleAttributes();
        int int86 = property78.getMaximumTextLength(locale84);
        org.joda.time.LocalDateTime localDateTime88 = property78.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property89 = localDateTime88.millisOfDay();
        boolean boolean90 = dateTime19.equals((java.lang.Object) localDateTime88);
        org.joda.time.Chronology chronology91 = dateTime19.getChronology();
        org.joda.time.LocalDateTime localDateTime92 = new org.joda.time.LocalDateTime(chronology91);
        org.joda.time.LocalDateTime localDateTime93 = new org.joda.time.LocalDateTime(chronology91);
        org.joda.time.LocalDateTime localDateTime95 = localDateTime93.minusYears(339);
        int int96 = localDateTime95.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime98 = localDateTime95.minusMillis(114);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2122-02-11T09:44:59.389+00:00:00.021" + "'", str20, "2122-02-11T09:44:59.389+00:00:00.021");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals(locale54.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 9 + "'", int56 == 9);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertEquals(locale84.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 9 + "'", int86 == 9);
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(chronology91);
        org.junit.Assert.assertNotNull(localDateTime95);
// flaky:         org.junit.Assert.assertTrue("'" + int96 + "' != '" + 389 + "'", int96 == 389);
        org.junit.Assert.assertNotNull(localDateTime98);
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '#');
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str6 = locale5.getDisplayScript();
        java.lang.String str7 = dateTimeZone2.getShortName(10L, locale5);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusMillis(0);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = property15.getDifference(readableInstant16);
        java.util.Locale locale21 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleAttributes();
        int int23 = property15.getMaximumTextLength(locale21);
        org.joda.time.LocalDateTime localDateTime25 = property15.addToCopy((int) (byte) 100);
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("hi!");
        int int28 = property15.getMaximumShortTextLength(locale27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime();
        int int35 = localDateTime34.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withFields((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.minuteOfHour();
        java.lang.String str38 = property37.getAsShortText();
        org.joda.time.LocalDateTime localDateTime40 = property37.setCopy("35");
        int int41 = property37.getLeapAmount();
        java.util.Locale locale42 = java.util.Locale.ITALIAN;
        int int43 = property37.getMaximumShortTextLength(locale42);
        java.lang.String str44 = locale27.getDisplayLanguage(locale42);
        java.util.Locale locale45 = locale42.stripExtensions();
        java.lang.String str46 = locale42.toLanguageTag();
        java.lang.String str47 = locale5.getDisplayLanguage(locale42);
        java.lang.String str49 = locale42.getExtension('u');
        java.lang.String str50 = locale42.getScript();
        java.lang.String str51 = locale42.getScript();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:35" + "'", str7, "-01:35");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals(locale21.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2022 + "'", int35 == 2022);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "44" + "'", str38, "44");
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "it");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "it" + "'", str46, "it");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("2122-02-11T09:35:07.818Z", "Italian", (int) ' ', (int) (byte) 0);
        int int7 = fixedDateTimeZone5.getStandardOffset((long) 529);
        long long11 = fixedDateTimeZone5.convertLocalToUTC((long) (-1), false, (long) 100);
        long long13 = fixedDateTimeZone5.previousTransition((long) 'u');
        long long15 = fixedDateTimeZone5.convertUTCToLocal((long) 6);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone5);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(4800245711172L, (org.joda.time.DateTimeZone) fixedDateTimeZone5);
        boolean boolean18 = fixedDateTimeZone5.isFixed();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-33L) + "'", long11 == (-33L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 117L + "'", long13 == 117L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 38L + "'", long15 == 38L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 428);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(827, 458, 34796092, 34997441, 29394588, 601);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34997441 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale5 = new java.util.Locale("2122-02-11T09:35:08.397Z", "UTC", "hi!");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.util.Set<java.lang.Character> charSet7 = locale0.getExtensionKeys();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMonths(1);
        java.lang.String str12 = localDateTime8.toString("2022");
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plusMillis(0);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.yearOfEra();
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = property20.getDifference(readableInstant21);
        java.util.Locale locale26 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleAttributes();
        int int28 = property20.getMaximumTextLength(locale26);
        org.joda.time.LocalDateTime localDateTime30 = property20.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.DateTime dateTime32 = localDateTime30.toDateTime(readableInstant31);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime32.getZone();
        org.joda.time.DateTime dateTime34 = localDateTime8.toDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.plusMillis(0);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.yearOfEra();
        org.joda.time.ReadableInstant readableInstant43 = null;
        int int44 = property42.getDifference(readableInstant43);
        java.util.Locale locale48 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleAttributes();
        int int50 = property42.getMaximumTextLength(locale48);
        org.joda.time.LocalDateTime localDateTime52 = property42.addToCopy((int) (byte) 100);
        java.util.TimeZone timeZone53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        java.util.Locale locale56 = java.util.Locale.GERMANY;
        java.lang.String str57 = dateTimeZone54.getName((long) 292278993, locale56);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone54);
        org.joda.time.DateTime dateTime59 = localDateTime52.toDateTime(dateTimeZone54);
        long long60 = dateTime59.getMillis();
        int int61 = dateTime34.compareTo((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.DateTimeZone dateTimeZone62 = dateTime59.getZone();
        boolean boolean63 = dateTimeZone62.isFixed();
        java.util.Locale locale66 = java.util.Locale.forLanguageTag("2122-02-11T09:35:10.043Z");
        java.lang.String str67 = dateTimeZone62.getShortName((long) 235, locale66);
        java.lang.String str68 = locale0.getDisplayName(locale66);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(locale5.toString(), "2122-02-11t09:35:08.397z_UTC_hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Chinese (China)" + "'", str6, "Chinese (China)");
        org.junit.Assert.assertNotNull(charSet7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022" + "'", str12, "2022");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals(locale26.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals(locale48.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 9 + "'", int50 == 9);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00:00.032" + "'", str57, "+00:00:00.032");
        org.junit.Assert.assertNotNull(dateTime59);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + 4800246299458L + "'", long60 == 4800246299458L);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+00:00:00.032" + "'", str67, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Chinese (China)" + "'", str68, "Chinese (China)");
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(456);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("2122-02-11T09:35:07.818Z", "Italian", (int) ' ', (int) (byte) 0);
        int int6 = fixedDateTimeZone4.getStandardOffset((long) 529);
        long long10 = fixedDateTimeZone4.convertLocalToUTC((long) (-1), false, (long) 100);
        int int12 = fixedDateTimeZone4.getOffset((long) ' ');
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId15 = timeZone14.toZoneId();
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId17 = timeZone16.toZoneId();
        boolean boolean18 = timeZone14.hasSameRules(timeZone16);
        boolean boolean19 = timeZone13.hasSameRules(timeZone16);
        java.time.ZoneId zoneId20 = timeZone13.toZoneId();
        java.util.TimeZone timeZone21 = java.util.TimeZone.getTimeZone(zoneId20);
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone(zoneId20);
        boolean boolean23 = timeZone22.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone22);
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) timeZone22);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.plusMillis(0);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.yearOfEra();
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = property33.getDifference(readableInstant34);
        java.util.Locale locale39 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleAttributes();
        int int41 = property33.getMaximumTextLength(locale39);
        java.lang.String str42 = property33.toString();
        org.joda.time.LocalDateTime localDateTime44 = property33.setCopy((int) (byte) 10);
        boolean boolean45 = fixedDateTimeZone4.equals((java.lang.Object) property33);
        boolean boolean46 = fixedDateTimeZone4.isFixed();
        int int48 = fixedDateTimeZone4.getOffsetFromLocal(4800245965645L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone53 = new org.joda.time.tz.FixedDateTimeZone("italiano", "2122-02-11T08:00:12.990-01:35", 6, (int) (short) 1);
        long long56 = fixedDateTimeZone53.convertLocalToUTC((long) (-798211), true);
        java.lang.String str57 = fixedDateTimeZone53.getID();
        long long59 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone53, 4800246155232L);
        int int61 = fixedDateTimeZone53.getStandardOffset(4800246009907L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-33L) + "'", long10 == (-33L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId15);
        org.junit.Assert.assertNotNull(timeZone16);
// flaky:         org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertNotNull(timeZone21);
// flaky:         org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals(locale39.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Property[yearOfEra]" + "'", str42, "Property[yearOfEra]");
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 32 + "'", int48 == 32);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-798217L) + "'", long56 == (-798217L));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "italiano" + "'", str57, "italiano");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 4800246155258L + "'", long59 == 4800246155258L);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        int int15 = property7.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusMillis(0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = property23.getDifference(readableInstant24);
        java.util.Locale locale29 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        int int31 = property23.getMaximumTextLength(locale29);
        org.joda.time.LocalDateTime localDateTime33 = property23.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime(readableInstant34);
        long long36 = dateTime35.getMillis();
        int int37 = property7.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.plusMillis(0);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.yearOfEra();
        org.joda.time.ReadableInstant readableInstant46 = null;
        int int47 = property45.getDifference(readableInstant46);
        java.util.Locale locale51 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet52 = locale51.getUnicodeLocaleAttributes();
        int int53 = property45.getMaximumTextLength(locale51);
        org.joda.time.LocalDateTime localDateTime55 = property45.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.DateTime dateTime57 = localDateTime55.toDateTime(readableInstant56);
        org.joda.time.DateTimeZone dateTimeZone58 = dateTime57.getZone();
        java.util.Locale locale60 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str61 = dateTimeZone58.getShortName((-3155679300L), locale60);
        int int62 = property7.getMaximumShortTextLength(locale60);
        java.lang.String str63 = locale60.getDisplayVariant();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime64.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime();
        int int70 = localDateTime69.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime68.withFields((org.joda.time.ReadablePartial) localDateTime69);
        org.joda.time.LocalDateTime.Property property72 = localDateTime71.minuteOfHour();
        java.lang.String str73 = property72.getAsShortText();
        java.util.Locale locale75 = java.util.Locale.FRANCE;
        org.joda.time.LocalDateTime localDateTime76 = property72.setCopy("35", locale75);
        java.lang.String str77 = locale75.getDisplayCountry();
        java.lang.String str78 = locale60.getDisplayVariant(locale75);
        java.util.Set<java.lang.String> strSet79 = locale75.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = strSet79.add("2122-02-11T09:36:07.015Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 4800246299526L + "'", long36 == 4800246299526L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals(locale51.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 9 + "'", int53 == 9);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+00:00:00.032" + "'", str61, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 9 + "'", int62 == 9);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2022 + "'", int70 == 2022);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(property72);
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "44" + "'", str73, "44");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localDateTime76);
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\u6cd5\u56fd" + "'", str77, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(strSet79);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2022-02-11T08:08:31.801");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("2122-02-11T09:35:07.818Z", "Italian", (int) ' ', (int) (byte) 0);
        long long6 = fixedDateTimeZone4.previousTransition((long) 9);
        java.lang.String str8 = fixedDateTimeZone4.getShortName(4800245716534L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("italiano", "2122-02-11T08:00:12.990-01:35", 6, (int) (short) 1);
        long long15 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, (long) (byte) 0);
        long long18 = fixedDateTimeZone13.convertLocalToUTC((long) 373, false);
        java.lang.String str20 = fixedDateTimeZone13.getNameKey(4800245889248L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9L + "'", long6 == 9L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.032" + "'", str8, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 26L + "'", long15 == 26L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 367L + "'", long18 == 367L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2122-02-11T08:00:12.990-01:35" + "'", str20, "2122-02-11T08:00:12.990-01:35");
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("2122-02-11T09:35:07.818Z", "Italian", (int) ' ', (int) (byte) 0);
        int int6 = fixedDateTimeZone4.getStandardOffset((long) 529);
        long long10 = fixedDateTimeZone4.convertLocalToUTC((long) (-1), false, (long) 100);
        long long12 = fixedDateTimeZone4.previousTransition((long) 'u');
        int int14 = fixedDateTimeZone4.getOffsetFromLocal(4800245757062L);
        int int16 = fixedDateTimeZone4.getOffsetFromLocal(4800245714925L);
        boolean boolean18 = fixedDateTimeZone4.isStandardOffset(4800245770739L);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        java.lang.String str24 = dateTimeZone21.getName((long) 292278993, locale23);
        java.util.Locale locale26 = new java.util.Locale("2122-02-11T09:35:34.361Z");
        java.lang.String str27 = locale23.getDisplayVariant(locale26);
        java.lang.String str28 = locale26.toLanguageTag();
        java.lang.String str29 = locale26.toLanguageTag();
        java.lang.String str30 = fixedDateTimeZone4.getName(34779115L, locale26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-33L) + "'", long10 == (-33L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 117L + "'", long12 == 117L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.032" + "'", str24, "+00:00:00.032");
        org.junit.Assert.assertEquals(locale26.toString(), "2122-02-11t09:35:34.361z");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "und" + "'", str28, "und");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "und" + "'", str29, "und");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.032" + "'", str30, "+00:00:00.032");
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 'a');
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        int int15 = localDateTime14.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withFields((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minus(readableDuration17);
        boolean boolean19 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.secondOfMinute();
        boolean boolean21 = localDateTime1.equals((java.lang.Object) localDateTime18);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime1.withWeekyear(901);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        int int15 = property7.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime17 = property7.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime(readableInstant18);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder20.clearExtensions();
        boolean boolean22 = dateTime19.equals((java.lang.Object) builder21);
        java.util.Locale.Builder builder24 = builder21.setLanguage("deu");
        java.util.Locale locale25 = builder24.build();
        java.lang.String str26 = locale25.getScript();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "deu");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        int int15 = property7.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusMillis(0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = property23.getDifference(readableInstant24);
        java.util.Locale locale29 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        int int31 = property23.getMaximumTextLength(locale29);
        org.joda.time.LocalDateTime localDateTime33 = property23.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime(readableInstant34);
        long long36 = dateTime35.getMillis();
        int int37 = property7.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDateTime localDateTime39 = property7.setCopy(100);
        org.joda.time.LocalDateTime localDateTime40 = property7.roundHalfCeilingCopy();
        int int41 = localDateTime40.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property47.getFieldType();
        boolean boolean49 = localDateTime40.isSupported(dateTimeFieldType48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime40.weekyear();
        org.joda.time.LocalDateTime localDateTime52 = property50.addToCopy(350);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.millisOfSecond();
        org.joda.time.LocalDateTime.Property property54 = localDateTime52.era();
        org.joda.time.LocalDateTime.Property property55 = localDateTime52.hourOfDay();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 4800246299611L + "'", long36 == 4800246299611L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 6 + "'", int41 == 6);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(property55);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusMinutes(22);
        int int5 = localDateTime1.getMillisOfSecond();
        int int6 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.minuteOfHour();
        java.lang.String str8 = property7.getAsString();
        org.joda.time.LocalDateTime localDateTime9 = property7.withMaximumValue();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfEra();
        int int11 = localDateTime9.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.plusMillis(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.yearOfEra();
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = property19.getDifference(readableInstant20);
        java.util.Locale locale25 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleAttributes();
        int int27 = property19.getMaximumTextLength(locale25);
        org.joda.time.LocalDateTime localDateTime29 = property19.addToCopy((int) (byte) 100);
        int int30 = localDateTime29.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.dayOfMonth();
        org.joda.time.LocalDateTime.Property property32 = localDateTime29.era();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime34 = property32.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withMillisOfSecond(15);
        org.joda.time.DateTime dateTime37 = localDateTime36.toDateTime();
        java.lang.String str38 = dateTime37.toString();
        org.joda.time.DateTime dateTime39 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Instant instant40 = dateTime39.toInstant();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.plusMillis(0);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.yearOfEra();
        org.joda.time.ReadableInstant readableInstant49 = null;
        int int50 = property48.getDifference(readableInstant49);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = property48.getAsText(locale51);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime53.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime53.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime60.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime();
        int int66 = localDateTime65.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.withFields((org.joda.time.ReadablePartial) localDateTime65);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.minus(readableDuration68);
        boolean boolean70 = localDateTime59.isBefore((org.joda.time.ReadablePartial) localDateTime69);
        int int71 = localDateTime69.getYearOfEra();
        org.joda.time.LocalDateTime.Property property72 = localDateTime69.yearOfEra();
        boolean boolean73 = property48.equals((java.lang.Object) localDateTime69);
        int int74 = property48.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime76 = property48.setCopy(9);
        java.lang.String str77 = property48.getAsText();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(chronology78);
        int int80 = localDateTime79.getYearOfCentury();
        int int81 = localDateTime79.getMillisOfSecond();
        int int82 = localDateTime79.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime84 = localDateTime79.plusYears((int) '4');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray85 = localDateTime84.getFieldTypes();
        org.joda.time.DateTime dateTime86 = localDateTime84.toDateTime();
        long long87 = property48.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime86);
        int int88 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime86);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 670 + "'", int5 == 670);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44" + "'", str8, "44");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals(locale25.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-2122-02-11T09:44:59.015+00:00:00.032" + "'", str38, "-2122-02-11T09:44:59.015+00:00:00.032");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "2022" + "'", str52, "2022");
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2022 + "'", int66 == 2022);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2022 + "'", int71 == 2022);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 292278993 + "'", int74 == 292278993);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "2022" + "'", str77, "2022");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 22 + "'", int80 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int81 + "' != '" + 670 + "'", int81 == 670);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 11 + "'", int82 == 11);
        org.junit.Assert.assertNotNull(localDateTime84);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray85);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-51L) + "'", long87 == (-51L));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDateTime localDateTime10 = property7.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDurationAdded(readableDuration11, 1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusDays(292278993);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime();
        int int32 = localDateTime31.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withFields((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minus(readableDuration34);
        boolean boolean36 = localDateTime25.isBefore((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime25.plusDays(292278993);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime();
        int int45 = localDateTime44.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withFields((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.minus(readableDuration47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.minusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.minusHours(9);
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime53.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property58.getFieldType();
        boolean boolean60 = localDateTime52.isSupported(dateTimeFieldType59);
        boolean boolean61 = localDateTime38.isSupported(dateTimeFieldType59);
        org.joda.time.LocalDateTime.Property property62 = localDateTime18.property(dateTimeFieldType59);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime13.withField(dateTimeFieldType59, 16);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime66.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime66.plusMillis(0);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.yearOfEra();
        org.joda.time.ReadableInstant readableInstant74 = null;
        int int75 = property73.getDifference(readableInstant74);
        java.util.Locale locale79 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet80 = locale79.getUnicodeLocaleAttributes();
        int int81 = property73.getMaximumTextLength(locale79);
        org.joda.time.LocalDateTime localDateTime83 = property73.addToCopy((int) (byte) 100);
        java.util.TimeZone timeZone84 = null;
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forTimeZone(timeZone84);
        java.util.Locale locale87 = java.util.Locale.GERMANY;
        java.lang.String str88 = dateTimeZone85.getName((long) 292278993, locale87);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone85);
        org.joda.time.DateTime dateTime90 = localDateTime83.toDateTime(dateTimeZone85);
        org.joda.time.LocalDateTime localDateTime92 = localDateTime83.minusWeeks(529);
        int int93 = property65.compareTo((org.joda.time.ReadablePartial) localDateTime83);
        org.joda.time.LocalDateTime localDateTime95 = property65.addToCopy(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime97 = localDateTime95.withSecondOfMinute(813);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 813 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2022 + "'", int32 == 2022);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2022 + "'", int45 == 2022);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertEquals(locale79.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 9 + "'", int81 == 9);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertNotNull(dateTimeZone85);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "+00:00:00.032" + "'", str88, "+00:00:00.032");
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertNotNull(localDateTime92);
// flaky:         org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(localDateTime95);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        int int10 = localDateTime9.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withFields((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.minuteOfHour();
        java.lang.String str13 = property12.getAsShortText();
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        org.joda.time.LocalDateTime localDateTime16 = property12.setCopy("35", locale15);
        java.lang.String str17 = locale15.getDisplayCountry();
        java.lang.String str18 = locale15.getISO3Country();
        java.util.Locale.Builder builder19 = builder2.setLocale(locale15);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime();
        int int33 = localDateTime32.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withFields((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minus(readableDuration35);
        boolean boolean37 = localDateTime26.isBefore((org.joda.time.ReadablePartial) localDateTime36);
        int int38 = localDateTime36.getYearOfEra();
        org.joda.time.LocalDateTime.Property property39 = localDateTime36.yearOfEra();
        int int40 = localDateTime36.getYear();
        org.joda.time.LocalDateTime.Property property41 = localDateTime36.monthOfYear();
        java.lang.String str42 = property41.getAsString();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.plusMillis(0);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.yearOfEra();
        org.joda.time.ReadableInstant readableInstant51 = null;
        int int52 = property50.getDifference(readableInstant51);
        java.util.Locale locale56 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet57 = locale56.getUnicodeLocaleAttributes();
        int int58 = property50.getMaximumTextLength(locale56);
        java.lang.String str59 = property50.toString();
        java.util.Locale locale60 = java.util.Locale.ITALIAN;
        java.lang.String str61 = locale60.getDisplayLanguage();
        java.lang.String str62 = locale60.getVariant();
        int int63 = property50.getMaximumShortTextLength(locale60);
        java.util.Set<java.lang.String> strSet64 = locale60.getUnicodeLocaleAttributes();
        java.lang.String str65 = property41.getAsShortText(locale60);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime66.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime66.plusMillis(0);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.yearOfEra();
        org.joda.time.ReadableInstant readableInstant74 = null;
        int int75 = property73.getDifference(readableInstant74);
        java.util.Locale locale79 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet80 = locale79.getUnicodeLocaleAttributes();
        int int81 = property73.getMaximumTextLength(locale79);
        org.joda.time.LocalDateTime localDateTime83 = property73.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant84 = null;
        org.joda.time.DateTime dateTime85 = localDateTime83.toDateTime(readableInstant84);
        org.joda.time.DateTimeZone dateTimeZone86 = dateTime85.getZone();
        java.util.Locale locale88 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str89 = dateTimeZone86.getShortName((-3155679300L), locale88);
        java.lang.String str90 = property41.getAsText(locale88);
        java.util.Locale.Builder builder91 = builder2.setLocale(locale88);
        java.util.Locale locale92 = builder2.build();
        boolean boolean94 = locale92.equals((java.lang.Object) 54068L);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "44" + "'", str13, "44");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u6cd5\u56fd" + "'", str17, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "FRA" + "'", str18, "FRA");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2022 + "'", int38 == 2022);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2022 + "'", int40 == 2022);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2" + "'", str42, "2");
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals(locale56.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 9 + "'", int58 == 9);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Property[yearOfEra]" + "'", str59, "Property[yearOfEra]");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str61, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 9 + "'", int63 == 9);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "feb" + "'", str65, "feb");
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertEquals(locale79.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 9 + "'", int81 == 9);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(dateTimeZone86);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "+00:00:00.032" + "'", str89, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "\u4e8c\u6708" + "'", str90, "\u4e8c\u6708");
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone dateTimeZone4 = provider0.getZone("2122-02-11T09:35:32.577Z");
        org.joda.time.DateTimeZone dateTimeZone6 = provider0.getZone("2122-02-11T09:35:30.958Z");
        org.joda.time.DateTimeZone dateTimeZone8 = provider0.getZone("ko");
        org.joda.time.DateTimeZone dateTimeZone10 = provider0.getZone("54");
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertNull(dateTimeZone10);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readableDuration15);
        boolean boolean17 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        int int18 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withYearOfCentury((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.plusMillis(0);
        org.joda.time.LocalDateTime.Property property28 = localDateTime21.minuteOfHour();
        boolean boolean30 = property28.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDateTime localDateTime31 = property28.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.centuryOfEra();
        boolean boolean33 = localDateTime16.isBefore((org.joda.time.ReadablePartial) localDateTime31);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.plus(readableDuration34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime31.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = property36.getField();
        java.lang.String str38 = property36.toString();
        org.joda.time.LocalDateTime localDateTime39 = property36.roundFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plus(readablePeriod40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.plusMinutes(789);
        int[] intArray44 = localDateTime39.getValues();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
// flaky:         org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Property[millisOfDay]" + "'", str38, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(intArray44);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[2022, 2, 11, 35100000]");
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.minuteOfHour();
        boolean boolean9 = property7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDateTime localDateTime10 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        org.joda.time.DurationField durationField14 = property13.getDurationField();
        org.joda.time.LocalDateTime localDateTime16 = property13.addToCopy((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime17 = property13.roundFloorCopy();
        int int18 = property13.getMaximumValue();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 365 + "'", int18 == 365);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        strSet4.clear();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale locale12 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale12 };
        java.util.ArrayList<java.util.Locale> localeList14 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList14, localeArray13);
        java.util.List<java.util.Locale> localeList16 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList14);
        java.util.stream.Stream<java.util.Locale> localeStream17 = localeList14.stream();
        boolean boolean18 = strSet4.retainAll((java.util.Collection<java.util.Locale>) localeList14);
        strSet4.clear();
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.util.Locale locale26 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Locale[] localeArray27 = new java.util.Locale[] { locale26 };
        java.util.ArrayList<java.util.Locale> localeList28 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList28, localeArray27);
        java.util.List<java.util.Locale> localeList30 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.util.Locale>) localeList28);
        java.util.Locale locale34 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet35 = locale34.getUnicodeLocaleAttributes();
        java.lang.String str36 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strSet35);
        java.util.Locale locale37 = java.util.Locale.ITALIAN;
        java.lang.String str38 = locale37.getDisplayLanguage();
        java.util.Locale locale39 = java.util.Locale.JAPANESE;
        java.util.Locale locale40 = java.util.Locale.ITALIAN;
        java.util.Locale locale44 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleAttributes();
        java.lang.String str46 = locale44.getLanguage();
        java.util.Locale locale47 = java.util.Locale.JAPANESE;
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale53 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet54 = locale53.getUnicodeLocaleAttributes();
        java.util.Locale locale55 = java.util.Locale.ITALIAN;
        java.lang.String str56 = locale55.getDisplayLanguage();
        java.util.Locale locale60 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str61 = locale60.getDisplayScript();
        java.util.Locale locale65 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str66 = locale65.getDisplayScript();
        java.util.Locale locale70 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet71 = locale70.getUnicodeLocaleAttributes();
        java.lang.String str72 = locale70.getLanguage();
        java.util.Locale locale73 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale[] localeArray74 = new java.util.Locale[] { locale37, locale39, locale40, locale44, locale47, locale49, locale53, locale55, locale60, locale65, locale70, locale73 };
        java.util.ArrayList<java.util.Locale> localeList75 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList75, localeArray74);
        boolean boolean77 = strSet35.retainAll((java.util.Collection<java.util.Locale>) localeList75);
        java.util.stream.Stream<java.util.Locale> localeStream78 = localeList75.parallelStream();
        boolean boolean79 = strSet4.retainAll((java.util.Collection<java.util.Locale>) localeList75);
        boolean boolean81 = strSet4.contains((java.lang.Object) "2122-02-11T09:35:42.103Z");
        int int82 = strSet4.size();
        java.lang.Object[] objArray83 = strSet4.toArray();
        java.util.Iterator<java.lang.String> strItor84 = strSet4.iterator();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(localeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localeList16);
        org.junit.Assert.assertNotNull(localeStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals(locale26.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(localeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(localeList30);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str38, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "it");
        org.junit.Assert.assertEquals(locale44.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ja");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertEquals(locale53.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "it");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\u610f\u5927\u5229\u6587" + "'", str56, "\u610f\u5927\u5229\u6587");
        org.junit.Assert.assertEquals(locale60.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals(locale65.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals(locale70.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(localeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(localeStream78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[]");
        org.junit.Assert.assertNotNull(strItor84);
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale5 = new java.util.Locale("2122-02-11T09:35:08.397Z", "UTC", "hi!");
        java.lang.String str6 = locale5.getLanguage();
        java.util.Locale.setDefault(category0, locale5);
        java.util.Locale locale8 = java.util.Locale.getDefault(category0);
        java.util.Locale locale11 = new java.util.Locale("-292275054-02-11T09:36:40.003", "11");
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder14 = builder12.clear();
        java.util.Locale.Builder builder15 = builder12.clearExtensions();
        java.util.Locale.Builder builder16 = builder15.clear();
        java.util.Locale.Builder builder17 = builder16.clear();
        java.util.Locale locale18 = builder17.build();
        java.util.Locale locale20 = new java.util.Locale("2122-02-11T09:35:57.511Z");
        java.util.Locale locale24 = new java.util.Locale("2022-02-11T09:35:56.126", "2122-02-11T08:00:47.630-01:35", "2022-02-11T09:36:27.876");
        java.lang.String str25 = locale20.getDisplayVariant(locale24);
        java.lang.String str26 = locale18.getDisplayScript(locale24);
        java.lang.String str27 = locale11.getDisplayScript(locale18);
        java.util.Locale.setDefault(category0, locale11);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh");
        org.junit.Assert.assertEquals(locale5.toString(), "2122-02-11t09:35:08.397z_UTC_hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2122-02-11t09:35:08.397z" + "'", str6, "2122-02-11t09:35:08.397z");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "2122-02-11t09:35:08.397z_UTC_hi!");
        org.junit.Assert.assertEquals(locale11.toString(), "-292275054-02-11t09:36:40.003_11");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals(locale20.toString(), "2122-02-11t09:35:57.511z");
        org.junit.Assert.assertEquals(locale24.toString(), "2022-02-11t09:35:56.126_2122-02-11T08:00:47.630-01:35_2022-02-11T09:36:27.876");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plus(readablePeriod2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.dayOfWeek();
        boolean boolean5 = property4.isLeap();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.yearOfCentury();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.dayOfWeek();
        org.joda.time.DurationField durationField7 = property6.getLeapDurationField();
        int int8 = property6.getMinimumValue();
        long long9 = property6.remainder();
        java.util.Locale locale13 = new java.util.Locale("22", "2122-02-11T09:35:07.818Z", "2122-02-11T08:00:11.407-01:35");
        int int14 = property6.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime16 = property6.addToCopy(0L);
        java.util.Locale.Builder builder17 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder18 = builder17.clearExtensions();
        java.util.Locale.Builder builder19 = builder17.clear();
        java.util.Locale.Builder builder21 = builder17.setLanguageTag("zh");
        java.util.Locale.Builder builder22 = builder21.clear();
        java.util.Locale locale23 = builder21.build();
        int int24 = property6.getMaximumShortTextLength(locale23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property6.getFieldType();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35099896L + "'", long9 == 35099896L);
        org.junit.Assert.assertEquals(locale13.toString(), "22_2122-02-11T09:35:07.818Z_2122-02-11T08:00:11.407-01:35");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(34857586, 5944306, 34784121, 726, 791);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 726 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = dateTimeZone11.getName((long) 292278993, locale13);
        int int15 = property9.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime17 = property9.addToCopy((int) (byte) 0);
        org.joda.time.DurationField durationField18 = property9.getDurationField();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.032" + "'", str14, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2122-02-11T09:40:16.018Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2122-02-11T09:40:16.018Z\" is malformed at \"Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime6.getFields();
        org.joda.time.DateTime dateTime8 = localDateTime6.toDateTime();
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.minusHours(524);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusSeconds(924);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plusMillis(0);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfEra();
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.lang.String str25 = locale23.getVariant();
        java.lang.String str26 = property22.getAsShortText(locale23);
        boolean boolean27 = property22.isLeap();
        org.joda.time.LocalDateTime localDateTime28 = property22.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime30 = property22.addToCopy((long) 13);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        int int34 = dateTimeZone32.getOffsetFromLocal((long) 9);
        java.lang.String str36 = dateTimeZone32.getName((long) 13);
        long long39 = dateTimeZone32.adjustOffset(4800245710661L, false);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        java.util.TimeZone timeZone41 = dateTimeZone32.toTimeZone();
        org.joda.time.DateTime dateTime42 = localDateTime30.toDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property43 = localDateTime30.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property43.getFieldType();
        boolean boolean45 = localDateTime14.isSupported(dateTimeFieldType44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime6.property(dateTimeFieldType44);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '#');
        java.util.Locale locale53 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str54 = locale53.getDisplayScript();
        java.lang.String str55 = dateTimeZone50.getShortName(10L, locale53);
        long long58 = dateTimeZone50.adjustOffset(0L, false);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime60.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime();
        int int66 = localDateTime65.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.withFields((org.joda.time.ReadablePartial) localDateTime65);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.minus(readableDuration68);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.minusYears(0);
        boolean boolean72 = dateTimeZone59.isLocalDateTimeGap(localDateTime69);
        long long76 = dateTimeZone59.convertLocalToUTC((long) 1, true, 100L);
        long long78 = dateTimeZone50.getMillisKeepLocal(dateTimeZone59, 4800245711010L);
        int int80 = dateTimeZone50.getStandardOffset(4800245711010L);
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime(4800245718651L, dateTimeZone50);
        org.joda.time.ReadablePeriod readablePeriod82 = null;
        org.joda.time.LocalDateTime localDateTime83 = localDateTime81.minus(readablePeriod82);
        java.util.Date date84 = localDateTime83.toDate();
        org.joda.time.LocalDateTime localDateTime86 = localDateTime83.plusDays(34520736);
        org.joda.time.Chronology chronology87 = localDateTime83.getChronology();
        org.joda.time.LocalDateTime localDateTime88 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime6, chronology87);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(dateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Italian" + "'", str24, "Italian");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2022" + "'", str26, "2022");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.032" + "'", str36, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 4800245710661L + "'", long39 == 4800245710661L);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "-01:35" + "'", str55, "-01:35");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2022 + "'", int66 == 2022);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-31L) + "'", long76 == (-31L));
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 4800240010978L + "'", long78 == 4800240010978L);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-5700000) + "'", int80 == (-5700000));
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertNotNull(date84);
// flaky:         org.junit.Assert.assertEquals(date84.toString(), "Wed Feb 11 08:00:18 GMT 2122");
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertNotNull(chronology87);
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone dateTimeZone4 = provider0.getZone("2122-02-11T09:35:32.577Z");
        org.joda.time.DateTimeZone dateTimeZone6 = provider0.getZone("2122-02-11T09:35:30.958Z");
        org.joda.time.DateTimeZone dateTimeZone8 = provider0.getZone("5");
        java.util.Set<java.lang.String> strSet9 = provider0.getAvailableIDs();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        int int15 = property7.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime17 = property7.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime(readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime19.getZone();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plusMillis(0);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.yearOfEra();
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = property29.getDifference(readableInstant30);
        java.util.Locale locale35 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        int int37 = property29.getMaximumTextLength(locale35);
        org.joda.time.LocalDateTime localDateTime39 = property29.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTime dateTime41 = localDateTime39.toDateTime(readableInstant40);
        java.lang.String str42 = dateTime41.toString();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime43.plusMillis(0);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.yearOfEra();
        org.joda.time.ReadableInstant readableInstant51 = null;
        int int52 = property50.getDifference(readableInstant51);
        java.util.Locale locale56 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet57 = locale56.getUnicodeLocaleAttributes();
        int int58 = property50.getMaximumTextLength(locale56);
        org.joda.time.LocalDateTime localDateTime60 = property50.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.DateTime dateTime62 = localDateTime60.toDateTime(readableInstant61);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime63.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime63.plusMillis(0);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.yearOfEra();
        org.joda.time.ReadableInstant readableInstant71 = null;
        int int72 = property70.getDifference(readableInstant71);
        java.util.Locale locale76 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet77 = locale76.getUnicodeLocaleAttributes();
        int int78 = property70.getMaximumTextLength(locale76);
        org.joda.time.LocalDateTime localDateTime80 = property70.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.DateTime dateTime82 = localDateTime80.toDateTime(readableInstant81);
        boolean boolean83 = dateTime62.isBefore(readableInstant81);
        boolean boolean84 = dateTime41.isEqual((org.joda.time.ReadableInstant) dateTime62);
        long long85 = dateTime62.getMillis();
        boolean boolean86 = dateTime19.isBefore((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Chronology chronology87 = dateTime19.getChronology();
        org.joda.time.LocalDateTime localDateTime88 = org.joda.time.LocalDateTime.now(chronology87);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2122-02-11T09:45:00.014+00:00:00.032" + "'", str42, "2122-02-11T09:45:00.014+00:00:00.032");
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals(locale56.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 9 + "'", int58 == 9);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertEquals(locale76.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 9 + "'", int78 == 9);
        org.junit.Assert.assertNotNull(localDateTime80);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long85 + "' != '" + 4800246299983L + "'", long85 == 4800246299983L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(chronology87);
        org.junit.Assert.assertNotNull(localDateTime88);
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        int int6 = localDateTime5.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.minuteOfHour();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        int int10 = property8.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime12 = property8.setCopy(13);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusSeconds(883);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime12);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.minusHours(50);
        int int18 = localDateTime17.getHourOfDay();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readableDuration15);
        boolean boolean17 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.plus(readableDuration19);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        int int23 = dateTimeZone21.getOffset((long) 10);
        boolean boolean24 = dateTimeZone21.isFixed();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plusMillis(0);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.yearOfEra();
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = property32.getDifference(readableInstant33);
        java.util.Locale locale38 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleAttributes();
        int int40 = property32.getMaximumTextLength(locale38);
        org.joda.time.LocalDateTime localDateTime42 = property32.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.DateTime dateTime44 = localDateTime42.toDateTime(readableInstant43);
        long long45 = dateTime44.getMillis();
        int int46 = dateTimeZone21.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime16, dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) 305);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime50.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.withSecondOfMinute(10);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.minusYears((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime49.withFields((org.joda.time.ReadablePartial) localDateTime58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withMillisOfDay(666);
        java.lang.Object obj62 = null;
        boolean boolean63 = localDateTime61.equals(obj62);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime16.withFields((org.joda.time.ReadablePartial) localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 4800246300047L + "'", long45 == 4800246300047L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(localDateTime64);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        int int6 = localDateTime5.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.minuteOfHour();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        int int10 = property8.getMinimumValue();
        int int11 = property8.getMaximumValue();
        java.util.Locale locale13 = new java.util.Locale("2022");
        java.lang.String str14 = property8.getAsShortText(locale13);
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.util.Set<java.lang.Character> charSet16 = locale15.getExtensionKeys();
        java.util.Set<java.lang.String> strSet17 = locale15.getUnicodeLocaleAttributes();
        int int18 = property8.getMaximumTextLength(locale15);
        org.joda.time.LocalDateTime localDateTime19 = property8.getLocalDateTime();
        int int20 = localDateTime19.getWeekyear();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusHours(415);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfCentury();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertEquals(locale13.toString(), "2022");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "45" + "'", str14, "45");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        java.util.Locale locale3 = new java.util.Locale("2122-02-11T09:35:08.397Z", "UTC", "hi!");
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusMillis(0);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.yearOfEra();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = property11.getDifference(readableInstant12);
        java.util.Locale locale17 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleAttributes();
        int int19 = property11.getMaximumTextLength(locale17);
        org.joda.time.LocalDateTime localDateTime21 = property11.addToCopy((int) (byte) 100);
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("hi!");
        int int24 = property11.getMaximumShortTextLength(locale23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime();
        int int31 = localDateTime30.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withFields((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.minuteOfHour();
        java.lang.String str34 = property33.getAsShortText();
        org.joda.time.LocalDateTime localDateTime36 = property33.setCopy("35");
        int int37 = property33.getLeapAmount();
        java.util.Locale locale38 = java.util.Locale.ITALIAN;
        int int39 = property33.getMaximumShortTextLength(locale38);
        java.lang.String str40 = locale23.getDisplayLanguage(locale38);
        java.lang.String str41 = locale3.getDisplayCountry(locale23);
        java.util.Set<java.lang.String> strSet42 = locale23.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray43 = strSet42.toArray();
        java.util.Iterator<java.lang.String> strItor44 = strSet42.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator45 = strSet42.spliterator();
        org.junit.Assert.assertEquals(locale3.toString(), "2122-02-11t09:35:08.397z_UTC_hi!");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2022 + "'", int31 == 2022);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "45" + "'", str34, "45");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(strItor44);
        org.junit.Assert.assertNotNull(strSpliterator45);
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.minuteOfHour();
        boolean boolean9 = property7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDateTime localDateTime10 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusSeconds(10);
        java.lang.String str13 = localDateTime10.toString();
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.year();
        org.joda.time.LocalDateTime localDateTime16 = property14.addWrapFieldToCopy(615);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = null;
        java.lang.String str18 = localDateTime16.toString(dateTimeFormatter17);
        int int19 = localDateTime16.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.plusMillis(0);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.yearOfEra();
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = property27.getDifference(readableInstant28);
        java.util.Locale locale33 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet34 = locale33.getUnicodeLocaleAttributes();
        int int35 = property27.getMaximumTextLength(locale33);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.plusMillis(0);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.yearOfEra();
        org.joda.time.ReadableInstant readableInstant44 = null;
        int int45 = property43.getDifference(readableInstant44);
        java.util.Locale locale49 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet50 = locale49.getUnicodeLocaleAttributes();
        int int51 = property43.getMaximumTextLength(locale49);
        org.joda.time.LocalDateTime localDateTime53 = property43.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.DateTime dateTime55 = localDateTime53.toDateTime(readableInstant54);
        long long56 = dateTime55.getMillis();
        int int57 = property27.compareTo((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.LocalDateTime localDateTime59 = property27.addToCopy(100);
        org.joda.time.LocalDateTime localDateTime60 = property27.roundFloorCopy();
        int int61 = localDateTime60.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime62.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime();
        int int68 = localDateTime67.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime66.withFields((org.joda.time.ReadablePartial) localDateTime67);
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.minus(readableDuration70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.minusYears(0);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime71.withDayOfYear((int) (short) 10);
        int int76 = localDateTime71.getWeekyear();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime71.withYearOfEra(35);
        int int79 = localDateTime71.getYearOfEra();
        boolean boolean80 = localDateTime60.isBefore((org.joda.time.ReadablePartial) localDateTime71);
        org.joda.time.DateTime dateTime81 = localDateTime71.toDateTime();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime16.withFields((org.joda.time.ReadablePartial) localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-11T09:45:00.000" + "'", str13, "2022-02-11T09:45:00.000");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2637-02-11T09:45:00.000" + "'", str18, "2637-02-11T09:45:00.000");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals(locale33.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals(locale49.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
// flaky:         org.junit.Assert.assertTrue("'" + long56 + "' != '" + 4800246300146L + "'", long56 == 4800246300146L);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2022 + "'", int68 == 2022);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2022 + "'", int76 == 2022);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2022 + "'", int79 == 2022);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(localDateTime82);
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale6 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Locale[] localeArray7 = new java.util.Locale[] { locale6 };
        java.util.ArrayList<java.util.Locale> localeList8 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList8, localeArray7);
        java.util.List<java.util.Locale> localeList10 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList8);
        java.util.Locale locale14 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        java.lang.String str16 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet15);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.lang.Object obj22 = null;
        boolean boolean23 = strSet20.remove(obj22);
        boolean boolean25 = strSet20.equals((java.lang.Object) true);
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet20);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap27 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList28 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap27);
        java.util.Collection<java.util.Locale> localeCollection29 = null;
        java.util.Locale locale30 = java.util.Locale.lookup(languageRangeList28, localeCollection29);
        java.util.Collection<java.lang.String> strCollection31 = null;
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags(languageRangeList28, strCollection31);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap33 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList34 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList28, strMap33);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(localeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localeList10);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(languageRangeList28);
        org.junit.Assert.assertNull(locale30);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(languageRangeList34);
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((java.lang.Object) 4800245758597L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        int int5 = localDateTime4.getYearOfCentury();
        int int6 = localDateTime4.getMillisOfSecond();
        int int7 = localDateTime4.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plusSeconds((int) (byte) -1);
        java.lang.String str10 = localDateTime9.toString();
        int int11 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 250 + "'", int6 == 250);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-11T09:44:59.250" + "'", str10, "2022-02-11T09:44:59.250");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMonths(272);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYear(0);
        int int16 = localDateTime12.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withWeekyear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField20 = localDateTime18.getField(829);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 829");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35110264 + "'", int16 == 35110264);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusMinutes(22);
        int int5 = localDateTime4.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusDays(692);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusMillis(0);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str17 = locale16.getDisplayLanguage();
        java.lang.String str18 = locale16.getVariant();
        java.lang.String str19 = property15.getAsShortText(locale16);
        org.joda.time.LocalDateTime localDateTime21 = property15.addWrapFieldToCopy(34536263);
        org.joda.time.Interval interval22 = property15.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property15.getFieldType();
        int int24 = localDateTime7.indexOf(dateTimeFieldType23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime7.plusMinutes(35053511);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 23 + "'", int5 == 23);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Italian" + "'", str17, "Italian");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2022" + "'", str19, "2022");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        int int15 = property7.getMaximumTextLength(locale13);
        java.lang.String str16 = property7.toString();
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.lang.String str18 = locale17.getDisplayLanguage();
        java.lang.String str19 = locale17.getVariant();
        int int20 = property7.getMaximumShortTextLength(locale17);
        org.joda.time.LocalDateTime localDateTime21 = property7.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime22 = property7.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime24 = property7.addWrapFieldToCopy(897);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Property[yearOfEra]" + "'", str16, "Property[yearOfEra]");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Italian" + "'", str18, "Italian");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone dateTimeZone4 = provider0.getZone("2122-02-11T09:35:32.577Z");
        org.joda.time.DateTimeZone dateTimeZone6 = provider0.getZone("2122-02-11T09:35:30.958Z");
        org.joda.time.DateTimeZone dateTimeZone8 = provider0.getZone("5");
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone dateTimeZone11 = provider0.getZone("2122-02-11T09:35:54.990Z");
        java.util.Set<java.lang.String> strSet12 = provider0.getAvailableIDs();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNull(dateTimeZone6);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("2122-02-11t08:00:14.119-01:35 (2122-02-11T09:35:20.005Z)", "Chinese (China)", 362, 317);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.plusMillis(0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = property13.getDifference(readableInstant14);
        java.util.Locale locale19 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleAttributes();
        int int21 = property13.getMaximumTextLength(locale19);
        org.joda.time.LocalDateTime localDateTime23 = property13.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime(readableInstant24);
        java.util.Locale.Builder builder26 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder26.clearExtensions();
        boolean boolean28 = dateTime25.equals((java.lang.Object) builder27);
        java.util.Locale.Builder builder30 = builder27.setLanguage("deu");
        java.util.Locale locale31 = builder30.build();
        java.util.Locale.Builder builder32 = builder30.clear();
        java.util.Locale locale35 = new java.util.Locale("2122-02-11T09:35:20.783Z", "-01:35");
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.lang.String str37 = locale36.getLanguage();
        java.lang.String str39 = locale36.getExtension('a');
        java.lang.String str40 = locale35.getDisplayCountry(locale36);
        java.util.Locale.Builder builder41 = builder30.setLocale(locale36);
        java.util.Locale locale45 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Locale locale49 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str50 = locale45.getDisplayVariant(locale49);
        java.util.Set<java.lang.String> strSet51 = locale49.getUnicodeLocaleKeys();
        java.lang.String str52 = locale36.getDisplayLanguage(locale49);
        java.lang.String str53 = fixedDateTimeZone4.getShortName(4800246102494L, locale49);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals(locale19.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "deu");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertEquals(locale35.toString(), "2122-02-11t09:35:20.783z_-01:35");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "zh" + "'", str37, "zh");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-01:35" + "'", str40, "-01:35");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals(locale45.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals(locale49.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Chinese" + "'", str52, "Chinese");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+00:00:00.362" + "'", str53, "+00:00:00.362");
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readableDuration15);
        boolean boolean17 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        int int18 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.yearOfEra();
        int int20 = localDateTime16.getYear();
        org.joda.time.LocalDateTime.Property property21 = localDateTime16.monthOfYear();
        org.joda.time.LocalDateTime localDateTime23 = property21.addToCopy(305);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minus(readablePeriod24);
        org.joda.time.DateTime dateTime26 = localDateTime23.toDateTime();
        int int27 = localDateTime23.getSecondOfMinute();
        int int28 = localDateTime23.getEra();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("-292275054-02-11T09:38:47.538");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '#');
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str6 = locale5.getDisplayScript();
        java.lang.String str7 = dateTimeZone2.getShortName(10L, locale5);
        long long10 = dateTimeZone2.adjustOffset((long) 10, false);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        int int17 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readableDuration19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withYearOfCentury((int) ' ');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMillisOfSecond((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withYear((int) (byte) 0);
        boolean boolean29 = dateTimeZone2.isLocalDateTimeGap(localDateTime28);
        java.util.Locale locale31 = java.util.Locale.ROOT;
        java.lang.String str32 = locale31.getScript();
        java.lang.String str33 = locale31.getCountry();
        java.lang.String str34 = locale31.getISO3Language();
        java.lang.String str35 = dateTimeZone2.getName((long) 53, locale31);
        boolean boolean36 = dateTimeZone2.isFixed();
        long long38 = dateTimeZone2.nextTransition((long) 746);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:35" + "'", str7, "-01:35");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-01:35" + "'", str35, "-01:35");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 746L + "'", long38 == 746L);
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("2122-02-11T09:35:07.818Z", "Italian", (int) ' ', (int) (byte) 0);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) (short) -1);
        long long8 = fixedDateTimeZone4.previousTransition(4800245714301L);
        int int10 = fixedDateTimeZone4.getStandardOffset(4800245725694L);
        org.joda.time.tz.NameProvider nameProvider11 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale15 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str16 = locale15.getDisplayScript();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        int int23 = localDateTime22.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.minuteOfHour();
        java.lang.String str26 = property25.getAsShortText();
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        org.joda.time.LocalDateTime localDateTime29 = property25.setCopy("35", locale28);
        java.util.Locale locale30 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale30);
        java.lang.String str32 = locale28.getDisplayVariant(locale30);
        java.lang.String str33 = locale15.getDisplayScript(locale28);
        java.lang.String str36 = nameProvider11.getShortName(locale15, "2122-02-11T08:00:15.629", "hi! (HI!,hi!)");
        boolean boolean37 = fixedDateTimeZone4.equals((java.lang.Object) nameProvider11);
        java.lang.String str39 = fixedDateTimeZone4.getNameKey((long) 571);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.parse("2022-02-11T08:00:00.000");
        int int42 = localDateTime41.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withYearOfEra(89);
        boolean boolean45 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime44);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Italian" + "'", str6, "Italian");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4800245714301L + "'", long8 == 4800245714301L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nameProvider11);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "45" + "'", str26, "45");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "it");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Italian" + "'", str39, "Italian");
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2022 + "'", int42 == 2022);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str4 = nameProvider0.getName(locale1, "2122-02-11T08:00:12.990-01:35", "");
        java.util.Locale locale8 = new java.util.Locale("2122-02-11T09:35:07.818Z", "", "Property[yearOfEra]");
        java.lang.String str11 = nameProvider0.getShortName(locale8, "ita", "2122-02-11T09:35:10.520Z");
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        java.lang.String str13 = locale8.getDisplayLanguage(locale12);
        java.util.Locale locale17 = new java.util.Locale("2122-02-11T08:00:17.784-01:35", "11", "2122-02-11T08:00:14.774-01:35");
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("UTC");
        java.lang.String str20 = locale19.getLanguage();
        java.lang.String str21 = locale17.getDisplayName(locale19);
        java.lang.String str22 = locale12.getDisplayLanguage(locale17);
        java.util.Locale locale23 = locale17.stripExtensions();
        boolean boolean24 = locale17.hasExtensions();
        boolean boolean25 = locale17.hasExtensions();
        java.util.Set<java.lang.String> strSet26 = locale17.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals(locale8.toString(), "2122-02-11t09:35:07.818z__Property[yearOfEra]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2122-02-11t09:35:07.818z" + "'", str13, "2122-02-11t09:35:07.818z");
        org.junit.Assert.assertEquals(locale17.toString(), "2122-02-11t08:00:17.784-01:35_11_2122-02-11T08:00:14.774-01:35");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "utc");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "utc" + "'", str20, "utc");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2122-02-11t08:00:17.784-01:35 (11,2122-02-11T08:00:14.774-01:35)" + "'", str21, "2122-02-11t08:00:17.784-01:35 (11,2122-02-11T08:00:14.774-01:35)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "French" + "'", str22, "French");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "2122-02-11t08:00:17.784-01:35_11_2122-02-11T08:00:14.774-01:35");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale.Category category1 = java.util.Locale.Category.FORMAT;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusMillis(0);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.yearOfEra();
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = property9.getDifference(readableInstant10);
        java.util.Locale locale15 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        int int17 = property9.getMaximumTextLength(locale15);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.plusMillis(0);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.yearOfEra();
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = property25.getDifference(readableInstant26);
        java.util.Locale locale31 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleAttributes();
        int int33 = property25.getMaximumTextLength(locale31);
        org.joda.time.LocalDateTime localDateTime35 = property25.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.DateTime dateTime37 = localDateTime35.toDateTime(readableInstant36);
        long long38 = dateTime37.getMillis();
        int int39 = property9.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.LocalDateTime localDateTime41 = property9.setCopy(100);
        org.joda.time.LocalDateTime localDateTime42 = property9.roundHalfCeilingCopy();
        java.util.Locale locale47 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet48 = locale47.getUnicodeLocaleAttributes();
        java.lang.String str49 = localDateTime42.toString("12", locale47);
        java.util.Locale.setDefault(category1, locale47);
        java.lang.String str53 = nameProvider0.getShortName(locale47, "2122-02-11T09:35:10.520Z", "2122-02-11T09:35:26.387Z");
        java.util.Locale.setDefault(locale47);
        java.lang.String str55 = locale47.getDisplayScript();
        java.lang.String str56 = locale47.getScript();
        java.lang.String str57 = locale47.getDisplayCountry();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertTrue("'" + category1 + "' != '" + java.util.Locale.Category.FORMAT + "'", category1.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals(locale31.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 4800246300404L + "'", long38 == 4800246300404L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertEquals(locale47.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "12" + "'", str49, "12");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "HI!" + "'", str57, "HI!");
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        int int15 = property7.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime17 = property7.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime(readableInstant18);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder20.clearExtensions();
        boolean boolean22 = dateTime19.equals((java.lang.Object) builder21);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        int int36 = localDateTime35.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withFields((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minus(readableDuration38);
        boolean boolean40 = localDateTime29.isBefore((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime29.plusDays(292278993);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime();
        int int49 = localDateTime48.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withFields((org.joda.time.ReadablePartial) localDateTime48);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.minus(readableDuration51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.minusHours(9);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property62.getFieldType();
        boolean boolean64 = localDateTime56.isSupported(dateTimeFieldType63);
        boolean boolean65 = localDateTime42.isSupported(dateTimeFieldType63);
        int int66 = dateTime19.get(dateTimeFieldType63);
        org.joda.time.DateTimeZone dateTimeZone67 = dateTime19.getZone();
        java.lang.Object obj68 = null;
        boolean boolean69 = dateTime19.equals(obj68);
        long long70 = dateTime19.getMillis();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2022 + "'", int49 == 2022);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 22 + "'", int66 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long70 + "' != '" + 4800246300450L + "'", long70 == 4800246300450L);
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        int int15 = property7.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime17 = property7.addToCopy((int) (byte) 100);
        org.joda.time.DurationField durationField18 = property7.getDurationField();
        java.lang.String str19 = property7.getName();
        java.lang.String str20 = property7.toString();
        java.util.Locale locale21 = java.util.Locale.JAPAN;
        java.lang.String str22 = locale21.getDisplayName();
        int int23 = property7.getMaximumShortTextLength(locale21);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.plusMillis(0);
        org.joda.time.LocalDateTime.Property property31 = localDateTime24.minuteOfHour();
        boolean boolean33 = property31.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDateTime localDateTime34 = property31.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime();
        int int41 = localDateTime40.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withFields((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minus(readableDuration43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.minusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.withYearOfCentury((int) ' ');
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.withMillisOfSecond((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withYear((int) (byte) 0);
        boolean boolean53 = property31.equals((java.lang.Object) (byte) 0);
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        java.util.Locale locale57 = java.util.Locale.GERMANY;
        java.lang.String str58 = dateTimeZone55.getName((long) 292278993, locale57);
        java.lang.String str59 = property31.getAsShortText(locale57);
        org.joda.time.LocalDateTime localDateTime61 = property31.addToCopy(494);
        org.joda.time.DateTime dateTime62 = localDateTime61.toDateTime();
        int int63 = property7.getDifference((org.joda.time.ReadableInstant) dateTime62);
        java.lang.String str64 = dateTime62.toString();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "yearOfEra" + "'", str19, "yearOfEra");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Property[yearOfEra]" + "'", str20, "Property[yearOfEra]");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Japanese (Japan)" + "'", str22, "Japanese (Japan)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2022 + "'", int41 == 2022);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00:00.032" + "'", str58, "+00:00:00.032");
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "45" + "'", str59, "45");
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "2022-02-11T17:59:00.509+00:00:00.032" + "'", str64, "2022-02-11T17:59:00.509+00:00:00.032");
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("febbraio", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale locale9 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Locale[] localeArray10 = new java.util.Locale[] { locale9 };
        java.util.ArrayList<java.util.Locale> localeList11 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList11, localeArray10);
        java.util.List<java.util.Locale> localeList13 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList11);
        java.util.Locale locale17 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleAttributes();
        java.lang.String str19 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet18);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        java.lang.Object obj25 = null;
        boolean boolean26 = strSet23.remove(obj25);
        boolean boolean28 = strSet23.equals((java.lang.Object) true);
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet23);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap30);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap32);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        java.lang.Object obj39 = null;
        boolean boolean40 = strSet37.remove(obj39);
        java.util.Spliterator<java.lang.String> strSpliterator41 = strSet37.spliterator();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.plusMillis(0);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.yearOfEra();
        org.joda.time.ReadableInstant readableInstant50 = null;
        int int51 = property49.getDifference(readableInstant50);
        java.util.Locale locale55 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleAttributes();
        int int57 = property49.getMaximumTextLength(locale55);
        java.lang.String str58 = property49.toString();
        java.util.Locale locale59 = java.util.Locale.ITALIAN;
        java.lang.String str60 = locale59.getDisplayLanguage();
        java.lang.String str61 = locale59.getVariant();
        int int62 = property49.getMaximumShortTextLength(locale59);
        java.util.Set<java.lang.String> strSet63 = locale59.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray64 = strSet63.toArray();
        org.joda.time.tz.NameProvider nameProvider65 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider65);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider65);
        boolean boolean68 = strSet63.contains((java.lang.Object) nameProvider65);
        java.util.Spliterator<java.lang.String> strSpliterator69 = strSet63.spliterator();
        boolean boolean70 = strSet37.equals((java.lang.Object) strSet63);
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet37);
        boolean boolean72 = strSet37.isEmpty();
        java.util.Iterator<java.lang.String> strItor73 = strSet37.iterator();
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strSet37);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(localeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(localeList13);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strSpliterator41);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals(locale55.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 9 + "'", int57 == 9);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Property[yearOfEra]" + "'", str58, "Property[yearOfEra]");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "it");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Italian" + "'", str60, "Italian");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 9 + "'", int62 == 9);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNotNull(nameProvider65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strSpliterator69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strItor73);
        org.junit.Assert.assertNotNull(strList74);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str3 = dateTimeZone1.getName((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (-5700000), dateTimeZone1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = property5.addWrapFieldToCopy(23);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMillisOfDay(0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.032" + "'", str3, "+00:00:00.032");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        int int15 = property7.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime17 = property7.addToCopy((int) (byte) 100);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("hi!");
        int int20 = property7.getMaximumShortTextLength(locale19);
        int int21 = property7.getMinimumValueOverall();
        org.joda.time.Interval interval22 = property7.toInterval();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(interval22);
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str4 = dateTimeZone1.getNameKey((long) (byte) 1);
        java.lang.String str5 = dateTimeZone1.toString();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 417, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusSeconds(138);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) 1987);
        boolean boolean4 = dateTimeZone0.isStandardOffset((long) 100);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        int int18 = localDateTime17.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minus(readableDuration20);
        boolean boolean22 = localDateTime11.isBefore((org.joda.time.ReadablePartial) localDateTime21);
        int int23 = localDateTime21.getYearOfEra();
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.yearOfEra();
        int int25 = localDateTime21.getYear();
        org.joda.time.LocalDateTime.Property property26 = localDateTime21.monthOfYear();
        java.lang.String str27 = property26.getAsString();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.plusMillis(0);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.yearOfEra();
        org.joda.time.ReadableInstant readableInstant36 = null;
        int int37 = property35.getDifference(readableInstant36);
        java.util.Locale locale41 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        int int43 = property35.getMaximumTextLength(locale41);
        java.lang.String str44 = property35.toString();
        java.util.Locale locale45 = java.util.Locale.ITALIAN;
        java.lang.String str46 = locale45.getDisplayLanguage();
        java.lang.String str47 = locale45.getVariant();
        int int48 = property35.getMaximumShortTextLength(locale45);
        java.util.Set<java.lang.String> strSet49 = locale45.getUnicodeLocaleAttributes();
        java.lang.String str50 = property26.getAsShortText(locale45);
        boolean boolean51 = dateTimeZone0.equals((java.lang.Object) str50);
        java.lang.String str52 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1987L + "'", long2 == 1987L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2" + "'", str27, "2");
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals(locale41.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Property[yearOfEra]" + "'", str44, "Property[yearOfEra]");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "it");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Italian" + "'", str46, "Italian");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "feb" + "'", str50, "feb");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "UTC" + "'", str52, "UTC");
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withSecondOfMinute(10);
        int[] intArray7 = localDateTime4.getValues();
        java.util.Date date8 = localDateTime4.toDate();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.fromDateFields(date8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusSeconds(436);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 1, 10, 35100635]");
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Jan 10 09:45:00 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusMinutes(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withCenturyOfEra(0);
        int int9 = localDateTime8.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy(0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMinutes(34558597);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.year();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.weekyear();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("2122-02-11T09:35:07.818Z", "Italian", (int) ' ', (int) (byte) 0);
        int int14 = fixedDateTimeZone12.getStandardOffset((long) 529);
        long long16 = fixedDateTimeZone12.previousTransition((long) (short) 1);
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.lang.String str19 = locale18.getDisplayVariant();
        java.lang.String str20 = fixedDateTimeZone12.getName(4800245729437L, locale18);
        boolean boolean21 = property7.equals((java.lang.Object) fixedDateTimeZone12);
        long long25 = fixedDateTimeZone12.convertLocalToUTC((long) 120, false, (long) 351);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.plusMillis(0);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.yearOfEra();
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = property33.getDifference(readableInstant34);
        java.util.Locale locale39 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleAttributes();
        int int41 = property33.getMaximumTextLength(locale39);
        org.joda.time.LocalDateTime localDateTime43 = property33.addToCopy((int) (byte) 100);
        java.util.TimeZone timeZone44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        java.util.Locale locale47 = java.util.Locale.GERMANY;
        java.lang.String str48 = dateTimeZone45.getName((long) 292278993, locale47);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone45);
        org.joda.time.DateTime dateTime50 = localDateTime43.toDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime43.minusWeeks(529);
        boolean boolean53 = fixedDateTimeZone12.equals((java.lang.Object) 529);
        boolean boolean54 = fixedDateTimeZone12.isFixed();
        long long56 = fixedDateTimeZone12.previousTransition(4800245901090L);
        java.util.Locale locale60 = new java.util.Locale("8", "2122-02-11T08:00:43.446-01:35");
        java.util.Locale locale63 = new java.util.Locale("8", "2122-02-11T08:00:43.446-01:35");
        java.lang.String str64 = locale60.getDisplayScript(locale63);
        java.lang.String str65 = fixedDateTimeZone12.getName((long) 769, locale63);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(4800245770108L, (org.joda.time.DateTimeZone) fixedDateTimeZone12);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.032" + "'", str20, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 88L + "'", long25 == 88L);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals(locale39.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 4800245901090L + "'", long56 == 4800245901090L);
        org.junit.Assert.assertEquals(locale60.toString(), "8_2122-02-11T08:00:43.446-01:35");
        org.junit.Assert.assertEquals(locale63.toString(), "8_2122-02-11T08:00:43.446-01:35");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+00:00:00.032" + "'", str65, "+00:00:00.032");
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.minuteOfHour();
        boolean boolean9 = property7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDateTime localDateTime10 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMonths(1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = localDateTime11.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusDays(292278993);
        boolean boolean17 = localDateTime10.isEqual((org.joda.time.ReadablePartial) localDateTime16);
        int int18 = localDateTime16.getEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.plus(readableDuration20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime16.withCenturyOfEra((int) '#');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.centuryOfEra();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.dayOfMonth();
        org.joda.time.DurationFieldType durationFieldType26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withFieldAdded(durationFieldType26, 35046316);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) 365, true);
        java.lang.String str4 = dateTimeZone0.toString();
        int int6 = dateTimeZone0.getOffsetFromLocal((long) 957);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 365L + "'", long3 == 365L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("2122-02-11T09:41:44.185Z", "2122-02-11T08:07:31.376-01:35", 0, 787);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("italiano", "2122-02-11T08:00:12.990-01:35", 6, (int) (short) 1);
        long long7 = fixedDateTimeZone4.convertLocalToUTC((long) (-798211), true);
        long long9 = fixedDateTimeZone4.previousTransition(2022L);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withSecondOfMinute(10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusHours(22);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withYear((int) 'x');
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withCenturyOfEra((int) ' ');
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.plusMinutes(9);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusMillis(582);
        boolean boolean27 = fixedDateTimeZone4.equals((java.lang.Object) localDateTime26);
        java.util.Locale locale29 = null;
        java.lang.String str30 = fixedDateTimeZone4.getName(4800245777628L, locale29);
        java.util.TimeZone timeZone31 = fixedDateTimeZone4.toTimeZone();
        boolean boolean32 = timeZone31.observesDaylightTime();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone37 = new org.joda.time.tz.FixedDateTimeZone("italiano", "2122-02-11T08:00:12.990-01:35", 6, (int) (short) 1);
        java.util.Locale.LanguageRange[] languageRangeArray38 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList39 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList39, languageRangeArray38);
        java.util.Locale locale44 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Locale[] localeArray45 = new java.util.Locale[] { locale44 };
        java.util.ArrayList<java.util.Locale> localeList46 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList46, localeArray45);
        java.util.List<java.util.Locale> localeList48 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, (java.util.Collection<java.util.Locale>) localeList46);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap49 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList50 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList39, strMap49);
        boolean boolean51 = fixedDateTimeZone37.equals((java.lang.Object) strMap49);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime52.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime59.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime();
        int int65 = localDateTime64.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime63.withFields((org.joda.time.ReadablePartial) localDateTime64);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.minus(readableDuration67);
        boolean boolean69 = localDateTime58.isBefore((org.joda.time.ReadablePartial) localDateTime68);
        int int70 = localDateTime68.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime68.withYearOfCentury((int) (short) 0);
        boolean boolean73 = fixedDateTimeZone37.equals((java.lang.Object) (short) 0);
        java.lang.String str75 = fixedDateTimeZone37.getNameKey((long) 292278993);
        long long78 = fixedDateTimeZone37.adjustOffset(4800245749673L, false);
        java.util.TimeZone timeZone79 = fixedDateTimeZone37.toTimeZone();
        boolean boolean80 = timeZone31.hasSameRules(timeZone79);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-798217L) + "'", long7 == (-798217L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2022L + "'", long9 == 2022L);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.006" + "'", str30, "+00:00:00.006");
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals(locale44.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(localeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(localeList48);
        org.junit.Assert.assertNotNull(languageRangeList50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2022 + "'", int65 == 2022);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2022 + "'", int70 == 2022);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "2122-02-11T08:00:12.990-01:35" + "'", str75, "2122-02-11T08:00:12.990-01:35");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 4800245749673L + "'", long78 == 4800245749673L);
        org.junit.Assert.assertNotNull(timeZone79);
        org.junit.Assert.assertEquals(timeZone79.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusMillis(0);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfEra();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = property15.getDifference(readableInstant16);
        java.util.Locale locale21 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleAttributes();
        int int23 = property15.getMaximumTextLength(locale21);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.plusMillis(0);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.yearOfEra();
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = property31.getDifference(readableInstant32);
        java.util.Locale locale37 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleAttributes();
        int int39 = property31.getMaximumTextLength(locale37);
        org.joda.time.LocalDateTime localDateTime41 = property31.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.DateTime dateTime43 = localDateTime41.toDateTime(readableInstant42);
        long long44 = dateTime43.getMillis();
        int int45 = property15.compareTo((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.LocalDateTime localDateTime47 = property15.setCopy(100);
        org.joda.time.LocalDateTime localDateTime48 = property15.roundHalfEvenCopy();
        boolean boolean49 = localDateTime6.equals((java.lang.Object) localDateTime48);
        int int50 = localDateTime48.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.withWeekyear(258);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals(locale21.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals(locale37.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 4800246300767L + "'", long44 == 4800246300767L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 6 + "'", int50 == 6);
        org.junit.Assert.assertNotNull(localDateTime52);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        java.util.Locale locale13 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        int int15 = property7.getMaximumTextLength(locale13);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusMillis(0);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfEra();
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = property23.getDifference(readableInstant24);
        java.util.Locale locale29 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        int int31 = property23.getMaximumTextLength(locale29);
        org.joda.time.LocalDateTime localDateTime33 = property23.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime(readableInstant34);
        long long36 = dateTime35.getMillis();
        int int37 = property7.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDateTime localDateTime39 = property7.setCopy(100);
        org.joda.time.LocalDateTime localDateTime40 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusMinutes((int) (short) 10);
        org.joda.time.Chronology chronology44 = localDateTime40.getChronology();
        int int45 = localDateTime40.size();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime40.plusMinutes(34782560);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals(locale29.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 4800246300793L + "'", long36 == 4800246300793L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertNotNull(localDateTime47);
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withDurationAdded(readableDuration3, 529);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusMonths(1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(durationFieldType3);
        int[] intArray5 = localDateTime2.getValues();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        int int12 = localDateTime11.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minus(readableDuration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYearOfCentury((int) ' ');
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.weekyear();
        org.joda.time.Chronology chronology21 = localDateTime17.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(chronology21);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime2, chronology21);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(chronology21);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 1, 11, 35100832]");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        int int6 = localDateTime5.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readableDuration8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYearOfCentury((int) ' ');
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.weekyear();
        org.joda.time.Chronology chronology15 = localDateTime11.getChronology();
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDateTime11.getFields();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        int int30 = localDateTime29.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withFields((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minus(readableDuration32);
        boolean boolean34 = localDateTime23.isBefore((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime33.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.plusMinutes((-100));
        int int38 = localDateTime37.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusDays(0);
        boolean boolean41 = localDateTime11.isAfter((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime11.dayOfMonth();
        java.lang.String str43 = property42.toString();
        org.joda.time.LocalDateTime localDateTime44 = property42.getLocalDateTime();
        int int45 = localDateTime44.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property46 = localDateTime44.year();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime47.plusMillis(0);
        org.joda.time.LocalDateTime.Property property54 = localDateTime47.minuteOfHour();
        int int55 = localDateTime44.compareTo((org.joda.time.ReadablePartial) localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2022 + "'", int30 == 2022);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 11 + "'", int38 == 11);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Property[dayOfMonth]" + "'", str43, "Property[dayOfMonth]");
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 6 + "'", int45 == 6);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getYearOfCentury();
        int int3 = localDateTime1.getMillisOfSecond();
        int int4 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusMonths(839);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withDurationAdded(readableDuration7, 442);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusWeeks((-100));
        int int12 = localDateTime11.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMillisOfSecond(153);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plus(readableDuration15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 886 + "'", int3 == 886);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(980);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusMillis(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = property8.getDifference(readableInstant9);
        java.util.Locale locale14 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        int int16 = property8.getMaximumTextLength(locale14);
        org.joda.time.LocalDateTime localDateTime18 = property8.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.DateTime dateTime20 = localDateTime18.toDateTime(readableInstant19);
        java.lang.String str21 = dateTime20.toString();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plusMillis(0);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.yearOfEra();
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = property29.getDifference(readableInstant30);
        java.util.Locale locale35 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        int int37 = property29.getMaximumTextLength(locale35);
        org.joda.time.LocalDateTime localDateTime39 = property29.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTime dateTime41 = localDateTime39.toDateTime(readableInstant40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.plusMillis(0);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.yearOfEra();
        org.joda.time.ReadableInstant readableInstant50 = null;
        int int51 = property49.getDifference(readableInstant50);
        java.util.Locale locale55 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet56 = locale55.getUnicodeLocaleAttributes();
        int int57 = property49.getMaximumTextLength(locale55);
        org.joda.time.LocalDateTime localDateTime59 = property49.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.DateTime dateTime61 = localDateTime59.toDateTime(readableInstant60);
        boolean boolean62 = dateTime41.isBefore(readableInstant60);
        boolean boolean63 = dateTime20.isEqual((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Chronology chronology64 = dateTime41.getChronology();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(chronology64);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(4800245969483L, chronology64);
        org.joda.time.LocalDateTime localDateTime67 = org.joda.time.LocalDateTime.now(chronology64);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.dayOfMonth();
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2122-02-11T09:45:00.903Z" + "'", str21, "2122-02-11T09:45:00.903Z");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals(locale55.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 9 + "'", int57 == 9);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(property68);
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfSecond(235);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        int int11 = localDateTime10.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withFields((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minus(readableDuration13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusHours(9);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withDayOfMonth((int) (short) 10);
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plusHours(28);
        boolean boolean24 = localDateTime2.isBefore((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.plusDays(397);
        java.util.Locale locale28 = java.util.Locale.US;
        java.util.Locale locale29 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale29);
        java.lang.String str31 = locale28.getDisplayVariant(locale29);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        int int40 = localDateTime39.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withFields((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.minuteOfHour();
        java.lang.String str43 = property42.getAsShortText();
        org.joda.time.LocalDateTime localDateTime45 = property42.setCopy("35");
        int int46 = property42.getLeapAmount();
        java.util.Locale locale47 = java.util.Locale.ITALIAN;
        int int48 = property42.getMaximumShortTextLength(locale47);
        java.lang.String str49 = locale47.getDisplayCountry();
        java.lang.String str50 = dateTimeZone32.getShortName((long) 0, locale47);
        java.lang.String str51 = locale29.getDisplayName(locale47);
        java.lang.String str52 = localDateTime26.toString("de-de", locale29);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2022 + "'", int40 == 2022);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "45" + "'", str43, "45");
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00" + "'", str50, "+00:00");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "italiano" + "'", str51, "italiano");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "153-153" + "'", str52, "153-153");
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        int int6 = localDateTime5.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readableDuration8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYearOfCentury((int) ' ');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMillisOfSecond((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withYear((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withMillisOfDay(117);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.plusWeeks(109);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks(468);
        int int25 = localDateTime22.size();
        org.joda.time.LocalDateTime.Property property26 = localDateTime22.year();
        java.lang.Class<?> wildcardClass27 = localDateTime22.getClass();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusSeconds((int) 'u');
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.monthOfYear();
        java.lang.String str7 = property6.getAsString();
        org.joda.time.LocalDateTime localDateTime8 = property6.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMinutes(381);
        int int11 = localDateTime10.getMillisOfSecond();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        int int14 = localDateTime13.getYearOfCentury();
        int int15 = localDateTime13.getMillisOfSecond();
        int int16 = localDateTime13.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.minus(readablePeriod17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusMillis((-798211));
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withSecondOfMinute(10);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusHours(22);
        boolean boolean30 = localDateTime18.isBefore((org.joda.time.ReadablePartial) localDateTime29);
        int int31 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime10.minus(readableDuration32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.yearOfCentury();
        org.joda.time.LocalDateTime.Property property35 = localDateTime33.millisOfSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2" + "'", str7, "2");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 983 + "'", int11 == 983);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 983 + "'", int15 == 983);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.weekyear();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone11 = new org.joda.time.tz.FixedDateTimeZone("2122-02-11T09:35:07.818Z", "Italian", (int) ' ', (int) (byte) 0);
        int int13 = fixedDateTimeZone11.getStandardOffset((long) 529);
        long long15 = fixedDateTimeZone11.previousTransition((long) (short) 1);
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.lang.String str18 = locale17.getDisplayVariant();
        java.lang.String str19 = fixedDateTimeZone11.getName(4800245729437L, locale17);
        boolean boolean20 = property6.equals((java.lang.Object) fixedDateTimeZone11);
        org.joda.time.LocalDateTime localDateTime21 = property6.withMaximumValue();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plusMillis(0);
        org.joda.time.LocalDateTime.Property property30 = localDateTime23.minuteOfHour();
        boolean boolean32 = property30.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDateTime localDateTime33 = property30.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        org.joda.time.DurationField durationField37 = property36.getDurationField();
        org.joda.time.LocalDateTime localDateTime38 = property36.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withCenturyOfEra(729);
        int int41 = property22.compareTo((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime();
        int int48 = localDateTime47.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withFields((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.minuteOfHour();
        java.lang.String str51 = property50.getAsShortText();
        int int52 = property50.getMaximumValue();
        java.util.Locale locale53 = java.util.Locale.GERMANY;
        java.lang.String str54 = property50.getAsShortText(locale53);
        java.lang.String str55 = locale53.getDisplayName();
        java.lang.String str56 = locale53.getISO3Language();
        java.lang.String str58 = locale53.getExtension('u');
        int int59 = property22.getMaximumTextLength(locale53);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.032" + "'", str19, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2022 + "'", int48 == 2022);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(property50);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "45" + "'", str51, "45");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 59 + "'", int52 == 59);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "45" + "'", str54, "45");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "tedesco (Germania)" + "'", str55, "tedesco (Germania)");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "deu" + "'", str56, "deu");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("+00:00:00.059");
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.util.Set<java.lang.String> strSet4 = provider0.getAvailableIDs();
        java.util.Set<java.lang.String> strSet5 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone7 = provider0.getZone("2022-02-11T09:35:46.713");
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(dateTimeZone7);
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusMinutes(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusMillis((int) (short) 1);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime1.getFields();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = localDateTime1.toString(dateTimeFormatter8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusYears(813);
        org.joda.time.LocalDateTime.Property property12 = localDateTime1.secondOfMinute();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022-02-11T09:45:01.042" + "'", str9, "2022-02-11T09:45:01.042");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("2122-02-11T09:35:07.818Z", "Italian", (int) ' ', (int) (byte) 0);
        long long6 = fixedDateTimeZone4.previousTransition((long) 9);
        java.lang.String str7 = fixedDateTimeZone4.getID();
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        long long10 = fixedDateTimeZone4.nextTransition(4800245735033L);
        java.util.Locale.Builder builder12 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder14 = builder12.clear();
        java.util.Locale.Builder builder16 = builder12.setLanguageTag("zh");
        java.util.Locale locale17 = builder12.build();
        java.lang.String str18 = fixedDateTimeZone4.getShortName(4800245729932L, locale17);
        long long20 = fixedDateTimeZone4.nextTransition(4800245708295L);
        int int22 = fixedDateTimeZone4.getOffset(4800245753458L);
        long long24 = fixedDateTimeZone4.convertUTCToLocal((long) 34794456);
        java.lang.String str26 = fixedDateTimeZone4.getNameKey((long) 53);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9L + "'", long6 == 9L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2122-02-11T09:35:07.818Z" + "'", str7, "2122-02-11T09:35:07.818Z");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 4800245735033L + "'", long10 == 4800245735033L);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.032" + "'", str18, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 4800245708295L + "'", long20 == 4800245708295L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 34794488L + "'", long24 == 34794488L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Italian" + "'", str26, "Italian");
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '#');
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str6 = locale5.getDisplayScript();
        java.lang.String str7 = dateTimeZone2.getShortName(10L, locale5);
        long long10 = dateTimeZone2.adjustOffset(0L, false);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        int int18 = localDateTime17.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minus(readableDuration20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusYears(0);
        boolean boolean24 = dateTimeZone11.isLocalDateTimeGap(localDateTime21);
        long long28 = dateTimeZone11.convertLocalToUTC((long) 1, true, 100L);
        long long30 = dateTimeZone2.getMillisKeepLocal(dateTimeZone11, 4800245711010L);
        java.lang.String str31 = dateTimeZone2.getID();
        boolean boolean33 = dateTimeZone2.isStandardOffset((long) 394);
        boolean boolean35 = dateTimeZone2.isStandardOffset((-798217L));
        java.util.Locale locale37 = java.util.Locale.JAPANESE;
        java.lang.String str38 = locale37.getCountry();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime();
        int int52 = localDateTime51.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withFields((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minus(readableDuration54);
        boolean boolean56 = localDateTime45.isBefore((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.LocalDateTime.Property property57 = localDateTime55.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.plusMillis(0);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.yearOfEra();
        org.joda.time.ReadableInstant readableInstant66 = null;
        int int67 = property65.getDifference(readableInstant66);
        java.util.Locale locale68 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str69 = property65.getAsText(locale68);
        java.lang.String str70 = property57.getAsShortText(locale68);
        java.lang.String str71 = locale37.getDisplayScript(locale68);
        java.util.Locale locale72 = java.util.Locale.TAIWAN;
        java.lang.String str73 = locale37.getDisplayLanguage(locale72);
        boolean boolean74 = locale37.hasExtensions();
        java.lang.String str76 = locale37.getExtension('a');
        java.lang.String str77 = dateTimeZone2.getName(4800245757062L, locale37);
        java.lang.String str78 = locale37.getDisplayName();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:35" + "'", str7, "-01:35");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 4800240011010L + "'", long30 == 4800240011010L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-01:35" + "'", str31, "-01:35");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2022 + "'", int52 == 2022);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "2022" + "'", str69, "2022");
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "1" + "'", str70, "1");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\u65e5\u6587" + "'", str73, "\u65e5\u6587");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "-01:35" + "'", str77, "-01:35");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "giapponese" + "'", str78, "giapponese");
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readableDuration15);
        boolean boolean17 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        int int18 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plusMillis(0);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.yearOfEra();
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = property26.getDifference(readableInstant27);
        java.util.Locale locale32 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleAttributes();
        int int34 = property26.getMaximumTextLength(locale32);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.plusMillis(0);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.yearOfEra();
        org.joda.time.ReadableInstant readableInstant43 = null;
        int int44 = property42.getDifference(readableInstant43);
        java.util.Locale locale48 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleAttributes();
        int int50 = property42.getMaximumTextLength(locale48);
        org.joda.time.LocalDateTime localDateTime52 = property42.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.DateTime dateTime54 = localDateTime52.toDateTime(readableInstant53);
        long long55 = dateTime54.getMillis();
        int int56 = property26.compareTo((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.LocalDateTime localDateTime58 = property26.setCopy(100);
        boolean boolean59 = localDateTime16.isBefore((org.joda.time.ReadablePartial) localDateTime58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime16.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalDateTime localDateTime63 = localDateTime16.withPeriodAdded(readablePeriod61, 77);
        org.joda.time.DateTimeField[] dateTimeFieldArray64 = localDateTime16.getFields();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime16.plusMinutes((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusMinutes(839);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.plus(readableDuration69);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals(locale32.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals(locale48.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 9 + "'", int50 == 9);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
// flaky:         org.junit.Assert.assertTrue("'" + long55 + "' != '" + 4800246301092L + "'", long55 == 4800246301092L);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(dateTimeFieldArray64);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(localDateTime70);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-10T01:40:25.001Z");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Ora media di Greenwich");
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = property7.getDifference(readableInstant8);
        org.joda.time.LocalDateTime localDateTime10 = property7.withMaximumValue();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '#');
        java.lang.String str17 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime18 = localDateTime10.toDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property19 = localDateTime10.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusMonths(1);
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = localDateTime22.isSupported(durationFieldType23);
        boolean boolean25 = localDateTime10.isAfter((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.withYearOfEra(586);
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.Instant instant29 = dateTime28.toInstant();
        org.joda.time.Chronology chronology30 = instant29.getChronology();
        java.lang.String str31 = instant29.toString();
        org.joda.time.DateTimeZone dateTimeZone32 = instant29.getZone();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withDurationAdded(readableDuration36, 529);
        org.joda.time.LocalDateTime.Property property39 = localDateTime35.era();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime41.plusMillis(0);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.yearOfEra();
        org.joda.time.ReadableInstant readableInstant49 = null;
        int int50 = property48.getDifference(readableInstant49);
        java.util.Locale locale54 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet55 = locale54.getUnicodeLocaleAttributes();
        int int56 = property48.getMaximumTextLength(locale54);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime57.plusMillis(0);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.yearOfEra();
        org.joda.time.ReadableInstant readableInstant65 = null;
        int int66 = property64.getDifference(readableInstant65);
        java.util.Locale locale70 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet71 = locale70.getUnicodeLocaleAttributes();
        int int72 = property64.getMaximumTextLength(locale70);
        org.joda.time.LocalDateTime localDateTime74 = property64.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.DateTime dateTime76 = localDateTime74.toDateTime(readableInstant75);
        long long77 = dateTime76.getMillis();
        int int78 = property48.compareTo((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.ReadableInstant readableInstant79 = null;
        boolean boolean80 = dateTime76.isBefore(readableInstant79);
        int int81 = property39.compareTo((org.joda.time.ReadableInstant) dateTime76);
        long long82 = dateTime76.getMillis();
        boolean boolean83 = instant29.isBefore((org.joda.time.ReadableInstant) dateTime76);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-01:35" + "'", str17, "-01:35");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(chronology30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0586-01-11T09:45:01.125Z" + "'", str31, "0586-01-11T09:45:01.125Z");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals(locale54.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 9 + "'", int56 == 9);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals(locale70.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 9 + "'", int72 == 9);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
// flaky:         org.junit.Assert.assertTrue("'" + long77 + "' != '" + 4800246301125L + "'", long77 == 4800246301125L);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long82 + "' != '" + 4800246301125L + "'", long82 == 4800246301125L);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        int int6 = localDateTime5.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localDateTime4.getFieldTypes();
        int int9 = localDateTime4.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.minusMillis((int) '4');
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.minusMonths(9);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.minusSeconds(7);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime4.plusWeeks(52);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime4.plusDays(844);
        org.joda.time.DateTime dateTime20 = localDateTime4.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = localDateTime4.withTime(289, 34861889, 76, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 289 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusMillis(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = property8.getDifference(readableInstant9);
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = property8.getAsText(locale11);
        java.lang.String str15 = nameProvider0.getName(locale11, "Etc/UTC", "\u610f\u5927\u5229\u6587");
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder19 = builder16.setExtension('x', "Italian");
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("2122-02-11T08:00:11.407-01:35");
        java.util.Locale.Builder builder22 = builder16.setLocale(locale21);
        java.util.Locale locale23 = java.util.Locale.JAPANESE;
        java.lang.String str24 = locale23.getCountry();
        java.lang.String str25 = locale21.getDisplayLanguage(locale23);
        java.lang.String str28 = nameProvider0.getName(locale21, "\u610f\u5927\u5229\u6587", "2122-02-11T08:00:17.260-01:35");
        java.util.Locale locale29 = java.util.Locale.TAIWAN;
        java.lang.String str32 = nameProvider0.getName(locale29, "yearOfEra", "France");
        java.util.Locale locale33 = java.util.Locale.ROOT;
        java.lang.String str34 = locale33.getScript();
        java.lang.String str35 = locale33.getCountry();
        java.util.Locale locale36 = null;
        java.lang.String str37 = locale33.getDisplayScript(locale36);
        java.lang.String str38 = locale33.getISO3Country();
        java.lang.String str39 = locale33.getScript();
        java.lang.String str42 = nameProvider0.getName(locale33, "14", "Chinesisch");
        java.util.Locale.Builder builder43 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder44 = builder43.clearExtensions();
        java.util.Locale locale45 = builder43.build();
        java.util.Locale locale46 = locale45.stripExtensions();
        java.util.Locale locale50 = new java.util.Locale("22", "2122-02-11T09:35:07.818Z", "2122-02-11T08:00:11.407-01:35");
        java.lang.String str51 = locale45.getDisplayLanguage(locale50);
        java.lang.String str52 = locale45.toLanguageTag();
        java.lang.String str55 = nameProvider0.getShortName(locale45, "2122-02-11T09:36:05.776Z", "2022-02-10T01:38:29.870");
        java.lang.String str57 = locale45.getExtension('a');
        java.lang.String str58 = locale45.getDisplayLanguage();
        java.lang.String str59 = locale45.getDisplayVariant();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022" + "'", str12, "2022");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertEquals(locale50.toString(), "22_2122-02-11T09:35:07.818Z_2122-02-11T08:00:11.407-01:35");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "und" + "'", str52, "und");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.minuteOfHour();
        boolean boolean9 = property7.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDateTime localDateTime10 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        int[] intArray14 = localDateTime12.getValues();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withMinuteOfHour(0);
        int int17 = localDateTime12.size();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withDate(2022, (int) (short) 1, (int) (byte) 10);
        int int23 = localDateTime22.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.monthOfYear();
        int int25 = localDateTime22.getCenturyOfEra();
        boolean boolean26 = localDateTime12.isEqual((org.joda.time.ReadablePartial) localDateTime22);
        java.lang.String str27 = localDateTime22.toString();
        int int28 = localDateTime22.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime();
        int int36 = localDateTime35.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withFields((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minus(readableDuration38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusYears(0);
        boolean boolean42 = dateTimeZone29.isLocalDateTimeGap(localDateTime39);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone47 = new org.joda.time.tz.FixedDateTimeZone("2122-02-11T09:35:07.818Z", "Italian", (int) ' ', (int) (byte) 0);
        java.lang.String str49 = fixedDateTimeZone47.getNameKey((long) (short) -1);
        long long51 = dateTimeZone29.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone47, 5700001L);
        int int53 = fixedDateTimeZone47.getOffset((long) (byte) 0);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone47);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property55.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property55.getFieldType();
        org.joda.time.LocalDateTime.Property property58 = localDateTime22.property(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(intArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[2022, 2, 11, 35068000]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2022-01-10T09:45:01.194" + "'", str27, "2022-01-10T09:45:01.194");
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 45 + "'", int28 == 45);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Italian" + "'", str49, "Italian");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 5699969L + "'", long51 == 5699969L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 32 + "'", int53 == 32);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(property58);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        int int6 = localDateTime5.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readableDuration8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusWeeks(11);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMillis(755);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plusMonths(0);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusMonths(793);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.plus(readableDuration19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withWeekyear(35076609);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime1 = null;
        boolean boolean2 = dateTimeZone0.isLocalDateTimeGap(localDateTime1);
        java.lang.String str3 = dateTimeZone0.getID();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusHours((-1));
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusHours(0);
        boolean boolean17 = dateTimeZone0.isLocalDateTimeGap(localDateTime16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.centuryOfEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.era();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime();
        int int35 = localDateTime34.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withFields((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minus(readableDuration37);
        boolean boolean39 = localDateTime28.isBefore((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime38.secondOfMinute();
        org.joda.time.DurationField durationField41 = property40.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime42 = property40.getLocalDateTime();
        int int43 = localDateTime42.getMonthOfYear();
        org.joda.time.Chronology chronology44 = localDateTime42.getChronology();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(1L, chronology44);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(4800245785134L, chronology44);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime16, chronology44);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minusDays(2112);
        int int52 = localDateTime49.getEra();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime49.withMillisOfDay(864);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2022 + "'", int35 == 2022);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(localDateTime54);
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getYearOfCentury();
        int int3 = localDateTime1.getMillisOfSecond();
        int int4 = localDateTime1.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusMonths(839);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withDurationAdded(readableDuration7, 442);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusWeeks((-100));
        org.joda.time.LocalDateTime.Property property12 = localDateTime1.millisOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 270 + "'", int3 == 270);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en");
        double double2 = languageRange1.getWeight();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        double double5 = languageRange1.getWeight();
        java.lang.String str6 = languageRange1.getRange();
        double double7 = languageRange1.getWeight();
        double double8 = languageRange1.getWeight();
        double double9 = languageRange1.getWeight();
        double double10 = languageRange1.getWeight();
        double double11 = languageRange1.getWeight();
        double double12 = languageRange1.getWeight();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone17 = new org.joda.time.tz.FixedDateTimeZone("italiano", "2122-02-11T08:00:12.990-01:35", 6, (int) (short) 1);
        long long19 = fixedDateTimeZone17.nextTransition((long) (byte) 100);
        long long21 = fixedDateTimeZone17.previousTransition(897L);
        java.lang.String str23 = fixedDateTimeZone17.getNameKey(4800245992858L);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.util.Locale locale27 = java.util.Locale.GERMANY;
        java.lang.String str28 = dateTimeZone25.getName((long) 292278993, locale27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.plusMillis(0);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.yearOfEra();
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = property37.getDifference(readableInstant38);
        org.joda.time.LocalDateTime localDateTime40 = property37.withMaximumValue();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.era();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.plus(readablePeriod42);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) '#');
        java.lang.String str47 = dateTimeZone46.toString();
        org.joda.time.DateTime dateTime48 = localDateTime40.toDateTime(dateTimeZone46);
        int int49 = dateTimeZone25.getOffset((org.joda.time.ReadableInstant) dateTime48);
        int int50 = fixedDateTimeZone17.getOffset((org.joda.time.ReadableInstant) dateTime48);
        boolean boolean51 = languageRange1.equals((java.lang.Object) fixedDateTimeZone17);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en" + "'", str6, "en");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 897L + "'", long21 == 897L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2122-02-11T08:00:12.990-01:35" + "'", str23, "2122-02-11T08:00:12.990-01:35");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-01:35" + "'", str47, "-01:35");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 6 + "'", int50 == 6);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readableDuration15);
        boolean boolean17 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        int int18 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withYearOfCentury((int) (short) 0);
        org.joda.time.LocalDateTime.Property property21 = localDateTime16.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime23 = property21.roundHalfCeilingCopy();
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = property21.getDifference(readableInstant24);
        org.joda.time.DateTimeField dateTimeField26 = property21.getField();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        int int6 = localDateTime5.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readableDuration8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusYears(0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDayOfYear((int) (short) 10);
        int int14 = localDateTime9.getWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.withYearOfEra(35);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime9.withYear(25);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime9.plusWeeks(39);
        org.joda.time.LocalDateTime.Property property21 = localDateTime9.year();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime9.minusDays(876608);
        int int24 = localDateTime9.getDayOfYear();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42 + "'", int24 == 42);
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfEra();
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = property7.getAsShortText(locale8);
        int int10 = property7.getMaximumValueOverall();
        java.lang.String str11 = property7.getAsShortText();
        org.joda.time.LocalDateTime localDateTime12 = property7.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField13 = property7.getDurationField();
        org.joda.time.LocalDateTime localDateTime15 = property7.addToCopy(37);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusMillis(0);
        org.joda.time.DateTimeField dateTimeField24 = localDateTime22.getField((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.era();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        org.joda.time.LocalDateTime localDateTime27 = property25.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.withYearOfEra(30);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        java.lang.Object obj0 = null;
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("2122-02-11T09:35:07.818Z", "Italian", (int) ' ', (int) (byte) 0);
        long long7 = fixedDateTimeZone5.previousTransition((long) 9);
        java.lang.String str8 = fixedDateTimeZone5.getID();
        boolean boolean9 = fixedDateTimeZone5.isFixed();
        long long11 = fixedDateTimeZone5.nextTransition(4800245735033L);
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder14 = builder13.clearExtensions();
        java.util.Locale.Builder builder15 = builder13.clear();
        java.util.Locale.Builder builder17 = builder13.setLanguageTag("zh");
        java.util.Locale locale18 = builder13.build();
        java.lang.String str19 = fixedDateTimeZone5.getShortName(4800245729932L, locale18);
        long long21 = fixedDateTimeZone5.nextTransition(4800245708295L);
        int int23 = fixedDateTimeZone5.getStandardOffset(4800245744866L);
        long long26 = fixedDateTimeZone5.convertLocalToUTC(4800245758629L, false);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(obj0, (org.joda.time.DateTimeZone) fixedDateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2122-02-11T09:35:07.818Z" + "'", str8, "2122-02-11T09:35:07.818Z");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 4800245735033L + "'", long11 == 4800245735033L);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.032" + "'", str19, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 4800245708295L + "'", long21 == 4800245708295L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 4800245758597L + "'", long26 == 4800245758597L);
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2122-02-11T08:07:50.164-01:35");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Ora media di Greenwich");
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withDayOfYear(20);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.year();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone9.isLocalDateTimeGap(localDateTime10);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plusMillis(0);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.yearOfEra();
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = property20.getDifference(readableInstant21);
        org.joda.time.LocalDateTime localDateTime23 = property20.withMaximumValue();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.era();
        boolean boolean25 = localDateTime12.isAfter((org.joda.time.ReadablePartial) localDateTime23);
        int int26 = localDateTime12.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime12.minusHours(756);
        boolean boolean29 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime12.withMillisOfDay(0);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(localDateTime31);
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfEvenCopy();
        java.lang.String str7 = property5.getAsShortText();
        java.util.Locale locale11 = new java.util.Locale("2122-02-11T08:01:14.514-01:35", "50", "GIAPPONESE (GIAPPONE)");
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        int int18 = localDateTime17.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.minuteOfHour();
        java.lang.String str21 = property20.getAsShortText();
        int int22 = property20.getMaximumValue();
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        java.lang.String str24 = property20.getAsShortText(locale23);
        java.lang.String str25 = locale11.getDisplayScript(locale23);
        java.util.Locale locale29 = new java.util.Locale("2122-02-11T08:01:14.514-01:35", "50", "GIAPPONESE (GIAPPONE)");
        java.lang.String str30 = locale23.getDisplayLanguage(locale29);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime();
        int int37 = localDateTime36.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withFields((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.minuteOfHour();
        java.lang.String str40 = property39.getAsShortText();
        org.joda.time.LocalDateTime localDateTime42 = property39.setCopy("35");
        int int43 = property39.getLeapAmount();
        java.util.Locale locale44 = java.util.Locale.ITALIAN;
        int int45 = property39.getMaximumShortTextLength(locale44);
        java.lang.String str46 = locale44.getISO3Country();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime47.plusMillis(0);
        org.joda.time.LocalDateTime.Property property54 = localDateTime47.minuteOfHour();
        boolean boolean56 = property54.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDateTime localDateTime57 = property54.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime58.plusMillis(0);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.yearOfEra();
        java.util.Locale locale66 = java.util.Locale.PRC;
        java.lang.String str67 = property65.getAsShortText(locale66);
        java.lang.String str68 = property54.getAsText(locale66);
        java.util.Set<java.lang.String> strSet69 = locale66.getUnicodeLocaleAttributes();
        java.lang.String str70 = locale44.getDisplayVariant(locale66);
        java.lang.String str71 = locale23.getDisplayScript(locale44);
        java.lang.String str72 = property5.getAsText(locale44);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022" + "'", str7, "2022");
        org.junit.Assert.assertEquals(locale11.toString(), "2122-02-11t08:01:14.514-01:35_50_GIAPPONESE (GIAPPONE)");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "45" + "'", str21, "45");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "45" + "'", str24, "45");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals(locale29.toString(), "2122-02-11t08:01:14.514-01:35_50_GIAPPONESE (GIAPPONE)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "German" + "'", str30, "German");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "45" + "'", str40, "45");
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "2022" + "'", str67, "2022");
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "45" + "'", str68, "45");
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "2022" + "'", str72, "2022");
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withCenturyOfEra(20);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekOfWeekyear();
        org.joda.time.Chronology chronology12 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusHours(660);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = localDateTime10.toString(dateTimeFormatter15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        int int19 = localDateTime18.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.minusMinutes(2);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withCenturyOfEra(0);
        int int26 = localDateTime25.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property27 = localDateTime25.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime29 = property27.addToCopy(0);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.era();
        int int31 = localDateTime29.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusDays(5835909);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date35 = localDateTime32.toDate();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -557 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022-02-11T09:45:01.443" + "'", str16, "2022-02-11T09:45:01.443");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 42 + "'", int31 == 42);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readableDuration15);
        boolean boolean17 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        int int18 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.yearOfEra();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.minusMinutes((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMinutes(362);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.year();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.plusMillis(0);
        org.joda.time.LocalDateTime.Property property33 = localDateTime26.minuteOfHour();
        boolean boolean35 = property33.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDateTime localDateTime36 = property33.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusSeconds((int) ' ');
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime39.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime46.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime();
        int int52 = localDateTime51.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withFields((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minus(readableDuration54);
        boolean boolean56 = localDateTime45.isBefore((org.joda.time.ReadablePartial) localDateTime55);
        int int57 = localDateTime55.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.withYearOfCentury((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime60.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime60.plusMillis(0);
        org.joda.time.LocalDateTime.Property property67 = localDateTime60.minuteOfHour();
        boolean boolean69 = property67.equals((java.lang.Object) 100.0d);
        org.joda.time.LocalDateTime localDateTime70 = property67.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.centuryOfEra();
        boolean boolean72 = localDateTime55.isBefore((org.joda.time.ReadablePartial) localDateTime70);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime55.minusYears(529);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime38.withFields((org.joda.time.ReadablePartial) localDateTime55);
        boolean boolean76 = property24.equals((java.lang.Object) localDateTime75);
        long long77 = property24.remainder();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2022 + "'", int52 == 2022);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2022 + "'", int57 == 2022);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long77 + "' != '" + 3555181461L + "'", long77 == 3555181461L);
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        int int6 = localDateTime5.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.minuteOfHour();
        java.lang.String str9 = property8.getAsShortText();
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        org.joda.time.LocalDateTime localDateTime12 = property8.setCopy("35", locale11);
        org.joda.time.LocalDateTime localDateTime13 = property8.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime14 = property8.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.centuryOfEra();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = property16.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime18 = property16.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusMillis(91);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.millisOfDay();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "45" + "'", str9, "45");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('x', "Italian");
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("2122-02-11T08:00:11.407-01:35");
        java.util.Locale.Builder builder6 = builder0.setLocale(locale5);
        java.util.Locale locale7 = builder0.build();
        java.util.Locale.Builder builder8 = builder0.clearExtensions();
        java.util.Locale.Builder builder9 = builder8.clearExtensions();
        java.util.Locale locale10 = builder9.build();
        java.util.Locale.Builder builder12 = builder9.addUnicodeLocaleAttribute("Feb");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder12.setScript("2122-02-11T09:42:18.989Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 2122-02-11T09:42:18.989Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readableDuration15);
        boolean boolean17 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        int int18 = localDateTime16.getYearOfEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.yearOfEra();
        java.util.Locale locale20 = null;
        int int21 = property19.getMaximumTextLength(locale20);
        java.lang.String str22 = property19.getAsString();
        int int23 = property19.get();
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder24.setExtension('x', "Italian");
        java.util.Locale locale28 = builder27.build();
        int int29 = property19.getMaximumShortTextLength(locale28);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusMonths(272);
        org.joda.time.LocalDateTime.Property property41 = localDateTime38.millisOfDay();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusMonths(1);
        org.joda.time.DurationFieldType durationFieldType45 = null;
        boolean boolean46 = localDateTime44.isSupported(durationFieldType45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime44.yearOfEra();
        org.joda.time.LocalDateTime.Property property48 = localDateTime44.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime50 = property48.addToCopy((long) 838);
        int int51 = localDateTime50.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withCenturyOfEra(100);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime();
        int int61 = localDateTime60.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.withFields((org.joda.time.ReadablePartial) localDateTime60);
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.minus(readableDuration63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.minusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime68 = localDateTime64.minusHours(9);
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime69.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property74.getFieldType();
        boolean boolean76 = localDateTime68.isSupported(dateTimeFieldType75);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime52.withField(dateTimeFieldType75, (int) 'a');
        boolean boolean79 = localDateTime50.isAfter((org.joda.time.ReadablePartial) localDateTime78);
        org.joda.time.ReadableDuration readableDuration80 = null;
        org.joda.time.LocalDateTime localDateTime82 = localDateTime78.withDurationAdded(readableDuration80, 20);
        int int83 = property41.compareTo((org.joda.time.ReadablePartial) localDateTime78);
        org.joda.time.DateTime dateTime84 = localDateTime78.toDateTime();
        int int85 = property19.compareTo((org.joda.time.ReadableInstant) dateTime84);
        org.joda.time.LocalDateTime localDateTime86 = property19.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime87 = property19.getLocalDateTime();
        org.joda.time.DurationField durationField88 = property19.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime89 = property19.withMaximumValue();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2022" + "'", str22, "2022");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDateTime50);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 533 + "'", int51 == 533);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2022 + "'", int61 == 2022);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(dateTimeFieldType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(localDateTime82);
// flaky:         org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertNotNull(localDateTime87);
        org.junit.Assert.assertNull(durationField88);
        org.junit.Assert.assertNotNull(localDateTime89);
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        int int13 = localDateTime12.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFields((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minus(readableDuration15);
        boolean boolean17 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        int int18 = localDateTime6.getYearOfEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime6.yearOfCentury();
        java.lang.String str20 = property19.getAsShortText();
        boolean boolean21 = property19.isLeap();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plusMillis(0);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.yearOfEra();
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = property29.getDifference(readableInstant30);
        java.util.Locale locale35 = new java.util.Locale("hi!", "hi!", "hi!");
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleAttributes();
        int int37 = property29.getMaximumTextLength(locale35);
        org.joda.time.LocalDateTime localDateTime39 = property29.addToCopy((int) (byte) 100);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.DateTime dateTime41 = localDateTime39.toDateTime(readableInstant40);
        java.lang.String str42 = dateTime41.toString();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime();
        int int49 = localDateTime48.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime47.withFields((org.joda.time.ReadablePartial) localDateTime48);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.minus(readableDuration51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minusHours((int) ' ');
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.minusHours(9);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.withDate(2022, (int) (short) 1, (int) (byte) 10);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property62.getFieldType();
        boolean boolean64 = localDateTime56.isSupported(dateTimeFieldType63);
        int int65 = dateTime41.get(dateTimeFieldType63);
        int int66 = property19.compareTo((org.joda.time.ReadableInstant) dateTime41);
        java.util.Locale locale67 = java.util.Locale.ROOT;
        java.lang.String str68 = property19.getAsShortText(locale67);
        java.lang.String str69 = locale67.getISO3Language();
        java.util.Locale locale70 = java.util.Locale.GERMAN;
        java.lang.String str71 = locale70.getDisplayName();
        java.lang.String str72 = locale70.getVariant();
        java.util.Set<java.lang.String> strSet73 = locale70.getUnicodeLocaleAttributes();
        java.lang.String str74 = locale67.getDisplayLanguage(locale70);
        java.util.Set<java.lang.String> strSet75 = locale70.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime((java.lang.Object) strSet75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Collections$EmptySet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "22" + "'", str20, "22");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2122-02-11T09:45:01.605Z" + "'", str42, "2122-02-11T09:45:01.605Z");
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2022 + "'", int49 == 2022);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 22 + "'", int65 == 22);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "22" + "'", str68, "22");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "de");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "tedesco" + "'", str71, "tedesco");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(strSet75);
    }
}
