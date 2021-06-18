import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.plusSeconds((-1));
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundCeilingCopy();
        int int16 = localDateTime15.getYear();
        boolean boolean17 = localDateTime11.isAfter((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundCeilingCopy();
        java.util.Locale locale22 = null;
        int int23 = property20.getMaximumTextLength(locale22);
        int int24 = property20.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property20.getFieldType();
        int int26 = localDateTime11.get(dateTimeFieldType25);
        int int27 = localDateTime1.get(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(100L);
        int int36 = localDateTime35.getSecondOfMinute();
        org.joda.time.DateTime dateTime37 = localDateTime35.toDateTime();
        long long38 = property33.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.LocalDateTime localDateTime39 = property33.roundCeilingCopy();
        java.util.Locale locale40 = null;
        java.lang.String str41 = property33.getAsText(locale40);
        org.joda.time.LocalDateTime localDateTime43 = property33.addWrapFieldToCopy(1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withMillisOfDay(359);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.plusMonths(35);
        boolean boolean48 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime47);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2020 + "'", int16 == 2020);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 700 + "'", int26 == 700);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 11651L + "'", long38 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Sunday" + "'", str41, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        int int12 = property11.get();
        org.joda.time.LocalDateTime localDateTime14 = property11.addToCopy(407);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withDayOfMonth(20);
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minus(readableDuration18);
        java.lang.String str20 = localDateTime16.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2427-04-20T02:58:24.889" + "'", str20, "2427-04-20T02:58:24.889");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = property4.getDifference(readableInstant5);
        long long7 = property4.remainder();
        java.lang.String str8 = property4.getAsShortText();
        org.joda.time.DurationField durationField9 = property4.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime10 = property4.getLocalDateTime();
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 10474974, chronology11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 46, chronology11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusDays(1);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.minus(readableDuration21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        java.util.Date date25 = localDateTime24.toDate();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        int int31 = localDateTime24.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime24.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant37 = null;
        long long38 = property36.getDifferenceAsLong(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(100L);
        int int47 = localDateTime46.getSecondOfMinute();
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime();
        long long49 = property44.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        long long50 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.LocalDateTime localDateTime51 = property36.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime52 = property36.withMaximumValue();
        int int53 = localDateTime33.compareTo((org.joda.time.ReadablePartial) localDateTime52);
        int int54 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime52);
        boolean boolean55 = localDateTime13.isAfter((org.joda.time.ReadablePartial) localDateTime52);
        org.joda.time.DateTimeField[] dateTimeFieldArray56 = localDateTime13.getFields();
        org.joda.time.LocalDateTime.Property property57 = localDateTime13.dayOfYear();
        org.joda.time.DateTimeField[] dateTimeFieldArray58 = localDateTime13.getFields();
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "22" + "'", str8, "22");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Wed Nov 25 02:58:25 UTC 2020");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 11651L + "'", long49 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1606273104922L + "'", long50 == 1606273104922L);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTimeFieldArray58);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.ReadablePartial readablePartial7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withFields(readablePartial7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) readablePartial7, chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfDay(2021);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusMonths(990);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfEvenCopy();
        int int11 = localDateTime10.getYearOfEra();
        java.util.Date date12 = localDateTime10.toDate();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromDateFields(date12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plusMonths(99);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusMonths(99);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2021 + "'", int11 == 2021);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Fri Jan 01 00:00:00 UTC 2021");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusDays(10);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plus(readableDuration14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        int int24 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        java.util.Date date29 = localDateTime28.toDate();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        java.util.Date date32 = localDateTime31.toDate();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.fromDateFields(date32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime38 = property36.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        java.util.Date date43 = localDateTime42.toDate();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withYearOfCentury(1);
        int int49 = localDateTime42.compareTo((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime45.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime40.withFields((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime56 = property55.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusSeconds((int) (byte) 100);
        int int59 = localDateTime56.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property60 = localDateTime56.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = property60.getFieldType();
        boolean boolean62 = localDateTime45.isSupported(dateTimeFieldType61);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime33.withField(dateTimeFieldType61, 747);
        org.joda.time.LocalDateTime.Property property65 = localDateTime28.property(dateTimeFieldType61);
        int int66 = localDateTime26.get(dateTimeFieldType61);
        org.joda.time.LocalDateTime.Property property67 = localDateTime15.property(dateTimeFieldType61);
        org.joda.time.LocalDateTime localDateTime68 = property67.withMinimumValue();
        java.lang.String str69 = localDateTime68.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Wed Nov 25 02:58:25 UTC 2020");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(date29);
// flaky:         org.junit.Assert.assertEquals(date29.toString(), "Wed Nov 25 02:58:25 UTC 2020");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Wed Nov 25 02:58:25 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Wed Nov 25 02:58:25 UTC 2020");
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime48);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2020 + "'", int66 == 2020);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "-292275054-11-28T00:00:00.000" + "'", str69, "-292275054-11-28T00:00:00.000");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfMonth();
        int int11 = property10.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime12 = property10.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = property3.getDifference(readableInstant4);
        long long6 = property3.remainder();
        java.lang.String str7 = property3.getAsShortText();
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property3.getLocalDateTime();
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 10474974, chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.year();
        java.lang.String str13 = property12.getName();
        int int14 = property12.getLeapAmount();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "941" + "'", str7, "941");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "year" + "'", str13, "year");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromDateFields(date2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMonths(490);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusMinutes(330);
        int int8 = localDateTime7.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(100L);
        int int18 = localDateTime17.getSecondOfMinute();
        org.joda.time.DateTime dateTime19 = localDateTime17.toDateTime();
        long long20 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant24 = null;
        long long25 = property23.getDifferenceAsLong(readableInstant24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(100L);
        int int34 = localDateTime33.getSecondOfMinute();
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime();
        long long36 = property31.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime35);
        long long37 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime35);
        int int38 = property15.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDateTime localDateTime40 = property15.addToCopy(488);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(100L);
        int int49 = localDateTime48.getSecondOfMinute();
        org.joda.time.DateTime dateTime50 = localDateTime48.toDateTime();
        long long51 = property46.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant55 = null;
        long long56 = property54.getDifferenceAsLong(readableInstant55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(100L);
        int int65 = localDateTime64.getSecondOfMinute();
        org.joda.time.DateTime dateTime66 = localDateTime64.toDateTime();
        long long67 = property62.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime66);
        long long68 = property54.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime66);
        int int69 = property46.compareTo((org.joda.time.ReadableInstant) dateTime66);
        int int70 = property15.compareTo((org.joda.time.ReadableInstant) dateTime66);
        int int71 = property9.getDifference((org.joda.time.ReadableInstant) dateTime66);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:26 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 11651L + "'", long20 == 11651L);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 11651L + "'", long36 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1606273106050L + "'", long37 == 1606273106050L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 11651L + "'", long51 == 11651L);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 11651L + "'", long67 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1606273106050L + "'", long68 == 1606273106050L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.era();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(100L);
        boolean boolean19 = localDateTime13.isAfter((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime13.minusWeeks((int) (short) 1);
        boolean boolean22 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localDateTime13);
        int int23 = localDateTime7.getMonthOfYear();
        org.joda.time.Chronology chronology24 = localDateTime7.getChronology();
        org.joda.time.LocalDateTime.Property property25 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime.Property property26 = localDateTime7.centuryOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        boolean boolean5 = property2.equals((java.lang.Object) "26");
        org.joda.time.LocalDateTime localDateTime6 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property5.getDifference(readableInstant6);
        long long8 = property5.remainder();
        java.lang.String str9 = property5.getAsShortText();
        org.joda.time.DurationField durationField10 = property5.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime11 = property5.getLocalDateTime();
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 10474974, chronology12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 46, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) "124", chronology12);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYearOfEra(488);
        boolean boolean20 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime19);
        int[] intArray21 = localDateTime15.getValues();
        int int22 = localDateTime15.getDayOfWeek();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "624" + "'", str9, "624");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[124, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        java.lang.String str8 = property2.getName();
        org.joda.time.LocalDateTime localDateTime9 = property2.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "millisOfSecond" + "'", str8, "millisOfSecond");
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusSeconds((int) (byte) 100);
        int int25 = localDateTime22.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property26 = localDateTime22.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        boolean boolean28 = localDateTime11.isSupported(dateTimeFieldType27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime11.hourOfDay();
        int int30 = localDateTime11.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:27 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYear(992);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfSecond(999);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundCeilingCopy();
        java.util.Locale locale20 = null;
        int int21 = property18.getMaximumTextLength(locale20);
        int int22 = property18.getMaximumValue();
        java.util.Locale locale23 = null;
        int int24 = property18.getMaximumShortTextLength(locale23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property18.getFieldType();
        org.joda.time.LocalDateTime.Property property26 = localDateTime13.property(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 999 + "'", int22 == 999);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        int int7 = localDateTime6.getYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        java.util.Date date10 = localDateTime9.toDate();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfCentury(1);
        int int16 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusSeconds((int) (byte) 100);
        int int25 = localDateTime22.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property26 = localDateTime22.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime18.withField(dateTimeFieldType27, 10);
        org.joda.time.LocalDateTime.Property property30 = localDateTime6.property(dateTimeFieldType27);
        java.util.Date date31 = localDateTime6.toDate();
        org.joda.time.LocalDateTime.Property property32 = localDateTime6.centuryOfEra();
        org.joda.time.LocalDateTime.Property property33 = localDateTime6.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(100L);
        int int42 = localDateTime41.getSecondOfMinute();
        org.joda.time.DateTime dateTime43 = localDateTime41.toDateTime();
        long long44 = property39.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant48 = null;
        long long49 = property47.getDifferenceAsLong(readableInstant48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(100L);
        int int58 = localDateTime57.getSecondOfMinute();
        org.joda.time.DateTime dateTime59 = localDateTime57.toDateTime();
        long long60 = property55.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime59);
        long long61 = property47.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime59);
        int int62 = property39.compareTo((org.joda.time.ReadableInstant) dateTime59);
        int int63 = property33.getDifference((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.LocalDateTime localDateTime64 = property33.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.withWeekyear(692);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2020 + "'", int7 == 2020);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed Nov 25 02:58:27 UTC 2020");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed Nov 25 02:58:27 UTC 2020");
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 11651L + "'", long44 == 11651L);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 11651L + "'", long60 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1606273107110L + "'", long61 == 1606273107110L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 610 + "'", int63 == 610);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDateTime66);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        int int10 = localDateTime7.getEra();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        java.lang.String str14 = property13.getAsString();
        org.joda.time.LocalDateTime localDateTime16 = property13.addToCopy((long) 'a');
        java.lang.String str17 = localDateTime16.toString();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime22 = property20.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        java.util.Date date25 = localDateTime24.toDate();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        int int31 = localDateTime24.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusSeconds((int) (byte) 100);
        int int40 = localDateTime37.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property41 = localDateTime37.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property41.getFieldType();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime33.withField(dateTimeFieldType42, 10);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime22.withField(dateTimeFieldType42, 214);
        boolean boolean47 = localDateTime16.isSupported(dateTimeFieldType42);
        int int48 = localDateTime7.indexOf(dateTimeFieldType42);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime50.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime50.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.era();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone59);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime62 = property61.roundCeilingCopy();
        java.util.Locale locale63 = null;
        int int64 = property61.getMaximumTextLength(locale63);
        int int65 = property61.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.minus(readablePeriod67);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(100L);
        int int71 = localDateTime70.getSecondOfMinute();
        org.joda.time.DateTime dateTime72 = localDateTime70.toDateTime();
        org.joda.time.DateTime dateTime73 = localDateTime68.toDateTime((org.joda.time.ReadableInstant) dateTime72);
        long long74 = property61.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime75 = localDateTime57.toDateTime((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime57.minusMillis(0);
        org.joda.time.DurationFieldType durationFieldType78 = null;
        boolean boolean79 = localDateTime57.isSupported(durationFieldType78);
        boolean boolean80 = localDateTime7.isEqual((org.joda.time.ReadablePartial) localDateTime57);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime82 = localDateTime57.withSecondOfMinute(362);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 362 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "27" + "'", str14, "27");
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2020-11-25T03:00:04.510" + "'", str17, "2020-11-25T03:00:04.510");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Wed Nov 25 02:58:27 UTC 2020");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime73);
// flaky:         org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withSecondOfMinute(46);
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plus(readablePeriod10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        java.util.Date date5 = localDateTime4.toDate();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        java.util.Date date16 = localDateTime15.toDate();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        int int22 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime13.withFields((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusSeconds((int) (byte) 100);
        int int32 = localDateTime29.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property33 = localDateTime29.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property33.getFieldType();
        boolean boolean35 = localDateTime18.isSupported(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime6.withField(dateTimeFieldType34, 747);
        org.joda.time.LocalDateTime.Property property38 = localDateTime1.property(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime1.plusWeeks(762);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime1.minus(readableDuration41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.withCenturyOfEra((int) 'a');
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:27 UTC 2020");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Wed Nov 25 02:58:27 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Wed Nov 25 02:58:27 UTC 2020");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property5.getAsText(locale12);
        org.joda.time.LocalDateTime localDateTime14 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime15 = property5.getLocalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = localDateTime15.toString(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sunday" + "'", str13, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2001-11-25T02:58:27.978" + "'", str17, "2001-11-25T02:58:27.978");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        java.lang.String str11 = property9.getAsShortText();
        org.joda.time.LocalDateTime localDateTime12 = property9.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(100L);
        int int21 = localDateTime20.getSecondOfMinute();
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime();
        long long23 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        long long25 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDateTime localDateTime26 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime27 = property2.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "73" + "'", str11, "73");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 11651L + "'", long23 == 11651L);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        boolean boolean4 = property2.isLeap();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekyear(9);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.secondOfMinute();
        int int6 = localDateTime4.getWeekyear();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 305 + "'", int2 == 305);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime6 = property2.withMinimumValue();
        int int7 = localDateTime6.getEra();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.plusMonths(490);
        int int10 = localDateTime9.getYearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 61 + "'", int10 == 61);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundHalfEvenCopy();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumTextLength(locale5);
        int int7 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        java.lang.String str8 = property7.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[millisOfSecond]" + "'", str8, "Property[millisOfSecond]");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        int int12 = property11.get();
        org.joda.time.LocalDateTime localDateTime14 = property11.addToCopy(407);
        org.joda.time.LocalDateTime localDateTime15 = property11.roundFloorCopy();
        org.joda.time.DurationField durationField16 = property11.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNull(durationField16);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        java.lang.String str5 = property2.getName();
        org.joda.time.LocalDateTime localDateTime6 = property2.withMinimumValue();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property2.getAsText(locale7);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "secondOfMinute" + "'", str5, "secondOfMinute");
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "28" + "'", str8, "28");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy(1606272851557L);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusYears(19);
        int int14 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(100L);
        int int24 = localDateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime();
        long long26 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalDateTime localDateTime27 = property21.roundCeilingCopy();
        java.util.Locale locale28 = null;
        java.lang.String str29 = property21.getAsText(locale28);
        org.joda.time.LocalDateTime localDateTime31 = property21.addWrapFieldToCopy(1);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 2, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant37 = null;
        long long38 = property36.getDifferenceAsLong(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(100L);
        int int47 = localDateTime46.getSecondOfMinute();
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime();
        long long49 = property44.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        long long50 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.LocalDateTime localDateTime51 = property36.roundHalfFloorCopy();
        org.joda.time.Chronology chronology52 = localDateTime51.getChronology();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime33, chronology52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime33.plusMillis(747);
        boolean boolean56 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.minusWeeks(10535658);
        int int59 = localDateTime55.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "888" + "'", str6, "888");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 40 + "'", int14 == 40);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 11651L + "'", long26 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Sunday" + "'", str29, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(property36);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 11651L + "'", long49 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1606273108788L + "'", long50 == 1606273108788L);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusMillis(10441389);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        java.lang.String str14 = property13.getAsString();
        org.joda.time.DurationField durationField15 = property13.getDurationField();
        org.joda.time.LocalDateTime localDateTime16 = property13.roundFloorCopy();
        boolean boolean17 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        java.lang.String str18 = localDateTime16.toString();
        java.util.Date date19 = localDateTime16.toDate();
        int int20 = localDateTime16.getYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "29" + "'", str14, "29");
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T02:58:29.000" + "'", str18, "2020-11-25T02:58:29.000");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Wed Nov 25 02:58:29 UTC 2020");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2020 + "'", int20 == 2020);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType3 = null;
        boolean boolean4 = localDateTime1.isSupported(durationFieldType3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear(41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMinuteOfHour(10715318);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10715318 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusMillis(0);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(100L);
        boolean boolean20 = localDateTime14.isAfter((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime14.minusWeeks((int) (short) 1);
        boolean boolean23 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime14);
        int int24 = localDateTime8.getMonthOfYear();
        org.joda.time.Chronology chronology25 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 999, chronology25);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(chronology25);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 41, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property5.getDifference(readableInstant6);
        long long8 = property5.remainder();
        java.lang.String str9 = property5.getAsShortText();
        org.joda.time.DurationField durationField10 = property5.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime11 = property5.getLocalDateTime();
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(chronology12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime2.withFields((org.joda.time.ReadablePartial) localDateTime14);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "226" + "'", str9, "226");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusMillis(0);
        boolean boolean12 = property2.equals((java.lang.Object) localDateTime11);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "29" + "'", str3, "29");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(407);
        int int5 = localDateTime0.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        java.util.Date date8 = localDateTime7.toDate();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        int int14 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusSeconds((int) (byte) 100);
        int int23 = localDateTime20.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property24 = localDateTime20.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property24.getFieldType();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime16.withField(dateTimeFieldType25, 10);
        int int28 = localDateTime0.get(dateTimeFieldType25);
        int int29 = localDateTime0.getDayOfWeek();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfYear();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withWeekOfWeekyear(48);
        int int35 = localDateTime31.getWeekyear();
        int int36 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 438 + "'", int5 == 438);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 02:58:29 UTC 2020");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2020 + "'", int28 == 2020);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2020 + "'", int35 == 2020);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property5.getDifference(readableInstant6);
        long long8 = property5.remainder();
        java.lang.String str9 = property5.getAsShortText();
        org.joda.time.DurationField durationField10 = property5.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime11 = property5.getLocalDateTime();
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 10474974, chronology12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 46, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) "124", chronology12);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYearOfEra(488);
        boolean boolean20 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime19);
        int[] intArray21 = localDateTime15.getValues();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfSecond();
        org.joda.time.Chronology chronology31 = localDateTime29.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 7, chronology31);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) intArray21, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: [I");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "622" + "'", str9, "622");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[124, 1, 1, 0]");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localDateTime33);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.lang.String str4 = property2.getAsShortText();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(100L);
        int int14 = localDateTime13.getSecondOfMinute();
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime();
        long long16 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime17 = localDateTime5.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime5.plusMillis(35);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "733" + "'", str4, "733");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 11651L + "'", long16 == 11651L);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        int int8 = localDateTime3.getWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withDate(37, (int) (byte) 10, 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMillis(10573554);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.minus(readablePeriod20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withPeriodAdded(readablePeriod28, 330);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.plusHours(0);
        int int33 = localDateTime27.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime27.plusSeconds(359);
        boolean boolean36 = localDateTime14.isEqual((org.joda.time.ReadablePartial) localDateTime27);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2020 + "'", int8 == 2020);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 359 + "'", int33 == 359);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        java.lang.String str11 = property9.getAsShortText();
        org.joda.time.LocalDateTime localDateTime12 = property9.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(100L);
        int int21 = localDateTime20.getSecondOfMinute();
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime();
        long long23 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        long long25 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime();
        boolean boolean34 = localDateTime32.isBefore((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property37 = localDateTime32.yearOfEra();
        int int38 = property37.get();
        org.joda.time.LocalDateTime localDateTime40 = property37.addToCopy(407);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withDayOfMonth(20);
        org.joda.time.DateTime dateTime43 = localDateTime42.toDateTime();
        long long44 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "982" + "'", str11, "982");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 11651L + "'", long23 == 11651L);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2020 + "'", int38 == 2020);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-12824697600L) + "'", long44 == (-12824697600L));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusMinutes((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant12 = null;
        long long13 = property11.getDifferenceAsLong(readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        long long24 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        long long25 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        int int27 = localDateTime8.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime8.withDayOfWeek(3);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusMinutes((int) (short) 1);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.yearOfEra();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusWeeks(7);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.minus(readablePeriod35);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 11651L + "'", long24 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1606273110006L + "'", long25 == 1606273110006L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25 + "'", int27 == 25);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        int int9 = localDateTime8.size();
        java.lang.String str10 = localDateTime8.toString();
        int int11 = localDateTime8.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.millisOfSecond();
        int int13 = property12.get();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2029-03-25T02:58:30.196" + "'", str10, "2029-03-25T02:58:30.196");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 58 + "'", int11 == 58);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 196 + "'", int13 == 196);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withYearOfEra(3);
        java.lang.String str11 = localDateTime8.toString();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(100L);
        int int21 = localDateTime20.getSecondOfMinute();
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime();
        long long23 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.LocalDateTime localDateTime24 = property18.roundCeilingCopy();
        java.util.Locale locale25 = null;
        java.lang.String str26 = property18.getAsText(locale25);
        org.joda.time.LocalDateTime localDateTime28 = property18.addWrapFieldToCopy(1);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 2, chronology29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant34 = null;
        long long35 = property33.getDifferenceAsLong(readableInstant34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(100L);
        int int44 = localDateTime43.getSecondOfMinute();
        org.joda.time.DateTime dateTime45 = localDateTime43.toDateTime();
        long long46 = property41.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime45);
        long long47 = property33.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.LocalDateTime localDateTime48 = property33.roundHalfFloorCopy();
        org.joda.time.Chronology chronology49 = localDateTime48.getChronology();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime30, chronology49);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime8, chronology49);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(10656500, 20, 357, 10651642, 622, 845, 20, chronology49);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10651642 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T02:58:30.333" + "'", str11, "2020-11-25T02:58:30.333");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 11651L + "'", long23 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Sunday" + "'", str26, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 11651L + "'", long46 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1606273110233L + "'", long47 == 1606273110233L);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(chronology49);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusMillis(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = localDateTime8.toString(dateTimeFormatter9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusMinutes(401);
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T02:58:30.406" + "'", str10, "2020-11-25T02:58:30.406");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusSeconds((int) (byte) 100);
        int int17 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime10.withField(dateTimeFieldType19, 10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusHours(747);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(100L);
        int int34 = localDateTime33.getSecondOfMinute();
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime();
        long long36 = property31.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDateTime localDateTime37 = property31.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusDays(10);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withMonthOfYear(4);
        int int42 = localDateTime21.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.plusMinutes(47);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime41.plusWeeks(305);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:30 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 11651L + "'", long36 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        org.joda.time.LocalDateTime localDateTime8 = property4.roundCeilingCopy();
        int int9 = localDateTime8.getMillisOfDay();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10711000 + "'", int9 == 10711000);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        boolean boolean15 = localDateTime13.isBefore((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(100L);
        int int28 = localDateTime27.getSecondOfMinute();
        org.joda.time.DateTime dateTime29 = localDateTime27.toDateTime();
        long long30 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.LocalDateTime localDateTime31 = property25.roundCeilingCopy();
        java.util.Locale locale32 = null;
        java.lang.String str33 = property25.getAsText(locale32);
        org.joda.time.LocalDateTime localDateTime35 = property25.addWrapFieldToCopy(1);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 2, chronology36);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(1606272852846L, chronology36);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((long) 70, chronology36);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime14, chronology36);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime6, chronology36);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 11651L + "'", long30 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Sunday" + "'", str33, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(chronology36);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromDateFields(date2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMonths(490);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusMinutes(330);
        int int8 = localDateTime7.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.centuryOfEra();
        java.util.Locale locale11 = null;
        org.joda.time.LocalDateTime localDateTime12 = property9.setCopy("145", locale11);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:31 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfEvenCopy();
        int int11 = localDateTime10.getYearOfEra();
        java.util.Date date12 = localDateTime10.toDate();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromDateFields(date12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        int int15 = property14.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2021 + "'", int11 == 2021);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Fri Jan 01 00:00:00 UTC 2021");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property5.getAsText(locale12);
        long long14 = property5.remainder();
        org.joda.time.DateTimeField dateTimeField15 = property5.getField();
        java.lang.String str16 = property5.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sunday" + "'", str13, "Sunday");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10711391L + "'", long14 == 10711391L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Sunday" + "'", str16, "Sunday");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.yearOfEra();
        int int8 = localDateTime1.getSecondOfMinute();
        int int9 = localDateTime1.getWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2020 + "'", int9 == 2020);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYearOfEra(3);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, (int) (short) 100);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withMillisOfDay(10535658);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.minus(readablePeriod18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withYear(318);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(11651L);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMinutes(39);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.dayOfYear();
        int int5 = localDateTime1.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusWeeks(1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsText();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy(1606272964498L);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        java.lang.String str10 = property8.getAsShortText();
        org.joda.time.LocalDateTime localDateTime11 = property8.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = property14.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        java.util.Date date21 = localDateTime20.toDate();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfCentury(1);
        int int27 = localDateTime20.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime34 = property33.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusSeconds((int) (byte) 100);
        int int37 = localDateTime34.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property38 = localDateTime34.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = property38.getFieldType();
        boolean boolean40 = localDateTime23.isSupported(dateTimeFieldType39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime11.property(dateTimeFieldType39);
        org.joda.time.LocalDateTime localDateTime42 = property41.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant46 = null;
        int int47 = property45.getDifference(readableInstant46);
        long long48 = property45.remainder();
        java.lang.String str49 = property45.getAsShortText();
        org.joda.time.DurationField durationField50 = property45.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime52 = property45.addToCopy(1606272851557L);
        org.joda.time.LocalDateTime localDateTime53 = property45.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minusYears(1);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(dateTimeZone56);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime57.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime64 = localDateTime57.minusMillis(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = null;
        java.lang.String str66 = localDateTime64.toString(dateTimeFormatter65);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime64.plusMinutes(401);
        int int69 = localDateTime55.compareTo((org.joda.time.ReadablePartial) localDateTime68);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = localDateTime68.toDateTime(dateTimeZone70);
        int int72 = property41.compareTo((org.joda.time.ReadableInstant) dateTime71);
        int int73 = property2.compareTo((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.LocalDateTime localDateTime75 = property2.addWrapFieldToCopy(0);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31" + "'", str3, "31");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "834" + "'", str10, "834");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Wed Nov 25 02:58:31 UTC 2020");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "834" + "'", str49, "834");
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "2020-11-25T02:58:31.834" + "'", str66, "2020-11-25T02:58:31.834");
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(localDateTime75);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        java.lang.String str8 = property2.getName();
        org.joda.time.LocalDateTime localDateTime10 = property2.addWrapFieldToCopy((-1));
        org.joda.time.LocalDateTime localDateTime11 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMillisOfSecond(29);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "millisOfSecond" + "'", str8, "millisOfSecond");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYear(992);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.dayOfWeek();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property14.getAsText(locale15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.secondOfMinute();
        java.lang.String str20 = property19.getAsString();
        org.joda.time.LocalDateTime localDateTime22 = property19.addToCopy((long) 'a');
        java.lang.String str23 = localDateTime22.toString();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.yearOfCentury();
        int int25 = property24.get();
        int int26 = property24.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(100L);
        int int35 = localDateTime34.getSecondOfMinute();
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime();
        long long37 = property32.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant41 = null;
        long long42 = property40.getDifferenceAsLong(readableInstant41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(100L);
        int int51 = localDateTime50.getSecondOfMinute();
        org.joda.time.DateTime dateTime52 = localDateTime50.toDateTime();
        long long53 = property48.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime52);
        long long54 = property40.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime52);
        int int55 = property32.compareTo((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.LocalDateTime localDateTime57 = property32.addToCopy(488);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(100L);
        int int66 = localDateTime65.getSecondOfMinute();
        org.joda.time.DateTime dateTime67 = localDateTime65.toDateTime();
        long long68 = property63.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(dateTimeZone69);
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant72 = null;
        long long73 = property71.getDifferenceAsLong(readableInstant72);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime(dateTimeZone74);
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime78 = localDateTime75.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property79 = localDateTime78.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime(100L);
        int int82 = localDateTime81.getSecondOfMinute();
        org.joda.time.DateTime dateTime83 = localDateTime81.toDateTime();
        long long84 = property79.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime83);
        long long85 = property71.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime83);
        int int86 = property63.compareTo((org.joda.time.ReadableInstant) dateTime83);
        int int87 = property32.compareTo((org.joda.time.ReadableInstant) dateTime83);
        int int88 = property24.compareTo((org.joda.time.ReadableInstant) dateTime83);
        int int89 = property14.getDifference((org.joda.time.ReadableInstant) dateTime83);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Monday" + "'", str16, "Monday");
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32" + "'", str20, "32");
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T03:00:09.095" + "'", str23, "2020-11-25T03:00:09.095");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20 + "'", int25 == 20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 11651L + "'", long37 == 11651L);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 11651L + "'", long53 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1606273111995L + "'", long54 == 1606273111995L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 11651L + "'", long68 == 11651L);
        org.junit.Assert.assertNotNull(property71);
// flaky:         org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 11651L + "'", long84 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long85 + "' != '" + 1606273111995L + "'", long85 == 1606273111995L);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 11651 + "'", int89 == 11651);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        boolean boolean5 = property2.equals((java.lang.Object) "26");
        org.joda.time.LocalDateTime localDateTime6 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusDays(25);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.weekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        java.lang.String str4 = localDateTime1.toString();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusHours(10535874);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withDayOfYear(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2020-11-25T02:58:32.382" + "'", str4, "2020-11-25T02:58:32.382");
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        boolean boolean12 = localDateTime10.isBefore((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.yearOfEra();
        int int16 = property15.get();
        org.joda.time.LocalDateTime localDateTime18 = property15.addToCopy(407);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusWeeks(100);
        int int21 = property3.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime22 = property3.roundHalfCeilingCopy();
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.plus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.minusMonths(673);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:32 UTC 2020");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2020 + "'", int16 == 2020);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekyear(9);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minus(readablePeriod16);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(100L);
        int int20 = localDateTime19.getSecondOfMinute();
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime();
        org.joda.time.DateTime dateTime22 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime23 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        long long24 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        int int25 = property5.getMaximumValue();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 513 + "'", int2 == 513);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-63461048487L) + "'", long24 == (-63461048487L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 59 + "'", int25 == 59);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        java.lang.String str10 = localDateTime7.toString();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(11651L);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusMinutes(39);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusWeeks(709);
        boolean boolean19 = localDateTime7.isAfter((org.joda.time.ReadablePartial) localDateTime18);
        java.util.Date date20 = localDateTime7.toDate();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2001-11-25T02:58:32.582" + "'", str10, "2001-11-25T02:58:32.582");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Sun Nov 25 02:58:32 UTC 2001");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime6.withCenturyOfEra(10552443);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10552443 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property7.getFieldType();
        org.joda.time.LocalDateTime localDateTime10 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYearOfEra(232);
        int int13 = localDateTime12.getYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 232 + "'", int13 == 232);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(407);
        int int5 = localDateTime0.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        java.util.Date date8 = localDateTime7.toDate();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        int int14 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusSeconds((int) (byte) 100);
        int int23 = localDateTime20.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property24 = localDateTime20.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property24.getFieldType();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime16.withField(dateTimeFieldType25, 10);
        int int28 = localDateTime0.get(dateTimeFieldType25);
        int int29 = localDateTime0.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime0.minusYears(0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime0.withYearOfEra((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withDayOfMonth(10698501);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10698501 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 773 + "'", int5 == 773);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Nov 25 02:58:32 UTC 2020");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2020 + "'", int28 == 2020);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2020-04-06T02:55:46.022", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        java.util.Locale locale6 = null;
        int int7 = property4.getMaximumShortTextLength(locale6);
        org.joda.time.LocalDateTime localDateTime8 = property4.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime9 = property4.getLocalDateTime();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        java.util.Locale locale8 = null;
        org.joda.time.LocalDateTime localDateTime9 = property2.setCopy("590", locale8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property10.getFieldType();
        org.joda.time.DurationField durationField12 = property10.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "976" + "'", str6, "976");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfWeek();
        org.joda.time.DurationField durationField7 = property6.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.plusSeconds((-1));
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusMonths(0);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(100L);
        int int21 = localDateTime20.getSecondOfMinute();
        org.joda.time.DateTime dateTime22 = localDateTime20.toDateTime();
        org.joda.time.DateTime dateTime23 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        int int24 = property6.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33" + "'", str3, "33");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        int int9 = localDateTime8.size();
        java.lang.String str10 = localDateTime8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withEra(40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2029-03-25T02:58:33.243" + "'", str10, "2029-03-25T02:58:33.243");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusMillis(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = localDateTime8.toString(dateTimeFormatter9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = localDateTime8.toString(dateTimeFormatter11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.minus(readablePeriod13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime8.withPeriodAdded(readablePeriod15, 754);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusSeconds(2040);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T02:58:33.321" + "'", str10, "2020-11-25T02:58:33.321");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T02:58:33.321" + "'", str12, "2020-11-25T02:58:33.321");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekOfWeekyear(48);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime1, chronology5);
        int int7 = localDateTime1.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withMillisOfSecond(9);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withMillisOfDay(2120);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.Interval interval8 = property2.toInterval();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property2.getAsShortText(locale9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(interval8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "578" + "'", str10, "578");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.Interval interval7 = property2.toInterval();
        java.lang.String str8 = property2.getAsShortText();
        int int9 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime10 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYear((int) 'a');
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.hourOfDay();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDateTime10.toString("", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "643" + "'", str6, "643");
        org.junit.Assert.assertNotNull(interval7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "643" + "'", str8, "643");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        long long8 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime9 = property7.withMinimumValue();
        int int10 = property7.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusMillis(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.era();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusDays((int) 'a');
        java.lang.String str22 = localDateTime21.toString();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.plus(readableDuration23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime21.withYear(10488141);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        java.util.Date date31 = localDateTime30.toDate();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.fromDateFields(date31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusMonths(490);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime21.withFields((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime21.minusYears(763);
        int int38 = property7.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28609114000L + "'", long8 == 28609114000L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2001-08-20T02:58:33.702" + "'", str22, "2001-08-20T02:58:33.702");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed Nov 25 02:58:33 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        int int9 = localDateTime8.size();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDurationAdded(readableDuration10, 54);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundFloorCopy();
        org.joda.time.DurationField durationField15 = property13.getDurationField();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYear(992);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minusDays(490);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.minusHours((int) (short) 10);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minus(readableDuration18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.monthOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDate localDate3 = localDateTime1.toLocalDate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2020-11-25T02:58:33.321", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime17, dateTimeZone18);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273114221L + "'", long16 == 1606273114221L);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.DateTime dateTime8 = localDateTime4.toDateTime();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDateTime4.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, 292278993);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusDays(1);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withDurationAdded(readableDuration20, 7);
        boolean boolean23 = localDateTime7.equals((java.lang.Object) localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "34" + "'", str3, "34");
        org.junit.Assert.assertNull(durationField4);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 330);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localDateTime15.isSupported(durationFieldType16);
        int int18 = localDateTime15.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.monthOfYear();
        java.util.Locale locale20 = null;
        int int21 = property19.getMaximumShortTextLength(locale20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10715623 + "'", int18 == 10715623);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1606272852846L, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusSeconds((int) (byte) 100);
        int int9 = localDateTime6.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property10 = localDateTime6.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property10.getFieldType();
        int int12 = localDateTime2.indexOf(dateTimeFieldType11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime2.plusSeconds(214);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withPeriodAdded(readablePeriod15, 10475070);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = localDateTime17.toString(dateTimeFormatter18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withDayOfMonth(709);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 709 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2020-11-25T02:57:46.846" + "'", str19, "2020-11-25T02:57:46.846");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusMonths(407);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withDurationAdded(readableDuration9, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = property14.setCopy(9);
        org.joda.time.DurationField durationField17 = property14.getDurationField();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "34" + "'", str3, "34");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime20 = property2.addWrapFieldToCopy(10675758);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273114795L + "'", long16 == 1606273114795L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        java.lang.String str9 = property7.getAsShortText();
        org.joda.time.LocalDateTime localDateTime10 = property7.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime15 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        java.util.Date date20 = localDateTime19.toDate();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYearOfCentury(1);
        int int26 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime17.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusSeconds((int) (byte) 100);
        int int36 = localDateTime33.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property37 = localDateTime33.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property37.getFieldType();
        boolean boolean39 = localDateTime22.isSupported(dateTimeFieldType38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime10.property(dateTimeFieldType38);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime1.withField(dateTimeFieldType38, 488);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusMonths(580);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "922" + "'", str9, "922");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Wed Nov 25 02:58:34 UTC 2020");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        long long18 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime20 = property2.setCopy(19);
        java.lang.String str21 = property2.getName();
        org.joda.time.LocalDateTime localDateTime23 = property2.addWrapFieldToCopy(494);
        org.joda.time.DurationField durationField24 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273114929L + "'", long16 == 1606273114929L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "millisOfSecond" + "'", str21, "millisOfSecond");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNull(durationField24);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(48, 10655099, 323, 10711000, 843);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10711000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusSeconds(407);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(100L);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean18 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        boolean boolean19 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        int int20 = localDateTime12.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        java.util.Date date23 = localDateTime22.toDate();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withYearOfCentury(1);
        int int29 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime35 = property34.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusSeconds((int) (byte) 100);
        int int38 = localDateTime35.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property39 = localDateTime35.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property39.getFieldType();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime31.withField(dateTimeFieldType40, 10);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusHours(747);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withDayOfWeek((int) (byte) 1);
        int int47 = localDateTime46.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withYear(4);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.minusMonths(40);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minusDays(10572088);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.withYear(214);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed Nov 25 02:58:35 UTC 2020");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 48 + "'", int47 == 48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property57);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 3, 0, (int) ' ');
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withTime(10535417, 395, 154, 403);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10535417 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 'a');
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusSeconds(10451787);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.minusMinutes((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant18 = null;
        long long19 = property17.getDifferenceAsLong(readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(100L);
        int int28 = localDateTime27.getSecondOfMinute();
        org.joda.time.DateTime dateTime29 = localDateTime27.toDateTime();
        long long30 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        long long31 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime32 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime29);
        int int33 = localDateTime14.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime14.withDayOfWeek(3);
        int int36 = localDateTime35.getMillisOfDay();
        int int37 = property5.compareTo((org.joda.time.ReadablePartial) localDateTime35);
        java.util.Locale locale38 = null;
        java.lang.String str39 = property5.getAsShortText(locale38);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 11651L + "'", long30 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1606273115402L + "'", long31 == 1606273115402L);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 25 + "'", int33 == 25);
        org.junit.Assert.assertNotNull(localDateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10775502 + "'", int36 == 10775502);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "33" + "'", str39, "33");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsShortText(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property2.roundHalfEvenCopy();
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.plusMinutes(10669616);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "637" + "'", str6, "637");
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(100L);
        int int6 = localDateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.plusMillis((int) '#');
        int int11 = localDateTime1.getWeekOfWeekyear();
        int int12 = localDateTime1.getDayOfYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMonths(100);
        int int6 = localDateTime5.size();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:35 UTC 2020");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.year();
        int int5 = property4.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDateTime6.toDateTime(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusSeconds((int) (byte) 100);
        int int17 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime10.withField(dateTimeFieldType19, 10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusHours(747);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withDayOfWeek((int) (byte) 1);
        int int26 = localDateTime25.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withYear(4);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.plusSeconds(10569494);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:35 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 48 + "'", int26 == 48);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = property11.getDifference(readableInstant12);
        long long14 = property11.remainder();
        org.joda.time.LocalDateTime localDateTime15 = property11.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusMonths(100);
        int int18 = localDateTime17.size();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withDurationAdded(readableDuration19, 54);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.minus(readablePeriod28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withPeriodAdded(readablePeriod36, 330);
        org.joda.time.DurationFieldType durationFieldType39 = null;
        boolean boolean40 = localDateTime38.isSupported(durationFieldType39);
        int[] intArray41 = localDateTime38.getValues();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant47 = null;
        int int48 = property46.getDifference(readableInstant47);
        long long49 = property46.remainder();
        org.joda.time.LocalDateTime localDateTime50 = property46.roundHalfCeilingCopy();
        int int51 = localDateTime50.getYear();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        java.util.Date date54 = localDateTime53.toDate();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.withYearOfCentury(1);
        int int60 = localDateTime53.compareTo((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(dateTimeZone63);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime66 = property65.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusSeconds((int) (byte) 100);
        int int69 = localDateTime66.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property70 = localDateTime66.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = property70.getFieldType();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime62.withField(dateTimeFieldType71, 10);
        org.joda.time.LocalDateTime.Property property74 = localDateTime50.property(dateTimeFieldType71);
        int int75 = localDateTime38.indexOf(dateTimeFieldType71);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime21.withField(dateTimeFieldType71, 56);
        org.joda.time.LocalDateTime.Property property78 = localDateTime1.property(dateTimeFieldType71);
        org.joda.time.DurationField durationField79 = property78.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray41);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[99, 12, 25, 10715983]");
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2020 + "'", int51 == 2020);
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Wed Nov 25 02:58:35 UTC 2020");
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime59);
// flaky:         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNull(durationField79);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        int int7 = localDateTime6.getYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        java.util.Date date10 = localDateTime9.toDate();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfCentury(1);
        int int16 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusSeconds((int) (byte) 100);
        int int25 = localDateTime22.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property26 = localDateTime22.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime18.withField(dateTimeFieldType27, 10);
        org.joda.time.LocalDateTime.Property property30 = localDateTime6.property(dateTimeFieldType27);
        java.util.Date date31 = localDateTime6.toDate();
        org.joda.time.LocalDateTime.Property property32 = localDateTime6.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime6.withWeekOfWeekyear((int) (short) 1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2020 + "'", int7 == 2020);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed Nov 25 02:58:36 UTC 2020");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed Nov 25 02:58:36 UTC 2020");
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 'a', chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.plusDays(1);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.minus(readableDuration10);
        boolean boolean12 = localDateTime2.isAfter((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime2.plusWeeks((int) (short) 1);
        int int15 = localDateTime14.getYear();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        int int3 = localDateTime1.getHourOfDay();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.year();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime3, chronology4);
        int int6 = localDateTime5.getYearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromDateFields(date2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.fromDateFields(date2);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:36 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfEra(3);
        int int12 = localDateTime9.getYearOfEra();
        boolean boolean13 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property14 = localDateTime1.dayOfWeek();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        java.lang.String str10 = localDateTime7.toString();
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.era();
        org.joda.time.LocalDateTime.Property property12 = localDateTime7.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(100L);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.era();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(100L);
        int int19 = localDateTime18.getSecondOfMinute();
        org.joda.time.DateTime dateTime20 = localDateTime18.toDateTime();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.withFields((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime7.withFields((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minus(readableDuration23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2001-11-25T02:58:36.480" + "'", str10, "2001-11-25T02:58:36.480");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusSeconds(407);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(100L);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean18 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        boolean boolean19 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime.Property property20 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minus(readablePeriod22);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(100L);
        int int26 = localDateTime25.getSecondOfMinute();
        org.joda.time.DateTime dateTime27 = localDateTime25.toDateTime();
        org.joda.time.DateTime dateTime28 = localDateTime23.toDateTime((org.joda.time.ReadableInstant) dateTime27);
        int int29 = property20.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusDays((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime39);
        org.joda.time.DurationFieldType durationFieldType41 = null;
        boolean boolean42 = localDateTime39.isSupported(durationFieldType41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.plusMonths((-1));
        int int45 = property20.compareTo((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.LocalDateTime localDateTime47 = property20.addToCopy(28608961000L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateTime44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(localDateTime47);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.centuryOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = property11.getDifference(readableInstant12);
        long long14 = property11.remainder();
        org.joda.time.LocalDateTime localDateTime15 = property11.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusMonths(100);
        int int18 = localDateTime17.size();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withDurationAdded(readableDuration19, 54);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.minus(readablePeriod28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withPeriodAdded(readablePeriod36, 330);
        org.joda.time.DurationFieldType durationFieldType39 = null;
        boolean boolean40 = localDateTime38.isSupported(durationFieldType39);
        int[] intArray41 = localDateTime38.getValues();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant47 = null;
        int int48 = property46.getDifference(readableInstant47);
        long long49 = property46.remainder();
        org.joda.time.LocalDateTime localDateTime50 = property46.roundHalfCeilingCopy();
        int int51 = localDateTime50.getYear();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        java.util.Date date54 = localDateTime53.toDate();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.withYearOfCentury(1);
        int int60 = localDateTime53.compareTo((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(dateTimeZone63);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime66 = property65.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.plusSeconds((int) (byte) 100);
        int int69 = localDateTime66.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property70 = localDateTime66.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = property70.getFieldType();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime62.withField(dateTimeFieldType71, 10);
        org.joda.time.LocalDateTime.Property property74 = localDateTime50.property(dateTimeFieldType71);
        int int75 = localDateTime38.indexOf(dateTimeFieldType71);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime21.withField(dateTimeFieldType71, 56);
        org.joda.time.LocalDateTime.Property property78 = localDateTime1.property(dateTimeFieldType71);
        org.joda.time.LocalDateTime localDateTime86 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod87 = null;
        org.joda.time.LocalDateTime localDateTime89 = localDateTime86.withPeriodAdded(readablePeriod87, 292278993);
        org.joda.time.DateTimeZone dateTimeZone90 = null;
        org.joda.time.DateTime dateTime91 = localDateTime86.toDateTime(dateTimeZone90);
        org.joda.time.LocalDateTime localDateTime92 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime86);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray41);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[99, 12, 25, 10715716]");
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2020 + "'", int51 == 2020);
        org.junit.Assert.assertNotNull(date54);
// flaky:         org.junit.Assert.assertEquals(date54.toString(), "Wed Nov 25 02:58:36 UTC 2020");
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime59);
// flaky:         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(localDateTime89);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(localDateTime92);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusHours(292278993);
        int int6 = localDateTime5.getYearOfEra();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31375 + "'", int6 == 31375);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy(1606272851557L);
        org.joda.time.LocalDateTime localDateTime10 = property2.getLocalDateTime();
        int int11 = localDateTime10.getDayOfMonth();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = localDateTime10.toString(dateTimeFormatter12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "165" + "'", str6, "165");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T02:58:37.165" + "'", str13, "2020-11-25T02:58:37.165");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        int int8 = property7.getMinimumValueOverall();
        int int9 = property7.getMinimumValue();
        int int10 = property7.getMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property7.setCopy(10668723);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10668723 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = property18.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime21 = property18.addWrapFieldToCopy(295);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(100L);
        int int30 = localDateTime29.getSecondOfMinute();
        org.joda.time.DateTime dateTime31 = localDateTime29.toDateTime();
        long long32 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant36 = null;
        long long37 = property35.getDifferenceAsLong(readableInstant36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(100L);
        int int46 = localDateTime45.getSecondOfMinute();
        org.joda.time.DateTime dateTime47 = localDateTime45.toDateTime();
        long long48 = property43.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime47);
        long long49 = property35.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime47);
        int int50 = property27.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.LocalDateTime localDateTime52 = property27.addToCopy(488);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(100L);
        int int61 = localDateTime60.getSecondOfMinute();
        org.joda.time.DateTime dateTime62 = localDateTime60.toDateTime();
        long long63 = property58.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(dateTimeZone64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant67 = null;
        long long68 = property66.getDifferenceAsLong(readableInstant67);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(dateTimeZone69);
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime70.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(100L);
        int int77 = localDateTime76.getSecondOfMinute();
        org.joda.time.DateTime dateTime78 = localDateTime76.toDateTime();
        long long79 = property74.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime78);
        long long80 = property66.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime78);
        int int81 = property58.compareTo((org.joda.time.ReadableInstant) dateTime78);
        int int82 = property27.compareTo((org.joda.time.ReadableInstant) dateTime78);
        int int83 = property18.compareTo((org.joda.time.ReadableInstant) dateTime78);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273117285L + "'", long16 == 1606273117285L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 11651L + "'", long32 == 11651L);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 11651L + "'", long48 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1606273117285L + "'", long49 == 1606273117285L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 11651L + "'", long63 == 11651L);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 11651L + "'", long79 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1606273117285L + "'", long80 == 1606273117285L);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        int int9 = property7.getMinimumValueOverall();
        org.joda.time.DurationField durationField10 = property7.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime11 = property7.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) 'a');
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plus(readableDuration8);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        boolean boolean11 = localDateTime5.isSupported(durationFieldType10);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "37" + "'", str3, "37");
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T03:00:14.601" + "'", str6, "2020-11-25T03:00:14.601");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        java.util.Locale locale2 = null;
        int int3 = property1.getMaximumTextLength(locale2);
        int int4 = property1.get();
        org.joda.time.LocalDateTime localDateTime6 = property1.addToCopy(490);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.era();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 25 + "'", int4 == 25);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusSeconds(407);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(100L);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean18 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        boolean boolean19 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime.Property property20 = localDateTime12.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime12.withPeriodAdded(readablePeriod21, 3);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) 'a');
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.yearOfCentury();
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.yearOfCentury();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDateTime5.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "37" + "'", str3, "37");
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T03:00:14.757" + "'", str6, "2020-11-25T03:00:14.757");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.DateTime dateTime2 = localDateTime0.toDateTime();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 'a');
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDateTime4.getFields();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusSeconds(10451787);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.withFields((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime.Property property9 = localDateTime4.weekyear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime4.dayOfWeek();
        int int11 = property10.getLeapAmount();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        java.lang.String str10 = localDateTime7.toString();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.plusWeeks(833);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2001-11-25T02:58:37.842" + "'", str10, "2001-11-25T02:58:37.842");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1606273108788L, dateTimeZone1);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(407);
        int int5 = localDateTime0.getMillisOfSecond();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = localDateTime0.toString(dateTimeFormatter6);
        int int8 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.plusMonths(10531220);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusMonths(734);
        java.util.Date date15 = localDateTime14.toDate();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 963 + "'", int5 == 963);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T02:58:37.963" + "'", str7, "2020-11-25T02:58:37.963");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 963 + "'", int8 == 963);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Sat May 25 02:58:37 UTC 879540");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsShortText(locale5);
        org.joda.time.DurationField durationField7 = property2.getLeapDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.getLocalDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7" + "'", str6, "7");
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekOfWeekyear(48);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYearOfEra(48);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime localDateTime8 = property7.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minus(readableDuration7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property10 = localDateTime6.dayOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = localDateTime6.toString(dateTimeFormatter11);
        org.joda.time.DurationFieldType durationFieldType13 = null;
        boolean boolean14 = localDateTime6.isSupported(durationFieldType13);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T02:58:38.081" + "'", str12, "2020-11-25T02:58:38.081");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property19 = localDateTime11.hourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime11.withDate(407, 10, 31);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime11.minus(readableDuration24);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:38 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.lang.String str4 = property2.getAsShortText();
        boolean boolean5 = property2.isLeap();
        java.lang.String str6 = property2.getAsText();
        org.joda.time.LocalDateTime localDateTime7 = property2.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDateTime7.getValue(714);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 714");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "170" + "'", str4, "170");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "170" + "'", str6, "170");
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        java.util.Date date5 = localDateTime4.toDate();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        java.util.Date date16 = localDateTime15.toDate();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        int int22 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime13.withFields((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusSeconds((int) (byte) 100);
        int int32 = localDateTime29.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property33 = localDateTime29.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property33.getFieldType();
        boolean boolean35 = localDateTime18.isSupported(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime6.withField(dateTimeFieldType34, 747);
        org.joda.time.LocalDateTime.Property property38 = localDateTime1.property(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime1.plusWeeks(762);
        boolean boolean42 = localDateTime1.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:38 UTC 2020");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Wed Nov 25 02:58:38 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Wed Nov 25 02:58:38 UTC 2020");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant4 = null;
        long long5 = property3.getDifferenceAsLong(readableInstant4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(100L);
        int int14 = localDateTime13.getSecondOfMinute();
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime();
        long long16 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        long long17 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalDateTime localDateTime18 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime19 = property3.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = property24.getDifference(readableInstant25);
        long long27 = property24.remainder();
        java.lang.String str28 = property24.getAsShortText();
        org.joda.time.DurationField durationField29 = property24.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime30 = property24.getLocalDateTime();
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 10474974, chronology31);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 46, chronology31);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime19, chronology31);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(obj0, chronology31);
        int int36 = localDateTime35.getEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 11651L + "'", long16 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1606273118210L + "'", long17 == 1606273118210L);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "310" + "'", str28, "310");
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusSeconds((int) (byte) 100);
        int int17 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime10.withField(dateTimeFieldType19, 10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusHours(747);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withDayOfWeek((int) (byte) 1);
        int int26 = localDateTime25.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withYear(4);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.secondOfMinute();
        int int33 = localDateTime31.getYear();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.withMillisOfDay(10451787);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusDays(762);
        boolean boolean38 = property29.equals((java.lang.Object) localDateTime37);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:38 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 48 + "'", int26 == 48);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2020 + "'", int33 == 2020);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(100L);
        int int5 = localDateTime4.getSecondOfMinute();
        org.joda.time.DateTime dateTime6 = localDateTime4.toDateTime();
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime8 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime.Property property9 = localDateTime2.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDateTime2.getFieldType(225);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 225");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        int int10 = localDateTime7.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        java.util.Date date13 = localDateTime12.toDate();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        int int19 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusSeconds((int) (byte) 100);
        int int28 = localDateTime25.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property29 = localDateTime25.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property29.getFieldType();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime21.withField(dateTimeFieldType30, 10);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusHours(747);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withDayOfWeek((int) (byte) 1);
        int int37 = localDateTime36.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withYear(4);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.minusMonths(40);
        int int42 = localDateTime36.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        int int45 = localDateTime44.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.withWeekyear(9);
        org.joda.time.LocalDateTime.Property property48 = localDateTime44.dayOfYear();
        boolean boolean50 = property48.equals((java.lang.Object) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property48.getFieldType();
        int int52 = localDateTime36.indexOf(dateTimeFieldType51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime7.property(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Wed Nov 25 02:58:38 UTC 2020");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 48 + "'", int37 == 48);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10718480 + "'", int42 == 10718480);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 480 + "'", int45 == 480);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(property53);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        int int12 = property11.get();
        org.joda.time.LocalDateTime localDateTime14 = property11.addToCopy(407);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withDayOfMonth(20);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.year();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        java.util.Date date5 = localDateTime4.toDate();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        java.util.Date date16 = localDateTime15.toDate();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        int int22 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime13.withFields((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusSeconds((int) (byte) 100);
        int int32 = localDateTime29.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property33 = localDateTime29.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property33.getFieldType();
        boolean boolean35 = localDateTime18.isSupported(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime6.withField(dateTimeFieldType34, 747);
        org.joda.time.LocalDateTime.Property property38 = localDateTime1.property(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime39 = property38.withMaximumValue();
        int int40 = localDateTime39.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime43 = property41.setCopy(40);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:38 UTC 2020");
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Wed Nov 25 02:58:38 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Wed Nov 25 02:58:38 UTC 2020");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 677 + "'", int40 == 677);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusYears(407);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusSeconds((int) (byte) 100);
        int int13 = localDateTime12.getYearOfEra();
        boolean boolean14 = localDateTime6.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2020 + "'", int13 == 2020);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekOfWeekyear(48);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime1, chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfSecond(37);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDateTime8.getFields();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withMillisOfDay(2);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        long long8 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime9 = property7.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfEra(10441389);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.yearOfCentury();
        java.lang.String str14 = localDateTime9.toString("189");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28609119000L + "'", long8 == 28609119000L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "189" + "'", str14, "189");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsShortText(locale5);
        org.joda.time.LocalDateTime localDateTime7 = property2.roundHalfEvenCopy();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsShortText(locale8);
        org.joda.time.LocalDateTime localDateTime10 = property2.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekOfWeekyear(833);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 833 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "973" + "'", str6, "973");
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "973" + "'", str9, "973");
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        int int6 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
        org.joda.time.LocalDateTime localDateTime10 = property7.addToCopy(999);
        org.joda.time.LocalDateTime localDateTime11 = property7.getLocalDateTime();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readableDuration12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.year();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.year();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.era();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(100L);
        boolean boolean19 = localDateTime13.isAfter((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime13.minusWeeks((int) (short) 1);
        boolean boolean22 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localDateTime13);
        int int23 = localDateTime7.getMonthOfYear();
        int int24 = localDateTime7.getMonthOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfEvenCopy();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property9.getAsShortText(locale11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withWeekOfWeekyear(48);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime14, chronology18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.year();
        int int21 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        int int22 = localDateTime19.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property23 = localDateTime19.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime28 = property26.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        java.util.Date date33 = localDateTime32.toDate();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withYearOfCentury(1);
        int int39 = localDateTime32.compareTo((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime35.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime30.withFields((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime46 = property45.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plusSeconds((int) (byte) 100);
        int int49 = localDateTime46.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property50 = localDateTime46.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property50.getFieldType();
        boolean boolean52 = localDateTime35.isSupported(dateTimeFieldType51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime35.hourOfDay();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.dayOfYear();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.withWeekOfWeekyear(48);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.withYearOfEra(48);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.minusMonths(59);
        boolean boolean63 = localDateTime35.isBefore((org.joda.time.ReadablePartial) localDateTime58);
        int int64 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime58);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime58.withCenturyOfEra(7);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020" + "'", str12, "2020");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Wed Nov 25 02:58:39 UTC 2020");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
// flaky:         org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(localDateTime66);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        int int9 = localDateTime8.size();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDurationAdded(readableDuration10, 54);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.yearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay(100);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.plusHours((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = localDateTime7.isSupported(durationFieldType11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withCenturyOfEra((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusMonths((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime0, dateTimeZone5);
        int int7 = localDateTime6.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = property3.getDifference(readableInstant4);
        long long6 = property3.remainder();
        java.lang.String str7 = property3.getAsShortText();
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property3.getLocalDateTime();
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 10474974, chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.year();
        java.lang.String str13 = property12.getName();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        long long24 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.LocalDateTime localDateTime25 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusDays(10);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.plus(readableDuration28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        java.util.Date date32 = localDateTime31.toDate();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withYearOfCentury(1);
        int int38 = localDateTime31.compareTo((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime31.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        java.util.Date date43 = localDateTime42.toDate();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        java.util.Date date46 = localDateTime45.toDate();
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.fromDateFields(date46);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime51 = property50.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime52 = property50.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        java.util.Date date57 = localDateTime56.toDate();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.withYearOfCentury(1);
        int int63 = localDateTime56.compareTo((org.joda.time.ReadablePartial) localDateTime59);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime59.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime54.withFields((org.joda.time.ReadablePartial) localDateTime59);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(dateTimeZone67);
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime70 = property69.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.plusSeconds((int) (byte) 100);
        int int73 = localDateTime70.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property74 = localDateTime70.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property74.getFieldType();
        boolean boolean76 = localDateTime59.isSupported(dateTimeFieldType75);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime47.withField(dateTimeFieldType75, 747);
        org.joda.time.LocalDateTime.Property property79 = localDateTime42.property(dateTimeFieldType75);
        int int80 = localDateTime40.get(dateTimeFieldType75);
        org.joda.time.LocalDateTime.Property property81 = localDateTime29.property(dateTimeFieldType75);
        boolean boolean82 = property12.equals((java.lang.Object) localDateTime29);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "790" + "'", str7, "790");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "year" + "'", str13, "year");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 11651L + "'", long24 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Wed Nov 25 02:58:39 UTC 2020");
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Wed Nov 25 02:58:39 UTC 2020");
        org.junit.Assert.assertNotNull(date46);
// flaky:         org.junit.Assert.assertEquals(date46.toString(), "Wed Nov 25 02:58:39 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(date57);
// flaky:         org.junit.Assert.assertEquals(date57.toString(), "Wed Nov 25 02:58:39 UTC 2020");
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime62);
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertNotNull(dateTimeFieldType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2020 + "'", int80 == 2020);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy(1606272851557L);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusYears(19);
        int int14 = localDateTime9.getSecondOfMinute();
        int int15 = localDateTime9.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        boolean boolean24 = localDateTime9.isBefore((org.joda.time.ReadablePartial) localDateTime23);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "104" + "'", str6, "104");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21171661 + "'", int15 == 21171661);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfDay((int) '#');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withSecondOfMinute(10);
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withMinuteOfHour((int) '4');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        boolean boolean26 = localDateTime24.isBefore((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusSeconds(488);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.secondOfMinute();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.era();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime41 = localDateTime34.minusMinutes((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant45 = null;
        long long46 = property44.getDifferenceAsLong(readableInstant45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(100L);
        int int55 = localDateTime54.getSecondOfMinute();
        org.joda.time.DateTime dateTime56 = localDateTime54.toDateTime();
        long long57 = property52.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime56);
        long long58 = property44.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime59 = localDateTime41.toDateTime((org.joda.time.ReadableInstant) dateTime56);
        int int60 = localDateTime41.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime41.withDayOfWeek(3);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(dateTimeZone63);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime66 = property65.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime67 = property65.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(dateTimeZone68);
        java.util.Date date70 = localDateTime69.toDate();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(dateTimeZone71);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.withYearOfCentury(1);
        int int76 = localDateTime69.compareTo((org.joda.time.ReadablePartial) localDateTime72);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime72.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(dateTimeZone79);
        org.joda.time.LocalDateTime.Property property81 = localDateTime80.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime82 = property81.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime84 = localDateTime82.plusSeconds((int) (byte) 100);
        int int85 = localDateTime82.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property86 = localDateTime82.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = property86.getFieldType();
        org.joda.time.LocalDateTime localDateTime89 = localDateTime78.withField(dateTimeFieldType87, 10);
        org.joda.time.LocalDateTime localDateTime91 = localDateTime67.withField(dateTimeFieldType87, 214);
        boolean boolean92 = localDateTime62.isSupported(dateTimeFieldType87);
        int int93 = localDateTime30.get(dateTimeFieldType87);
        boolean boolean94 = localDateTime25.isSupported(dateTimeFieldType87);
        org.joda.time.LocalDateTime.Property property95 = localDateTime10.property(dateTimeFieldType87);
        org.joda.time.LocalDateTime.Property property96 = localDateTime10.dayOfMonth();
        int int97 = localDateTime10.getEra();
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property44);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 11651L + "'", long57 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1606273120084L + "'", long58 == 1606273120084L);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 25 + "'", int60 == 25);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(date70);
// flaky:         org.junit.Assert.assertEquals(date70.toString(), "Wed Nov 25 02:58:40 UTC 2020");
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(localDateTime75);
// flaky:         org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(localDateTime78);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(localDateTime82);
        org.junit.Assert.assertNotNull(localDateTime84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNotNull(dateTimeFieldType87);
        org.junit.Assert.assertNotNull(localDateTime89);
        org.junit.Assert.assertNotNull(localDateTime91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 2020 + "'", int93 == 2020);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(property95);
        org.junit.Assert.assertNotNull(property96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYearOfCentury(174);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 174 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property5.getAsText(locale12);
        long long14 = property5.remainder();
        java.lang.String str15 = property5.getAsText();
        org.joda.time.DurationField durationField16 = property5.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sunday" + "'", str13, "Sunday");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10720410L + "'", long14 == 10720410L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Sunday" + "'", str15, "Sunday");
        org.junit.Assert.assertNull(durationField16);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        long long14 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.LocalDateTime localDateTime15 = property9.roundCeilingCopy();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property9.getAsText(locale16);
        org.joda.time.LocalDateTime localDateTime19 = property9.addWrapFieldToCopy(1);
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 2, chronology20);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(1606272852846L, chronology20);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 70, chronology20);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 11651, chronology20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11651L + "'", long14 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Sunday" + "'", str17, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (short) 0, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withPeriodAdded(readablePeriod16, 330);
        org.joda.time.DurationFieldType durationFieldType19 = null;
        boolean boolean20 = localDateTime18.isSupported(durationFieldType19);
        int[] intArray21 = localDateTime18.getValues();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = property25.getDifference(readableInstant26);
        long long28 = property25.remainder();
        java.lang.String str29 = property25.getAsShortText();
        org.joda.time.DurationField durationField30 = property25.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime31 = property25.getLocalDateTime();
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 10474974, chronology32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.minuteOfHour();
        org.joda.time.Chronology chronology35 = localDateTime33.getChronology();
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now(chronology35);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, chronology35);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone1, chronology35);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[99, 12, 25, 10715590]");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "590" + "'", str29, "590");
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime37);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.monthOfYear();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfDay((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) (short) 1, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "732" + "'", str6, "732");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy(18);
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = localDateTime10.isSupported(durationFieldType12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withPeriodAdded(readablePeriod14, 5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("969", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.year();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        int int11 = localDateTime10.getDayOfYear();
        boolean boolean12 = localDateTime4.isBefore((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.minusDays(999);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 330 + "'", int11 == 330);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundCeilingCopy();
        java.util.Locale locale14 = null;
        int int15 = property12.getMaximumTextLength(locale14);
        int int16 = property12.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minus(readablePeriod18);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        org.joda.time.DateTime dateTime24 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        long long25 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime8.minusMillis(0);
        int int29 = localDateTime8.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime8.withMonthOfYear(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = localDateTime8.withWeekOfWeekyear(741);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 741 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDateTime31);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) 'a');
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.yearOfCentury();
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "41" + "'", str3, "41");
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T03:00:18.163" + "'", str6, "2020-11-25T03:00:18.163");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate((int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minusMinutes((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.withPeriodAdded(readablePeriod13, 359);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime6.minus(readableDuration16);
        int int18 = localDateTime17.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = property21.getDifference(readableInstant22);
        long long24 = property21.remainder();
        java.lang.String str25 = property21.getAsShortText();
        org.joda.time.DurationField durationField26 = property21.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime28 = property21.addToCopy(1606272851557L);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property33 = localDateTime30.year();
        int int34 = property33.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime35 = property33.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        java.util.Date date38 = localDateTime37.toDate();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withYearOfCentury(1);
        int int44 = localDateTime37.compareTo((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.plusSeconds((int) (byte) 100);
        int int53 = localDateTime50.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property54 = localDateTime50.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property54.getFieldType();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime46.withField(dateTimeFieldType55, 10);
        org.joda.time.LocalDateTime.Property property58 = localDateTime35.property(dateTimeFieldType55);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime28.withField(dateTimeFieldType55, (int) (byte) 100);
        int int61 = localDateTime17.indexOf(dateTimeFieldType55);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "288" + "'", str25, "288");
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Wed Nov 25 02:58:41 UTC 2020");
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 330);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localDateTime15.isSupported(durationFieldType16);
        int[] intArray18 = localDateTime15.getValues();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = property23.getDifference(readableInstant24);
        long long26 = property23.remainder();
        org.joda.time.LocalDateTime localDateTime27 = property23.roundHalfCeilingCopy();
        int int28 = localDateTime27.getYear();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        java.util.Date date31 = localDateTime30.toDate();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withYearOfCentury(1);
        int int37 = localDateTime30.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusSeconds((int) (byte) 100);
        int int46 = localDateTime43.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property47 = localDateTime43.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property47.getFieldType();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime39.withField(dateTimeFieldType48, 10);
        org.joda.time.LocalDateTime.Property property51 = localDateTime27.property(dateTimeFieldType48);
        int int52 = localDateTime15.indexOf(dateTimeFieldType48);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime15.withYearOfEra(658);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.centuryOfEra();
        java.util.Locale locale56 = null;
        java.lang.String str57 = property55.getAsShortText(locale56);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[99, 12, 25, 10715430]");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2020 + "'", int28 == 2020);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed Nov 25 02:58:41 UTC 2020");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "6" + "'", str57, "6");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.minusMinutes((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant15 = null;
        long long16 = property14.getDifferenceAsLong(readableInstant15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(100L);
        int int25 = localDateTime24.getSecondOfMinute();
        org.joda.time.DateTime dateTime26 = localDateTime24.toDateTime();
        long long27 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        long long28 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime29 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        int int30 = localDateTime11.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime11.withDayOfWeek(3);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime37 = property35.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        java.util.Date date40 = localDateTime39.toDate();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withYearOfCentury(1);
        int int46 = localDateTime39.compareTo((org.joda.time.ReadablePartial) localDateTime42);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime52 = property51.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusSeconds((int) (byte) 100);
        int int55 = localDateTime52.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property56 = localDateTime52.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property56.getFieldType();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime48.withField(dateTimeFieldType57, 10);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime37.withField(dateTimeFieldType57, 214);
        boolean boolean62 = localDateTime32.isSupported(dateTimeFieldType57);
        int int63 = localDateTime1.get(dateTimeFieldType57);
        int int64 = localDateTime1.getYear();
        org.joda.time.LocalDateTime.Property property65 = localDateTime1.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 11651L + "'", long27 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1606273121456L + "'", long28 == 1606273121456L);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25 + "'", int30 == 25);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(date40);
// flaky:         org.junit.Assert.assertEquals(date40.toString(), "Wed Nov 25 02:58:41 UTC 2020");
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2020 + "'", int63 == 2020);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2020 + "'", int64 == 2020);
        org.junit.Assert.assertNotNull(property65);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusSeconds((-1));
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMonths(0);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plus(readablePeriod11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYearOfEra(3);
        int int13 = localDateTime10.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withYear(426);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withDayOfYear(17);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withSecondOfMinute(46);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        java.util.Date date11 = localDateTime10.toDate();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromDateFields(date11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusMonths(490);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        java.util.Date date17 = localDateTime16.toDate();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        int int23 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusSeconds((int) (byte) 100);
        int int32 = localDateTime29.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property33 = localDateTime29.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property33.getFieldType();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime25.withField(dateTimeFieldType34, 10);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime14.withField(dateTimeFieldType34, 0);
        int int39 = localDateTime8.indexOf(dateTimeFieldType34);
        int int40 = localDateTime8.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime8.minusMinutes(39);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Wed Nov 25 02:58:41 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Wed Nov 25 02:58:41 UTC 2020");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 11 + "'", int40 == 11);
        org.junit.Assert.assertNotNull(localDateTime42);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        int int7 = localDateTime4.getDayOfWeek();
        int int8 = localDateTime4.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.plusSeconds((-1));
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundCeilingCopy();
        int int22 = localDateTime21.getYear();
        boolean boolean23 = localDateTime17.isAfter((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundCeilingCopy();
        java.util.Locale locale28 = null;
        int int29 = property26.getMaximumTextLength(locale28);
        int int30 = property26.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property26.getFieldType();
        int int32 = localDateTime17.get(dateTimeFieldType31);
        int int33 = localDateTime4.indexOf(dateTimeFieldType31);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime4.withDurationAdded(readableDuration34, 10718480);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2020 + "'", int8 == 2020);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2020 + "'", int22 == 2020);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 82 + "'", int32 == 82);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(localDateTime36);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.minuteOfHour();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray20 = localDateTime18.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.plusWeeks(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = localDateTime18.withTime(731, 395, 245, 674);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 731 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:42 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.getLocalDateTime();
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        int int10 = localDateTime8.getDayOfMonth();
        int int11 = localDateTime8.getWeekyear();
        int int12 = localDateTime8.getDayOfWeek();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "184" + "'", str6, "184");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 330);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localDateTime15.isSupported(durationFieldType16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withDayOfYear(83);
        int int22 = localDateTime19.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.minuteOfHour();
        int int20 = property19.getMaximumValue();
        int int21 = property19.getMaximumValueOverall();
        int int22 = property19.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:42 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 59 + "'", int20 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        int int11 = localDateTime10.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusMonths(154);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 3, 0, (int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMillis((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekOfWeekyear();
        int int9 = localDateTime7.getDayOfYear();
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusWeeks(330);
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.weekyear();
        org.joda.time.LocalDateTime localDateTime13 = property11.setCopy(50);
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDateTime13.toString("2001-08-20T02:58:16.164", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsShortText(locale5);
        org.joda.time.DurationField durationField7 = property2.getLeapDurationField();
        java.lang.String str8 = property2.getAsShortText();
        org.joda.time.LocalDateTime localDateTime9 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "601" + "'", str6, "601");
        org.junit.Assert.assertNull(durationField7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "601" + "'", str8, "601");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        int int9 = localDateTime8.size();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDurationAdded(readableDuration10, 54);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime.Property property15 = localDateTime12.property(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusMinutes((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant12 = null;
        long long13 = property11.getDifferenceAsLong(readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        long long24 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        long long25 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        int int27 = localDateTime8.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = property30.getDifference(readableInstant31);
        long long33 = property30.remainder();
        org.joda.time.LocalDateTime localDateTime34 = property30.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusMonths(100);
        boolean boolean37 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime8.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = property41.getDifference(readableInstant42);
        long long44 = property41.remainder();
        java.lang.String str45 = property41.getAsShortText();
        org.joda.time.DurationField durationField46 = property41.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime48 = property41.addToCopy(1606272851557L);
        java.lang.String str49 = property41.getAsString();
        org.joda.time.DurationField durationField50 = property41.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.secondOfMinute();
        java.lang.String str54 = property53.getAsString();
        org.joda.time.DurationField durationField55 = property53.getDurationField();
        org.joda.time.LocalDateTime localDateTime56 = property53.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime57 = property53.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(dateTimeZone58);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime59.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.minus(readablePeriod64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime63.plusSeconds(407);
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime68.minus(readablePeriod69);
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(100L);
        int int73 = localDateTime72.getSecondOfMinute();
        org.joda.time.DateTime dateTime74 = localDateTime72.toDateTime();
        org.joda.time.DateTime dateTime75 = localDateTime70.toDateTime((org.joda.time.ReadableInstant) dateTime74);
        boolean boolean76 = localDateTime67.isAfter((org.joda.time.ReadablePartial) localDateTime70);
        boolean boolean77 = localDateTime62.isEqual((org.joda.time.ReadablePartial) localDateTime70);
        org.joda.time.LocalDateTime.Property property78 = localDateTime70.centuryOfEra();
        org.joda.time.DateTime dateTime79 = localDateTime70.toDateTime();
        int int80 = property53.compareTo((org.joda.time.ReadableInstant) dateTime79);
        long long81 = property41.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime79);
        int int82 = property38.compareTo((org.joda.time.ReadableInstant) dateTime79);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 11651L + "'", long24 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1606273122624L + "'", long25 == 1606273122624L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25 + "'", int27 == 25);
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "724" + "'", str45, "724");
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(localDateTime48);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "724" + "'", str49, "724");
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(property53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "42" + "'", str54, "42");
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(dateTime79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMillis(25810001);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 'a', chronology1);
        int int3 = localDateTime2.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withYearOfCentury(54);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.weekyear();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property6.getAsShortText(locale7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1953" + "'", str8, "1953");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = property4.getDifference(readableInstant5);
        long long7 = property4.remainder();
        java.lang.String str8 = property4.getAsShortText();
        org.joda.time.DurationField durationField9 = property4.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime10 = property4.getLocalDateTime();
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 10474974, chronology11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(1606272978050L, chronology11);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "226" + "'", str8, "226");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withFieldAdded(durationFieldType15, 502);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(100L);
        int int5 = localDateTime4.getSecondOfMinute();
        org.joda.time.DateTime dateTime6 = localDateTime4.toDateTime();
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime8 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime.Property property9 = localDateTime2.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime2.withWeekOfWeekyear(701);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 701 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = property4.getDifference(readableInstant5);
        long long7 = property4.remainder();
        java.lang.String str8 = property4.getAsShortText();
        org.joda.time.DurationField durationField9 = property4.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime10 = property4.getLocalDateTime();
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 10474974, chronology11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 46, chronology11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusDays(1);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.minus(readableDuration21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        java.util.Date date25 = localDateTime24.toDate();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        int int31 = localDateTime24.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime24.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant37 = null;
        long long38 = property36.getDifferenceAsLong(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(100L);
        int int47 = localDateTime46.getSecondOfMinute();
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime();
        long long49 = property44.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        long long50 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.LocalDateTime localDateTime51 = property36.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime52 = property36.withMaximumValue();
        int int53 = localDateTime33.compareTo((org.joda.time.ReadablePartial) localDateTime52);
        int int54 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime52);
        boolean boolean55 = localDateTime13.isAfter((org.joda.time.ReadablePartial) localDateTime52);
        org.joda.time.DateTimeField[] dateTimeFieldArray56 = localDateTime13.getFields();
        org.joda.time.LocalDateTime.Property property57 = localDateTime13.dayOfYear();
        org.joda.time.LocalDateTime localDateTime59 = property57.addToCopy(910);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.minus(readablePeriod61);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime60.plusSeconds(407);
        int int65 = localDateTime60.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(dateTimeZone66);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime69 = property68.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime70 = property68.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(dateTimeZone73);
        java.util.Date date75 = localDateTime74.toDate();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime(dateTimeZone76);
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime77.withYearOfCentury(1);
        int int81 = localDateTime74.compareTo((org.joda.time.ReadablePartial) localDateTime77);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime77.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime72.withFields((org.joda.time.ReadablePartial) localDateTime77);
        org.joda.time.DateTimeZone dateTimeZone85 = null;
        org.joda.time.LocalDateTime localDateTime86 = new org.joda.time.LocalDateTime(dateTimeZone85);
        org.joda.time.LocalDateTime.Property property87 = localDateTime86.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime88 = property87.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime90 = localDateTime88.plusSeconds((int) (byte) 100);
        int int91 = localDateTime88.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property92 = localDateTime88.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType93 = property92.getFieldType();
        boolean boolean94 = localDateTime77.isSupported(dateTimeFieldType93);
        int int95 = localDateTime60.get(dateTimeFieldType93);
        org.joda.time.LocalDateTime localDateTime97 = localDateTime59.withField(dateTimeFieldType93, 757);
        org.joda.time.DateTimeField[] dateTimeFieldArray98 = localDateTime97.getFields();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "435" + "'", str8, "435");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Wed Nov 25 02:58:43 UTC 2020");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 11651L + "'", long49 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1606273123336L + "'", long50 == 1606273123336L);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 436 + "'", int65 == 436);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Wed Nov 25 02:58:43 UTC 2020");
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(localDateTime80);
// flaky:         org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertNotNull(localDateTime84);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertNotNull(localDateTime90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(property92);
        org.junit.Assert.assertNotNull(dateTimeFieldType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 2020 + "'", int95 == 2020);
        org.junit.Assert.assertNotNull(localDateTime97);
        org.junit.Assert.assertNotNull(dateTimeFieldArray98);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(100L);
        int int6 = localDateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.minusMonths(10474974);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withDate(757, 1, 10669616);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10669616 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekyear(9);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minus(readablePeriod16);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(100L);
        int int20 = localDateTime19.getSecondOfMinute();
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime();
        org.joda.time.DateTime dateTime22 = localDateTime17.toDateTime((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime23 = localDateTime14.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        long long24 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.LocalDateTime localDateTime25 = property5.roundHalfEvenCopy();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 837 + "'", int2 == 837);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-63461048476L) + "'", long24 == (-63461048476L));
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property7.getAsShortText(locale8);
        org.joda.time.LocalDateTime localDateTime10 = property7.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "920" + "'", str9, "920");
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property5.getAsText(locale12);
        org.joda.time.LocalDateTime localDateTime14 = property5.roundHalfEvenCopy();
        java.lang.String str16 = localDateTime14.toString("726");
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plus(readablePeriod17);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sunday" + "'", str13, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "726" + "'", str16, "726");
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        int int10 = localDateTime7.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.minusMinutes((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant23 = null;
        long long24 = property22.getDifferenceAsLong(readableInstant23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(100L);
        int int33 = localDateTime32.getSecondOfMinute();
        org.joda.time.DateTime dateTime34 = localDateTime32.toDateTime();
        long long35 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        long long36 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime37 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) dateTime34);
        int int38 = localDateTime19.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime19.withDayOfWeek(3);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime45 = property43.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone46);
        java.util.Date date48 = localDateTime47.toDate();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withYearOfCentury(1);
        int int54 = localDateTime47.compareTo((org.joda.time.ReadablePartial) localDateTime50);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime50.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime60 = property59.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.plusSeconds((int) (byte) 100);
        int int63 = localDateTime60.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property64 = localDateTime60.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = property64.getFieldType();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime56.withField(dateTimeFieldType65, 10);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime45.withField(dateTimeFieldType65, 214);
        boolean boolean70 = localDateTime40.isSupported(dateTimeFieldType65);
        boolean boolean71 = localDateTime7.isSupported(dateTimeFieldType65);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime7.plusWeeks(39);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 11651L + "'", long35 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1606273123930L + "'", long36 == 1606273123930L);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 25 + "'", int38 == 25);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(date48);
// flaky:         org.junit.Assert.assertEquals(date48.toString(), "Wed Nov 25 02:58:44 UTC 2020");
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime53);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(localDateTime73);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        int int4 = localDateTime3.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 330);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localDateTime15.isSupported(durationFieldType16);
        int int18 = localDateTime15.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.minusMonths(2);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.minus(readablePeriod26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minusMonths(11);
        boolean boolean34 = localDateTime20.isAfter((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime20.plusMillis(10711230);
        org.joda.time.DurationFieldType durationFieldType37 = null;
        boolean boolean38 = localDateTime20.isSupported(durationFieldType37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime20.plusWeeks(676);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10715427 + "'", int18 == 10715427);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(localDateTime40);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMillis(0);
        int int17 = localDateTime14.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.minusMonths(10535658);
        int int20 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime14);
        java.util.Locale locale21 = null;
        int int22 = property9.getMaximumTextLength(locale21);
        int int23 = property9.getMinimumValueOverall();
        org.joda.time.LocalDateTime localDateTime24 = property9.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = property4.getDifference(readableInstant5);
        long long7 = property4.remainder();
        java.lang.String str8 = property4.getAsShortText();
        org.joda.time.DurationField durationField9 = property4.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime10 = property4.getLocalDateTime();
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 10474974, chronology11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 46, chronology11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusDays(1);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.minus(readableDuration21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        java.util.Date date25 = localDateTime24.toDate();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        int int31 = localDateTime24.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime24.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant37 = null;
        long long38 = property36.getDifferenceAsLong(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(100L);
        int int47 = localDateTime46.getSecondOfMinute();
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime();
        long long49 = property44.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        long long50 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.LocalDateTime localDateTime51 = property36.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime52 = property36.withMaximumValue();
        int int53 = localDateTime33.compareTo((org.joda.time.ReadablePartial) localDateTime52);
        int int54 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime52);
        boolean boolean55 = localDateTime13.isAfter((org.joda.time.ReadablePartial) localDateTime52);
        org.joda.time.DateTimeField[] dateTimeFieldArray56 = localDateTime13.getFields();
        org.joda.time.LocalDateTime.Property property57 = localDateTime13.dayOfYear();
        org.joda.time.LocalDateTime localDateTime59 = property57.addToCopy(910);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.minus(readablePeriod61);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime60.plusSeconds(407);
        int int65 = localDateTime60.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(dateTimeZone66);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime69 = property68.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime70 = property68.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(dateTimeZone73);
        java.util.Date date75 = localDateTime74.toDate();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime(dateTimeZone76);
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime77.withYearOfCentury(1);
        int int81 = localDateTime74.compareTo((org.joda.time.ReadablePartial) localDateTime77);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime77.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime72.withFields((org.joda.time.ReadablePartial) localDateTime77);
        org.joda.time.DateTimeZone dateTimeZone85 = null;
        org.joda.time.LocalDateTime localDateTime86 = new org.joda.time.LocalDateTime(dateTimeZone85);
        org.joda.time.LocalDateTime.Property property87 = localDateTime86.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime88 = property87.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime90 = localDateTime88.plusSeconds((int) (byte) 100);
        int int91 = localDateTime88.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property92 = localDateTime88.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType93 = property92.getFieldType();
        boolean boolean94 = localDateTime77.isSupported(dateTimeFieldType93);
        int int95 = localDateTime60.get(dateTimeFieldType93);
        org.joda.time.LocalDateTime localDateTime97 = localDateTime59.withField(dateTimeFieldType93, 757);
        org.joda.time.LocalDateTime localDateTime99 = localDateTime97.withYear(9);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "610" + "'", str8, "610");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Wed Nov 25 02:58:44 UTC 2020");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 11651L + "'", long49 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1606273124510L + "'", long50 == 1606273124510L);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 610 + "'", int65 == 610);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(date75);
// flaky:         org.junit.Assert.assertEquals(date75.toString(), "Wed Nov 25 02:58:44 UTC 2020");
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(localDateTime80);
// flaky:         org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertNotNull(localDateTime84);
        org.junit.Assert.assertNotNull(property87);
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertNotNull(localDateTime90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(property92);
        org.junit.Assert.assertNotNull(dateTimeFieldType93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 2020 + "'", int95 == 2020);
        org.junit.Assert.assertNotNull(localDateTime97);
        org.junit.Assert.assertNotNull(localDateTime99);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusSeconds((int) (byte) 100);
        int int17 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime10.withField(dateTimeFieldType19, 10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusHours(747);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(100L);
        int int34 = localDateTime33.getSecondOfMinute();
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime();
        long long36 = property31.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDateTime localDateTime37 = property31.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusDays(10);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withMonthOfYear(4);
        int int42 = localDateTime21.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property45 = localDateTime41.dayOfYear();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:44 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 11651L + "'", long36 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        boolean boolean12 = localDateTime10.isBefore((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.yearOfEra();
        int int16 = property15.get();
        org.joda.time.LocalDateTime localDateTime18 = property15.addToCopy(407);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusWeeks(100);
        int int21 = property3.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.minus(readablePeriod27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.minusMillis(0);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.era();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(100L);
        boolean boolean50 = localDateTime44.isAfter((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime44.minusWeeks((int) (short) 1);
        boolean boolean53 = localDateTime38.isBefore((org.joda.time.ReadablePartial) localDateTime44);
        boolean boolean54 = localDateTime28.isEqual((org.joda.time.ReadablePartial) localDateTime44);
        int int55 = localDateTime28.getCenturyOfEra();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = localDateTime28.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(100L);
        int int65 = localDateTime64.getSecondOfMinute();
        org.joda.time.DateTime dateTime66 = localDateTime64.toDateTime();
        long long67 = property62.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(dateTimeZone68);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant71 = null;
        long long72 = property70.getDifferenceAsLong(readableInstant71);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(dateTimeZone73);
        org.joda.time.LocalDateTime.Property property75 = localDateTime74.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime77 = localDateTime74.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(100L);
        int int81 = localDateTime80.getSecondOfMinute();
        org.joda.time.DateTime dateTime82 = localDateTime80.toDateTime();
        long long83 = property78.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime82);
        long long84 = property70.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime82);
        int int85 = property62.compareTo((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.DateTime dateTime86 = localDateTime28.toDateTime((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.DateTime dateTime87 = localDateTime20.toDateTime((org.joda.time.ReadableInstant) dateTime82);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:45 UTC 2020");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2020 + "'", int16 == 2020);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(localDateTime52);
// flaky:         org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 20 + "'", int55 == 20);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 11651L + "'", long67 == 11651L);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 11651L + "'", long83 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1606273124978L + "'", long84 == 1606273124978L);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertNotNull(dateTime87);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2001-11-25T02:58:21.361");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property5.getAsText(locale12);
        org.joda.time.LocalDateTime localDateTime15 = property5.addToCopy(335);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(100L);
        int int24 = localDateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime();
        long long26 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalDateTime localDateTime27 = property21.roundCeilingCopy();
        java.util.Locale locale28 = null;
        java.lang.String str29 = property21.getAsText(locale28);
        org.joda.time.LocalDateTime localDateTime31 = property21.addWrapFieldToCopy(1);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime15, chronology32);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology32);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sunday" + "'", str13, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 11651L + "'", long26 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Sunday" + "'", str29, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property19 = localDateTime11.hourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        java.util.Date date23 = localDateTime22.toDate();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.fromDateFields(date23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime29 = property27.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        java.util.Date date34 = localDateTime33.toDate();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withYearOfCentury(1);
        int int40 = localDateTime33.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime31.withFields((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime47 = property46.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.plusSeconds((int) (byte) 100);
        int int50 = localDateTime47.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property51 = localDateTime47.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property51.getFieldType();
        boolean boolean53 = localDateTime36.isSupported(dateTimeFieldType52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime24.withField(dateTimeFieldType52, 747);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime20.withField(dateTimeFieldType52, 323);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime59 = localDateTime57.withMinuteOfHour(10715233);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10715233 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:45 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed Nov 25 02:58:45 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Wed Nov 25 02:58:45 UTC 2020");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        int int4 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) 10451787);
        int int8 = localDateTime7.getWeekyear();
        java.lang.String str9 = localDateTime7.toString();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2040 + "'", int8 == 2040);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2040-10-09T07:25:45.638" + "'", str9, "2040-10-09T07:25:45.638");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.era();
        int[] intArray9 = localDateTime7.getValues();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minus(readableDuration10);
        int int12 = localDateTime11.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2001, 11, 25, 10725705]");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 3, 0, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusDays((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime15);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        boolean boolean18 = localDateTime15.isSupported(durationFieldType17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusMonths((-1));
        boolean boolean21 = localDateTime5.isAfter((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plusYears(741);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 'a');
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withWeekyear(564);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusMinutes((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant12 = null;
        long long13 = property11.getDifferenceAsLong(readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        long long24 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        long long25 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        int int27 = localDateTime8.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime8.withDayOfWeek(3);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.secondOfMinute();
        java.lang.String str35 = property34.getAsString();
        org.joda.time.DurationField durationField36 = property34.getDurationField();
        org.joda.time.LocalDateTime localDateTime37 = property34.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusMonths(407);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withDurationAdded(readableDuration41, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plus(readablePeriod44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.plusWeeks(19);
        boolean boolean48 = property30.equals((java.lang.Object) 19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 11651L + "'", long24 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1606273125723L + "'", long25 == 1606273125723L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25 + "'", int27 == 25);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "45" + "'", str35, "45");
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfEvenCopy();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property9.getAsShortText(locale11);
        org.joda.time.LocalDateTime localDateTime14 = property9.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime15 = property9.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = property9.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020" + "'", str12, "2020");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusSeconds(488);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.era();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime16.minusMinutes((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant27 = null;
        long long28 = property26.getDifferenceAsLong(readableInstant27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(100L);
        int int37 = localDateTime36.getSecondOfMinute();
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime();
        long long39 = property34.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime38);
        long long40 = property26.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime41 = localDateTime23.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        int int42 = localDateTime23.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime23.withDayOfWeek(3);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime48 = property47.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime49 = property47.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        java.util.Date date52 = localDateTime51.toDate();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withYearOfCentury(1);
        int int58 = localDateTime51.compareTo((org.joda.time.ReadablePartial) localDateTime54);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime54.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(dateTimeZone61);
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime64 = property63.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.plusSeconds((int) (byte) 100);
        int int67 = localDateTime64.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property68 = localDateTime64.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property68.getFieldType();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime60.withField(dateTimeFieldType69, 10);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime49.withField(dateTimeFieldType69, 214);
        boolean boolean74 = localDateTime44.isSupported(dateTimeFieldType69);
        int int75 = localDateTime12.get(dateTimeFieldType69);
        boolean boolean76 = localDateTime7.isSupported(dateTimeFieldType69);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime7.plusMinutes(590);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(chronology79);
        int int81 = localDateTime80.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property82 = localDateTime80.hourOfDay();
        org.joda.time.LocalDateTime localDateTime84 = localDateTime80.withYearOfCentury(11);
        int int85 = localDateTime80.getMillisOfSecond();
        boolean boolean86 = localDateTime78.equals((java.lang.Object) int85);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime78.withEra((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime90 = localDateTime88.withMinuteOfHour(10474974);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10474974 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 11651L + "'", long39 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1606273125836L + "'", long40 == 1606273125836L);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 25 + "'", int42 == 25);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(date52);
// flaky:         org.junit.Assert.assertEquals(date52.toString(), "Wed Nov 25 02:58:45 UTC 2020");
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDateTime57);
// flaky:         org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2020 + "'", int75 == 2020);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(localDateTime78);
// flaky:         org.junit.Assert.assertTrue("'" + int81 + "' != '" + 10725937 + "'", int81 == 10725937);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(localDateTime84);
// flaky:         org.junit.Assert.assertTrue("'" + int85 + "' != '" + 937 + "'", int85 == 937);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(localDateTime88);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        int int12 = property11.get();
        org.joda.time.LocalDateTime localDateTime14 = property11.addToCopy(407);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withDayOfMonth(20);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.hourOfDay();
        java.util.Locale locale19 = null;
        int int20 = property18.getMaximumShortTextLength(locale19);
        boolean boolean21 = property18.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusDays(37);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusHours(35);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.minusMillis(206);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.plusMonths((-292275054));
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime9);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plusSeconds(294);
        int int16 = localDateTime15.getDayOfWeek();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.Interval interval5 = property2.toInterval();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfFloorCopy();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, 35);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusHours(154);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "46" + "'", str3, "46");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(407);
        int int5 = localDateTime0.getMillisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.minus(readablePeriod6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMonthOfYear(293);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 293 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 446 + "'", int5 == 446);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(100L);
        int int5 = localDateTime4.getSecondOfMinute();
        org.joda.time.DateTime dateTime6 = localDateTime4.toDateTime();
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime8 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime.Property property9 = localDateTime2.hourOfDay();
        int int10 = property9.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 23 + "'", int10 == 23);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property19 = localDateTime11.hourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundHalfEvenCopy();
        int int21 = localDateTime20.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.hourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:46 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(10, 970, 305, 854, 196, 657);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 854 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property5.getDifference(readableInstant6);
        long long8 = property5.remainder();
        java.lang.String str9 = property5.getAsShortText();
        org.joda.time.DurationField durationField10 = property5.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime11 = property5.getLocalDateTime();
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 10474974, chronology12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 46, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) "124", chronology12);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withYearOfEra(488);
        boolean boolean20 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.minus(readablePeriod21);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "733" + "'", str9, "733");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant4 = null;
        long long5 = property3.getDifferenceAsLong(readableInstant4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(100L);
        int int14 = localDateTime13.getSecondOfMinute();
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime();
        long long16 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        long long17 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalDateTime localDateTime18 = property3.roundHalfFloorCopy();
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 0, chronology19);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(chronology19);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy((long) 39);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 11651L + "'", long16 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1606273126775L + "'", long17 == 1606273126775L);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        int int7 = localDateTime6.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYear(2020);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.plusDays(11);
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localDateTime6.toString("2020-11-25T02:54:50.000", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy(1606272851557L);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.year();
        int int15 = property14.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime16 = property14.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        java.util.Date date19 = localDateTime18.toDate();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfCentury(1);
        int int25 = localDateTime18.compareTo((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusSeconds((int) (byte) 100);
        int int34 = localDateTime31.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property35 = localDateTime31.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property35.getFieldType();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime27.withField(dateTimeFieldType36, 10);
        org.joda.time.LocalDateTime.Property property39 = localDateTime16.property(dateTimeFieldType36);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime9.withField(dateTimeFieldType36, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusMillis(544);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "24" + "'", str6, "24");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Wed Nov 25 02:58:47 UTC 2020");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime9);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = localDateTime9.isSupported(durationFieldType11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusMonths((-1));
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusSeconds(54);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.secondOfMinute();
        java.lang.String str18 = property17.getAsShortText();
        java.lang.String str19 = property17.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "47" + "'", str18, "47");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "47" + "'", str19, "47");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        int int7 = localDateTime1.getMonthOfYear();
        int int8 = localDateTime1.getDayOfWeek();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readableDuration9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime1.withDurationAdded(readableDuration11, 29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMonthOfYear(335);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 335 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy(1606272851557L);
        org.joda.time.LocalDateTime localDateTime10 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusYears(1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.minusMillis(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = null;
        java.lang.String str23 = localDateTime21.toString(dateTimeFormatter22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusMinutes(401);
        int int26 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        int int27 = localDateTime25.getYear();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withMillisOfDay(40);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "250" + "'", str6, "250");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2020-11-25T02:58:47.250" + "'", str23, "2020-11-25T02:58:47.250");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2020 + "'", int27 == 2020);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withMillisOfDay(239);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.minus(readablePeriod18);
        int int20 = localDateTime14.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime29 = localDateTime22.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime34 = property32.addToCopy(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property32.getFieldType();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime22.withField(dateTimeFieldType35, 20);
        boolean boolean38 = localDateTime14.isSupported(dateTimeFieldType35);
        boolean boolean39 = localDateTime12.isSupported(dateTimeFieldType35);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime12.plus(readablePeriod40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime43 = localDateTime12.withMinuteOfHour(688);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 688 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(localDateTime41);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) 'a');
        java.lang.String str6 = localDateTime5.toString();
        java.lang.String str7 = localDateTime5.toString();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusDays(41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withHourOfDay(395);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 395 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "47" + "'", str3, "47");
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T03:00:24.377" + "'", str6, "2020-11-25T03:00:24.377");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2020-11-25T03:00:24.377" + "'", str7, "2020-11-25T03:00:24.377");
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusSeconds(407);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(100L);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean18 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        boolean boolean19 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime12.plusWeeks(0);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(100L);
        int int24 = localDateTime23.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.era();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.minusHours(292278993);
        boolean boolean28 = localDateTime12.isEqual((org.joda.time.ReadablePartial) localDateTime23);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfEra(3);
        int int12 = localDateTime9.getYearOfEra();
        boolean boolean13 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusMillis(0);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.era();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.minusDays((int) 'a');
        java.lang.String str25 = localDateTime24.toString();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.plus(readableDuration26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withSecondOfMinute((int) (short) 0);
        java.lang.String str30 = localDateTime29.toString();
        int int31 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime.Property property32 = localDateTime29.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2001-08-20T02:58:47.581" + "'", str25, "2001-08-20T02:58:47.581");
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2001-08-20T02:58:00.581" + "'", str30, "2001-08-20T02:58:00.581");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(property32);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.secondOfMinute();
        org.joda.time.DurationField durationField10 = property9.getLeapDurationField();
        java.lang.String str11 = property9.toString();
        java.lang.String str12 = property9.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[secondOfMinute]" + "'", str11, "Property[secondOfMinute]");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "47" + "'", str12, "47");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMinutes(990);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.plusSeconds((-1));
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundCeilingCopy();
        int int21 = localDateTime20.getYear();
        boolean boolean22 = localDateTime16.isAfter((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = property25.roundCeilingCopy();
        java.util.Locale locale27 = null;
        int int28 = property25.getMaximumTextLength(locale27);
        int int29 = property25.getMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property25.getFieldType();
        int int31 = localDateTime16.get(dateTimeFieldType30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime7.property(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2020 + "'", int21 == 2020);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 758 + "'", int31 == 758);
        org.junit.Assert.assertNotNull(property32);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = property10.getDifference(readableInstant11);
        long long13 = property10.remainder();
        java.lang.String str14 = property10.getAsShortText();
        org.joda.time.DurationField durationField15 = property10.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime16 = property10.getLocalDateTime();
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 10474974, chronology17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.minuteOfHour();
        org.joda.time.Chronology chronology20 = localDateTime18.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(10718480, 648, 910, 23, 658, 97, 0, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 658 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "875" + "'", str14, "875");
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime8 = property2.getLocalDateTime();
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(chronology9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "938" + "'", str6, "938");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        int int7 = localDateTime1.getMonthOfYear();
        int int8 = localDateTime1.getDayOfWeek();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minus(readableDuration9);
        int int11 = localDateTime1.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property19 = localDateTime11.hourOfDay();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minus(readablePeriod27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.plusSeconds(407);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minus(readablePeriod32);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(100L);
        int int36 = localDateTime35.getSecondOfMinute();
        org.joda.time.DateTime dateTime37 = localDateTime35.toDateTime();
        org.joda.time.DateTime dateTime38 = localDateTime33.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        boolean boolean39 = localDateTime30.isAfter((org.joda.time.ReadablePartial) localDateTime33);
        boolean boolean40 = localDateTime25.isEqual((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime33.plusWeeks(0);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime33.minus(readableDuration43);
        boolean boolean45 = localDateTime20.equals((java.lang.Object) localDateTime33);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime20.withPeriodAdded(readablePeriod46, (int) (short) 100);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime20.plusDays(5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:48 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        boolean boolean10 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime4.minusWeeks((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant16 = null;
        long long17 = property15.getDifferenceAsLong(readableInstant16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(100L);
        int int26 = localDateTime25.getSecondOfMinute();
        org.joda.time.DateTime dateTime27 = localDateTime25.toDateTime();
        long long28 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        long long29 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.LocalDateTime localDateTime30 = property15.roundHalfFloorCopy();
        long long31 = property15.remainder();
        org.joda.time.LocalDateTime localDateTime33 = property15.setCopy(19);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property15.getFieldType();
        boolean boolean35 = localDateTime4.equals((java.lang.Object) property15);
        org.joda.time.DurationField durationField36 = property15.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 11651L + "'", long28 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1606273128190L + "'", long29 == 1606273128190L);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(durationField36);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.centuryOfEra();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property5.setCopy("2020-11-25T02:55:38.442");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-11-25T02:55:38.442\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 330);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localDateTime15.isSupported(durationFieldType16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.minus(readablePeriod25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.minusMillis(0);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.era();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(100L);
        boolean boolean48 = localDateTime42.isAfter((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime42.minusWeeks((int) (short) 1);
        boolean boolean51 = localDateTime36.isBefore((org.joda.time.ReadablePartial) localDateTime42);
        boolean boolean52 = localDateTime26.isEqual((org.joda.time.ReadablePartial) localDateTime42);
        int int53 = localDateTime26.getCenturyOfEra();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray54 = localDateTime26.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(100L);
        int int63 = localDateTime62.getSecondOfMinute();
        org.joda.time.DateTime dateTime64 = localDateTime62.toDateTime();
        long long65 = property60.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(dateTimeZone66);
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant69 = null;
        long long70 = property68.getDifferenceAsLong(readableInstant69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(dateTimeZone71);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime(100L);
        int int79 = localDateTime78.getSecondOfMinute();
        org.joda.time.DateTime dateTime80 = localDateTime78.toDateTime();
        long long81 = property76.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime80);
        long long82 = property68.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime80);
        int int83 = property60.compareTo((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.DateTime dateTime84 = localDateTime26.toDateTime((org.joda.time.ReadableInstant) dateTime80);
        int int85 = property18.compareTo((org.joda.time.ReadableInstant) dateTime84);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(localDateTime50);
// flaky:         org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 20 + "'", int53 == 20);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray54);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 11651L + "'", long65 == 11651L);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 11651L + "'", long81 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1606273128286L + "'", long82 == 1606273128286L);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.Interval interval7 = property2.toInterval();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime9.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withCenturyOfEra(0);
        int int23 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime.Property property24 = localDateTime9.monthOfYear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant33 = null;
        long long34 = property32.getDifferenceAsLong(readableInstant33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(100L);
        int int43 = localDateTime42.getSecondOfMinute();
        org.joda.time.DateTime dateTime44 = localDateTime42.toDateTime();
        long long45 = property40.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime44);
        long long46 = property32.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime44);
        int int47 = property29.compareTo((org.joda.time.ReadableInstant) dateTime44);
        int int48 = property24.getDifference((org.joda.time.ReadableInstant) dateTime44);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = property2.getDifference((org.joda.time.ReadableInstant) dateTime44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1606273128509");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "609" + "'", str6, "609");
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 58 + "'", int15 == 58);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 11651L + "'", long45 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1606273128509L + "'", long46 == 1606273128509L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 610 + "'", int48 == 610);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsShortText(locale5);
        org.joda.time.DurationField durationField7 = property2.getLeapDurationField();
        java.lang.String str8 = property2.getAsShortText();
        org.joda.time.LocalDateTime localDateTime9 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.secondOfMinute();
        int int11 = property10.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "697" + "'", str6, "697");
        org.junit.Assert.assertNull(durationField7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "697" + "'", str8, "697");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusSeconds((int) (byte) 100);
        int int17 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime10.withField(dateTimeFieldType19, 10);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusHours(747);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withDayOfWeek((int) (byte) 1);
        int int26 = localDateTime25.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withYear(4);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(100L);
        int int31 = localDateTime30.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withMinuteOfHour(59);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.withFields((org.joda.time.ReadablePartial) localDateTime33);
        java.lang.String str35 = localDateTime28.toString();
        org.joda.time.LocalDateTime.Property property36 = localDateTime28.weekOfWeekyear();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:48 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 48 + "'", int26 == 48);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0004-11-29T02:58:48.738" + "'", str35, "0004-11-29T02:58:48.738");
        org.junit.Assert.assertNotNull(property36);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withHourOfDay(0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = localDateTime6.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(610);
        int int11 = localDateTime6.getYear();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.plus(readablePeriod12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime();
        boolean boolean22 = localDateTime20.isBefore((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        java.util.Date date25 = localDateTime24.toDate();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.fromDateFields(date25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusMonths(490);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        java.util.Date date31 = localDateTime30.toDate();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withYearOfCentury(1);
        int int37 = localDateTime30.compareTo((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusSeconds((int) (byte) 100);
        int int46 = localDateTime43.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property47 = localDateTime43.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property47.getFieldType();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime39.withField(dateTimeFieldType48, 10);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime28.withField(dateTimeFieldType48, 0);
        boolean boolean53 = localDateTime21.isSupported(dateTimeFieldType48);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime6.withField(dateTimeFieldType48, 174);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Wed Nov 25 02:58:48 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed Nov 25 02:58:48 UTC 2020");
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(localDateTime55);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy(1606272851557L);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = localDateTime9.getField(10539880);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10539880");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "264" + "'", str6, "264");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        int int12 = localDateTime10.getDayOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfDay((int) '#');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withSecondOfMinute(10);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withYearOfEra(291);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withPeriodAdded(readablePeriod17, 40);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfDay((int) '#');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withSecondOfMinute(10);
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.weekOfWeekyear();
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property2.addToCopy(1606272851557L);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusYears(19);
        int int14 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(100L);
        int int24 = localDateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime();
        long long26 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalDateTime localDateTime27 = property21.roundCeilingCopy();
        java.util.Locale locale28 = null;
        java.lang.String str29 = property21.getAsText(locale28);
        org.joda.time.LocalDateTime localDateTime31 = property21.addWrapFieldToCopy(1);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 2, chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant37 = null;
        long long38 = property36.getDifferenceAsLong(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(100L);
        int int47 = localDateTime46.getSecondOfMinute();
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime();
        long long49 = property44.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        long long50 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.LocalDateTime localDateTime51 = property36.roundHalfFloorCopy();
        org.joda.time.Chronology chronology52 = localDateTime51.getChronology();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime33, chronology52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime33.plusMillis(747);
        boolean boolean56 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.minusWeeks(10535658);
        org.joda.time.LocalDateTime.Property property59 = localDateTime55.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "539" + "'", str6, "539");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 11651L + "'", long26 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Sunday" + "'", str29, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 11651L + "'", long49 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1606273129439L + "'", long50 == 1606273129439L);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(property59);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay(100);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.secondOfMinute();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.era();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.minusMinutes((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant25 = null;
        long long26 = property24.getDifferenceAsLong(readableInstant25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(100L);
        int int35 = localDateTime34.getSecondOfMinute();
        org.joda.time.DateTime dateTime36 = localDateTime34.toDateTime();
        long long37 = property32.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        long long38 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime39 = localDateTime21.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        int int40 = localDateTime21.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime21.withDayOfWeek(3);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime46 = property45.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime47 = property45.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        java.util.Date date50 = localDateTime49.toDate();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.withYearOfCentury(1);
        int int56 = localDateTime49.compareTo((org.joda.time.ReadablePartial) localDateTime52);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime52.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone59);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime62 = property61.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.plusSeconds((int) (byte) 100);
        int int65 = localDateTime62.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property66 = localDateTime62.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = property66.getFieldType();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime58.withField(dateTimeFieldType67, 10);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime47.withField(dateTimeFieldType67, 214);
        boolean boolean72 = localDateTime42.isSupported(dateTimeFieldType67);
        int int73 = localDateTime10.get(dateTimeFieldType67);
        int int74 = localDateTime7.get(dateTimeFieldType67);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 11651L + "'", long37 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1606273129611L + "'", long38 == 1606273129611L);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 25 + "'", int40 == 25);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(date50);
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Wed Nov 25 02:58:49 UTC 2020");
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2020 + "'", int73 == 2020);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2001 + "'", int74 == 2001);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        long long15 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DurationField durationField16 = property2.getDurationField();
        int int17 = property2.get();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.minus(readablePeriod23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusYears((int) (short) 100);
        int int27 = localDateTime26.getYearOfEra();
        int int28 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.plus(readableDuration29);
        java.util.Locale locale32 = null;
        java.lang.String str33 = localDateTime26.toString("461", locale32);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(durationField16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 962 + "'", int17 == 962);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2120 + "'", int27 == 2120);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "461" + "'", str33, "461");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        java.lang.String str10 = localDateTime7.toString();
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.era();
        org.joda.time.DurationField durationField12 = property11.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime13 = property11.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = property14.addWrapFieldToCopy(403);
        org.joda.time.LocalDateTime localDateTime17 = property14.withMaximumValue();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.weekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2001-11-25T02:58:50.032" + "'", str10, "2001-11-25T02:58:50.032");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.Interval interval7 = property2.toInterval();
        java.lang.String str8 = property2.getAsShortText();
        int int9 = property2.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime10 = property2.roundHalfFloorCopy();
        java.lang.String str11 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime12 = property2.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withEra(0);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withDurationAdded(readableDuration15, 365);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "62" + "'", str6, "62");
        org.junit.Assert.assertNotNull(interval7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "62" + "'", str8, "62");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "62" + "'", str11, "62");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusSeconds((-1));
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.plusMinutes(3);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMonths(3);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withYearOfCentury(82);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        java.lang.String str10 = localDateTime7.toString();
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.era();
        org.joda.time.DurationField durationField12 = property11.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime13 = property11.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withWeekOfWeekyear(787);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 787 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2001-11-25T02:58:50.147" + "'", str10, "2001-11-25T02:58:50.147");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        boolean boolean12 = localDateTime10.isBefore((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.yearOfEra();
        int int16 = property15.get();
        org.joda.time.LocalDateTime localDateTime18 = property15.addToCopy(407);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusWeeks(100);
        int int21 = property3.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime22 = property3.roundHalfCeilingCopy();
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.plus(readablePeriod24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusSeconds((int) (byte) 100);
        int int32 = localDateTime29.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property33 = localDateTime29.weekyear();
        long long34 = property33.remainder();
        org.joda.time.LocalDateTime localDateTime35 = property33.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withYearOfEra(10441389);
        boolean boolean38 = localDateTime22.isBefore((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant43 = null;
        int int44 = property42.getDifference(readableInstant43);
        long long45 = property42.remainder();
        java.lang.String str46 = property42.getAsShortText();
        org.joda.time.DurationField durationField47 = property42.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime48 = property42.getLocalDateTime();
        org.joda.time.Chronology chronology49 = localDateTime48.getChronology();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) 10474974, chronology49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.minuteOfHour();
        org.joda.time.Chronology chronology52 = localDateTime50.getChronology();
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now(chronology52);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(dateTimeZone54);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant57 = null;
        int int58 = property56.getDifference(readableInstant57);
        long long59 = property56.remainder();
        org.joda.time.LocalDateTime localDateTime60 = property56.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.plusMonths(100);
        int int63 = localDateTime62.size();
        java.lang.String str64 = localDateTime62.toString();
        org.joda.time.LocalDateTime localDateTime66 = localDateTime62.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalDateTime localDateTime68 = new org.joda.time.LocalDateTime(dateTimeZone67);
        java.util.Date date69 = localDateTime68.toDate();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(dateTimeZone70);
        org.joda.time.LocalDateTime.Property property72 = localDateTime71.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime71.withYearOfCentury(1);
        int int75 = localDateTime68.compareTo((org.joda.time.ReadablePartial) localDateTime71);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime71.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime(dateTimeZone78);
        org.joda.time.LocalDateTime.Property property80 = localDateTime79.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime81 = property80.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime81.plusSeconds((int) (byte) 100);
        int int84 = localDateTime81.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property85 = localDateTime81.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = property85.getFieldType();
        org.joda.time.LocalDateTime localDateTime88 = localDateTime77.withField(dateTimeFieldType86, 10);
        org.joda.time.LocalDateTime.Property property89 = localDateTime66.property(dateTimeFieldType86);
        org.joda.time.LocalDateTime localDateTime91 = localDateTime53.withField(dateTimeFieldType86, 488);
        boolean boolean92 = localDateTime22.isSupported(dateTimeFieldType86);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:50 UTC 2020");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2020 + "'", int16 == 2020);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(property33);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 28609131000L + "'", long34 == 28609131000L);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "185" + "'", str46, "185");
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property56);
// flaky:         org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "2029-03-25T02:58:50.185" + "'", str64, "2029-03-25T02:58:50.185");
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(date69);
// flaky:         org.junit.Assert.assertEquals(date69.toString(), "Wed Nov 25 02:58:50 UTC 2020");
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(localDateTime74);
// flaky:         org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(localDateTime77);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(dateTimeFieldType86);
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(localDateTime91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusYears(407);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusSeconds((int) (byte) 100);
        int int13 = localDateTime12.getYearOfEra();
        boolean boolean14 = localDateTime6.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        int int15 = localDateTime6.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime6.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minus(readablePeriod18);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        org.joda.time.DateTime dateTime24 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime25 = localDateTime19.toDateTime();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withMillisOfDay((int) (byte) 10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2020 + "'", int13 == 2020);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy((long) 'a');
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.yearOfCentury();
        int int8 = property7.get();
        org.joda.time.LocalDateTime localDateTime9 = property7.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        boolean boolean18 = localDateTime16.isBefore((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = localDateTime16.getField(0);
        boolean boolean25 = localDateTime16.equals((java.lang.Object) "317");
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        java.util.Date date28 = localDateTime27.toDate();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        java.util.Date date31 = localDateTime30.toDate();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.fromDateFields(date31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime37 = property35.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        java.util.Date date42 = localDateTime41.toDate();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.withYearOfCentury(1);
        int int48 = localDateTime41.compareTo((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime44.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime39.withFields((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime55 = property54.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusSeconds((int) (byte) 100);
        int int58 = localDateTime55.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property59 = localDateTime55.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property59.getFieldType();
        boolean boolean61 = localDateTime44.isSupported(dateTimeFieldType60);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime32.withField(dateTimeFieldType60, 747);
        org.joda.time.LocalDateTime.Property property64 = localDateTime27.property(dateTimeFieldType60);
        int int65 = localDateTime16.get(dateTimeFieldType60);
        int int66 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "50" + "'", str3, "50");
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2020-11-25T03:00:27.543" + "'", str6, "2020-11-25T03:00:27.543");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Wed Nov 25 02:58:50 UTC 2020");
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Wed Nov 25 02:58:50 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Wed Nov 25 02:58:50 UTC 2020");
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2020 + "'", int65 == 2020);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfEvenCopy();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property9.getAsShortText(locale11);
        org.joda.time.LocalDateTime localDateTime14 = property9.addWrapFieldToCopy((int) (byte) -1);
        java.util.Locale locale15 = null;
        int int16 = property9.getMaximumShortTextLength(locale15);
        java.util.Locale locale17 = null;
        java.lang.String str18 = property9.getAsShortText(locale17);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020" + "'", str12, "2020");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020" + "'", str18, "2020");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.minusMonths(407);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withDurationAdded(readableDuration9, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plusWeeks(19);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.year();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusMonths(10593622);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "50" + "'", str3, "50");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = localDateTime6.getField(0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.plusYears(401);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withPeriodAdded(readablePeriod17, 100);
        org.joda.time.LocalDateTime.Property property20 = localDateTime1.yearOfEra();
        java.util.Locale locale21 = null;
        int int22 = property20.getMaximumTextLength(locale21);
        org.joda.time.LocalDateTime localDateTime23 = property20.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        boolean boolean12 = localDateTime10.isBefore((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.yearOfEra();
        int int16 = property15.get();
        org.joda.time.LocalDateTime localDateTime18 = property15.addToCopy(407);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusWeeks(100);
        int int21 = property3.compareTo((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime22 = property3.roundHalfCeilingCopy();
        int int23 = localDateTime22.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYearOfEra(701);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = null;
        java.lang.String str27 = localDateTime22.toString(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:50 UTC 2020");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2020 + "'", int16 == 2020);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(localDateTime25);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2020-11-25T02:58:50.887" + "'", str27, "2020-11-25T02:58:50.887");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromDateFields(date2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMonths(490);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.plusMinutes(330);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = property10.getDifference(readableInstant11);
        long long13 = property10.remainder();
        org.joda.time.LocalDateTime localDateTime14 = property10.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusMonths(100);
        int int17 = localDateTime16.size();
        java.lang.String str18 = localDateTime16.toString();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        java.util.Date date23 = localDateTime22.toDate();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withYearOfCentury(1);
        int int29 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime35 = property34.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusSeconds((int) (byte) 100);
        int int38 = localDateTime35.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property39 = localDateTime35.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property39.getFieldType();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime31.withField(dateTimeFieldType40, 10);
        org.joda.time.LocalDateTime.Property property43 = localDateTime20.property(dateTimeFieldType40);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime7.withField(dateTimeFieldType40, 10535658);
        java.lang.String str46 = localDateTime7.toString();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime7.minusWeeks(83);
        int int49 = localDateTime48.getYear();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:51 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2029-03-25T02:58:51.079" + "'", str18, "2029-03-25T02:58:51.079");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed Nov 25 02:58:51 UTC 2020");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime45);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "2020-11-25T08:28:51.079" + "'", str46, "2020-11-25T08:28:51.079");
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2019 + "'", int49 == 2019);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 330);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localDateTime15.isSupported(durationFieldType16);
        int[] intArray18 = localDateTime15.getValues();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusWeeks((int) (short) 0);
        int int21 = localDateTime15.getYear();
        int int22 = localDateTime15.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[99, 12, 25, 10715203]");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.dayOfMonth();
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusMillis(10441389);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        java.lang.String str14 = property13.getAsString();
        org.joda.time.DurationField durationField15 = property13.getDurationField();
        org.joda.time.LocalDateTime localDateTime16 = property13.roundFloorCopy();
        boolean boolean17 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withDurationAdded(readableDuration18, 294);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "51" + "'", str14, "51");
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusSeconds((-1));
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusDays(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withYearOfEra(47);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withYear(105);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.secondOfMinute();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.era();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundCeilingCopy();
        java.lang.String str19 = property17.getAsShortText();
        org.joda.time.LocalDateTime localDateTime20 = property17.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime25 = property23.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        java.util.Date date30 = localDateTime29.toDate();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withYearOfCentury(1);
        int int36 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime27.withFields((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusSeconds((int) (byte) 100);
        int int46 = localDateTime43.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property47 = localDateTime43.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property47.getFieldType();
        boolean boolean49 = localDateTime32.isSupported(dateTimeFieldType48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime20.property(dateTimeFieldType48);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime11.withField(dateTimeFieldType48, 488);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime9.withField(dateTimeFieldType48, 513);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "421" + "'", str19, "421");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Wed Nov 25 02:58:51 UTC 2020");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 'a');
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusSeconds(10451787);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.secondOfMinute();
        java.util.Locale locale7 = null;
        java.lang.String str8 = localDateTime4.toString("24", locale7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusYears(174);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "24" + "'", str8, "24");
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(956, 10628330, 0, 10622834, 42, 86399999, 10531220);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10622834 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.lang.String str4 = property2.getAsShortText();
        boolean boolean5 = property2.isLeap();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalDateTime localDateTime8 = property2.withMinimumValue();
        org.joda.time.Interval interval9 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "736" + "'", str4, "736");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(interval9);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plus(readableDuration7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withHourOfDay(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withTime(35, 262, 10535658, 245);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property8.addWrapFieldToCopy((int) '4');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfDay((int) '#');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withSecondOfMinute(10);
        int int15 = localDateTime14.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromDateFields(date2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMonths(490);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusSeconds((int) 'a');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minusMillis(494);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:51 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        java.lang.String str10 = localDateTime7.toString();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plus(readableDuration11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDateTime12.toString("2020-11-25T02:56:42.129", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2001-11-25T02:58:51.813" + "'", str10, "2001-11-25T02:58:51.813");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusMinutes((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant12 = null;
        long long13 = property11.getDifferenceAsLong(readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        long long24 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        long long25 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        int int27 = localDateTime8.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime8.withDayOfWeek(3);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusMinutes((int) (short) 1);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.yearOfEra();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusWeeks(7);
        int int35 = localDateTime34.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime44.withCenturyOfEra(0);
        int int50 = localDateTime44.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime52.withCenturyOfEra(0);
        int int58 = localDateTime44.compareTo((org.joda.time.ReadablePartial) localDateTime52);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime42.withFields((org.joda.time.ReadablePartial) localDateTime52);
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(100L);
        int int62 = localDateTime61.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property63 = localDateTime61.era();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime52.withFields((org.joda.time.ReadablePartial) localDateTime61);
        boolean boolean65 = localDateTime34.isAfter((org.joda.time.ReadablePartial) localDateTime64);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 11651L + "'", long24 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1606273131746L + "'", long25 == 1606273131746L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25 + "'", int27 == 25);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20 + "'", int35 == 20);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 58 + "'", int50 == 58);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundCeilingCopy();
        java.util.Locale locale14 = null;
        int int15 = property12.getMaximumTextLength(locale14);
        int int16 = property12.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minus(readablePeriod18);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        org.joda.time.DateTime dateTime24 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        long long25 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime8.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant32 = null;
        long long33 = property31.getDifferenceAsLong(readableInstant32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(100L);
        int int42 = localDateTime41.getSecondOfMinute();
        org.joda.time.DateTime dateTime43 = localDateTime41.toDateTime();
        long long44 = property39.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime43);
        long long45 = property31.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.LocalDateTime localDateTime46 = property31.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime47 = property31.withMaximumValue();
        boolean boolean48 = localDateTime28.isBefore((org.joda.time.ReadablePartial) localDateTime47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime28.minusYears(0);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.yearOfCentury();
        org.joda.time.LocalDateTime.Property property52 = localDateTime50.year();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 11651L + "'", long44 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1606273131903L + "'", long45 == 1606273131903L);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(property52);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.Interval interval7 = property2.toInterval();
        org.joda.time.LocalDateTime localDateTime8 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 3, 0, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusDays((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime24);
        org.joda.time.DurationFieldType durationFieldType26 = null;
        boolean boolean27 = localDateTime24.isSupported(durationFieldType26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.plusMonths((-1));
        boolean boolean30 = localDateTime14.isAfter((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.plusYears(741);
        boolean boolean33 = localDateTime8.isEqual((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.minusYears(23);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "83" + "'", str6, "83");
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(chronology36);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = property2.addToCopy((int) (short) 100);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.era();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusDays((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusSeconds((int) (byte) 100);
        int int17 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        org.joda.time.LocalDateTime.Property property21 = localDateTime7.property(dateTimeFieldType20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.minusMillis(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = null;
        java.lang.String str32 = localDateTime30.toString(dateTimeFormatter31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = null;
        java.lang.String str34 = localDateTime30.toString(dateTimeFormatter33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.minus(readablePeriod35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime30.withPeriodAdded(readablePeriod37, 754);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plus(readableDuration40);
        java.lang.String str43 = localDateTime41.toString("474");
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime45.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime45.plusSeconds((-1));
        org.joda.time.LocalDateTime localDateTime54 = localDateTime45.plusMinutes(3);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(chronology55);
        int int57 = localDateTime56.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property58 = localDateTime56.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = localDateTime56.toDateTime(dateTimeZone59);
        org.joda.time.DateTime dateTime61 = localDateTime45.toDateTime((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime dateTime62 = localDateTime41.toDateTime((org.joda.time.ReadableInstant) dateTime61);
        int int63 = property21.getDifference((org.joda.time.ReadableInstant) dateTime62);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2020-11-25T02:58:52.136" + "'", str32, "2020-11-25T02:58:52.136");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2020-11-25T02:58:52.136" + "'", str34, "2020-11-25T02:58:52.136");
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "474" + "'", str43, "474");
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
// flaky:         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10732136 + "'", int57 == 10732136);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-19) + "'", int63 == (-19));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        int int4 = localDateTime1.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusSeconds((int) (byte) 100);
        int int7 = localDateTime1.getHourOfDay();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        java.lang.String str10 = localDateTime7.toString();
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.era();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.year();
        int int17 = property16.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime18 = property16.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        java.util.Date date21 = localDateTime20.toDate();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfCentury(1);
        int int27 = localDateTime20.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusSeconds((int) (byte) 100);
        int int36 = localDateTime33.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property37 = localDateTime33.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property37.getFieldType();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime29.withField(dateTimeFieldType38, 10);
        org.joda.time.LocalDateTime.Property property41 = localDateTime18.property(dateTimeFieldType38);
        boolean boolean42 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime18.minusWeeks(518);
        int int45 = localDateTime18.getWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2001-11-25T02:58:52.243" + "'", str10, "2001-11-25T02:58:52.243");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Wed Nov 25 02:58:52 UTC 2020");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2020 + "'", int45 == 2020);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = property3.getDifference(readableInstant4);
        long long6 = property3.remainder();
        java.lang.String str7 = property3.getAsShortText();
        org.joda.time.DurationField durationField8 = property3.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime9 = property3.getLocalDateTime();
        org.joda.time.Chronology chronology10 = localDateTime9.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 10474974, chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.minuteOfHour();
        org.joda.time.Chronology chronology13 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(chronology13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(chronology13);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "339" + "'", str7, "339");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfEvenCopy();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property9.getAsShortText(locale11);
        org.joda.time.LocalDateTime localDateTime14 = property9.addWrapFieldToCopy((int) (byte) -1);
        int int15 = property9.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020" + "'", str12, "2020");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292278993 + "'", int15 == 292278993);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusMillis(10441389);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        java.lang.String str14 = property13.getAsString();
        org.joda.time.DurationField durationField15 = property13.getDurationField();
        org.joda.time.LocalDateTime localDateTime16 = property13.roundFloorCopy();
        boolean boolean17 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime1.centuryOfEra();
        java.lang.String str19 = property18.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "52" + "'", str14, "52");
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "20" + "'", str19, "20");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusYears((int) (byte) 100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime6, chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        int int12 = localDateTime11.getDayOfYear();
        boolean boolean13 = property9.equals((java.lang.Object) int12);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfMonth();
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime();
        long long17 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean18 = property9.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 330 + "'", int12 == 330);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-62589600L) + "'", long17 == (-62589600L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.ReadablePartial readablePartial7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withFields(readablePartial7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusWeeks(31);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusHours(471);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime10.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusMillis(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = localDateTime8.toString(dateTimeFormatter9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = localDateTime8.toString(dateTimeFormatter11);
        java.lang.String str13 = localDateTime8.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusDays((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.plusMonths((-292275054));
        boolean boolean27 = localDateTime8.isEqual((org.joda.time.ReadablePartial) localDateTime23);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T02:58:52.488" + "'", str10, "2020-11-25T02:58:52.488");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2020-11-25T02:58:52.488" + "'", str12, "2020-11-25T02:58:52.488");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2020-11-25T02:58:52.488" + "'", str13, "2020-11-25T02:58:52.488");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime1.getFields();
        org.joda.time.LocalDateTime.Property property12 = localDateTime1.millisOfSecond();
        long long13 = property12.remainder();
        int int14 = property12.getMaximumValue();
        java.util.Locale locale15 = null;
        java.lang.String str16 = property12.getAsText(locale15);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:52 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 999 + "'", int14 == 999);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "519" + "'", str16, "519");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(100L);
        int int6 = localDateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime5);
        int int9 = localDateTime8.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.secondOfMinute();
        java.util.Date date11 = localDateTime8.toDate();
        int int12 = localDateTime8.getSecondOfMinute();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        int int9 = localDateTime8.size();
        java.lang.String str10 = localDateTime8.toString();
        int int11 = localDateTime8.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.millisOfSecond();
        java.util.Locale locale14 = null;
        org.joda.time.LocalDateTime localDateTime15 = property12.setCopy("42", locale14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2029-03-25T02:58:52.562" + "'", str10, "2029-03-25T02:58:52.562");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 58 + "'", int11 == 58);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        int int2 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekyear(9);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.dayOfYear();
        boolean boolean7 = property5.equals((java.lang.Object) '4');
        int int8 = property5.getMinimumValueOverall();
        int int9 = property5.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime11 = property5.setCopy(39);
        int int12 = property5.get();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 599 + "'", int2 == 599);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 366 + "'", int9 == 366);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 330 + "'", int12 == 330);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime.Property property17 = localDateTime1.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property17.getFieldType();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.DurationField durationField18 = property2.getDurationField();
        org.joda.time.DurationField durationField19 = property2.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273132568L + "'", long16 == 1606273132568L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        long long18 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime20 = property2.setCopy(19);
        java.lang.String str21 = property2.getName();
        org.joda.time.LocalDateTime localDateTime23 = property2.addWrapFieldToCopy(494);
        org.joda.time.LocalDateTime localDateTime24 = property2.getLocalDateTime();
        org.joda.time.DurationField durationField25 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273132606L + "'", long16 == 1606273132606L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "millisOfSecond" + "'", str21, "millisOfSecond");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNull(durationField25);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) 1, 20, 3, (int) (short) 10, 10, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(2019);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 'a');
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusSeconds(10451787);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusSeconds(407);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(100L);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean18 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        boolean boolean19 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime12.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime12.plus(readablePeriod22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfDay();
        org.joda.time.DurationField durationField25 = property24.getDurationField();
        org.joda.time.DurationField durationField26 = property24.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        java.lang.String str10 = localDateTime7.toString();
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.era();
        org.joda.time.DurationField durationField12 = property11.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime13 = property11.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = property17.getDifference(readableInstant18);
        long long20 = property17.remainder();
        java.lang.String str21 = property17.getAsShortText();
        org.joda.time.DurationField durationField22 = property17.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime24 = property17.addToCopy(1606272851557L);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.year();
        int int30 = property29.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime31 = property29.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        java.util.Date date34 = localDateTime33.toDate();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withYearOfCentury(1);
        int int40 = localDateTime33.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime46 = property45.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.plusSeconds((int) (byte) 100);
        int int49 = localDateTime46.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property50 = localDateTime46.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property50.getFieldType();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime42.withField(dateTimeFieldType51, 10);
        org.joda.time.LocalDateTime.Property property54 = localDateTime31.property(dateTimeFieldType51);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime24.withField(dateTimeFieldType51, (int) (byte) 100);
        boolean boolean57 = localDateTime13.isAfter((org.joda.time.ReadablePartial) localDateTime24);
        int int58 = localDateTime24.getWeekyear();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime24.withWeekyear(692);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.minusHours(58);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2001-11-25T02:58:52.954" + "'", str10, "2001-11-25T02:58:52.954");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "954" + "'", str21, "954");
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Wed Nov 25 02:58:52 UTC 2020");
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2071 + "'", int58 == 2071);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(localDateTime62);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(1606272852846L, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusSeconds((int) (byte) 100);
        int int21 = localDateTime18.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property22.getFieldType();
        int int24 = localDateTime14.indexOf(dateTimeFieldType23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime6.withField(dateTimeFieldType23, 490);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime6.minus(readablePeriod27);
        org.joda.time.DurationFieldType durationFieldType29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = localDateTime6.withFieldAdded(durationFieldType29, 2020);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withDurationAdded(readableDuration7, 359);
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, 330);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localDateTime15.isSupported(durationFieldType16);
        int int18 = localDateTime15.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.weekOfWeekyear();
        java.util.Locale locale20 = null;
        java.lang.String str21 = property19.getAsShortText(locale20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "52" + "'", str21, "52");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYearOfEra(3);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, (int) (short) 100);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withMillisOfDay(10535658);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(100L);
        int int23 = localDateTime22.getSecondOfMinute();
        org.joda.time.DateTime dateTime24 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime25 = localDateTime20.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = localDateTime20.toDateTime();
        org.joda.time.DateTime dateTime27 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        long long18 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime20 = property2.setCopy(19);
        java.lang.String str21 = property2.getName();
        org.joda.time.LocalDateTime localDateTime23 = property2.addWrapFieldToCopy(494);
        org.joda.time.LocalDateTime localDateTime24 = property2.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusDays(10690994);
        org.joda.time.DurationFieldType durationFieldType27 = null;
        boolean boolean28 = localDateTime26.isSupported(durationFieldType27);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273133357L + "'", long16 == 1606273133357L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "millisOfSecond" + "'", str21, "millisOfSecond");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withSecondOfMinute(46);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusYears((-1));
        int int11 = localDateTime10.getYearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusMillis(10441389);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.secondOfMinute();
        java.lang.String str14 = property13.getAsString();
        org.joda.time.DurationField durationField15 = property13.getDurationField();
        org.joda.time.LocalDateTime localDateTime16 = property13.roundFloorCopy();
        boolean boolean17 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        java.lang.String str18 = localDateTime16.toString();
        java.util.Date date19 = localDateTime16.toDate();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.fromDateFields(date19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.yearOfCentury();
        int int22 = localDateTime20.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "53" + "'", str14, "53");
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2020-11-25T02:58:53.000" + "'", str18, "2020-11-25T02:58:53.000");
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Wed Nov 25 02:58:53 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 58 + "'", int22 == 58);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.era();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusDays((int) 'a');
        java.lang.String str11 = localDateTime10.toString();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plus(readableDuration12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withTime(3, 709, 25810001, 10718480);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 709 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2001-08-20T02:58:53.706" + "'", str11, "2001-08-20T02:58:53.706");
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withSecondOfMinute(46);
        int int9 = localDateTime8.getMinuteOfHour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localDateTime8.toString(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 58 + "'", int9 == 58);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2020-11-25T02:58:46.747" + "'", str11, "2020-11-25T02:58:46.747");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(1606272852846L, chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusSeconds((int) (byte) 100);
        int int21 = localDateTime18.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property22.getFieldType();
        int int24 = localDateTime14.indexOf(dateTimeFieldType23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime6.withField(dateTimeFieldType23, 490);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime6.minus(readablePeriod27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime6.year();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime6.minusMillis(843);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = property18.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusWeeks(70);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273133834L + "'", long16 == 1606273133834L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2020-11-25T02:57:22.000");
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks(648);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = property4.getDifference(readableInstant5);
        long long7 = property4.remainder();
        java.lang.String str8 = property4.getAsShortText();
        org.joda.time.DurationField durationField9 = property4.getRangeDurationField();
        org.joda.time.LocalDateTime localDateTime10 = property4.getLocalDateTime();
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 10474974, chronology11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 46, chronology11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.plusDays(1);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.minus(readableDuration21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone23);
        java.util.Date date25 = localDateTime24.toDate();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        int int31 = localDateTime24.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime24.withMonthOfYear((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant37 = null;
        long long38 = property36.getDifferenceAsLong(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(100L);
        int int47 = localDateTime46.getSecondOfMinute();
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime();
        long long49 = property44.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        long long50 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.LocalDateTime localDateTime51 = property36.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime52 = property36.withMaximumValue();
        int int53 = localDateTime33.compareTo((org.joda.time.ReadablePartial) localDateTime52);
        int int54 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime52);
        boolean boolean55 = localDateTime13.isAfter((org.joda.time.ReadablePartial) localDateTime52);
        org.joda.time.DateTimeField[] dateTimeFieldArray56 = localDateTime13.getFields();
        org.joda.time.LocalDateTime.Property property57 = localDateTime13.dayOfYear();
        org.joda.time.DurationField durationField58 = property57.getRangeDurationField();
        int int59 = property57.getLeapAmount();
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "37" + "'", str8, "37");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Wed Nov 25 02:58:54 UTC 2020");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 11651L + "'", long49 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1606273133937L + "'", long50 == 1606273133937L);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = property10.getDifference(readableInstant11);
        long long13 = property10.remainder();
        java.lang.String str14 = property10.getAsShortText();
        org.joda.time.Interval interval15 = property10.toInterval();
        boolean boolean16 = property10.isLeap();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(100L);
        int int25 = localDateTime24.getSecondOfMinute();
        org.joda.time.DateTime dateTime26 = localDateTime24.toDateTime();
        long long27 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalDateTime localDateTime28 = property22.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minus(readablePeriod30);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(100L);
        int int34 = localDateTime33.getSecondOfMinute();
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime();
        org.joda.time.DateTime dateTime36 = localDateTime31.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        long long37 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        int int38 = property10.compareTo((org.joda.time.ReadableInstant) dateTime36);
        int int39 = property2.compareTo((org.joda.time.ReadableInstant) dateTime36);
        java.util.Locale locale40 = null;
        java.lang.String str41 = property2.getAsShortText(locale40);
        org.joda.time.LocalDateTime localDateTime43 = property2.addToCopy(0L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "129" + "'", str6, "129");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "129" + "'", str14, "129");
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 11651L + "'", long27 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-6940L) + "'", long37 == (-6940L));
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "129" + "'", str41, "129");
        org.junit.Assert.assertNotNull(localDateTime43);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withCenturyOfEra(0);
        int int21 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withCenturyOfEra(0);
        int int29 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime13.withFields((org.joda.time.ReadablePartial) localDateTime23);
        int int31 = localDateTime23.getWeekOfWeekyear();
        org.joda.time.Chronology chronology32 = localDateTime23.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(787, 701, 54, 206, 676, 43, 2120, chronology32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 206 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 58 + "'", int21 == 58);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 48 + "'", int31 == 48);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        java.lang.String str10 = localDateTime7.toString();
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.era();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.year();
        int int17 = property16.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime18 = property16.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        java.util.Date date21 = localDateTime20.toDate();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfCentury(1);
        int int27 = localDateTime20.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(dateTimeZone30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusSeconds((int) (byte) 100);
        int int36 = localDateTime33.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property37 = localDateTime33.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property37.getFieldType();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime29.withField(dateTimeFieldType38, 10);
        org.joda.time.LocalDateTime.Property property41 = localDateTime18.property(dateTimeFieldType38);
        boolean boolean42 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone43);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime44.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime44.withMillisOfDay((int) (short) 100);
        java.util.Date date52 = localDateTime51.toDate();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(11651L);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusMinutes(39);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime61.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.plusDays((int) (short) 0);
        java.lang.String str67 = localDateTime64.toString();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalDateTime localDateTime69 = new org.joda.time.LocalDateTime(dateTimeZone68);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant71 = null;
        int int72 = property70.getDifference(readableInstant71);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property70.getFieldType();
        int int74 = localDateTime64.get(dateTimeFieldType73);
        boolean boolean75 = localDateTime54.isSupported(dateTimeFieldType73);
        org.joda.time.LocalDateTime.Property property76 = localDateTime51.property(dateTimeFieldType73);
        int int77 = localDateTime18.indexOf(dateTimeFieldType73);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2001-11-25T02:58:54.229" + "'", str10, "2001-11-25T02:58:54.229");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Wed Nov 25 02:58:54 UTC 2020");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Wed Nov 25 00:00:00 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertNotNull(localDateTime66);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "2001-11-25T02:58:54.230" + "'", str67, "2001-11-25T02:58:54.230");
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
// flaky:         org.junit.Assert.assertTrue("'" + int74 + "' != '" + 230 + "'", int74 == 230);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.era();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusDays((int) 'a');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.minus(readablePeriod17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withSecondOfMinute((int) '#');
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusMonths(11);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withPeriodAdded(readablePeriod25, 330);
        org.joda.time.DurationFieldType durationFieldType28 = null;
        boolean boolean29 = localDateTime27.isSupported(durationFieldType28);
        int[] intArray30 = localDateTime27.getValues();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant36 = null;
        int int37 = property35.getDifference(readableInstant36);
        long long38 = property35.remainder();
        org.joda.time.LocalDateTime localDateTime39 = property35.roundHalfCeilingCopy();
        int int40 = localDateTime39.getYear();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone41);
        java.util.Date date43 = localDateTime42.toDate();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withYearOfCentury(1);
        int int49 = localDateTime42.compareTo((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime45.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime55 = property54.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusSeconds((int) (byte) 100);
        int int58 = localDateTime55.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property59 = localDateTime55.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = property59.getFieldType();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime51.withField(dateTimeFieldType60, 10);
        org.joda.time.LocalDateTime.Property property63 = localDateTime39.property(dateTimeFieldType60);
        int int64 = localDateTime27.indexOf(dateTimeFieldType60);
        boolean boolean65 = localDateTime10.isSupported(dateTimeFieldType60);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[99, 12, 25, 10715422]");
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2020 + "'", int40 == 2020);
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Wed Nov 25 02:58:54 UTC 2020");
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusSeconds(407);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(100L);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean18 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        boolean boolean19 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        int int20 = localDateTime12.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        java.util.Date date23 = localDateTime22.toDate();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withYearOfCentury(1);
        int int29 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plusYears((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime35 = property34.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusSeconds((int) (byte) 100);
        int int38 = localDateTime35.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property39 = localDateTime35.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property39.getFieldType();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime31.withField(dateTimeFieldType40, 10);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusHours(747);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.withDayOfWeek((int) (byte) 1);
        int int47 = localDateTime46.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withYear(4);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.minusMonths(40);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime12.withFields((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusMonths(937);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Wed Nov 25 02:58:54 UTC 2020");
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 48 + "'", int47 == 48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
    }
}
