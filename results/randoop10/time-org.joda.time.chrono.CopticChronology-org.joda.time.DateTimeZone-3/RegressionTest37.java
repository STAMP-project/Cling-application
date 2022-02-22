import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest37 {

    public static boolean debug = false;

    @Test
    public void test18501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18501");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType4 = null;
        boolean boolean5 = localTime1.isSupported(durationFieldType4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test18502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18502");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(53782602);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test18503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18503");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        java.util.Date date18 = new java.util.Date((long) (byte) 0);
        int int19 = date18.getMinutes();
        int int20 = date18.getDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) date18, chronology21);
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        org.joda.time.DateTime dateTime33 = localDate22.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = localDate5.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate5.withPeriodAdded(readablePeriod35, 122);
        org.joda.time.LocalDate.Property property38 = localDate37.yearOfEra();
        org.joda.time.LocalDate localDate39 = property38.getLocalDate();
        org.joda.time.LocalDate localDate40 = property38.roundCeilingCopy();
        org.joda.time.LocalDate localDate42 = localDate40.plusDays(666);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 893L + "'", long28 == 893L);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
    }

    @Test
    public void test18504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18504");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("453");
        org.joda.time.LocalDate localDate3 = localDate1.plusDays(233);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate3.getValue(401);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 401");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test18505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18505");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withEra(1);
        int int9 = localDateTime8.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDateTime8.getFieldType(2);
        java.lang.String str12 = dateTimeFieldType11.getName();
        int int13 = localDateTime4.get(dateTimeFieldType11);
        org.joda.time.Chronology chronology14 = localDateTime4.getChronology();
        org.joda.time.LocalDateTime.Property property15 = localDateTime4.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        long long23 = copticChronology17.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField24 = copticChronology17.months();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType16.getField((org.joda.time.Chronology) copticChronology17);
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType16.getRangeDurationType();
        org.joda.time.LocalDateTime.Property property27 = localDateTime4.property(dateTimeFieldType16);
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType16.getRangeDurationType();
        java.lang.String str29 = durationFieldType28.getName();
        java.lang.String str30 = durationFieldType28.toString();
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstance();
        long long37 = copticChronology31.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField38 = copticChronology31.halfdayOfDay();
        org.joda.time.DurationField durationField39 = copticChronology31.months();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(chronology40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.withEra(1);
        int int44 = localDateTime43.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = localDateTime43.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray47 = localDateTime43.getFields();
        int[] intArray49 = copticChronology31.get((org.joda.time.ReadablePartial) localDateTime43, (long) (short) 100);
        org.joda.time.DateTimeField dateTimeField50 = copticChronology31.weekyearOfCentury();
        org.joda.time.DurationField durationField51 = copticChronology31.millis();
        org.joda.time.DurationField durationField52 = durationFieldType28.getField((org.joda.time.Chronology) copticChronology31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2022 + "'", int2 == 2022);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "dayOfMonth" + "'", str12, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 57635003L + "'", long23 == 57635003L);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "years" + "'", str29, "years");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "years" + "'", str30, "years");
        org.junit.Assert.assertNotNull(copticChronology31);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 57635003L + "'", long37 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(dateTimeFieldArray47);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1686, 4, 23, 100]");
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(durationField52);
    }

    @Test
    public void test18506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18506");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(53);
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfCentury(10);
        org.joda.time.LocalDate localDate24 = localDate22.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate26 = localDate24.minusYears(900000);
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        java.lang.String str28 = localDate26.toString();
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        org.joda.time.Instant instant31 = instant29.toInstant();
        org.joda.time.DateTimeZone dateTimeZone32 = instant29.getZone();
        int int34 = dateTimeZone32.getOffsetFromLocal(25L);
        long long37 = dateTimeZone32.adjustOffset((-2101837630000L), true);
        org.joda.time.DateTime dateTime38 = localDate26.toDateTimeAtMidnight(dateTimeZone32);
        int int39 = dateTime38.getDayOfYear();
        int int40 = dateTime38.getSecondOfDay();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-899590-12-18" + "'", str28, "-899590-12-18");
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-2101837630000L) + "'", long37 == (-2101837630000L));
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 352 + "'", int39 == 352);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test18507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18507");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfWeek();
        org.joda.time.LocalDate.Property property7 = localDate5.year();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int int10 = dateTimeField8.getMinimumValue(readablePartial9);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-292275054) + "'", int10 == (-292275054));
    }

    @Test
    public void test18508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18508");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.clockhourOfHalfday();
        java.lang.String str10 = dateTimeField9.getName();
        org.joda.time.DurationField durationField11 = dateTimeField9.getDurationField();
        int int14 = durationField11.getDifference((long) 7, (long) 724);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "clockhourOfHalfday" + "'", str10, "clockhourOfHalfday");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test18509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18509");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("hi!");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        long long4 = calendar3.getTimeInMillis();
        calendar3.set(32772, 669, 935);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("\u4e2d\u6587\u4e2d\u56fd)");
        calendar3.setTimeZone(timeZone10);
        boolean boolean12 = timeZone10.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=32772,MONTH=669,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=935,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=32,MILLISECOND=556,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1645455812556L + "'", long4 == 1645455812556L);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18510");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int4 = localDateTime2.get(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfEra(274);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMonths(575);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test18511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18511");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 14);
        int int12 = dateTimeFormatter7.getDefaultYear();
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withLocale(locale13);
        java.util.Locale.Category category15 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale16 = java.util.Locale.getDefault(category15);
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.util.Locale.setDefault(category15, locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter7.withLocale(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withPivotYear(469);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withPivotYear(53968);
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.FORMAT + "'", category15.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test18512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18512");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.hourOfDay();
        org.joda.time.LocalTime.Property property4 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        org.joda.time.Interval interval6 = property4.toInterval();
        org.joda.time.LocalTime localTime7 = property4.withMinimumValue();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime7.plus(readablePeriod8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test18513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18513");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.parse("zh_TW", dateTimeFormatter14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test18514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18514");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\u4e2d\u6587\u4e2d\u56fd)");
        java.lang.String str2 = timeZone1.getID();
        java.lang.String str3 = timeZone1.getID();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeZone1.getOffset(53813929, 151, 339, 54055207, 53830758, 53845610);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GMT" + "'", str2, "GMT");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GMT" + "'", str3, "GMT");
    }

    @Test
    public void test18515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18515");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) -1);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withOffsetParsed();
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.getDisplayScript();
        java.util.Locale locale14 = new java.util.Locale("1964-10-15");
        java.lang.String str15 = locale11.getDisplayScript(locale14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter10.withLocale(locale11);
        java.util.Locale locale17 = locale11.stripExtensions();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals(locale14.toString(), "1964-10-15");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr");
    }

    @Test
    public void test18516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18516");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        java.util.Date date13 = new java.util.Date((long) (byte) 0);
        int int14 = date13.getMinutes();
        int int15 = date13.getDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) date13, chronology16);
        org.joda.time.LocalDate localDate19 = localDate17.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        long long27 = dateTimeZone21.getMillisKeepLocal(dateTimeZone25, 0L);
        org.joda.time.DateTime dateTime28 = localDate17.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.LocalDate localDate30 = localDate17.withCenturyOfEra(14);
        long long32 = copticChronology0.set((org.joda.time.ReadablePartial) localDate30, (long) 1080660000);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology0.hourOfHalfday();
        org.joda.time.Chronology chronology34 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology0.minuteOfDay();
        java.lang.String str38 = dateTimeField36.getAsText(6169095L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 893L + "'", long23 == 893L);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-6826074540000L) + "'", long32 == (-6826074540000L));
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "102" + "'", str38, "102");
    }

    @Test
    public void test18517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18517");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime13 = dateTime10.withFieldAdded(durationFieldType11, 0);
        org.joda.time.DateTime.Property property14 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property14.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property16 = dateTime15.secondOfMinute();
        java.lang.String str17 = property16.toString();
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str20 = property16.getAsShortText(locale19);
        java.lang.String str21 = property8.getAsShortText(locale19);
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.lang.String str23 = property8.getAsText(locale22);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(locale22);
        calendar24.setLenient(true);
        calendar24.setMinimalDaysInFirstWeek(53759567);
        int int29 = calendar24.getWeekYear();
        java.lang.Object obj30 = calendar24.clone();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Property[secondOfMinute]" + "'", str17, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "54240" + "'", str21, "54240");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "54240" + "'", str23, "54240");
        org.junit.Assert.assertNotNull(calendar24);
// flaky:         org.junit.Assert.assertEquals(calendar24.toString(), "\u4e2d\u56fd,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=53759567,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=32,MILLISECOND=657,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(obj30);
// flaky:         org.junit.Assert.assertEquals(obj30.toString(), "\u4e2d\u56fd,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=53759567,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=32,MILLISECOND=657,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "\u4e2d\u56fd,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=53759567,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=32,MILLISECOND=657,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "\u4e2d\u56fd,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=53759567,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=32,MILLISECOND=657,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test18518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18518");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusSeconds((int) (byte) 10);
        int int17 = localDateTime16.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusYears(0);
        boolean boolean20 = copticChronology0.equals((java.lang.Object) localDateTime19);
        org.joda.time.DurationField durationField21 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.halfdayOfDay();
        int int23 = dateTimeField22.getMinimumValue();
        boolean boolean24 = dateTimeField22.isSupported();
        org.joda.time.DurationField durationField25 = dateTimeField22.getRangeDurationField();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test18519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18519");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        boolean boolean10 = localDateTime3.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withEra(1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withEra(1);
        int int19 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean21 = localDateTime16.isSupported(dateTimeFieldType20);
        boolean boolean22 = localDateTime3.isSupported(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime3.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusMinutes(1645455273);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.plusWeeks(53940);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test18520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18520");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.DateTime dateTime10 = dateTime6.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime6.withDurationAdded((long) 11, 52);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime18 = dateTime15.withFieldAdded(durationFieldType16, 0);
        org.joda.time.DateTime.Property property19 = dateTime15.minuteOfDay();
        org.joda.time.DateTime dateTime20 = property19.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property21 = dateTime20.secondOfMinute();
        long long22 = property21.remainder();
        java.util.Locale locale23 = java.util.Locale.CHINESE;
        int int24 = property21.getMaximumTextLength(locale23);
        java.util.Calendar calendar25 = dateTime13.toCalendar(locale23);
        calendar25.clear();
        int int27 = calendar25.getFirstDayOfWeek();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromCalendarFields(calendar25);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(calendar25);
// flaky:         org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(localTime28);
    }

    @Test
    public void test18521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18521");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int4 = localDateTime2.get(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusWeeks(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusSeconds(881);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.minusSeconds(526);
        int int12 = localDateTime6.getEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = property13.getLocalDateTime();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test18522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18522");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = property8.getMaximumValueOverall();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = dateTimeZone13.getName((long) (short) 0, locale17);
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.LocalDate localDate22 = localDate11.minusWeeks((int) (short) 0);
        int int23 = localDate11.getYear();
        org.joda.time.LocalDate localDate25 = localDate11.withWeekyear(43);
        org.joda.time.LocalDate.Property property26 = localDate25.dayOfWeek();
        org.joda.time.LocalDate localDate27 = property26.roundHalfCeilingCopy();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 893L + "'", long15 == 893L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test18523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18523");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.lang.String str5 = dateTimeZone1.getName((long) 100);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.LocalDate localDate8 = localDate6.withCenturyOfEra(272);
        org.joda.time.DateTime dateTime9 = localDate8.toDateTimeAtMidnight();
        java.util.Date date11 = new java.util.Date((long) (byte) 0);
        int int12 = date11.getMinutes();
        int int13 = date11.getDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) date11, chronology14);
        org.joda.time.LocalDate localDate17 = localDate15.withYear((-1));
        org.joda.time.LocalDate.Property property18 = localDate17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        int int20 = property18.getMaximumValueOverall();
        org.joda.time.LocalDate localDate21 = property18.roundCeilingCopy();
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        long long25 = dateTimeZone23.nextTransition((long) 893);
        java.util.Locale locale27 = java.util.Locale.CANADA;
        java.lang.String str28 = dateTimeZone23.getName((long) (short) 0, locale27);
        java.util.TimeZone timeZone29 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTime dateTime30 = localDate21.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.LocalDate localDate32 = localDate21.minusWeeks((int) (short) 0);
        java.util.Locale locale34 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str35 = localDate21.toString("7", locale34);
        int int36 = localDate21.getYearOfEra();
        org.joda.time.LocalDate localDate38 = localDate21.minusMonths(70);
        int int39 = localDate8.compareTo((org.joda.time.ReadablePartial) localDate38);
        java.util.Date date41 = new java.util.Date((long) (byte) 0);
        int int42 = date41.getMinutes();
        int int43 = date41.getDay();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((java.lang.Object) date41, chronology44);
        org.joda.time.LocalDate localDate47 = localDate45.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant48 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone49 = instant48.getZone();
        long long51 = dateTimeZone49.nextTransition((long) 893);
        org.joda.time.Instant instant52 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone53 = instant52.getZone();
        long long55 = dateTimeZone49.getMillisKeepLocal(dateTimeZone53, 0L);
        org.joda.time.DateTime dateTime56 = localDate45.toDateTimeAtMidnight(dateTimeZone49);
        org.joda.time.LocalDate localDate58 = localDate45.minusDays(20);
        org.joda.time.LocalDate localDate60 = localDate58.withWeekOfWeekyear(21);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDate.Property property62 = localDate58.property(dateTimeFieldType61);
        org.joda.time.chrono.CopticChronology copticChronology63 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField64 = copticChronology63.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField65 = copticChronology63.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField66 = copticChronology63.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField67 = copticChronology63.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField68 = dateTimeFieldType61.getField((org.joda.time.Chronology) copticChronology63);
        org.joda.time.LocalDate.Property property69 = localDate38.property(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292278993 + "'", int20 == 292278993);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 893L + "'", long25 == 893L);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertNotNull(timeZone29);
// flaky:         org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "7" + "'", str35, "7");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
// flaky:         org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(instant48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 893L + "'", long51 == 893L);
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(copticChronology63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(property69);
    }

    @Test
    public void test18524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18524");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.centuryOfEra();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMillis(912);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusWeeks(53700);
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.secondOfMinute();
        org.joda.time.DurationField durationField15 = copticChronology13.months();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology13.monthOfYear();
        long long19 = dateTimeField17.roundHalfCeiling((long) (short) 100);
        long long21 = dateTimeField17.remainder((long) 69);
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str24 = locale23.getISO3Language();
        int int25 = dateTimeField17.getMaximumShortTextLength(locale23);
        boolean boolean26 = dateTimeField17.isLenient();
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone29 = instant28.getZone();
        long long31 = dateTimeZone29.nextTransition((long) 893);
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.lang.String str34 = dateTimeZone29.getName((long) (short) 0, locale33);
        java.lang.String str35 = dateTimeField17.getAsText(1645455240177L, locale33);
        java.lang.String str36 = locale33.getDisplayVariant();
        java.lang.String str37 = localDateTime11.toString("days", locale33);
        int int38 = localDateTime11.getDayOfMonth();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withEra(1);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusHours(893);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.minus(readablePeriod45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime42.dayOfYear();
        org.joda.time.LocalDateTime localDateTime48 = property47.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime49 = property47.roundHalfFloorCopy();
        int int50 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDateTime49);
        int int51 = localDateTime11.getEra();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 691200000L + "'", long19 == 691200000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1900800069L + "'", long21 == 1900800069L);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 893L + "'", long31 == 893L);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "6" + "'", str35, "6");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "27AM9700" + "'", str37, "27AM9700");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 27 + "'", int38 == 27);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test18525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18525");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronology();
        java.util.Locale locale9 = dateTimeFormatter7.getLocale();
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter12.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter12.withPivotYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter12.withDefaultYear(867);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(650);
        java.util.Locale locale23 = java.util.Locale.getDefault();
        java.lang.String str24 = dateTimeZone21.getName((long) 32769, locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter19.withZone(dateTimeZone21);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.secondOfMinute();
        org.joda.time.DurationField durationField29 = copticChronology27.months();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology27.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology27.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = copticChronology27.add(readablePeriod32, (long) 816, (int) '#');
        org.joda.time.DateTimeField dateTimeField36 = copticChronology27.millisOfSecond();
        long long39 = dateTimeField36.getDifferenceAsLong(21859200000L, 3600000L);
        boolean boolean40 = dateTimeZone21.equals((java.lang.Object) 3600000L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter7.withZone(dateTimeZone21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 54189282);
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertNull(dateTimeParser13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(locale23);
// flaky:         org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.650" + "'", str24, "+00:00:00.650");
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(copticChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 816L + "'", long35 == 816L);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 21855600000L + "'", long39 == 21855600000L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
    }

    @Test
    public void test18526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18526");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        java.lang.String str4 = calendar3.getCalendarType();
        calendar3.set(35, 588, 252, 778, 0, 75360);
        calendar3.set(53674252, 884, 0, 53669992, 53850955, 656);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = calendar3.getGreatestMinimum(54121);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54121");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "\u4e2d\u56fd,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=53674252,MONTH=884,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=0,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=53669992,MINUTE=53850955,SECOND=656,MILLISECOND=854,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gregory" + "'", str4, "gregory");
    }

    @Test
    public void test18527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18527");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(300, 11);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 9, dateTimeZone3);
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        java.lang.String str7 = property5.getName();
        org.joda.time.DateTime dateTime9 = property5.addToCopy((long) 638);
        org.joda.time.DateTime dateTime10 = property5.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime15 = dateTime12.withFieldAdded(durationFieldType13, 0);
        org.joda.time.DateTime.Property property16 = dateTime12.minuteOfDay();
        org.joda.time.DateTime dateTime17 = property16.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property18 = dateTime17.secondOfMinute();
        java.util.Date date19 = dateTime17.toDate();
        org.joda.time.DateTime dateTime21 = dateTime17.plusYears((int) 'u');
        org.joda.time.Instant instant22 = dateTime17.toInstant();
        org.joda.time.MutableDateTime mutableDateTime23 = instant22.toMutableDateTimeISO();
        org.joda.time.Instant instant25 = instant22.withMillis((-259200000L));
        org.joda.time.MutableDateTime mutableDateTime26 = instant22.toMutableDateTime();
        int int27 = dateTime10.compareTo((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hourOfDay" + "'", str7, "hourOfDay");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Mon Feb 21 15:04:00 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test18528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18528");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        long long4 = dateTimeZone2.nextTransition((long) 893);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = dateTimeZone2.getName((long) (short) 0, locale6);
        java.util.TimeZone timeZone8 = dateTimeZone2.toTimeZone();
        timeZone8.setID("Property[secondOfMinute]");
        java.util.Calendar.Builder builder11 = builder0.setTimeZone(timeZone8);
        timeZone8.setRawOffset(0);
        int int15 = timeZone8.getOffset((long) 4);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        int int18 = dateTime17.getMinuteOfDay();
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime17.toMutableDateTime(dateTimeZone20);
        int int22 = dateTime17.getCenturyOfEra();
        org.joda.time.ReadableInstant readableInstant23 = null;
        boolean boolean24 = dateTime17.isEqual(readableInstant23);
        java.util.Date date26 = new java.util.Date((long) (byte) 0);
        int int27 = date26.getMinutes();
        int int28 = date26.getDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) date26, chronology29);
        org.joda.time.LocalDate localDate32 = localDate30.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant33 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        long long36 = dateTimeZone34.nextTransition((long) 893);
        org.joda.time.Instant instant37 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone38 = instant37.getZone();
        long long40 = dateTimeZone34.getMillisKeepLocal(dateTimeZone38, 0L);
        org.joda.time.DateTime dateTime41 = localDate30.toDateTimeAtMidnight(dateTimeZone34);
        org.joda.time.DateTime dateTime42 = dateTime17.withZoneRetainFields(dateTimeZone34);
        java.lang.String str43 = dateTimeZone34.getID();
        java.util.TimeZone timeZone44 = dateTimeZone34.toTimeZone();
        boolean boolean45 = timeZone8.hasSameRules(timeZone44);
        java.util.Locale locale46 = java.util.Locale.JAPANESE;
        java.util.Locale locale50 = new java.util.Locale("java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]", "millisOfSecond", "11");
        java.lang.String str51 = locale46.getDisplayLanguage(locale50);
        java.lang.String str52 = locale50.getDisplayVariant();
        java.lang.String str53 = locale50.getLanguage();
        java.util.Set<java.lang.Character> charSet54 = locale50.getExtensionKeys();
        java.util.Locale.Category category55 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale56 = java.util.Locale.getDefault(category55);
        java.util.Set<java.lang.Character> charSet57 = locale56.getExtensionKeys();
        java.lang.String str58 = locale56.getDisplayVariant();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(dateTimeZone59);
        org.joda.time.DurationFieldType durationFieldType61 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime63 = dateTime60.withFieldAdded(durationFieldType61, 0);
        org.joda.time.DateTime.Property property64 = dateTime60.minuteOfDay();
        org.joda.time.DateTime dateTime65 = property64.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property66 = dateTime65.secondOfMinute();
        org.joda.time.DateTime.Property property67 = dateTime65.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(dateTimeZone68);
        org.joda.time.DurationFieldType durationFieldType70 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime72 = dateTime69.withFieldAdded(durationFieldType70, 0);
        org.joda.time.DateTime.Property property73 = dateTime69.minuteOfDay();
        org.joda.time.DateTime dateTime74 = property73.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property75 = dateTime74.secondOfMinute();
        java.lang.String str76 = property75.toString();
        java.util.Locale locale78 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str79 = property75.getAsShortText(locale78);
        java.lang.String str80 = property67.getAsShortText(locale78);
        java.util.Locale locale81 = java.util.Locale.GERMANY;
        java.lang.String str82 = property67.getAsText(locale81);
        java.lang.String str83 = locale81.getDisplayVariant();
        java.lang.String str84 = locale56.getDisplayLanguage(locale81);
        java.lang.String str85 = locale50.getDisplayName(locale56);
        java.util.Calendar calendar86 = java.util.Calendar.getInstance(timeZone44, locale56);
        // The following exception was thrown during execution in test generation
        try {
            int int93 = timeZone44.getOffset(2124, 166, 628, (int) (byte) 0, 53753149, 54152022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 2124");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 893L + "'", long4 == 893L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 903 + "'", int18 == 903);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20 + "'", int22 == 20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky:         org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 893L + "'", long36 == 893L);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
        org.junit.Assert.assertNotNull(timeZone44);
// flaky:         org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ja");
        org.junit.Assert.assertEquals(locale50.toString(), "java.util.gregoriancalendar[time=6,arefieldsset=true,areallfieldsset=true,lenient=true,zone=sun.util.calendar.zoneinfo[id=\"hi!\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=1,minimaldaysinfirstweek=1,era=1,year=1970,month=0,week_of_year=1,week_of_month=1,day_of_month=1,day_of_year=1,day_of_week=5,day_of_week_in_month=1,am_pm=0,hour=0,hour_of_day=0,minute=0,second=0,millisecond=6,zone_offset=0,dst_offset=0]_MILLISOFSECOND_11");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Japanese" + "'", str51, "Japanese");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "11" + "'", str52, "11");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "java.util.gregoriancalendar[time=6,arefieldsset=true,areallfieldsset=true,lenient=true,zone=sun.util.calendar.zoneinfo[id=\"hi!\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=1,minimaldaysinfirstweek=1,era=1,year=1970,month=0,week_of_year=1,week_of_month=1,day_of_month=1,day_of_year=1,day_of_week=5,day_of_week_in_month=1,am_pm=0,hour=0,hour_of_day=0,minute=0,second=0,millisecond=6,zone_offset=0,dst_offset=0]" + "'", str53, "java.util.gregoriancalendar[time=6,arefieldsset=true,areallfieldsset=true,lenient=true,zone=sun.util.calendar.zoneinfo[id=\"hi!\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=1,minimaldaysinfirstweek=1,era=1,year=1970,month=0,week_of_year=1,week_of_month=1,day_of_month=1,day_of_year=1,day_of_week=5,day_of_week_in_month=1,am_pm=0,hour=0,hour_of_day=0,minute=0,second=0,millisecond=6,zone_offset=0,dst_offset=0]");
        org.junit.Assert.assertNotNull(charSet54);
        org.junit.Assert.assertTrue("'" + category55 + "' != '" + java.util.Locale.Category.FORMAT + "'", category55.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh");
        org.junit.Assert.assertNotNull(charSet57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(durationFieldType61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(durationFieldType70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Property[secondOfMinute]" + "'", str76, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "0" + "'", str79, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "54240" + "'", str80, "54240");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "54240" + "'", str82, "54240");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Chinesisch" + "'", str84, "Chinesisch");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "java.util.gregoriancalendar[time=6,arefieldsset=true,areallfieldsset=true,lenient=true,zone=sun.util.calendar.zoneinfo[id=\"hi!\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=1,minimaldaysinfirstweek=1,era=1,year=1970,month=0,week_of_year=1,week_of_month=1,day_of_month=1,day_of_year=1,day_of_week=5,day_of_week_in_month=1,am_pm=0,hour=0,hour_of_day=0,minute=0,second=0,millisecond=6,zone_offset=0,dst_offset=0] (MILLISOFSECOND,11)" + "'", str85, "java.util.gregoriancalendar[time=6,arefieldsset=true,areallfieldsset=true,lenient=true,zone=sun.util.calendar.zoneinfo[id=\"hi!\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=1,minimaldaysinfirstweek=1,era=1,year=1970,month=0,week_of_year=1,week_of_month=1,day_of_month=1,day_of_year=1,day_of_week=5,day_of_week_in_month=1,am_pm=0,hour=0,hour_of_day=0,minute=0,second=0,millisecond=6,zone_offset=0,dst_offset=0] (MILLISOFSECOND,11)");
        org.junit.Assert.assertNotNull(calendar86);
// flaky:         org.junit.Assert.assertEquals(calendar86.toString(), "java.util.GregorianCalendar[time=1645455812882,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=32,MILLISECOND=882,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test18529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18529");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 78);
    }

    @Test
    public void test18530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18530");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18531");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime1.getCenturyOfEra();
        org.joda.time.ReadableInstant readableInstant7 = null;
        boolean boolean8 = dateTime1.isEqual(readableInstant7);
        java.util.Date date10 = new java.util.Date((long) (byte) 0);
        int int11 = date10.getMinutes();
        int int12 = date10.getDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) date10, chronology13);
        org.joda.time.LocalDate localDate16 = localDate14.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        long long20 = dateTimeZone18.nextTransition((long) 893);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone22, 0L);
        org.joda.time.DateTime dateTime25 = localDate14.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime26 = dateTime1.withZoneRetainFields(dateTimeZone18);
        java.util.TimeZone timeZone27 = dateTimeZone18.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = timeZone27.getDisplayName(true, 53977);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 53977");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 903 + "'", int2 == 903);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
// flaky:         org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 893L + "'", long20 == 893L);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
    }

    @Test
    public void test18532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18532");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("hi!");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        long long4 = calendar3.getTimeInMillis();
        calendar3.set(32772, 669, 935);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("\u4e2d\u6587\u4e2d\u56fd)");
        calendar3.setTimeZone(timeZone10);
        java.util.Calendar.Builder builder12 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder14 = builder12.setInstant((long) 6);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        timeZone15.setID("hi!");
        java.util.Calendar.Builder builder18 = builder14.setTimeZone(timeZone15);
        boolean boolean19 = timeZone10.hasSameRules(timeZone15);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.TimeZone.setDefault(timeZone10);
        int int23 = timeZone10.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime28 = dateTime25.withFieldAdded(durationFieldType26, 0);
        org.joda.time.DateTime.Property property29 = dateTime25.minuteOfDay();
        org.joda.time.DateTime dateTime30 = property29.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property31 = dateTime30.secondOfMinute();
        org.joda.time.DateTime.Property property32 = dateTime30.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime37 = dateTime34.withFieldAdded(durationFieldType35, 0);
        org.joda.time.DateTime.Property property38 = dateTime34.minuteOfDay();
        org.joda.time.DateTime dateTime39 = property38.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property40 = dateTime39.secondOfMinute();
        java.lang.String str41 = property40.toString();
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str44 = property40.getAsShortText(locale43);
        java.lang.String str45 = property32.getAsShortText(locale43);
        java.lang.String str46 = locale43.getScript();
        java.lang.String str47 = timeZone10.getDisplayName(locale43);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=32772,MONTH=669,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=935,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=32,MILLISECOND=935,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1645455812935L + "'", long4 == 1645455812935L);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Property[secondOfMinute]" + "'", str41, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0" + "'", str44, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "54240" + "'", str45, "54240");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Greenwich Mean Time" + "'", str47, "Greenwich Mean Time");
    }

    @Test
    public void test18533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18533");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusHours(893);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test18534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18534");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.LocalTime localTime9 = localTime7.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfWeek(2);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) dateTime11);
        int int15 = dateTime14.getEra();
        org.joda.time.TimeOfDay timeOfDay16 = dateTime14.toTimeOfDay();
        org.joda.time.DateTime dateTime18 = dateTime14.plusSeconds(21);
        org.joda.time.DateTime dateTime20 = dateTime14.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime21 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getRangeDurationType();
        int int24 = dateTime21.get(dateTimeFieldType22);
        int int25 = dateTime21.getMinuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime21.withPeriodAdded(readablePeriod26, 490);
        int int29 = dateTime28.getYearOfEra();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 843 + "'", int25 == 843);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
    }

    @Test
    public void test18535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18535");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime3.minusSeconds(43);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusYears(2022);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minus(readableDuration14);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test18536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18536");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.halfdayOfDay();
        long long8 = copticChronology3.add((long) '#', 10L, (-1));
        org.joda.time.DateTimeField dateTimeField9 = copticChronology3.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology3.add(readablePeriod10, (long) 'u', 816);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology3.clockhourOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withEra(1);
        int int22 = localDateTime21.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = localDateTime21.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray25 = localDateTime21.getFields();
        org.joda.time.LocalDateTime.Property property26 = localDateTime21.year();
        boolean boolean28 = localDateTime21.equals((java.lang.Object) (byte) 0);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime21.plus(readableDuration29);
        org.joda.time.Instant instant31 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone32 = instant31.getZone();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(dateTimeZone32);
        org.joda.time.DateTimeField[] dateTimeFieldArray34 = localDateTime33.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType35.getDurationType();
        int int37 = localDateTime33.get(dateTimeFieldType35);
        int[] intArray38 = localDateTime33.getValues();
        int int39 = dateTimeField17.getMaximumValue((org.joda.time.ReadablePartial) localDateTime30, intArray38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder40 = builder0.setFields(intArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 25L + "'", long8 == 25L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 117L + "'", long13 == 117L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeFieldArray25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldArray34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 22 + "'", int37 == 22);
        org.junit.Assert.assertNotNull(intArray38);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[2022, 2, 21, 54213009]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 24 + "'", int39 == 24);
    }

    @Test
    public void test18537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18537");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusSeconds((int) (byte) 10);
        int int17 = localDateTime16.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusYears(0);
        boolean boolean20 = copticChronology0.equals((java.lang.Object) localDateTime19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = copticChronology0.eras();
        org.joda.time.Chronology chronology23 = copticChronology0.withUTC();
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        long long27 = dateTimeZone25.nextTransition((long) 893);
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone29 = instant28.getZone();
        long long31 = dateTimeZone25.getMillisKeepLocal(dateTimeZone29, 0L);
        long long34 = dateTimeZone25.convertLocalToUTC((long) 11, false);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withEra(1);
        int int40 = localDateTime39.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = localDateTime39.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime39.plusSeconds((int) (short) 1);
        int int45 = localDateTime44.getHourOfDay();
        org.joda.time.LocalDateTime.Property property46 = localDateTime44.hourOfDay();
        org.joda.time.LocalDateTime localDateTime47 = property46.roundHalfCeilingCopy();
        java.util.Locale locale49 = java.util.Locale.UK;
        org.joda.time.LocalDateTime localDateTime50 = property46.setCopy("0", locale49);
        java.lang.String str51 = dateTimeZone25.getName(31536900000L, locale49);
        java.util.Locale locale54 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str55 = locale54.getISO3Language();
        java.util.Locale.Category category56 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale57 = java.util.Locale.getDefault(category56);
        java.lang.String str58 = locale54.getDisplayLanguage(locale57);
        java.lang.String str59 = dateTimeZone25.getShortName((long) 935, locale54);
        org.joda.time.Chronology chronology60 = chronology23.withZone(dateTimeZone25);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(dateTimeZone25);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 893L + "'", long27 == 893L);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 11L + "'", long34 == 11L);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 15 + "'", int45 == 15);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00" + "'", str51, "+00:00");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + category56 + "' != '" + java.util.Locale.Category.FORMAT + "'", category56.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:00" + "'", str59, "+00:00");
        org.junit.Assert.assertNotNull(chronology60);
    }

    @Test
    public void test18538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18538");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.weekyear();
        org.joda.time.DurationField durationField14 = copticChronology1.seconds();
        long long17 = durationField14.subtract(26748640289000L, (long) 401);
        int int20 = durationField14.getDifference(10598050724765L, 8787916838088L);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance();
        long long27 = copticChronology21.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology21.halfdayOfDay();
        org.joda.time.DurationField durationField29 = copticChronology21.halfdays();
        long long33 = copticChronology21.add((long) 272, 40140000L, 538);
        org.joda.time.DurationField durationField34 = copticChronology21.halfdays();
        int int37 = durationField34.getValue(0L, 241L);
        int int38 = durationField14.compareTo(durationField34);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57635003L + "'", long7 == 57635003L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 26748639888000L + "'", long17 == 26748639888000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1810133886 + "'", int20 == 1810133886);
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 57635003L + "'", long27 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 21595320272L + "'", long33 == 21595320272L);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test18539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18539");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr" + "'", str2, "fr");
    }

    @Test
    public void test18540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18540");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime7 = dateTime4.withFieldAdded(durationFieldType5, 0);
        org.joda.time.DateTime.Property property8 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property10 = dateTime9.secondOfMinute();
        java.lang.String str11 = property10.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime16 = dateTime13.withFieldAdded(durationFieldType14, 0);
        org.joda.time.DateTime.Property property17 = dateTime13.minuteOfDay();
        org.joda.time.DateTime dateTime18 = property17.roundHalfEvenCopy();
        int int19 = dateTime18.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str23 = locale22.getISO3Language();
        java.util.Locale.Category category24 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale25 = java.util.Locale.getDefault(category24);
        java.lang.String str26 = locale22.getDisplayLanguage(locale25);
        int int27 = property10.getMaximumTextLength(locale25);
        java.util.Locale.Builder builder28 = builder2.setLocale(locale25);
        java.util.Locale.Builder builder30 = builder2.removeUnicodeLocaleAttribute("days");
        java.util.Locale.Builder builder31 = builder2.clearExtensions();
        java.util.Locale.Builder builder32 = builder2.clearExtensions();
        java.util.Locale locale33 = builder2.build();
        java.util.Locale.Builder builder34 = builder2.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[secondOfMinute]" + "'", str11, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 22 + "'", int19 == 22);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.FORMAT + "'", category24.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh");
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test18541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18541");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar6 = dateTime1.toGregorianCalendar();
        gregorianCalendar6.clear();
        java.util.Locale locale10 = new java.util.Locale("hi!", "");
        boolean boolean11 = locale10.hasExtensions();
        boolean boolean12 = gregorianCalendar6.after((java.lang.Object) locale10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = gregorianCalendar6.getLeastMaximum(54006065);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54006065");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 903 + "'", int2 == 903);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18542");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(909, 53872, 263, 96, 714);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 96 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18543");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology1.getZone();
        org.joda.time.DurationField durationField13 = copticChronology1.years();
        org.joda.time.DurationField durationField14 = copticChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology1.minuteOfHour();
        org.joda.time.DurationField durationField16 = copticChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology1.millisOfSecond();
        boolean boolean19 = dateTimeField17.isLeap(399777114L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57635003L + "'", long7 == 57635003L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18544");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths(241);
        org.joda.time.DateTime dateTime8 = dateTime4.withCenturyOfEra(669);
        org.joda.time.Instant instant9 = dateTime4.toInstant();
        boolean boolean10 = instant9.isEqualNow();
        org.joda.time.DateTime dateTime11 = instant9.toDateTime();
        org.joda.time.Instant instant13 = instant9.plus((long) 53813259);
        org.joda.time.Instant instant14 = instant13.toInstant();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(instant9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(instant14);
    }

    @Test
    public void test18545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18545");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.hourOfDay();
        org.joda.time.LocalTime.Property property4 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime6 = property4.withMaximumValue();
        org.joda.time.LocalTime localTime7 = property4.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime8 = property4.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime10 = property4.addCopy(464);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withEra(1);
        int int15 = localDateTime14.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = localDateTime14.getFieldType(2);
        java.lang.String str18 = dateTimeFieldType17.getName();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType17.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime24 = dateTime21.withFieldAdded(durationFieldType22, 0);
        org.joda.time.DateTime.Property property25 = dateTime21.minuteOfDay();
        org.joda.time.DateTime dateTime27 = dateTime21.plusDays(1970);
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance();
        long long34 = copticChronology28.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField35 = copticChronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology28.dayOfYear();
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology28);
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstance();
        long long44 = copticChronology38.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField45 = copticChronology38.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology38.dayOfYear();
        boolean boolean47 = copticChronology28.equals((java.lang.Object) copticChronology38);
        org.joda.time.DateTimeField dateTimeField48 = copticChronology38.millisOfDay();
        boolean boolean49 = dateTime27.equals((java.lang.Object) copticChronology38);
        org.joda.time.DateTimeField dateTimeField50 = copticChronology38.hourOfHalfday();
        boolean boolean51 = durationFieldType19.isSupported((org.joda.time.Chronology) copticChronology38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime53 = localTime10.withFieldAdded(durationFieldType19, 53840000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'days' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "dayOfMonth" + "'", str18, "dayOfMonth");
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(copticChronology28);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 57635003L + "'", long34 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(copticChronology38);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 57635003L + "'", long44 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test18546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18546");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1645455269992L);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(528);
        int int4 = localTime1.getMillisOfSecond();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 992 + "'", int4 == 992);
    }

    @Test
    public void test18547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18547");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        date1.setSeconds(0);
        int int4 = date1.getDate();
        int int5 = date1.getMonth();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test18548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18548");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.Instant instant11 = instant9.withMillis((long) 1);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone17 = instant16.getZone();
        long long19 = dateTimeZone13.getMillisKeepLocal(dateTimeZone17, 0L);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) instant9, dateTimeZone17);
        org.joda.time.LocalTime localTime22 = localTime20.minusMillis(12);
        org.joda.time.LocalTime localTime24 = localTime20.plusMillis((int) (short) 10);
        int[] intArray26 = copticChronology0.get((org.joda.time.ReadablePartial) localTime24, (long) 17);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField28 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 893L + "'", long15 == 893L);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 17]");
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test18549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18549");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = property8.getMaximumValueOverall();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = dateTimeZone13.getName((long) (short) 0, locale17);
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.LocalDate localDate22 = localDate11.minusWeeks((int) (short) 0);
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str25 = localDate11.toString("7", locale24);
        int int26 = localDate11.getYearOfEra();
        org.joda.time.LocalDate.Property property27 = localDate11.monthOfYear();
        java.util.Date date29 = new java.util.Date((long) (byte) 0);
        int int30 = date29.getMinutes();
        int int31 = date29.getDay();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) date29, chronology32);
        org.joda.time.LocalDate localDate35 = localDate33.withYear((-1));
        org.joda.time.LocalDate.Property property36 = localDate35.yearOfEra();
        org.joda.time.DateTimeField dateTimeField37 = property36.getField();
        org.joda.time.DurationField durationField38 = dateTimeField37.getRangeDurationField();
        org.joda.time.DurationField durationField39 = dateTimeField37.getRangeDurationField();
        java.util.Date date41 = new java.util.Date((long) (byte) 0);
        int int42 = date41.getMinutes();
        int int43 = date41.getDay();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((java.lang.Object) date41, chronology44);
        org.joda.time.LocalDate localDate47 = localDate45.withYear((-1));
        org.joda.time.LocalDate.Property property48 = localDate47.yearOfEra();
        org.joda.time.DateTimeField dateTimeField49 = property48.getField();
        int int50 = property48.getMaximumValueOverall();
        org.joda.time.LocalDate localDate51 = property48.roundCeilingCopy();
        int int52 = dateTimeField37.getMinimumValue((org.joda.time.ReadablePartial) localDate51);
        java.util.Date date53 = localDate51.toDate();
        boolean boolean54 = localDate11.equals((java.lang.Object) date53);
        int int55 = date53.getMonth();
        int int56 = date53.getDay();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 893L + "'", long15 == 893L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "7" + "'", str25, "7");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNull(durationField38);
        org.junit.Assert.assertNull(durationField39);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 292278993 + "'", int50 == 292278993);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Wed Jan 01 00:00:00 GMT 2");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
    }

    @Test
    public void test18550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18550");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        java.util.Date date10 = new java.util.Date((long) (byte) 0);
        int int11 = date10.getMinutes();
        int int12 = date10.getDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) date10, chronology13);
        boolean boolean15 = property8.equals((java.lang.Object) chronology13);
        org.joda.time.DurationField durationField16 = property8.getDurationField();
        org.joda.time.DateTime dateTime17 = property8.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = property8.addToCopy(0L);
        org.joda.time.DateTime dateTime20 = property8.getDateTime();
        org.joda.time.DateTime dateTime21 = property8.getDateTime();
        org.joda.time.DateTime dateTime23 = property8.setCopy(218);
        java.util.Locale locale24 = java.util.Locale.TAIWAN;
        boolean boolean25 = locale24.hasExtensions();
        boolean boolean26 = locale24.hasExtensions();
        int int27 = property8.getMaximumTextLength(locale24);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test18551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18551");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.lang.String str8 = property7.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime13 = dateTime10.withFieldAdded(durationFieldType11, 0);
        org.joda.time.DateTime.Property property14 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property14.roundHalfEvenCopy();
        int int16 = dateTime15.getYearOfCentury();
        long long17 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withDayOfWeek(2);
        long long22 = dateTime19.getMillis();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime19.withPeriodAdded(readablePeriod23, 9);
        int int26 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.Instant instant27 = dateTime15.toInstant();
        org.joda.time.Instant instant28 = dateTime15.toInstant();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[secondOfMinute]" + "'", str8, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1645455813247L + "'", long22 == 1645455813247L);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(instant28);
    }

    @Test
    public void test18552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18552");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths(241);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime4.plus(readablePeriod7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMonths(3);
        long long11 = dateTime8.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance();
        long long19 = copticChronology13.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField20 = copticChronology13.months();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType12.getField((org.joda.time.Chronology) copticChronology13);
        org.joda.time.DateTime.Property property22 = dateTime8.property(dateTimeFieldType12);
        org.joda.time.DateTime dateTime24 = property22.addToCopy((long) 796);
        int int25 = dateTime24.getMinuteOfDay();
        org.joda.time.DateTime.Property property26 = dateTime24.dayOfYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1645455813262L + "'", long11 == 1645455813262L);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 57635003L + "'", long19 == 57635003L);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 903 + "'", int25 == 903);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test18553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18553");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withPivotYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withDefaultYear(867);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter3.withDefaultYear(136);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeFormatter12.getZone();
        java.lang.Integer int14 = dateTimeFormatter12.getPivotYear();
        int int15 = dateTimeFormatter12.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.parse("53820", dateTimeFormatter12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimeZone13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 136 + "'", int15 == 136);
    }

    @Test
    public void test18554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18554");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        java.util.Date date9 = new java.util.Date((long) (byte) 0);
        int int10 = date9.getMinutes();
        int int11 = date9.getDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) date9, chronology12);
        org.joda.time.LocalDate localDate15 = localDate13.withYear((-1));
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        int int18 = property16.getMaximumValueOverall();
        org.joda.time.LocalDate localDate19 = property16.roundCeilingCopy();
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = dateTimeZone21.getName((long) (short) 0, locale25);
        java.util.TimeZone timeZone27 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDate19.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime29 = dateTime3.withZone(dateTimeZone21);
        org.joda.time.DateTime dateTime31 = dateTime29.withYearOfEra(881);
        int int32 = dateTime29.getYearOfEra();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 903 + "'", int4 == 903);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455813300,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=33,MILLISECOND=300,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 292278993 + "'", int18 == 292278993);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 893L + "'", long23 == 893L);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertNotNull(timeZone27);
// flaky:         org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2022 + "'", int32 == 2022);
    }

    @Test
    public void test18555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18555");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime13.minus(readablePeriod14);
        org.joda.time.DateTime dateTime16 = localTime15.toDateTimeToday();
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays(669);
        org.joda.time.DateTime dateTime20 = dateTime16.plus((long) 53878847);
        org.joda.time.DateTime dateTime22 = dateTime20.plusSeconds(53918047);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 893L + "'", long6 == 893L);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test18556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18556");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        int int9 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField10 = copticChronology0.days();
        org.joda.time.DurationField durationField11 = copticChronology0.years();
        long long14 = durationField11.getMillis(2849, 716439L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 89907580800000L + "'", long14 == 89907580800000L);
    }

    @Test
    public void test18557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18557");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.roundCeilingCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis(53666732);
        int int7 = localTime6.getHourOfDay();
        org.joda.time.LocalTime localTime9 = localTime6.minusSeconds(69);
        int int10 = localTime9.getMillisOfSecond();
        org.joda.time.LocalTime.Property property11 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime13 = property11.addCopy(340);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 732 + "'", int10 == 732);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test18558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18558");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 0L);
        long long9 = dateTimeZone5.nextTransition((long) (-1));
        long long11 = dateTimeZone5.convertUTCToLocal(0L);
        boolean boolean12 = dateTimeZone5.isFixed();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test18559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18559");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int4 = localDateTime2.get(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy(893L);
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfCeilingCopy();
        int int9 = localDateTime8.getWeekyear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeField11.set((long) 83, "2022-02-21T15:02:49.356");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T15:02:49.356\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test18560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18560");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Date date4 = new java.util.Date((long) (byte) 0);
        int int5 = date4.getMinutes();
        int int6 = date4.getDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) date4, chronology7);
        int int9 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate11 = localDate8.minusWeeks(272);
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        long long16 = dateTimeZone14.nextTransition((long) 893);
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.lang.String str19 = dateTimeZone14.getName((long) (short) 0, locale18);
        java.lang.String str20 = localDate8.toString("+00:00", locale18);
        java.lang.String str22 = locale18.getExtension('x');
        java.util.Locale.setDefault(category0, locale18);
        java.lang.String str24 = locale18.getDisplayScript();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 893L + "'", long16 == 893L);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test18561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18561");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime8 = property5.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime9 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime10 = property5.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime11 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime13 = property5.setCopy(0);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfEra();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance();
        long long21 = copticChronology15.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology15.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology15.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology15.hourOfHalfday();
        java.util.Locale locale26 = java.util.Locale.ITALY;
        int int27 = dateTimeField25.getMaximumTextLength(locale26);
        java.util.Date date29 = new java.util.Date((long) (byte) 0);
        int int30 = date29.getMinutes();
        int int31 = date29.getDay();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) date29, chronology32);
        int int34 = localDate33.getDayOfWeek();
        org.joda.time.LocalDate localDate36 = localDate33.minusWeeks(272);
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone39 = instant38.getZone();
        long long41 = dateTimeZone39.nextTransition((long) 893);
        java.util.Locale locale43 = java.util.Locale.CANADA;
        java.lang.String str44 = dateTimeZone39.getName((long) (short) 0, locale43);
        java.lang.String str45 = localDate33.toString("+00:00", locale43);
        java.lang.String str46 = locale43.getScript();
        java.lang.String str47 = locale43.getVariant();
        java.lang.String str48 = locale26.getDisplayScript(locale43);
        java.lang.String str49 = property14.getAsShortText(locale43);
        org.joda.time.DateTime dateTime51 = property14.addToCopy(216);
        int int52 = dateTime51.getWeekyear();
        org.joda.time.Instant instant54 = new org.joda.time.Instant(1L);
        org.joda.time.Instant instant55 = instant54.toInstant();
        org.joda.time.DateTimeZone dateTimeZone56 = instant55.getZone();
        org.joda.time.chrono.CopticChronology copticChronology57 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology57.secondOfMinute();
        org.joda.time.DurationField durationField59 = copticChronology57.months();
        org.joda.time.DateTimeZone dateTimeZone60 = copticChronology57.getZone();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(dateTimeZone60);
        java.util.Date date63 = new java.util.Date((long) (byte) 0);
        int int64 = date63.getMinutes();
        int int65 = date63.getDay();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate((java.lang.Object) date63, chronology66);
        org.joda.time.LocalDate localDate69 = localDate67.withYear((-1));
        org.joda.time.LocalDate.Property property70 = localDate69.yearOfEra();
        org.joda.time.DateTimeField dateTimeField71 = property70.getField();
        int int72 = property70.getMaximumValueOverall();
        org.joda.time.LocalDate localDate73 = property70.roundCeilingCopy();
        org.joda.time.Instant instant74 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone75 = instant74.getZone();
        long long77 = dateTimeZone75.nextTransition((long) 893);
        java.util.Locale locale79 = java.util.Locale.CANADA;
        java.lang.String str80 = dateTimeZone75.getName((long) (short) 0, locale79);
        java.util.TimeZone timeZone81 = dateTimeZone75.toTimeZone();
        org.joda.time.DateTime dateTime82 = localDate73.toDateTimeAtCurrentTime(dateTimeZone75);
        long long84 = dateTimeZone60.getMillisKeepLocal(dateTimeZone75, 1645455248677L);
        long long86 = dateTimeZone56.getMillisKeepLocal(dateTimeZone60, 0L);
        org.joda.time.MutableDateTime mutableDateTime87 = dateTime51.toMutableDateTime(dateTimeZone56);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(copticChronology15);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 57635003L + "'", long21 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 893L + "'", long41 == 893L);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00" + "'", str44, "+00:00");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2022" + "'", str49, "2022");
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2238 + "'", int52 == 2238);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertNotNull(copticChronology57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 4 + "'", int65 == 4);
        org.junit.Assert.assertNotNull(localDate69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 292278993 + "'", int72 == 292278993);
        org.junit.Assert.assertNotNull(localDate73);
        org.junit.Assert.assertNotNull(instant74);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 893L + "'", long77 == 893L);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "+00:00" + "'", str80, "+00:00");
        org.junit.Assert.assertNotNull(timeZone81);
        org.junit.Assert.assertEquals(timeZone81.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1645455248677L + "'", long84 == 1645455248677L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertNotNull(mutableDateTime87);
    }

    @Test
    public void test18562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18562");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, 6);
        org.joda.time.LocalDate localDate12 = dateTime11.toLocalDate();
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.DateTime dateTime17 = dateTime14.withYearOfEra(53700);
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays((int) 'a');
        org.joda.time.DateTime.Property property20 = dateTime17.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int22 = dateTime17.get(dateTimeFieldType21);
        org.joda.time.DateTime.Property property23 = dateTime17.millisOfDay();
        org.joda.time.DateTime.Property property24 = dateTime17.minuteOfDay();
        org.joda.time.DateTime.Property property25 = dateTime17.dayOfMonth();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test18563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18563");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.Instant instant11 = instant9.withMillis((long) 1);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone17 = instant16.getZone();
        long long19 = dateTimeZone13.getMillisKeepLocal(dateTimeZone17, 0L);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) instant9, dateTimeZone17);
        org.joda.time.LocalTime localTime22 = localTime20.minusMillis(12);
        boolean boolean23 = copticChronology0.equals((java.lang.Object) localTime22);
        org.joda.time.DurationField durationField24 = copticChronology0.days();
        java.lang.String str25 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology0.dayOfWeek();
        java.util.Date date28 = new java.util.Date((long) (byte) 0);
        java.util.Date date30 = new java.util.Date((long) (byte) 0);
        int int31 = date30.getMinutes();
        int int32 = date30.getMinutes();
        boolean boolean33 = date28.before(date30);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromDateFields(date28);
        org.joda.time.LocalTime.Property property35 = localTime34.minuteOfHour();
        int int36 = dateTimeField26.getMinimumValue((org.joda.time.ReadablePartial) localTime34);
        org.joda.time.LocalTime.Property property37 = localTime34.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime39 = property37.setCopy("2022-02-21T15:02:53.692");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T15:02:53.692\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 893L + "'", long15 == 893L);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(durationField24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CopticChronology[UTC]" + "'", str25, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(property37);
    }

    @Test
    public void test18564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18564");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = dateTimeZone9.getName((long) (short) 0, locale13);
        java.util.TimeZone timeZone15 = dateTimeZone9.toTimeZone();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone15);
        java.time.ZoneId zoneId17 = timeZone15.toZoneId();
        java.lang.String str18 = timeZone15.getID();
        boolean boolean19 = timeZone7.hasSameRules(timeZone15);
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone7);
        java.util.TimeZone.setDefault(timeZone7);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645455813505,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=33,MILLISECOND=505,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(zoneId17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(calendar20);
// flaky:         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1645455813505,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=33,MILLISECOND=505,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test18565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18565");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime18 = dateTime6.plusMinutes(53631987);
        int int19 = dateTime18.getMillisOfSecond();
        org.joda.time.DateTime dateTime21 = dateTime18.plusWeeks(934);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfMonth();
        int int23 = dateTime21.getDayOfMonth();
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        long long35 = dateTimeZone26.convertLocalToUTC((long) 11, false);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 53737076, dateTimeZone26);
        int int38 = dateTimeZone26.getOffsetFromLocal((long) '4');
        long long40 = dateTimeZone26.previousTransition(1645455264467L);
        int int42 = dateTimeZone26.getStandardOffset((-587884L));
        org.joda.time.DateTime dateTime43 = dateTime21.toDateTime(dateTimeZone26);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.withDurationAdded(readableDuration44, 0);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "dayOfMonth" + "'", str15, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 523 + "'", int19 == 523);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 893L + "'", long28 == 893L);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 11L + "'", long35 == 11L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1645455264467L + "'", long40 == 1645455264467L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime46);
    }

    @Test
    public void test18566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18566");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        java.util.Date date18 = new java.util.Date((long) (byte) 0);
        int int19 = date18.getMinutes();
        int int20 = date18.getDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) date18, chronology21);
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        org.joda.time.DateTime dateTime33 = localDate22.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = localDate5.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate5.withPeriodAdded(readablePeriod35, 122);
        java.util.Date date39 = new java.util.Date((long) (byte) 0);
        int int40 = date39.getMinutes();
        int int41 = date39.getDay();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((java.lang.Object) date39, chronology42);
        org.joda.time.LocalDate localDate45 = localDate43.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant46 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone47 = instant46.getZone();
        long long49 = dateTimeZone47.nextTransition((long) 893);
        org.joda.time.Instant instant50 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone51 = instant50.getZone();
        long long53 = dateTimeZone47.getMillisKeepLocal(dateTimeZone51, 0L);
        org.joda.time.DateTime dateTime54 = localDate43.toDateTimeAtMidnight(dateTimeZone47);
        org.joda.time.LocalDate localDate56 = localDate43.minusDays(20);
        org.joda.time.LocalDate localDate58 = localDate56.plusWeeks(53);
        org.joda.time.LocalDate localDate60 = localDate58.withYearOfCentury(10);
        int int61 = localDate37.compareTo((org.joda.time.ReadablePartial) localDate58);
        int int62 = localDate58.size();
        org.joda.time.LocalDate.Property property63 = localDate58.weekyear();
        org.joda.time.LocalDate localDate65 = localDate58.plusMonths(44);
        org.joda.time.LocalDate.Property property66 = localDate58.yearOfCentury();
        boolean boolean68 = localDate58.equals((java.lang.Object) 580L);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 893L + "'", long28 == 893L);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 893L + "'", long49 == 893L);
        org.junit.Assert.assertNotNull(instant50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test18567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18567");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.lang.String str8 = property7.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime13 = dateTime10.withFieldAdded(durationFieldType11, 0);
        org.joda.time.DateTime.Property property14 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property14.roundHalfEvenCopy();
        int int16 = dateTime15.getYearOfCentury();
        long long17 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime18 = property7.withMaximumValue();
        java.util.Locale.Category category19 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale20 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(category19, locale20);
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone24);
        int int26 = dateTime25.getMinuteOfDay();
        int int27 = instant22.compareTo((org.joda.time.ReadableInstant) dateTime25);
        java.util.Locale locale28 = java.util.Locale.CANADA;
        java.util.Calendar calendar29 = dateTime25.toCalendar(locale28);
        java.lang.String str30 = locale20.getDisplayCountry(locale28);
        int int31 = property7.getMaximumShortTextLength(locale28);
        org.joda.time.DateTime dateTime33 = property7.addWrapFieldToCopy(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime35 = dateTime33.withMillisOfSecond(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[secondOfMinute]" + "'", str8, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + category19 + "' != '" + java.util.Locale.Category.FORMAT + "'", category19.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 903 + "'", int26 == 903);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1645455813586,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=33,MILLISECOND=586,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "China" + "'", str30, "China");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test18568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18568");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        long long3 = instant2.getMillis();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant2.withDurationAdded(readableDuration4, 1970);
        org.joda.time.MutableDateTime mutableDateTime7 = instant2.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        long long15 = copticChronology9.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField16 = copticChronology9.months();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType8.getField((org.joda.time.Chronology) copticChronology9);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology9.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology9.getZone();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology9.weekyear();
        boolean boolean22 = mutableDateTime7.equals((java.lang.Object) dateTimeField21);
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleKeys();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime29 = dateTime26.withFieldAdded(durationFieldType27, 0);
        org.joda.time.DateTime.Property property30 = dateTime26.minuteOfDay();
        org.joda.time.DateTime dateTime31 = property30.withMinimumValue();
        org.joda.time.DateTime.Property property32 = dateTime31.secondOfMinute();
        org.joda.time.DateTime dateTime33 = property32.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime35 = dateTime33.plusMillis(1970);
        boolean boolean36 = strSet24.remove((java.lang.Object) dateTime33);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(0, 9, (int) (byte) 1, 0, 15);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime47 = dateTime44.withFieldAdded(durationFieldType45, 0);
        org.joda.time.DateTime.Property property48 = dateTime44.minuteOfDay();
        org.joda.time.DateTime dateTime49 = property48.withMinimumValue();
        org.joda.time.DateTime.Property property50 = dateTime49.era();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withEra(1);
        int int55 = localDateTime54.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = localDateTime54.getFieldType(2);
        java.lang.String str58 = dateTimeFieldType57.getName();
        int int59 = dateTime49.get(dateTimeFieldType57);
        org.joda.time.chrono.CopticChronology copticChronology60 = org.joda.time.chrono.CopticChronology.getInstance();
        long long66 = copticChronology60.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField67 = copticChronology60.months();
        java.lang.String str68 = copticChronology60.toString();
        int int69 = copticChronology60.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField70 = copticChronology60.weekyears();
        org.joda.time.DateTimeField dateTimeField71 = copticChronology60.dayOfYear();
        java.lang.String str72 = copticChronology60.toString();
        boolean boolean73 = dateTimeFieldType57.isSupported((org.joda.time.Chronology) copticChronology60);
        org.joda.time.DurationFieldType durationFieldType74 = dateTimeFieldType57.getDurationType();
        int int75 = localDateTime42.get(dateTimeFieldType57);
        int int76 = dateTime33.get(dateTimeFieldType57);
        int int77 = mutableDateTime7.get(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 57635003L + "'", long15 == 57635003L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "dayOfMonth" + "'", str58, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 21 + "'", int59 == 21);
        org.junit.Assert.assertNotNull(copticChronology60);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 57635003L + "'", long66 == 57635003L);
        org.junit.Assert.assertNotNull(durationField67);
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "CopticChronology[UTC]" + "'", str68, "CopticChronology[UTC]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 4 + "'", int69 == 4);
        org.junit.Assert.assertNotNull(durationField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
// flaky:         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "CopticChronology[UTC]" + "'", str72, "CopticChronology[UTC]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(durationFieldType74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 21 + "'", int76 == 21);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
    }

    @Test
    public void test18569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18569");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(12);
        org.joda.time.LocalTime localTime15 = localTime11.plusMillis((int) (short) 10);
        java.lang.String str16 = localTime11.toString();
        org.joda.time.Chronology chronology17 = localTime11.getChronology();
        org.joda.time.LocalTime.Property property18 = localTime11.hourOfDay();
        org.joda.time.LocalTime localTime20 = localTime11.minusMillis(856);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 893L + "'", long6 == 893L);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "15:03:33.645" + "'", str16, "15:03:33.645");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test18570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18570");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime18 = dateTime6.plusMinutes(53631987);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.DateTime dateTime21 = dateTime18.withFieldAdded(durationFieldType19, 796);
        org.joda.time.DateTime dateTime23 = dateTime21.minusDays(0);
        org.joda.time.DateTime.Property property24 = dateTime21.hourOfDay();
        int int25 = dateTime21.getMonthOfYear();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "dayOfMonth" + "'", str15, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test18571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18571");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime3 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusDays(70);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withMillisOfSecond(558);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        long long16 = dateTimeZone14.nextTransition((long) 893);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        long long20 = dateTimeZone14.getMillisKeepLocal(dateTimeZone18, 0L);
        long long23 = dateTimeZone14.convertLocalToUTC((long) 11, false);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 53737076, dateTimeZone14);
        org.joda.time.Chronology chronology25 = chronology11.withZone(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(212346L, chronology25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 893L + "'", long16 == 893L);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 11L + "'", long23 == 11L);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test18572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18572");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("hi!");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        int int4 = calendar3.getFirstDayOfWeek();
        calendar3.setTimeInMillis((long) 425);
        java.util.Date date7 = calendar3.getTime();
        java.lang.Object obj8 = null;
        boolean boolean9 = calendar3.before(obj8);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=425,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=hi!,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=425,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18573");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 0L);
        java.lang.String str9 = dateTimeZone5.getName((long) 5);
        java.lang.String str10 = dateTimeZone5.toString();
        java.lang.String str11 = dateTimeZone5.getID();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test18574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18574");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime10.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime10.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime10.getFields();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.year();
        int int16 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.withCenturyOfEra(11);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime10.withPeriodAdded(readablePeriod19, 32772);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime10.plusYears(54037905);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withEra(1);
        int int28 = localDateTime27.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = localDateTime27.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.plusSeconds((int) (short) 1);
        int int33 = localDateTime32.getHourOfDay();
        org.joda.time.LocalDateTime.Property property34 = localDateTime32.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.minus(readablePeriod35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withEra(1);
        int int41 = localDateTime40.getMonthOfYear();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.withDurationAdded(readableDuration42, (int) (short) 0);
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType47 = dateTimeFieldType46.getDurationType();
        int int48 = localDateTime44.indexOf(dateTimeFieldType46);
        boolean boolean49 = localDateTime32.isSupported(dateTimeFieldType46);
        org.joda.time.LocalDateTime.Property property50 = localDateTime23.property(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(property50);
    }

    @Test
    public void test18575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18575");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.Instant instant11 = instant9.withMillis((long) 1);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone17 = instant16.getZone();
        long long19 = dateTimeZone13.getMillisKeepLocal(dateTimeZone17, 0L);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) instant9, dateTimeZone17);
        org.joda.time.LocalTime localTime22 = localTime20.minusMillis(12);
        org.joda.time.LocalTime localTime24 = localTime20.plusMillis((int) (short) 10);
        int[] intArray26 = copticChronology0.get((org.joda.time.ReadablePartial) localTime24, (long) 17);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField28 = copticChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology0.centuryOfEra();
        long long31 = dateTimeField29.roundHalfCeiling((long) 781);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 893L + "'", long15 == 893L);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 17]");
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 463708800000L + "'", long31 == 463708800000L);
    }

    @Test
    public void test18576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18576");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime1.getCenturyOfEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime1.plus(readableDuration7);
        long long9 = dateTime8.getMillis();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.days();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.secondOfMinute();
        org.joda.time.DurationField durationField13 = copticChronology11.months();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology11.getZone();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology11.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = copticChronology11.weeks();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology11.dayOfYear();
        boolean boolean18 = durationFieldType10.isSupported((org.joda.time.Chronology) copticChronology11);
        org.joda.time.DurationField durationField19 = copticChronology11.weeks();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology11.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology11.millisOfSecond();
        org.joda.time.DateTime dateTime22 = dateTime8.toDateTime((org.joda.time.Chronology) copticChronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = dateTime8.withYearOfCentury(54189152);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54189152 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 903 + "'", int2 == 903);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(dateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645455813755L + "'", long9 == 1645455813755L);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test18577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18577");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        int int2 = localTime1.getSecondOfMinute();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test18578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18578");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTime();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
    }

    @Test
    public void test18579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18579");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property2 = localDateTime0.property(dateTimeFieldType1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property3.addToCopy(31);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plus(readableDuration6);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        long long18 = dateTimeZone9.convertLocalToUTC((long) 11, false);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withEra(1);
        int int24 = localDateTime23.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = localDateTime23.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.plusSeconds((int) (short) 1);
        int int29 = localDateTime28.getHourOfDay();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.hourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundHalfCeilingCopy();
        java.util.Locale locale33 = java.util.Locale.UK;
        org.joda.time.LocalDateTime localDateTime34 = property30.setCopy("0", locale33);
        java.lang.String str35 = dateTimeZone9.getName(31536900000L, locale33);
        java.util.Locale locale38 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str39 = locale38.getISO3Language();
        java.util.Locale.Category category40 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale41 = java.util.Locale.getDefault(category40);
        java.lang.String str42 = locale38.getDisplayLanguage(locale41);
        java.lang.String str43 = dateTimeZone9.getShortName((long) 935, locale38);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime7, dateTimeZone9);
        int int45 = localDateTime44.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 11L + "'", long18 == 11L);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + category40 + "' != '" + java.util.Locale.Category.FORMAT + "'", category40.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00" + "'", str43, "+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
    }

    @Test
    public void test18580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18580");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.DateTime dateTime2 = localDateTime0.toDateTime(readableInstant1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra(1);
        int int7 = localDateTime6.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = localDateTime6.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.plusSeconds((int) (short) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minus(readablePeriod14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withDurationAdded(readableDuration16, 292278993);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.LocalDateTime.Property property20 = localDateTime11.property(dateTimeFieldType19);
        org.joda.time.DateTime dateTime21 = dateTime2.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime11.plusSeconds(900000);
        int int24 = localDateTime23.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.yearOfEra();
        int int26 = localDateTime23.getMillisOfSecond();
        int int27 = localDateTime23.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertNotNull(property25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 825 + "'", int26 == 825);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
    }

    @Test
    public void test18581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18581");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        java.util.Calendar calendar7 = builder2.build();
        java.util.Calendar.Builder builder11 = builder2.setWeekDate((int) (byte) 100, 44, (-292275054));
        java.util.Locale locale14 = new java.util.Locale("2022-02-21T14:57:57.181Z", "30");
        java.util.Calendar.Builder builder15 = builder2.setLocale(locale14);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=hi!,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals(locale14.toString(), "2022-02-21t14:57:57.181z_30");
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test18582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18582");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        int int6 = localDate5.getDayOfWeek();
        org.joda.time.LocalDate localDate8 = localDate5.minusWeeks(272);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("10");
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        boolean boolean14 = dateTimeZone12.isStandardOffset(791L);
        java.lang.String str15 = dateTimeZone12.getID();
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.DateTime.Property property17 = dateTime16.weekyear();
        java.lang.String str19 = dateTime16.toString("days");
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e0b\u5348197033" + "'", str19, "\u4e0b\u5348197033");
    }

    @Test
    public void test18583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18583");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfWeek();
        org.joda.time.LocalDate.Property property7 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.joda.time.DateTime dateTime9 = localDate8.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.DateTime dateTime12 = dateTime9.withYear(710);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test18584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18584");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        long long12 = copticChronology0.add((long) 272, 40140000L, 538);
        org.joda.time.DurationField durationField13 = copticChronology0.days();
        org.joda.time.DurationField durationField14 = copticChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology0.millisOfSecond();
        org.joda.time.DurationField durationField17 = copticChronology0.minutes();
        org.joda.time.DurationField durationField18 = copticChronology0.weeks();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 21595320272L + "'", long12 == 21595320272L);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test18585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18585");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("hi!");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        long long4 = calendar3.getTimeInMillis();
        int int6 = calendar3.getMinimum(0);
        java.util.Date date8 = new java.util.Date((long) (byte) 0);
        int int9 = date8.getMinutes();
        int int10 = date8.getDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) date8, chronology11);
        org.joda.time.LocalDate localDate14 = localDate12.withYear((-1));
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        int int17 = property15.getMaximumValueOverall();
        org.joda.time.LocalDate localDate18 = property15.roundCeilingCopy();
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        long long22 = dateTimeZone20.nextTransition((long) 893);
        java.util.Locale locale24 = java.util.Locale.CANADA;
        java.lang.String str25 = dateTimeZone20.getName((long) (short) 0, locale24);
        java.util.TimeZone timeZone26 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTime dateTime27 = localDate18.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.LocalDate localDate29 = localDate18.minusWeeks((int) (short) 0);
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str32 = localDate18.toString("7", locale31);
        int int33 = localDate18.getYearOfEra();
        org.joda.time.LocalDate localDate35 = localDate18.minusMonths(70);
        java.util.Date date36 = localDate18.toDate();
        calendar3.setTime(date36);
        java.lang.Object obj38 = calendar3.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-62198928000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=hi!,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1645455813890L + "'", long4 == 1645455813890L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 292278993 + "'", int17 == 292278993);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 893L + "'", long22 == 893L);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "7" + "'", str32, "7");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Jan 01 00:00:00 UTC 2");
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "java.util.GregorianCalendar[time=-62198928000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=hi!,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "java.util.GregorianCalendar[time=-62198928000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=hi!,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "java.util.GregorianCalendar[time=-62198928000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=hi!,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=2,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test18586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18586");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) chronology0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMonthOfYear(8);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        int int7 = localDateTime6.getWeekOfWeekyear();
        boolean boolean8 = localDateTime2.isEqual((org.joda.time.ReadablePartial) localDateTime6);
        int int9 = localDateTime2.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime2.minusSeconds(728);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test18587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18587");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withDefaultYear(867);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(650);
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.lang.String str14 = dateTimeZone11.getName((long) 32769, locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter9.withZone(dateTimeZone11);
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter9.getParser();
        boolean boolean17 = dateTimeFormatter9.isOffsetParsed();
        java.util.Locale locale18 = dateTimeFormatter9.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withPivotYear(492);
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.650" + "'", str14, "+00:00:00.650");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(dateTimeParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test18588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18588");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.roundCeilingCopy();
        org.joda.time.LocalTime localTime5 = property3.withMaximumValue();
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime5.plus(readablePeriod7);
        org.joda.time.LocalTime localTime10 = localTime5.plusMinutes(954);
        org.joda.time.LocalTime localTime12 = localTime10.plusMinutes(522);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test18589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18589");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        long long5 = copticChronology0.add((long) '#', 10L, (-1));
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.Chronology chronology7 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = copticChronology0.add(readablePeriod9, (long) 53989798, 57000);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 25L + "'", long5 == 25L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 53989798L + "'", long12 == 53989798L);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test18590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18590");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(650);
        long long3 = dateTimeZone1.previousTransition(37152000120L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(2022);
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, (long) 377);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology9.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 37152000120L + "'", long3 == 37152000120L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-995L) + "'", long7 == (-995L));
        org.junit.Assert.assertNotNull(copticChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test18591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18591");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate localDate9 = localDate7.plusWeeks(13);
        int int10 = localDate7.getWeekyear();
        org.joda.time.LocalDate.Property property11 = localDate7.yearOfCentury();
        org.joda.time.LocalDate localDate13 = property11.setCopy(0);
        org.joda.time.LocalDate localDate15 = localDate13.plusWeeks(469);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 510);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        long long21 = dateTimeZone19.nextTransition((long) 893);
        java.lang.String str23 = dateTimeZone19.getName((long) 100);
        org.joda.time.Interval interval24 = localDate17.toInterval(dateTimeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone27 = instant26.getZone();
        long long29 = dateTimeZone27.nextTransition((long) 893);
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = dateTimeZone27.getName((long) (short) 0, locale31);
        java.util.TimeZone timeZone33 = dateTimeZone27.toTimeZone();
        java.lang.String str34 = timeZone33.getID();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        long long37 = dateTimeZone19.getMillisKeepLocal(dateTimeZone35, 10698026400000L);
        org.joda.time.Interval interval38 = localDate13.toInterval(dateTimeZone35);
        org.joda.time.LocalDate.Property property39 = localDate13.yearOfCentury();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 893L + "'", long21 == 893L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 893L + "'", long29 == 893L);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10698026400000L + "'", long37 == 10698026400000L);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(property39);
    }

    @Test
    public void test18592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18592");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.DateTime dateTime2 = localDateTime0.toDateTime(readableInstant1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra(1);
        int int7 = localDateTime6.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = localDateTime6.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.plusSeconds((int) (short) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minus(readablePeriod14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withDurationAdded(readableDuration16, 292278993);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.LocalDateTime.Property property20 = localDateTime11.property(dateTimeFieldType19);
        org.joda.time.DateTime dateTime21 = dateTime2.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime11.minus(readablePeriod22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plus(readablePeriod24);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test18593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18593");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.roundCeilingCopy();
        org.joda.time.LocalTime localTime5 = property3.withMaximumValue();
        org.joda.time.LocalTime localTime7 = property3.addCopy((long) (-6048027));
        java.lang.String str8 = property3.getAsString();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime13 = dateTime10.withFieldAdded(durationFieldType11, 0);
        org.joda.time.DateTime.Property property14 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property14.withMinimumValue();
        org.joda.time.DateTime dateTime17 = property14.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime18 = property14.roundCeilingCopy();
        org.joda.time.DateTime dateTime20 = dateTime18.plusDays(114);
        org.joda.time.DateTime.Property property21 = dateTime18.hourOfDay();
        long long22 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime24 = dateTime18.plusYears(567);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "34" + "'", str8, "34");
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1645401625L) + "'", long22 == (-1645401625L));
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test18594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18594");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.year();
        org.joda.time.DurationField durationField7 = dateTimeField6.getLeapDurationField();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test18595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18595");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.centuryOfEra();
        int int12 = dateTimeField10.getMaximumValue(10598050562360L);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.dayOfMonth();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (-55596602), (org.joda.time.Chronology) copticChronology14);
        int[] intArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = dateTimeField10.set((org.joda.time.ReadablePartial) localTime17, 940, intArray19, 53996803);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53996803 for centuryOfEra must be in the range [1,2922728]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2922728 + "'", int12 == 2922728);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test18596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18596");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.secondOfMinute();
        org.joda.time.DurationField durationField5 = copticChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology3.getZone();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear(53716584);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withDefaultYear(500);
        org.joda.time.Chronology chronology13 = dateTimeFormatter8.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter8.withDefaultYear(1738);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        long long23 = copticChronology17.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField24 = copticChronology17.months();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType16.getField((org.joda.time.Chronology) copticChronology17);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField28 = copticChronology17.months();
        org.joda.time.DurationField durationField29 = copticChronology17.seconds();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter8.withChronology((org.joda.time.Chronology) copticChronology17);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology17.yearOfEra();
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 57635003L + "'", long23 == 57635003L);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test18597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18597");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withDefaultYear(867);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withDefaultYear(136);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withOffsetParsed();
        boolean boolean13 = dateTimeFormatter12.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withPivotYear(8);
        java.io.Writer writer16 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withEra(1);
        int int21 = localDateTime20.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime20.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray24 = localDateTime20.getFields();
        org.joda.time.LocalDateTime.Property property25 = localDateTime20.year();
        boolean boolean27 = localDateTime20.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime20.minusWeeks(20);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime20.plusSeconds(17);
        org.joda.time.LocalDateTime.Property property32 = localDateTime20.era();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.withWeekyear(9);
        int int37 = dateTime36.getMonthOfYear();
        org.joda.time.DateTime dateTime38 = dateTime36.withTimeAtStartOfDay();
        boolean boolean39 = dateTime38.isEqualNow();
        int int40 = property32.compareTo((org.joda.time.ReadableInstant) dateTime38);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(writer16, (org.joda.time.ReadableInstant) dateTime38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTimeFieldArray24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test18598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18598");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYearOfEra(669);
        int int9 = localDate5.getValue(0);
        org.joda.time.Interval interval10 = localDate5.toInterval();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test18599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18599");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField11 = copticChronology0.weekyears();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test18600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18600");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        boolean boolean8 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withDefaultYear(51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withDefaultYear((int) (short) 1);
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = dateTimeFormatter7.getPrinter();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNull(dateTimePrinter13);
    }

    @Test
    public void test18601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18601");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone7);
        boolean boolean10 = calendar8.before((java.lang.Object) 10L);
        calendar8.clear();
        calendar8.setLenient(false);
        int int14 = calendar8.getFirstDayOfWeek();
        calendar8.setFirstDayOfWeek(1735);
        // The following exception was thrown during execution in test generation
        try {
            calendar8.roll(608, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1735,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test18602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18602");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withPeriodAdded(readablePeriod7, 339);
        boolean boolean11 = localDateTime9.equals((java.lang.Object) 10598050502861L);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime16 = dateTime13.withFieldAdded(durationFieldType14, 0);
        org.joda.time.DateTime.Property property17 = dateTime13.minuteOfDay();
        org.joda.time.DateTime dateTime18 = property17.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property19 = dateTime18.secondOfMinute();
        org.joda.time.DateTime.Property property20 = dateTime18.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime25 = dateTime22.withFieldAdded(durationFieldType23, 0);
        org.joda.time.DateTime.Property property26 = dateTime22.minuteOfDay();
        org.joda.time.DateTime dateTime27 = property26.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property28 = dateTime27.secondOfMinute();
        java.lang.String str29 = property28.toString();
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str32 = property28.getAsShortText(locale31);
        java.lang.String str33 = property20.getAsShortText(locale31);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property20.getFieldType();
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology35.secondOfMinute();
        org.joda.time.DurationField durationField37 = copticChronology35.months();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology35.millisOfDay();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology35.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        long long43 = copticChronology35.add(readablePeriod40, (long) 816, (int) '#');
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType34.getField((org.joda.time.Chronology) copticChronology35);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime9.withField(dateTimeFieldType34, 921);
        org.joda.time.DateTime dateTime47 = localDateTime46.toDateTime();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Property[secondOfMinute]" + "'", str29, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "54240" + "'", str33, "54240");
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(copticChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 816L + "'", long43 == 816L);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
    }

    @Test
    public void test18603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18603");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.lang.String str8 = property7.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime13 = dateTime10.withFieldAdded(durationFieldType11, 0);
        org.joda.time.DateTime.Property property14 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property14.roundHalfEvenCopy();
        int int16 = dateTime15.getYearOfCentury();
        long long17 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withDayOfWeek(2);
        long long22 = dateTime19.getMillis();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime19.withPeriodAdded(readablePeriod23, 9);
        int int26 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean27 = dateTime15.isAfterNow();
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.Instant instant30 = instant28.withMillis((long) 1);
        org.joda.time.Instant instant31 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone32 = instant31.getZone();
        long long34 = dateTimeZone32.nextTransition((long) 893);
        org.joda.time.Instant instant35 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone36 = instant35.getZone();
        long long38 = dateTimeZone32.getMillisKeepLocal(dateTimeZone36, 0L);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((java.lang.Object) instant28, dateTimeZone36);
        org.joda.time.LocalTime localTime41 = localTime39.withMinuteOfHour(15);
        org.joda.time.DateTime dateTime42 = localTime41.toDateTimeToday();
        boolean boolean43 = dateTime15.isBefore((org.joda.time.ReadableInstant) dateTime42);
        java.util.Locale locale47 = new java.util.Locale("clockhourOfHalfday", "English (Canada)", "");
        java.lang.String str48 = locale47.getDisplayVariant();
        java.util.Locale locale49 = locale47.stripExtensions();
        boolean boolean50 = dateTime42.equals((java.lang.Object) locale49);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[secondOfMinute]" + "'", str8, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1645455814258L + "'", long22 == 1645455814258L);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 893L + "'", long34 == 893L);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals(locale47.toString(), "clockhourofhalfday_ENGLISH (CANADA)");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "clockhourofhalfday_ENGLISH (CANADA)");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test18604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18604");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, 6);
        int int12 = dateTime11.getMinuteOfHour();
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        long long16 = dateTimeZone14.nextTransition((long) 893);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        long long20 = dateTimeZone14.getMillisKeepLocal(dateTimeZone18, 0L);
        java.lang.String str22 = dateTimeZone18.getName((long) 5);
        long long24 = dateTimeZone18.nextTransition((long) 14);
        int int26 = dateTimeZone18.getStandardOffset(10598050484782L);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        boolean boolean28 = dateTime11.equals((java.lang.Object) localDateTime27);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "DateTimeField[yearOfCentury]", "100", "gregory", "2022-02-21T14:53:54.648", "53640", "DateTimeField[yearOfCentury]", "" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.lang.String str47 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList45);
        boolean boolean48 = strSet38.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41);
        int int49 = strSet38.size();
        java.util.Date date51 = new java.util.Date((long) (byte) 0);
        int int52 = date51.getMinutes();
        int int53 = date51.getTimezoneOffset();
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.fromDateFields(date51);
        boolean boolean55 = strSet38.contains((java.lang.Object) localDateTime54);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.withDurationAdded(readableDuration56, 8);
        int int59 = localDateTime27.compareTo((org.joda.time.ReadablePartial) localDateTime58);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 893L + "'", long16 == 893L);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 14L + "'", long24 == 14L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 7 + "'", int49 == 7);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test18605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18605");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        java.lang.String str3 = copticChronology0.toString();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        long long7 = durationField4.add((long) 935, 879);
        long long10 = durationField4.getValueAsLong(26748639888000L, (-27180002880L));
        org.joda.time.DurationFieldType durationFieldType11 = durationField4.getType();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        long long18 = copticChronology12.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology12.halfdayOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withEra(1);
        int int24 = localDateTime23.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = localDateTime23.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.plusSeconds((int) (byte) 10);
        int int29 = localDateTime28.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.plusYears(0);
        boolean boolean32 = copticChronology12.equals((java.lang.Object) localDateTime31);
        boolean boolean33 = durationFieldType11.isSupported((org.joda.time.Chronology) copticChronology12);
        org.joda.time.DurationField durationField34 = copticChronology12.seconds();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology12.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CopticChronology[UTC]" + "'", str3, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2135116800935L + "'", long7 == 2135116800935L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11019L + "'", long10 == 11019L);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 57635003L + "'", long18 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 22 + "'", int29 == 22);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test18606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18606");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        java.lang.String str8 = copticChronology0.toString();
        int int9 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField10 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfYear();
        java.lang.String str12 = copticChronology0.toString();
        java.lang.String str13 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.monthOfYear();
        org.joda.time.DurationField durationField15 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField16 = copticChronology0.millis();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[UTC]" + "'", str8, "CopticChronology[UTC]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CopticChronology[UTC]" + "'", str12, "CopticChronology[UTC]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CopticChronology[UTC]" + "'", str13, "CopticChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test18607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18607");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, 6);
        org.joda.time.LocalDate localDate12 = dateTime11.toLocalDate();
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime();
        org.joda.time.DateTime.Property property14 = dateTime13.secondOfMinute();
        org.joda.time.DateTime.Property property15 = dateTime13.weekyear();
        int int16 = dateTime13.getCenturyOfEra();
        org.joda.time.DateTime dateTime18 = dateTime13.minusHours(872);
        int int19 = dateTime18.getYear();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
    }

    @Test
    public void test18608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18608");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        java.util.Date date18 = new java.util.Date((long) (byte) 0);
        int int19 = date18.getMinutes();
        int int20 = date18.getDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) date18, chronology21);
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        org.joda.time.DateTime dateTime33 = localDate22.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = localDate5.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate5.withPeriodAdded(readablePeriod35, 122);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra(21);
        org.joda.time.LocalDate.Property property40 = localDate39.monthOfYear();
        org.joda.time.LocalDate.Property property41 = localDate39.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight42 = localDate39.toDateMidnight();
        int int43 = localDate39.getYearOfEra();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 893L + "'", long28 == 893L);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 21 + "'", int43 == 21);
    }

    @Test
    public void test18609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18609");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology1.months();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.hourOfHalfday();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.weekyearOfCentury();
        java.util.Date date10 = new java.util.Date((long) (byte) 0);
        int int11 = date10.getMinutes();
        int int12 = date10.getDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) date10, chronology13);
        org.joda.time.LocalDate localDate16 = localDate14.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        long long20 = dateTimeZone18.nextTransition((long) 893);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone22, 0L);
        org.joda.time.DateTime dateTime25 = localDate14.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.LocalDate localDate27 = localDate14.minusDays(20);
        org.joda.time.LocalDate localDate29 = localDate27.plusWeeks(53);
        org.joda.time.LocalDate localDate31 = localDate27.plusWeeks(20);
        org.joda.time.LocalDate localDate33 = localDate27.withYearOfCentury(6);
        org.joda.time.LocalDate localDate35 = localDate27.plusMonths(5);
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstance();
        long long42 = copticChronology36.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField43 = copticChronology36.months();
        java.util.Date date45 = new java.util.Date((long) (byte) 0);
        int int46 = date45.getMinutes();
        int int47 = date45.getDay();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((java.lang.Object) date45, chronology48);
        int int50 = localDate49.getDayOfWeek();
        org.joda.time.LocalDate localDate52 = localDate49.minusWeeks(272);
        int[] intArray54 = copticChronology36.get((org.joda.time.ReadablePartial) localDate52, (long) 21);
        copticChronology1.validate((org.joda.time.ReadablePartial) localDate27, intArray54);
        org.joda.time.DurationField durationField56 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField57 = copticChronology1.hourOfDay();
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate((long) 444, (org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField59 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField60 = copticChronology1.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology61 = org.joda.time.chrono.CopticChronology.getInstance();
        long long67 = copticChronology61.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField68 = copticChronology61.months();
        org.joda.time.DateTimeField dateTimeField69 = copticChronology61.yearOfCentury();
        org.joda.time.Instant instant70 = org.joda.time.Instant.now();
        org.joda.time.Instant instant72 = instant70.withMillis((long) 1);
        org.joda.time.Instant instant73 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone74 = instant73.getZone();
        long long76 = dateTimeZone74.nextTransition((long) 893);
        org.joda.time.Instant instant77 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone78 = instant77.getZone();
        long long80 = dateTimeZone74.getMillisKeepLocal(dateTimeZone78, 0L);
        org.joda.time.LocalTime localTime81 = new org.joda.time.LocalTime((java.lang.Object) instant70, dateTimeZone78);
        org.joda.time.LocalTime localTime83 = localTime81.minusMillis(12);
        boolean boolean84 = copticChronology61.equals((java.lang.Object) localTime83);
        org.joda.time.ReadablePeriod readablePeriod85 = null;
        long long88 = copticChronology61.add(readablePeriod85, (long) 129, 635);
        org.joda.time.DateTimeField dateTimeField89 = copticChronology61.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime90 = new org.joda.time.LocalTime((java.lang.Object) copticChronology1, (org.joda.time.Chronology) copticChronology61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.CopticChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 893L + "'", long20 == 893L);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(copticChronology36);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 57635003L + "'", long42 == 57635003L);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[1686, 4, 23]");
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(copticChronology61);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 57635003L + "'", long67 == 57635003L);
        org.junit.Assert.assertNotNull(durationField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(instant70);
        org.junit.Assert.assertNotNull(instant72);
        org.junit.Assert.assertNotNull(instant73);
        org.junit.Assert.assertNotNull(dateTimeZone74);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 893L + "'", long76 == 893L);
        org.junit.Assert.assertNotNull(instant77);
        org.junit.Assert.assertNotNull(dateTimeZone78);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 129L + "'", long88 == 129L);
        org.junit.Assert.assertNotNull(dateTimeField89);
    }

    @Test
    public void test18610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18610");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        long long4 = dateTimeZone2.nextTransition((long) 893);
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone6 = instant5.getZone();
        long long8 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, 0L);
        java.lang.String str10 = dateTimeZone6.getName((long) 5);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(0L, dateTimeZone6);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        java.util.Date date14 = dateTime12.toDate();
        int int15 = dateTime12.getCenturyOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean17 = dateTime12.isSupported(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withEra(1);
        int int22 = localDateTime21.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = localDateTime21.getFieldType(2);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.plus(readableDuration25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withMillisOfSecond(217);
        org.joda.time.DateTime dateTime29 = dateTime12.withFields((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.withPeriodAdded(readablePeriod30, 54106512);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 893L + "'", long4 == 893L);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Mon Feb 21 15:03:34 UTC 2022");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test18611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18611");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        java.util.Date date18 = new java.util.Date((long) (byte) 0);
        int int19 = date18.getMinutes();
        int int20 = date18.getDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) date18, chronology21);
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        org.joda.time.DateTime dateTime33 = localDate22.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = localDate5.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate5.withPeriodAdded(readablePeriod35, 122);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra(21);
        org.joda.time.LocalDate.Property property40 = localDate39.monthOfYear();
        org.joda.time.LocalDate localDate41 = property40.roundFloorCopy();
        org.joda.time.LocalDate localDate42 = property40.roundHalfCeilingCopy();
        java.util.Date date43 = localDate42.toDate();
        java.time.Instant instant44 = date43.toInstant();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 893L + "'", long28 == 893L);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Wed Jan 01 00:00:00 UTC 21");
        org.junit.Assert.assertNotNull(instant44);
    }

    @Test
    public void test18612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18612");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 53842350);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withDefaultYear(635);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withOffsetParsed();
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable8, 1645455788997L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test18613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18613");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        java.util.Date date10 = new java.util.Date((long) (byte) 0);
        int int11 = date10.getMinutes();
        int int12 = date10.getDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) date10, chronology13);
        boolean boolean15 = property8.equals((java.lang.Object) chronology13);
        org.joda.time.DurationField durationField16 = property8.getDurationField();
        org.joda.time.DateTimeField dateTimeField17 = property8.getField();
        org.joda.time.DateTime dateTime18 = property8.withMaximumValue();
        org.joda.time.DateTime dateTime19 = property8.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = property8.setCopy((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test18614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18614");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(990, 429, 54198815, 54143480, 529, 54025289);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54143480 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18615");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        java.lang.String str4 = dateTimeZone3.toString();
        long long6 = dateTimeZone3.nextTransition(1989932400000L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1989932400000L + "'", long6 == 1989932400000L);
    }

    @Test
    public void test18616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18616");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        int int5 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Chronology chronology7 = copticChronology0.withZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        long long12 = dateTimeZone10.nextTransition((long) 893);
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        long long16 = dateTimeZone10.getMillisKeepLocal(dateTimeZone14, 0L);
        java.lang.String str18 = dateTimeZone14.getName((long) 5);
        java.lang.String str19 = dateTimeZone14.toString();
        long long21 = dateTimeZone8.getMillisKeepLocal(dateTimeZone14, 1645455242295L);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusMonths(53631987);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withYearOfEra(971);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 893L + "'", long12 == 893L);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1645455242295L + "'", long21 == 1645455242295L);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test18617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18617");
        java.util.Date date6 = new java.util.Date(605, 53801809, 898, 0, (int) (short) 10, 468);
        date6.setTime(1645401599715L);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Feb 20 23:59:59 UTC 2022");
    }

    @Test
    public void test18618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18618");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusSeconds((int) (byte) 10);
        int int17 = localDateTime16.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusYears(0);
        boolean boolean20 = copticChronology0.equals((java.lang.Object) localDateTime19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology0.dayOfYear();
        boolean boolean26 = dateTimeField24.isLeap(3120000L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test18619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18619");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder5 = builder3.removeUnicodeLocaleAttribute("CAN");
        java.util.Locale.Builder builder6 = builder5.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test18620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18620");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusSeconds((int) (byte) 10);
        int int17 = localDateTime16.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusYears(0);
        boolean boolean20 = copticChronology0.equals((java.lang.Object) localDateTime19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField22 = copticChronology0.days();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        int int25 = localDateTime24.getWeekyear();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.plusHours((int) (byte) -1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = localDateTime24.getFieldTypes();
        long long30 = copticChronology0.set((org.joda.time.ReadablePartial) localDateTime24, 10598050475822L);
        int int31 = localDateTime24.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime24.minusYears(53716584);
        org.joda.time.LocalDateTime.Property property34 = localDateTime24.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime24.withEra(0);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray28);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10598051014533L + "'", long30 == 10598051014533L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20 + "'", int31 == 20);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
    }

    @Test
    public void test18621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18621");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.minutes();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test18622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18622");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 14);
        int int12 = dateTimeFormatter11.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withPivotYear((java.lang.Integer) 50178018);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter11.withDefaultYear(2);
        java.lang.Appendable appendable18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withEra(1);
        int int23 = localDateTime22.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = localDateTime22.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusSeconds((int) (short) 1);
        org.joda.time.LocalDateTime.Property property28 = localDateTime22.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime22.plus(readablePeriod29);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter17.printTo(appendable18, (org.joda.time.ReadablePartial) localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test18623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18623");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(692, 816, 53728689);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 692 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18624");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) chronology0);
        int int3 = localDateTime2.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withYear(1969);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusSeconds(587);
        org.joda.time.LocalDateTime.Property property8 = localDateTime2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) property8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test18625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18625");
        java.util.Locale locale3 = new java.util.Locale("2022-02-21T14:56:20.573", "weekyearOfCentury", "53760");
        org.junit.Assert.assertEquals(locale3.toString(), "2022-02-21t14:56:20.573_WEEKYEAROFCENTURY_53760");
    }

    @Test
    public void test18626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18626");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        long long4 = dateTimeZone2.nextTransition((long) 893);
        java.lang.String str6 = dateTimeZone2.getName((long) 100);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now(dateTimeZone2);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 7, dateTimeZone2);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 893L + "'", long4 == 893L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test18627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18627");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("hi!");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        long long4 = calendar3.getTimeInMillis();
        int int6 = calendar3.getMinimum(0);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("minuteOfDay");
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale9.getISO3Country();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone8, locale9);
        java.time.ZoneId zoneId12 = timeZone8.toZoneId();
        calendar3.setTimeZone(timeZone8);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime19 = dateTime16.withFieldAdded(durationFieldType17, 0);
        boolean boolean20 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime19);
        int int21 = dateTime14.getMillisOfDay();
        org.joda.time.DateTime dateTime23 = dateTime14.minusYears((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.minus(readablePeriod24);
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone27 = instant26.getZone();
        long long29 = dateTimeZone27.nextTransition((long) 893);
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = dateTimeZone27.getName((long) (short) 0, locale31);
        java.util.TimeZone timeZone33 = dateTimeZone27.toTimeZone();
        long long36 = dateTimeZone27.adjustOffset(25L, false);
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str40 = locale39.getISO3Language();
        java.lang.String str41 = dateTimeZone27.getShortName((long) (byte) 100, locale39);
        org.joda.time.DateTime dateTime42 = dateTime25.toDateTime(dateTimeZone27);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.DateTime dateTime44 = dateTime25.plus(readablePeriod43);
        boolean boolean45 = calendar3.before((java.lang.Object) dateTime25);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455814608,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=34,MILLISECOND=608,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1645455814608L + "'", long4 == 1645455814608L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CAN" + "'", str10, "CAN");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645455814608,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=34,MILLISECOND=608,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(zoneId12);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54214609 + "'", int21 == 54214609);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 893L + "'", long29 == 893L);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 25L + "'", long36 == 25L);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test18628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18628");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2022-02-21T14:59:18.953");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test18629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18629");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(285);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(0, 9, (int) (byte) 1, 0, 15);
        int int9 = localDateTime8.getMillisOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withEra(1);
        int int14 = localDateTime13.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = localDateTime13.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localDateTime13.getFields();
        org.joda.time.LocalDateTime.Property property18 = localDateTime13.year();
        boolean boolean20 = localDateTime13.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withEra(1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withEra(1);
        int int29 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean31 = localDateTime26.isSupported(dateTimeFieldType30);
        boolean boolean32 = localDateTime13.isSupported(dateTimeFieldType30);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime13.withEra((int) (byte) 1);
        org.joda.time.tz.Provider provider35 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet36 = provider35.getAvailableIDs();
        boolean boolean37 = strSet36.isEmpty();
        boolean boolean38 = localDateTime13.equals((java.lang.Object) boolean37);
        int int39 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        boolean boolean40 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        org.joda.time.LocalDateTime.Property property41 = localDateTime13.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 900000 + "'", int9 == 900000);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(provider35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test18630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18630");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withDefaultYear(867);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(650);
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.lang.String str14 = dateTimeZone11.getName((long) 32769, locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter9.withZone(dateTimeZone11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter9.withDefaultYear(940);
        boolean boolean18 = dateTimeFormatter9.isOffsetParsed();
        java.util.Locale locale19 = dateTimeFormatter9.getLocale();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.650" + "'", str14, "+00:00:00.650");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(locale19);
    }

    @Test
    public void test18631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18631");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear(670);
        boolean boolean16 = dateTimeFormatter13.isPrinter();
        java.lang.StringBuffer stringBuffer17 = null;
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime20 = localTime18.minusMinutes(845);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(stringBuffer17, (org.joda.time.ReadablePartial) localTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test18632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18632");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57634718L + "'", long7 == 57634718L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test18633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18633");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths(241);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime4.plus(readablePeriod7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMonths(3);
        long long11 = dateTime8.getMillis();
        java.lang.String str12 = dateTime8.toString();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime8.minus(readablePeriod13);
        java.util.GregorianCalendar gregorianCalendar15 = dateTime8.toGregorianCalendar();
        gregorianCalendar15.setTimeInMillis(48980818728370L);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1645455814713L + "'", long11 == 1645455814713L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022-02-21T15:03:34.998+00:00:00.285" + "'", str12, "2022-02-21T15:03:34.998+00:00:00.285");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(gregorianCalendar15);
    }

    @Test
    public void test18634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18634");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withDayOfWeek(2);
        boolean boolean21 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime26 = dateTime23.withFieldAdded(durationFieldType24, 0);
        org.joda.time.DateTime.Property property27 = dateTime23.minuteOfDay();
        org.joda.time.DateTime dateTime28 = property27.withMinimumValue();
        org.joda.time.DateTime.Property property29 = dateTime28.era();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withEra(1);
        int int34 = localDateTime33.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = localDateTime33.getFieldType(2);
        java.lang.String str37 = dateTimeFieldType36.getName();
        int int38 = dateTime28.get(dateTimeFieldType36);
        org.joda.time.chrono.CopticChronology copticChronology39 = org.joda.time.chrono.CopticChronology.getInstance();
        long long45 = copticChronology39.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField46 = copticChronology39.months();
        java.lang.String str47 = copticChronology39.toString();
        int int48 = copticChronology39.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField49 = copticChronology39.weekyears();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology39.dayOfYear();
        java.lang.String str51 = copticChronology39.toString();
        boolean boolean52 = dateTimeFieldType36.isSupported((org.joda.time.Chronology) copticChronology39);
        org.joda.time.DurationFieldType durationFieldType53 = dateTimeFieldType36.getDurationType();
        boolean boolean54 = dateTime6.isSupported(dateTimeFieldType36);
        org.joda.time.DateTime dateTime56 = dateTime6.minusMonths((int) '#');
        boolean boolean57 = dateTime56.isBeforeNow();
        org.joda.time.DateTime dateTime59 = dateTime56.withWeekyear(121);
        int int60 = dateTime56.getHourOfDay();
        org.joda.time.DateTime dateTime62 = dateTime56.withYearOfEra(54154547);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "dayOfMonth" + "'", str15, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "dayOfMonth" + "'", str37, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 21 + "'", int38 == 21);
        org.junit.Assert.assertNotNull(copticChronology39);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 57634718L + "'", long45 == 57634718L);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "CopticChronology[+00:00:00.285]" + "'", str47, "CopticChronology[+00:00:00.285]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "CopticChronology[+00:00:00.285]" + "'", str51, "CopticChronology[+00:00:00.285]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(dateTime62);
    }

    @Test
    public void test18635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18635");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra(1);
        int int13 = localDateTime12.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDateTime12.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDateTime12.getFields();
        org.joda.time.LocalDateTime.Property property17 = localDateTime12.year();
        org.joda.time.LocalDateTime.Property property18 = localDateTime12.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime12.minusSeconds(43);
        long long22 = copticChronology0.set((org.joda.time.ReadablePartial) localDateTime12, 0L);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology0.era();
        org.joda.time.DurationField durationField24 = copticChronology0.hours();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now((org.joda.time.Chronology) copticChronology0);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57634718L + "'", long6 == 57634718L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10598051014756L + "'", long22 == 10598051014756L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test18636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18636");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime10.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime10.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime10.getFields();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.year();
        boolean boolean17 = localDateTime10.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime10.minusWeeks(20);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime10.plusSeconds(17);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        long long24 = copticChronology0.set((org.joda.time.ReadablePartial) localDateTime21, (long) 53642140);
        org.joda.time.DurationField durationField25 = copticChronology0.halfdays();
        java.lang.String str26 = copticChronology0.toString();
        org.joda.time.Chronology chronology27 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.weekyearOfCentury();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10598051031771L + "'", long24 == 10598051031771L);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "CopticChronology[+00:00:00.285]" + "'", str26, "CopticChronology[+00:00:00.285]");
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test18637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18637");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57634718L + "'", long6 == 57634718L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test18638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18638");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusHours(893);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.plusMonths(44);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getRangeDurationType();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.property(dateTimeFieldType10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.minusMillis(2);
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime17 = property15.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minusDays(53683090);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test18639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18639");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.secondOfMinute();
        org.joda.time.DurationField durationField5 = copticChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology3.getZone();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear(53716584);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter8.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter8.withPivotYear(29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter8.withDefaultYear((-6048001));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = dateTimeFormatter15.parseLocalDate("14:50:36.741");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test18640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18640");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime10.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime10.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime10.getFields();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.year();
        int int16 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime.Property property17 = localDateTime10.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime19 = property17.addToCopy(893L);
        org.joda.time.LocalDateTime localDateTime20 = property17.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime21 = property17.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withMillisOfDay(53669992);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withMillisOfSecond(851);
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.millisOfDay();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test18641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18641");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.millisOfDay();
        org.joda.time.DurationField durationField15 = copticChronology1.years();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = copticChronology1.add(readablePeriod16, (long) 42001, 0);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology1.era();
        org.joda.time.DurationField durationField21 = copticChronology1.years();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57634718L + "'", long7 == 57634718L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 42001L + "'", long19 == 42001L);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test18642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18642");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("de");
        java.util.Locale.Builder builder8 = builder4.addUnicodeLocaleAttribute("German");
        java.util.Locale.Builder builder9 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder4.setLanguage("en_GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: en_GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test18643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18643");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.hourOfDay();
        org.joda.time.LocalTime.Property property4 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime6 = property4.getLocalTime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test18644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18644");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(12);
        org.joda.time.LocalTime.Property property14 = localTime13.hourOfDay();
        org.joda.time.LocalTime.Property property15 = localTime13.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = property15.addCopy((long) 53631687);
        org.joda.time.LocalTime localTime20 = property15.roundFloorCopy();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 893L + "'", long6 == 893L);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test18645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18645");
        java.util.Date date3 = new java.util.Date(27, 43, 582);
        int int4 = date3.getDate();
        org.junit.Assert.assertEquals(date3.toString(), "Fri Mar 04 00:00:00 UTC 1932");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test18646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18646");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("China");
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream2 = languageRangeList1.stream();
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeStream2);
    }

    @Test
    public void test18647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18647");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology1.months();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.hourOfHalfday();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(0L, (org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField10 = copticChronology1.weeks();
        long long11 = durationField10.getUnitMillis();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 604800000L + "'", long11 == 604800000L);
    }

    @Test
    public void test18648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18648");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusSeconds((int) (byte) 10);
        int int17 = localDateTime16.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusYears(0);
        boolean boolean20 = copticChronology0.equals((java.lang.Object) localDateTime19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField22 = copticChronology0.seconds();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.monthOfYear();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundHalfCeilingCopy();
        int[] intArray27 = copticChronology0.get((org.joda.time.ReadablePartial) localDateTime25, 129L);
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.minuteOfHour();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57634718L + "'", long6 == 57634718L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1686, 4, 23, 414]");
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test18649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18649");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = copticChronology2.months();
        org.joda.time.DateTimeZone dateTimeZone5 = copticChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = copticChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.minuteOfHour();
        boolean boolean9 = durationFieldType1.isSupported((org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology2.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test18650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18650");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.lang.String str8 = property7.toString();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str11 = property7.getAsShortText(locale10);
        org.joda.time.DateTime dateTime12 = property7.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DurationField durationField14 = property13.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        org.joda.time.DateTime dateTime16 = property13.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[secondOfMinute]" + "'", str8, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test18651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18651");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (short) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfCeilingCopy();
        int int12 = localDateTime11.getWeekyear();
        org.joda.time.Chronology chronology13 = localDateTime11.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = localDateTime11.getFieldTypes();
        org.joda.time.LocalDateTime.Property property15 = localDateTime11.yearOfCentury();
        boolean boolean16 = property15.isLeap();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18652");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(1969, 74, 46, 685, 634, 54123692);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 685 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18653");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        java.util.Date date3 = new java.util.Date((long) (byte) 0);
        int int4 = date3.getMinutes();
        int int5 = date3.getMinutes();
        boolean boolean6 = date1.before(date3);
        date1.setHours(11);
        int int9 = date1.getTimezoneOffset();
        date1.setMonth(808);
        int int12 = date1.getMonth();
        int int13 = date1.getHours();
        org.junit.Assert.assertEquals(date1.toString(), "Fri May 01 11:00:00 UTC 2037");
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test18654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18654");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatter7.getPrinter();
        int int11 = dateTimeFormatter7.getDefaultYear();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.Instant instant14 = instant12.withMillis((long) 1);
        long long15 = instant14.getMillis();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant18 = instant14.withDurationAdded(readableDuration16, 1970);
        org.joda.time.MutableDateTime mutableDateTime19 = instant14.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance();
        long long27 = copticChronology21.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField28 = copticChronology21.months();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType20.getField((org.joda.time.Chronology) copticChronology21);
        org.joda.time.DateTimeField dateTimeField30 = copticChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology21.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology21.weekyear();
        boolean boolean34 = mutableDateTime19.equals((java.lang.Object) dateTimeField33);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = dateTimeFormatter7.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime19, "53642151-02-21T15:03:53.000Z", 1470);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimePrinter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 57634718L + "'", long27 == 57634718L);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test18655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18655");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withEra(1);
        int int6 = localDateTime5.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localDateTime5.getFieldType(2);
        boolean boolean9 = localDateTime1.isSupported(dateTimeFieldType8);
        java.lang.String str10 = dateTimeFieldType8.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        long long18 = copticChronology12.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField19 = copticChronology12.months();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType11.getField((org.joda.time.Chronology) copticChronology12);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology12.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = copticChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology12.weekyear();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType8.getField((org.joda.time.Chronology) copticChronology12);
        org.joda.time.DurationField durationField27 = copticChronology12.years();
        boolean boolean28 = durationField27.isPrecise();
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "dayOfMonth" + "'", str10, "dayOfMonth");
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 57634718L + "'", long18 == 57634718L);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test18656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18656");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(category13, locale14);
        java.util.Calendar calendar16 = dateTime12.toCalendar(locale14);
        calendar16.setLenient(true);
        calendar16.set(258, (int) (short) 1, 0);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.fromCalendarFields(calendar16);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance();
        long long30 = copticChronology24.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology24.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology24.dayOfYear();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology24);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusDays(999);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.withWeekyear(852);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone38);
        int int40 = dateTime39.getMinuteOfDay();
        org.joda.time.DateTime dateTime42 = dateTime39.plusWeeks(10);
        int int43 = dateTime42.getMillisOfSecond();
        java.util.Date date44 = dateTime42.toDate();
        org.joda.time.DateTime dateTime45 = dateTime42.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime47 = dateTime42.minusHours((-2));
        int int48 = dateTime42.getMinuteOfDay();
        boolean boolean50 = dateTime42.isAfter((long) 569);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(dateTimeZone51);
        org.joda.time.DurationFieldType durationFieldType53 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime55 = dateTime52.withFieldAdded(durationFieldType53, 0);
        org.joda.time.DateTime.Property property56 = dateTime52.minuteOfDay();
        org.joda.time.DateTime dateTime57 = property56.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.yearOfEra();
        int int59 = dateTime57.get(dateTimeFieldType58);
        org.joda.time.DateTime.Property property60 = dateTime42.property(dateTimeFieldType58);
        int int61 = localDateTime33.get(dateTimeFieldType58);
        org.joda.time.DurationFieldType durationFieldType62 = dateTimeFieldType58.getDurationType();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(chronology63);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(chronology65);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.withEra(1);
        int int69 = localDateTime68.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = localDateTime68.getFieldType(2);
        boolean boolean72 = localDateTime64.isSupported(dateTimeFieldType71);
        java.lang.String str73 = dateTimeFieldType71.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology75 = org.joda.time.chrono.CopticChronology.getInstance();
        long long81 = copticChronology75.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField82 = copticChronology75.months();
        org.joda.time.DateTimeField dateTimeField83 = dateTimeFieldType74.getField((org.joda.time.Chronology) copticChronology75);
        org.joda.time.DateTimeField dateTimeField84 = copticChronology75.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField85 = copticChronology75.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone86 = copticChronology75.getZone();
        org.joda.time.DateTimeField dateTimeField87 = copticChronology75.weekyear();
        org.joda.time.DateTimeField dateTimeField88 = copticChronology75.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField89 = dateTimeFieldType71.getField((org.joda.time.Chronology) copticChronology75);
        org.joda.time.DateTimeField dateTimeField90 = copticChronology75.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField91 = copticChronology75.monthOfYear();
        org.joda.time.DateTimeField dateTimeField92 = copticChronology75.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField93 = dateTimeFieldType58.getField((org.joda.time.Chronology) copticChronology75);
        org.joda.time.LocalDateTime.Property property94 = localDateTime23.property(dateTimeFieldType58);
        int int95 = localDateTime23.size();
        org.joda.time.LocalDateTime localDateTime97 = localDateTime23.withYear(401);
        org.joda.time.Chronology chronology98 = localDateTime97.getChronology();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=-54022896000285,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.285,offset=285,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=258,MONTH=0,WEEK_OF_YEAR=6,WEEK_OF_MONTH=6,DAY_OF_MONTH=31,DAY_OF_YEAR=31,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=285,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(copticChronology24);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 57634718L + "'", long30 == 57634718L);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 903 + "'", int40 == 903);
        org.junit.Assert.assertNotNull(dateTime42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 346 + "'", int43 == 346);
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Mon May 02 15:03:35 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 903 + "'", int48 == 903);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2022 + "'", int59 == 2022);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1738 + "'", int61 == 1738);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "dayOfMonth" + "'", str73, "dayOfMonth");
        org.junit.Assert.assertNotNull(dateTimeFieldType74);
        org.junit.Assert.assertNotNull(copticChronology75);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 57634718L + "'", long81 == 57634718L);
        org.junit.Assert.assertNotNull(durationField82);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertNotNull(dateTimeField84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(dateTimeZone86);
        org.junit.Assert.assertNotNull(dateTimeField87);
        org.junit.Assert.assertNotNull(dateTimeField88);
        org.junit.Assert.assertNotNull(dateTimeField89);
        org.junit.Assert.assertNotNull(dateTimeField90);
        org.junit.Assert.assertNotNull(dateTimeField91);
        org.junit.Assert.assertNotNull(dateTimeField92);
        org.junit.Assert.assertNotNull(dateTimeField93);
        org.junit.Assert.assertNotNull(property94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 4 + "'", int95 == 4);
        org.junit.Assert.assertNotNull(localDateTime97);
        org.junit.Assert.assertNotNull(chronology98);
    }

    @Test
    public void test18657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18657");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.halfdays();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(650);
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.lang.String str14 = dateTimeZone11.getName((long) 32769, locale13);
        org.joda.time.Chronology chronology15 = copticChronology1.withZone(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology1.getZone();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(291834176L, dateTimeZone16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone16);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57634718L + "'", long7 == 57634718L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.650" + "'", str14, "+00:00:00.650");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test18658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18658");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMinuteOfHour();
        int int3 = localDateTime1.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withYearOfCentury(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekyear(9);
        org.joda.time.DateTime dateTime11 = dateTime8.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.plusMonths(241);
        org.joda.time.DateTime dateTime15 = dateTime11.withCenturyOfEra(669);
        int int16 = dateTime11.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime17 = dateTime11.toLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime22 = dateTime19.withFieldAdded(durationFieldType20, 0);
        org.joda.time.DateTime dateTime24 = dateTime19.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTime.Property property25 = dateTime19.monthOfYear();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        java.lang.String str27 = property25.toString();
        int int28 = property25.getMinimumValue();
        org.joda.time.DateTime dateTime29 = property25.roundCeilingCopy();
        java.lang.String str30 = dateTime29.toString();
        int int31 = dateTime29.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime36 = dateTime33.withFieldAdded(durationFieldType34, 0);
        org.joda.time.DateTime.Property property37 = dateTime33.minuteOfDay();
        org.joda.time.DateTime dateTime38 = property37.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property39 = dateTime38.secondOfMinute();
        java.util.Locale locale40 = java.util.Locale.CANADA;
        java.util.Calendar calendar41 = dateTime38.toCalendar(locale40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime.Property property43 = dateTime38.property(dateTimeFieldType42);
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType42.getRangeDurationType();
        boolean boolean45 = dateTime29.isSupported(dateTimeFieldType42);
        int int46 = dateTime11.get(dateTimeFieldType42);
        boolean boolean47 = localDateTime1.isSupported(dateTimeFieldType42);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Property[monthOfYear]" + "'", str27, "Property[monthOfYear]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2022-03-01T00:00:00.000+00:00:00.285" + "'", str30, "2022-03-01T00:00:00.000+00:00:00.285");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar41);
// flaky:         org.junit.Assert.assertEquals(calendar41.toString(), "java.util.GregorianCalendar[time=1645455839715,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.285,offset=285,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=4,SECOND=0,MILLISECOND=0,ZONE_OFFSET=285,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test18659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18659");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        date1.setSeconds(0);
        int int4 = date1.getDay();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.fromDateFields(date1);
        date1.setSeconds(149);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromDateFields(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:02:29 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test18660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18660");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear((int) (short) 0);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone8.nextTransition((long) 893);
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        long long14 = dateTimeZone8.getMillisKeepLocal(dateTimeZone12, 0L);
        long long17 = dateTimeZone8.convertLocalToUTC((long) 11, false);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withEra(1);
        int int23 = localDateTime22.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = localDateTime22.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusSeconds((int) (short) 1);
        int int28 = localDateTime27.getHourOfDay();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.hourOfDay();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundHalfCeilingCopy();
        java.util.Locale locale32 = java.util.Locale.UK;
        org.joda.time.LocalDateTime localDateTime33 = property29.setCopy("0", locale32);
        java.lang.String str34 = dateTimeZone8.getName(31536900000L, locale32);
        boolean boolean36 = dateTimeZone8.isStandardOffset((long) 993);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter3.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter3.withDefaultYear(53659644);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant40 = org.joda.time.Instant.parse("2022-02-21T15:01:38.605", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 893L + "'", long10 == 893L);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 11L + "'", long17 == 11L);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 15 + "'", int28 == 15);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
    }

    @Test
    public void test18661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18661");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.months();
        boolean boolean10 = durationFieldType0.isSupported((org.joda.time.Chronology) copticChronology1);
        org.joda.time.Chronology chronology11 = copticChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.weekyear();
        java.util.Set<java.lang.String> strSet15 = java.util.Calendar.getAvailableCalendarTypes();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "DateTimeField[yearOfCentury]", "100", "gregory", "2022-02-21T14:53:54.648", "53640", "DateTimeField[yearOfCentury]", "" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.lang.String str34 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList32);
        boolean boolean35 = strSet25.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.withDayOfWeek(2);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((java.lang.Object) dateTime37);
        int int41 = dateTime40.getYearOfCentury();
        boolean boolean42 = strSet25.remove((java.lang.Object) int41);
        strSet25.clear();
        java.util.Iterator<java.lang.String> strItor44 = strSet25.iterator();
        java.util.Locale.LanguageRange[] languageRangeArray45 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList46 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList46, languageRangeArray45);
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.lang.String str52 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strList50);
        java.lang.String[] strArray54 = new java.lang.String[] { "Property[secondOfMinute]" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        java.lang.String str57 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, (java.util.Collection<java.lang.String>) strList55);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList46, strMap58);
        boolean boolean60 = strSet25.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap61 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList62 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList59, strMap61);
        boolean boolean63 = strSet15.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream64 = languageRangeList59.stream();
        boolean boolean65 = copticChronology1.equals((java.lang.Object) languageRangeList59);
        org.joda.time.LocalTime localTime66 = org.joda.time.LocalTime.now((org.joda.time.Chronology) copticChronology1);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57634718L + "'", long7 == 57634718L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 22 + "'", int41 == 22);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strItor44);
        org.junit.Assert.assertNotNull(languageRangeArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(languageRangeList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(languageRangeList62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(languageRangeStream64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(localTime66);
    }

    @Test
    public void test18662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18662");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean10 = localDateTime5.isSupported(dateTimeFieldType9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime5.hourOfDay();
        int int12 = localDateTime5.getDayOfMonth();
        org.joda.time.LocalDateTime.Property property13 = localDateTime5.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime5.withFields((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime5.hourOfDay();
        java.util.Locale locale19 = new java.util.Locale("53876713", "en-CA");
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        int int22 = dateTime21.getMinuteOfDay();
        org.joda.time.DateTime dateTime24 = dateTime21.plusWeeks(10);
        org.joda.time.DateTime.Property property25 = dateTime21.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar26 = dateTime21.toGregorianCalendar();
        gregorianCalendar26.clear();
        java.util.Locale locale30 = new java.util.Locale("hi!", "");
        boolean boolean31 = locale30.hasExtensions();
        boolean boolean32 = gregorianCalendar26.after((java.lang.Object) locale30);
        java.util.Locale locale36 = new java.util.Locale("+00:00", "Property[monthOfYear]", "java.util.GregorianCalendar[time=1640995200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        java.lang.String str37 = locale36.getLanguage();
        java.lang.String str38 = locale30.getDisplayCountry(locale36);
        java.lang.String str39 = locale19.getDisplayVariant(locale36);
        int int40 = property16.getMaximumTextLength(locale36);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals(locale19.toString(), "53876713_EN-CA");
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 903 + "'", int22 == 903);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(gregorianCalendar26);
        org.junit.Assert.assertEquals(locale30.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals(locale36.toString(), "+00:00_PROPERTY[MONTHOFYEAR]_java.util.GregorianCalendar[time=1640995200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
    }

    @Test
    public void test18663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18663");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        java.util.Date date18 = new java.util.Date((long) (byte) 0);
        int int19 = date18.getMinutes();
        int int20 = date18.getDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) date18, chronology21);
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        org.joda.time.DateTime dateTime33 = localDate22.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = localDate5.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate5.withPeriodAdded(readablePeriod35, 122);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra(21);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 52);
        org.joda.time.DateTime dateTime43 = localDate37.toDateTimeAtMidnight(dateTimeZone42);
        org.joda.time.LocalDate.Property property44 = localDate37.yearOfCentury();
        org.joda.time.LocalDate localDate45 = property44.getLocalDate();
        org.joda.time.LocalDate localDate47 = localDate45.withYearOfEra(952);
        org.joda.time.LocalDate.Property property48 = localDate45.yearOfEra();
        org.joda.time.LocalDate localDate50 = property48.addWrapFieldToCopy(54063198);
        int int51 = localDate50.getYearOfEra();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 893L + "'", long28 == 893L);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 54065168 + "'", int51 == 54065168);
    }

    @Test
    public void test18664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18664");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime16 = dateTime13.withFieldAdded(durationFieldType14, 0);
        org.joda.time.DateTime.Property property17 = dateTime13.minuteOfDay();
        org.joda.time.DateTime dateTime18 = property17.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property19 = dateTime18.secondOfMinute();
        org.joda.time.DateTime.Property property20 = dateTime18.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime25 = dateTime22.withFieldAdded(durationFieldType23, 0);
        org.joda.time.DateTime.Property property26 = dateTime22.minuteOfDay();
        org.joda.time.DateTime dateTime27 = property26.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property28 = dateTime27.secondOfMinute();
        java.lang.String str29 = property28.toString();
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str32 = property28.getAsShortText(locale31);
        java.lang.String str33 = property20.getAsShortText(locale31);
        java.lang.String str34 = dateTimeField10.getAsText(2, locale31);
        java.util.Locale.Category category35 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale36 = java.util.Locale.getDefault(category35);
        java.util.Locale locale37 = java.util.Locale.CHINESE;
        java.util.Locale.setDefault(category35, locale37);
        int int39 = dateTimeField10.getMaximumShortTextLength(locale37);
        org.joda.time.tz.NameProvider nameProvider41 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider41);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider41);
        java.util.Locale locale44 = null;
        java.lang.String str47 = nameProvider41.getShortName(locale44, "470", "-0001-01-01T14:55:59.720Z");
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("2022-02-21T14:57:30.065");
        java.lang.String str52 = nameProvider41.getName(locale49, "59", "1970-1-1 0:00:00");
        java.lang.String str53 = dateTimeField10.getAsShortText(633, locale49);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = dateTimeField10.getDifference((long) 20706277, 21396052800000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -21396032093723");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57634718L + "'", long7 == 57634718L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Property[secondOfMinute]" + "'", str29, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "54240" + "'", str33, "54240");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2" + "'", str34, "2");
        org.junit.Assert.assertTrue("'" + category35 + "' != '" + java.util.Locale.Category.FORMAT + "'", category35.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "zh");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(nameProvider41);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "633" + "'", str53, "633");
    }

    @Test
    public void test18665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18665");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        boolean boolean4 = dateTimeField3.isSupported();
        int int5 = dateTimeField3.getMinimumValue();
        int int8 = dateTimeField3.getDifference(32L, 35L);
        org.joda.time.DurationField durationField9 = dateTimeField3.getRangeDurationField();
        int int10 = dateTimeField3.getMaximumValue();
        long long12 = dateTimeField3.roundHalfEven(1900816616L);
        long long14 = dateTimeField3.roundCeiling(0L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-9676800285L) + "'", long12 == (-9676800285L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 21859199715L + "'", long14 == 21859199715L);
    }

    @Test
    public void test18666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18666");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withDayOfWeek(2);
        boolean boolean21 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime18);
        boolean boolean22 = dateTime6.isEqualNow();
        org.joda.time.DateTime.Property property23 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime25 = dateTime6.plusMinutes(944);
        org.joda.time.DateTime dateTime27 = dateTime25.withYearOfEra(615);
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfHour();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "dayOfMonth" + "'", str15, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test18667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18667");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.DurationField durationField11 = dateTimeField10.getDurationField();
        long long14 = durationField11.add(22291200000L, (-7));
        boolean boolean15 = durationField11.isSupported();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57634718L + "'", long6 == 57634718L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-198547200000L) + "'", long14 == (-198547200000L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test18668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18668");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfWeek(2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) dateTime1);
        int int5 = dateTime4.getEra();
        org.joda.time.TimeOfDay timeOfDay6 = dateTime4.toTimeOfDay();
        org.joda.time.DateTime dateTime8 = dateTime4.plusSeconds(21);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime4.withDurationAdded(readableDuration9, 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(300, 11);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 9, dateTimeZone15);
        org.joda.time.DateTime.Property property17 = dateTime16.hourOfDay();
        boolean boolean18 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property19 = dateTime16.millisOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test18669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18669");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        java.lang.String str3 = copticChronology0.toString();
        org.joda.time.DurationField durationField4 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField6 = dateTimeField5.getLeapDurationField();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CopticChronology[+00:00:00.285]" + "'", str3, "CopticChronology[+00:00:00.285]");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNull(durationField6);
    }

    @Test
    public void test18670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18670");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.monthOfYear();
        java.lang.String str5 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMinutes(187);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withHourOfDay(49);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CopticChronology[+00:00:00.285]" + "'", str5, "CopticChronology[+00:00:00.285]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test18671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18671");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.withCenturyOfEra(14);
        org.joda.time.DateTime dateTime19 = localDate18.toDateTimeAtCurrentTime();
        java.util.GregorianCalendar gregorianCalendar20 = dateTime19.toGregorianCalendar();
        int int21 = gregorianCalendar20.getWeeksInWeekYear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime26 = dateTime23.withFieldAdded(durationFieldType24, 0);
        org.joda.time.DateTime.Property property27 = dateTime23.minuteOfDay();
        org.joda.time.DateTime dateTime28 = property27.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property29 = dateTime28.secondOfMinute();
        org.joda.time.DateTime.Property property30 = dateTime28.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime35 = dateTime32.withFieldAdded(durationFieldType33, 0);
        org.joda.time.DateTime.Property property36 = dateTime32.minuteOfDay();
        org.joda.time.DateTime dateTime37 = property36.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property38 = dateTime37.secondOfMinute();
        java.lang.String str39 = property38.toString();
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str42 = property38.getAsShortText(locale41);
        java.lang.String str43 = property30.getAsShortText(locale41);
        java.util.Locale locale44 = java.util.Locale.GERMANY;
        java.lang.String str45 = property30.getAsText(locale44);
        org.joda.time.DateTime dateTime46 = property30.withMinimumValue();
        org.joda.time.DateTime dateTime48 = property30.addToCopy(5156L);
        org.joda.time.DateTime dateTime49 = property30.roundFloorCopy();
        boolean boolean50 = gregorianCalendar20.before((java.lang.Object) dateTime49);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = gregorianCalendar20.getLeastMaximum(53766827);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53766827");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(gregorianCalendar20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Property[secondOfMinute]" + "'", str39, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "0" + "'", str42, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "54240" + "'", str43, "54240");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "54240" + "'", str45, "54240");
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test18672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18672");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder6 = builder3.setRegion("735");
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder8 = builder6.clearExtensions();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "_735");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test18673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18673");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property3.addCopy((long) 52);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.LocalTime localTime7 = property3.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime7.plus(readablePeriod8);
        org.joda.time.LocalTime localTime11 = localTime7.plusHours(635);
        org.joda.time.LocalTime localTime13 = localTime11.withMillisOfSecond(0);
        int int14 = localTime11.getHourOfDay();
        org.joda.time.LocalTime localTime16 = localTime11.plusHours(723);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType18 = dateTimeFieldType17.getDurationType();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType17.getRangeDurationType();
        boolean boolean20 = localTime16.isSupported(durationFieldType19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test18674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18674");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        java.util.Calendar.Builder builder8 = builder6.setLenient(true);
        java.util.Calendar calendar9 = builder6.build();
        java.util.Date date11 = new java.util.Date((long) (byte) 0);
        int int12 = date11.getMinutes();
        date11.setHours(893);
        java.util.Calendar.Builder builder15 = builder6.setInstant(date11);
        java.util.Calendar calendar16 = builder15.build();
        java.util.Date date18 = new java.util.Date((long) (byte) 0);
        java.util.Date date20 = new java.util.Date((long) (byte) 0);
        int int21 = date20.getMinutes();
        int int22 = date20.getMinutes();
        boolean boolean23 = date18.before(date20);
        date18.setHours(11);
        date18.setMinutes(852);
        int int28 = date18.getMonth();
        java.util.Calendar.Builder builder29 = builder15.setInstant(date18);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=hi!,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date11.toString(), "Sat Feb 07 05:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=3214800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=hi!,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=7,DAY_OF_YEAR=38,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date18.toString(), "Fri Jan 02 01:12:00 UTC 1970");
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test18675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18675");
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology2.halfdayOfDay();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeField dateTimeField5 = copticChronology2.clockhourOfDay();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) ' ', (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology2.halfdayOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 53642140, (org.joda.time.Chronology) copticChronology2);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test18676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18676");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property3.addCopy((long) 52);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.LocalTime localTime7 = property3.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime7.plus(readablePeriod8);
        org.joda.time.LocalTime.Property property10 = localTime7.millisOfDay();
        org.joda.time.LocalTime localTime12 = property10.addWrapFieldToCopy(86399);
        org.joda.time.LocalTime localTime13 = property10.withMinimumValue();
        org.joda.time.LocalTime localTime15 = property10.addCopy(23);
        java.util.Locale locale20 = new java.util.Locale("fr_CA", "", "-899590");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = property10.setCopy("2022-2-15 14:59:50", locale20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-2-15 14:59:50\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_ca__-899590");
    }

    @Test
    public void test18677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18677");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.secondOfMinute();
        org.joda.time.DurationField durationField5 = copticChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology3.monthOfYear();
        long long9 = dateTimeField7.roundHalfCeiling((long) (short) 100);
        long long11 = dateTimeField7.remainder((long) 69);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str14 = locale13.getISO3Language();
        int int15 = dateTimeField7.getMaximumShortTextLength(locale13);
        boolean boolean16 = dateTimeField7.isLenient();
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        long long21 = dateTimeZone19.nextTransition((long) 893);
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.lang.String str24 = dateTimeZone19.getName((long) (short) 0, locale23);
        java.lang.String str25 = dateTimeField7.getAsText(1645455240177L, locale23);
        java.util.Locale.Builder builder26 = builder1.setLocale(locale23);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime31 = dateTime28.withFieldAdded(durationFieldType29, 0);
        org.joda.time.DateTime.Property property32 = dateTime28.minuteOfDay();
        org.joda.time.DateTime dateTime33 = property32.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property34 = dateTime33.secondOfMinute();
        java.lang.String str35 = property34.toString();
        java.util.Locale locale37 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str38 = property34.getAsShortText(locale37);
        java.util.Locale locale39 = java.util.Locale.JAPANESE;
        java.util.Locale locale43 = new java.util.Locale("java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]", "millisOfSecond", "11");
        java.lang.String str44 = locale39.getDisplayLanguage(locale43);
        java.lang.String str45 = locale37.getDisplayLanguage(locale39);
        java.util.Locale.Builder builder46 = builder1.setLocale(locale37);
        java.util.Locale.Builder builder47 = builder46.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder49 = builder47.setScript("14:58:03.372");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 14:58:03.372 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 691199715L + "'", long9 == 691199715L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1900800354L + "'", long11 == 1900800354L);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 893L + "'", long21 == 893L);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "6" + "'", str25, "6");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Property[secondOfMinute]" + "'", str35, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja");
        org.junit.Assert.assertEquals(locale43.toString(), "java.util.gregoriancalendar[time=6,arefieldsset=true,areallfieldsset=true,lenient=true,zone=sun.util.calendar.zoneinfo[id=\"hi!\",offset=0,dstsavings=0,usedaylight=false,transitions=0,lastrule=null],firstdayofweek=1,minimaldaysinfirstweek=1,era=1,year=1970,month=0,week_of_year=1,week_of_month=1,day_of_month=1,day_of_year=1,day_of_week=5,day_of_week_in_month=1,am_pm=0,hour=0,hour_of_day=0,minute=0,second=0,millisecond=6,zone_offset=0,dst_offset=0]_MILLISOFSECOND_11");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Japanese" + "'", str44, "Japanese");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test18678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18678");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Date date4 = new java.util.Date((long) (byte) 0);
        int int5 = date4.getMinutes();
        int int6 = date4.getDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) date4, chronology7);
        int int9 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate11 = localDate8.minusWeeks(272);
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        long long16 = dateTimeZone14.nextTransition((long) 893);
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.lang.String str19 = dateTimeZone14.getName((long) (short) 0, locale18);
        java.lang.String str20 = localDate8.toString("+00:00", locale18);
        java.lang.String str22 = locale18.getExtension('x');
        java.util.Locale.setDefault(category0, locale18);
        boolean boolean24 = locale18.hasExtensions();
        java.util.Locale locale25 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str26 = locale18.getDisplayScript(locale25);
        java.lang.String str27 = locale18.getISO3Language();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 893L + "'", long16 == 893L);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "eng" + "'", str27, "eng");
    }

    @Test
    public void test18679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18679");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusHours(893);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minus(readablePeriod6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.dayOfYear();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = property8.addToCopy((long) 53700);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusSeconds(2000);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks(53875100);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.plusMillis(314);
        int int18 = localDateTime17.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType20 = localDateTime17.getFieldType(418);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 418");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test18680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18680");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar6 = dateTime1.toGregorianCalendar();
        int int7 = gregorianCalendar6.getFirstDayOfWeek();
        gregorianCalendar6.setMinimalDaysInFirstWeek((int) (byte) 1);
        gregorianCalendar6.setFirstDayOfWeek((int) '#');
        java.util.TimeZone timeZone12 = gregorianCalendar6.getTimeZone();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance();
        long long19 = copticChronology13.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology13.halfdayOfDay();
        org.joda.time.Chronology chronology21 = copticChronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology13.clockhourOfHalfday();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        java.util.Locale locale26 = java.util.Locale.ENGLISH;
        java.lang.String str27 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) localDateTime24, 53664488, locale26);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone12, locale26);
        long long29 = calendar28.getTimeInMillis();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 903 + "'", int2 == 903);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(copticChronology13);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 57634718L + "'", long19 == 57634718L);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "53664488" + "'", str27, "53664488");
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1645455815501,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.285,offset=285,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=35,MILLISECOND=786,ZONE_OFFSET=285,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1645455815501L + "'", long29 == 1645455815501L);
    }

    @Test
    public void test18681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18681");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        int int11 = localTime10.getHourOfDay();
        org.joda.time.LocalTime.Property property12 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property12.addCopy((long) 52);
        java.util.Calendar.Builder builder15 = new java.util.Calendar.Builder();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        long long22 = copticChronology16.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField23 = copticChronology16.months();
        java.lang.String str24 = copticChronology16.toString();
        int int25 = copticChronology16.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology16.monthOfYear();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) 43);
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance();
        long long35 = copticChronology29.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology29.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology29.clockhourOfDay();
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.Instant instant40 = instant38.withMillis((long) 1);
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone42 = instant41.getZone();
        long long44 = dateTimeZone42.nextTransition((long) 893);
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone46 = instant45.getZone();
        long long48 = dateTimeZone42.getMillisKeepLocal(dateTimeZone46, 0L);
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((java.lang.Object) instant38, dateTimeZone46);
        org.joda.time.LocalTime localTime51 = localTime49.minusMillis(12);
        org.joda.time.LocalTime localTime53 = localTime49.plusMillis((int) (short) 10);
        int[] intArray55 = copticChronology29.get((org.joda.time.ReadablePartial) localTime53, (long) 17);
        int int56 = dateTimeField26.getMaximumValue((org.joda.time.ReadablePartial) localTime28, intArray55);
        java.util.Calendar.Builder builder57 = builder15.setFields(intArray55);
        copticChronology0.validate((org.joda.time.ReadablePartial) localTime14, intArray55);
        int int59 = localTime14.size();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(chronology60);
        int int62 = localTime61.getHourOfDay();
        org.joda.time.LocalTime.Property property63 = localTime61.hourOfDay();
        org.joda.time.LocalTime.Property property64 = localTime61.millisOfSecond();
        org.joda.time.LocalTime localTime65 = property64.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime67 = localTime65.minusMinutes(53);
        org.joda.time.DurationFieldType durationFieldType68 = org.joda.time.DurationFieldType.days();
        boolean boolean69 = localTime65.isSupported(durationFieldType68);
        org.joda.time.LocalTime.Property property70 = localTime65.millisOfDay();
        int int71 = localTime65.getSecondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.LocalTime localTime74 = localTime65.withPeriodAdded(readablePeriod72, 0);
        org.joda.time.ReadablePeriod readablePeriod75 = null;
        org.joda.time.LocalTime localTime77 = localTime74.withPeriodAdded(readablePeriod75, 558);
        boolean boolean78 = localTime14.isAfter((org.joda.time.ReadablePartial) localTime77);
        org.joda.time.LocalTime.Property property79 = localTime14.secondOfMinute();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57634718L + "'", long6 == 57634718L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(copticChronology16);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 57634718L + "'", long22 == 57634718L);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "CopticChronology[+00:00:00.285]" + "'", str24, "CopticChronology[+00:00:00.285]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(copticChronology29);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 57634718L + "'", long35 == 57634718L);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 893L + "'", long44 == 893L);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 0, 0, 302]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 13 + "'", int56 == 13);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 15 + "'", int62 == 15);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(property70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + 35 + "'", int71 == 35);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(property79);
    }

    @Test
    public void test18682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18682");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (short) 1);
        int int9 = localDateTime8.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withDayOfWeek(778);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 778 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test18683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18683");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        java.util.Calendar.Builder builder8 = builder6.setLenient(true);
        java.util.Calendar calendar9 = builder6.build();
        java.util.Date date11 = new java.util.Date((long) (byte) 0);
        int int12 = date11.getMinutes();
        date11.setHours(893);
        java.util.Calendar.Builder builder15 = builder6.setInstant(date11);
        java.util.Calendar.Builder builder17 = builder15.setLenient(false);
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("2022-02-21T14:56:31.341");
        java.util.Calendar.Builder builder20 = builder15.setTimeZone(timeZone19);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone22.nextTransition((long) 893);
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.lang.String str27 = dateTimeZone22.getName((long) (short) 0, locale26);
        java.util.TimeZone timeZone28 = dateTimeZone22.toTimeZone();
        java.lang.String str29 = timeZone28.getID();
        boolean boolean30 = timeZone28.observesDaylightTime();
        boolean boolean31 = timeZone28.observesDaylightTime();
        boolean boolean32 = timeZone28.observesDaylightTime();
        java.util.Calendar.Builder builder33 = builder15.setTimeZone(timeZone28);
        int int35 = timeZone28.getOffset(48980819009619L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=hi!,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date11.toString(), "Sat Feb 07 05:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 893L + "'", long24 == 893L);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test18684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18684");
        org.joda.time.Instant instant2 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        long long5 = dateTimeZone3.nextTransition((long) 893);
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        long long9 = dateTimeZone3.getMillisKeepLocal(dateTimeZone7, 0L);
        long long12 = dateTimeZone3.convertLocalToUTC((long) 11, false);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone3);
        long long16 = dateTimeZone3.convertLocalToUTC((long) 53669992, false);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(27738633602000L, dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 11, dateTimeZone3);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 893L + "'", long5 == 893L);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 53669992L + "'", long16 == 53669992L);
    }

    @Test
    public void test18685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18685");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.plus((long) 272);
        org.joda.time.Instant instant6 = instant0.minus((-1727136000000L));
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.halfdayOfDay();
        long long12 = copticChronology7.add((long) '#', 10L, (-1));
        org.joda.time.DateTimeField dateTimeField13 = copticChronology7.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = copticChronology7.add(readablePeriod14, (long) 'u', 816);
        org.joda.time.DurationField durationField18 = copticChronology7.weekyears();
        org.joda.time.DurationField durationField19 = copticChronology7.days();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology7.weekyear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withEra(1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withEra(1);
        int int29 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean31 = localDateTime26.isSupported(dateTimeFieldType30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime26.hourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime26.withMillisOfDay(879);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime26.minusHours(53631987);
        int[] intArray38 = copticChronology7.get((org.joda.time.ReadablePartial) localDateTime36, 1645455293140L);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((java.lang.Object) instant6, (org.joda.time.Chronology) copticChronology7);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 25L + "'", long12 == 25L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 117L + "'", long17 == 117L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1738, 6, 14, 53693425]");
    }

    @Test
    public void test18686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18686");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("hi!");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        timeZone0.setID("zh_CN");
        timeZone0.setRawOffset(2756);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone0);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455815609,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=zh_CN,offset=2756,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=35,MILLISECOND=609,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645455815609,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=zh_CN,offset=2756,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=38,MILLISECOND=365,ZONE_OFFSET=2756,DST_OFFSET=0]");
    }

    @Test
    public void test18687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18687");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime11 = dateTime8.withFieldAdded(durationFieldType9, 0);
        boolean boolean12 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime6.getMillisOfDay();
        org.joda.time.DateTime dateTime15 = dateTime6.minusYears((int) (short) 0);
        org.joda.time.DateTime dateTime18 = dateTime6.withDurationAdded((long) 22, 4);
        org.joda.time.DateTime dateTime19 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property20 = dateTime6.yearOfCentury();
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone22.nextTransition((long) 893);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone22.getMillisKeepLocal(dateTimeZone26, 0L);
        long long31 = dateTimeZone22.convertLocalToUTC((long) 11, false);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withEra(1);
        int int37 = localDateTime36.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = localDateTime36.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.plusSeconds((int) (short) 1);
        int int42 = localDateTime41.getHourOfDay();
        org.joda.time.LocalDateTime.Property property43 = localDateTime41.hourOfDay();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundHalfCeilingCopy();
        java.util.Locale locale46 = java.util.Locale.UK;
        org.joda.time.LocalDateTime localDateTime47 = property43.setCopy("0", locale46);
        java.lang.String str48 = dateTimeZone22.getName(31536900000L, locale46);
        boolean boolean50 = dateTimeZone22.isStandardOffset((long) 993);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime52 = dateTime6.toDateTime(dateTimeZone22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(86399999, 477, 479, 872, 46, 2124, dateTimeZone22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 872 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 54215900 + "'", int13 == 54215900);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 893L + "'", long24 == 893L);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 11L + "'", long31 == 11L);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 15 + "'", int42 == 15);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(dateTime52);
    }

    @Test
    public void test18688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18688");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getWeekyear();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minus(readableDuration3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withWeekyear(816);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2022 + "'", int2 == 2022);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test18689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18689");
        java.util.Date date1 = new java.util.Date((long) 53738895);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 14:55:38 UTC 1970");
    }

    @Test
    public void test18690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18690");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.util.Calendar.Builder builder8 = builder2.setLocale(locale7);
        org.joda.time.tz.NameProvider nameProvider9 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale12 = new java.util.Locale("hi!", "");
        java.lang.String str13 = locale12.getDisplayCountry();
        java.lang.String str16 = nameProvider9.getShortName(locale12, "2022-02-21T14:54:13.248", "");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider9);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        long long21 = dateTimeZone19.nextTransition((long) 893);
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.lang.String str24 = dateTimeZone19.getName((long) (short) 0, locale23);
        java.util.TimeZone timeZone25 = dateTimeZone19.toTimeZone();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone25);
        java.time.ZoneId zoneId27 = timeZone25.toZoneId();
        java.util.Locale locale28 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.String> strSet29 = locale28.getUnicodeLocaleKeys();
        java.util.Date date31 = new java.util.Date((long) (byte) 0);
        int int32 = date31.getMinutes();
        int int33 = date31.getDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) date31, chronology34);
        int int36 = localDate35.getDayOfWeek();
        org.joda.time.LocalDate localDate38 = localDate35.minusWeeks(272);
        org.joda.time.Instant instant40 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone41 = instant40.getZone();
        long long43 = dateTimeZone41.nextTransition((long) 893);
        java.util.Locale locale45 = java.util.Locale.CANADA;
        java.lang.String str46 = dateTimeZone41.getName((long) (short) 0, locale45);
        java.lang.String str47 = localDate35.toString("+00:00", locale45);
        java.lang.String str48 = locale45.getISO3Country();
        java.lang.String str49 = locale28.getDisplayCountry(locale45);
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone25, locale28);
        java.lang.String str53 = nameProvider9.getShortName(locale28, "hi!", "minuteOfHour");
        java.lang.String str54 = locale7.getDisplayCountry(locale28);
        java.lang.String str55 = locale28.getDisplayScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(nameProvider9);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 893L + "'", long21 == 893L);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar26);
// flaky:         org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=1645455815651,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=35,MILLISECOND=651,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(zoneId27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko");
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 893L + "'", long43 == 893L);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00" + "'", str47, "+00:00");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "CAN" + "'", str48, "CAN");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(calendar50);
// flaky:         org.junit.Assert.assertEquals(calendar50.toString(), "java.util.GregorianCalendar[time=1645455815651,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=35,MILLISECOND=651,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\uc774\ud0c8\ub9ac\uc544" + "'", str54, "\uc774\ud0c8\ub9ac\uc544");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test18691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18691");
        java.util.Date date2 = new java.util.Date((long) (byte) 0);
        int int3 = date2.getMinutes();
        int int4 = date2.getDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((java.lang.Object) date2, chronology5);
        org.joda.time.LocalDate localDate8 = localDate6.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        long long12 = dateTimeZone10.nextTransition((long) 893);
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        long long16 = dateTimeZone10.getMillisKeepLocal(dateTimeZone14, 0L);
        org.joda.time.DateTime dateTime17 = localDate6.toDateTimeAtMidnight(dateTimeZone10);
        java.util.Date date19 = new java.util.Date((long) (byte) 0);
        int int20 = date19.getMinutes();
        int int21 = date19.getDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) date19, chronology22);
        org.joda.time.LocalDate localDate25 = localDate23.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone27 = instant26.getZone();
        long long29 = dateTimeZone27.nextTransition((long) 893);
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        long long33 = dateTimeZone27.getMillisKeepLocal(dateTimeZone31, 0L);
        org.joda.time.DateTime dateTime34 = localDate23.toDateTimeAtMidnight(dateTimeZone27);
        org.joda.time.DateTime dateTime35 = localDate6.toDateTimeAtStartOfDay(dateTimeZone27);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDate localDate38 = localDate6.withPeriodAdded(readablePeriod36, 122);
        int int39 = localDate38.getYear();
        int int40 = localDate38.getDayOfWeek();
        org.joda.time.LocalDate localDate42 = localDate38.plusDays(669);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 510);
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone46 = instant45.getZone();
        long long48 = dateTimeZone46.nextTransition((long) 893);
        java.lang.String str50 = dateTimeZone46.getName((long) 100);
        org.joda.time.Interval interval51 = localDate44.toInterval(dateTimeZone46);
        org.joda.time.DateTime dateTime52 = localDate38.toDateTimeAtStartOfDay(dateTimeZone46);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) 53738895, dateTimeZone46);
        java.util.TimeZone timeZone54 = dateTimeZone46.toTimeZone();
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(timeZone54);
        java.lang.String str56 = calendar55.getCalendarType();
        int int57 = calendar55.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            int int59 = calendar55.getMaximum(54000572);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54000572");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 893L + "'", long12 == 893L);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 893L + "'", long29 == 893L);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1970 + "'", int39 == 1970);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 893L + "'", long48 == 893L);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00" + "'", str50, "+00:00");
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar55);
// flaky:         org.junit.Assert.assertEquals(calendar55.toString(), "java.util.GregorianCalendar[time=1645455815673,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=35,MILLISECOND=673,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "gregory" + "'", str56, "gregory");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2022 + "'", int57 == 2022);
    }

    @Test
    public void test18692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18692");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 903);
        org.joda.time.LocalTime localTime3 = localTime1.plusMinutes(2215);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test18693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18693");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.months();
        boolean boolean9 = durationField8.isPrecise();
        long long12 = durationField8.add((long) 53833, (long) 672);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57634718L + "'", long6 == 57634718L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1631232053833L + "'", long12 == 1631232053833L);
    }

    @Test
    public void test18694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18694");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.weekyear();
        java.lang.String str15 = dateTimeField13.getAsShortText((long) 19);
        long long18 = dateTimeField13.addWrapField(793638L, 839);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(740L);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withEra(1);
        int int26 = localDateTime25.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = localDateTime25.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray29 = localDateTime25.getFields();
        org.joda.time.LocalDateTime.Property property30 = localDateTime25.year();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = localDateTime31.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        java.util.Locale.Category category35 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale36 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(category35, locale36);
        java.util.Calendar calendar38 = dateTime34.toCalendar(locale36);
        java.lang.String str39 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime20, 81, locale36);
        org.joda.time.LocalDateTime.Property property40 = localDateTime20.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime42 = property40.addToCopy(490);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57634718L + "'", long7 == 57634718L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1686" + "'", str15, "1686");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 26476935193638L + "'", long18 == 26476935193638L);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(dateTimeFieldArray29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + category35 + "' != '" + java.util.Locale.Category.FORMAT + "'", category35.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=1640995199715,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.285,offset=285,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=285,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "81" + "'", str39, "81");
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test18695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18695");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime10.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime10.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime10.getFields();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.year();
        int int16 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withEra(1);
        int int21 = localDateTime20.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime20.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.plusSeconds((int) (short) 1);
        int int26 = localDateTime25.getHourOfDay();
        int int28 = localDateTime25.getValue(1);
        int int29 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime3.plusYears((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime3.withYear((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime3.plusYears(734);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.era();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundCeilingCopy();
        int int38 = property36.getMinimumValue();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test18696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18696");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(timeZone0);
        int int2 = calendar1.getWeekYear();
        long long3 = calendar1.getTimeInMillis();
        calendar1.setMinimalDaysInFirstWeek(635);
        java.util.Date date6 = calendar1.getTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455815736,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=635,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=35,MILLISECOND=736,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2022 + "'", int2 == 2022);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1645455815736L + "'", long3 == 1645455815736L);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Feb 21 15:03:35 UTC 2022");
    }

    @Test
    public void test18697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18697");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CA");
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withPivotYear(952);
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.util.Date date11 = new java.util.Date((long) (byte) 0);
        int int12 = date11.getMinutes();
        int int13 = date11.getDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) date11, chronology14);
        int int16 = localDate15.getDayOfWeek();
        org.joda.time.LocalDate localDate18 = localDate15.minusWeeks(272);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = dateTimeZone21.getName((long) (short) 0, locale25);
        java.lang.String str27 = localDate15.toString("+00:00", locale25);
        java.lang.String str28 = locale25.getISO3Country();
        java.lang.String str29 = locale8.getDisplayCountry(locale25);
        java.util.Date date31 = new java.util.Date((long) (byte) 0);
        int int32 = date31.getMinutes();
        int int33 = date31.getDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) date31, chronology34);
        org.joda.time.LocalDate localDate37 = localDate35.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone39 = instant38.getZone();
        long long41 = dateTimeZone39.nextTransition((long) 893);
        org.joda.time.Instant instant42 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone43 = instant42.getZone();
        long long45 = dateTimeZone39.getMillisKeepLocal(dateTimeZone43, 0L);
        org.joda.time.DateTime dateTime46 = localDate35.toDateTimeAtMidnight(dateTimeZone39);
        org.joda.time.LocalDate localDate48 = localDate35.withCenturyOfEra(14);
        java.util.Locale locale52 = new java.util.Locale("hi!", "");
        boolean boolean53 = locale52.hasExtensions();
        java.lang.String str54 = locale52.getISO3Language();
        java.lang.String str55 = localDate35.toString("14:54:04.005", locale52);
        java.lang.String str56 = locale25.getDisplayCountry(locale52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter4.withLocale(locale25);
        org.joda.time.Instant instant58 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone59 = instant58.getZone();
        long long61 = dateTimeZone59.nextTransition((long) 893);
        java.util.Locale locale63 = java.util.Locale.CANADA;
        java.lang.String str64 = dateTimeZone59.getName((long) (short) 0, locale63);
        java.util.TimeZone timeZone65 = dateTimeZone59.toTimeZone();
        java.util.Calendar calendar66 = java.util.Calendar.getInstance(timeZone65);
        java.time.ZoneId zoneId67 = timeZone65.toZoneId();
        java.util.Locale locale68 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.String> strSet69 = locale68.getUnicodeLocaleKeys();
        java.util.Date date71 = new java.util.Date((long) (byte) 0);
        int int72 = date71.getMinutes();
        int int73 = date71.getDay();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate((java.lang.Object) date71, chronology74);
        int int76 = localDate75.getDayOfWeek();
        org.joda.time.LocalDate localDate78 = localDate75.minusWeeks(272);
        org.joda.time.Instant instant80 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone81 = instant80.getZone();
        long long83 = dateTimeZone81.nextTransition((long) 893);
        java.util.Locale locale85 = java.util.Locale.CANADA;
        java.lang.String str86 = dateTimeZone81.getName((long) (short) 0, locale85);
        java.lang.String str87 = localDate75.toString("+00:00", locale85);
        java.lang.String str88 = locale85.getISO3Country();
        java.lang.String str89 = locale68.getDisplayCountry(locale85);
        java.util.Calendar calendar90 = java.util.Calendar.getInstance(timeZone65, locale68);
        java.lang.String str92 = locale68.getExtension('a');
        java.lang.String str93 = locale25.getDisplayVariant(locale68);
        java.lang.String str94 = locale1.getDisplayLanguage(locale25);
        java.util.Set<java.lang.String> strSet95 = locale25.getUnicodeLocaleAttributes();
        boolean boolean96 = strSet95.isEmpty();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ca");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 893L + "'", long23 == 893L);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "CAN" + "'", str28, "CAN");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 893L + "'", long41 == 893L);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertEquals(locale52.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "14:54:04.005" + "'", str55, "14:54:04.005");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Canada" + "'", str56, "Canada");
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(instant58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 893L + "'", long61 == 893L);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+00:00" + "'", str64, "+00:00");
        org.junit.Assert.assertNotNull(timeZone65);
        org.junit.Assert.assertEquals(timeZone65.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar66);
// flaky:         org.junit.Assert.assertEquals(calendar66.toString(), "java.util.GregorianCalendar[time=1645455815759,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=35,MILLISECOND=759,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(zoneId67);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "ko");
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 4 + "'", int73 == 4);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 4 + "'", int76 == 4);
        org.junit.Assert.assertNotNull(localDate78);
        org.junit.Assert.assertNotNull(instant80);
        org.junit.Assert.assertNotNull(dateTimeZone81);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 893L + "'", long83 == 893L);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "+00:00" + "'", str86, "+00:00");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "+00:00" + "'", str87, "+00:00");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "CAN" + "'", str88, "CAN");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNotNull(calendar90);
// flaky:         org.junit.Assert.assertEquals(calendar90.toString(), "java.util.GregorianCalendar[time=1645455815759,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=35,MILLISECOND=759,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Catalan" + "'", str94, "Catalan");
        org.junit.Assert.assertNotNull(strSet95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test18698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18698");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test18699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18699");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusHours(32770);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minusYears((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.minusMinutes(732);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.minusHours(1686);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test18700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18700");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.lang.Object[] objArray2 = strSet1.toArray();
        java.util.Set<java.lang.String> strSet3 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "DateTimeField[yearOfCentury]", "100", "gregory", "2022-02-21T14:53:54.648", "53640", "DateTimeField[yearOfCentury]", "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.lang.String str22 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList20);
        boolean boolean23 = strSet13.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withDayOfWeek(2);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((java.lang.Object) dateTime25);
        int int29 = dateTime28.getYearOfCentury();
        boolean boolean30 = strSet13.remove((java.lang.Object) int29);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        boolean boolean34 = strSet13.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        org.joda.time.tz.Provider provider35 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet36 = provider35.getAvailableIDs();
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        boolean boolean40 = strSet36.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        java.util.Set[] setArray42 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray43 = (java.util.Set<java.lang.String>[]) setArray42;
        strSetArray43[0] = strSet3;
        strSetArray43[1] = strSet13;
        strSetArray43[2] = strSet36;
        java.util.Set<java.lang.String>[] strSetArray50 = strSet1.toArray(strSetArray43);
        int int51 = strSet1.size();
        java.util.Spliterator<java.lang.String> strSpliterator52 = strSet1.spliterator();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(chronology53);
        int int55 = localTime54.getHourOfDay();
        org.joda.time.LocalTime.Property property56 = localTime54.hourOfDay();
        org.joda.time.LocalTime localTime58 = property56.addWrapFieldToCopy((int) 'u');
        org.joda.time.LocalTime localTime59 = property56.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime61 = property56.addCopy((long) 674);
        org.joda.time.Instant instant62 = org.joda.time.Instant.now();
        org.joda.time.Instant instant64 = instant62.plus((long) 53);
        org.joda.time.MutableDateTime mutableDateTime65 = instant64.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime66 = instant64.toMutableDateTimeISO();
        int int67 = property56.getDifference((org.joda.time.ReadableInstant) mutableDateTime66);
        boolean boolean68 = strSet1.remove((java.lang.Object) mutableDateTime66);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = mutableDateTime66.toString("Thu Jan 01 11:00:00 GMT+00:00 1970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 22 + "'", int29 == 22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(provider35);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(setArray42);
        org.junit.Assert.assertNotNull(strSetArray43);
        org.junit.Assert.assertNotNull(strSetArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(strSpliterator52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 15 + "'", int55 == 15);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(instant62);
        org.junit.Assert.assertNotNull(instant64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertNotNull(mutableDateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-457055) + "'", int67 == (-457055));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test18701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18701");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        long long12 = dateTimeField9.addWrapField((long) 616, 616);
        org.joda.time.DurationField durationField13 = dateTimeField9.getRangeDurationField();
        long long16 = dateTimeField9.getDifferenceAsLong((long) 54085382, 1645455715289L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 16616L + "'", long12 == 16616L);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1645401629L) + "'", long16 == (-1645401629L));
    }

    @Test
    public void test18702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18702");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.hourOfDay();
        org.joda.time.LocalTime.Property property4 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        org.joda.time.Interval interval6 = property4.toInterval();
        int int7 = property4.getMaximumValueOverall();
        org.joda.time.LocalTime localTime9 = property4.addWrapFieldToCopy(13);
        java.lang.String str11 = localTime9.toString("15:01:08.530");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 999 + "'", int7 == 999);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "15:01:08.530" + "'", str11, "15:01:08.530");
    }

    @Test
    public void test18703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18703");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfWeek();
        org.joda.time.DurationField durationField9 = copticChronology0.years();
        org.joda.time.DurationField durationField10 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57634718L + "'", long6 == 57634718L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test18704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18704");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withDefaultYear(867);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(650);
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.lang.String str14 = dateTimeZone11.getName((long) 32769, locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter9.withZone(dateTimeZone11);
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter9.getParser();
        boolean boolean17 = dateTimeFormatter9.isOffsetParsed();
        java.util.Locale locale18 = dateTimeFormatter9.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter9.withOffsetParsed();
        java.util.Locale locale20 = dateTimeFormatter19.getLocale();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.650" + "'", str14, "+00:00:00.650");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(dateTimeParser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(locale20);
    }

    @Test
    public void test18705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18705");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.Instant instant13 = instant0.withMillis((long) 6);
        org.joda.time.DateTime dateTime14 = instant0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar15 = dateTime14.toGregorianCalendar();
        org.joda.time.DateTime.Property property16 = dateTime14.yearOfEra();
        org.joda.time.DateTime dateTime18 = dateTime14.withMillis(1645455386549L);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime14.withPeriodAdded(readablePeriod19, 834);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 893L + "'", long6 == 893L);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(gregorianCalendar15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test18706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18706");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.plus((long) 53671795);
        org.joda.time.Instant instant4 = instant0.toInstant();
        org.joda.time.Instant instant6 = instant0.plus(1645455303685L);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant0.minus(readableDuration7);
        org.joda.time.Instant instant10 = instant0.minus(1645449540000L);
        long long11 = instant10.getMillis();
        org.joda.time.Chronology chronology12 = instant10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.era();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology12.getZone();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone14);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 6275908L + "'", long11 == 6275908L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test18707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18707");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        boolean boolean10 = localDateTime3.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.minusWeeks(20);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime3.plusSeconds(17);
        org.joda.time.LocalDateTime.Property property15 = localDateTime3.era();
        org.joda.time.LocalDateTime localDateTime16 = property15.withMaximumValue();
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.monthOfYear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test18708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18708");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.hourOfDay();
        org.joda.time.LocalTime.Property property4 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        org.joda.time.Interval interval6 = property4.toInterval();
        org.joda.time.DateTimeField dateTimeField7 = property4.getField();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear(9);
        org.joda.time.DateTime dateTime12 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths(241);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.plus(readablePeriod15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMonths(3);
        long long19 = dateTime16.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance();
        long long27 = copticChronology21.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField28 = copticChronology21.months();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType20.getField((org.joda.time.Chronology) copticChronology21);
        org.joda.time.DateTime.Property property30 = dateTime16.property(dateTimeFieldType20);
        org.joda.time.tz.NameProvider nameProvider31 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale35 = new java.util.Locale("clockhourOfHalfday", "English (Canada)", "");
        java.util.Locale locale36 = locale35.stripExtensions();
        java.lang.String str39 = nameProvider31.getName(locale35, "2022-02-21T14:54:51.332", "\u52a0\u62ff\u5927");
        java.lang.String str40 = property30.getAsShortText(locale35);
        int int41 = property4.getMaximumTextLength(locale35);
        org.joda.time.LocalTime localTime42 = property4.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime43 = property4.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime45 = localTime43.minusSeconds(149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1645455815928L + "'", long19 == 1645455815928L);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(copticChronology21);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 57634718L + "'", long27 == 57634718L);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(nameProvider31);
        org.junit.Assert.assertEquals(locale35.toString(), "clockhourofhalfday_ENGLISH (CANADA)");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "clockhourofhalfday_ENGLISH (CANADA)");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "52" + "'", str40, "52");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime45);
    }

    @Test
    public void test18709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18709");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = property8.getMaximumValueOverall();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = dateTimeZone13.getName((long) (short) 0, locale17);
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTime dateTime21 = localDate11.toDateTimeAtMidnight();
        java.lang.String str22 = localDate11.toString();
        org.joda.time.LocalDate.Property property23 = localDate11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        org.joda.time.LocalDate localDate26 = property23.addToCopy(53781773);
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance();
        long long33 = copticChronology27.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology27.halfdayOfDay();
        org.joda.time.DurationField durationField35 = copticChronology27.halfdays();
        long long39 = copticChronology27.add((long) 272, 40140000L, 538);
        org.joda.time.DurationField durationField40 = copticChronology27.days();
        org.joda.time.DurationField durationField41 = copticChronology27.centuries();
        org.joda.time.DurationFieldType durationFieldType42 = durationField41.getType();
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstance();
        long long50 = copticChronology44.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField51 = copticChronology44.months();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology44.era();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology44.clockhourOfDay();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 15, (org.joda.time.Chronology) copticChronology44);
        org.joda.time.Chronology chronology55 = copticChronology44.withUTC();
        org.joda.time.DateTimeField dateTimeField56 = copticChronology44.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField57 = copticChronology44.era();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology44.secondOfMinute();
        org.joda.time.DurationField durationField59 = durationFieldType42.getField((org.joda.time.Chronology) copticChronology44);
        org.joda.time.LocalDate localDate61 = localDate26.withFieldAdded(durationFieldType42, 54020);
        org.joda.time.chrono.CopticChronology copticChronology63 = org.joda.time.chrono.CopticChronology.getInstance();
        long long69 = copticChronology63.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField70 = copticChronology63.months();
        org.joda.time.DateTimeField dateTimeField71 = copticChronology63.era();
        org.joda.time.DateTimeField dateTimeField72 = copticChronology63.clockhourOfDay();
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate((long) 15, (org.joda.time.Chronology) copticChronology63);
        org.joda.time.DateTimeField dateTimeField74 = copticChronology63.clockhourOfHalfday();
        org.joda.time.DurationField durationField75 = durationFieldType42.getField((org.joda.time.Chronology) copticChronology63);
        org.joda.time.chrono.CopticChronology copticChronology76 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField77 = copticChronology76.secondOfMinute();
        org.joda.time.DurationField durationField78 = copticChronology76.months();
        org.joda.time.DateTimeZone dateTimeZone79 = copticChronology76.getZone();
        org.joda.time.LocalDate localDate80 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology76);
        org.joda.time.DateTimeField dateTimeField81 = copticChronology76.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField82 = copticChronology76.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField83 = copticChronology76.dayOfWeek();
        boolean boolean84 = durationFieldType42.isSupported((org.joda.time.Chronology) copticChronology76);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 893L + "'", long15 == 893L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-0001-01-01" + "'", str22, "-0001-01-01");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(copticChronology27);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 57634718L + "'", long33 == 57634718L);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 21595320272L + "'", long39 == 21595320272L);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertNotNull(copticChronology44);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 57634718L + "'", long50 == 57634718L);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(copticChronology63);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 57634718L + "'", long69 == 57634718L);
        org.junit.Assert.assertNotNull(durationField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertNotNull(copticChronology76);
        org.junit.Assert.assertNotNull(dateTimeField77);
        org.junit.Assert.assertNotNull(durationField78);
        org.junit.Assert.assertNotNull(dateTimeZone79);
        org.junit.Assert.assertNotNull(dateTimeField81);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test18710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18710");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 510);
        org.joda.time.Instant instant2 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        long long5 = dateTimeZone3.nextTransition((long) 893);
        java.lang.String str7 = dateTimeZone3.getName((long) 100);
        org.joda.time.Interval interval8 = localDate1.toInterval(dateTimeZone3);
        org.joda.time.LocalDate localDate10 = localDate1.plusMonths(53728689);
        org.joda.time.LocalDate localDate12 = localDate10.minusMonths(53828406);
        int int13 = localDate12.getMonthOfYear();
        org.joda.time.LocalDate.Property property14 = localDate12.era();
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 893L + "'", long5 == 893L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test18711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18711");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.millisOfDay();
        org.joda.time.DurationField durationField15 = copticChronology1.years();
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.Instant instant18 = instant16.withMillis((long) 1);
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        long long22 = dateTimeZone20.nextTransition((long) 893);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        long long26 = dateTimeZone20.getMillisKeepLocal(dateTimeZone24, 0L);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((java.lang.Object) instant16, dateTimeZone24);
        org.joda.time.LocalTime localTime29 = localTime27.minusMillis(12);
        org.joda.time.LocalTime localTime31 = localTime27.plusMinutes((int) (short) 0);
        java.lang.String str32 = localTime27.toString();
        long long34 = copticChronology1.set((org.joda.time.ReadablePartial) localTime27, (long) 363);
        org.joda.time.DurationField durationField35 = copticChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology1.era();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology1.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57634718L + "'", long7 == 57634718L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 893L + "'", long22 == 893L);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "15:03:35.995" + "'", str32, "15:03:35.995");
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 54215710L + "'", long34 == 54215710L);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test18712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18712");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime1.getCenturyOfEra();
        org.joda.time.DateTime dateTime8 = dateTime1.withMillisOfSecond(53);
        org.joda.time.DateTime.Property property9 = dateTime1.millisOfDay();
        java.lang.String str10 = dateTime1.toString();
        int int11 = dateTime1.getWeekOfWeekyear();
        java.util.Date date13 = new java.util.Date((long) (byte) 0);
        int int14 = date13.getMinutes();
        int int15 = date13.getDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) date13, chronology16);
        org.joda.time.LocalDate localDate19 = localDate17.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        long long27 = dateTimeZone21.getMillisKeepLocal(dateTimeZone25, 0L);
        org.joda.time.DateTime dateTime28 = localDate17.toDateTimeAtMidnight(dateTimeZone21);
        java.util.Date date30 = new java.util.Date((long) (byte) 0);
        int int31 = date30.getMinutes();
        int int32 = date30.getDay();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((java.lang.Object) date30, chronology33);
        org.joda.time.LocalDate localDate36 = localDate34.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant37 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone38 = instant37.getZone();
        long long40 = dateTimeZone38.nextTransition((long) 893);
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone42 = instant41.getZone();
        long long44 = dateTimeZone38.getMillisKeepLocal(dateTimeZone42, 0L);
        org.joda.time.DateTime dateTime45 = localDate34.toDateTimeAtMidnight(dateTimeZone38);
        org.joda.time.DateTime dateTime46 = localDate17.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDate localDate49 = localDate17.withPeriodAdded(readablePeriod47, 122);
        java.util.Date date51 = new java.util.Date((long) (byte) 0);
        int int52 = date51.getMinutes();
        int int53 = date51.getDay();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((java.lang.Object) date51, chronology54);
        org.joda.time.LocalDate localDate57 = localDate55.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant58 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone59 = instant58.getZone();
        long long61 = dateTimeZone59.nextTransition((long) 893);
        org.joda.time.Instant instant62 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone63 = instant62.getZone();
        long long65 = dateTimeZone59.getMillisKeepLocal(dateTimeZone63, 0L);
        org.joda.time.DateTime dateTime66 = localDate55.toDateTimeAtMidnight(dateTimeZone59);
        org.joda.time.LocalDate localDate68 = localDate55.minusDays(20);
        org.joda.time.LocalDate localDate70 = localDate68.plusWeeks(53);
        org.joda.time.LocalDate localDate72 = localDate70.withYearOfCentury(10);
        int int73 = localDate49.compareTo((org.joda.time.ReadablePartial) localDate70);
        org.joda.time.LocalDate localDate75 = localDate49.withYear(7);
        org.joda.time.LocalDate.Property property76 = localDate49.weekOfWeekyear();
        org.joda.time.LocalDate localDate78 = property76.addToCopy(53700);
        org.joda.time.LocalDate localDate79 = property76.withMaximumValue();
        java.lang.String str80 = property76.getAsShortText();
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = property76.getFieldType();
        int int82 = dateTime1.get(dateTimeFieldType81);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 903 + "'", int2 == 903);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-21T15:03:36.298+00:00:00.285" + "'", str10, "2022-02-21T15:03:36.298+00:00:00.285");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 893L + "'", long23 == 893L);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 893L + "'", long40 == 893L);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(instant58);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 893L + "'", long61 == 893L);
        org.junit.Assert.assertNotNull(instant62);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(localDate68);
        org.junit.Assert.assertNotNull(localDate70);
        org.junit.Assert.assertNotNull(localDate72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(localDate75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(localDate78);
        org.junit.Assert.assertNotNull(localDate79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "1" + "'", str80, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 8 + "'", int82 == 8);
    }

    @Test
    public void test18713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18713");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.year();
        org.joda.time.Chronology chronology12 = copticChronology1.withUTC();
        long long16 = copticChronology1.add((long) 112, 61879161600L, 29);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology1.hourOfDay();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 360, (org.joda.time.Chronology) copticChronology1);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57634718L + "'", long7 == 57634718L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1794495686512L + "'", long16 == 1794495686512L);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test18714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18714");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.dayOfWeek();
        java.lang.String str14 = dateTimeField12.getAsShortText(1631318400000L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57634718L + "'", long7 == 57634718L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u661f\u671f\u516d" + "'", str14, "\u661f\u671f\u516d");
    }

    @Test
    public void test18715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18715");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 14);
        int int12 = dateTimeFormatter7.getDefaultYear();
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withLocale(locale13);
        java.util.Locale.Category category15 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale16 = java.util.Locale.getDefault(category15);
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.util.Locale.setDefault(category15, locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter7.withLocale(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withPivotYear(469);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = dateTimeFormatter19.parseLocalDate("2022-02-21T14:56:27.292");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.FORMAT + "'", category15.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test18716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18716");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        java.lang.String str4 = calendar3.getCalendarType();
        calendar3.set(35, 588, 252, 778, 0, 75360);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "DateTimeField[yearOfCentury]", "100", "gregory", "2022-02-21T14:53:54.648", "53640", "DateTimeField[yearOfCentury]", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        java.lang.String str30 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strList28);
        boolean boolean31 = strSet21.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withDayOfWeek(2);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) dateTime33);
        int int37 = dateTime36.getYearOfCentury();
        boolean boolean38 = strSet21.remove((java.lang.Object) int37);
        strSet21.clear();
        java.util.Iterator<java.lang.String> strItor40 = strSet21.iterator();
        java.util.Locale.Category category41 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale42 = java.util.Locale.getDefault(category41);
        java.util.Locale.Category[] categoryArray43 = new java.util.Locale.Category[] { category41 };
        java.util.Locale.Category[] categoryArray44 = strSet21.toArray(categoryArray43);
        boolean boolean46 = strSet21.add("hi!");
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(chronology47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalTime localTime50 = localTime48.minus(readablePeriod49);
        org.joda.time.LocalTime localTime52 = localTime50.minusMinutes(0);
        org.joda.time.LocalTime localTime54 = localTime50.minusSeconds(616);
        java.lang.String str55 = localTime54.toString();
        boolean boolean56 = strSet21.equals((java.lang.Object) localTime54);
        java.lang.Object[] objArray57 = strSet21.toArray();
        boolean boolean58 = calendar3.before((java.lang.Object) strSet21);
        java.time.Instant instant59 = calendar3.toInstant();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-59491991039876,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=84,MONTH=9,WEEK_OF_YEAR=42,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=285,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=6,HOUR_OF_DAY=6,MINUTE=56,SECOND=0,MILLISECOND=124,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gregory" + "'", str4, "gregory");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(languageRangeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 22 + "'", int37 == 22);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strItor40);
        org.junit.Assert.assertTrue("'" + category41 + "' != '" + java.util.Locale.Category.FORMAT + "'", category41.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh");
        org.junit.Assert.assertNotNull(categoryArray43);
        org.junit.Assert.assertNotNull(categoryArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "14:53:20.409" + "'", str55, "14:53:20.409");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(instant59);
    }

    @Test
    public void test18717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18717");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        date1.setSeconds(0);
        int int4 = date1.getDay();
        int int5 = date1.getDay();
        java.util.Date date12 = new java.util.Date((int) ' ', 16, 935, (int) (short) 1, 20, 53640129);
        boolean boolean13 = date1.before(date12);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromDateFields(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Aug 02 21:22:09 UTC 1937");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test18718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18718");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        java.util.Date date3 = new java.util.Date((long) (byte) 0);
        int int4 = date3.getMinutes();
        int int5 = date3.getMinutes();
        boolean boolean6 = date1.before(date3);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime10.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime10.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusSeconds((int) (short) 1);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withEra(1);
        int int20 = localDateTime19.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = localDateTime19.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray23 = localDateTime19.getFields();
        org.joda.time.LocalDateTime.Property property24 = localDateTime19.year();
        boolean boolean26 = localDateTime19.equals((java.lang.Object) (byte) 0);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime19.plus(readableDuration27);
        int int29 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        java.util.Date date30 = localDateTime15.toDate();
        date30.setDate(15);
        java.lang.String str33 = date30.toGMTString();
        boolean boolean34 = date3.after(date30);
        int int35 = date3.getYear();
        java.util.Date date37 = new java.util.Date((long) (byte) 0);
        java.util.Date date39 = new java.util.Date((long) (byte) 0);
        int int40 = date39.getMinutes();
        int int41 = date39.getMinutes();
        boolean boolean42 = date37.before(date39);
        date37.setHours(11);
        int int45 = date37.getTimezoneOffset();
        java.util.Date date47 = new java.util.Date((long) (byte) 0);
        java.util.Date date49 = new java.util.Date((long) (byte) 0);
        int int50 = date49.getMinutes();
        int int51 = date49.getMinutes();
        boolean boolean52 = date47.before(date49);
        boolean boolean53 = date37.after(date47);
        java.time.Instant instant54 = date37.toInstant();
        boolean boolean55 = date3.before(date37);
        java.time.Instant instant56 = date3.toInstant();
        java.util.Date date57 = java.util.Date.from(instant56);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(dateTimeFieldArray23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Tue Feb 15 15:03:37 UTC 2022");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "15 Feb 2022 15:03:37 GMT" + "'", str33, "15 Feb 2022 15:03:37 GMT");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 70 + "'", int35 == 70);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 11:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(instant56);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test18719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18719");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        long long4 = dateTimeZone2.nextTransition((long) 893);
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone6 = instant5.getZone();
        long long8 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, 0L);
        java.lang.String str10 = dateTimeZone6.getName((long) 5);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(0L, dateTimeZone6);
        java.lang.String str13 = dateTimeZone6.getNameKey((-1L));
        java.lang.String str15 = dateTimeZone6.getName((long) 623);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 893L + "'", long4 == 893L);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test18720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18720");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths(241);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime4.plus(readablePeriod7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMonths(3);
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        org.joda.time.DateTime dateTime13 = property11.addToCopy(774);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test18721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18721");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.lang.String str8 = timeZone7.getID();
        boolean boolean9 = timeZone7.observesDaylightTime();
        boolean boolean10 = timeZone7.observesDaylightTime();
        boolean boolean11 = timeZone7.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone7);
        int int14 = timeZone7.getOffset((-50310087580783L));
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test18722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18722");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 510);
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone6 = instant5.getZone();
        long long8 = dateTimeZone6.nextTransition((long) 893);
        java.lang.String str10 = dateTimeZone6.getName((long) 100);
        org.joda.time.Interval interval11 = localDate4.toInterval(dateTimeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        long long16 = dateTimeZone14.nextTransition((long) 893);
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.lang.String str19 = dateTimeZone14.getName((long) (short) 0, locale18);
        java.util.TimeZone timeZone20 = dateTimeZone14.toTimeZone();
        java.lang.String str21 = timeZone20.getID();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        long long24 = dateTimeZone6.getMillisKeepLocal(dateTimeZone22, 10698026400000L);
        org.joda.time.Chronology chronology25 = copticChronology0.withZone(dateTimeZone22);
        org.joda.time.DurationField durationField26 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 893L + "'", long8 == 893L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 893L + "'", long16 == 893L);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10698026400000L + "'", long24 == 10698026400000L);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test18723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18723");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        java.util.Date date18 = new java.util.Date((long) (byte) 0);
        int int19 = date18.getMinutes();
        int int20 = date18.getDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) date18, chronology21);
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        org.joda.time.DateTime dateTime33 = localDate22.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = localDate5.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate5.withPeriodAdded(readablePeriod35, 122);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra(21);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime44 = dateTime41.withFieldAdded(durationFieldType42, 0);
        org.joda.time.DateTime.Property property45 = dateTime41.minuteOfDay();
        org.joda.time.DateTime dateTime46 = property45.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property47 = dateTime46.secondOfMinute();
        org.joda.time.DateTime.Property property48 = dateTime46.secondOfDay();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTime dateTime51 = dateTime46.withDurationAdded(readableDuration49, 6);
        org.joda.time.LocalDate localDate52 = dateTime51.toLocalDate();
        org.joda.time.DateTime dateTime53 = dateTime51.toDateTime();
        org.joda.time.DateTime dateTime54 = dateTime53.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone55 = dateTime54.getZone();
        org.joda.time.DateTime dateTime56 = localDate39.toDateTimeAtMidnight(dateTimeZone55);
        org.joda.time.LocalDate localDate58 = localDate39.plusYears(53850682);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(chronology59);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.withEra(1);
        int int63 = localDateTime62.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = localDateTime62.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray66 = localDateTime62.getFields();
        org.joda.time.LocalDateTime.Property property67 = localDateTime62.year();
        org.joda.time.LocalDateTime.Property property68 = localDateTime62.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime62.minusSeconds(43);
        int int71 = localDateTime62.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int72 = localDate58.compareTo((org.joda.time.ReadablePartial) localDateTime62);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 893L + "'", long28 == 893L);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType65);
        org.junit.Assert.assertNotNull(dateTimeFieldArray66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2022 + "'", int71 == 2022);
    }

    @Test
    public void test18724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18724");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekyear();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        java.util.Date date12 = new java.util.Date((long) (byte) 0);
        int int13 = date12.getMinutes();
        int int14 = date12.getDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) date12, chronology15);
        int int17 = localDate16.getDayOfWeek();
        org.joda.time.LocalDate localDate19 = localDate16.minusWeeks(272);
        int int20 = localDate19.getDayOfYear();
        java.lang.String str21 = localDate19.toString();
        org.joda.time.LocalTime localTime22 = null;
        org.joda.time.DateTime dateTime23 = localDate19.toDateTime(localTime22);
        org.joda.time.DateMidnight dateMidnight24 = localDate19.toDateMidnight();
        long long26 = copticChronology0.set((org.joda.time.ReadablePartial) localDate19, 38088L);
        org.joda.time.DurationField durationField27 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField29 = copticChronology0.hours();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 289 + "'", int20 == 289);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1964-10-15" + "'", str21, "1964-10-15");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 8787916838088L + "'", long26 == 8787916838088L);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test18725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18725");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.Instant instant13 = instant0.withMillis((long) 6);
        org.joda.time.MutableDateTime mutableDateTime14 = instant13.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime15 = instant13.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime16 = instant13.toMutableDateTime();
        org.joda.time.DateTime dateTime17 = instant13.toDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.withPeriodAdded(readablePeriod18, 143);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone23);
        int int25 = dateTime24.getMinuteOfDay();
        int int26 = instant21.compareTo((org.joda.time.ReadableInstant) dateTime24);
        java.util.Locale locale27 = java.util.Locale.CANADA;
        java.util.Calendar calendar28 = dateTime24.toCalendar(locale27);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone31);
        int int33 = dateTime32.getMinuteOfDay();
        int int34 = instant29.compareTo((org.joda.time.ReadableInstant) dateTime32);
        java.util.Locale locale35 = java.util.Locale.CANADA;
        java.util.Calendar calendar36 = dateTime32.toCalendar(locale35);
        boolean boolean37 = dateTime24.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime39 = dateTime24.minusDays((-292275054));
        org.joda.time.DateTime.Property property40 = dateTime39.minuteOfHour();
        int int41 = dateTime39.getMillisOfSecond();
        org.joda.time.DateTime dateTime43 = dateTime39.minusYears(740);
        org.joda.time.DateTime dateTime45 = dateTime39.minus(3600000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean47 = dateTime45.isSupported(dateTimeFieldType46);
        java.lang.String str48 = dateTimeFieldType46.getName();
        boolean boolean49 = dateTime20.isSupported(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 893L + "'", long6 == 893L);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 903 + "'", int25 == 903);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1645455816264,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=36,MILLISECOND=264,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 903 + "'", int33 == 903);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar36);
// flaky:         org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=1645455816264,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=36,MILLISECOND=264,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 264 + "'", int41 == 264);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "clockhourOfHalfday" + "'", str48, "clockhourOfHalfday");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test18726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18726");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.withCenturyOfEra(14);
        org.joda.time.DateTime dateTime19 = localDate18.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate21 = localDate18.withWeekyear(437);
        org.joda.time.DateTime dateTime22 = localDate21.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        boolean boolean24 = instant23.isAfterNow();
        org.joda.time.Instant instant26 = instant23.plus((long) 53671795);
        org.joda.time.Instant instant27 = instant23.toInstant();
        org.joda.time.Instant instant29 = instant23.plus(1645455303685L);
        int int30 = dateTime22.compareTo((org.joda.time.ReadableInstant) instant23);
        org.joda.time.DateTime.Property property31 = dateTime22.weekOfWeekyear();
        org.joda.time.DateTime.Property property32 = dateTime22.millisOfDay();
        int int33 = dateTime22.getEra();
        org.joda.time.YearMonthDay yearMonthDay34 = dateTime22.toYearMonthDay();
        boolean boolean36 = dateTime22.isBefore(272L);
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology37.secondOfMinute();
        org.joda.time.DurationField durationField39 = copticChronology37.months();
        org.joda.time.DateTimeZone dateTimeZone40 = copticChronology37.getZone();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology37.hourOfHalfday();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology37);
        org.joda.time.DurationField durationField43 = copticChronology37.weekyears();
        org.joda.time.DateTimeField dateTimeField44 = copticChronology37.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology37.hourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology37.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology37.halfdayOfDay();
        long long49 = dateTimeField47.remainder((long) (-2720));
        int int50 = dateTime22.get(dateTimeField47);
        long long52 = dateTimeField47.roundFloor(0L);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(copticChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 43197280L + "'", long49 == 43197280L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }

    @Test
    public void test18727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18727");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Calendar calendar9 = dateTime6.toCalendar(locale8);
        calendar9.set(2, 0);
        calendar9.add(1, 11);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar9);
        int int17 = calendar9.getWeekYear();
        long long18 = calendar9.getTimeInMillis();
        java.util.TimeZone timeZone19 = calendar9.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime24 = dateTime21.withFieldAdded(durationFieldType22, 0);
        org.joda.time.DateTime dateTime26 = dateTime21.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTime.Property property27 = dateTime21.monthOfYear();
        org.joda.time.DateTime dateTime28 = property27.withMaximumValue();
        org.joda.time.DateTime dateTime29 = property27.roundHalfCeilingCopy();
        boolean boolean30 = calendar9.before((java.lang.Object) property27);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.fromCalendarFields(calendar9);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1989932640000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2033,MONTH=0,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=21,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=4,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2033 + "'", int17 == 2033);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1989932640000L + "'", long18 == 1989932640000L);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime31);
    }

    @Test
    public void test18728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18728");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.plus((long) 53);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant6 = instant3.minus((long) 500);
        org.joda.time.Instant instant8 = instant6.withMillis((long) 847);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
    }

    @Test
    public void test18729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18729");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.months();
        boolean boolean10 = durationFieldType0.isSupported((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = copticChronology1.add(readablePeriod12, 60000L, 852);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology1.secondOfMinute();
        java.lang.String str18 = dateTimeField17.toString();
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = dateTimeField17.getAsText(53866457, locale21);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57635003L + "'", long7 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60000L + "'", long15 == 60000L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DateTimeField[secondOfMinute]" + "'", str18, "DateTimeField[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "53866457" + "'", str22, "53866457");
    }

    @Test
    public void test18730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18730");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Calendar calendar9 = dateTime6.toCalendar(locale8);
        calendar9.set(2, 0);
        calendar9.add(1, 11);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromCalendarFields(calendar9);
        java.util.Date date17 = calendar9.getTime();
        int int18 = calendar9.getMinimalDaysInFirstWeek();
        long long19 = calendar9.getTimeInMillis();
        calendar9.setFirstDayOfWeek(631);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1989932640000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=631,minimalDaysInFirstWeek=1,ERA=1,YEAR=2033,MONTH=0,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=21,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=4,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Jan 21 15:04:00 UTC 2033");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1989932640000L + "'", long19 == 1989932640000L);
    }

    @Test
    public void test18731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18731");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 14);
        int int12 = dateTimeFormatter7.getDefaultYear();
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withLocale(locale13);
        java.util.Locale.Category category15 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale16 = java.util.Locale.getDefault(category15);
        java.util.Locale locale17 = java.util.Locale.CHINESE;
        java.util.Locale.setDefault(category15, locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter7.withLocale(locale17);
        boolean boolean20 = dateTimeFormatter7.isParser();
        java.io.Writer writer21 = null;
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay(868L);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer21, (org.joda.time.ReadablePartial) localTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertTrue("'" + category15 + "' != '" + java.util.Locale.Category.FORMAT + "'", category15.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localTime23);
    }

    @Test
    public void test18732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18732");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        org.joda.time.DateTime dateTime7 = dateTime4.withLaterOffsetAtOverlap();
        int int8 = dateTime7.getMinuteOfHour();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        java.lang.String str10 = property9.getAsShortText();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        long long17 = copticChronology11.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField18 = copticChronology11.months();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology11.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology11.dayOfWeek();
        org.joda.time.DurationField durationField22 = copticChronology11.years();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology11.monthOfYear();
        boolean boolean24 = property9.equals((java.lang.Object) copticChronology11);
        org.joda.time.Chronology chronology25 = copticChronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.monthOfYear();
        boolean boolean28 = dateTimeField26.isLeap(1645455608184L);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 903 + "'", int2 == 903);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 457 + "'", int5 == 457);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon May 02 15:03:36 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "15" + "'", str10, "15");
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 57635003L + "'", long17 == 57635003L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test18733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18733");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Date date3 = new java.util.Date((long) (byte) 0);
        int int4 = date3.getMinutes();
        int int5 = date3.getDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) date3, chronology6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.LocalDate localDate10 = localDate7.minusWeeks(272);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = dateTimeZone13.getName((long) (short) 0, locale17);
        java.lang.String str19 = localDate7.toString("+00:00", locale17);
        java.lang.String str20 = locale17.getISO3Country();
        java.lang.String str21 = locale0.getDisplayCountry(locale17);
        java.util.Date date23 = new java.util.Date((long) (byte) 0);
        int int24 = date23.getMinutes();
        int int25 = date23.getDay();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) date23, chronology26);
        org.joda.time.LocalDate localDate29 = localDate27.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        long long33 = dateTimeZone31.nextTransition((long) 893);
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone35 = instant34.getZone();
        long long37 = dateTimeZone31.getMillisKeepLocal(dateTimeZone35, 0L);
        org.joda.time.DateTime dateTime38 = localDate27.toDateTimeAtMidnight(dateTimeZone31);
        org.joda.time.LocalDate localDate40 = localDate27.withCenturyOfEra(14);
        java.util.Locale locale44 = new java.util.Locale("hi!", "");
        boolean boolean45 = locale44.hasExtensions();
        java.lang.String str46 = locale44.getISO3Language();
        java.lang.String str47 = localDate27.toString("14:54:04.005", locale44);
        java.lang.String str48 = locale17.getDisplayCountry(locale44);
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(locale17);
        java.util.Date date50 = calendar49.getTime();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 893L + "'", long15 == 893L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CAN" + "'", str20, "CAN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 893L + "'", long33 == 893L);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertEquals(locale44.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "14:54:04.005" + "'", str47, "14:54:04.005");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Canada" + "'", str48, "Canada");
        org.junit.Assert.assertNotNull(calendar49);
// flaky:         org.junit.Assert.assertEquals(calendar49.toString(), "java.util.GregorianCalendar[time=1645455816473,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=36,MILLISECOND=473,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date50);
// flaky:         org.junit.Assert.assertEquals(date50.toString(), "Mon Feb 21 15:03:36 UTC 2022");
    }

    @Test
    public void test18734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18734");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime7 = dateTime4.withFieldAdded(durationFieldType5, 0);
        org.joda.time.DateTime.Property property8 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property10 = dateTime9.secondOfMinute();
        java.lang.String str11 = property10.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime16 = dateTime13.withFieldAdded(durationFieldType14, 0);
        org.joda.time.DateTime.Property property17 = dateTime13.minuteOfDay();
        org.joda.time.DateTime dateTime18 = property17.roundHalfEvenCopy();
        int int19 = dateTime18.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str23 = locale22.getISO3Language();
        java.util.Locale.Category category24 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale25 = java.util.Locale.getDefault(category24);
        java.lang.String str26 = locale22.getDisplayLanguage(locale25);
        int int27 = property10.getMaximumTextLength(locale25);
        java.util.Locale.Builder builder28 = builder2.setLocale(locale25);
        java.util.Locale.Builder builder30 = builder2.removeUnicodeLocaleAttribute("days");
        java.util.Locale.Builder builder31 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder33 = builder2.addUnicodeLocaleAttribute("2022-02-21T15:03:05.148");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-21T15:03:05.148 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[secondOfMinute]" + "'", str11, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 22 + "'", int19 == 22);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.FORMAT + "'", category24.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test18735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18735");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(53);
        org.joda.time.LocalDate localDate22 = localDate18.plusWeeks(20);
        org.joda.time.LocalDate localDate24 = localDate18.withYearOfCentury(6);
        org.joda.time.LocalDate localDate26 = localDate18.plusMonths(5);
        org.joda.time.LocalDate localDate28 = localDate26.minusWeeks(10);
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 16, dateTimeZone31);
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = localDate28.toDateTimeAtStartOfDay(dateTimeZone31);
        org.joda.time.LocalDate.Property property35 = localDate28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField36 = property35.getField();
        int int37 = dateTimeField36.getMinimumValue();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(copticChronology33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test18736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18736");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.hourOfDay();
        org.joda.time.LocalTime.Property property4 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = localTime5.minusMinutes(53);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.days();
        boolean boolean9 = localTime5.isSupported(durationFieldType8);
        org.joda.time.LocalTime localTime11 = localTime5.minusSeconds(53688022);
        org.joda.time.LocalTime.Property property12 = localTime5.millisOfSecond();
        int int13 = localTime5.getMillisOfSecond();
        java.lang.Class<?> wildcardClass14 = localTime5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) localTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 540 + "'", int13 == 540);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test18737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18737");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology1.months();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.hourOfHalfday();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology1.secondOfMinute();
        org.joda.time.DurationField durationField8 = copticChronology1.years();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 2756, (org.joda.time.Chronology) copticChronology1);
        java.util.Date date11 = new java.util.Date((long) (byte) 0);
        int int12 = date11.getMinutes();
        int int13 = date11.getDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) date11, chronology14);
        org.joda.time.LocalDate localDate17 = localDate15.withYear((-1));
        org.joda.time.LocalDate.Property property18 = localDate17.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        long long21 = dateTimeField19.roundCeiling((long) 53631987);
        java.lang.String str22 = dateTimeField19.toString();
        org.joda.time.DurationField durationField23 = dateTimeField19.getLeapDurationField();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) durationField23);
        long long26 = copticChronology1.set((org.joda.time.ReadablePartial) localDate24, (long) 433);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology1.weekOfWeekyear();
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 31536000000L + "'", long21 == 31536000000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "DateTimeField[yearOfEra]" + "'", str22, "DateTimeField[yearOfEra]");
        org.junit.Assert.assertNull(durationField23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10597996800433L + "'", long26 == 10597996800433L);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test18738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18738");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.Date date4 = new java.util.Date((long) (byte) 0);
        java.util.Date date6 = new java.util.Date((long) (byte) 0);
        int int7 = date6.getMinutes();
        int int8 = date6.getMinutes();
        boolean boolean9 = date4.before(date6);
        java.util.Calendar.Builder builder10 = builder0.setInstant(date6);
        java.util.Calendar calendar11 = builder0.build();
        java.util.Calendar.Builder builder15 = builder0.setWeekDate(53672844, 30, 32770);
        java.util.Calendar.Builder builder19 = builder15.setTimeOfDay(0, 53850682, 79);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withEra(1);
        int int24 = localDateTime23.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = localDateTime23.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = localDateTime23.getFields();
        org.joda.time.LocalDateTime.Property property28 = localDateTime23.year();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = localDateTime29.toDateTime((org.joda.time.ReadableInstant) dateTime31);
        java.util.Locale.Category category33 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(category33, locale34);
        java.util.Calendar calendar36 = dateTime32.toCalendar(locale34);
        calendar36.setLenient(true);
        calendar36.set(258, (int) (short) 1, 0);
        java.util.TimeZone timeZone44 = java.util.TimeZone.getTimeZone("\u4e2d\u6587\u4e2d\u56fd)");
        calendar36.setTimeZone(timeZone44);
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone44);
        java.util.Calendar.Builder builder47 = builder15.setTimeZone(timeZone44);
        java.util.Calendar.Builder builder51 = builder15.setDate(53702963, 0, 782);
        java.util.Calendar.Builder builder55 = builder51.setWeekDate(811, 459, 54019900);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateTimeFieldArray27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.FORMAT + "'", category33.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar36);
        org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=258,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=0,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(calendar46);
// flaky:         org.junit.Assert.assertEquals(calendar46.toString(), "java.util.GregorianCalendar[time=1645455816570,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=36,MILLISECOND=570,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test18739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18739");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusHours(32769);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime10.getFields();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusMinutes(53859202);
        int int14 = localDateTime13.getDayOfMonth();
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime16 = instant15.toDateTime();
        org.joda.time.Instant instant17 = instant15.toInstant();
        org.joda.time.DateTime dateTime18 = instant15.toDateTime();
        org.joda.time.Instant instant20 = instant15.plus((long) (-53640118));
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        int int23 = localDateTime22.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.plusMillis(53642140);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.monthOfYear();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withMillisOfSecond(225);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str30 = dateTimeFieldType29.getName();
        int int31 = localDateTime25.indexOf(dateTimeFieldType29);
        int int32 = instant15.get(dateTimeFieldType29);
        org.joda.time.LocalDateTime.Property property33 = localDateTime13.property(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "monthOfYear" + "'", str30, "monthOfYear");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test18740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18740");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusSeconds((int) (byte) 10);
        int int17 = localDateTime16.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusYears(0);
        boolean boolean20 = copticChronology0.equals((java.lang.Object) localDateTime19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.minuteOfDay();
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone24);
        int int26 = dateTime25.getMinuteOfDay();
        int int27 = instant22.compareTo((org.joda.time.ReadableInstant) dateTime25);
        java.util.Locale locale28 = java.util.Locale.CANADA;
        java.util.Calendar calendar29 = dateTime25.toCalendar(locale28);
        int int30 = calendar29.getWeeksInWeekYear();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withEra(1);
        int int35 = localDateTime34.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = localDateTime34.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray38 = localDateTime34.getFields();
        org.joda.time.LocalDateTime.Property property39 = localDateTime34.year();
        boolean boolean41 = localDateTime34.equals((java.lang.Object) (byte) 0);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime34.plus(readableDuration42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.minusMillis((int) (short) -1);
        boolean boolean46 = calendar29.before((java.lang.Object) localDateTime45);
        long long48 = copticChronology0.set((org.joda.time.ReadablePartial) localDateTime45, (long) 289);
        org.joda.time.DurationField durationField49 = copticChronology0.weeks();
        int int52 = durationField49.getValue(1645455792299L, 1645455651340L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 903 + "'", int26 == 903);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1645455816630,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=36,MILLISECOND=630,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 53 + "'", int30 == 53);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(dateTimeFieldArray38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10598051016631L + "'", long48 == 10598051016631L);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2720 + "'", int52 == 2720);
    }

    @Test
    public void test18741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18741");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.lang.String str8 = property7.toString();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str11 = property7.getAsShortText(locale10);
        org.joda.time.DateTime dateTime12 = property7.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTime dateTime14 = property13.roundCeilingCopy();
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfMonth();
        org.joda.time.Instant instant16 = dateTime14.toInstant();
        int int17 = dateTime14.getMinuteOfHour();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withEra(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusHours(893);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.minus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.plusMonths(44);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType28.getRangeDurationType();
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.property(dateTimeFieldType28);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.minusMillis(2);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withEra(1);
        int int37 = localDateTime36.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = localDateTime36.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray40 = localDateTime36.getFields();
        org.joda.time.LocalDateTime.Property property41 = localDateTime36.year();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = localDateTime42.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        java.util.Locale.Category category46 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale47 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(category46, locale47);
        java.util.Calendar calendar49 = dateTime45.toCalendar(locale47);
        org.joda.time.DateTime dateTime51 = dateTime45.withMillis(27738633602000L);
        org.joda.time.DateTime.Property property52 = dateTime51.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(dateTimeZone53);
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime57 = dateTime54.withFieldAdded(durationFieldType55, 0);
        org.joda.time.DateTime.Property property58 = dateTime54.minuteOfDay();
        org.joda.time.DateTime dateTime59 = property58.withMinimumValue();
        org.joda.time.DateTime dateTime61 = property58.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime62 = property58.roundCeilingCopy();
        org.joda.time.DateTime dateTime63 = property58.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime64 = property58.roundCeilingCopy();
        org.joda.time.DateTime dateTime66 = property58.setCopy(0);
        org.joda.time.DateTime.Property property67 = dateTime66.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = property67.getFieldType();
        int int69 = dateTime51.get(dateTimeFieldType68);
        int int70 = localDateTime32.get(dateTimeFieldType68);
        org.joda.time.DateTime.Property property71 = dateTime14.property(dateTimeFieldType68);
        java.lang.String str72 = property71.getAsShortText();
        org.joda.time.DateTime dateTime73 = property71.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime75 = dateTime73.withDayOfYear(353);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[secondOfMinute]" + "'", str8, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(instant16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(dateTimeFieldArray40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + category46 + "' != '" + java.util.Locale.Category.FORMAT + "'", category46.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar49);
        org.junit.Assert.assertEquals(calendar49.toString(), "java.util.GregorianCalendar[time=1640995200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(durationFieldType55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2849 + "'", int69 == 2849);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2025 + "'", int70 == 2025);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "2022" + "'", str72, "2022");
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime75);
    }

    @Test
    public void test18742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18742");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths(241);
        org.joda.time.DateTime dateTime8 = dateTime4.withCenturyOfEra(669);
        org.joda.time.Instant instant9 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime4.plus(1320000L);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfMonth(2);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekyear(119);
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfWeek();
        int int17 = property16.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test18743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18743");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.lang.String str8 = property7.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime13 = dateTime10.withFieldAdded(durationFieldType11, 0);
        org.joda.time.DateTime.Property property14 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property14.roundHalfEvenCopy();
        int int16 = dateTime15.getYearOfCentury();
        long long17 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withDayOfWeek(2);
        long long22 = dateTime19.getMillis();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime19.withPeriodAdded(readablePeriod23, 9);
        int int26 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime28 = dateTime15.minusHours(10);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime28.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.plus(readableDuration30);
        org.joda.time.DateTime dateTime32 = dateTime31.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime34 = dateTime32.withYear(58);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime37 = dateTime34.withDurationAdded(readableDuration35, 87622);
        org.joda.time.DateTime.Property property38 = dateTime37.hourOfDay();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[secondOfMinute]" + "'", str8, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1645455816773L + "'", long22 == 1645455816773L);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
    }

    @Test
    public void test18744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18744");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 14);
        int int12 = dateTimeFormatter7.getDefaultYear();
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withLocale(locale13);
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.lang.String str16 = locale13.getDisplayScript(locale15);
        java.lang.String str17 = locale13.getDisplayCountry();
        java.lang.String str18 = locale13.getDisplayLanguage();
        java.util.Locale.setDefault(locale13);
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(locale15);
// flaky:         org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Canada" + "'", str17, "Canada");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "French" + "'", str18, "French");
    }

    @Test
    public void test18745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18745");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("14:55:40.000");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
    }

    @Test
    public void test18746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18746");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime2 = property1.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusDays(70);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear(19);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plus(readablePeriod7);
        int int9 = localDateTime8.getYearOfEra();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
    }

    @Test
    public void test18747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18747");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.months();
        boolean boolean10 = durationFieldType0.isSupported((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField13 = copticChronology1.seconds();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57635003L + "'", long7 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test18748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18748");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime2 = property1.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusDays(70);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withMillisOfSecond(558);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        java.util.GregorianCalendar gregorianCalendar11 = dateTime9.toGregorianCalendar();
        boolean boolean12 = gregorianCalendar11.isWeekDateSupported();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test18749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18749");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.withWeekOfWeekyear(21);
        org.joda.time.LocalDate.Property property21 = localDate20.year();
        org.joda.time.LocalDate.Property property22 = localDate20.year();
        org.joda.time.LocalDate localDate23 = property22.getLocalDate();
        org.joda.time.DateTimeField dateTimeField24 = property22.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = dateTimeField24.getType();
        int int27 = dateTimeField24.get(30326400000L);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
    }

    @Test
    public void test18750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18750");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField10 = dateTimeField9.getLeapDurationField();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = dateTimeZone13.getName((long) (short) 0, locale17);
        boolean boolean19 = locale17.hasExtensions();
        java.util.Set<java.lang.Character> charSet20 = locale17.getExtensionKeys();
        java.lang.String str21 = dateTimeField9.getAsShortText(7, locale17);
        org.joda.time.ReadablePartial readablePartial22 = null;
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.halfdayOfDay();
        long long29 = copticChronology24.add((long) '#', 10L, (-1));
        org.joda.time.DateTimeField dateTimeField30 = copticChronology24.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology24.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology24.centuryOfEra();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(chronology33);
        int int35 = localTime34.getHourOfDay();
        org.joda.time.LocalTime.Property property36 = localTime34.hourOfDay();
        org.joda.time.LocalTime localTime38 = property36.addWrapFieldToCopy((int) 'u');
        org.joda.time.LocalTime localTime39 = property36.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime41 = property36.addCopy((long) 674);
        org.joda.time.LocalTime localTime43 = localTime41.plusHours(53782602);
        int[] intArray45 = copticChronology24.get((org.joda.time.ReadablePartial) localTime43, 348L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray47 = dateTimeField9.add(readablePartial22, 54036187, intArray45, 410);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54036187");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 893L + "'", long15 == 893L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "7" + "'", str21, "7");
        org.junit.Assert.assertNotNull(copticChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 25L + "'", long29 == 25L);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 0, 0, 348]");
    }

    @Test
    public void test18751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18751");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        int int7 = dateTime6.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.minus(readablePeriod8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.plus(readablePeriod10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks(70);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime13.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears(53702963);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test18752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18752");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology1.months();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.hourOfHalfday();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.secondOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 53672844, (org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(610);
        java.util.Date date14 = new java.util.Date((long) (byte) 0);
        int int15 = date14.getMinutes();
        int int16 = date14.getDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) date14, chronology17);
        org.joda.time.LocalDate localDate20 = localDate18.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone22.nextTransition((long) 893);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone22.getMillisKeepLocal(dateTimeZone26, 0L);
        org.joda.time.DateTime dateTime29 = localDate18.toDateTimeAtMidnight(dateTimeZone22);
        java.util.Date date31 = new java.util.Date((long) (byte) 0);
        int int32 = date31.getMinutes();
        int int33 = date31.getDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) date31, chronology34);
        org.joda.time.LocalDate localDate37 = localDate35.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone39 = instant38.getZone();
        long long41 = dateTimeZone39.nextTransition((long) 893);
        org.joda.time.Instant instant42 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone43 = instant42.getZone();
        long long45 = dateTimeZone39.getMillisKeepLocal(dateTimeZone43, 0L);
        org.joda.time.DateTime dateTime46 = localDate35.toDateTimeAtMidnight(dateTimeZone39);
        org.joda.time.DateTime dateTime47 = localDate18.toDateTimeAtStartOfDay(dateTimeZone39);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDate localDate50 = localDate18.withPeriodAdded(readablePeriod48, 122);
        org.joda.time.LocalDate localDate52 = localDate50.withYearOfEra(21);
        int int53 = localDate50.getEra();
        org.joda.time.LocalDate localDate55 = localDate50.minusWeeks(490);
        org.joda.time.Instant instant56 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone57 = instant56.getZone();
        long long59 = dateTimeZone57.nextTransition((long) 893);
        org.joda.time.Instant instant60 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone61 = instant60.getZone();
        long long63 = dateTimeZone57.getMillisKeepLocal(dateTimeZone61, 0L);
        long long65 = dateTimeZone61.nextTransition((long) (-1));
        org.joda.time.Instant instant66 = org.joda.time.Instant.now();
        boolean boolean67 = instant66.isAfterNow();
        org.joda.time.Instant instant69 = instant66.plus((long) 53671795);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime(dateTimeZone70);
        org.joda.time.DateTime dateTime73 = dateTime71.withDayOfWeek(2);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((java.lang.Object) dateTime71);
        int int75 = dateTime74.getEra();
        boolean boolean76 = instant66.isBefore((org.joda.time.ReadableInstant) dateTime74);
        int int77 = dateTimeZone61.getOffset((org.joda.time.ReadableInstant) instant66);
        long long80 = dateTimeZone61.convertLocalToUTC(1645455327957L, false);
        org.joda.time.DateMidnight dateMidnight81 = localDate55.toDateMidnight(dateTimeZone61);
        org.joda.time.DateTime dateTime82 = dateTime10.toDateTime(dateTimeZone61);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 893L + "'", long24 == 893L);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 893L + "'", long41 == 893L);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(instant56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 893L + "'", long59 == 893L);
        org.junit.Assert.assertNotNull(instant60);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-1L) + "'", long65 == (-1L));
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(instant69);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1645455327957L + "'", long80 == 1645455327957L);
        org.junit.Assert.assertNotNull(dateMidnight81);
        org.junit.Assert.assertNotNull(dateTime82);
    }

    @Test
    public void test18753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18753");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone7);
        boolean boolean9 = timeZone7.observesDaylightTime();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeZone7.getOffset(843, 387, 704, 558, 54152022, 634);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 843");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645455816966,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=36,MILLISECOND=966,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18754");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.yearOfCentury();
        org.joda.time.DurationField durationField11 = copticChronology0.halfdays();
        java.util.Date date13 = new java.util.Date((long) (byte) 0);
        int int14 = date13.getMinutes();
        int int15 = date13.getTimezoneOffset();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromDateFields(date13);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusSeconds(294);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 52);
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        java.lang.String str24 = dateTimeZone21.getName((long) 37);
        org.joda.time.DateTime dateTime25 = localDateTime18.toDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime18.minusWeeks(36);
        int[] intArray29 = copticChronology0.get((org.joda.time.ReadablePartial) localDateTime27, (-29848986114572L));
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:52");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:52" + "'", str24, "+00:52");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[740, 6, 14, 53885428]");
    }

    @Test
    public void test18755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18755");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusHours(893);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minus(readablePeriod6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.dayOfYear();
        boolean boolean10 = property8.equals((java.lang.Object) 670);
        org.joda.time.LocalDateTime localDateTime11 = property8.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusMonths(867);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime18 = dateTime15.withFieldAdded(durationFieldType16, 0);
        int int19 = dateTime15.getMillisOfDay();
        org.joda.time.DateTime dateTime21 = dateTime15.plusDays(53659644);
        org.joda.time.DateTime dateTime22 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime11.withDate(174, 54019772, 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54019772 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 54216997 + "'", int19 == 54216997);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test18756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18756");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance();
        long long8 = copticChronology2.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField9 = copticChronology2.months();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType1.getField((org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology2.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 490, (org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology2.era();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField17 = copticChronology2.days();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology2.dayOfYear();
        long long21 = dateTimeField18.add(1645455618085L, 633);
        long long24 = dateTimeField18.add((long) (-587884), (long) 28);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 57635003L + "'", long8 == 57635003L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1700146818085L + "'", long21 == 1700146818085L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2418612116L + "'", long24 == 2418612116L);
    }

    @Test
    public void test18757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18757");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 0);
        boolean boolean6 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime0.getMillisOfDay();
        org.joda.time.DateTime dateTime9 = dateTime0.minusYears((int) (short) 0);
        org.joda.time.DateTime dateTime12 = dateTime9.withDurationAdded(21859200000L, (int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime9.toTimeOfDay();
        org.joda.time.LocalTime localTime14 = dateTime9.toLocalTime();
        int int15 = localTime14.size();
        org.joda.time.LocalTime localTime17 = localTime14.plusHours(620);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 54217019 + "'", int7 == 54217019);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test18758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18758");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 16, dateTimeZone2);
        int int4 = dateTime3.getDayOfYear();
        org.joda.time.DateTime dateTime6 = dateTime3.plusWeeks(164);
        java.util.GregorianCalendar gregorianCalendar7 = dateTime3.toGregorianCalendar();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
    }

    @Test
    public void test18759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18759");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = property8.getMaximumValueOverall();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = dateTimeZone13.getName((long) (short) 0, locale17);
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTime dateTime21 = dateTime20.toDateTimeISO();
        org.joda.time.DateTime.Property property22 = dateTime21.minuteOfHour();
        int int23 = dateTime21.getDayOfMonth();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 893L + "'", long15 == 893L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test18760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18760");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.util.Locale locale6 = dateTimeFormatter2.getLocale();
        boolean boolean7 = dateTimeFormatter2.isParser();
        boolean boolean8 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withOffsetParsed();
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test18761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18761");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime18 = dateTime6.plusMinutes(53631987);
        int int19 = dateTime18.getMillisOfSecond();
        org.joda.time.DateTime.Property property20 = dateTime18.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.minus(readablePeriod21);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "dayOfMonth" + "'", str15, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 65 + "'", int19 == 65);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test18762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18762");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar6 = dateTime1.toGregorianCalendar();
        int int7 = gregorianCalendar6.getFirstDayOfWeek();
        gregorianCalendar6.setFirstDayOfWeek(836);
        boolean boolean10 = gregorianCalendar6.isWeekDateSupported();
        int int11 = gregorianCalendar6.getMinimalDaysInFirstWeek();
        java.util.Date date12 = gregorianCalendar6.getTime();
        int int13 = gregorianCalendar6.getWeekYear();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.fromCalendarFields((java.util.Calendar) gregorianCalendar6);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 903 + "'", int2 == 903);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Feb 21 15:03:37 UTC 2022");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test18763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18763");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId1 = timeZone0.toZoneId();
        int int2 = timeZone0.getRawOffset();
        timeZone0.setID("English");
        java.util.TimeZone.setDefault(timeZone0);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18764");
        java.util.Date date3 = new java.util.Date(54022, 53788542, 53781124);
        int int4 = date3.getYear();
        org.junit.Assert.assertEquals(date3.toString(), "Thu Mar 18 00:00:00 GMT+00:00 4685548");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4683648 + "'", int4 == 4683648);
    }

    @Test
    public void test18765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18765");
        java.util.Locale locale1 = new java.util.Locale("16");
        java.util.Locale locale2 = locale1.stripExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "16");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "16");
    }

    @Test
    public void test18766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18766");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        long long4 = dateTimeZone2.nextTransition((long) 893);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = dateTimeZone2.getName((long) (short) 0, locale6);
        java.util.TimeZone timeZone8 = dateTimeZone2.toTimeZone();
        timeZone8.setID("Property[secondOfMinute]");
        java.util.Calendar.Builder builder11 = builder0.setTimeZone(timeZone8);
        timeZone8.setRawOffset(0);
        java.util.Locale.Category category14 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale15 = java.util.Locale.getDefault(category14);
        java.util.Locale locale16 = java.util.Locale.getDefault(category14);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone8, locale16);
        int int18 = timeZone8.getRawOffset();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 893L + "'", long4 == 893L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category14.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645455817106,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Property[secondOfMinute],offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=37,MILLISECOND=106,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test18767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18767");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        int int8 = calendar7.getWeeksInWeekYear();
        java.time.Instant instant9 = calendar7.toInstant();
        int int10 = calendar7.getWeeksInWeekYear();
        int int11 = calendar7.getWeeksInWeekYear();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromCalendarFields(calendar7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime12.withSecondOfMinute(911);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 911 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 903 + "'", int4 == 903);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455817117,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=37,MILLISECOND=117,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test18768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18768");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = property8.getMaximumValueOverall();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = dateTimeZone13.getName((long) (short) 0, locale17);
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTime dateTime21 = dateTime20.toDateTimeISO();
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.withDurationAdded(readableDuration23, 16);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.plus(readablePeriod27);
        org.joda.time.DateTime.Property property29 = dateTime25.millisOfDay();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 893L + "'", long15 == 893L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test18769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18769");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.util.Calendar calendar3 = dateTime1.toCalendar(locale2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        org.joda.time.LocalDate localDate6 = localDate4.withYear(1970);
        org.joda.time.LocalDate.Property property7 = localDate4.year();
        org.joda.time.LocalDate localDate8 = property7.getLocalDate();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455817145,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=37,MILLISECOND=145,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test18770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18770");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfMonth();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.secondOfMinute();
        long long15 = dateTimeField13.roundHalfFloor((long) 39326);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 39000L + "'", long15 == 39000L);
    }

    @Test
    public void test18771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18771");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1645455787943L);
    }

    @Test
    public void test18772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18772");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone7);
        java.time.ZoneId zoneId9 = timeZone7.toZoneId();
        java.lang.String str10 = timeZone7.getID();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = timeZone7.getDisplayName(false, 53883022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 53883022");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645455817169,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=3,SECOND=37,MILLISECOND=169,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(zoneId9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
    }

    @Test
    public void test18773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18773");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime7 = dateTime4.withFieldAdded(durationFieldType5, 0);
        org.joda.time.DateTime.Property property8 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime9 = property8.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property10 = dateTime9.secondOfMinute();
        java.lang.String str11 = property10.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime16 = dateTime13.withFieldAdded(durationFieldType14, 0);
        org.joda.time.DateTime.Property property17 = dateTime13.minuteOfDay();
        org.joda.time.DateTime dateTime18 = property17.roundHalfEvenCopy();
        int int19 = dateTime18.getYearOfCentury();
        long long20 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str23 = locale22.getISO3Language();
        java.util.Locale.Category category24 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale25 = java.util.Locale.getDefault(category24);
        java.lang.String str26 = locale22.getDisplayLanguage(locale25);
        int int27 = property10.getMaximumTextLength(locale25);
        java.util.Locale.Builder builder28 = builder2.setLocale(locale25);
        java.util.Locale.Builder builder29 = builder2.clearExtensions();
        java.util.Locale.Builder builder30 = builder29.clearExtensions();
        java.util.Locale.Builder builder31 = builder29.clearExtensions();
        java.util.Locale.Builder builder34 = builder29.setExtension('a', "und");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder37 = builder34.setExtension('#', "22 Oct 2116 00:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[secondOfMinute]" + "'", str11, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 22 + "'", int19 == 22);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + category24 + "' != '" + java.util.Locale.Category.FORMAT + "'", category24.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test18774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18774");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("hi!");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        int int4 = calendar3.getFirstDayOfWeek();
        int int5 = calendar3.getWeeksInWeekYear();
        calendar3.setTimeInMillis(1645455463377L);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime14 = dateTime11.withFieldAdded(durationFieldType12, 0);
        org.joda.time.DateTime.Property property15 = dateTime11.minuteOfDay();
        org.joda.time.DateTime dateTime16 = property15.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property17 = dateTime16.secondOfMinute();
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.util.Calendar calendar19 = dateTime16.toCalendar(locale18);
        java.lang.String str20 = locale18.getDisplayCountry();
        java.lang.String str21 = locale18.getDisplayName();
        java.util.Set<java.lang.String> strSet22 = locale18.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap23 = calendar3.getDisplayNames(763, 0, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455463377,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=hi!,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=57,SECOND=43,MILLISECOND=377,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1645455840000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=4,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Canada" + "'", str20, "Canada");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "anglais (Canada)" + "'", str21, "anglais (Canada)");
        org.junit.Assert.assertNotNull(strSet22);
    }
}
