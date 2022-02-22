import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

    public static boolean debug = false;

    @Test
    public void test15001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15001");
        java.util.Date date5 = new java.util.Date(4492, 110, (-9), 2023, 645);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon May 14 17:45:00 GMT+00:00 6401");
    }

    @Test
    public void test15002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15002");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 2, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((-1L), dateTimeZone2);
        org.joda.time.LocalDate localDate7 = localDate5.withDayOfWeek(2);
        org.joda.time.LocalDate localDate9 = localDate7.plusMonths(3);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime12 = localDate7.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.LocalDate.Property property13 = localDate7.weekOfWeekyear();
        org.joda.time.LocalDate localDate15 = localDate7.withYear(26);
        org.joda.time.LocalDate localDate17 = localDate7.withYearOfEra(86381027);
        org.joda.time.LocalDate localDate19 = localDate17.plusMonths(1237);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test15003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15003");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Interval interval3 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime6 = dateTime1.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.Period period13 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime9.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime16 = dateTime1.toDateTime(chronology15);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime17, (org.joda.time.ReadablePartial) localTime18, periodType19);
        org.joda.time.LocalTime localTime22 = localTime18.withMillisOfSecond(4);
        int[] intArray24 = chronology15.get((org.joda.time.ReadablePartial) localTime18, (long) 0);
        org.joda.time.Chronology chronology25 = chronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getChronology(chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.secondOfDay();
        org.joda.time.Period period29 = new org.joda.time.Period(562976006400000L, chronology27);
        org.joda.time.Period period31 = period29.minusYears(1970);
        java.lang.String str32 = period29.toString();
        int int33 = period29.getMillis();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(intArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 0, 8]");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "P930846W4D" + "'", str32, "P930846W4D");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test15004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15004");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withField(dateTimeFieldType9, 100);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusMonths(5);
        org.joda.time.LocalDateTime.Property property20 = localDateTime16.dayOfYear();
        org.joda.time.LocalDateTime localDateTime22 = property20.addToCopy(478);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withYearOfCentury(1);
        java.util.Locale locale27 = new java.util.Locale("", "hi!");
        java.text.DateFormatSymbols dateFormatSymbols28 = new java.text.DateFormatSymbols(locale27);
        boolean boolean29 = locale27.hasExtensions();
        java.util.Locale locale30 = locale27.stripExtensions();
        boolean boolean31 = localDateTime22.equals((java.lang.Object) locale27);
        boolean boolean32 = locale27.hasExtensions();
        java.lang.String str35 = nameProvider0.getName(locale27, "0893-04-29T20:00:01.893", "0120-01-04");
        java.lang.String str36 = locale27.getDisplayVariant();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertEquals(locale27.toString(), "_HI!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "_HI!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test15005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15005");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 17);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter2.getParser();
        boolean boolean7 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(10L, chronology9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyear();
        int int12 = dateTime10.get(dateTimeFieldType11);
        org.joda.time.DateTime dateTime14 = dateTime10.plusWeeks(4);
        java.util.Locale locale15 = java.util.Locale.ROOT;
        java.util.Calendar calendar16 = dateTime14.toCalendar(locale15);
        java.util.Date date17 = calendar16.getTime();
        java.util.Calendar.Builder builder18 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder22 = builder18.setTimeOfDay(1, (int) (short) 1, 53623795);
        java.util.Calendar.Builder builder26 = builder22.setDate((int) (byte) 10, 20, (int) '#');
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(10L, chronology28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyear();
        int int31 = dateTime29.get(dateTimeFieldType30);
        org.joda.time.DateTime dateTime33 = dateTime29.plusWeeks(4);
        java.util.Locale locale34 = java.util.Locale.ROOT;
        java.util.Calendar calendar35 = dateTime33.toCalendar(locale34);
        java.util.TimeZone timeZone36 = calendar35.getTimeZone();
        java.util.Calendar.Builder builder37 = builder22.setTimeZone(timeZone36);
        timeZone36.setID("65");
        calendar16.setTimeZone(timeZone36);
        org.joda.time.LocalDate localDate41 = org.joda.time.LocalDate.fromCalendarFields(calendar16);
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone45 = dateTimeZone44.toTimeZone();
        long long48 = dateTimeZone44.adjustOffset((long) 'x', true);
        org.joda.time.DateTime dateTime49 = localDate42.toDateTimeAtStartOfDay(dateTimeZone44);
        org.joda.time.DateTime dateTime50 = localDate41.toDateTimeAtStartOfDay(dateTimeZone44);
        org.joda.time.LocalDate localDate51 = org.joda.time.LocalDate.now(dateTimeZone44);
        boolean boolean53 = dateTimeZone44.isStandardOffset((-36732196798107L));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter2.withZone(dateTimeZone44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = dateTimeFormatter2.withDefaultYear(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str58 = dateTimeFormatter2.print((long) 248086830);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(dateTimeParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=2419200010,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=65,offset=8,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=29,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=18,ZONE_OFFSET=8,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 29 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1970 + "'", int31 == 1970);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertNotNull(calendar35);
// flaky:         org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=2419200010,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=65,offset=8,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=29,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=18,ZONE_OFFSET=8,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 120L + "'", long48 == 120L);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter54);
        org.junit.Assert.assertNotNull(dateTimeFormatter56);
    }

    @Test
    public void test15006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15006");
        java.util.Date date3 = new java.util.Date(2022, 1970, (int) (short) 100);
        int int4 = date3.getMinutes();
        date3.setHours(478);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromDateFields(date3);
        int int8 = date3.getTimezoneOffset();
        date3.setHours(165);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Wed Jul 03 21:00:00 GMT+00:00 4086");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test15007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15007");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 2, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((-1L), dateTimeZone2);
        int int6 = localDate5.getYearOfEra();
        org.joda.time.DateTime dateTime7 = localDate5.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate9 = localDate5.plusYears(132);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        boolean boolean16 = interval14.isAfter((long) 10);
        org.joda.time.Duration duration17 = interval14.toDuration();
        org.joda.time.Chronology chronology18 = interval14.getChronology();
        org.joda.time.MutableInterval mutableInterval19 = new org.joda.time.MutableInterval((long) 1, (long) (byte) 1, chronology18);
        org.joda.time.Period period21 = org.joda.time.Period.seconds(99);
        long long24 = chronology18.add((org.joda.time.ReadablePeriod) period21, (long) 53657, 0);
        org.joda.time.LocalDate localDate25 = localDate9.minus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.LocalDate localDate27 = localDate9.plusDays(15);
        org.joda.time.LocalDate localDate29 = localDate9.plusDays(8454);
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 53657L + "'", long24 == 53657L);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(chronology30);
    }

    @Test
    public void test15008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15008");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant1 = dateTime0.toInstant();
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTimeISO();
        long long4 = instant1.getMillis();
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 34L + "'", long4 == 34L);
    }

    @Test
    public void test15009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15009");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withField(dateTimeFieldType6, 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfWeek();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalDateTime localDateTime17 = property14.addToCopy(99L);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withField(dateTimeFieldType24, 100);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withField(dateTimeFieldType33, 100);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime32.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        int int41 = localDateTime40.getSecondOfMinute();
        int int42 = localDateTime26.compareTo((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.plusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withField(dateTimeFieldType51, 100);
        org.joda.time.Period period54 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDateTime44, (org.joda.time.ReadablePartial) localDateTime53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime17.withPeriodAdded((org.joda.time.ReadablePeriod) period54, (int) (short) -1);
        int int57 = localDateTime17.getDayOfMonth();
        int int58 = localDateTime17.getWeekyear();
        org.joda.time.LocalDateTime.Property property59 = localDateTime17.dayOfYear();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        int int66 = localDateTime65.getEra();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime65.withYear(2);
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.dayOfWeek();
        org.joda.time.Period period71 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant72 = null;
        org.joda.time.Duration duration73 = period71.toDurationFrom(readableInstant72);
        org.joda.time.PeriodType periodType74 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Period period75 = period71.normalizedStandard(periodType74);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime68.minus((org.joda.time.ReadablePeriod) period71);
        int int77 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime68);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime79 = localDateTime68.withDayOfYear(827810);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 827810 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 19 + "'", int57 == 19);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 14 + "'", int58 == 14);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertNotNull(periodType74);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
    }

    @Test
    public void test15010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15010");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        java.lang.String str4 = interval2.toString();
        org.joda.time.Chronology chronology5 = interval2.getChronology();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime11 = dateTime6.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Interval interval12 = interval2.withEnd((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Interval interval13 = interval2.toInterval();
        org.joda.time.Duration duration14 = interval2.toDuration();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Interval interval19 = interval17.toInterval();
        boolean boolean21 = interval17.contains((long) 1970);
        org.joda.time.Interval interval22 = interval17.toInterval();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Interval interval24 = interval22.withEnd(readableInstant23);
        org.joda.time.Interval interval25 = interval24.toInterval();
        boolean boolean26 = interval2.contains((org.joda.time.ReadableInterval) interval25);
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval((org.joda.time.ReadableInterval) interval2);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime31 = interval30.getEnd();
        org.joda.time.Interval interval32 = interval30.toInterval();
        boolean boolean34 = interval30.contains((long) 1970);
        org.joda.time.Interval interval35 = interval30.toInterval();
        org.joda.time.ReadableInstant readableInstant36 = null;
        boolean boolean37 = interval35.isBefore(readableInstant36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property39 = dateTime38.era();
        org.joda.time.DurationField durationField40 = property39.getLeapDurationField();
        int int41 = property39.getMaximumValueOverall();
        int int42 = property39.getMinimumValueOverall();
        org.joda.time.DateTime dateTime43 = property39.getDateTime();
        org.joda.time.DateTime dateTime44 = property39.withMaximumValue();
        org.joda.time.Interval interval45 = interval35.withEnd((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        boolean boolean47 = interval45.containsNow();
        boolean boolean48 = interval2.isBefore((org.joda.time.ReadableInterval) interval45);
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime49, (org.joda.time.ReadablePartial) localTime50, periodType51);
        org.joda.time.LocalTime localTime54 = localTime49.minusSeconds((int) (short) 100);
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime55, (org.joda.time.ReadablePartial) localTime56, periodType57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime();
        org.joda.time.Interval interval61 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime59, (org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.DateTime dateTime62 = interval61.getEnd();
        org.joda.time.DateTime dateTime64 = dateTime62.plusMonths((int) (byte) 100);
        org.joda.time.LocalTime localTime65 = dateTime62.toLocalTime();
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime();
        org.joda.time.Interval interval68 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadableInstant) dateTime67);
        boolean boolean70 = interval68.isAfter((long) 10);
        org.joda.time.Duration duration71 = interval68.toDuration();
        org.joda.time.DateTime dateTime73 = dateTime62.withDurationAdded((org.joda.time.ReadableDuration) duration71, 0);
        org.joda.time.DateTime dateTime74 = localTime56.toDateTime((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.PeriodType periodType75 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.DurationFieldType durationFieldType77 = periodType75.getFieldType((int) (byte) 0);
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime49, (org.joda.time.ReadablePartial) localTime56, periodType75);
        org.joda.time.DurationFieldType[] durationFieldTypeArray79 = period78.getFieldTypes();
        org.joda.time.Days days80 = period78.toStandardDays();
        org.joda.time.Interval interval81 = interval45.withPeriodAfterStart((org.joda.time.ReadablePeriod) days80);
        org.junit.Assert.assertNotNull(dateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.042+00:00:00.008/1970-01-01T00:00:00.042+00:00:00.008" + "'", str4, "1970-01-01T00:00:00.042+00:00:00.008/1970-01-01T00:00:00.042+00:00:00.008");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNull(durationField40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertNotNull(durationFieldType77);
        org.junit.Assert.assertNotNull(durationFieldTypeArray79);
        org.junit.Assert.assertNotNull(days80);
        org.junit.Assert.assertNotNull(interval81);
    }

    @Test
    public void test15011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15011");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        boolean boolean4 = interval2.isAfter((long) 10);
        org.joda.time.Duration duration5 = interval2.toDuration();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        boolean boolean10 = interval8.isAfter((long) 10);
        org.joda.time.Duration duration11 = interval8.toDuration();
        org.joda.time.Duration duration13 = duration5.withDurationAdded((org.joda.time.ReadableDuration) duration11, (int) '4');
        org.joda.time.Duration duration15 = duration5.withMillis((long) (short) -1);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = interval18.getEnd();
        org.joda.time.Interval interval20 = interval18.toInterval();
        boolean boolean22 = interval18.contains((long) 1970);
        org.joda.time.Interval interval23 = interval18.toInterval();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        boolean boolean28 = interval26.isAfter((long) 10);
        boolean boolean29 = interval23.abuts((org.joda.time.ReadableInterval) interval26);
        org.joda.time.Interval interval30 = interval26.toInterval();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime.Property property34 = dateTime32.millisOfDay();
        org.joda.time.DateTime.Property property35 = dateTime32.weekyear();
        boolean boolean36 = interval30.isAfter((org.joda.time.ReadableInstant) dateTime32);
        long long37 = interval30.toDurationMillis();
        org.joda.time.Duration duration38 = interval30.toDuration();
        boolean boolean39 = duration5.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Duration duration40 = duration38.toDuration();
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property43 = dateTime42.era();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Period period48 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime49 = dateTime44.plus((org.joda.time.ReadablePeriod) period48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime();
        org.joda.time.Interval interval53 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableInstant) dateTime52);
        int int54 = dateTime51.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = dateTime51.toDateTime(dateTimeZone55);
        int int57 = dateTime44.compareTo((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime();
        org.joda.time.Interval interval60 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime59);
        boolean boolean62 = interval60.isAfter((long) 10);
        org.joda.time.Duration duration63 = interval60.toDuration();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime();
        org.joda.time.Interval interval66 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) dateTime65);
        boolean boolean68 = interval66.isAfter((long) 10);
        org.joda.time.Duration duration69 = interval66.toDuration();
        org.joda.time.Duration duration71 = duration63.withDurationAdded((org.joda.time.ReadableDuration) duration69, (int) '4');
        org.joda.time.Interval interval72 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime51, (org.joda.time.ReadableDuration) duration63);
        mutableInterval41.setDurationAfterStart((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Days days74 = duration63.toStandardDays();
        org.joda.time.ReadableInstant readableInstant75 = null;
        org.joda.time.Interval interval76 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration63, readableInstant75);
        java.lang.String str77 = duration63.toString();
        boolean boolean78 = duration38.isShorterThan((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Days days79 = duration38.toStandardDays();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(chronology50);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertNotNull(days74);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "PT0S" + "'", str77, "PT0S");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(days79);
    }

    @Test
    public void test15012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15012");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        boolean boolean4 = interval2.isAfter((long) 10);
        boolean boolean5 = interval2.containsNow();
        long long6 = interval2.toDurationMillis();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(10L, chronology10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyear();
        int int13 = dateTime11.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime11.plusWeeks(4);
        boolean boolean16 = periodType8.equals((java.lang.Object) dateTime15);
        int int17 = periodType8.size();
        org.joda.time.PeriodType periodType18 = periodType8.withMillisRemoved();
        org.joda.time.Period period19 = new org.joda.time.Period((long) 12, periodType8);
        org.joda.time.Interval interval20 = interval2.withPeriodAfterStart((org.joda.time.ReadablePeriod) period19);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime25 = interval24.getEnd();
        org.joda.time.Interval interval26 = interval24.toInterval();
        boolean boolean28 = interval24.contains((long) 1970);
        org.joda.time.Interval interval29 = interval24.toInterval();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime30, (org.joda.time.ReadableInstant) dateTime31);
        boolean boolean34 = interval32.isAfter((long) 10);
        boolean boolean35 = interval29.abuts((org.joda.time.ReadableInterval) interval32);
        org.joda.time.Chronology chronology36 = interval32.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.weekyears();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (-1), chronology36);
        org.joda.time.Interval interval39 = interval20.withChronology(chronology36);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        org.joda.time.Interval interval42 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime43 = interval42.getEnd();
        org.joda.time.Interval interval44 = interval42.toInterval();
        boolean boolean46 = interval42.contains((long) 1970);
        boolean boolean47 = interval39.abuts((org.joda.time.ReadableInterval) interval42);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) 10, chronology49);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = dateTime50.toDateTime(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = dateTime50.withZoneRetainFields(dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime50.plusMinutes((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = null;
        java.lang.String str58 = dateTime50.toString(dateTimeFormatter57);
        org.joda.time.DateTime dateTime59 = dateTime50.withLaterOffsetAtOverlap();
        org.joda.time.LocalTime localTime60 = dateTime59.toLocalTime();
        boolean boolean61 = interval42.contains((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Period period63 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Duration duration65 = period63.toDurationFrom(readableInstant64);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime();
        org.joda.time.Interval interval68 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadableInstant) dateTime67);
        boolean boolean70 = interval68.isAfter((long) 10);
        org.joda.time.Duration duration71 = interval68.toDuration();
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime();
        org.joda.time.Interval interval74 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime72, (org.joda.time.ReadableInstant) dateTime73);
        boolean boolean76 = interval74.isAfter((long) 10);
        org.joda.time.Duration duration77 = interval74.toDuration();
        org.joda.time.Duration duration79 = duration71.withDurationAdded((org.joda.time.ReadableDuration) duration77, (int) '4');
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime();
        org.joda.time.Interval interval82 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime80, (org.joda.time.ReadableInstant) dateTime81);
        int int83 = dateTime80.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.DateTime dateTime85 = dateTime80.toDateTime(dateTimeZone84);
        int int86 = dateTime85.getCenturyOfEra();
        org.joda.time.Interval interval87 = duration77.toIntervalTo((org.joda.time.ReadableInstant) dateTime85);
        int int88 = duration65.compareTo((org.joda.time.ReadableDuration) duration77);
        org.joda.time.Period period89 = duration77.toPeriod();
        org.joda.time.Period period91 = period89.withSeconds(68);
        org.joda.time.Period period93 = period89.withHours(53773647);
        org.joda.time.Interval interval94 = interval42.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period89);
        org.joda.time.Period period95 = period89.toPeriod();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1970-01-01T00:00:00.018+00:00:00.008" + "'", str58, "1970-01-01T00:00:00.018+00:00:00.008");
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(duration71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(duration77);
        org.junit.Assert.assertNotNull(duration79);
// flaky:         org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(dateTime85);
// flaky:         org.junit.Assert.assertTrue("'" + int86 + "' != '" + 19 + "'", int86 == 19);
        org.junit.Assert.assertNotNull(interval87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(period93);
        org.junit.Assert.assertNotNull(interval94);
        org.junit.Assert.assertNotNull(period95);
    }

    @Test
    public void test15013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15013");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 0);
        org.joda.time.LocalDate localDate3 = localDate1.minusDays(29);
        org.joda.time.LocalDate.Property property4 = localDate1.yearOfEra();
        java.lang.String str5 = property4.getAsString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = property4.setCopy("0006-01-04T14:56:19.932Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0006-01-04T14:56:19.932Z\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970" + "'", str5, "1970");
    }

    @Test
    public void test15014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15014");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(10L, chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        int int5 = dateTime3.get(dateTimeFieldType4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusWeeks(4);
        boolean boolean8 = periodType0.equals((java.lang.Object) dateTime7);
        int int9 = periodType0.size();
        org.joda.time.PeriodType periodType10 = periodType0.withMillisRemoved();
        org.joda.time.PeriodType periodType11 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType12 = periodType0.withMinutesRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test15015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15015");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("2022-02-21T14:53:44.007Z/2022-02-21T14:53:44.007Z");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.lang.String str4 = locale1.getLanguage();
        java.lang.String str5 = locale1.getDisplayCountry();
        java.lang.String str6 = locale1.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test15016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15016");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        org.joda.time.Period period5 = period3.minusYears(893);
        org.joda.time.DurationFieldType[] durationFieldTypeArray6 = period3.getFieldTypes();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.forFields(durationFieldTypeArray6);
        org.joda.time.PeriodType periodType8 = periodType7.withMinutesRemoved();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.days();
        int int10 = periodType8.indexOf(durationFieldType9);
        java.lang.String str11 = durationFieldType9.getName();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(durationFieldTypeArray6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "days" + "'", str11, "days");
    }

    @Test
    public void test15017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15017");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '#');
        int int3 = period1.getValue(0);
        org.joda.time.Period period5 = period1.plusDays((int) '#');
        int[] intArray6 = period1.getValues();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.era();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        int int10 = property8.getMaximumValueOverall();
        int int11 = property8.getMinimumValueOverall();
        org.joda.time.DateTime dateTime12 = property8.getDateTime();
        org.joda.time.DateTime dateTime13 = property8.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        org.joda.time.DateTime.Property property16 = dateTime14.monthOfYear();
        boolean boolean17 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.plus(readableDuration18);
        org.joda.time.DateTime.Property property20 = dateTime14.minuteOfDay();
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((org.joda.time.ReadablePeriod) period1, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime.Property property22 = dateTime14.centuryOfEra();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0, 0, 0, 0, 0, 0, 35]");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test15018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15018");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getDayOfWeek();
        org.joda.time.DateTime dateTime5 = dateTime0.minusMinutes(53633080);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime0, readablePeriod6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.parse("minutes", strMap9);
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("2022-02-21T14:53:44.007Z/2022-02-21T14:53:44.007Z");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags(languageRangeList10, (java.util.Collection<java.lang.String>) strSet13);
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("2022-02-21T14:53:44.007Z/2022-02-21T14:53:44.007Z");
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleAttributes();
        boolean boolean20 = strSet17.addAll((java.util.Collection<java.lang.String>) strSet19);
        boolean boolean21 = strSet13.containsAll((java.util.Collection<java.lang.String>) strSet17);
        java.util.Iterator<java.lang.String> strItor22 = strSet17.iterator();
        boolean boolean23 = dateTime0.equals((java.lang.Object) strSet17);
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("2022-02-21T14:53:44.007Z/2022-02-21T14:53:44.007Z");
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleKeys();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleAttributes();
        boolean boolean29 = strSet26.addAll((java.util.Collection<java.lang.String>) strSet28);
        java.util.Iterator<java.lang.String> strItor30 = strSet28.iterator();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap32 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList33 = java.util.Locale.LanguageRange.parse("minutes", strMap32);
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("2022-02-21T14:53:44.007Z/2022-02-21T14:53:44.007Z");
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags(languageRangeList33, (java.util.Collection<java.lang.String>) strSet36);
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("2022-02-21T14:53:44.007Z/2022-02-21T14:53:44.007Z");
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleKeys();
        java.util.Locale locale41 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet42 = locale41.getUnicodeLocaleAttributes();
        boolean boolean43 = strSet40.addAll((java.util.Collection<java.lang.String>) strSet42);
        boolean boolean44 = strSet36.containsAll((java.util.Collection<java.lang.String>) strSet40);
        java.lang.Object[] objArray45 = strSet40.toArray();
        boolean boolean46 = strSet28.remove((java.lang.Object) strSet40);
        java.util.stream.Stream<java.lang.String> strStream47 = strSet40.stream();
        java.util.Iterator<java.lang.String> strItor48 = strSet40.iterator();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Period period53 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime54 = dateTime49.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property56 = dateTime55.era();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime();
        org.joda.time.Interval interval59 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Period period61 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime62 = dateTime57.plus((org.joda.time.ReadablePeriod) period61);
        org.joda.time.Chronology chronology63 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime64 = dateTime49.toDateTime(chronology63);
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime66 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Period period68 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime65, (org.joda.time.ReadablePartial) localTime66, periodType67);
        org.joda.time.LocalTime localTime70 = localTime66.withMillisOfSecond(4);
        int[] intArray72 = chronology63.get((org.joda.time.ReadablePartial) localTime66, (long) 0);
        org.joda.time.DateTimeField dateTimeField73 = chronology63.weekyearOfCentury();
        long long75 = dateTimeField73.remainder((long) (short) -1);
        int int76 = dateTimeField73.getMinimumValue();
        long long78 = dateTimeField73.roundCeiling((long) 894);
        java.util.Locale locale83 = new java.util.Locale("57540", "20", "672");
        java.lang.String str84 = dateTimeField73.getAsText((long) 2922789, locale83);
        boolean boolean85 = strSet40.contains((java.lang.Object) str84);
        strSet40.clear();
        boolean boolean87 = strSet17.containsAll((java.util.Collection<java.lang.String>) strSet40);
        java.util.Locale locale88 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet89 = locale88.getUnicodeLocaleAttributes();
        int int90 = strSet89.size();
        java.lang.Object[] objArray91 = strSet89.toArray();
        java.util.Spliterator<java.lang.String> strSpliterator92 = strSet89.spliterator();
        boolean boolean93 = strSet40.removeAll((java.util.Collection<java.lang.String>) strSet89);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertNotNull(languageRangeList33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(locale41);
// flaky:         org.junit.Assert.assertEquals(locale41.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strStream47);
        org.junit.Assert.assertNotNull(strItor48);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(intArray72);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[0, 0, 0, 8]");
        org.junit.Assert.assertNotNull(dateTimeField73);
// flaky:         org.junit.Assert.assertTrue("'" + long75 + "' != '" + 7L + "'", long75 == 7L);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long78 + "' != '" + 31535999992L + "'", long78 == 31535999992L);
        org.junit.Assert.assertEquals(locale83.toString(), "57540_20_672");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "70" + "'", str84, "70");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(locale88);
// flaky:         org.junit.Assert.assertEquals(locale88.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray91), "[]");
        org.junit.Assert.assertNotNull(strSpliterator92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test15019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15019");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        org.joda.time.Period period5 = period3.minusDays(10);
        org.joda.time.Duration duration6 = period3.toStandardDuration();
        org.joda.time.Duration duration8 = org.joda.time.Duration.millis((long) (short) -1);
        long long9 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration8);
        long long10 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration8);
        org.joda.time.Duration duration11 = duration6.minus((org.joda.time.ReadableDuration) duration8);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Period period16 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property19 = dateTime18.era();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Period period24 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime25 = dateTime20.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime27 = dateTime12.toDateTime(chronology26);
        org.joda.time.DurationField durationField28 = chronology26.centuries();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.weekOfWeekyear();
        boolean boolean30 = duration6.equals((java.lang.Object) dateTimeField29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime32);
        boolean boolean35 = interval33.isAfter((long) 10);
        org.joda.time.Duration duration36 = interval33.toDuration();
        org.joda.time.Period period38 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.Duration duration40 = period38.toDurationFrom(readableInstant39);
        org.joda.time.Seconds seconds41 = duration40.toStandardSeconds();
        boolean boolean42 = duration36.isLongerThan((org.joda.time.ReadableDuration) duration40);
        boolean boolean43 = duration6.isEqual((org.joda.time.ReadableDuration) duration36);
        long long44 = duration6.getStandardHours();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(seconds41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
    }

    @Test
    public void test15020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15020");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 2, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((-1L), dateTimeZone2);
        org.joda.time.LocalDate localDate7 = localDate5.withDayOfWeek(2);
        int int8 = localDate5.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(1);
        boolean boolean11 = dateTimeZone10.isFixed();
        org.joda.time.DateTime dateTime12 = localDate5.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.LocalDate localDate14 = localDate5.minusMonths(0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(10L, chronology16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.weekyear();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.DateTime dateTime21 = dateTime17.plusWeeks(4);
        java.util.Locale locale22 = java.util.Locale.ROOT;
        java.util.Calendar calendar23 = dateTime21.toCalendar(locale22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(10L, chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekyear();
        int int28 = dateTime26.get(dateTimeFieldType27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime30);
        boolean boolean33 = interval31.isAfter((long) 10);
        org.joda.time.Duration duration34 = interval31.toDuration();
        org.joda.time.Period period36 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.Duration duration38 = period36.toDurationFrom(readableInstant37);
        org.joda.time.Seconds seconds39 = duration38.toStandardSeconds();
        boolean boolean40 = duration34.isLongerThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateTime dateTime41 = dateTime26.plus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadableInstant) dateTime45);
        boolean boolean48 = interval46.isAfter((long) 10);
        org.joda.time.Duration duration49 = interval46.toDuration();
        org.joda.time.Chronology chronology50 = interval46.getChronology();
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((long) 1, (long) (byte) 1, chronology50);
        org.joda.time.Period period52 = duration38.toPeriod(chronology50);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((java.lang.Object) calendar23, chronology50);
        org.joda.time.LocalDate localDate55 = localDate53.minusDays((-1));
        org.joda.time.LocalDate localDate56 = localDate14.withFields((org.joda.time.ReadablePartial) localDate53);
        java.lang.String str57 = localDate53.toString();
        org.joda.time.LocalDate localDate59 = localDate53.withWeekOfWeekyear(19);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 70 + "'", int8 == 70);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(calendar23);
// flaky:         org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=2419200010,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.008,offset=8,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=29,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=18,ZONE_OFFSET=8,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1970 + "'", int28 == 1970);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(seconds39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "1970-01-29" + "'", str57, "1970-01-29");
        org.junit.Assert.assertNotNull(localDate59);
    }

    @Test
    public void test15021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15021");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withField(dateTimeFieldType6, 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusDays(6);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.minusYears(86399004);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test15022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15022");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        org.joda.time.Period period5 = period3.minusDays(10);
        org.joda.time.Period period7 = period3.minusHours(0);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(10L, chronology11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.weekyear();
        int int14 = dateTime12.get(dateTimeFieldType13);
        org.joda.time.DateTime dateTime16 = dateTime12.plusWeeks(4);
        boolean boolean17 = periodType9.equals((java.lang.Object) dateTime16);
        int int18 = periodType9.size();
        org.joda.time.PeriodType periodType19 = periodType9.withMillisRemoved();
        org.joda.time.Period period20 = new org.joda.time.Period((long) 12, periodType9);
        org.joda.time.PeriodType periodType21 = periodType9.withDaysRemoved();
        org.joda.time.Period period22 = period3.withPeriodType(periodType9);
        org.joda.time.Period period24 = period22.minusDays(47674315);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
    }

    @Test
    public void test15023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15023");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 17);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy(259200335L);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusMillis(1971);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMinimumValue();
        int int10 = property8.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test15024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15024");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((-1964L));
    }

    @Test
    public void test15025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15025");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withField(dateTimeFieldType6, 100);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withField(dateTimeFieldType15, 100);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime14.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        int int23 = localDateTime22.getSecondOfMinute();
        int int24 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.plusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withField(dateTimeFieldType33, 100);
        org.joda.time.Period period36 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDateTime26, (org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime26.minuteOfHour();
        org.joda.time.LocalDateTime.Property property38 = localDateTime26.hourOfDay();
        org.joda.time.LocalDateTime.Property property39 = localDateTime26.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime41 = property39.addToCopy((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime42 = property39.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime43 = property39.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime44 = property39.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime46 = property39.addToCopy(93);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
    }

    @Test
    public void test15026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15026");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 2, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((-1L), dateTimeZone2);
        int int6 = localDate5.getYearOfEra();
        java.util.Date date7 = localDate5.toDate();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.fromDateFields(date7);
        org.joda.time.LocalDate localDate10 = localDate8.minusMonths((int) (short) 10);
        int int11 = localDate10.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1969 + "'", int11 == 1969);
    }

    @Test
    public void test15027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15027");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 0);
        int int2 = localDate1.getDayOfMonth();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test15028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15028");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.Duration duration3 = org.joda.time.Duration.millis((long) (short) -1);
        org.joda.time.DateTime dateTime4 = dateTime0.plus((org.joda.time.ReadableDuration) duration3);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.months();
        org.joda.time.Period period6 = duration3.toPeriod(periodType5);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime7, (org.joda.time.ReadablePartial) localTime8, periodType9);
        org.joda.time.Period period12 = period10.minusDays(10);
        org.joda.time.Duration duration13 = period10.toStandardDuration();
        org.joda.time.Duration duration15 = org.joda.time.Duration.millis((long) (short) -1);
        long long16 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration15);
        long long17 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Duration duration18 = duration13.minus((org.joda.time.ReadableDuration) duration15);
        long long19 = duration13.getStandardDays();
        boolean boolean20 = duration3.isEqual((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Duration duration21 = org.joda.time.Duration.ZERO;
        boolean boolean22 = duration13.isEqual((org.joda.time.ReadableDuration) duration21);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType24 = periodType23.withSecondsRemoved();
        org.joda.time.PeriodType periodType25 = periodType24.withMinutesRemoved();
        org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) duration13, periodType24);
        org.joda.time.Seconds seconds27 = period26.toStandardSeconds();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(seconds27);
    }

    @Test
    public void test15029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15029");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        java.lang.String str4 = interval2.toString();
        org.joda.time.Chronology chronology5 = interval2.getChronology();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime9 = interval8.getEnd();
        org.joda.time.Interval interval10 = interval8.toInterval();
        boolean boolean12 = interval8.contains((long) 1970);
        org.joda.time.Interval interval13 = interval8.toInterval();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime15);
        boolean boolean18 = interval16.isAfter((long) 10);
        boolean boolean19 = interval13.abuts((org.joda.time.ReadableInterval) interval16);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Interval interval24 = interval22.toInterval();
        boolean boolean26 = interval22.contains((long) 1970);
        org.joda.time.Interval interval27 = interval22.toInterval();
        boolean boolean28 = interval16.contains((org.joda.time.ReadableInterval) interval22);
        org.joda.time.DateTime dateTime29 = interval16.getEnd();
        org.joda.time.Period period30 = interval16.toPeriod();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime32);
        boolean boolean35 = interval33.isAfter((long) 10);
        boolean boolean36 = interval33.containsNow();
        long long37 = interval33.toDurationMillis();
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(10L, chronology41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.weekyear();
        int int44 = dateTime42.get(dateTimeFieldType43);
        org.joda.time.DateTime dateTime46 = dateTime42.plusWeeks(4);
        boolean boolean47 = periodType39.equals((java.lang.Object) dateTime46);
        int int48 = periodType39.size();
        org.joda.time.PeriodType periodType49 = periodType39.withMillisRemoved();
        org.joda.time.Period period50 = new org.joda.time.Period((long) 12, periodType39);
        org.joda.time.Interval interval51 = interval33.withPeriodAfterStart((org.joda.time.ReadablePeriod) period50);
        org.joda.time.Interval interval52 = interval16.overlap((org.joda.time.ReadableInterval) interval51);
        boolean boolean53 = interval2.isBefore((org.joda.time.ReadableInterval) interval16);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property57 = dateTime56.era();
        org.joda.time.DurationField durationField58 = property57.getLeapDurationField();
        int int59 = property57.getMaximumValueOverall();
        int int60 = property57.getMinimumValueOverall();
        org.joda.time.DateTime dateTime61 = property57.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime67.withField(dateTimeFieldType68, 100);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime67.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        int int76 = localDateTime67.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean78 = dateTimeZone77.isFixed();
        org.joda.time.DateTime dateTime79 = localDateTime67.toDateTime(dateTimeZone77);
        long long81 = dateTimeZone77.convertUTCToLocal((long) 893);
        org.joda.time.MutableDateTime mutableDateTime82 = dateTime61.toMutableDateTime(dateTimeZone77);
        boolean boolean84 = dateTime61.isAfter((long) 5);
        org.joda.time.Chronology chronology85 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.MutableInterval mutableInterval86 = new org.joda.time.MutableInterval((long) (short) 100, 1645488000000L, chronology85);
        boolean boolean87 = interval2.abuts((org.joda.time.ReadableInterval) mutableInterval86);
        org.joda.time.Chronology chronology89 = null;
        org.joda.time.Period period90 = new org.joda.time.Period((long) (-1), chronology89);
        org.joda.time.Period period91 = period90.toPeriod();
        int int92 = period91.getMonths();
        org.joda.time.Seconds seconds93 = period91.toStandardSeconds();
        org.joda.time.Period period95 = period91.withWeeks((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            mutableInterval86.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.042+00:00:00.008/1970-01-01T00:00:00.042+00:00:00.008" + "'", str4, "1970-01-01T00:00:00.042+00:00:00.008/1970-01-01T00:00:00.042+00:00:00.008");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1970 + "'", int44 == 1970);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 6 + "'", int48 == 6);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNull(interval52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNull(durationField58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(dateTime79);
// flaky:         org.junit.Assert.assertTrue("'" + long81 + "' != '" + 901L + "'", long81 == 901L);
        org.junit.Assert.assertNotNull(mutableDateTime82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(chronology85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(seconds93);
        org.junit.Assert.assertNotNull(period95);
    }

    @Test
    public void test15030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15030");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        boolean boolean6 = interval4.isAfter((long) 10);
        org.joda.time.Duration duration7 = interval4.toDuration();
        org.joda.time.Chronology chronology8 = interval4.getChronology();
        org.joda.time.MutableInterval mutableInterval9 = new org.joda.time.MutableInterval((long) (byte) 0, (long) (short) 100, chronology8);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withField(dateTimeFieldType18, 100);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime17.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusMonths(5);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.minusWeeks((int) 'a');
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime32);
        boolean boolean35 = interval33.isAfter((long) 10);
        org.joda.time.Duration duration36 = interval33.toDuration();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) dateTime38);
        boolean boolean41 = interval39.isAfter((long) 10);
        org.joda.time.Duration duration42 = interval39.toDuration();
        org.joda.time.Duration duration44 = duration36.withDurationAdded((org.joda.time.ReadableDuration) duration42, (int) '4');
        boolean boolean45 = localDateTime30.equals((java.lang.Object) duration42);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime30.withMillisOfDay(0);
        java.util.Locale locale49 = java.util.Locale.UK;
        java.lang.String str50 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDateTime47, 14, locale49);
        int int51 = localDateTime47.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property52 = localDateTime47.dayOfWeek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "14" + "'", str50, "14");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(property52);
    }

    @Test
    public void test15031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15031");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime5 = dateTime0.plus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime8.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime15 = dateTime0.toDateTime(chronology14);
        org.joda.time.DurationField durationField16 = chronology14.centuries();
        int int19 = durationField16.getDifference((long) 2, (long) (-1));
        int int22 = durationField16.getDifference(10L, (long) (short) 100);
        java.lang.String str23 = durationField16.toString();
        boolean boolean24 = durationField16.isPrecise();
        long long27 = durationField16.getValueAsLong(1645458345436L, (long) 50);
        long long30 = durationField16.getMillis(0, (long) 899);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "DurationField[centuries]" + "'", str23, "DurationField[centuries]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test15032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15032");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 0);
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths(12);
        org.joda.time.LocalDate.Property property4 = localDate1.centuryOfEra();
        org.joda.time.LocalDate localDate5 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDate.Property property6 = localDate5.yearOfEra();
        org.joda.time.LocalDate localDate7 = property6.withMaximumValue();
        org.joda.time.Period period9 = org.joda.time.Period.millis((int) '4');
        org.joda.time.Period period11 = period9.minusWeeks(0);
        org.joda.time.LocalDate localDate13 = localDate7.withPeriodAdded((org.joda.time.ReadablePeriod) period9, 6554);
        org.joda.time.Period period15 = period9.withSeconds(0);
        org.joda.time.Period period17 = period9.minusMillis(0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test15033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15033");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 57540999);
        java.io.Writer writer7 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.DateTime.Property property13 = dateTime12.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        long long17 = dateTimeZone14.adjustOffset(378691200010L, false);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((java.lang.Object) dateTime12, dateTimeZone14);
        long long22 = dateTimeZone14.convertLocalToUTC(35L, false, 1L);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.now(dateTimeZone14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 54, dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(writer7, (org.joda.time.ReadableInstant) dateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 378691200010L + "'", long17 == 378691200010L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 27L + "'", long22 == 27L);
        org.junit.Assert.assertNotNull(localTime23);
    }

    @Test
    public void test15034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15034");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(35L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType5.getDurationType();
        org.joda.time.LocalTime localTime8 = localTime2.withFieldAdded(durationFieldType6, (-1));
        org.joda.time.LocalTime localTime10 = localTime8.plusHours(53633080);
        org.joda.time.LocalTime.Property property11 = localTime10.millisOfSecond();
        org.joda.time.LocalTime localTime13 = property11.addWrapFieldToCopy((int) (short) 0);
        org.joda.time.LocalTime localTime14 = property11.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime15 = property11.getLocalTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.era();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Period period22 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime23 = dateTime18.plus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Chronology chronology24 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        int int28 = dateTime25.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = dateTime25.toDateTime(dateTimeZone29);
        int int31 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime33);
        boolean boolean36 = interval34.isAfter((long) 10);
        org.joda.time.Duration duration37 = interval34.toDuration();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime39);
        boolean boolean42 = interval40.isAfter((long) 10);
        org.joda.time.Duration duration43 = interval40.toDuration();
        org.joda.time.Duration duration45 = duration37.withDurationAdded((org.joda.time.ReadableDuration) duration43, (int) '4');
        org.joda.time.DateTime dateTime46 = dateTime18.minus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.DateTime dateTime47 = dateTime46.withEarlierOffsetAtOverlap();
        int int48 = property11.compareTo((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.LocalTime localTime49 = property11.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime50 = property11.getLocalTime();
        org.joda.time.LocalTime localTime52 = property11.addCopy((long) (-51));
        org.joda.time.LocalTime localTime53 = property11.getLocalTime();
        int int54 = localTime53.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 59 + "'", int54 == 59);
    }

    @Test
    public void test15035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15035");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 17);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime12 = dateTime7.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property14 = dateTime13.era();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime20 = dateTime15.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime22 = dateTime7.toDateTime(chronology21);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime23, (org.joda.time.ReadablePartial) localTime24, periodType25);
        org.joda.time.LocalTime localTime28 = localTime24.withMillisOfSecond(4);
        int[] intArray30 = chronology21.get((org.joda.time.ReadablePartial) localTime24, (long) 0);
        org.joda.time.Chronology chronology31 = chronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.dayOfYear();
        java.util.Locale locale33 = java.util.Locale.ROOT;
        java.util.Locale locale36 = new java.util.Locale("", "hi!");
        java.text.DateFormatSymbols dateFormatSymbols37 = new java.text.DateFormatSymbols(locale36);
        java.lang.String str38 = locale33.getDisplayVariant(locale36);
        int int39 = dateTimeField32.getMaximumTextLength(locale33);
        java.lang.String str40 = locale6.getDisplayLanguage(locale33);
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder41.setLanguage("minutes");
        java.util.Locale.Builder builder44 = builder41.clear();
        java.util.Locale locale45 = builder41.build();
        java.lang.String str46 = locale6.getDisplayScript(locale45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter2.withLocale(locale45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.Period period53 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime54 = dateTime49.plus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property56 = dateTime55.era();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime();
        org.joda.time.Interval interval59 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Period period61 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime62 = dateTime57.plus((org.joda.time.ReadablePeriod) period61);
        org.joda.time.Chronology chronology63 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime64 = dateTime49.toDateTime(chronology63);
        org.joda.time.DurationField durationField65 = chronology63.centuries();
        int int68 = durationField65.getDifference((long) 2, (long) (-1));
        int int71 = durationField65.getDifference(10L, (long) (short) 100);
        org.joda.time.DurationFieldType durationFieldType72 = durationField65.getType();
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime();
        org.joda.time.Interval interval78 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime76, (org.joda.time.ReadableInstant) dateTime77);
        boolean boolean80 = interval78.isAfter((long) 10);
        org.joda.time.Duration duration81 = interval78.toDuration();
        org.joda.time.Chronology chronology82 = interval78.getChronology();
        org.joda.time.MutableInterval mutableInterval83 = new org.joda.time.MutableInterval((long) 1, (long) (byte) 1, chronology82);
        org.joda.time.Period period85 = org.joda.time.Period.seconds(99);
        long long88 = chronology82.add((org.joda.time.ReadablePeriod) period85, (long) 53657, 0);
        org.joda.time.LocalTime localTime89 = new org.joda.time.LocalTime((long) 1, chronology82);
        org.joda.time.DurationField durationField90 = durationFieldType72.getField(chronology82);
        org.joda.time.DurationField durationField91 = chronology82.months();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter92 = dateTimeFormatter2.withChronology(chronology82);
        java.util.Locale locale93 = dateTimeFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate95 = dateTimeFormatter2.parseLocalDate("2022-02-21T14:54:06.112Z/2022-02-21T14:54:06.112Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(intArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0, 8]");
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals(locale36.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Chinese" + "'", str40, "Chinese");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(durationFieldType72);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(duration81);
        org.junit.Assert.assertNotNull(chronology82);
        org.junit.Assert.assertNotNull(period85);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 53657L + "'", long88 == 53657L);
        org.junit.Assert.assertNotNull(durationField90);
        org.junit.Assert.assertNotNull(durationField91);
        org.junit.Assert.assertNotNull(dateTimeFormatter92);
        org.junit.Assert.assertNull(locale93);
    }

    @Test
    public void test15036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15036");
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long) '4', (long) 478);
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval((org.joda.time.ReadableInterval) mutableInterval2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime4.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime4.toDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime.Property property13 = dateTime11.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property13.getFieldType();
        int int15 = dateTime4.get(dateTimeFieldType14);
        boolean boolean16 = mutableInterval2.contains((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime17 = dateTime4.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(readableInterval3);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 42 + "'", int15 == 42);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test15037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15037");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 13, 1646362432994L);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime4);
        boolean boolean7 = interval5.isAfter((long) 10);
        org.joda.time.Duration duration8 = interval5.toDuration();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        boolean boolean13 = interval11.isAfter((long) 10);
        org.joda.time.Duration duration14 = interval11.toDuration();
        org.joda.time.Duration duration16 = duration8.withDurationAdded((org.joda.time.ReadableDuration) duration14, (int) '4');
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime17.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.toDateTime(dateTimeZone21);
        int int23 = dateTime22.getCenturyOfEra();
        org.joda.time.Interval interval24 = duration14.toIntervalTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Period period25 = interval24.toPeriod();
        boolean boolean26 = interval2.isAfter((org.joda.time.ReadableInterval) interval24);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Interval interval31 = interval29.toInterval();
        org.joda.time.Period period32 = interval29.toPeriod();
        org.joda.time.DateTime dateTime33 = interval29.getEnd();
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(10L, chronology36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekyear();
        int int39 = dateTime37.get(dateTimeFieldType38);
        org.joda.time.DateTime dateTime41 = dateTime37.plusWeeks(4);
        boolean boolean42 = periodType34.equals((java.lang.Object) dateTime41);
        int int43 = periodType34.size();
        org.joda.time.PeriodType periodType44 = periodType34.withMillisRemoved();
        org.joda.time.Period period45 = interval29.toPeriod(periodType44);
        boolean boolean46 = interval24.equals((java.lang.Object) periodType44);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.Interval interval48 = interval24.withPeriodBeforeEnd(readablePeriod47);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration16);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1970 + "'", int39 == 1970);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 6 + "'", int43 == 6);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(interval48);
    }

    @Test
    public void test15038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15038");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(89422, 47478, 245, 171, 37, 53765, 53960);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 171 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15039");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("minutes");
        java.util.Locale.LanguageRange languageRange3 = new java.util.Locale.LanguageRange("weeks");
        java.lang.String str4 = languageRange3.getRange();
        double double5 = languageRange3.getWeight();
        java.util.Locale.LanguageRange languageRange7 = new java.util.Locale.LanguageRange("Months");
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("months");
        java.util.Locale.LanguageRange languageRange11 = new java.util.Locale.LanguageRange("minutes");
        java.lang.String str12 = languageRange11.getRange();
        double double13 = languageRange11.getWeight();
        java.util.Locale.LanguageRange languageRange15 = new java.util.Locale.LanguageRange("weeks");
        java.lang.String str16 = languageRange15.getRange();
        double double17 = languageRange15.getWeight();
        java.lang.String str18 = languageRange15.getRange();
        java.util.Locale.LanguageRange languageRange20 = new java.util.Locale.LanguageRange("minutes");
        java.lang.String str21 = languageRange20.getRange();
        java.lang.String str22 = languageRange20.getRange();
        java.util.Locale.LanguageRange languageRange24 = new java.util.Locale.LanguageRange("weeks");
        java.lang.String str25 = languageRange24.getRange();
        double double26 = languageRange24.getWeight();
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] { languageRange1, languageRange3, languageRange7, languageRange9, languageRange11, languageRange15, languageRange20, languageRange24 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.util.Locale locale33 = java.util.Locale.ROOT;
        java.util.Locale.setDefault(locale33);
        java.util.Locale locale35 = java.util.Locale.ROOT;
        java.util.Locale locale37 = java.util.Locale.forLanguageTag("2022-02-21T14:53:44.007Z/2022-02-21T14:53:44.007Z");
        java.util.Locale locale38 = java.util.Locale.getDefault();
        java.util.Locale locale39 = java.util.Locale.JAPAN;
        java.util.Locale locale40 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray41 = new java.util.Locale[] { locale33, locale35, locale37, locale38, locale39, locale40 };
        java.util.ArrayList<java.util.Locale> localeList42 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList42, localeArray41);
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.util.Locale>) localeList42, filteringMode44);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList42);
        java.util.Set<java.lang.String> strSet47 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet47.clear();
        java.util.Set<java.lang.String> strSet49 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.stream.Stream<java.lang.String> strStream50 = strSet49.stream();
        boolean boolean51 = strSet47.addAll((java.util.Collection<java.lang.String>) strSet49);
        boolean boolean52 = strSet49.isEmpty();
        java.util.Locale.FilteringMode filteringMode53 = null;
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strSet49, filteringMode53);
        org.joda.time.PeriodType periodType56 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(10L, chronology58);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.weekyear();
        int int61 = dateTime59.get(dateTimeFieldType60);
        org.joda.time.DateTime dateTime63 = dateTime59.plusWeeks(4);
        boolean boolean64 = periodType56.equals((java.lang.Object) dateTime63);
        int int65 = periodType56.size();
        org.joda.time.PeriodType periodType66 = periodType56.withMillisRemoved();
        org.joda.time.Period period67 = new org.joda.time.Period((long) 12, periodType56);
        org.joda.time.PeriodType periodType68 = periodType56.withDaysRemoved();
        org.joda.time.PeriodType periodType69 = periodType68.withYearsRemoved();
        org.joda.time.PeriodType periodType70 = periodType69.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period71 = new org.joda.time.Period((java.lang.Object) languageRangeList28, periodType70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.ArrayList");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "weeks" + "'", str4, "weeks");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "minutes" + "'", str12, "minutes");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "weeks" + "'", str16, "weeks");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "weeks" + "'", str18, "weeks");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "minutes" + "'", str21, "minutes");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "minutes" + "'", str22, "minutes");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "weeks" + "'", str25, "weeks");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode44.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList45);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(strStream50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1970 + "'", int61 == 1970);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 6 + "'", int65 == 6);
        org.junit.Assert.assertNotNull(periodType66);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(periodType70);
    }

    @Test
    public void test15040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15040");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 2, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((-1L), dateTimeZone2);
        org.joda.time.LocalDate localDate7 = localDate5.withDayOfWeek(2);
        org.joda.time.LocalDate localDate9 = localDate7.plusMonths(3);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTime dateTime12 = localDate7.toDateTimeAtStartOfDay(dateTimeZone11);
        int int13 = localDate7.getDayOfWeek();
        org.joda.time.LocalDate localDate15 = localDate7.withYear(13);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        int int17 = localDate15.getEra();
        org.joda.time.LocalDate localDate19 = localDate15.withCenturyOfEra(0);
        int int20 = localDate19.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDate19.getValue(1236);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1236");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 30 + "'", int20 == 30);
    }

    @Test
    public void test15041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15041");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(10L, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusWeeks(4);
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.util.Calendar calendar8 = dateTime6.toCalendar(locale7);
        org.joda.time.DateTime dateTime10 = dateTime6.plusMillis(22);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        boolean boolean19 = interval17.isAfter((long) 10);
        org.joda.time.Duration duration20 = interval17.toDuration();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime22);
        boolean boolean25 = interval23.isAfter((long) 10);
        org.joda.time.Duration duration26 = interval23.toDuration();
        org.joda.time.Duration duration28 = duration20.withDurationAdded((org.joda.time.ReadableDuration) duration26, (int) '4');
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime();
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) dateTime30);
        int int32 = dateTime29.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = dateTime29.toDateTime(dateTimeZone33);
        int int35 = dateTime34.getCenturyOfEra();
        org.joda.time.Interval interval36 = duration26.toIntervalTo((org.joda.time.ReadableInstant) dateTime34);
        int int37 = duration14.compareTo((org.joda.time.ReadableDuration) duration26);
        org.joda.time.DateTime dateTime38 = dateTime10.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.MutableInterval mutableInterval41 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime10, readableDuration40);
        long long42 = mutableInterval41.getStartMillis();
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=2419200010,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.008,offset=8,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=29,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=18,ZONE_OFFSET=8,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(duration28);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 19 + "'", int35 == 19);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 2419200032L + "'", long42 == 2419200032L);
    }

    @Test
    public void test15042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15042");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 10, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime2.plusMinutes((int) (short) 0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths((int) (byte) 100);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(10L, chronology16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.weekyear();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.DateTime.Property property20 = dateTime14.property(dateTimeFieldType18);
        boolean boolean21 = dateTime2.equals((java.lang.Object) dateTime14);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime27 = interval26.getEnd();
        org.joda.time.DateTime.Property property28 = dateTime27.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        long long32 = dateTimeZone29.adjustOffset(378691200010L, false);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((java.lang.Object) dateTime27, dateTimeZone29);
        long long37 = dateTimeZone29.convertLocalToUTC(35L, false, 1L);
        org.joda.time.LocalTime localTime38 = org.joda.time.LocalTime.now(dateTimeZone29);
        boolean boolean40 = dateTimeZone29.isStandardOffset(0L);
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) 10800000, 3290910586308L, dateTimeZone29);
        org.joda.time.DateTime dateTime42 = dateTime14.withZoneRetainFields(dateTimeZone29);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime46 = interval45.getEnd();
        org.joda.time.DateTime.Property property47 = dateTime46.centuryOfEra();
        int int48 = dateTime46.getYearOfCentury();
        boolean boolean49 = dateTime46.isAfterNow();
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.withField(dateTimeFieldType56, 100);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime55.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField65 = property64.getField();
        java.lang.String str66 = dateTimeField65.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = dateTimeField65.getType();
        boolean boolean68 = dateTime46.isSupported(dateTimeFieldType67);
        org.joda.time.DurationFieldType durationFieldType69 = dateTimeFieldType67.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime71 = dateTime14.withField(dateTimeFieldType67, 57540199);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 57540199 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 378691200010L + "'", long32 == 378691200010L);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 27L + "'", long37 == 27L);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 70 + "'", int48 == 70);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "DateTimeField[dayOfWeek]" + "'", str66, "DateTimeField[dayOfWeek]");
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(durationFieldType69);
    }

    @Test
    public void test15043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15043");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Interval interval4 = interval2.toInterval();
        boolean boolean6 = interval2.contains((long) 1970);
        org.joda.time.Interval interval7 = interval2.toInterval();
        org.joda.time.ReadableInstant readableInstant8 = null;
        boolean boolean9 = interval7.isBefore(readableInstant8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property11 = dateTime10.era();
        org.joda.time.DurationField durationField12 = property11.getLeapDurationField();
        int int13 = property11.getMaximumValueOverall();
        int int14 = property11.getMinimumValueOverall();
        org.joda.time.DateTime dateTime15 = property11.getDateTime();
        org.joda.time.DateTime dateTime16 = property11.withMaximumValue();
        org.joda.time.Interval interval17 = interval7.withEnd((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean19 = interval7.contains((long) 10);
        org.joda.time.DateTime dateTime20 = interval7.getEnd();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime27 = dateTime21.withDate(6, (int) (short) 1, 4);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillisOfDay(1970);
        org.joda.time.DateTime.Property property30 = dateTime27.dayOfWeek();
        boolean boolean31 = interval7.isAfter((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime33 = dateTime27.plusMillis(365);
        org.joda.time.DateTime dateTime35 = dateTime27.minusMinutes(5);
        org.joda.time.DateTime.Property property36 = dateTime35.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property38 = dateTime35.property(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNull(durationField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(property38);
    }

    @Test
    public void test15044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15044");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withField(dateTimeFieldType6, 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        int int14 = localDateTime5.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.plusYears(7);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks(20);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusMonths(53654);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.era();
        boolean boolean22 = property21.isLeap();
        org.joda.time.LocalDateTime localDateTime23 = property21.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime24 = property21.getLocalDateTime();
        int int25 = localDateTime24.getWeekOfWeekyear();
        int int26 = localDateTime24.getMonthOfYear();
        org.joda.time.Chronology chronology27 = localDateTime24.getChronology();
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 48 + "'", int25 == 48);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 11 + "'", int26 == 11);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test15045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15045");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 53657);
        int int2 = localDate1.getYearOfEra();
        org.joda.time.LocalDate localDate4 = localDate1.plusMonths(351);
        java.util.Date date5 = localDate4.toDate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Thu Apr 01 00:00:00 GMT+00:00 1999");
    }

    @Test
    public void test15046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15046");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withField(dateTimeFieldType6, 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        int int14 = localDateTime5.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime5.plusYears(7);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusHours((int) 'a');
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusSeconds(69);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.monthOfYear();
        org.joda.time.LocalDateTime localDateTime22 = property21.getLocalDateTime();
        java.lang.String str23 = property21.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Property[monthOfYear]" + "'", str23, "Property[monthOfYear]");
    }

    @Test
    public void test15047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15047");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.era();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime10.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(dateTimeZone14);
        int int16 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        boolean boolean17 = periodType0.equals((java.lang.Object) dateTime10);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths((int) (byte) 100);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(10L, chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekyear();
        int int28 = dateTime26.get(dateTimeFieldType27);
        org.joda.time.DateTime.Property property29 = dateTime23.property(dateTimeFieldType27);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean31 = dateTime23.isSupported(dateTimeFieldType30);
        org.joda.time.DateTime dateTime33 = dateTime10.withField(dateTimeFieldType30, 7);
        org.joda.time.DateTime dateTime35 = dateTime10.plusMinutes(28);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1970 + "'", int28 == 1970);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test15048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15048");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        boolean boolean4 = interval2.isAfter((long) 10);
        boolean boolean5 = interval2.containsNow();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime9 = interval8.getEnd();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMonths((int) (byte) 100);
        boolean boolean12 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime13 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTime();
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfHour();
        org.joda.time.ReadableInstant readableInstant16 = null;
        boolean boolean17 = dateTime14.isAfter(readableInstant16);
        org.joda.time.DateTime dateTime19 = dateTime14.plus(0L);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean23 = dateTimeZone22.isFixed();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 2, dateTimeZone22);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 53661, dateTimeZone22);
        org.joda.time.DateTime dateTime27 = dateTime19.toDateTime(dateTimeZone22);
        org.joda.time.DateTime.Property property28 = dateTime27.weekyear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test15049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15049");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime5 = dateTime0.plus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime8.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime15 = dateTime0.toDateTime(chronology14);
        org.joda.time.DurationField durationField16 = chronology14.centuries();
        int int19 = durationField16.getDifference((long) 2, (long) (-1));
        long long20 = durationField16.getUnitMillis();
        long long23 = durationField16.getValueAsLong(32770L, (long) 672);
        boolean boolean24 = durationField16.isSupported();
        java.lang.String str25 = durationField16.getName();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3155695200000L + "'", long20 == 3155695200000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "centuries" + "'", str25, "centuries");
    }

    @Test
    public void test15050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15050");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withField(dateTimeFieldType6, 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        int int14 = localDateTime13.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalDateTime.Property property17 = localDateTime13.property(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.plusYears(8);
        java.lang.String str20 = localDateTime13.toString();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime13.withYearOfEra(17);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime13.minusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfMonth();
        boolean boolean26 = property25.isLeap();
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0014-05-12T20:00:01.893" + "'", str20, "0014-05-12T20:00:01.893");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test15051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15051");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Interval interval3 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Interval interval5 = interval3.toInterval();
        org.joda.time.Period period6 = interval3.toPeriod();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        boolean boolean11 = interval9.isAfter((long) 10);
        org.joda.time.Duration duration12 = interval9.toDuration();
        boolean boolean13 = interval3.abuts((org.joda.time.ReadableInterval) interval9);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime17);
        boolean boolean20 = interval18.isAfter((long) 10);
        org.joda.time.Duration duration21 = interval18.toDuration();
        org.joda.time.Chronology chronology22 = interval18.getChronology();
        org.joda.time.MutableInterval mutableInterval23 = new org.joda.time.MutableInterval((long) 1, (long) (byte) 1, chronology22);
        org.joda.time.Chronology chronology24 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInterval) mutableInterval23);
        org.joda.time.Interval interval25 = interval3.withChronology(chronology24);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Period period30 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime31 = dateTime26.plus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.DateTime.Property property32 = dateTime26.millisOfDay();
        org.joda.time.DateTime dateTime34 = property32.addToCopy((long) 2);
        org.joda.time.DateTime dateTime35 = property32.roundFloorCopy();
        boolean boolean36 = interval3.isAfter((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime38 = dateTime35.withMillisOfSecond(171);
        org.joda.time.DateTime.Property property39 = dateTime38.minuteOfDay();
        org.joda.time.Chronology chronology40 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInstant0, (org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now(chronology40);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(localDateTime41);
    }

    @Test
    public void test15052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15052");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        int int4 = dateTime0.getYearOfCentury();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.MutableInterval mutableInterval6 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime0, readableInstant5);
        long long7 = mutableInterval6.getEndMillis();
        org.joda.time.Period period9 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = period9.toDurationFrom(readableInstant10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime13);
        boolean boolean16 = interval14.isAfter((long) 10);
        org.joda.time.Duration duration17 = interval14.toDuration();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadableInstant) dateTime19);
        boolean boolean22 = interval20.isAfter((long) 10);
        org.joda.time.Duration duration23 = interval20.toDuration();
        org.joda.time.Duration duration25 = duration17.withDurationAdded((org.joda.time.ReadableDuration) duration23, (int) '4');
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) dateTime27);
        int int29 = dateTime26.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.toDateTime(dateTimeZone30);
        int int32 = dateTime31.getCenturyOfEra();
        org.joda.time.Interval interval33 = duration23.toIntervalTo((org.joda.time.ReadableInstant) dateTime31);
        int int34 = duration11.compareTo((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Period period35 = duration23.toPeriod();
        org.joda.time.Duration duration38 = duration23.withDurationAdded((long) 'a', 52);
        org.joda.time.Duration duration39 = duration23.toDuration();
        org.joda.time.PeriodType periodType40 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType41 = periodType40.withMonthsRemoved();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property44 = dateTime43.era();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime();
        org.joda.time.Interval interval47 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Period period49 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime50 = dateTime45.plus((org.joda.time.ReadablePeriod) period49);
        org.joda.time.Chronology chronology51 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.LocalTime localTime52 = org.joda.time.LocalTime.fromMillisOfDay((long) (-1), chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.weekyearOfCentury();
        org.joda.time.Chronology chronology54 = chronology51.withUTC();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.weekyear();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.hourOfDay();
        org.joda.time.DurationField durationField57 = chronology54.centuries();
        org.joda.time.Period period58 = duration23.toPeriod(periodType41, chronology54);
        org.joda.time.Duration duration60 = duration23.withMillis((long) 53131701);
        mutableInterval6.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration60);
        org.joda.time.Instant instant63 = org.joda.time.Instant.parse("1952-02-21T00:00:00.000");
        org.joda.time.Interval interval64 = duration60.toIntervalFrom((org.joda.time.ReadableInstant) instant63);
        org.joda.time.DateTime dateTime65 = interval64.getStart();
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 34L + "'", long7 == 34L);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(duration25);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 19 + "'", int32 == 19);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertNotNull(periodType40);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertNotNull(instant63);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(dateTime65);
    }

    @Test
    public void test15053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15053");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(35L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType5.getDurationType();
        org.joda.time.LocalTime localTime8 = localTime2.withFieldAdded(durationFieldType6, (-1));
        org.joda.time.LocalTime localTime10 = localTime8.plusHours(53633080);
        org.joda.time.LocalTime.Property property11 = localTime10.millisOfSecond();
        org.joda.time.LocalTime localTime13 = property11.addNoWrapToCopy(14);
        org.joda.time.LocalTime localTime15 = property11.addWrapFieldToCopy((int) (short) 10);
        org.joda.time.LocalTime localTime16 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime17 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime19 = property11.addWrapFieldToCopy(226);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test15054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15054");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime4);
        boolean boolean7 = interval5.isAfter((long) 10);
        org.joda.time.Duration duration8 = interval5.toDuration();
        org.joda.time.Chronology chronology9 = interval5.getChronology();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) (byte) 0, (long) (short) 100, chronology9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '#', chronology9);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime12, readableInstant13);
        org.joda.time.DurationField durationField15 = chronology14.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = durationField15.add(0L, 1645455619880L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 164545561988000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test15055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15055");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("2022-02-21T14:53:44.007Z/2022-02-21T14:53:44.007Z");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        boolean boolean5 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet4);
        boolean boolean6 = strSet4.isEmpty();
        boolean boolean7 = strSet4.isEmpty();
        java.util.Calendar.Builder builder8 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder12 = builder8.setTimeOfDay(1, (int) (short) 1, 53623795);
        java.util.Calendar.Builder builder16 = builder12.setDate((int) (byte) 10, 20, (int) '#');
        java.util.Calendar.Builder builder20 = builder12.setWeekDate(11, 1, 1970);
        boolean boolean21 = strSet4.equals((java.lang.Object) 1);
        java.util.Iterator<java.lang.String> strItor22 = strSet4.iterator();
        java.util.stream.Stream<java.lang.String> strStream23 = strSet4.stream();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertNotNull(strStream23);
    }

    @Test
    public void test15056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15056");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(10L, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusWeeks(4);
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.util.Calendar calendar8 = dateTime6.toCalendar(locale7);
        java.util.Date date9 = calendar8.getTime();
        java.util.Calendar.Builder builder10 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder14 = builder10.setTimeOfDay(1, (int) (short) 1, 53623795);
        java.util.Calendar.Builder builder18 = builder14.setDate((int) (byte) 10, 20, (int) '#');
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(10L, chronology20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        int int23 = dateTime21.get(dateTimeFieldType22);
        org.joda.time.DateTime dateTime25 = dateTime21.plusWeeks(4);
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.util.Calendar calendar27 = dateTime25.toCalendar(locale26);
        java.util.TimeZone timeZone28 = calendar27.getTimeZone();
        java.util.Calendar.Builder builder29 = builder14.setTimeZone(timeZone28);
        timeZone28.setID("65");
        calendar8.setTimeZone(timeZone28);
        org.joda.time.LocalDate localDate33 = org.joda.time.LocalDate.fromCalendarFields(calendar8);
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        long long40 = dateTimeZone36.adjustOffset((long) 'x', true);
        org.joda.time.DateTime dateTime41 = localDate34.toDateTimeAtStartOfDay(dateTimeZone36);
        org.joda.time.DateTime dateTime42 = localDate33.toDateTimeAtStartOfDay(dateTimeZone36);
        org.joda.time.LocalDate.Property property43 = localDate33.dayOfYear();
        org.joda.time.LocalDate localDate44 = property43.withMinimumValue();
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=2419200010,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=65,offset=8,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=29,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=18,ZONE_OFFSET=8,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 29 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=2419200010,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=65,offset=8,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=29,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=18,ZONE_OFFSET=8,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 120L + "'", long40 == 120L);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate44);
    }

    @Test
    public void test15057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15057");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(10L, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusWeeks(4);
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.util.Calendar calendar8 = dateTime6.toCalendar(locale7);
        java.util.Date date9 = calendar8.getTime();
        java.util.Calendar.Builder builder10 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder14 = builder10.setTimeOfDay(1, (int) (short) 1, 53623795);
        java.util.Calendar.Builder builder18 = builder14.setDate((int) (byte) 10, 20, (int) '#');
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(10L, chronology20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        int int23 = dateTime21.get(dateTimeFieldType22);
        org.joda.time.DateTime dateTime25 = dateTime21.plusWeeks(4);
        java.util.Locale locale26 = java.util.Locale.ROOT;
        java.util.Calendar calendar27 = dateTime25.toCalendar(locale26);
        java.util.TimeZone timeZone28 = calendar27.getTimeZone();
        java.util.Calendar.Builder builder29 = builder14.setTimeZone(timeZone28);
        timeZone28.setID("65");
        calendar8.setTimeZone(timeZone28);
        org.joda.time.LocalDate localDate33 = org.joda.time.LocalDate.fromCalendarFields(calendar8);
        org.joda.time.LocalDate.Property property34 = localDate33.weekOfWeekyear();
        org.joda.time.LocalDate localDate36 = localDate33.withYearOfEra(53965);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        java.lang.String str38 = dateTimeFieldType37.getName();
        int int39 = localDate36.get(dateTimeFieldType37);
        org.joda.time.LocalDate localDate41 = localDate36.withMonthOfYear(12);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.millis();
        boolean boolean43 = localDate36.isSupported(durationFieldType42);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=2419200010,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=65,offset=8,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=29,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=18,ZONE_OFFSET=8,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 29 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=2419200010,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=65,offset=8,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=29,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=18,ZONE_OFFSET=8,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "weekOfWeekyear" + "'", str38, "weekOfWeekyear");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test15058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15058");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("PT0.070S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'PT0.070S' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15059");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        boolean boolean4 = interval2.isAfter((long) 10);
        org.joda.time.DateTime dateTime5 = interval2.getEnd();
        org.joda.time.Interval interval6 = interval2.toInterval();
        org.joda.time.MutableInterval mutableInterval7 = interval6.toMutableInterval();
        org.joda.time.Duration duration8 = interval6.toDuration();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(mutableInterval7);
        org.junit.Assert.assertNotNull(duration8);
    }

    @Test
    public void test15060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15060");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.era();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime10.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(dateTimeZone14);
        int int16 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        boolean boolean21 = interval19.isAfter((long) 10);
        org.joda.time.Duration duration22 = interval19.toDuration();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime24);
        boolean boolean27 = interval25.isAfter((long) 10);
        org.joda.time.Duration duration28 = interval25.toDuration();
        org.joda.time.Duration duration30 = duration22.withDurationAdded((org.joda.time.ReadableDuration) duration28, (int) '4');
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration22);
        mutableInterval0.setDurationAfterStart((org.joda.time.ReadableDuration) duration22);
        org.joda.time.MutableInterval mutableInterval33 = mutableInterval0.copy();
        org.joda.time.MutableInterval mutableInterval34 = mutableInterval0.copy();
        org.joda.time.ReadableInstant readableInstant35 = null;
        boolean boolean36 = mutableInterval0.isBefore(readableInstant35);
        org.joda.time.MutableInterval mutableInterval37 = mutableInterval0.copy();
        org.joda.time.MutableInterval mutableInterval38 = mutableInterval37.copy();
        org.joda.time.Period period39 = mutableInterval37.toPeriod();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(mutableInterval33);
        org.junit.Assert.assertNotNull(mutableInterval34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(mutableInterval37);
        org.junit.Assert.assertNotNull(mutableInterval38);
        org.junit.Assert.assertNotNull(period39);
    }

    @Test
    public void test15061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15061");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguage("minutes");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime11 = dateTime6.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property13 = dateTime12.era();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Period period18 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime19 = dateTime14.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime21 = dateTime6.toDateTime(chronology20);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime22, (org.joda.time.ReadablePartial) localTime23, periodType24);
        org.joda.time.LocalTime localTime27 = localTime23.withMillisOfSecond(4);
        int[] intArray29 = chronology20.get((org.joda.time.ReadablePartial) localTime23, (long) 0);
        org.joda.time.Chronology chronology30 = chronology20.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.dayOfYear();
        int int33 = dateTimeField31.getLeapAmount(378691200010L);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(10L, chronology35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.weekyear();
        int int38 = dateTime36.get(dateTimeFieldType37);
        org.joda.time.DateTime dateTime40 = dateTime36.plusWeeks(4);
        java.util.Locale locale41 = java.util.Locale.ROOT;
        java.util.Calendar calendar42 = dateTime40.toCalendar(locale41);
        java.lang.String str43 = locale41.getDisplayVariant();
        java.util.Set<java.lang.String> strSet44 = locale41.getUnicodeLocaleKeys();
        int int45 = dateTimeField31.getMaximumTextLength(locale41);
        java.lang.String str46 = locale41.getDisplayName();
        java.util.Locale.Builder builder47 = builder5.setLocale(locale41);
        java.util.Locale.Builder builder49 = builder5.setLanguageTag("halfdays");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(intArray29);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0, 8]");
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1970 + "'", int38 == 1970);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(calendar42);
// flaky:         org.junit.Assert.assertEquals(calendar42.toString(), "java.util.GregorianCalendar[time=2419200010,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.008,offset=8,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=29,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=18,ZONE_OFFSET=8,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test15062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15062");
        org.joda.time.MutableInterval mutableInterval0 = new org.joda.time.MutableInterval();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.era();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime10.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(dateTimeZone14);
        int int16 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) dateTime18);
        boolean boolean21 = interval19.isAfter((long) 10);
        org.joda.time.Duration duration22 = interval19.toDuration();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime24);
        boolean boolean27 = interval25.isAfter((long) 10);
        org.joda.time.Duration duration28 = interval25.toDuration();
        org.joda.time.Duration duration30 = duration22.withDurationAdded((org.joda.time.ReadableDuration) duration28, (int) '4');
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration22);
        mutableInterval0.setDurationAfterStart((org.joda.time.ReadableDuration) duration22);
        org.joda.time.MutableInterval mutableInterval33 = mutableInterval0.copy();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadableInstant) dateTime35);
        boolean boolean38 = interval36.isAfter((long) 10);
        org.joda.time.Duration duration39 = interval36.toDuration();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        org.joda.time.Interval interval42 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime41);
        boolean boolean44 = interval42.isAfter((long) 10);
        org.joda.time.Duration duration45 = interval42.toDuration();
        org.joda.time.Duration duration47 = duration39.withDurationAdded((org.joda.time.ReadableDuration) duration45, (int) '4');
        long long48 = duration47.getStandardMinutes();
        long long49 = duration47.getStandardMinutes();
        org.joda.time.Duration duration51 = duration47.plus((long) 0);
        mutableInterval33.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration51);
        org.joda.time.Days days53 = duration51.toStandardDays();
        org.joda.time.Period period55 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = period55.toDurationFrom(readableInstant56);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime();
        org.joda.time.Interval interval60 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime58, (org.joda.time.ReadableInstant) dateTime59);
        boolean boolean62 = interval60.isAfter((long) 10);
        org.joda.time.Duration duration63 = interval60.toDuration();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime();
        org.joda.time.Interval interval66 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime64, (org.joda.time.ReadableInstant) dateTime65);
        boolean boolean68 = interval66.isAfter((long) 10);
        org.joda.time.Duration duration69 = interval66.toDuration();
        org.joda.time.Duration duration71 = duration63.withDurationAdded((org.joda.time.ReadableDuration) duration69, (int) '4');
        org.joda.time.DateTime dateTime72 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime();
        org.joda.time.Interval interval74 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime72, (org.joda.time.ReadableInstant) dateTime73);
        int int75 = dateTime72.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateTime dateTime77 = dateTime72.toDateTime(dateTimeZone76);
        int int78 = dateTime77.getCenturyOfEra();
        org.joda.time.Interval interval79 = duration69.toIntervalTo((org.joda.time.ReadableInstant) dateTime77);
        int int80 = duration57.compareTo((org.joda.time.ReadableDuration) duration69);
        boolean boolean82 = duration69.equals((java.lang.Object) 1645455256228L);
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime();
        org.joda.time.Interval interval86 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime84, (org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.Period period88 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime89 = dateTime84.plus((org.joda.time.ReadablePeriod) period88);
        org.joda.time.Period period91 = period88.plusMonths(16);
        org.joda.time.PeriodType periodType92 = period91.getPeriodType();
        org.joda.time.Period period93 = new org.joda.time.Period((long) 5, periodType92);
        org.joda.time.Period period94 = duration69.toPeriod(periodType92);
        org.joda.time.Period period95 = duration51.toPeriod(periodType92);
        org.joda.time.PeriodType periodType96 = periodType92.withSecondsRemoved();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(mutableInterval33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertNotNull(days53);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(duration63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertNotNull(duration71);
// flaky:         org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(dateTime77);
// flaky:         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 19 + "'", int78 == 19);
        org.junit.Assert.assertNotNull(interval79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(period91);
        org.junit.Assert.assertNotNull(periodType92);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(period95);
        org.junit.Assert.assertNotNull(periodType96);
    }

    @Test
    public void test15063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15063");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.DateTime dateTime5 = dateTime3.plusMonths((int) (byte) 100);
        org.joda.time.LocalTime localTime6 = dateTime3.toLocalTime();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.Period period8 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime6, (org.joda.time.ReadablePartial) localTime7);
        int int9 = localTime6.getSecondOfMinute();
        org.joda.time.LocalTime localTime11 = localTime6.minusSeconds(5);
        int int12 = localTime11.size();
        org.joda.time.LocalTime localTime14 = localTime11.plusHours(53772);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property16 = dateTime15.era();
        org.joda.time.DurationField durationField17 = property16.getLeapDurationField();
        int int18 = property16.getMaximumValueOverall();
        int int19 = property16.getMinimumValueOverall();
        org.joda.time.DateTime dateTime20 = property16.roundFloorCopy();
        boolean boolean21 = dateTime20.isAfterNow();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime25 = interval24.getEnd();
        org.joda.time.DateTime dateTime27 = dateTime25.plusMonths((int) (byte) 100);
        org.joda.time.DateTime dateTime29 = dateTime25.withWeekyear(1);
        int int30 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime.Property property31 = dateTime29.yearOfEra();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property35 = dateTime33.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property35.getFieldType();
        java.lang.String str37 = dateTimeFieldType36.getName();
        org.joda.time.DateTime.Property property38 = dateTime29.property(dateTimeFieldType36);
        boolean boolean39 = localTime14.isSupported(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(period8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNull(durationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "millisOfDay" + "'", str37, "millisOfDay");
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test15064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15064");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Interval interval4 = interval2.toInterval();
        boolean boolean6 = interval2.contains((long) 1970);
        org.joda.time.Chronology chronology7 = interval2.getChronology();
        long long8 = interval2.getStartMillis();
        org.joda.time.MutableInterval mutableInterval11 = new org.joda.time.MutableInterval((long) '4', (long) 478);
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval((org.joda.time.ReadableInterval) mutableInterval11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime14);
        int int16 = dateTime13.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.toDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property22 = dateTime20.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property22.getFieldType();
        int int24 = dateTime13.get(dateTimeFieldType23);
        boolean boolean25 = mutableInterval11.contains((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime31, (org.joda.time.ReadablePartial) localTime32, periodType33);
        org.joda.time.Period period35 = period34.negated();
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.weeks();
        int int37 = period34.get(durationFieldType36);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.Period period43 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime44 = dateTime39.plus((org.joda.time.ReadablePeriod) period43);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property46 = dateTime45.era();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime47, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Period period51 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime52 = dateTime47.plus((org.joda.time.ReadablePeriod) period51);
        org.joda.time.Chronology chronology53 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime54 = dateTime39.toDateTime(chronology53);
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime55, (org.joda.time.ReadablePartial) localTime56, periodType57);
        org.joda.time.LocalTime localTime60 = localTime56.withMillisOfSecond(4);
        int[] intArray62 = chronology53.get((org.joda.time.ReadablePartial) localTime56, (long) 0);
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime(0L, chronology53);
        org.joda.time.DateTimeField dateTimeField64 = chronology53.millisOfSecond();
        boolean boolean65 = durationFieldType36.isSupported(chronology53);
        boolean boolean66 = periodType30.isSupported(durationFieldType36);
        org.joda.time.Period period67 = new org.joda.time.Period((long) 100, periodType30);
        org.joda.time.PeriodType periodType68 = periodType30.withDaysRemoved();
        org.joda.time.Period period69 = new org.joda.time.Period(378691200010L, (long) 1970, periodType30);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property72 = dateTime71.era();
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime();
        org.joda.time.Interval interval75 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime73, (org.joda.time.ReadableInstant) dateTime74);
        org.joda.time.Period period77 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime78 = dateTime73.plus((org.joda.time.ReadablePeriod) period77);
        org.joda.time.Chronology chronology79 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime71, (org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.LocalTime localTime80 = org.joda.time.LocalTime.fromMillisOfDay((long) (-1), chronology79);
        org.joda.time.DurationField durationField81 = chronology79.minutes();
        org.joda.time.DateTimeField dateTimeField82 = chronology79.millisOfDay();
        org.joda.time.Period period83 = new org.joda.time.Period(3155695920000L, periodType30, chronology79);
        org.joda.time.Days days84 = period83.toStandardDays();
        org.joda.time.PeriodType periodType85 = days84.getPeriodType();
        org.joda.time.PeriodType periodType86 = periodType85.withMinutesRemoved();
        org.joda.time.Period period87 = mutableInterval11.toPeriod(periodType86);
        org.joda.time.Interval interval88 = interval2.overlap((org.joda.time.ReadableInterval) mutableInterval11);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(chronology7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 34L + "'", long8 == 34L);
        org.junit.Assert.assertNotNull(readableInterval12);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42 + "'", int24 == 42);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(intArray62);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 0, 8]");
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(durationField81);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertNotNull(days84);
        org.junit.Assert.assertNotNull(periodType85);
        org.junit.Assert.assertNotNull(periodType86);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNull(interval88);
    }

    @Test
    public void test15065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15065");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        java.lang.String str4 = interval2.toString();
        org.joda.time.Chronology chronology5 = interval2.getChronology();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.Period period10 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime11 = dateTime6.plus((org.joda.time.ReadablePeriod) period10);
        org.joda.time.Interval interval12 = interval2.withEnd((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Interval interval13 = interval2.toInterval();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        org.joda.time.DurationField durationField16 = property15.getLeapDurationField();
        int int17 = property15.getMaximumValueOverall();
        int int18 = property15.getMinimumValueOverall();
        org.joda.time.DateTime dateTime19 = property15.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withField(dateTimeFieldType26, 100);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime25.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        int int34 = localDateTime25.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean36 = dateTimeZone35.isFixed();
        org.joda.time.DateTime dateTime37 = localDateTime25.toDateTime(dateTimeZone35);
        long long39 = dateTimeZone35.convertUTCToLocal((long) 893);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime19.toMutableDateTime(dateTimeZone35);
        boolean boolean42 = dateTime19.isAfter((long) 5);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime();
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) dateTime44);
        boolean boolean47 = interval45.isAfter((long) 10);
        org.joda.time.Duration duration48 = interval45.toDuration();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime();
        org.joda.time.Interval interval51 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) dateTime50);
        boolean boolean53 = interval51.isAfter((long) 10);
        org.joda.time.Duration duration54 = interval51.toDuration();
        org.joda.time.Duration duration56 = duration48.withDurationAdded((org.joda.time.ReadableDuration) duration54, (int) '4');
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime();
        org.joda.time.Interval interval59 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableInstant) dateTime58);
        int int60 = dateTime57.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = dateTime57.toDateTime(dateTimeZone61);
        int int63 = dateTime62.getCenturyOfEra();
        org.joda.time.Interval interval64 = duration54.toIntervalTo((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.DateTime dateTime66 = dateTime62.minusWeeks(6139);
        org.joda.time.MutableDateTime mutableDateTime67 = dateTime66.toMutableDateTimeISO();
        org.joda.time.Chronology chronology68 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime66);
        boolean boolean69 = interval13.isBefore((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime70 = interval13.getStart();
        org.junit.Assert.assertNotNull(dateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01T00:00:00.042+00:00:00.008/1970-01-01T00:00:00.042+00:00:00.008" + "'", str4, "1970-01-01T00:00:00.042+00:00:00.008/1970-01-01T00:00:00.042+00:00:00.008");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNull(durationField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dateTime37);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 901L + "'", long39 == 901L);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(duration54);
        org.junit.Assert.assertNotNull(duration56);
// flaky:         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(dateTime62);
// flaky:         org.junit.Assert.assertTrue("'" + int63 + "' != '" + 19 + "'", int63 == 19);
        org.junit.Assert.assertNotNull(interval64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(mutableDateTime67);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(dateTime70);
    }

    @Test
    public void test15066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15066");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        org.joda.time.LocalTime localTime5 = localTime0.minusSeconds((int) (short) 100);
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Duration duration9 = period7.toDurationFrom(readableInstant8);
        int int10 = period7.getHours();
        org.joda.time.LocalTime localTime11 = localTime5.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.LocalTime localTime13 = localTime11.plusHours((int) 'x');
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localTime13.getFields();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime16.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        org.joda.time.LocalTime.Property property20 = localTime13.property(dateTimeFieldType19);
        org.joda.time.LocalTime.Property property21 = localTime13.millisOfDay();
        org.joda.time.Chronology chronology22 = localTime13.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.hours();
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test15067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15067");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withField(dateTimeFieldType6, 100);
        int int9 = localDateTime5.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime5.minusDays(53648193);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime5.getFieldType(0);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test15068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15068");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime4);
        boolean boolean7 = interval5.isAfter((long) 10);
        org.joda.time.Duration duration8 = interval5.toDuration();
        org.joda.time.Chronology chronology9 = interval5.getChronology();
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval((long) 1, (long) (byte) 1, chronology9);
        org.joda.time.Period period12 = org.joda.time.Period.seconds(99);
        long long15 = chronology9.add((org.joda.time.ReadablePeriod) period12, (long) 53657, 0);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 1, chronology9);
        org.joda.time.DateTimeField dateTimeField17 = chronology9.era();
        org.joda.time.DurationField durationField18 = chronology9.minutes();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 53657L + "'", long15 == 53657L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test15069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15069");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 2, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((-1L), dateTimeZone2);
        int int6 = localDate5.getYearOfEra();
        java.util.Date date7 = localDate5.toDate();
        int int8 = date7.getDay();
        java.time.Instant instant9 = date7.toInstant();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(instant9);
    }

    @Test
    public void test15070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15070");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("53636902");
        org.joda.time.Period period3 = org.joda.time.Period.seconds(897);
        org.joda.time.Period period4 = period3.normalizedStandard();
        org.joda.time.Period period6 = period3.plusMonths(46);
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) instant1, (org.joda.time.ReadablePeriod) period6);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test15071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15071");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("it");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"it\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15072");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        boolean boolean4 = interval2.isAfter((long) 10);
        org.joda.time.Duration duration5 = interval2.toDuration();
        org.joda.time.Chronology chronology6 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.secondOfMinute();
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.lang.String str10 = dateTimeField7.getAsText(79, locale9);
        long long12 = dateTimeField7.roundFloor((long) 1008);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "79" + "'", str10, "79");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 992L + "'", long12 == 992L);
    }

    @Test
    public void test15073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15073");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withField(dateTimeFieldType6, 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        int int14 = localDateTime13.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime17 = property15.addWrapFieldToCopy(99);
        org.joda.time.LocalDateTime localDateTime18 = property15.withMaximumValue();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime19, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime22 = interval21.getEnd();
        org.joda.time.DateTime dateTime24 = dateTime22.plusMonths((int) (byte) 100);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(10L, chronology26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekyear();
        int int29 = dateTime27.get(dateTimeFieldType28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean31 = dateTime27.isSupported(dateTimeFieldType30);
        org.joda.time.DurationFieldType durationFieldType32 = dateTimeFieldType30.getDurationType();
        boolean boolean33 = dateTime24.isSupported(dateTimeFieldType30);
        int int34 = localDateTime18.indexOf(dateTimeFieldType30);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime18.withWeekyear(53623795);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusMinutes(51120);
        int int39 = localDateTime36.getDayOfMonth();
        int int40 = localDateTime36.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1970 + "'", int29 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 17 + "'", int39 == 17);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 137 + "'", int40 == 137);
    }

    @Test
    public void test15074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15074");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime7 = dateTime2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        int int12 = dateTime9.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.toDateTime(dateTimeZone13);
        int int15 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime17);
        boolean boolean20 = interval18.isAfter((long) 10);
        org.joda.time.Duration duration21 = interval18.toDuration();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime23);
        boolean boolean26 = interval24.isAfter((long) 10);
        org.joda.time.Duration duration27 = interval24.toDuration();
        org.joda.time.Duration duration29 = duration21.withDurationAdded((org.joda.time.ReadableDuration) duration27, (int) '4');
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration21);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property32 = dateTime31.era();
        org.joda.time.DurationField durationField33 = property32.getLeapDurationField();
        int int34 = property32.getMaximumValueOverall();
        int int35 = property32.getMinimumValueOverall();
        org.joda.time.DateTime dateTime36 = property32.roundFloorCopy();
        boolean boolean37 = dateTime9.isBefore((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime.Property property38 = dateTime9.era();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNull(durationField33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(property38);
    }

    @Test
    public void test15075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15075");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.adjustOffset(378691200010L, false);
        long long6 = dateTimeZone0.convertLocalToUTC((-576074131375L), false);
        int int8 = dateTimeZone0.getOffsetFromLocal(52L);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (byte) 0);
        org.joda.time.LocalDate localDate12 = localDate10.minusMonths(12);
        org.joda.time.LocalDate.Property property13 = localDate12.monthOfYear();
        org.joda.time.DateTime dateTime14 = localDate12.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(1645455248808L);
        int int17 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate16);
        boolean boolean18 = dateTimeZone0.equals((java.lang.Object) int17);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 378691200010L + "'", long3 == 378691200010L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-576074131383L) + "'", long6 == (-576074131383L));
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15076");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) 100);
        org.joda.time.Instant instant3 = new org.joda.time.Instant((long) 893);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardHours((long) 22);
        org.joda.time.Days days6 = duration5.toStandardDays();
        org.joda.time.Period period7 = duration5.toPeriod();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        boolean boolean12 = interval10.isAfter((long) 10);
        org.joda.time.Duration duration13 = interval10.toDuration();
        org.joda.time.MutableInterval mutableInterval14 = interval10.toMutableInterval();
        boolean boolean15 = duration5.equals((java.lang.Object) mutableInterval14);
        org.joda.time.Instant instant16 = instant3.plus((org.joda.time.ReadableDuration) duration5);
        boolean boolean17 = duration1.isEqual((org.joda.time.ReadableDuration) duration5);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (byte) 0);
        org.joda.time.LocalDate localDate21 = localDate19.minusMonths(12);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime25 = interval24.getEnd();
        org.joda.time.DateTime dateTime27 = dateTime25.plusMonths((int) (byte) 100);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(10L, chronology29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekyear();
        int int32 = dateTime30.get(dateTimeFieldType31);
        org.joda.time.DateTime.Property property33 = dateTime27.property(dateTimeFieldType31);
        org.joda.time.LocalDate localDate35 = localDate21.withField(dateTimeFieldType31, 1970);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateMidnight dateMidnight38 = localDate21.toDateMidnight(dateTimeZone37);
        org.joda.time.Interval interval39 = duration5.toIntervalFrom((org.joda.time.ReadableInstant) dateMidnight38);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1970 + "'", int32 == 1970);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(mutableInterval40);
    }

    @Test
    public void test15077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15077");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        int int3 = dateTime0.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime0.toDateTime(dateTimeZone4);
        int int6 = dateTime5.getCenturyOfEra();
        org.joda.time.DateTime.Property property7 = dateTime5.monthOfYear();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.era();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Period period14 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime15 = dateTime10.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime10);
        long long17 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime10);
        java.util.Locale locale18 = java.util.Locale.ROOT;
        java.text.DateFormatSymbols dateFormatSymbols19 = org.joda.time.DateTimeUtils.getDateFormatSymbols(locale18);
        int int20 = property7.getMaximumShortTextLength(locale18);
        org.joda.time.Instant instant22 = new org.joda.time.Instant(35L);
        long long23 = instant22.getMillis();
        org.joda.time.Instant instant25 = instant22.plus((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTime();
        int int27 = property7.getDifference((org.joda.time.ReadableInstant) instant25);
        org.joda.time.Instant instant29 = instant25.plus((-1692203524934399966L));
        org.joda.time.Instant instant31 = instant25.minus(1645455783786L);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 19 + "'", int6 == 19);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(dateFormatSymbols19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(instant31);
    }

    @Test
    public void test15078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15078");
        org.joda.time.Period period4 = new org.joda.time.Period(86381027, 210952, 134, 171);
    }

    @Test
    public void test15079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15079");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.era();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.Interval interval5 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Period period7 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (-1), chronology9);
        org.joda.time.DurationField durationField11 = chronology9.minutes();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.hourOfDay();
        org.joda.time.LocalTime localTime19 = property18.withMaximumValue();
        int int20 = localTime19.getMinuteOfHour();
        org.joda.time.LocalTime localTime22 = localTime19.minusMillis(53917634);
        org.joda.time.LocalTime localTime23 = localTime13.withFields((org.joda.time.ReadablePartial) localTime22);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
    }

    @Test
    public void test15080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15080");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((-62104147189000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -62104147189000 * 3600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15081");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 0);
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths(12);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(2022);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime6, (org.joda.time.ReadablePartial) localTime7, periodType8);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(10L, chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.weekyear();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime17 = dateTime13.plusWeeks(4);
        boolean boolean18 = periodType10.equals((java.lang.Object) dateTime17);
        org.joda.time.DateTime dateTime19 = localTime6.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.LocalTime.Property property20 = localTime6.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int22 = localTime6.get(dateTimeFieldType21);
        org.joda.time.LocalTime localTime24 = localTime6.plusHours(53956818);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = localDate3.isAfter((org.joda.time.ReadablePartial) localTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 42 + "'", int22 == 42);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test15082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15082");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 17);
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Period period11 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime12 = dateTime7.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property14 = dateTime13.era();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Period period19 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime20 = dateTime15.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime13, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime22 = dateTime7.toDateTime(chronology21);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime23, (org.joda.time.ReadablePartial) localTime24, periodType25);
        org.joda.time.LocalTime localTime28 = localTime24.withMillisOfSecond(4);
        int[] intArray30 = chronology21.get((org.joda.time.ReadablePartial) localTime24, (long) 0);
        org.joda.time.Chronology chronology31 = chronology21.withUTC();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.dayOfYear();
        java.util.Locale locale33 = java.util.Locale.ROOT;
        java.util.Locale locale36 = new java.util.Locale("", "hi!");
        java.text.DateFormatSymbols dateFormatSymbols37 = new java.text.DateFormatSymbols(locale36);
        java.lang.String str38 = locale33.getDisplayVariant(locale36);
        int int39 = dateTimeField32.getMaximumTextLength(locale33);
        java.lang.String str40 = locale6.getDisplayLanguage(locale33);
        java.util.Locale.Builder builder41 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder43 = builder41.setLanguage("minutes");
        java.util.Locale.Builder builder44 = builder41.clear();
        java.util.Locale locale45 = builder41.build();
        java.lang.String str46 = locale6.getDisplayScript(locale45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter2.withLocale(locale45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean49 = dateTimeFormatter48.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter48.withPivotYear((java.lang.Integer) 312);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(intArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0, 8]");
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals(locale36.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Chinese" + "'", str40, "Chinese");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter47);
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter51);
    }

    @Test
    public void test15083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15083");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Interval interval3 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime2);
        boolean boolean5 = interval3.isAfter((long) 10);
        org.joda.time.Duration duration6 = interval3.toDuration();
        org.joda.time.Chronology chronology7 = interval3.getChronology();
        boolean boolean8 = durationFieldType0.isSupported(chronology7);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        int int15 = localDateTime14.getEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYear(2);
        long long19 = chronology7.set((org.joda.time.ReadablePartial) localDateTime17, (long) 100);
        int int20 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withField(dateTimeFieldType27, 100);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime26.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusMonths(5);
        org.joda.time.LocalDateTime.Property property38 = localDateTime34.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.millis((long) (short) -1);
        long long41 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration40);
        long long42 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration43 = duration40.toDuration();
        long long44 = duration43.getMillis();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime34.minus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(10L, chronology47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.weekyear();
        int int50 = dateTime48.get(dateTimeFieldType49);
        org.joda.time.DateTime dateTime52 = dateTime48.plusWeeks(4);
        java.util.Locale locale53 = java.util.Locale.ROOT;
        java.util.Calendar calendar54 = dateTime52.toCalendar(locale53);
        org.joda.time.DateTime dateTime56 = dateTime52.plusMillis(22);
        org.joda.time.Period period58 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant59 = null;
        org.joda.time.Duration duration60 = period58.toDurationFrom(readableInstant59);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime();
        org.joda.time.Interval interval63 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) dateTime62);
        boolean boolean65 = interval63.isAfter((long) 10);
        org.joda.time.Duration duration66 = interval63.toDuration();
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime();
        org.joda.time.Interval interval69 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime67, (org.joda.time.ReadableInstant) dateTime68);
        boolean boolean71 = interval69.isAfter((long) 10);
        org.joda.time.Duration duration72 = interval69.toDuration();
        org.joda.time.Duration duration74 = duration66.withDurationAdded((org.joda.time.ReadableDuration) duration72, (int) '4');
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime();
        org.joda.time.Interval interval77 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime75, (org.joda.time.ReadableInstant) dateTime76);
        int int78 = dateTime75.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.DateTime dateTime80 = dateTime75.toDateTime(dateTimeZone79);
        int int81 = dateTime80.getCenturyOfEra();
        org.joda.time.Interval interval82 = duration72.toIntervalTo((org.joda.time.ReadableInstant) dateTime80);
        int int83 = duration60.compareTo((org.joda.time.ReadableDuration) duration72);
        org.joda.time.DateTime dateTime84 = dateTime56.plus((org.joda.time.ReadableDuration) duration72);
        long long85 = duration72.getStandardSeconds();
        boolean boolean86 = duration43.isEqual((org.joda.time.ReadableDuration) duration72);
        long long87 = duration43.getMillis();
        org.joda.time.LocalDateTime localDateTime88 = localDateTime17.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.LocalDateTime localDateTime90 = localDateTime17.minusMinutes(53777532);
        org.joda.time.ReadableDuration readableDuration91 = null;
        org.joda.time.LocalDateTime localDateTime92 = localDateTime17.plus(readableDuration91);
        int int93 = localDateTime17.getDayOfYear();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-62092691280008L) + "'", long19 == (-62092691280008L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1970 + "'", int50 == 1970);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertNotNull(calendar54);
// flaky:         org.junit.Assert.assertEquals(calendar54.toString(), "java.util.GregorianCalendar[time=2419200010,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.008,offset=8,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=5,DAY_OF_MONTH=29,DAY_OF_YEAR=29,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=18,ZONE_OFFSET=8,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(duration60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(duration66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(duration72);
        org.junit.Assert.assertNotNull(duration74);
// flaky:         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(dateTime80);
// flaky:         org.junit.Assert.assertTrue("'" + int81 + "' != '" + 19 + "'", int81 == 19);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + (-1L) + "'", long87 == (-1L));
        org.junit.Assert.assertNotNull(localDateTime88);
        org.junit.Assert.assertNotNull(localDateTime90);
        org.junit.Assert.assertNotNull(localDateTime92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 132 + "'", int93 == 132);
    }

    @Test
    public void test15084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15084");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 0);
        org.joda.time.LocalDate localDate3 = localDate1.minusDays(29);
        org.joda.time.LocalDate.Property property4 = localDate1.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localDate1.toString("PT0.070S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test15085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15085");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime7 = dateTime2.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        int int12 = dateTime9.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.toDateTime(dateTimeZone13);
        int int15 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) dateTime17);
        boolean boolean20 = interval18.isAfter((long) 10);
        org.joda.time.Duration duration21 = interval18.toDuration();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime23);
        boolean boolean26 = interval24.isAfter((long) 10);
        org.joda.time.Duration duration27 = interval24.toDuration();
        org.joda.time.Duration duration29 = duration21.withDurationAdded((org.joda.time.ReadableDuration) duration27, (int) '4');
        org.joda.time.DateTime dateTime30 = dateTime2.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.DateTime dateTime31 = dateTime30.withEarlierOffsetAtOverlap();
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) 893);
        boolean boolean34 = dateTime30.isEqual((org.joda.time.ReadableInstant) instant33);
        org.joda.time.Duration duration36 = org.joda.time.Duration.standardHours((-1L));
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property39 = dateTime38.era();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime();
        org.joda.time.Interval interval42 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime40, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Period period44 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime45 = dateTime40.plus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Chronology chronology46 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime38, (org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.LocalTime localTime47 = org.joda.time.LocalTime.fromMillisOfDay((long) (-1), chronology46);
        org.joda.time.DurationField durationField48 = chronology46.weeks();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.hourOfDay();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.secondOfDay();
        org.joda.time.DurationField durationField51 = chronology46.centuries();
        org.joda.time.Period period52 = duration36.toPeriod(chronology46);
        org.joda.time.DateTime dateTime54 = dateTime30.withDurationAdded((org.joda.time.ReadableDuration) duration36, 6);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime();
        org.joda.time.Interval interval57 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime55, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime dateTime58 = interval57.getEnd();
        org.joda.time.Interval interval59 = interval57.toInterval();
        boolean boolean61 = interval57.contains((long) 1970);
        org.joda.time.Interval interval62 = interval57.toInterval();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime();
        org.joda.time.Interval interval65 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime63, (org.joda.time.ReadableInstant) dateTime64);
        boolean boolean67 = interval65.isAfter((long) 10);
        boolean boolean68 = interval62.abuts((org.joda.time.ReadableInterval) interval65);
        org.joda.time.Chronology chronology69 = interval65.getChronology();
        org.joda.time.DurationField durationField70 = chronology69.weekyears();
        org.joda.time.DateTimeField dateTimeField71 = chronology69.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime54.toMutableDateTime(chronology69);
        org.joda.time.DateTimeField dateTimeField73 = chronology69.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean76 = dateTimeZone75.isFixed();
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((long) 2, dateTimeZone75);
        org.joda.time.LocalTime localTime78 = new org.joda.time.LocalTime(dateTimeZone75);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeUtils.getZone(dateTimeZone75);
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime(dateTimeZone79);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeUtils.getZone(dateTimeZone79);
        java.lang.String str83 = dateTimeZone79.getName((long) 99);
        org.joda.time.Chronology chronology84 = chronology69.withZone(dateTimeZone79);
        org.joda.time.LocalTime localTime85 = new org.joda.time.LocalTime(chronology69);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(interval62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(durationField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(dateTimeZone79);
        org.junit.Assert.assertNotNull(dateTimeZone81);
// flaky:         org.junit.Assert.assertEquals("'" + str83 + "' != '" + "+00:00:00.008" + "'", str83, "+00:00:00.008");
        org.junit.Assert.assertNotNull(chronology84);
    }

    @Test
    public void test15086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15086");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 16);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test15087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15087");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        org.joda.time.Period period5 = period3.withMinutes((int) '#');
        org.joda.time.Period period7 = period5.minusHours(20987);
        org.joda.time.Seconds seconds8 = period5.toStandardSeconds();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Interval interval13 = interval11.toInterval();
        org.joda.time.Period period14 = interval11.toPeriod();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadableInstant) dateTime16);
        boolean boolean19 = interval17.isAfter((long) 10);
        org.joda.time.Duration duration20 = interval17.toDuration();
        boolean boolean21 = interval11.abuts((org.joda.time.ReadableInterval) interval17);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime22, (org.joda.time.ReadablePartial) localTime23, periodType24);
        org.joda.time.Period period26 = period25.negated();
        org.joda.time.Interval interval27 = interval11.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period25);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime28, (org.joda.time.ReadablePartial) localTime29, periodType30);
        org.joda.time.Period period33 = period31.minusDays(10);
        org.joda.time.Period period35 = period33.withMonths((int) 'a');
        org.joda.time.Period period37 = period35.withMillis((int) 'a');
        org.joda.time.Interval interval38 = interval27.withPeriodAfterStart((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Period period40 = period37.withHours(2);
        org.joda.time.Period period42 = period40.plusDays(335);
        org.joda.time.Period period44 = period40.minusWeeks(6139);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(10L, chronology49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.weekyear();
        int int52 = dateTime50.get(dateTimeFieldType51);
        org.joda.time.DateTime dateTime54 = dateTime50.plusWeeks(4);
        boolean boolean55 = periodType47.equals((java.lang.Object) dateTime54);
        org.joda.time.Period period56 = new org.joda.time.Period((long) 56, 0L, periodType47);
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime57, (org.joda.time.ReadablePartial) localTime58, periodType59);
        org.joda.time.Period period61 = period60.negated();
        int int62 = period60.size();
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType64 = periodType63.withMinutesRemoved();
        org.joda.time.Period period65 = period60.normalizedStandard(periodType64);
        org.joda.time.Period period66 = period56.normalizedStandard(periodType64);
        org.joda.time.Period period67 = period44.normalizedStandard(periodType64);
        org.joda.time.PeriodType periodType68 = periodType64.withHoursRemoved();
        org.joda.time.PeriodType periodType69 = periodType64.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period70 = new org.joda.time.Period((java.lang.Object) seconds8, periodType64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(seconds8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1970 + "'", int52 == 1970);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 8 + "'", int62 == 8);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(periodType69);
    }

    @Test
    public void test15088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15088");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localTime1, periodType2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.DateTime dateTime9 = dateTime7.plusMonths((int) (byte) 100);
        org.joda.time.LocalTime localTime10 = dateTime7.toLocalTime();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) dateTime12);
        boolean boolean15 = interval13.isAfter((long) 10);
        org.joda.time.Duration duration16 = interval13.toDuration();
        org.joda.time.DateTime dateTime18 = dateTime7.withDurationAdded((org.joda.time.ReadableDuration) duration16, 0);
        org.joda.time.DateTime dateTime19 = localTime1.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusSeconds((int) (short) -1);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property24 = dateTime23.era();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Period period29 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime30 = dateTime25.plus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.Chronology chronology31 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromMillisOfDay((long) (-1), chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.weekyear();
        org.joda.time.DateTime dateTime34 = dateTime21.toDateTime(chronology31);
        org.joda.time.DateTime.Property property35 = dateTime21.millisOfSecond();
        org.joda.time.DateTime dateTime36 = property35.roundFloorCopy();
        org.joda.time.DateTime dateTime37 = property35.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime39 = dateTime37.withWeekOfWeekyear(53773647);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53773647 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test15089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15089");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.Interval interval2 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) dateTime1);
        org.joda.time.Period period4 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime5 = dateTime0.plus((org.joda.time.ReadablePeriod) period4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime8.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime15 = dateTime0.toDateTime(chronology14);
        org.joda.time.DurationField durationField16 = chronology14.centuries();
        java.lang.String str17 = chronology14.toString();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.DateTimeField dateTimeField20 = chronology14.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = chronology14.minuteOfHour();
        org.joda.time.DurationField durationField22 = dateTimeField21.getRangeDurationField();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(durationField16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[+00:00:00.008]" + "'", str17, "ISOChronology[+00:00:00.008]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test15090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15090");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 0);
        org.joda.time.LocalDate localDate3 = localDate1.minusDays(29);
        org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra(53784736);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withField(dateTimeFieldType12, 100);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime11.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusMonths(5);
        org.joda.time.LocalDateTime.Property property23 = localDateTime19.dayOfYear();
        org.joda.time.Duration duration25 = org.joda.time.Duration.millis((long) (short) -1);
        long long26 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration25);
        long long27 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration28 = duration25.toDuration();
        long long29 = duration28.getMillis();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime19.minus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusSeconds(292278993);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period33 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDateTime32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test15091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15091");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 0);
        org.joda.time.LocalDate localDate3 = localDate1.minusMonths(12);
        org.joda.time.LocalDate.Property property4 = localDate3.monthOfYear();
        org.joda.time.LocalDate localDate5 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate6 = property4.roundHalfCeilingCopy();
        int int7 = localDate6.getDayOfYear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test15092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15092");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1645455233666L);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours(51120);
        org.joda.time.LocalTime.Property property4 = localTime1.secondOfMinute();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test15093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15093");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(10L, chronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyear();
        int int4 = dateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime6);
        boolean boolean9 = interval7.isAfter((long) 10);
        org.joda.time.Duration duration10 = interval7.toDuration();
        org.joda.time.Period period12 = new org.joda.time.Period((long) '#');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = period12.toDurationFrom(readableInstant13);
        org.joda.time.Seconds seconds15 = duration14.toStandardSeconds();
        boolean boolean16 = duration10.isLongerThan((org.joda.time.ReadableDuration) duration14);
        org.joda.time.DateTime dateTime17 = dateTime2.plus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(14, 5, 12, 14, 12);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withField(dateTimeFieldType24, 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime23.withTime(20, (int) (byte) 0, (int) (byte) 1, 893);
        int int32 = localDateTime23.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime23.plusYears(7);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusHours((int) 'a');
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.minusMillis(32769);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime40 = localDateTime34.toDateTime(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = dateTime17.withZone(dateTimeZone39);
        int int43 = dateTimeZone39.getOffset(31631015109000L);
        int int45 = dateTimeZone39.getStandardOffset(70761606000L);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(seconds15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
    }

    @Test
    public void test15094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15094");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) ' ');
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime2, (org.joda.time.ReadablePartial) localTime3, periodType4);
        org.joda.time.LocalTime localTime7 = localTime2.minusSeconds((int) (short) 100);
        boolean boolean8 = localTime1.equals((java.lang.Object) (short) 100);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths((int) (byte) 100);
        org.joda.time.LocalTime localTime15 = dateTime12.toLocalTime();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime();
        org.joda.time.Period period17 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime15, (org.joda.time.ReadablePartial) localTime16);
        int int18 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.LocalTime localTime20 = localTime1.plusMillis(0);
        org.joda.time.LocalTime localTime22 = localTime20.withMinuteOfHour(17);
        java.lang.String str24 = localTime20.toString("13:17:53.582");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "13:17:53.582" + "'", str24, "13:17:53.582");
    }
}
